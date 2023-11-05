package november_4.classwork;

import java.util.ArrayList;
import java.util.List;

public class GFile {

    public String name;
    boolean isDir;
    boolean isLocked = false;
    private final List<GFile> children = new ArrayList<>();
    private String content = null;

    public GFile(String path, boolean isDir) {
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

    public void addChild(GFile GFile) {
        this.children.add(GFile);
    }

    public List<GFile> getChildren() {
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

    public GFile createDir(String name) {
        GFile GFile = new GFile(name, true);
        addChild(GFile);
        return GFile;
    }

    public GFile createNewFile(String name) throws Exception {
        if (!this.isDir) throw new Exception("Exception: Can't create a file, Target is not a directory");
        GFile GFile = new GFile(name, false);
        addChild(GFile);
        return GFile;
    }
}
