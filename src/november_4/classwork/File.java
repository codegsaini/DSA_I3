package november_4.classwork;

import java.util.ArrayList;
import java.util.List;

public class File {

    public String name;
    boolean isFile;
    boolean isLocked = false;
    private static List<File> children = null;
    private String content = null;

    public File(String name, boolean isFile) {
        this.name = name;
        this.isFile = isFile;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getContent() {
        return this.content;
    }

    public static void addChild(File file) {
        if (children == null) children = new ArrayList<>();
        children.add(file);
    }

    public List<File> getChildren() {
        return children;
    }

    public void lockFile() {
        this.isLocked = true;
    }
    public void unlock() {
        this.isLocked = false;
    }

    public String getPath() {
        return "";
    }

    public static File getFile(String path) {
        return new File("", true);
    }

    public static File createDir(String name) {
        File file = new File(name, false);
        addChild(file);
        return file;
    }

    public File createNewFile(String name) {
        File file = new File(name, true);
        addChild(file);
        return file;
    }
}
