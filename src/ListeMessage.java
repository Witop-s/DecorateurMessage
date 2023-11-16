import modele.Message;

import java.util.List;

public class ListeMessage {
    List<Message> messages;

    public void ajouterMessage() {
        messages.add(new Message("Hello !"));
    }
}
