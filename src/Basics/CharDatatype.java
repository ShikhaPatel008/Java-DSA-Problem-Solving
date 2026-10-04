package Basics;

public class CharDatatype {
    static void main(String[] args) {
        char c = 'A';
        int y= c; //implicit typecasting
        System.out.println(y);

        char ch = 'a';
        int x= (int) ch; //explicit typecasting
        System.out.println(x);

        char num = '3';
        System.out.println((int) num);

        char something = 'b';
        System.out.println(something + 0); // kisi bhi character ki ASCII value = (character name + 0) OR (character name * 1)

        char good = 65;
        System.out.println((char)good);

    }
}
