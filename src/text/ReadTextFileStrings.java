package text;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadTextFileStrings {
    public static void main(String[] args) {
        //задать имя файла
        String fileName = "src/data/data.txt";
        StringBuilder sb;
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            sb = new StringBuilder();
            while (br.ready()) {
                String line = br.readLine();
                sb.append(line);
//                 sb.append(System.lineSeparator());
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println(sb);
    }
}
