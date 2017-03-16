/**
 * Created by mohammad on 3/12/17.
 */
public interface CryptoSystem {
    Object Encryption(Object message);
    Object Decryption(Object message);
    Object getKey();
    void setKey(Object key);
}
