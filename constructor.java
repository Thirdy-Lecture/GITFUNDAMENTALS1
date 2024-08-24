public class Main {
  int x;
  String name;

  public Main(int y, String namee) {
    x = y;
    name = namee;
  }

  public static void main(String[] args) {
    Main myObj = new Main(22, "Sandro");
    System.out.println("Hello my name is " + myObj.name + " and I'm " + myObj.x);
  }
}
