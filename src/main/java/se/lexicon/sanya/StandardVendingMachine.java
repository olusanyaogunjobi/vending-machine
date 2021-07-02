package se.lexicon.sanya;

import java.util.Arrays;

public class StandardVendingMachine implements VendingMachine {

    Product product1 = new Fruit("Apple", "Rich in Vitamins", 10);
    Product fruit1 = new Fruit("banana", "Good for your heart", 30 );
    Product product2 = new Drink("Fruit Juice", "Orange Juice", 20);
    Product product3 = new Snack("meat pie", "Snack", 50);

 Product[] products = new Product[]{product1, product2,product3, fruit1 };
 String[] requestedProducts = new String[0];


    int moneyPool;

@Override
 public boolean checkCurrency(String amount){

    return true;
}

    @Override
    public void addCurrency(int amount) {

      int balance = moneyPool + amount;
      moneyPool = balance;

    }

    @Override
    public String productRequest(int productNumber) {
       Product product = products[productNumber];
       moneyPool = moneyPool- product.getPrice();
       if (moneyPool< 0) {
           return "Sorry you do not have enough money";
       } else {
           requestedProducts = addRequestedProduct(requestedProducts,product.getName());
           return product.getName()+ " has been requested. Your new balance is "+ moneyPool;
       }

}

    @Override
    public int endSession() {
        requestedProducts = new String[0];
        return moneyPool;
    }

    @Override
    public String getDescription(int productNumber) {
        Product product = products[productNumber];
        return product.getDescription();
    }

    @Override
    public int getBalance() {

        return moneyPool;
    }

    @Override
    public String[] getProducts() {
        return requestedProducts;
}
    public
    static String[] addRequestedProduct( String[] requestedProducts , String requestedProduct ){
        String[] newArray = Arrays.copyOf(requestedProducts,requestedProducts.length +1);
        newArray[newArray.length-1] = requestedProduct ; //Adding the name to last index of newArray
        return newArray;
}


}


