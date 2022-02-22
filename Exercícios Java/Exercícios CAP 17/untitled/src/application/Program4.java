package application;

import java.io.File;
import java.util.Scanner;

public class Program4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a folder path: ");
        String strPath = sc.nextLine();

        File path = new File(strPath);

        //Filtra o caminho das pastas...
        File[] folders = path.listFiles(File::isDirectory);

        System.out.println("FOLDERS:");
        for (File folder:
             folders) {
            System.out.println(folder);
        }
        //Filtra o caminho dos arquivos.
        File[] files = path.listFiles(File::isFile);

        System.out.println("\nFILES:");
        for (File file:
             files) {
            System.out.println(file);
        }

        //this line create a new folder in a specific directory
        boolean success = new File(strPath + "/jeanJunior").mkdir();

        System.out.println(success);

        sc.close();
    }
}
