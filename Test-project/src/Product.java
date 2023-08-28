public class Product {
    public String Name;
    public double Price;
    public int Quantity;

    public double TotalValueInStock(){
        return Quantity * Price;
    }

    public void AddProducts(int quantity){
        this.Quantity += quantity;
    }

    public void RemoveProducts(int quantity){
        this.Quantity -= quantity;
    }

    public String toString(){
        return this.Name + ", $" + this.Price + ", " + this.Quantity + " units, Total: $" + TotalValueInStock();
    }
}
