public class Problem_2 {
     
    public static void main(String[] args) {
 
      String kata = "Sampo";
 
      String kata1 = kata.toUpperCase();
      String kata2 = kata.toLowerCase();
      String kata3 = kata.replace('o', '-');
 
      System.out.println();
      System.out.println("kata = " + kata);
      System.out.println();
      System.out.println("kata.toUpperCase() = " + kata1);
      System.out.println("kata.toLowerCase() = " + kata2);
      System.out.println("kata.replace('o', '-') = " + kata3);
   }
}
        