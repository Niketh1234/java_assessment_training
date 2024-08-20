import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Scanner;
public class Main{
    static Scanner sc = new Scanner(System.in);
    public static float costEstimator(HashMap<String,Float> deviceMap,String[] array)
    {
        float totalPrice = (float)0.0;
        for(int i = 0;i<array.length;i++){
            totalPrice += deviceMap.getOrDefault(array[i], (float)0.0);
        }
        return totalPrice;
    }
    public static HashMap<String,Float> takeInput(){
        System.out.print("Enter the number of devices to store : ");
        int totalValues = sc.nextInt();
        System.out.println("Enter "+totalValues+" devices followed by their prices : ");
        HashMap<String,Float> deviceMap = new LinkedHashMap();
        for(int i = 0;i<totalValues;i++){
            String deviceName =  sc.next();
            float devicePrice = sc.nextFloat();
            deviceMap.put(deviceName,devicePrice);
        }
        return deviceMap;
    }
    public static float queryInput(HashMap<String,Float> deviceMap){
        System.out.print("Enter the number of queries : ");
        int queries = sc.nextInt();
        String array[] = new String[queries];
        System.out.println("Enter the names of the devices : ");
        for(int i = 0;i<queries;i++){
           array[i] = sc.next();
        }
        return costEstimator(deviceMap, array);
    }
    public static void main(String ... args){
        HashMap<String,Float> deviceMap = takeInput();
        System.out.println("Total cost : "+queryInput(deviceMap));
    }
}