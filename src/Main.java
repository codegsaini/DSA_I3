
import november_4.classwork.GFile;
import november_4.classwork.GauravFileSystem;

import javax.swing.*;
import java.awt.*;

public class Main {

    public static void main(String[] args) {
        GauravFileSystem gfs = new GauravFileSystem("usr");
        GFile rootDir = GauravFileSystem.getRoot();

        try {

            GFile gaurav = rootDir.createNewFile("Gaurav.txt");
            rootDir.createNewFile("Gaurav2.txt");
            rootDir.createNewFile("Gaurav3.txt");
            rootDir.createNewFile("Gaurav4.txt");
            GFile myGFile = rootDir.createDir("home");
            myGFile.createNewFile("Priyank.txt");
            myGFile.createNewFile("Priyank2.txt");
            myGFile.createNewFile("Priyank3.txt");
            myGFile.createNewFile("Priyank4.txt");
            rootDir.createNewFile("Gaurav4.txt");

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        gfs.listHierarchy();

    }
}
