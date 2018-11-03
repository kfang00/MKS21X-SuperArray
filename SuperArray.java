public class SuperArray {
  private String[] data;
  private int size;

  public SuperArray(){
    String[] arr = new String[10];
    data = arr;
    size = 0;
  }

  public SuperArray(int startingCapacity) {
    if (startingCapacity < 0) {
      throw new IllegalArgumentException();
    }
    else {
      String[] arr = new String[startingCapacity];
      data = arr;
      size = 0;
    }
  }

  public void clear() {
    size = 0;
    data = new String[10];
  }

  public int size() {
    return size;
  }

  public boolean isEmpty() {
    return (size == 0);
  }

  public boolean add(String a) {
    if (size >= (data.length - 1)) {
      resize();
      
    }
    data[size] = a;
    size += 1;
    return true;
  }

  public String toString() {
    String str = "";
    if (data[0] != null) {
      str = data[0];
    }
    for (int x = 1; x < data.length; x++) {
	if (data[x] != null) {
	  str = (str + "," + data[x] );
	}
    }
    if (data.length == 0) {
	return "[]";
    }
    return "[" + str + "]";
  }

  public String toStringDebug() {
    String str = "";
    if (size() == 0) {
      return "[]";
    }
    for (int x = 0; (x + 1) < data.length; x++) {
	str = (str + data[x] + ",");
    }
    return ("[" + str + data[data.length - 1] + "]");
  }

  public String get(int b) {
    if (b < 0 || b >= size()) {
      throw new IndexOutOfBoundsException(); 
    }
    return data[b] + "";
  }

  public String set(int b, String c) {
    String d = data[b];
    if (b < 0 || b >= size()) {
      throw new IndexOutOfBoundsException(); 
    }
    data[b] = c;
    return d;
  }

  private void resize() {
    int newSize = 1;
    if (size != 0) {
	newSize = size * 2;
    }
    String[] newArr = new String[newSize];
    for (int x = 0; x < size; x++) {
	newArr[x] = data[x];
    }
    data = newArr;
  }

  public boolean contains(String target) {
    for (int x = 0; x < data.length; x++) {
      if (data[x] == target) {
        return true;
      }
    }
    return false;
  }
  
  public int indexOf(String target) {
    for (int x = 0; x < data.length; x++) {
      if (data[x] == target) {
	return x;
      }
    }
    return -1;
  }
  
  public int lastIndexOf(String target) {
    for (int x = (data.length - 1); x >= 0; x--) {
	if (data[x] == target) {
	return x;
        }
    }
    return -1;
  }
  
  public void add(int e, String yay) {
    int track = 0;
    String[] arrCopy = new String[size() + 1]; 
    if ( e < 0 || e > size()) {
      throw new IndexOutOfBoundsException(); 
    }
    else {
      for (int x = 0; x < e; x++) {
        arrCopy[x] = data[x];
        track += 1;
      }
      arrCopy[track] = yay;
      for (int x = track; x < size() ; x++) {
        arrCopy[x + 1] = data[x];
      }
      data = arrCopy;
      size += 1;
    }
    
  }

  public String remove(int a) {
    int track = 0;
    String[] arrCopy = new String[size()]; 
    if ( a < 0 || a >= size()) {
      throw new IndexOutOfBoundsException(); 
    }
    else {
      for (int x = 0; x < a; x++) {
        arrCopy[x] = data[x];
        track += 1;
      }
      for (int x = track; (x + 1) < size(); x++) {
        arrCopy[x] = data[x + 1];
      }
      String str = data[track];
      data = arrCopy;
      size = size - 1;
      return str;
    }
    
  }
  
  public boolean remove(String a) {
    int track = -1;
    String[] arrCopy = new String[size()]; 
    for (int x = 0; x < data.length; x++) { 
      if (data[x] == a) {
        remove(x);
        return true;
      }
    }
    return false;
  }
}
