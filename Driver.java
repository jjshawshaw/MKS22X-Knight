public class Driver{
  public static void main(String[]args){
    KnightBoard k = new KnightBoard(4, 5);
    System.out.println(k);
    /*int i = 0;
    for (int y = 0; y < 5; y ++){
      for (int x = 0; x < 5; x++){
        int s = k.countSolutions(y, x);
        System.out.println("r: " + y + " c: " + x + " s: " + s);
        i += s;
      }
    }
    System.out.println(i);*/
    System.out.println(k.numMovesString());
    System.out.println(k.countSolutions(0, 2));
    //k.solve(0, 2);
    System.out.println(k);
  }
}
