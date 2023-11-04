
import november_4.classwork.File;
import november_4.classwork.FileSystem;

import javax.swing.*;
import java.awt.*;

public class Main extends JFrame {

    private static final JLabel currentDir = new JLabel();
    private static final JPanel currentDirPanel = new JPanel();

    Main() {
        setTitle("Gaurav File System");
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setSize(500, 500);
        setLayout(new GridBagLayout());

    }

    public static void main(String[] args) {

        Main main = new Main();

        FileSystem fs = new FileSystem("usr");
        File rootDir = fs.root;

        currentDirPanel.setLayout(new FlowLayout(FlowLayout.LEFT));
        currentDir.setText(rootDir.name);
        currentDirPanel.add(currentDir);
        main.add(currentDirPanel);

        try {
            File gaurav = rootDir.createNewFile("Gaurav.txt");
            rootDir.createNewFile("Gaurav2.txt");
            rootDir.createNewFile("Gaurav3.txt");
            rootDir.createNewFile("Gaurav4.txt");
            File myFile = rootDir.createDir("home");
            myFile.createNewFile("Priyank.txt");
            myFile.createNewFile("Priyank2.txt");
            myFile.createNewFile("Priyank3.txt");
            myFile.createNewFile("Priyank4.txt");
            rootDir.createNewFile("Gaurav4.txt");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        fs.listHierarchy();

        main.setVisible(true);

    }
}
