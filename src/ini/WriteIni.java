package ini;

import org.ini4j.Wini;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

public class WriteIni {
    public static void main(String[] args) {
        //задать имя файла
        String fileName = "src/data/data.ini";
        File file = new File(fileName);
        try {
            file.createNewFile();
            Wini ini = new Wini(file);
            ini.put("options", "name", "product v.1");
            ini.put("options", "price", 2.1);
            ini.put("options", "array", Arrays.toString(new int[]{1, 2, 3}));
            ini.store();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
