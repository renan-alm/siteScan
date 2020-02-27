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

        file = new File(filename);
        FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        try {
            BufferedReader in = new BufferedReader(new InputStreamReader(getURLStream(url)));
            bufferedWriter = new BufferedWriter(new FileWriter(filename));

            while ( (line = in.readLine()) != null) {
                System.out.println(line);
                bufferedWriter.write(line);

//                Tags containing:
//                        <section class="local-objects-info">
//                        <a href="https://wahlinfastigheter.se/lediga-objekt/lagenheter/">
//                        <span class="total-article">0</span>
//                 OBJECTIVE: GET THE NUMBER 0 AND ACT ON THAT
            }
            bufferedWriter.close();
            bufferedReader.close();

        } catch (IOException e) {
            System.out.println("Unable to read file: " + file.toString());
        }
    }

    private static InputStream getURLStream(String url) throws IOException {
        return new URL(url).openStream();
    }
}
