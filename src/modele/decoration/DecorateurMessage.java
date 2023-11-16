package modele.decoration;

import modele.Message;

public class DecorateurMessage extends Message {
    protected Message message;
    protected String code;

    public DecorateurMessage() {
    }

    public DecorateurMessage(Message message) {
        super();
        this.message = message;
        this.code = code(message.getContenu());
    }

    public String code(String contenu) {
        return contenu;
    }

    public String getContenu() {
        return code;
    }

    public String getAuteur() {
        return message.getAuteur();
    }

    public void setContenu(String contenu) {
        message.setContenu(contenu);
    }

    public void setAuteur(String auteur) {
        message.setAuteur(auteur);
    }
}
