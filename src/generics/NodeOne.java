/*
Consider this class:
class Node<T> implements Comparable<T> {
    public int compareTo(T obj) { */
/* ... *//*
 }
    // ...
}
    Will the following code compile? If not, why?
        Node<String> node = new Node<>();
        Comparable<String> comp = node;
        Answer: Yes.*/

package generics;
class NodeOne<T> implements Comparable<T> {


    @Override
    public int compareTo(T o) {
        return Math.max(2,3);
    }

    public static void main(String[] args) {
        NodeOne<Integer> no = new NodeOne<>();
        Comparable<Integer> comparable = no.compareTo(3);
        System.out.println(comparable);
    }
}