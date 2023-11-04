package november_4.classwork;

import java.util.ArrayList;
import java.util.List;

public class File {

    public String name;
    boolean isDir;
    boolean isLocked = false;
    private final List<File> children = new ArrayList<>();
    private String content = null;

    public File(String path, boolean isDir) {
        String[] dirs = path.split("/");
        this.name = dirs[dirs.length - 1];
        this.isDir = isDir;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getContent() {
        return this.content;
    }

    public void addChild(File file) {
        this.children.add(file);
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

    public File createDir(String name) {
        File file = new File(name, true);
        addChild(file);
        return file;
    }

    public File createNewFile(String name) throws Exception {
        if (!this.isDir) throw new Exception("Exception: Can't create a file, Target is not a directory");
        File file = new File(name, false);
        addChild(file);
        return file;
    }
}
