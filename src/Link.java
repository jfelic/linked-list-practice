public class Link {
    public int iData;   //data item
    public double dData;//data item
    public Link next;   //next link in list (reference)
    //If these were private, then we would need public methods to access them.

    public Link(int id, double dd) { // constructor
        iData = id;
        dData = dd;
        next = null;//doesnt refer to anything until the link is connected
    }
    
    public void displayLink() {
        System.out.print("{" + iData + ", " + dData + "} ");
        System.out.println();
    }
}
