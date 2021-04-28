import java.util.LinkedList;
import java.util.Queue;

public class BST {
    public Node root;

    public void insert(int data) {
        root = insert(root, data);
    }

    private Node insert(Node root, int data) {
        if (root == null) {
            root = new Node(data);
            return root;
        }
        if (data < root.getData()) {
            root.setLeft(insert(root.getLeft(), data));

        } else {
            root.setRight(insert(root.getRight(), data));
        }
        return root;
    }

    public void inorder() {
        inorder(this.root);
    }


    private void inorder(Node root) {
        if (root != null) {
            inorder(root.getLeft());
            System.out.println(root.getData() + " ");
        }

    }


    public boolean search(int findelement) {
        return search(this.root, findelement);
    }

    private boolean search(Node root, int findelement) {
        if (root == null) {
            return false;

        } else if (root.getData() == findelement) {
            return true;
        } else if (root.getData() < findelement) {
            return search(root.getRight(), findelement);
        } else
            return search(root.getLeft(), findelement);

    }

    public void bfs() {
        if (root != null) {
            Queue<Node> q = new LinkedList<>();
            q.add(root);
            q.add(null);
            while (!q.isEmpty()) {
                Node temp = q.remove();
                if (temp != null) {
                    System.out.print(temp.getData() + " ");
                    if (temp.getLeft() != null) {
                        q.add(temp.getLeft());
                    }
                    if (temp.getRight() != null) {
                        q.add(temp.getRight());
                    }
                } else if (!q.isEmpty()) {
                    System.out.println();
                    q.add(null);
                }
            }
            System.out.println();
        }

    }
    public  void Postorder(){
        Postorder(this.root);
    }

    private void Postorder(Node root) {
        if (root !=null){
            Postorder(root.getRight());
            System.out.println(root.getData() + " ");
        }
    }

}