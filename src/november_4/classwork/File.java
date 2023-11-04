package november_4.classwork;

import java.util.ArrayList;
import java.util.List;

public class File {

    public String name;
    boolean isFile;
    boolean isLocked = false;
    private List<File> children = null;
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

    public void addChild(File file) {
        if (this.children == null) this.children = new ArrayList<>();
        this.children.add(file);
    }

    public List<File> getChildren() {
        return children;
    }

    public void lockFile(boolean b) {
        this.isLocked = b;
    }

    public void setTypeFile() {
        this.isFile = true;
        this.children = null;
    }

    public void setTypeDir() {
        this.isFile = false;
        this.content = null;
    }

    public String getPath() {
        return "";
    }

    public static File getFile(String path) {
        return new File("", true);
    }
}
