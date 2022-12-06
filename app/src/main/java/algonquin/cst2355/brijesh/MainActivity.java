package algonquin.cst2355.brijesh;






import android.arch.lifecycle.ViewModelProvider;
import android.os.Bundle;

import android.support.v7.app.AppCompatActivity;
import android.view.View;

import android.widget.TextView;
import android.widget.Toast;

    public class MainActivity extends AppCompatActivity {
        private ActivityMainBinding variableBinding;
        private MainViewModel model;

        //  Button mybutton = mybutton.findViewById(R.id.mybutton);

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);


            model = new ViewModelProvider(this).get(MainViewModel.class);

            variableBinding = ActivityMainBinding.inflate(getLayoutInflater());
            setContentView(binding.getRoot());
            TextView textView = variableBinding.textview;


            variableBinding.myText.setText(model.editString);
            variableBinding.mybutton.setOnClickListerner(click ->
                    {
                        model.editString.postValue(variableBinding.myedittext.getText().toString());
                        variableBinding.myText.setText(" your edit text has: " + model.editString);
                    }
            );
            model.editString.observe(this, s -> {
                        variableBinding.myText.setText("your edit text has " + s);
                    }
            );
            //model.isSelected.


            mybutton.setOnClickListener(vw -> mytext.text = "Your edit text has:  $editString");


            variableBinding.imageButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Toast.makeText(MainActivity.this, "Image view height : " + variableBinding.imageView.getHeight() + ". Image view width : " + variableBinding.imageView.getWidth(), Toast.LENGTH_SHORT).show();
                }
            });

        }

        //    private ActivityMainBinding binding;
        //       @Override
//        protected void onCreate(Bundle savedInstanceState) {
//            super.onCreate(savedInstanceState);
//            setContentView(R.layout.activity_main);
//        binding = ActivityMainBinding.inflate(getLayoutInflater());
//        setContentView(binding.getRoot());
//        TextView textView = binding.textview;
//
//        binding.myButton.setOnClickListener(new View.OnClickListener() {
//            public void onClick(View v) {
//                textView.setText("Welcome to Cst3463");
//                String editString = binding.myedittext.getText().toString();
//                textView.setText("Your edit text has:  " + editString);
//
//            }
//        });
//
//        binding.imageButton.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Toast.makeText(MainActivity.this, "Image view height : "+binding.imageView.getHeight() + ". Image view width : "+binding.imageView.getWidth(), Toast.LENGTH_SHORT).show();
//            }
//        });
//
//        binding.radioButton.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
//            @Override
//            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
//                Toast.makeText(MainActivity.this, "Radio button status is: "+b, Toast.LENGTH_SHORT).show();
//            }
//        });
//
//
//        binding.switchButton.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
//            @Override
//            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
//                if(b==true){
//                    Toast.makeText(MainActivity.this, "Switch button status is selected.", Toast.LENGTH_SHORT).show();
//                }else{
//                    Toast.makeText(MainActivity.this, "Switch button status is not selected.", Toast.LENGTH_SHORT).show();
//                }
//            }
//        });
 //       }
  }


