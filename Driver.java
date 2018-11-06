public class Driver {

  public static void main(String[] args) {


    System.out.println("TESTING PHASE 1 and 2... except clear() which will be at the end");

    System.out.println();
    System.out.println();
    System.out.println("Testing SuperArray(int) ... SA should be [] even when debugged");
    SuperArray SAA = new SuperArray(0);

    System.out.println("Testing toString() and toStringDebug ... Expected: []");
    System.out.println("Current Status of SAA: " + SAA.toStringDebug());

    System.out.println();

    System.out.println("Testing isEmpty() ... Expected : true");
    System.out.println("isEmpty?: " + SAA.isEmpty());

    System.out.println();

    System.out.println("Testing add(String) ... Expected : true");
    System.out.println("Did we add \"A\" to SAA? :" + SAA.add("A"));
    System.out.println("Expected : [A]");
    System.out.println("Testing toString() ... Current Status of SAA : " + SAA);
    System.out.println("Testing isEmpty() ... Expected : false");
    System.out.println("isEmpty?: " + SAA.isEmpty());
    System.out.println("Testing size() ... Expected : 1");
    System.out.println("Size: " + SAA.size());

    System.out.println();

    System.out.println("Adding \"B\" to SAA?: " + SAA.add("B"));
    System.out.println("Testing resize() and toStringDebug ... Expected [A, B, null]");
    System.out.println("Current Status of SAA: " + SAA.toStringDebug());
    System.out.println("Testing get(int) ... Expected : B");
    System.out.println("SAA[1] == " + SAA.get(1));
    System.out.println("Testing get(int)\'s throw ... Expected : 2 error messages");
    try{
      SAA.get(2);
    } catch(IndexOutOfBoundsException e){
      System.out.println("Caught an Exception in get()");
    }
    try{
      SAA.get(-2);
    } catch (IndexOutOfBoundsException e){
      System.out.println("Caught an Exception in get()");
    }

    System.out.println();

    System.out.println("Testing set(int,String) ...  Expected : A");
    System.out.println("\"C\" will replace : " + SAA.set(0,"C"));
    System.out.println("Expected : [C, B]");
    System.out.println("SAA\'s Current Status: " + SAA);
    System.out.println("Testing set(int,String)\'s throw ... Expected : 2 error messages");
    try{
      SAA.set(2,"C");
    } catch(IndexOutOfBoundsException e){
      System.out.println("Caught an Exception in set(int,String)");
    }
    try{
      SAA.set(-2,"xd");
    } catch (IndexOutOfBoundsException e){
      System.out.println("Caught an Exception in set(int,String)");
    }

    System.out.println();
    System.out.println("Expected : [C, B]");
    System.out.println("SAA\'s Current Status after Testing Phase 1: " + SAA);
    System.out.println("Expected : [C, B, null]");
    System.out.println("SAA\'s Current debugged Status after Testing Phase 1: " + SAA.toStringDebug());
    System.out.println();
    System.out.println("******************************************************");
    System.out.println();
    System.out.println("TESTING PHASE 2 and 3 ...");

    System.out.println();

    System.out.println("Testing add(int.String) ... Expected : SAA should be [C, D, B, E]");
    SAA.add(1,"D");
    SAA.add(3, "E");
    System.out.println("SAA\'s Current Status: " + SAA);
    System.out.println("Testing add(int,String)\'s throw ... Expected : 2 error messages");
    try{
      SAA.add(5,"xd");
    } catch (IndexOutOfBoundsException e){
      System.out.println("Caught an Exception in add(int,String)");
    }
    try{
      SAA.add(-2,"xd");
    } catch (IndexOutOfBoundsException e){
      System.out.println("Caught an Exception in add(int,String)");
    }

    System.out.println();

    System.out.println("Testing resize() ... Expected: SAA when debugged should be [C, D, B, E, null, null, null]");
    System.out.println(SAA.toStringDebug());

    System.out.println();

    System.out.println("Testing contains(String) ... Expected : true");
    System.out.println("Does SAA contain \"C\" ?: " + SAA.contains("C"));
    System.out.println("Expected : false");
    System.out.println("Does SAA contain \"C\" ?: " + SAA.contains("F"));

    System.out.println("Testing indexOf(String) ... Expected : 3");
    System.out.println("Where is \"E\" in SAA? :" + SAA.indexOf("E"));
    System.out.println("Expected : -1");
    System.out.println("Where is \"E\" in SAA? :" + SAA.indexOf("Z"));

    System.out.println();

    SAA.add("C");
    System.out.println("Added \"C\" to the end of the list using add(String)");
    System.out.println("Status of SAA is: " + SAA);

    System.out.println();

    System.out.println("Testing lastIndexOf(String) ... Expected : 4");
    System.out.println("Where is \"C\" in SAA? :" + SAA.lastIndexOf("C"));
    System.out.println("Expected : -1");
    System.out.println("Where is \"Z\" in SAA? :" + SAA.lastIndexOf("Z"));

    System.out.println();

    System.out.println("Testing remove(int) ...  Expected : Removed element is D");
    System.out.println("The element that is removed is : " + SAA.remove(1));
    System.out.println("Expected: SAA is [C, B, E, C]");
    System.out.println("Current Status of SAA: " + SAA);
    System.out.println("Testing remove(int)\'s throw ... Expected : 2 error messages");
    try{
      SAA.remove(7);
    } catch (IndexOutOfBoundsException e){
      System.out.println("Caught an Exception in remove(int)");
    }
    try{
      SAA.remove(-2);
    } catch (IndexOutOfBoundsException e){
      System.out.println("Caught an Exception in remove(int)");
    }

    System.out.println();

    System.out.println("Testing remove(String) ...  Expected : true");
    System.out.println("The first element, \"C\" is removed ? : " + SAA.remove("C"));
    System.out.println("Expected: SAA is [B, E, C]");
    System.out.println("Current Status of SAA: " + SAA);
    System.out.println("Expected: false");
    System.out.println(SAA.remove("ASD"));

    System.out.println();
    
    System.out.println("Testing clear() ... Expected : SAA should be []");
    SAA.clear();
    System.out.println(SAA);

    System.out.println();

    System.out.println("END OF TESTING");
    
    SuperArray SA2 = new SuperArray(4);

    System.out.println("SA2: " + SA2);
    // []
    System.out.println("isEmpty?: " + SA2.isEmpty());                 // true

    System.out.println();

    SA2.add("A"); System.out.println("SA2.add(\"A\")");                // no output
    System.out.println("SA2 (debug): " + SA2.toStringDebug());
    // [A, null, null, null]

    System.out.println();

    System.out.println("SA2.remove(0): " + SA2.remove(0));             // "A"
    SA2.add("No"); System.out.println("SA2.add(\"No\")");              // no output
    SA2.add("I"); System.out.println("SA2.add(\"I\")");                // no output
    SA2.add("am"); System.out.println("SA2.add(\"am\")");              // no output
    SA2.add("your"); System.out.println("SA2.add(\"your\")");          // no output
    SA2.add("father"); System.out.println("SA2.add(\"father\")");      // no output

    System.out.println();

    System.out.println("size: " + SA2.size());                        // 5
    System.out.println("SA2: " + SA2);
    // [No, I, am, your, father]
    System.out.println("SA2 (debug): " + SA2.toStringDebug());
    // [No, I, am, your, father, null, null, null]

    System.out.println("\n" + "------------------------------------------------------------" + "\n");

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
    System.out.println("SA (debug): " + SA.toStringDebug());
    // [A, B, C, null, null, null, null, null, null, null]

    System.out.println();

    System.out.println("SA.remove(0): " + SA.remove(0));             // "A"
    System.out.println("size: " + SA.size());                        // 2
    System.out.println("SA: " + SA);
    // [B, C]

    System.out.println();

    System.out.println("SA.get(1): " + SA.get(1));                   // "C"
    System.out.print("SA.get(15): ");
    System.out.print("SA.get(-2): ");

    System.out.println();

    System.out.println("SA.set(0,\"I'm\"): " + SA.set(0,"I'm"));     // "B"
    System.out.println("SA: " + SA);
    // [I'm, C]

    System.out.println();

    System.out.print("SA.set(15, \"J\"): ");
    System.out.print("SA.get(-2, \"J\"): ");

    System.out.println("SA: " + SA);
    // [I'm, C]
    System.out.println("size: " + SA.size());                        // 2

    System.out.println();

    System.out.println("contains(\"D\"?): " + SA.contains("D"));     // false
    System.out.println("contains(\"C\"?): " + SA.contains("C"));     // true

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
    System.out.println("SA.remove(2): " + SA.remove(2));             // "C"
    System.out.println("SA: " + SA);
    // [I'm, sorry, C]
    System.out.println("SA (debug): " + SA.toStringDebug());
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
    System.out.println("SA (debug): " + SA.toStringDebug());
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
    System.out.println("SA (debug): " + SA.toStringDebug());
    // [I'm, sorry, Dave, I'm, afraid, I, can't, let, you, null]

    System.out.println();

    SA.add("do"); System.out.println("SA.add(\"do\")");              // no output
    SA.add("that"); System.out.println("SA.add(\"that\")");          // no output

    System.out.println();

    System.out.println("size: " + SA.size());                        // 11
    System.out.println("SA: " + SA);
    // [I'm, sorry, Dave, I'm, afraid, I, can't, let, you, do, that]
    System.out.println("SA (debug): " + SA.toStringDebug());
    // [I'm, sorry, Dave, I'm, afraid, I, can't, let, you, do, that, null, null, null, null, null, null, null, null, null]
    
    System.out.println("NOTE: IF SOMETHING TESTS, AND DOESN'T RETURN ANYTHING, ASSUME IT WORKS");

    //Case 0
    System.out.println("Instantianting Empty:");
    SuperArray testy = new SuperArray(0);
    System.out.println(testy.toStringDebug());

    //Case 1
    System.out.println("\n\nAdding only 3 items:");
    for (int x = 0; x < 3; x ++) {
      testy.add("" + x);
    }
    System.out.println(testy);
    testy.clear();

    //Case 2
    System.out.println("\n\nAdding 3000 Times:");
    for (int x = 0; x < 3000; x ++) {
      testy.add("test" + x);
    }
    System.out.println("Length should now be 3000:\n" + testy.size());

    //Case 3
    System.out.println("\n\nRemoving 200 Items:");
    for (int x = 2999; x > 2799; x --) {
      testy.remove(x);
    }
    System.out.println("Length should now be 2800:\n" + testy.size());

    //Case 4
    System.out.println("\n\nRemoving 200, and checking return values:");
    for(int x = 0; x < 200; x ++) {
      if (! testy.remove(0).equals("test" + x)) {
        throw new RuntimeException("Something has gone wrong, this test failed.");
      }
    }
    System.out.println("Congrats! No errors. Length should now be 2600:\n" + testy.size());
    testy.clear();

    //Case 5
    int c = 0;
    try {
      SuperArray seven = new SuperArray(-5);
    } catch (IllegalArgumentException e) {
      //System.out.println("Failed to make a SuperArray of size -5 (probably a good thing!)");
      c++;
    }
    try {
      testy.get(6);
    } catch (IndexOutOfBoundsException e) {
      //System.out.println("Failed to get item at too high an index");
      c++;
    }
    try {
      testy.get(-1);
    } catch (IndexOutOfBoundsException e) {
      //System.out.println("Failed to get item at negative index");
      c++;
    }
    //Adding five integers to testy
    for (int i = 0; i < 5; i++) {
      testy.add(Integer.toString(i));
    }
    try {
      testy.set(5, "lol");
    } catch (IndexOutOfBoundsException e) {
      //System.out.println("Failed to set value at too high an index");
      c++;
    }
    try {
      testy.set(-1, "yee");
    } catch (IndexOutOfBoundsException e) {
      //System.out.println("Failed to set value at negative index");
      c++;
    }
    try {
      testy.add(6, "lol");
    } catch (IndexOutOfBoundsException e) {
      //System.out.println("Failed to add value at too high an index");
      c++;
    }
    try {
      testy.add(-1, "yee");
    } catch (IndexOutOfBoundsException e) {
      //System.out.println("Failed to add value at negative index");
      c++;
    }
    try {
      testy.remove(6);
    } catch (IndexOutOfBoundsException e) {
      //System.out.println("Failed to remove value at too high an index");
      c++;
    }
    try {
      testy.remove(-1);
    } catch (IndexOutOfBoundsException e) {
      //System.out.println("Failed to remove value at negative index");
      c++;
    }
    if (c == 9) {
      System.out.println("All exceptions successfully caught");
    } else {
      System.out.println("c = "+c);
    }
    testy.clear();

    //Case 6
    System.out.println("Adding to 0 and using size() a few times:");
    testy.add(0, "test1");
    System.out.println(testy.size());
    testy.add(0, "test2");
    System.out.println(testy.size());
    testy.add(0, "test3");
    System.out.println(testy.size());
    testy.clear();

    //Case 7
    System.out.println("Testing indexOf Many Times(if there is nothing printed, you're good to go!):");
    testy.add("a");
    testy.add("a");
    boolean case7 = true;
    for (int i = 0; i < 100; i++) {
      if (testy.indexOf("a") != 0) {
        case7 = false;
      }
    }
    if (!case7) {
      System.out.println("Your indexOf isn't working");
    }

    //Case 8
    System.out.println("Testing LastIndex Many Times(if there is nothing printed, you're good to go!):");
    boolean case8 = true;
    for (int i = 0; i < 100; i++) {
      if (testy.lastIndexOf("a") != 1) {
        case8 = false;
      }
    }
    if (!case8) {
      System.out.println("Your lastIndexOf isn't working");
    }
    testy.clear();


    //Case 9
    System.out.println("\n\nTesting the speed and functionality of add:");
    for (int x = 0; x < 100; x ++) {
      testy.add("placeHolder");
    }
    for (int x = 0; x < 100; x ++) {
      try{
      testy.set(x, "jediNumber" + x);
      }
      catch(IndexOutOfBoundsException e) {
        System.out.println("An Index error was given here, check your set function.");
      }
    }
    System.out.println("If no errors were given, and the length is 100, you're good to go! Length:\n" + testy.size());

    //Case 10
    System.out.println ("Testing add and clear(if there is nothing printed, you're good to go!):");
    for (int i = 0; i < 1500; i++) {
      testy.add("churros");
    }
    testy.clear();
    for (int i = 0; i < 1500; i++) {
      testy.add("seven");
    }
    if (testy.get(1499).equals("churros")) {
      System.out.println("Your clear is messed up");
    } else if (!testy.get(1499).equals("seven")) {
      System.out.println("Your add seems to be faulty");
    }
    testy.clear();

    //Case 11
    System.out.println("Testing a LOT of set commands(if there is nothing printed, you're good to go!):");
    boolean case11 = true;
    for (int i = 0; i < 530; i++) {
      testy.add("Thanos");
    }
    for (int i = 0; i < 530; i++) {
      testy.set(i, "was right");
    }
    for (int i = 0; i < 530; i++) {
      if (!testy.get(i).equals("was right")) {
        case11 = false;
      }
    }
    if (!case11) {
      System.out.println("Go fix your set because it's stupid right now");
    }
  }
}
