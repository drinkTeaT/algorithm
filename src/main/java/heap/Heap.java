package heap;

/**
 * Description 堆的操作
 * Author liuweibin
 * Date 2019/12/26 11:01
 **/
public class Heap {
    private int currentSize = 0;
    private final int MAX_SIZE = 20;
    private int[] heapArray;

    public Heap() {
        heapArray = new int[MAX_SIZE];
    }

    public boolean insert(int key) {
        if (currentSize >= MAX_SIZE) {
            return false;
        }
        int index = currentSize;
        currentSize += 1;
        heapArray[index] = key;
        int parent = (index - 1) / 2;
        while (heapArray[parent] < key && index > 0) {
            heapArray[index] = heapArray[parent];
            index = parent;
            parent = (parent - 1) / 2;
        }
        heapArray[index] = key;
        return true;
    }

    public void displayHeap() {
        for (int i : heapArray) {
            System.out.println(i);
        }
    }
}
