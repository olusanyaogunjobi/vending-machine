package se.lexicon.sanya;

public interface VendingMachine {
    
    void addCurrency(int amount);
    String productRequest(int productNumber);
    int endSession();
    String getDescription(int productNumber);
    int getBalance();
    String []getProduct();

}







