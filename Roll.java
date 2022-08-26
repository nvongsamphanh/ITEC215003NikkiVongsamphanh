public class Roll{
  //revise only this method. 
  public static int roll(int min, int max) {
        int range = max - min;
        return (int)(Math.random() * range) + min;
    } 
  
}
