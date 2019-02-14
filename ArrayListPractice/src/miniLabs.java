
import java.util.ArrayList;

public class miniLabs {

	public static void main(String[] args) {
		
		factors(55);
		composite(10);

	}



public static ArrayList<Integer> factors(int number) {
	

	ArrayList<Integer> nums = new ArrayList<Integer>();

	
	for (int i=1; i< number; i++) {
		if (number%i==0)
			nums.add(i);
	}
	
	System.out.println(nums);
	return nums;
	
}

 private static ArrayList<Integer> composite(int number) {
	
	ArrayList<Integer> nums = new ArrayList<Integer>();
	
	for (int i = 0; i<nums.size();i++)
	{
		if (composite(nums.get(i)).size()==0)
			{
			nums.remove(i);
			i--;
			}
		
	}
	return nums;
	
}


}
