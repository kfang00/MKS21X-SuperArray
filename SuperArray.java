
public class SuperArray {
  private String[] data;
  private int size;

  public SuperArray(){
    data = new String[10];
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
  }

  public String toString() {
    return "[" + data + "]";
  }


  public String toStringDebug() {
    String str = "";
    for (int x = 0; (x + 1) < data.length; x++) {
	str = data[x] + ",";
    };
    return "[" + str + "," + data[data.length - 1] + "]";
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

}
