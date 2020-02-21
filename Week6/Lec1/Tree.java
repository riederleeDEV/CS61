

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

        if (node != null){
            traversal += Integer.toString(node.value) + "-";
            traversal = preorder(node.left, traversal);
            traversal = preorder(node.right, traversal);
        } 

        return traversal;

        
    }

    // Postorder printing

    public static String postorder(Node node, String traversal){

        if (node != null){
            traversal = postorder(node.left, traversal);
            traversal = postorder(node.right, traversal);
            traversal += Integer.toString(node.value) + "-";
        } 

        return traversal;

        
    }

    // Inorder printing

    public static String inorder(Node node, String traversal){

        if (node != null){
            traversal = inorder(node.left, traversal);
            traversal += Integer.toString(node.value) + "-";
            traversal = inorder(node.right, traversal);
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
        System.out.println(postorder(tree.root, " "));
        System.out.println(inorder(tree.root, " "));
    }

  
    
}