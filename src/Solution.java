import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws Exception {
        System.out.println(FindIntersection(new String[]{"1, 3, 9, 10, 17, 18", "100, 4, 91, 110"}));
    }
    public static String FindIntersection(String[] strArr){
        String[] first_e = strArr[0].split(", ");
        String[] second_e = strArr[1].split(", ");
        
        ArrayList<String> eList = new ArrayList<>();
        for(String each: first_e){
            eList.add(each);
        }
        String intersect = "";
        for(String each: second_e){
            if(eList.contains(each) == true){
                intersect = intersect+each+",";
            }
        }

        if(intersect.isEmpty()){
            return "false";
        }else{
            return intersect.substring(0, intersect.length()-1);
        }
    }
}
