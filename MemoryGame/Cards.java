
public class Cards {

  char[][] backSide = new char[4][4];
  char[][] frontSide = new char[4][4];
  char[][] chars = {{'A'} ,{'B'},{'C'} ,{'D'},{'E'},{'F'},{'G'} , {'H'} ,
  {'A'} ,{'B'},{'C'} ,{'D'},{'E'},{'F'},{'G'} , {'H'}};
  int[][] numbers = {{1} ,{2},{3} ,{4},{5},{6},{7} , {8} ,
  {9} ,{10},{11} ,{12},{13},{14},{15} , {16}};

  public void startGame(){

    for (int i = 0; i < backSide.length; i++) {
      for (int j = 0; j < backSide.length; j++) {
        backSide[i][j] = 'x';
      }
    }
    for (int i = 0; i < frontSide.length; i++) {
      for (int j = 0; j < frontSide.length; j++) {

          frontSide[i][j] =

      }
    }

  }


}
