public class LinkList {
    private Link first; //ref to the first link on list

    public LinkList() {
        first = null; //no items in list yet
    }

    public boolean isEmpty() { //true if list is empty
        return (first==null);
    }

    public void insertFirst(int id, double dd) {
        Link newLink = new Link(id, dd);
        newLink.next = first;
        first = newLink;
    }

    public void deleteFirst() {
        first = first.next;
    }

    public void displayList() {
        Link currentLink = first;

        while (currentLink != null) {
            currentLink.displayLink();
            currentLink = currentLink.next;
        }
        System.out.println();
    }

    public Link find(int key) {
        Link currentLink = first;

        while(currentLink.iData != key) {
            if(currentLink.next == null) 
                return null; // Link not found
            else
                currentLink = currentLink.next;
        }
        return currentLink; // Link found because broke out of loop
    }

    public Link delete(int key) {
        Link currentLink = first;
        Link previousLink = first;

        while(currentLink.iData != key) {
            if(currentLink.next == null) {
                return null; //key not found
            } else {
                previousLink = currentLink;
                currentLink = currentLink.next;
            }
        }
        //if we break out then we've found the key
        //Make sure you understand this special case when currentLink is first
        if(currentLink == first)
            first = first.next;
        else
            previousLink.next = currentLink.next;

        return currentLink;
    }

    // public void insertAfter(Link currLink, Link newLink) {
    //     newLink.next = currLink.next;
    //     currLink.next = newLink;
    // }
}
