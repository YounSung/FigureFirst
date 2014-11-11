
import java.io.*;

public class FigureCalculation {

	public static void main(String[] args){
		// TODO Auto-generated method stub

		FileReader fr = null;
		FileWriter fw = null;
		
		BufferedReader br = null;
		BufferedWriter bw = null;
		
		String s = null;
	
		try{
			
			fr = new FileReader("c://myclass/figureinformation.txt");
			br = new BufferedReader(fr);
			fw = new FileWriter("c://myclass/figuremeasures.txt");
			bw = new BufferedWriter(fw);
			
			
			bw.write("Figure	Area	Perimeter");
			bw.newLine();
			
			while((s = br.readLine())!=null){
				String[] ss = s.split(" ");
				
					if(ss[0].equals("circle"))
					{
						Circle c = new Circle(Double.parseDouble(ss[1]));
						bw.write("Circle	" +Double.toString(c.measureArea())+ "	" +Double.toString(c.measurePerimeter()));
						bw.newLine();
					}
					else if(ss[0].equals("ellipse"))
					{
						Ellipse e = new Ellipse(Double.parseDouble(ss[1]),Double.parseDouble(ss[2]));
						bw.write("Ellipse	" +Double.toString(e.measureArea())+ "	" +Double.toString(e.measurePerimeter()));
						bw.newLine();
					}
					else if(ss[0].equals("rectangle"))
					{
						Rectangle r = new Rectangle(Double.parseDouble(ss[1]),Double.parseDouble(ss[2]));
						bw.write("rectangle	" +Double.toString(r.measureArea())+ "	" +Double.toString(r.measurePerimeter()));
						bw.newLine();
					}
					else if(ss[0].equals("triangle"))
					{
						Triangle t = new Triangle(Double.parseDouble(ss[1]),Double.parseDouble(ss[2]));
						bw.write("Triangle	" +Double.toString(t.measureArea())+ "	" +Double.toString(t.measurePerimeter()));
						bw.newLine();
					}
					else if(ss[0].equals("square"))
					{
						Square sq = new Square(Double.parseDouble(ss[1]));
						bw.write("Square	" +Double.toString(sq.measureArea())+ "	" +Double.toString(sq.measurePerimeter()));
						bw.newLine();
					}
					else{
						System.out.println(" Figure not found");
						System.out.println(s);
					}
				
				
			}
			

			fr.close();
			fw.close();
			br.close();
			bw.close();
		}
		catch(Exception e){
			e.printStackTrace();
		}
		

		
	}

}
