package CodeWar;

import java.io.*;

/**
 * Description
 *
 * @author Valery Oster
 * @version 1.0
 */
public class SpeichernMain {

    public static void main(String[] args) throws Exception {
        int a = 0;
        int b = 0;
        int p;
        int s;

        try (FileWriter pw = new FileWriter("/Users/Aleksejew/Desktop/Input.txt")) {

            pw.write("hallo");
            pw.write("hallo");
            pw.write(Integer.toString(4));
        } catch (FileNotFoundException e) {
            System.out.println("File wurde nicht gefunden.");
            e.printStackTrace();
        }

        try (BufferedReader bf =  new BufferedReader(new FileReader("/Users/Aleksejew/Desktop/Input.txt"))) {
            String line;
            while ((line = bf.readLine()) != null) {
                System.out.println(line);
            }
        }catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
