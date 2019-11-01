import org.omg.Messaging.SyncScopeHelper;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class siteScan {

    public static void main(String[] args) throws FileNotFoundException {
    //String fileName = "C:/Users/ralmeida/Documents/wopa/_Private/siteScan/example.txt";
    String fileName = "example.txt"; // This works because the file is on the root path of this project

    File textFile = new File(fileName);

    Scanner scanner = new Scanner(textFile);

    int value = scanner.nextInt();
    System.out.println("Read value: "+value);

    int count = 2;
    while(scanner.hasNextLine()){
        String line = scanner.nextLine();
        System.out.println("Read line: "+ line);
    }

    scanner.close();
    }
}
