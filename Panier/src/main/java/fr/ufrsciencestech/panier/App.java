package fr.ufrsciencestech.panier;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        Panier b = new Panier();
        b.addPanier("France",0.80);
        b.addPanier("Espagne",0.80);
        b.addPanier("Floride", 0.90);
        b.boycotteOrigine("France");
    }
}
