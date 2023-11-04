
import november_4.classwork.File;
import november_4.classwork.FileSystem;

public class Main {

    public static void main(String[] args) {

        FileSystem fs = new FileSystem("usr");

        File rootDir = fs.getRootDir();
        File gaurav = rootDir.createNewFile("Gaurav.txt");
        gaurav.setContent("My name is gaurav and this is my file system");
        System.out.println(gaurav.getContent());

        gaurav.createNewFile("Gaurav1.txt");
        gaurav.createNewFile("Gaurav2.txt");
        gaurav.createNewFile("Gaurav3.txt");
        gaurav.createNewFile("Gaurav4.txt");

    }
}
