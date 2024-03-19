package data;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileProperty {

    public static void main(String[] args ) throws Exception {

        Path p=Paths.get("D:\sem8");

        System.out.println(p);
        System.out.println(p.getParent());
        System.out.println(p.subpath(0, 2));
        System.out.println(p.getName(1));
        System.out.println(p.getRoot());
        System.out.println(Files.exists(p));

    }
    
}
