package lab2_5;

import java.io.Serializable;
//////////// Zrobione wspólnie przez Rafa³ Gosik i Juliusz Gryglewski ///////////////
public final class QuadraticFunction implements Serializable {

	public static QuadraticFunction of(final double a, final double b, final double c) {
		
		return new QuadraticFunction(a, b, c);
		
	}
	
	public double getA() {
		return a;
	}
	
	public double getB() {
		return b;
	}
	
	public double getC() {
		return c;
	}
	
	private QuadraticFunction(final double a, final double b, final double c) {
		
		this.a = a;
		this.b = b;
		this.c = c;
		if (a != 0) {
			final double delta = (b * b) - (4 * a * c);
			
			if (delta > 0) {
				x1.setRe((-b - Math.sqrt(delta)) / (2 * a));
				x2.setRe((-b + Math.sqrt(delta)) / (2 * a));
			} else if (delta == 0) {
				x1.setRe((-b) / (2 * a));
				x2.setRe((-b) / (2 * a));
			} else {
				x1.setRe(-b / 2 * a);
				x1.setIm( - (Math.sqrt(Math.abs(delta))) / 2*a );
				x2.setRe(-b / 2 * a);
				x2.setIm( (Math.sqrt(Math.abs(delta))) / 2*a );
			}
			
		} else{			
			if (b == 0)			
			{				
				throw new IllegalArgumentException("No x in function");				
			}			
			else{				
				x1.setRe( -c / b);
				x2.setRe( -c / b);
			}			
		}
	}
	
	private final double a;
	private final double b;
	private final double c;
	public Complex x1 = new Complex();
	public Complex x2 = new Complex();	

	
}