package epam;
interface Shape{
	double getarea();
}
interface Color{
	String getcolo();
}
class Rectangle implements Shape,Color{
	double width;
	double length;
	String color;
	double area;
	public Rectangle(double width,double length, String color) { //constructor.
		this.width = width;
		this.length = length;
		this.color = color;	
	}
    public double getarea() {
    	area = width * length;
    	return area;
    }
    public String getcolor() {
    	return color;
    }
}
public class MultipleInterfaces {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Rectangle rectangle = new Rectangle(2,4,"Black");
		double area = rectangle.getarea();
		System.out.println(area);
		String color = rectangle.getcolor();
		System.out.println(color);	
	}
}
