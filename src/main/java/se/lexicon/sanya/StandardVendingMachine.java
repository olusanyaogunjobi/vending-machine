package se.lexicon.sanya;

public class StandardVendingMachine implements VendingMachine {





    @Override
    public void addCurrency(int amount) {

    }

    @Override
    public String productRequest(int productNumber) {
        return null;
    }

    @Override
    public int endSession() {
        return 0;
    }

    @Override
    public String getDescription(int productNumber) {
        return null;
    }

    @Override
    public int getBalance() {
        return 0;
    }

    @Override
    public String[] getProduct() {
        return new String[0];
    }
}
