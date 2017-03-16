/**
 * Created by mohammad on 3/12/17.
 */
public class Vigenere implements CryptoSystem {

    private String key;
    @Override
    public Object Encryption(Object message) {
        String msg= (String) message;
            String res = "";
            msg = msg.toLowerCase();
            for (int i = 0, j = 0; i < msg.length(); i++) {
                char c = msg.charAt(i);
                if (c < 'a' || c > 'z') continue;
                res += (char)((c + key.charAt(j) - 2 * 'a') % 26 + 'a');
                j = ++j % key.length();
            }
            return res;


    }

    @Override
    public Object Decryption(Object message) {
        String msg= (String) message;

        String res = "";
        msg = msg.toLowerCase();
        for (int i = 0, j = 0; i < msg.length(); i++) {
            char c = msg.charAt(i);
            if (c < 'a' || c > 'z') continue;
            res += (char)((c - key.charAt(j) + 26) % 26 + 'a');
            j = ++j % key.length();
        }
        return res;
    }

    @Override
    public Object getKey() {
        return key;
    }

    @Override
    public void setKey(Object key) {
        this.key= (String) key;

    }
}
