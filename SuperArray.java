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
    for (int x = 0, x < size, x++) {
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
}
