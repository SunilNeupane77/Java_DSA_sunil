package Tree;

import java.util.LinkedList;

class MyQueue1 {
    LinkedList<Node> ll = new LinkedList();

    public boolean isEmpty() {
        return ll.isEmpty();
    }

    public void enqueue(Node p) {
        ll.addFirst(p);

    }

    public Node dequeue() {
        return ll.removeLast();
    }
}

class Node {
    Integer data;
    Node left, right;

    public Node(Integer data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }

    public Node(Node left, Integer data, Node right) {
        this.data = data;
        this.left = left;
        this.right = right;
    }

}

public class BST {
    Node root;

    public void visit(Node p) {
        System.out.print(p.data + "->");
    }

    public void inorder(Node p) {
        if (p != null) {
            inorder(p.left);
            visit(p);
            inorder(p.right);
        }
    }

    // Algorithm for BFS traversal
    /*
     * 1. Start
     * 2. if tree empty goto step 5
     * 3. if tree is not empty enqueue root node into the queue.
     * 4. while queue is not empty
     * 4.1 dequeue the node from queue and visit it(say node to be p).
     * 4.2 if p has left child enqueue the child to the queue
     * 4.3 if p has right child enqueue the child to the queue.
     * 5. stop
     * 
     * 
     */
    public void BFStraversal() {
        MyQueue1 q = new MyQueue1();
        if (root != null) {
            q.enqueue(root);
            while (!q.isEmpty()) {
                Node p = q.dequeue();
                if (p.left != null) {
                    q.enqueue(p.left);
                }
                if (p.right != null) {
                    q.enqueue(p.right);
                }
                visit(p);
            }
        }
    }

    public void preorder(Node p) {
        if (p != null) {
            visit(p);
            preorder(p.left);
            preorder(p.right);
        }
    }

    public void postorder(Node p) {
        if (p != null) {
            postorder(p.left);
            postorder(p.right);
            visit(p);
        }
    }

    public void deleteByCopying(int el) {
        Node node, p = root, prev = null;
        while (p != null && p.data != el) {
            prev = p;
            if (p.data < el)
                p = p.right;
            else
                p = p.left;
        }
        node = p;
        if (p != null && p.data == el) {
            if (node.right == null) {
                node = node.left;
            } else if (node.left == null) {
                node = node.right;
            } else {
                Node tmp = node.left;
                Node previous = node;
                while (tmp.right != null) {
                    previous = tmp;
                    tmp = tmp.right;
                }
                node.data = tmp.data;
                if (previous == node) {
                    previous.left = tmp.left;
                } else {
                    previous.right = tmp.right;
                }
            }
            if (p == root)
                root = node;
            else if (prev.left == p) {
                prev.left = node;
            } else {
                prev.right = node;
            }
        } else if (root != null) {
            System.out.println("key " + el + " is not in the tree");
        } else {
            System.out.println("tree is empty!!!1");
        }
    }

    public void insert(int key) {
        Node p = root, prev = null;
        while (p != null) {
            prev = p;
            if (p.data < key) {
                p = p.right;
            } else {
                p = p.left;
            }
        }
        if (root == null) {
            root = new Node(key);
        } else if (prev.data < key) {
            prev.right = new Node(key);
        } else {
            prev.left = new Node(key);
        }
    }
}

class BSTDemo {
    public static void main(String[] args) {
        BST tree = new BST();
        tree.insert(8);
        tree.insert(20);
        tree.insert(5);
        tree.insert(7);
        tree.insert(6);
        tree.insert(3);
        tree.insert(2);
        tree.insert(23);
        tree.insert(25);
        tree.insert(16);
        tree.insert(13);
        tree.insert(18);
        System.out.println("result of inorder traversal is:\n");
        tree.inorder(tree.root);
        System.out.println("\nresult of preorder traversal is:\n");
        tree.preorder(tree.root);
        System.out.println("\nresult of postorder traversal is:\n");
        tree.postorder(tree.root);
        System.out.println("\n The result of BFS traversal is:\n");
        tree.BFStraversal();
        tree.deleteByCopying(16);
        System.out.println("\n After deleting \n");
        tree.inorder(tree.root);

    }
}