import java.io.*;

public class siteScan {
    /* Objective: Scan a website and do something with the content of the website
     *  URL: https://wahlinfastigheter.se/
     * */


    public static void main(String[] args) {
        File file = new File("example.txt");
        BufferedReader br;
        String line;

        try {
            FileReader fr = new FileReader(file);
            br = new BufferedReader(fr);
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
            br.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + file.toString());
        } catch (IOException e) {
            System.out.println("Unable to read file: " + file.toString());
        }


        Camera cam1 = new Camera();
        try {
            cam1.setId(5);
            cam1.close();
        } catch (Exception e) {
            e.printStackTrace();
        }


        Car car1 = new Car();
        car1.setId(4);

//        Machine machine1 = new Machine();
        car1.run();

    }
}
