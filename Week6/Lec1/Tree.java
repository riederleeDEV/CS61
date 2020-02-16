

public class Tree{
    Node root;

    public Tree(int x){
        this.root = new Node(x);
    }

    public Tree(){
        this.root = null;
    }

    // Preorder printing

    public static String preorder(Node node, String traversal){

        if (Integer.toString(node.value)!=null){
            traversal += Integer.toString(node.value) + "-";
            traversal = preorder(node.left, traversal);
            traversal = preorder(node.right, traversal);
        } 

        return traversal;

        
    }

    public static void main(String[] args){
       
        Tree tree = new Tree(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(6);
        tree.root.left.right = new Node(9);
        tree.root.right.left = new Node(2);
        tree.root.right.right = new Node(6);

        /*

        Tree Structure so far:

                        1
                      /   \
                    2       3
                   / \      / \
                  6   9    2   6

        */

        System.out.println(preorder(tree.root, " "));
    }

  
    
}