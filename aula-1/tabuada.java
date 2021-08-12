public class tabuada {
  public static void main(String[] args) {

    for (var i = 1; i <= 10; i++) {
      System.out.println("-------- Tabuada do " + i + " --------");
      for (var j = 1; j <= 10; j++) {
        System.out.println(i + "x" + j + ": " + i * j);
      }
    }
  }
}