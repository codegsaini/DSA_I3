package november_4.classwork;


public class FileSystem {

    public File root;

    public FileSystem(String root) {
        this.root = new File(root, false);
    }

    public File getRootDir() {
        return this.root;
    }

}
