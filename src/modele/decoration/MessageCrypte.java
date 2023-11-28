package modele.decoration;

import modele.Message;

public class MessageCrypte extends DecorateurMessage {
    protected Message message;
    protected String crypte;

    public MessageCrypte(Message message, int graine) {
        super();
        this.message = message;
        this.crypte = crypte(message.getContenu(), graine);
        super.code = this.crypte;
    }

    public String crypte(String contenu, int graine) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < contenu.length(); i++) {
            char lettre = contenu.charAt(i);

            if (lettre == ' ') {
                builder.append(lettre);
                continue;
            }

            char lettreSuivante = (char) ((int) lettre + graine);
            builder.append(lettreSuivante);
        }
        return builder.toString();
    }
}
