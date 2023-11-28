import modele.Message;
import modele.decoration.*;

public class Main {
    public static void main(String[] args) {
        Message message = new Message("Hello !");
        System.out.println(message.getContenu());

        Message messageCrypte = new MessageCrypte(message, 3);
        System.out.println(messageCrypte.getContenu());

        Message messageInverse = new MessageInverse(messageCrypte);
        System.out.println(messageInverse.getContenu());

        Message messageHash = new MessageHash256(messageInverse);
        System.out.println(messageHash.getContenu());

        Message messageHash2 = new MessageHash256(messageHash);
        System.out.println(messageHash2.getContenu());

        Message messageRunLengthEncoding = new MessageRunLengthEncoding(message);
        System.out.println(messageRunLengthEncoding.getContenu());
    }
}