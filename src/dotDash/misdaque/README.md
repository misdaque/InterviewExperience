### Question 1:
 Find the height of a binary tree.

### Question: 2
// Your Challenge is to provide total count by domain.
// Here, Domain need to be broken into sub domains and then counted.
// Ex: the domain 'google.co.uk becomes' will become: 'google.co.uk', 'co.uk', 'uk'

    private static void printClickCountByDomain() {
        // input of counts,domain
        String[] counts = {
        "900,google.com",
        "60,mail.yahoo.com",
        "10,mobile.sports.yahoo.com",
        "40,sports.yahoo.com",
        "300,yahoo.com",
        "10,stackoverflow.com",
        "20,overflow.com",
        "5,com.com",
        "2,en.wikipedia.org",
        "1,m.wikipedia.org",
        "1,mobile.sports",
        "1,google.co.uk"
        };


    Map<String, Integer> countMap = _printClickCountByDomain(counts);

    // expected output
    // [com] => [1345]
    // [stackoverflow.com] => [10]
    // [sports.yahoo.com] => [50]
    // [google.com] => [900]
    // [sports] => [1]
    // [org] => [3]
    // [wikipedia.org] => [3]
    // [mobile.sports] => [1]
    // [mail.yahoo.com] => [60]
    // [en.wikipedia.org] => [2]
    // [mobile.sports.yahoo.com] => [10]
    // [uk] => [1]
    // [yahoo.com] => [410]
    // [com.com] => [5]
    // [m.wikipedia.org] => [1]
    // [google.co.uk] => [1]
    // [co.uk] => [1]
    // [overflow.com] => [20]
    for (String key : countMap.keySet()) {
        System.out.println(String.format("[%s] => [%d]\n", key, countMap.get(key)));
    }
}


### Question 3:
//add two numbers represented by linked list
// Input: 2 lists: 12345 & 677 represented as 1->2->3->4->5 & 6->7->7
// Output: 1 list: 13022 represented as 1->3->0->2->2

    public class LinkedList {

        static Node head1, head2;

        static class Node {

            int data;
            Node next;

            Node(int d)
            {
                data = d;
                next = null;
            }
        }

    /* Utility function to print a linked list */
    void printList(Node head) {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
        System.out.println("");
    }

    // Driver Code
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        // creating first list
        list.head1 = new Node(1);
        list.head1.next = new Node(2);
        list.head1.next.next = new Node(3);
        list.head1.next.next.next = new Node(4);
        list.head1.next.next.next.next = new Node(5);
        System.out.print("First List is ");
        list.printList(head1);

        // creating second list
        list.head2 = new Node(6);
        list.head2.next = new Node(7);
        list.head2.next.next = new Node(7);
        System.out.print("Second List is ");
        list.printList(head2);
        
        Node rs = list.addTwoLists(head1, head2);
        System.out.print("Resultant List is ");
        list.printList(rs);
        }

    }


