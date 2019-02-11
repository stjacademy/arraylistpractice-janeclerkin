
import java.util.ArrayList;
public class NotesFromClass {

	public static void main(String[] args) {
		
//inside the <> you but the object, it has to be capital
//
		ArrayList<Integer> myList = new ArrayList<Integer>();
		myList.add(4);
		myList.add(23);
		myList.add(400);
		myList.set(1, 52); //makes thing at 1 and makes it 52 instead of 23
		myList.add(1,44);  // adds 44 at 1 and pushes everything over
		int x = myList.get(3);
		int j= myList.remove(1);
		
		System.out.println(x);
		System.out.println(j);
		System.out.println(myList);
		
		for (int i =0; i<myList.size(); i++) 
		{
		System.out.println(myList.get(i));	
		}
		
		//for every number in the list (instead of counter, its the actual number)
		for (Integer num : myList)
		{
			System.out.print(num + " ");
		}
	}

}
