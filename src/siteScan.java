import java.io.*;
import java.net.URL;

public class siteScan {
    /* Objective: Scan a website and do something with the content of the website
     *  URL: https://wahlinfastigheter.se/lediga-objekt/forrad/
     * */

    public static void main(String[] args) throws IOException {
        String url = "https://wahlinfastigheter.se/lediga-objekt/lagenheter/";
        String filename = "siteHTML.txt";

        String line;
        File file;
        BufferedWriter bufferedWriter;
        int count=1;

        file = new File(filename);
        FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        try {
            BufferedReader in = new BufferedReader(new InputStreamReader(getURLStream(url)));
            bufferedWriter = new BufferedWriter(new FileWriter(filename));

            while ( (line = in.readLine()) != null) {
                //System.out.println((count+=1));
                System.out.println(line);
                bufferedWriter.write(line);
            }
            bufferedWriter.close();
            bufferedReader.close();

        } catch (FileNotFoundException e) {
            assert file != null;
            System.out.println("File not found: " + file.toString());
        } catch (IOException e) {
            assert file != null;
            System.out.println("Unable to read file: " + file.toString());
        }

    }

    private static InputStream getURLStream(String url) throws IOException {
        return new URL(url).openStream();
    }
}
