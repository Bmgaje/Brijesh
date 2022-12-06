package algonquin.cst2355.brijesh;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

import algonquin.cst2355.brijesh.databinding.DetailsLayoutBinding;


public class MessageDetailsFragment extends Fragment {
    ChatMessage selected;
    public MessageDetailsFragment(ChatMessage m){
        selected=m;
    }
    @Override
    public View onCreateView( LayoutInflater inflater,  ViewGroup container,  Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);

        DetailsLayoutBinding binding= DetailsLayoutBinding.inflate(inflater);
        binding.messageText.setText(selected.message);
        binding.timeText.setText(selected.timeSent);
        binding.databaseId.setText("Id = "+selected.id );
        return binding.getRoot();
    }
}