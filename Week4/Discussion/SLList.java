public class SLList {

    private class IntNode {
        public int item;
        public IntNode next;

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

    


    public void addFirst(int x) {
        first = new IntNode(x, first);
        size++;
    }

    public void printNodeData(){
        IntNode thisNode = this.first;
        System.out.println("Printing current the node element:");
        for(int i = 0; i < this.size; i++){
            System.out.print(thisNode.item+"->");
            thisNode = thisNode.getNextNode();
        }
    }

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

    public int returnSize(){
        return size;
    }

    public static void main(String[] args){
        SLList list = new SLList();
        list.addFirst(5);
        list.addFirst(10);
        list.addFirst(2);
        System.out.println(list.returnSize());
        list.insert(100, 100);
        list.printNodeData();
    }
}