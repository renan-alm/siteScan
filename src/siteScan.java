import java.io.*;
import java.net.URL;

public class siteScan {
    /* Objective: Scan a website and do something with the content of the website
     *  URL: https://wahlinfastigheter.se/lediga-objekt/forrad/
     * */

    public static void main(String[] args) {
        File file = null;
        BufferedReader br;
        String line;
        BufferedWriter writer;
        int count=1;
        try {
            BufferedReader in = new BufferedReader(
                    new InputStreamReader(
                            new URL("https://wahlinfastigheter.se/lediga-objekt/forrad/").openStream()));
            writer = new BufferedWriter(new FileWriter("siteHTML.txt"));
            writer.write("Testing");

            while ( (line = in.readLine()) != null) {
                System.out.println((count+=1));
                //System.out.println(line);
            }

            file = new File("siteHTML.txt");
            FileReader fr = new FileReader(file);
            br = new BufferedReader(fr);
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
            br.close();
        } catch (FileNotFoundException e) {
            assert file != null;
            System.out.println("File not found: " + file.toString());
        } catch (IOException e) {
            assert file != null;
            System.out.println("Unable to read file: " + file.toString());
        }
    }
}
