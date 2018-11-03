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
  }
}
