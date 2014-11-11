

public class Rectangle extends Shape{
	
//	private double height;
//	private double width;
	
	public Rectangle(double w, double h){
		width = w;
		height = h;
	}
	
	public double measureArea(){
		return width*height;
	}
	
	public double measurePerimeter(){
		return 2*(width + height);
		
	}
}
