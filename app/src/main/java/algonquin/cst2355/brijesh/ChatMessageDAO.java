package algonquin.cst2355.brijesh;

import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;

import java.util.List;

public interface ChatMessageDAO {

    @Insert
    public void insertMessage(ChatMessage m);

    @Query( "Select * from ChatMessage")
    public List<ChatMessage> getAllMessages();

    @Delete
    public void deleteMessage(ChatMessage m);

    @Query("Delete from ChatMessage")
    void deleteAll();


}
