package se.lexicon.sanya;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Product fruit1 = new Fruit("banana", "Good for your heart", 30 );
        System.out.println( "Hello World!" );

        VendingMachine vendingMachine = new StandardVendingMachine();
        vendingMachine.addCurrency(5);
        vendingMachine.addCurrency(100);
        System.out.println(vendingMachine.getDescription(3));
        vendingMachine.productRequest(3);
        System.out.println(vendingMachine.getProducts()[0]);
        System.out.println(vendingMachine.getBalance()+" is your balance");
        System.out.println(vendingMachine.endSession()+" is your change");
        System.out.println(fruit1.examine());
        System.out.println(Currency.SEK_1.toString().substring(4));


    }





}
