
import november_4.classwork.File;
import november_4.classwork.FileSystem;

public class Main {

    public static void main(String[] args) {

        FileSystem fs = new FileSystem();

        if (!fs.rootDirExist()) {
            fs.createRootDirectory("usr");
        }

        File gaurav = fs.createNewFile("Gaurav.txt");

        gaurav.setContent("My name is gaurav and this is my file system");

        System.out.println(gaurav.getContent());

        System.out.println("List of directories  - ");
        for (File f: fs.root.getChildren()) {
            System.out.println(f.name);
        }

    }
}
