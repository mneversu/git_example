public class Shape
{
  protected double area;
  protected double perimeter;

 public Shape()
 {
   System.out.println("Version 1: This is updated");
   area=perimeter=0;
 }
  public String toString()
  	 {

  	     return "area = " + area +
                  " \t perimeter = " + perimeter;

  	 }


}
