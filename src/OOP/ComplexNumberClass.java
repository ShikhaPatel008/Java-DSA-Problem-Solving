package OOP;
class ComplexNumber{
    double x;
    double y;
    ComplexNumber(double x , double y){
        this.x = x;
        this.y = y;
    }
    ComplexNumber(){}
    void print(){
        if(y>0) System.out.println(x+ "+"+y+"i");
        else System.out.println(x+"-"+(-y)+"i");
    }

    public void add(ComplexNumber z) {
        this.x += z.x;
        this.y += z.y;
    }

    public void sub(ComplexNumber z) {
        this.x -= z.x;
        this.y -= z.y;
    }

    public void multiply(ComplexNumber z) {
        this.x = x*z.x - y*z.y;
        this.y = x*z.y + y*z.x;
    }

    public void divide(ComplexNumber z) {
        this.x = (x*z.x + y*z.y) / (z.x*z.x + z.y*z.y);
        this.y = (y*z.x - x*z.y) / (z.x*z.x + z.y*z.y);
    }
}

public class ComplexNumberClass {
    static void main(String[] args) {
        ComplexNumber z1 = new ComplexNumber(2, -5);
        ComplexNumber z2 = new ComplexNumber(2, 5);
        z1.print();
        z2.print();
        z1.add(z2);
        z1.print();
        z2.print();
        z1.sub(z2);
        z1.print();
        z2.print();
        z2.multiply(z1);
        z1.print();
        z2.print();
        z2.divide(z1);
        z1.print();
        z2.print();
    }

}
