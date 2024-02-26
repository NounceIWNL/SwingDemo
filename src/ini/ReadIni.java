package ini;

import org.ini4j.Wini;

import java.io.File;
import java.io.IOException;

public class ReadIni {
    public static void main(String[] args) {
        //задать имя файла
        String fileName = "src/data/data.ini";
        File file = new File(fileName);
        try {
            file.createNewFile();
            Wini ini = new Wini(file);
            String name = ini.get("options", "name");
            int value = Integer.parseInt(ini.get("section", "value"));
            System.out.println(name);
            System.out.println(value);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
