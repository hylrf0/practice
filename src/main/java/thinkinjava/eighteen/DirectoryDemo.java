package thinkinjava.eighteen;

import util.Directory;

import java.io.File;

/**
 * Created by linrufeng on 2017/5/2.
 */
public class DirectoryDemo {

    public static void main(String[] args) {
        PPrint.pprint(Directory.walk(".").dirs);

        for (File file : Directory.local(".", "T.*")) {
            System.out.println(file);
        }

        System.out.println("-----------------------");

        for (File file : Directory.local(".", "T.*\\.java")) {
            System.out.println(file);
        }

        System.out.println("=======================");

        for (File file : Directory.local(".", ".*[Zz].*\\.class")) {
            System.out.println(file);
        }
    }
}
