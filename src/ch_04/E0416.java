package ch_04;

// displays a random upper-case character


public class E0416 {
    public static void main(String[] args) {

        //Ascii characters A to Z are represented by numbers 65 to 90
        //So we need to generate a random number in range 65 to 90
        //And then print its char value

        int random = 65 + (int)(Math.random() * 26);

        System.out.println((char)(random));

    }

}
