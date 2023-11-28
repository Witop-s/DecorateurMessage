package modele.decoration;

import modele.Message;

public class MessageInverse extends DecorateurMessage {
    protected Message message;
    protected String inverse;

    public MessageInverse(Message message) {
        super();
        this.message = message;
        this.inverse = inverse(message.getContenu());
        super.code = this.inverse;
    }

    public String inverse(String contenu) {
        return new StringBuilder(contenu).reverse().toString();
    }
}
