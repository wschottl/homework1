package IUS;


public class LinkedList<T> implements ILinkedList<T>{


    T value;
    public ILinkedList next;

    public LinkedList(){
        this.next = null;
        this.value = null;
    }
    LinkedList head = new LinkedList();

    /**
     * Get the next list element
     * @return the next element
     */
    public ILinkedList<T> next(){
        return head.next;
    }

    /**
     * Gets the last element in the list
     * @return the node at the end of the list
     */
    public ILinkedList<T> last(){
        if(this.next == null){
            return this;
        }
        return this.next.last();
    }

    /**
     * Get the element n elements down the list
     * @param n the number of elements to skip
     * @return the element n away
     */
    public ILinkedList<T> after(int n){
        return after(n);
    }

    /**
     * Removes the next element (sets null)
     * @return the previously next element
     */
    public ILinkedList<T> detach(){
        ILinkedList temp = null;
        temp = this.next;
        this.next = null;
        return temp;
    }

    /**
     * Gets the current value
     * @return the current value
     */
    public T get(){
        return this.value;
    }

    /**
     * Sets the value of this node
     * @param value the new value
     */
    public void set(T value){
        this.value = value;
    }

    /**
     * Sets the next element in the list
     * @param next the next element
     *
     * Example: (1->2->3).setNext(4) => 1->4
     */
    public void setNext(ILinkedList<T> next){
        LinkedList temp = new LinkedList();
        this.next = temp;
        temp.value = next;
    }

    /**
     * Sets the next element after this current element
     * @param next the next element
     *
     * Example: (1->2->3).appnd(4) => 1->2->3->4
     */
    public void append(ILinkedList<T> next){
        if(this.next == null){
            LinkedList temp = new LinkedList();
            temp.value = next;
            this.next = temp;
        } // if to add new node
        else {this.next.append(next);} //else
    }

    /**
     * Adds the current list as the next of newFirst
     * @param newFirst the new head of the list
     *
     * Example: (1->2->3).insert(4) => 4->1->2->3
     */
    public void insert(ILinkedList<T> newFirst){
        LinkedList temp = new LinkedList();
        temp.value = newFirst;
        temp.next = head.next;
        head.next = temp;
    }
}