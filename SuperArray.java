
public class SuperArray {
  private String[] data;
  private int size;

  public SuperArray(){
    String[] arr = new String[10];
    data = arr;
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
  public int size() {
    return size;
  }
}
