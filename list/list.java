package list;
//单链表
class node{
    private int data;
    private node next;

    public node(int data, node next) {
        this.data = data;
        this.next = next;
    }

    public void setData(int data) {
        this.data = data;
    }

    public void setNext(node next) {
        this.next = next;
    }

    public int getData() {
        return data;
    }

    public node getNext() {
        return next;
    }
}

public class list {
    private node last;
    private int size;
    private node head;
    public void add_last(int data){
        node _node = new node(data,null);
        if(head==null){
            head=last=_node;
            size++;
        }
        last.setNext(_node);
        last=_node;
        size++;
    }

    public void add_first(int data){
        node _node = new node(data,null);
        if(head==null){
            head=_node;
            size++;
        }
        else{
            _node.setNext(head);
            head=_node;
        }
    }

    public void show(){
        node tmp = head;
        while(tmp!=null){
            System.out.println(tmp.getData());
            tmp=tmp.getNext();
        }
    }
}
