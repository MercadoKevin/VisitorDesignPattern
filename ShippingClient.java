public class ShippingClient {
    public static void main(String[] args) {
        Furniture chair = new Furniture("chair", 5.00);
        Furniture table = new Furniture("table", 8.00);
        Furniture sofa = new Furniture("sofa", 20.00);

        BaseShipping base = new BaseCalculator();
        DistanceBasedShipping distanceBased = new DistanceBasedCalculator();

        System.out.println("Base Shipping Cost for Chair: $" + base.showBaseShipping(chair.getType(), chair.getPrice()));
        System.out.println("Base Shipping Cost for Table: $" + base.showBaseShipping(table.getType(), table.getPrice()));
        System.out.println("Base Shipping Cost for Sofa: $" + base.showBaseShipping(sofa.getType(), sofa.getPrice()));

        System.out.println("\nDistance Based Shipping Cost for Chair with 10 KM Distance: $" 
                            + distanceBased.computeDistanceBasedShipping(chair.getType(), chair.getPrice(), 10));
        System.out.println("Distance Based Shipping Cost for Table with 10 KM Distance: $" 
                            + distanceBased.computeDistanceBasedShipping(table.getType(), table.getPrice(), 10));
        System.out.println("Distance Based Shipping Cost for Sofa with 10 KM Distance: $" 
                            + distanceBased.computeDistanceBasedShipping(sofa.getType(), sofa.getPrice(), 10));
    }
}
