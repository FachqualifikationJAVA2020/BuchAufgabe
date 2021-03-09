package de.thunderfrog;

public class BuchTest {

    public static void main(String[] args) {

        Buch java = new Buch("Programmieren lernen mit Java", "Hans-Peter Habelitz","978-3-8362-7374-9");
        Buch java1 = new Buch("Programmieren lernen mit Java - Jetzt erst recht!", "Hans-Peter Habelitz","978-3-8362-7374-8");
        Buch java2 = new Buch("Programmieren lernen mit Java - Heute mit Senf", "Hans-Peter Habelitz","978-3-8362-7374-6");




	    System.out.println(java);
	    System.out.println(java1);
	    System.out.println(java2);


    }
}
