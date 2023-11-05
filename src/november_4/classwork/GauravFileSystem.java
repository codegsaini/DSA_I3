package november_4.classwork;

public class GauravFileSystem {

    private static GFile root;

    public GauravFileSystem(String root) {
        if (GauravFileSystem.root == null) GauravFileSystem.root = new GFile(root, true);
    }

    public static GFile getRoot() {
        return GauravFileSystem.root;
    }

    public void listHierarchy() {
        traverse(root, "");
    }

    private void traverse(GFile GFile, String space) {

        if (GFile == null) return;

        if (GFile.isDir) System.out.println(space + ">" + GFile.name);
        else System.out.println(space + GFile.name);

        if (GFile.isDir) {
            for (GFile child: GFile.getChildren()) {
                traverse(child, space + "\t");
            }
        }
    }

}
