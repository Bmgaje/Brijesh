package algonquin.cst2355.brijesh;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import algonquin.cst2355.brijesh.databinding.ActivityChatRoomBinding;
import algonquin.cst2355.brijesh.databinding.SentMassageBinding;

public class ChatRoom extends AppCompatActivity {

    ActivityChatRoomBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityChatRoomBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.recyclerView.setAdapter(new RecyclerView.Adapter<>() {

            @NonNull
            @Override
            public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
                SentMassageBinding binding = SentMassageBinding.inflate(getLayoutInflater());
                return null;
            }

            @Override
            public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {

            }

            @Override
            public int getItemCount() {
                return 0;
            }
        });

        class MyRowHolder extends RecyclerView.ViewHolder{

            TextView messageText;
            TextView timeText;

            public MyRowHolder(@NonNull View itemView){
                super(itemView);
                messageText = itemView.findViewById(R.id.massage);
                timeText = itemView.findViewById(R.id.time);
            }
        }
    }
}