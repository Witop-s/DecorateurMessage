package modele.decoration;

import modele.Message;

public class MessageRunLengthEncoding extends DecorateurMessage {
    protected Message message;
    protected String code;

    public MessageRunLengthEncoding(Message message) {
        super();
        this.message = message;
        this.code = code(message.getContenu());
    }

    public String code(String contenu) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < contenu.length(); i++) {
            char lettre = contenu.charAt(i);
            int compteur = 1;
            while (i < contenu.length() - 1 && contenu.charAt(i + 1) == lettre) {
                compteur++;
                i++;
            }
            if (compteur > 1) builder.append(compteur);
            builder.append(lettre);
        }
        return builder.toString();
    }
}
