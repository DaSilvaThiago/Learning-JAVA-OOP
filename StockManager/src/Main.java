public class Main {
    private String product = "Machanic Keyboard";
    private int quantity = 50;

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public int getQuantity() {
        return quantity;
    }

    public void addProduct(int x){
        this.quantity+= x;
    }

    public String withDraw(int x){
        if (x > this.quantity) {
            return "insufficient quantity in stock";    
        } else {
            this.quantity-=x;
            if(this.quantity < 10){
            return "Stock has less than 10 itens";
        }
            return "Quantity is updated";
        }
    }

    public String updateName(String name){
        this.product = name;
        return "Product has been updated.";
    }

    @Override
    public String toString(){
        return "Product Name: " + this.product + "\r\n"+
        "Quantity: " + this.quantity;
    }
}
