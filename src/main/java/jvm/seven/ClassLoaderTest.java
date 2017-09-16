package jvm.seven;

import javax.sound.midi.Soundbank;
import java.io.IOException;
import java.io.InputStream;

/**
 * Created by linrufeng on 2017/9/7.
 */
public class ClassLoaderTest {

    public static void main(String[] args) {
        ClassLoader classLoader = new ClassLoader() {
            @Override
            public Class<?> loadClass(String name) throws ClassNotFoundException {
                try {
                    String fileName = name.substring(name.lastIndexOf(".") + 1) + ".class";
                    InputStream inputStream = getClass().getResourceAsStream(fileName);
                    if (inputStream == null) {
                        return super.loadClass(name);
                    }
                    byte[] b = new byte[inputStream.available()];
                    inputStream.read(b);
                    return defineClass(name, b, 0, b.length);
                } catch (IOException e) {
                    throw new ClassNotFoundException(name);
                }
            }
        };

        try {
            Object obj = classLoader.loadClass("jvm.seven.ClassLoaderTest").newInstance();
            System.out.println(obj.getClass());
            System.out.println(obj instanceof jvm.seven.ClassLoaderTest);
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
