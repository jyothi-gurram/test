import java.util.ArrayList;
import java.util.List;

public class Arraylist {

	public static void main(String[] args) {
		int total=0;
		List<Integer> num=new ArrayList<Integer>();
		num.add(124);
		num.add(1, 35);
		num.add(100);
		
		ArrayList<String>names=new ArrayList<String>();
		names.add("jyothi");
		names.add("23");
		names.add("madam");
		names.add("daddy");
		names.size();
		System.out.println(names);
		System.out.println(names.isEmpty());
		
		for (int a:num)
		{
			
			total=total+a;
			
		}
		System.out.println(total);
		System.out.println(num.size());
		// TODO Auto-generated method stub

	}

	

}
