public class Tile implements Comparable<Tile>{
  private int row;
  private int col;
  private int numMoves;
  public Tile(int nrow, int ncol, int num){
    row = nrow;
    col = ncol;
    numMoves = num;
  }
  public int getRow(){
    return row;
  }
  public int getCol(){
    return col;
  }
  public int numMoves(){
    return numMoves;
  }

  public void changeMoves(int n){
    numMoves += n;
  }

  public int compareTo(Tile T){
    return numMoves - T.numMoves();
  }
}
