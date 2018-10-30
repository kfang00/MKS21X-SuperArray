public class Driver{
  public static void main(String[] args){
    SuperArray SA = new SuperArray();

    System.out.println("SA: " + SA);
    // []
    System.out.println("isEmpty?: " + SA.isEmpty());                 // true

    System.out.println();

    SA.add("A"); System.out.println("SA.add(\"A\")");                // no output
    System.out.println("isEmpty?: " + SA.isEmpty());                 // false

    System.out.println();

    SA.add("B"); System.out.println("SA.add(\"B\")");                // no output
    SA.add("C"); System.out.println("SA.add(\"C\")");                // no output
    System.out.println("size: " + SA.size());                        // 3
    System.out.println("SA: " + SA.toStringDebug());
    // [A, B, C, null, null, null, null, null, null, null]

    System.out.println();

    System.out.println("SA.remove(0): " + SA.remove(0));             // "A"
    System.out.println("size: " + SA.size());                        // 2
    System.out.println("SA: " + SA);
    // [B, C]

    System.out.println();

    System.out.println("SA.get(1): " + SA.get(1));                   // "C"
    System.out.print("SA.get(15): ");
    System.out.println("Testing get(int)\'s throw ... Expected : 2 error messages");
    try{
      SA.get(2);
    } catch(IndexOutOfBoundsException e){
      System.out.println("Caught an Exception in get()");
    }
    try{
      SA.get(-2);
    } catch (IndexOutOfBoundsException e){
      System.out.println("Caught an Exception in get()");
    }

    System.out.println();

    System.out.println("SA.set(0,\"I'm\"): " + SA.set(0,"I'm"));     // "B"
    System.out.println("SA: " + SA);
    // [I'm, C]

    System.out.println();

    System.out.print("SA.set(15, \"J\"): ");
    System.out.println("Testing set(int,String)\'s throw ... Expected : 2 error messages");
    try{
      SA.set(2,"C");
    } catch(IndexOutOfBoundsException e){
      System.out.println("Caught an Exception in set(int,String)");
    }
    try{
      SA.set(-2,"xd");
    } catch (IndexOutOfBoundsException e){
      System.out.println("Caught an Exception in set(int,String)");
    }

    System.out.println();

    System.out.println("SA: " + SA);
    // [I'm, C]
    System.out.println("size: " + SA.size());                        // 2

    System.out.println();

    System.out.println("contains \"D\"?): " + SA.contains("D"));     // false
    System.out.println("contains \"C\"?): " + SA.contains("C"));     // true

    System.out.println();

    System.out.println("Testing add(int,String)\'s throw ... Expected : 2 error messages");
    try{
      SA.add(5,"xd");
    } catch (IndexOutOfBoundsException e){
      System.out.println("Caught an Exception in add(int,String)");
    }
    try{
      SA.add(-2,"xd");
    } catch (IndexOutOfBoundsException e){
      System.out.println("Caught an Exception in add(int,String)");
    }

    System.out.println();

    SA.add(1,"C"); System.out.println("SA.add(1,\"C\")");            // no output
    System.out.println("SA: " + SA);
    // [I'm, C, C]

    System.out.println();

    SA.add(1,"sorry"); System.out.println("SA.add(1,\"sorry\")");    // no output
    System.out.println("SA: " + SA);
    // [I'm, sorry, C, C]
    System.out.println("size: " + SA.size());                        // 4

    System.out.println();

    System.out.println("SA.indexOf(\"C\"): " + SA.indexOf("C"));     // 2
    System.out.print("SA.lastIndexOf(\"C\"): ");
    System.out.println(SA.lastIndexOf("C"));                         // 3

    System.out.println();

    System.out.println("SA.indexOf(\"D\"): " + SA.indexOf("D"));     // -1
    System.out.print("SA.lastIndexOf(\"D\"): ");
    System.out.println(SA.lastIndexOf("D"));                         // -1

    System.out.println();

    System.out.println("Testing remove(int)\'s throw ... Expected : 2 error messages");
    try{
      SA.remove(7);
    } catch (IndexOutOfBoundsException e){
      System.out.println("Caught an Exception in remove(int)");
    }
    try{
      SA.remove(-2);
    } catch (IndexOutOfBoundsException e){
      System.out.println("Caught an Exception in remove(int)");
    }

    System.out.println();System.out.println("SA.remove(15): " + SA.remove(15));           // index error
    System.out.println("SA.remove(-2): " + SA.remove(-2));           // index error
    System.out.println("SA.remove(2): " + SA.remove(2));             // "C"
    System.out.println("SA: " + SA);
    // [I'm, sorry, C]
    System.out.println("SA: " + SA.toStringDebug());
    // [I'm, sorry, C, null, null, null, null, null, null, null, null]

    System.out.println();

    System.out.print("SA.remove(\"D\"): ");
    if(SA.remove("D")) {
      System.out.println("element succesfully removed");
    } else {
      System.out.println("element not found");
    }

    System.out.print("SA.remove(\"C\"): ");
    if(SA.remove("C")) {
      System.out.println("element succesfully removed");
    } else {
      System.out.println("element not found");
    }

    System.out.println("SA: " + SA);
    // [I'm, sorry]
    System.out.println("SA: " + SA.toStringDebug());
    // [I'm, sorry, null, null, null, null, null, null, null, null, null]

    System.out.println();

    SA.add("Dave"); System.out.println("SA.add(\"Dave\")");          // no output
    SA.add("I'm"); System.out.println("SA.add(\"I'm\")");            // no output
    SA.add("afraid"); System.out.println("SA.add(\"afraid\")");      // no output
    SA.add("I"); System.out.println("SA.add(\"I\")");                // no output
    SA.add("can't"); System.out.println("SA.add(\"can't\")");        // no output
    SA.add("let"); System.out.println("SA.add(\"let\")");            // no output
    SA.add("you"); System.out.println("SA.add(\"you\")");            // no output

    System.out.println();

    System.out.println("size: " + SA.size());                        // 9
    System.out.println("SA: " + SA);
    // [I'm, sorry, Dave, I'm, afraid, I, can't, let, you]
    System.out.println("SA: " + SA.toStringDebug());
    // [I'm, sorry, Dave, I'm, afraid, I, can't, let, you, null]

    System.out.println();

    SA.add("do"); System.out.println("SA.add(\"do\")");              // no output
    SA.add("that"); System.out.println("SA.add(\"that\")");          // no output

    System.out.println();

    System.out.println("size: " + SA.size());                        // 11
    System.out.println("SA: " + SA);
    // [I'm, sorry, Dave, I'm, afraid, I, can't, let, you, do, that]
    System.out.println("SA: " + SA.toStringDebug());
    // [I'm, sorry, Dave, I'm, afraid, I, can't, let, you, do, that, null, null, null, null, null, null, null, null, null]
		SuperArray beef = new SuperArray();
		/**phase 1 testing start*/
		System.out.println("Phase 1 testing, start!");
		
		//testing SuperArray initializing
		System.out.println("\n!!Testing SuperArray initializing!!");
		System.out.println("Testing toString(): should return []");
		System.out.println(beef);
		System.out.println("\nTesting toStringDebug(): should return [null, ... null]");
		System.out.println(beef.toStringDebug());
		
		//testing size()
		System.out.println("\n\n!!Testing size()!!");
		System.out.println("Testing size(): should return 0");
		System.out.println(beef.size());
		
		//testing add()
		System.out.println("\n\n!!Testing add()!!");
		System.out.println("Testing add() while empty: should return true");
		System.out.println(beef.add("red"));
		System.out.println("\nChecking add() and toString(): should return [red]");
		System.out.println(beef);
		beef.add("cow");
		System.out.println("\nChecking add() and toString(): should return [red, cow]");
		System.out.println(beef);
		for (int x = 0; x < 9; x++){
			beef.add("filler");
		}
		
		//testing clear()
		System.out.println("\n\n!!Testing clear()!!");
		System.out.println("Testing clear(): should return []");
		beef.clear();
		System.out.println(beef);
		System.out.println("\nTesting clear() and size(): should return 0");
		System.out.println(beef.size());
		System.out.println("\nTesting add(\"red\") after clear(): should return true");
		System.out.println(beef.add("red"));
		System.out.println("\nSeeing SuperArray: should be [red]");
		System.out.println(beef);
		beef.clear();
		
		//testing get()
		System.out.println("\n\n!!Testing get()!!");
		System.out.println("Testing get() while empty: should return null");
		System.out.println(beef.get(0));
		beef.add("red");
		beef.add("cow");
		beef.add("meat");
		System.out.println("\nTesting get() with indices 0-2 filled: should return values *check code*");
		System.out.println(beef.get(0));
		System.out.println(beef.get(1));
		System.out.println(beef.get(2));
		System.out.println("\nTesting get() for out of bounds: should return null");
		System.out.println(beef.get(-1));
		System.out.println(beef.get(10));
		
		//testing set()
		System.out.println("\n\n!!Testing set()!!");
		System.out.println("Using SuperArray from !!testing get()!!");
		System.out.println(beef);
		System.out.println("\nTesting set(0, \"blue\"): should return red");
		System.out.println(beef.set(0, "blue"));
		System.out.println("SuperArray should now be [blue, cow, meat]");
		System.out.println(beef);
		System.out.println("\nTesting set(1, \"fish\"): should return cow");
		System.out.println(beef.set(1, "fish"));
		System.out.println("SuperArray should now be [blue, fish, meat]");
		System.out.println(beef);
		System.out.println("\nTesting set(2, \"vegetal\"): should return meat");
		System.out.println(beef.set(2, "vegetal"));
		System.out.println("SuperArray should now be [blue, fish, vegetal]");
		System.out.println(beef);
		System.out.println("\nUsing empty SuperArray ");
		beef.clear();
		System.out.println("\nTesting set(2, \"vegetal\"): should return null");
		System.out.println(beef.set(2, "vegetal"));
		System.out.println("SuperArray should now be []");
		System.out.println(beef);
		/** phase 1 testing end*/
    /**phase 2 testing start*/
    System.out.println("Phase 2 testing, start!");
    //testing resize()
    SuperArray letters = new SuperArray();

    for (int x = 0; x < 20; x++){
      System.out.println();
			letters.add("a");
      System.out.println("Size: " + letters.size());
      System.out.println(letters);
		} //array should now be filled to index 19

    System.out.println();
    System.out.println("Phase 2 testing, end");
    /** phase 2 testing end*/
    System.out.println("Phase 3 testing, start!");
    System.out.println();

    //testing contains()
    SuperArray randomLetters = new SuperArray();
    randomLetters.add("b");
    randomLetters.add("f");
    randomLetters.add("g");
    randomLetters.add("c");
    randomLetters.add("z");

    System.out.println(randomLetters); //should print [b,f,g,c,z]

    if (randomLetters.contains("a")){
      System.out.println("a is in the array");
    } else {
      System.out.println("a is not in the array");
    } //should print "a is not in the array"

    if (randomLetters.contains("c")){
      System.out.println("c is in the array");
    } else {
      System.out.println("c is not in the array");
    } //should print "c is in the array"

    System.out.println();

    //testing indexOf() and lastIndexOf()
    randomLetters.add("b");
    randomLetters.add("z");
    System.out.println(randomLetters); //should print [b,f,g,c,z,b,z]

    System.out.println("The first occurance of b is at: " + randomLetters.indexOf("b")); //should print 0
    System.out.println("The first occurance of f is at: " + randomLetters.indexOf("f")); //should print 1
    System.out.println("The first occurance of g is at: " + randomLetters.indexOf("g")); //should print 2
    System.out.println("The first occurance of c is at: " + randomLetters.indexOf("c")); //should print 3
    System.out.println("The first occurance of z is at: " + randomLetters.indexOf("z")); //should print 4
    System.out.println("The first occurance of j is at: " + randomLetters.indexOf("j")); //should print -1

    System.out.println();

    System.out.println("The last occurance of b is at: " + randomLetters.lastIndexOf("b")); //should print 5
    System.out.println("The last occurance of f is at: " + randomLetters.lastIndexOf("f")); //should print 1
    System.out.println("The last occurance of g is at: " + randomLetters.lastIndexOf("g")); //should print 2
    System.out.println("The last occurance of c is at: " + randomLetters.lastIndexOf("c")); //should print 3
    System.out.println("The last occurance of z is at: " + randomLetters.lastIndexOf("z")); //should print 6
    System.out.println("The last occurance of j is at: " + randomLetters.lastIndexOf("j")); //should print -1

    System.out.println();

    //testing add(int,String)
    System.out.println(randomLetters);//should print [b,f,g,c,z,b,z]

    randomLetters.add(2, "a");
    System.out.println(randomLetters);//should print [b,f,a,g,c,z,b,z]
    randomLetters.add(10, "a");//should print error

    System.out.println();

    //testing remove()
    System.out.println(randomLetters);//should print [b,f,a,g,c,z,b,z]

    System.out.println(randomLetters.remove(9));//should print null
    System.out.println(randomLetters.remove(1));//should print f;
    System.out.println(randomLetters);//should print [b,a,g,c,z,b,z]

    System.out.println();
    System.out.println(randomLetters.remove("d"));//should print false
    System.out.println(randomLetters.remove("z"));//should print true
    System.out.println(randomLetters);//should print [b,a,g,c,b,z]

    System.out.println();
    System.out.println("Phase 3 testing, end");
	}
}