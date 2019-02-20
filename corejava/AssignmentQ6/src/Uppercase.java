import java.util.ArrayList;

public class Uppercase {

	public static void main(String[] args) {
		
		ArrayList<String> al=new ArrayList<String>();
		al.add("Mirza");
		al.add("sai");
		al.add("tiru");
		al.add("rishi");
		al.replaceAll(s -> s.toUpperCase());

		System.out.println(al);
	}

}
