package modele.decoration;

import modele.Message;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;

public class MessageHash256 extends DecorateurMessage {
    protected Message message;
    protected String hash;

    public MessageHash256(Message message) {
        super();
        this.message = message;
        this.hash = hash(message.getContenu());
    }

    public String hash(final String contenu) {
        try{
            final MessageDigest digest = MessageDigest.getInstance("SHA-256");
            final byte[] hash = digest.digest(contenu.getBytes(StandardCharsets.UTF_8));
            final StringBuilder hexString = new StringBuilder();
            for (byte b : hash) {
                final String hex = Integer.toHexString(0xff & b);
                if (hex.length() == 1)
                    hexString.append('0');
                hexString.append(hex);
            }
            return hexString.toString();
        } catch(Exception ex){
            throw new RuntimeException(ex);
        }
    }
}
