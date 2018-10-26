public class SuperArray {
  private String[] data;
  private int size;

  public SuperArray(){
    String[] arr = new String[10];
    data = arr;
    size = 0;
  }

  public void clear() {
    size = 0;
  }

  public int size() {
    return size;
  }

  public boolean isEmpty() {
    return (size == 0);
  }

  public boolean add(String a) {
    if (size != data.length) {
      data[size] = a;
      return true;
    }
    size += 1;
    return false;
  }

  public String toString() {
    String str = "";
    if (data[0] != null) {
      str = data[0];
    }
    for (int x = 0; x < data.length; x++) {
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
    for (int x = 0; (x + 1) < data.length; x++) {
	str = (str + data[x] + ",");
    }
    return ("[" + str + "," + data[data.length - 1] + "]");
  }

  public String get(int b) {
    if (b < 0 || b >= size()) {
      return null;
    }
    return data[b] + "";
  }

  public String set(int b, String c) {
    String d = data[b];
    if (b < 0 || b >= size()) {
      return null;
    }
    data[b] = c;
    return d;
  }

  private void resize() {
    int newSize = 1;
    if (size != 0) {
	newSize = newSize * 2;
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
      x += 1;
    }
    return false;
  }
  
  public int indexOf(String target) {
    for (int x = 0; x < data.length; x++) {
      if (data[x] == target) {
	return x;
      }
      x += 1;
    }
    return -1;
  }
  
  public lastIndexOf(String target) {
    for (int x = (data.length - 1); x >= 0; x--) {
	if (data[x] == target) {
	return x;
        }
        x += 1;
    }
    return -1;
  }
  
  public void add(int e, String f) {
    int track = 0;
    String[] arrCopy = new String[size + 1]; 
    if ( e < 0 || e > size()) {
      System.out.println("ERROR");
    }
    else {
      for (int x = 0; x < e; x++) {
        arrCopy[x] == data[x];
        track += 1;
      }
      arrCopy[track] = f;
      for (int x = track; x < data.length; x++) {
        arrCopy[x + 1] == data[x];
      }
    }
    data = arrCopy;
  }

  public String remove(int a) {
    int track = 0;
    String str = data[a];
    String[] arrCopy = new String[size]; 
    if ( a < 0 || a >= size()) {
      System.out.println("ERROR");
      return null;
    }
    else {
      for (int x = 0; x < e; x++) {
        arrCopy[x] == data[x];
        track += 1;
      }
      for (int x = track; (x + 1) < data.length; x++) {
        arrCopy[x] == data[x + 1];
      }
    }
    data = arrCopy;
  }
  
  public boolean remove(String a) {
    int track = -1;
    String str = data[a];
    String[] arrCopy = new String[size]; 
    for (int x = 0; x < data.length; x++) { 
      if (data[x] == a) {
        track = x;
      }
    }
    if (track == -1) {
      return false;
    }
    else {
      this.remove(track)
      return true;
    }
  }
}
