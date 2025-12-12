package h2;

public class H2_main {

	public static void main(String[] args) {
		SimpleList myList = new SimpleList();
               
        myList.append(12);
        myList.append(45);
        myList.append(66);
        myList.append(12);
        myList.append(45);
        myList.append(60);
        
        System.out.println("Liste nach append:");
        printList(myList); // Sollte 12, 45, 66, 12, 45, 60 sein

        myList.insertAfter(45, 4);
        System.out.println("Liste nach insertAfter(45, 4):");
        printList(myList); // Sollte dann 12, 45, 4, 66, 12, 45, 60 sein 

        // Finden
        Node found = myList.findFirst(45);
        if (found != null) {
             System.out.println("Gefunden: " + found.value);            
        }

        // Löschen
        myList.delete(45);
        System.out.println("Liste nach delete(45):");
        printList(myList); // Sollte 12, 4, 66, 12, 45, 60 sein 
    }

  //  Hilfsmethode zur Ausgabe 
    public static void printList(SimpleList list) {
        Node current = list.getFirst();
        while (current != null) {
            System.out.print(current.value);
            if (current.next != null) {
                System.out.print(", ");
            }
            current = current.next;
        }
        System.out.println();
    }
}
