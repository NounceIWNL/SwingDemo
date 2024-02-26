package text;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadTextFile {
    public static void main(String[] args) {
        //input file name
        String fileName = "src/data/data.txt";
        StringBuilder sb;
        try (FileReader fr = new FileReader(fileName)) {
            System.out.println("Encoding: " + fr.getEncoding());
            sb = new StringBuilder();
            int i;
            while ((i = fr.read())!=-1)
            sb.append((char)i);

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println(sb);
    }
}
