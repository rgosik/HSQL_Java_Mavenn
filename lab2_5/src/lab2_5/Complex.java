package lab2_5;

import java.util.Objects;

public class Complex {
	
	double re;
	double im;
	
	public Complex(double real, double imag) {
		re = real;
		im = imag;
	}
	public Complex() {}
	
	double getRe() {
		return re;
	}
	void setRe(double re) {
		this.re = re;
	}
	
	double getIm() {
		return im;
	}
	
	void setIm(double im) {
		this.im = im;
	}	
}