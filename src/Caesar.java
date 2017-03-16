/**
 * Created by mohammad on 3/12/17.
 */
public class Caesar implements CryptoSystem {

    private int key;
    String alphabet="abcdefghijklmnopqrstuvwxyz";

    public Caesar() {

    }

    @Override
    public Object Encryption(Object message) {

        String msg= (String) message;
        msg=msg.toLowerCase();


        String ret="";
        for (char c :msg.toCharArray() ) {
            char cp = 0;

            if(alphabet.contains(Character.toString(c)))
            {
                cp=(char)(((int)c+key-97)%26 + 97);
            }else
                {
                cp=c;
            }

            ret+=cp;

        }
        return ret;
    }


    @Override
    public Object Decryption(Object message) {
        String msg= (String) message;

        String ret="";
        for (char c :msg.toCharArray() ) {
            char cp = 0;


            if(alphabet.contains(Character.toString(c)))
            {
                cp=(char)(((int)c-key-97)%26 + 97);
            }else
            {
                cp=c;
            }

            ret+=cp;

        }
        return ret;
    }



    @Override
    public Object getKey() {
        return key;
    }

    @Override
    public void setKey(Object key) {

        this.key= (int) key;
    }
}
