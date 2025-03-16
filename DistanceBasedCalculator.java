import java.util.HashMap;
import java.util.Map;

public class DistanceBasedCalculator implements DistanceBasedShipping{
    private static Map<String, Double> distanceMap = new HashMap<>();

    static{
        distanceMap.put("chair", 0.0);
        distanceMap.put("table", 0.50);
        distanceMap.put("sofa", 0.75);
    }

    @Override
    public double computeDistanceBasedShipping(String furniture, double price, int distance) {
        return price + (distance * distanceMap.get(furniture));
    }
}
