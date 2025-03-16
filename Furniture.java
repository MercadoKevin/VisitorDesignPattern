public class Furniture implements Shipping{
    private String type;
    private double price;

    public Furniture(String type, double price) {
        this.type = type;
        this.price = price;
    }

    @Override
    public double accept(BaseShipping base) {
        return base.showBaseShipping(type, price);
    }

    @Override
    public double accept(DistanceBasedShipping distanceBased, int distance) {
        return distanceBased.computeDistanceBasedShipping(type, price, distance);
    }

    public String getType() {
        return type;
    }

    public double getPrice() {
        return price;
    }
}
