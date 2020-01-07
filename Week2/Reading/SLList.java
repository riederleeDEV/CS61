public class SLList {

    //Note please do not mess up with first

    private IntNode first;

    public SLList(int x) {
        first = new IntNode(x, null);
    }

    public void addFirst(int x){
        first = new IntNode(x, first);
    }

    public int getFirst(){
        return first.item;
    }
    
    public static void main(String[] args){
        IntNode L1 = new IntNode(5, null);
        SLList L2  = new SLList(5);
        L2.addFirst(10);
        L2.addFirst(5);
        L2.addFirst(15);
        
        System.out.println(L2.getFirst());
    }
}