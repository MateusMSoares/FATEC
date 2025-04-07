public class App {
    public static void main(String[] args) throws Exception {
        ArquivoSistema root = new ArquivoSistema("root");
        ArquivoSistema folder1 = new ArquivoSistema("folder1");
        ArquivoSistema folder2 = new ArquivoSistema("folder2");
        ArquivoSistema file1 = new ArquivoSistema("file1.txt");
        ArquivoSistema file2 = new ArquivoSistema("file2.txt");

        root.add(folder1);
        root.add(folder2);
        folder1.add(file1);
        folder2.add(file2);

        root.display("");

    }
}
