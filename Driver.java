public class Main {

	public static void main(String[] args) {
		System.out.println("\n\n\n*creating SuperArray s");
		SuperArray s = new SuperArray();
		System.out.println("print s. (should print: [])");
		System.out.println("\t" + s);
		System.out.println("check to see if s is empty. (should print true)\n\t" + s.isEmpty());
		System.out.println("*Clearing s");
		s.clear();
		System.out.println("check to see if s is empty. (should print true) \n\t" + s.isEmpty());
		System.out.println("*adding 1 to s\n*adding 2 to s");
		s.add("1");
		s.add("2");
		System.out.println("check the size of s. (should print 2)\n\t" + s.size());
		System.out.println("check to see if s is empty. (should print false)\n\t" + s.isEmpty());
		System.out.println("printing s. (should print [1, 2])\n\t " + s);
		//System.out.println(s);
		System.out.println("print s.toStringDebug(). (should print [1, 2, null, null, null, null, null, null, null, null])\n\t" + s.toStringDebug());
		//System.out.print(s.toStringDebug());
		
		
		System.out.println("\n\n---------------------\n*creating SuperArray t");
		SuperArray t = new SuperArray();
		System.out.println("t: " + t);
		System.out.println("t.toStringDebug(): " + t.toStringDebug());
		System.out.println("*using for loop to add the numbers 0-9 to data");
		for (int i=0;i<10;i++){
			t.add(""+i);
		}
		System.out.println("print t. should print: [0, 1, 2, 3, 4, 5, 6, 7, 8, 9]\n\t" + t);
		System.out.println("print t.toStringDebug(). (should print the same thing ^^)\n\t" + t.toStringDebug());
		System.out.println("checking t.get(int).");
		System.out.println("t.get(0) should return 0\n\t" + t.get(0));
		System.out.println("t.get(9) should return 0\n\t" + t.get(9));
		System.out.println("\nt.get(-1) should return an error then null");
		System.out.println("\t" +t.get(-1));
		System.out.println("\nt.get(10) should return error then null");
		System.out.println("\t"+t.get(10));
		
		System.out.println("\nprint t. should be [0, 1, 2, 3, 4, 5, 6, 7, 8, 9]\n\t" + t);
		System.out.println("*set index 4 to \"Good morning\"");
		System.out.println(t.set(4,"Good morning"));
		System.out.println("\nprint t. (should be [0, 1, 2, 3, Good morning, 5, 6, 7, 8, 9]\n\t" + t);
		//System.out.println(t.get(10));
		//System.out.println(t.get(-1));



	}


}
