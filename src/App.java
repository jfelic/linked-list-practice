
public class App {
    public static void main(String[] args) throws Exception {
        LinkList myList = new LinkList();

        myList.insertFirst(22, 2.99);
        myList.insertFirst(44, 4.99);
        myList.insertFirst(66, 6.99);
        myList.insertFirst(88, 8.99);

        myList.displayList();

        myList.displayList();

        myList.find(44).displayLink();
        System.out.println();
        myList.delete(66).displayLink();
    }
}
