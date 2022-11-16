package algonquin.cst2355.brijesh;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

import algonquin.cst2355.brijesh.databinding.ActivityChatRoomBinding;
import algonquin.cst2355.brijesh.databinding.SentMassageBinding;

public class ChatRoom extends AppCompatActivity {

    ActivityChatRoomBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityChatRoomBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());



        class MyRowHolder extends RecyclerView.ViewHolder {

            TextView messageText;
            TextView timeText;

            public MyRowHolder(@NonNull View itemView) {
                super(itemView);
                messageText = itemView.findViewById(R.id.massage);
                timeText = itemView.findViewById(R.id.time);


                binding.recyclerView.setAdapter(new RecyclerView.Adapter<MyRowHolder>() {

                    ArrayList<ChatMessage> messages = new ArrayList<>();

                    @NonNull
                    @Override
                    public MyRowHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {SentMassageBinding.inflate(getLayoutInflater());
                        return new MyRowHolder( binding.getRoot());
                    }

                    @Override
                    public void onBindViewHolder(@NonNull MyRowHolder holder, int position) {
                        ChatMessage obj = messages.get(position);
                        holder.messageText.setText(obj.get);
                        holder.timeText.setText(obj.);

                    }

                    @Override
                    public int getItemCount() {
                        return messages.size();
                    }

                    @Override
                    public int getItemViewType(int position) {
                        return 0;
                    }
                });


            }
        }
}}