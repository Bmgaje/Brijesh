package algonquin.cst2355.brijesh;
public class ChatMessage {

    String message;
    String timeSent;
    boolean isSentButton;

    void ChatRoom(String m, String t, boolean sent){
        message = m;
        timeSent = t;
        isSentButton = sent;
    }
}
