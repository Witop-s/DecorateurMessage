package modele;

public class Message {
    private String contenu;
    private String auteur;

    public Message() {
    }

    public Message(String contenu) {
        this.contenu = contenu;
        this.auteur = "Anonyme";
    }

    public Message(String contenu, String auteur) {
        this.contenu = contenu;
        this.auteur = auteur;
    }

    public String getContenu() {
        return contenu;
    }

    public String getAuteur() {
        return auteur;
    }

    public void setContenu(String contenu) {
        this.contenu = contenu;
    }

    public void setAuteur(String auteur) {
        this.auteur = auteur;
    }
}
