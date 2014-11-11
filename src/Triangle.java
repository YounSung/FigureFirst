
public class Triangle {
	private double height;
	private double width;
	
	public Triangle(double w, double h){
		width = w;
		height = h;
	}
	
	public double measureArea(){
		return 0.5*width*height;
	}
	
	public double measurePerimeter(){
		return 0;
//		생각해보니 밑변, 높이만 가지고는 삼각형의 둘레의 길이를 알 수가 없다.
	}
}
