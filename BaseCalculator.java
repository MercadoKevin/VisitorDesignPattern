import java.util.HashMap;
import java.util.Map;

public class BaseCalculator implements BaseShipping{
    private static Map<String, Integer> baseMap = new HashMap<>();

    static{
        baseMap.put("chair", 0);
        baseMap.put("table", 2);
        baseMap.put("sofa", 5);
    }

    @Override
    public double showBaseShipping(String furniture, double price) {
        return price + baseMap.get(furniture);
    }
}
