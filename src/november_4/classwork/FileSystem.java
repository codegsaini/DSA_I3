package november_4.classwork;

import november_2.assignment.Tree;

public class FileSystem {

    public File root = null;

    public boolean rootDirExist() {
        return root != null;
    }

    public void createRootDirectory(String name) {
        root = new File(name, false);
    }

    public File createNewFile(String name) {
        File file = new File(name, true);
        root.addChild(file);
        return file;
    }

    public File createNewFile(File path, String name) {
        File file = new File(name, true);
        File.getFile(path.getPath()).addChild(file);
        return file;
    }

    public File createDir(String name) {
        File file = new File(name, false);
        root.addChild(file);
        return file;
    }

}
