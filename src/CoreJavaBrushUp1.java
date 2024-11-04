
public class CoreJavaBrushUp1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[] arr = new int[5];
        arr[0] =  1;
        arr[1] = 2;
        arr[2] = 3;
        arr[3] = 4;
        arr[4] = 5;
        System.out.println(arr[4]);
        
        int[] arr2 = {12,22,32,42,52,62};
        System.out.println(arr2[5]);
        
        for(int i=0; i<arr.length; i++) {
        	System.out.println(arr[i]);
        }
        
        //Another Method
        for(int i: arr2) {
        	System.out.println(i);
        }
        
        String[] name = {"Kavya","K","QA","Engineer"};
        for(int i=0;i<name.length;i++) {
        	System.out.println(name[i]);
        }
        
        //Another Method
        for(String s:name) {
        	System.out.println(s);
        }
	}

}
