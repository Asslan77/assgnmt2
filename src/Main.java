public class Main {
    public static void main(String[] args) {
        MyMinHeap<Integer> heap = new MyMinHeap<>();
        heap.insert(5);
        heap.insert(3);
        heap.insert(8);
        heap.insert(1);
        heap.insert(6);

        System.out.println(heap.size());     // Expected: 5
        System.out.println(heap.getMin());  // Expected: 1

        while (!heap.empty()) {
            System.out.println(heap.extractMin());  // Will print in ascending order
        }

        System.out.println(heap.size());
}