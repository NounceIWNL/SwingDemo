package nio;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Comparator;
import java.util.stream.Stream;

//создание каталога

public class NioDemo {
    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
            createDir("folder" + Integer.toString(i));
            for (int j = 0; j < 3; j++)
                createFile("folder" + Integer.toString(i) + "/file" + Integer.toString(j));
        }


    }

    static void createDir(String name) {
        Path path = Paths.get("src/data/" + name);
        try {
            Files.createDirectory(path);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    static void createFile(String name) {
        Path path = Paths.get("src/data/" + name);
        try {
            Files.createFile(path);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
