package OOP;

class Fraction{
    private int num;
    private int den;
    // Constructor
    Fraction(int num, int den){
        if (den == 0) {
            throw new ArithmeticException("Denominator cannot be zero");
        }
        this.num = num;
        this.den = den;
        simplify();
    }
    void print(){

        System.out.println(num+ " / "+den);
    }
    void add(Fraction f){
        this.num = num * f.den + den * f.num;
        this.den = den * f.den;
        simplify();
    }
    void sub(Fraction f){
        this.num = num * f.den - den * f.num;
        this.den = den * f.den;
        simplify();
    }
    void multiply(Fraction f){
        this.num = num * f.num;
        this.den = den * f.den;
        simplify();
    }
    void divide(Fraction f){
        if (f.num == 0) {
            throw new ArithmeticException("Cannot divide by zero fraction");
        }
        this.num = num * f.den;
        this.den = den * f.num;
        simplify();
    }
    void simplify(){
        boolean isNegative = (num * den < 0) ? true : false;
        num = Math.abs(num);
        den = Math.abs(den);
        int gcd = hcf(num,den);
        this.num = num/gcd;
        this.den = den/gcd;
        if(isNegative) {
            num = - num;
        }
    }
    int hcf( int a , int b){
        if(a==0) return b;
        return hcf(b%a , a);
    }
}
public class FractionClass {
    static void main(String[] args) {
      Fraction f1 = new Fraction(3,7);
      f1.print();
      Fraction f2 = new Fraction(0,9);
      f2.print();
      f1.add(f2);
      f1.print();
      f1.sub(f2);
      f1.print();
      f1.multiply(f2);
      f1.print();
      try {
          f1.divide(f2);
          f1.print();
      }
      catch (ArithmeticException e) {
          System.out.println(e.getMessage());
      }
      //System.out.println("Program continues...");
        Fraction f3 = null;
      try {
          f3 = new Fraction(7, 0);
          f3.print(); }
      catch (ArithmeticException e) {
          System.out.println(e.getMessage());
      }
    }
}
