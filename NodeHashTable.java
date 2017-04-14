
public class NodeHashTable {
 
    private int key;
    private WordEntry value;
    private NodeHashTable next;

    NodeHashTable(int key, WordEntry value) {
        this.key = key;
        this.value = value;
        this.next = null;
    }

    public WordEntry getValue() {
        return value;
    }

    public void setValue(WordEntry value) {
        this.value = value;
    }

    public int getKey() {
        return key;
    }

    public NodeHashTable getNext() {
        return next;
    }

    public void setNext(NodeHashTable next) {
        this.next = next;
    }
}
