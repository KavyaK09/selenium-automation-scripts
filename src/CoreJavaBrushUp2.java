import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CoreJavaBrushUp2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {1,2,3,4,7,9,8};
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2==0) {
				System.out.println(arr[i]);
			}
			else {
				System.out.println(arr[i]);
			}
		}
		
		ArrayList<String> a = new ArrayList<String>();
        a.add("Kavya");
        a.add("K");
        a.add("QA");
        a.add("Engineer");
        
        a.remove(2);
        
        System.out.println(a.get(2));
        
        System.out.println("**************");
        for(int i=0;i<a.size();i++) {
        	System.out.println(a.get(i));
        }
        
        System.out.println("**************");
        System.out.println(a.contains("Engineer"));
        System.out.println(a.contains("QA"));
        
        String[] name = {"Kavya","is","a","good","girl"};
        List<String> nameList = Arrays.asList(name);

	}

}
