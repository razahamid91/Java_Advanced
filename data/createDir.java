package data;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class createDir {
    public static void main(String[] args) {
        Path p = Paths.get("D:\\sem8\\advanced java\\createdfolder");
        try {

            Stream<Path> str = Files.list(p);
            str.forEach(x -> {
                String name = x.getFileName().toString();
                String token[] = name.split("\\.");
                String extension = token[token.length - 1];
                try {

                    Path d = Paths.get(x.getParent() + "/" + extension);
                    Files.createDirectories(d);
                } catch (Exception e) {

                }
            });

        } catch (Exception e) {

            e.printStackTrace();

        }
    }
}
