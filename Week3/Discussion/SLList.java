public class SLList {

    private class IntNode {
        public int item;
        public IntNode next;

        public IntNode(){

        }

        public IntNode(int item, IntNode next) {
            this.item = item;
            this.next = next;
        }

        private IntNode getNextNode() {
			return this.next;
		}
    }

    private IntNode first;
    private int size;

    // Always add new element in the first place

    public void addFirst(int x) {
        first = new IntNode(x, first);
        size++;
    }

    // Print Node data

    public void printNodeData(){
        IntNode thisNode = this.first;
        System.out.println("Printing current the node element:");
        for(int i = 0; i < this.size; i++){
            System.out.print(thisNode.item+"->");
            thisNode = thisNode.getNextNode();
        }
    }

    // Insert new  element in linked list

    public void insert(int data, int x){
        if(x > 0 && x < size){
            int current = 0;
            IntNode node = first;

            while(current != (x-1)){
                node = node.next;
                current++;
            }

            IntNode newData = new IntNode(data, node.next);
            node.next = newData;
            size++;
        } else {
            
            IntNode node = first;

            for(int i = 0; i < size-1; i++){
                node = node.getNextNode();
            }
            
            IntNode newData = new IntNode(data, null);
            node.next = newData;
            size++;
            
        }
    }

    // Return the size of the linked list

    public int returnSize(){
        return size;
    }

    // Reverse linked list

    public void reverse(){
        if(first==null || first.next == null){
            return;
        } else {
            
            
            IntNode ptr = first.next;
            first.next = null;

            while(ptr != null){
                IntNode temp = ptr.next;
                ptr.next = first;
                first = ptr;
                ptr = temp;
            }





        }
    }

    // Run the test case in main function

    public static void main(String[] args){
        SLList list = new SLList();
        list.addFirst(5);
        list.addFirst(10);
        list.addFirst(2);
        list.insert(100, 100);
        System.out.println(list.returnSize());
        list.reverse();
        list.printNodeData();
    }
}