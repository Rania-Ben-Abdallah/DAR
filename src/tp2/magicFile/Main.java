package tp2.magicFile;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
    // printFileContent that prints it s content otherwise print 'file not found :/'
    // todo : implement the methods and force exception handling in the printFile method

    private static String getFileContent(String fileName) {
        File file = new File("src/tp2/magicFile/" + fileName);
    }
    private static String getFileContent(String fileName) throws FileNotFoundException {
        File file = new File("src/" + fileName);
        //the lines below help you to get the content
//        Scanner reader = new Scanner(file);
//        String content = reader.nextLine();
        return null;
        Scanner reader = new Scanner(file);
        String content = reader.nextLine();
        return content;
    }

    private static void printFileContent(String fileName) {
        String data = getFileContent(fileName);
        System.out.println(data);
        String data = null;
        try {
            data = getFileContent(fileName);
            System.out.println(data);
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }


    }
}
        String data = getFileContent(fileName);
        System.out.println(data);
    }
}
