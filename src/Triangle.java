
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
//		�����غ��� �غ�, ���̸� ������� �ﰢ���� �ѷ��� ���̸� �� ���� ����.
	}
}
