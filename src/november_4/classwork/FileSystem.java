package november_4.classwork;

public class FileSystem {

    public File root;

    public FileSystem(String name) {
        this.root = new File(name, true);
    }

    public void listHierarchy() {
        traverse(root, "");
    }

    private void traverse(File file, String space) {

        if (file == null) return;

        if (file.isDir) System.out.println(space + ">" +file.name);
        else System.out.println(space + file.name);

        if (file.isDir) {
            for (File child: file.getChildren()) {
                traverse(child, space + "\t");
            }
        }
    }

}
