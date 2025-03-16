public interface Shipping {
    public double accept(BaseShipping base);
    public double accept(DistanceBasedShipping distanceBased, int distance);
}
