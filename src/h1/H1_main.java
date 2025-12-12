package h1;

public class H1_main {

    public static void main(String[] args) {        
        System.out.println("--- Teste shorten ---");
        Bruch b1 = new Bruch(25, 5); 
        System.out.println("Bruch vor dem Kuerzen: " + b1.zaehler + "/" + b1.nenner);
        
        b1.shorten(); 
        
        System.out.println("Bruch nach dem Kuerzen: " + b1.zaehler + "/" + b1.nenner);
        System.out.println(); 

        System.out.println("--- Teste hasSameValueAs ---");
     
        Bruch b2 = new Bruch(1, 2);
        Bruch b3 = new Bruch(2, 4); 
        Bruch b4 = new Bruch(2, 2); 

        boolean test1 = b2.hasSameValueAs(b3);
        boolean test2 = b2.hasSameValueAs(b4);

        System.out.println("Ist 1/2 das Gleiche wie 2/4? " + test1);
        System.out.println("Ist 1/4 das Gleiche wie 2/2? " + test2);
    }
}