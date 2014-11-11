
public class Ellipse {
	private double majoraxis;
	private double minoraxis;
	private double pi;
	
	public Ellipse(double m1, double m2){
		if(m1>m2){majoraxis = m1; minoraxis = m2;}
		else{majoraxis = m2; minoraxis = m1;}
		pi = Math.PI;
	}
	
	public double measureArea(){
		return majoraxis*minoraxis*pi;
	}
	
	public double measurePerimeter(){
		
		double h = (majoraxis-minoraxis)*(majoraxis-minoraxis)/((majoraxis+minoraxis)*(majoraxis+minoraxis));
		h = pi*(majoraxis+minoraxis)*(1+3*h/(10+Math.sqrt(4-3*h)));
//		Ramanujan Approximation
		return h;
	}
}
