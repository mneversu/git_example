public class Shape
{
  protected double area;
  protected double perimeter;

 public Shape()
 {
   System.out.println("Version 1: This is updated");
   System.out.println("Version 2: Updated in Local");
   area=perimeter=0;
 }
  public String toString()
  	 {

  	     return "area = " + area +
                  " \t perimeter = " + perimeter;

  	 }


}
