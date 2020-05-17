import java.util.*;


public class Complex {
  int real;
  int imaginary;
  Complex()
  {

  }
  Complex(int realTemp, int realImaginary)
  {
      real = realTemp;
      imaginary = realImaginary;
  }
  static Complex addComplex(Complex c1, Complex c2)
  {
      Complex c = new Complex();
      c.real = c1.real + c2.real;
      c.imaginary = c1.imaginary + c2.imaginary;
      return c;
  }
  Complex subtractComplex(Complex c1, Complex c2)
  {
      Complex c = new Complex();
      c.real = c1.real - c2.real;
      c.imaginary = c1.imaginary - c2.imaginary;
      return c;
  }
  Complex multiplyComplex(Complex c1, Complex c2)
  {
      Complex c = new Complex();
      c.real = c1.real * c2.real;
      c.imaginary = c1.imaginary * c2.imaginary;
      return c;
  }
  public void printComplex()
  {
      System.out.println(real + "+" + "i" + imaginary);
  }
  public static void main(String[] args)
  {
      Complex temp = new Complex();
      temp.real = 5;
      temp.imaginary = 4;
      Complex temp1 = new Complex();
      temp1.real = 1;
      temp1.imaginary = 7;
      Complex sum = new Complex();
      sum = addComplex(temp,temp1);
      sum.printComplex();

  }


}
