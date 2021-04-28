public class Main {
    public static void main(String[] args) {
        BST obj = new BST();
        obj.insert(50);
        obj.insert(40);
        obj.insert(35);
        obj.insert(20);
        obj.insert(10);
        obj.insert(45);
        obj.insert(07);
        obj.Postorder();
        obj.inorder();
        obj.bfs();

    }
}
