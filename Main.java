import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Scanner;
public class Main{
    static Scanner sc = new Scanner(System.in);
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
    public static String[] queryInput(){
        System.out.print("Enter the number of queries : ");
        int queries = sc.nextInt();
        String array[] = new String[queries];
        System.out.println("Enter the names of the devices : ");
        for(int i = 0;i<queries;i++){
           array[i] = sc.next();
        }
        return array;
    }
    public static void main(String ... args){
        System.out.println("total : "+UserMainCode.costEstimator(takeInput(),queryInput()));
    }
}