package com.study.designpatterns.proxy.dynamicproxy.gpproxy;


import javax.tools.JavaCompiler;
import javax.tools.JavaFileObject;
import javax.tools.StandardJavaFileManager;
import javax.tools.ToolProvider;
import java.io.File;
import java.io.FileWriter;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class GPProxy {
    public static final String LN = "\r\n";
    public static Object newProxyInstance(GPClassLoader loader,
                                      Class<?>[] interfaces,
                                      GPInvocationHandler h)
        throws IllegalArgumentException {
        try{
            //动态生成代码
            String src = generateSrc(interfaces);
//            System.out.println(src);
            //java文件输出到磁盘
            String path = GPProxy.class.getResource("").getPath();
            File f = new File(path+"$Proxy0.java");
            FileWriter fw = new FileWriter(f);
            fw.write(src);
            fw.flush();
            fw.close();
            JavaCompiler compiler = ToolProvider.getSystemJavaCompiler();
            StandardJavaFileManager standardFileManager = compiler.getStandardFileManager(null, null, null);
            Iterable<? extends JavaFileObject> javaFileObjects = standardFileManager.getJavaFileObjects(f);
            JavaCompiler.CompilationTask task = compiler.getTask(null, standardFileManager, null, null, null, javaFileObjects);
            task.call();
            standardFileManager.close();

            Class<?> proxyClass = loader.findClass("$Proxy0");
            Constructor<?> constructor = proxyClass.getConstructor(GPInvocationHandler.class);
            return constructor.newInstance(h);
        }catch (Exception e){
            e.printStackTrace();
        }
         return null;
    }

    private static String generateSrc(Class<?>[] interfaces){
        StringBuffer sb = new StringBuffer();
        sb.append("package com.study.designpatterns.proxy.dynamicproxy.gpproxy;" + LN);
        sb.append("import com.study.designpatterns.proxy.Person;" + LN);
        sb.append("import java.lang.reflect.*;" + LN);
        sb.append("public class $Proxy0 implements  " +interfaces[0].getSimpleName() + "{" + LN);
        sb.append("GPInvocationHandler h;" + LN);
        sb.append("public  $Proxy0(GPInvocationHandler h) {" + LN);
        sb.append("this.h = h;" + LN);
        sb.append("}" + LN);
        for(Method m : interfaces[0].getMethods()){
            sb.append("public "+ m.getReturnType().getName() + " " + m.getName() + "() {" + LN);
            sb.append("try {" + LN);
            sb.append("Method m = " + interfaces[0].getSimpleName() + ".class.getMethod(\""+m.getName()+"\",new Class[]{});" + LN);
            sb.append("this.h.invoke(this,m,null);" + LN);
            sb.append("} catch (Throwable e) {" + LN);
            sb.append("e.printStackTrace();" + LN);
            sb.append("}"+ LN);
            sb.append("}"+ LN);
        }
        sb.append("}");
        return sb.toString();
    }
}
