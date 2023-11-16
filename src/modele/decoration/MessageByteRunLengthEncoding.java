package modele.decoration;

import modele.Message;

import java.nio.charset.StandardCharsets;

public class MessageByteRunLengthEncoding extends DecorateurMessage {
    protected Message message;
    protected String code;

    public MessageByteRunLengthEncoding(Message message) {
        super();
        this.message = message;
        this.code = code(message.getContenu());
    }

    public String code(String contenu) {
        StringBuilder builder = new StringBuilder();
        byte[] bytes = contenu.getBytes(StandardCharsets.UTF_8);
        for (byte b : bytes) {
            builder.append(b);
        }
        return builder.toString();
    }
}

