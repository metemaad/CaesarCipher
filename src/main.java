import java.util.Scanner;

/**
 * Write a program that will take a message m (an integer) and key (e,n) – two integers, and
 * generate the ciphertext c (another integer), using the RSA algorithm. Use the examples in
 * question 1 above to test your program.
 * Created by mohammad on 3/12/17.
 */
public class main {

    public static void main(String[] args) {


        System.out.print("\n**************");
        System.out.print("\nCaesar cipher ");
        System.out.print("\n**************");
        Scanner scan2 = new Scanner(System.in);
        Caesar c = new Caesar();

        System.out.print("\nPlain text:");
        String m = scan2.nextLine();
        scan2 = new Scanner(System.in);

        System.out.print("\nplease enter a key number:");
        int key = scan2.nextInt();

        c.setKey(key);
        System.out.print("key: "+key+"\n");
        String Cipher= (String) c.Encryption(m);
        System.out.print("Encrypted text: "+Cipher+"\n");
        System.out.print("Decrypted text: "+c.Decryption(Cipher)+"\n");

    }
}
