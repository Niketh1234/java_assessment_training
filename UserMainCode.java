import java.util.HashMap;
public class UserMainCode{    
    public static float costEstimator(HashMap<String,Float> deviceMap,String[] array)
    {
        float totalPrice = 0;
        for(int i = 0;i<array.length;i++){
            totalPrice += deviceMap.getOrDefault(array[i], (float)0.0);
        }
        return totalPrice;
    }
}