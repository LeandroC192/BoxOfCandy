public class Main
{
  public static void main (String [] args)
  {
    Candy[][] box = new Candy[4][3];
    box[0][1] = new Candy("Lime");
    box[1][1] = new Candy("Orange");
    box[2][2] = new Candy("Cherry");
    box[3][1] = new Candy("Lemon");
    box[3][2] = new Candy("Grape");
    System.out.println(box);

    BoxOfCandy b = new BoxOfCandy(box);
    System.out.println(b);
    b.moveCandyToFirstRow(2);
    System.out.println(b);

    box = new Candy[3][5];
    
    }
}
