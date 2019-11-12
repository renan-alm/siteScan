import java.io.*;
import java.net.URL;

public class siteScan {
    /* Objective: Scan a website and do something with the content of the website
     *  URL: https://wahlinfastigheter.se/lediga-objekt/forrad/
     * */

    public static void main(String[] args) throws IOException {
        String url = "https://wahlinfastigheter.se/lediga-objekt/forrad/";
        String filename = "siteHTML";
        String line;
        BufferedWriter bufferedWriter;


        File file = new File(filename);
        FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);;
        int count=1;


        try {
            BufferedReader in = new BufferedReader(
                                new InputStreamReader(
                                new URL(url).openStream()));

            bufferedWriter = new BufferedWriter(new FileWriter(filename));
            bufferedWriter.write("Testing");

            while ( (line = in.readLine()) != null) {
                System.out.println((count+=1));
                //System.out.println(line);
            }
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
            bufferedReader.close();
        } catch (FileNotFoundException e) {
            assert file != null;
            System.out.println("File not found: " + file.toString());
        } catch (IOException e) {
            assert file != null;
            System.out.println("Unable to read file: " + file.toString());
        }

    }
}
