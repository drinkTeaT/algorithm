package heap;

/**
 * @Description :
 * @Author : Administrator
 * @Date : 2019-12-26 21:56
 **/
public class HeapLauncher {
    public static void main(String[] args) {
        Heap heap = buildHeap();
        heap.displayHeap();
    }

    public static Heap buildHeap() {
        Heap heap = new Heap();
        heap.insert(12);
        heap.insert(2);
        heap.insert(24);
        heap.insert(5);
        heap.insert(53);
        heap.insert(6);
        heap.insert(44);
        heap.insert(74);
        heap.insert(9);
        heap.insert(53);
        heap.insert(44);
        return heap;
    }
}
