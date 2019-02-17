
import java.util.ArrayList;
import java.lang.*;

public class miniLabs {

	public static ArrayList<Integer> main(String[] args) {
		
		//sample data given in instructions
	/*	ArrayList<Integer> comp = new ArrayList<Integer>();
		comp.add(2);
		comp.add(6);
		comp.add(8);
		comp.add(9);
		comp.add(10);
		comp.add(12);
		comp.add(13);
		comp.add(15);
		comp.add(17);
		
		return(composite(comp));
		*/
		
		factors(72);

	}



public static ArrayList<Integer> factors(int number) {
	

	ArrayList<Integer> nums = new ArrayList<Integer>();

	
	for (int i=2; i< number; i++) {
		if (number%i==0)
			nums.add(i);
	}
	
	System.out.println("factors: " + nums);
	return nums;
	
}

 private static ArrayList<Integer> composite(ArrayList<Integer> comp) {
	
	//ArrayList<Integer> comp = new ArrayList<Integer>();
	
	for (int i = 0; i<comp.size();i++)
	{
		for (int j = 2; j< Math.sqrt(i); j++)
			if (j%1 != 0)
			{
				comp.remove(i);
				i--;
			}
		
	}
	return comp;
	
}


}
