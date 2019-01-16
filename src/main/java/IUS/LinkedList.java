package IUS;


public class LinkedList<T> implements ILinkedList<T>{


    T data;
    public ILinkedList next;

    public LinkedList(){
        this.next = null;
        this.data = null;
    }

    /**
     * Get the next list element
     * @return the next element
     */
    public ILinkedList<T> next(){
        return next;
    }

    /**
     * Gets the last element in the list
     * @return the node at the end of the list
     */
    public ILinkedList<T> last(){
        ILinkedList temp = this;
        while(temp.next() != null){
            temp = temp.next();
        }
        return temp;
    }

    /**
     * Get the element n elements down the list
     * @param n the number of elements to skip
     * @return the element n away
     */
    public ILinkedList<T> after(int n){
        ILinkedList temp = this;
        if(temp != null){
            for(int i = 0; i<n; i++){
                temp = temp.next();
            } //for loop to walk down list
        } //if to check for a list longer than 1 element
        return temp;
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
        return data;
    }

    /**
     * Sets the value of this node
     * @param value the new value
     */
    public void set(T value){
        data = value;
    }

    /**
     * Sets the next element in the list
     * @param nextLocal the next element
     *
     * Example: (1->2->3).setNext(4) => 1->4
     */
    public void setNext(ILinkedList<T> nextLocal){
        next = nextLocal;
    }

    /**
     * Sets the next element after this current element
     * @param next the next element
     *
     * Example: (1->2->3).appnd(4) => 1->2->3->4
     */
    public void append(ILinkedList<T> next){
        this.last().setNext(next);
    }

    /**
     * Adds the current list as the next of newFirst
     * @param newFirst the new head of the list
     *
     * Example: (1->2->3).insert(4) => 4->1->2->3
     */
    public void insert(ILinkedList<T> newFirst){
        newFirst.append(this);
    }
}