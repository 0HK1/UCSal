package TrabalhandoComListas;

public class ClasseLista {
    private int[] elements;
    private int size;
    private int capacity;
    public ClasseLista(){
        capacity = 5;
        elements = new int[capacity];
        size = 0;
    }
    public int size(){
        return size;
    }
    public boolean isEmpty(){
        return size==0;
    }
    public void print(){
        if(size == 0){
            System.out.println("Lista Vázia");
        }
        else {
            System.out.println("<=====INICIO=====>");
            for (int i = 0;i<size; i++){
                System.out.println(elements[i]);
            }
            System.out.println("<=====FIM=====>");
        }
    }
    public void aumentaSeNecessario(){
        if (size == capacity){
            int[] newelements = new int[capacity*2];
            for (int i = 0;i < size; i++){
                newelements[i] = elements[i];
            elements = newelements;
            }
        }
    }

    public int indexOf(int elemento){
        for (int i = 0; i<size; i++){
            if (elements[i] == elemento){
                return i;
            }
        }
        return -1;
    }
    public Object get (int index) {
        if (index<0 || index>size-1) {
            throw new IndexOutOfBoundsException("Index=" + index + " e Size=" + size);
        }
        else {
            return elements[index];
        }
    }
    public void add (int index,int elem) {
        if (index<0 || index>size)
            throw new IndexOutOfBoundsException("Index=" + index + " e Size=" + size);

        aumentaSeNecessario();
        for (int i=size;i>index;i--) {
            elements[i] = elements[i - 1];
        }
        elements[index]=elem;
        size++;
    }

}

