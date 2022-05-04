package sg.edu.rp.c346.id21030068.demosimpleclick;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    Button btnDisplay;
    EditText etInput;
    TextView tvDisplay;
    ToggleButton tbtn;
    RadioGroup rgGender;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnDisplay=findViewById(R.id.button1);
        etInput=findViewById(R.id.et1);
        tvDisplay=findViewById(R.id.tv1);
        tbtn=findViewById(R.id.toggleButtonEnabled);

        btnDisplay.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View View) {
                String txt = etInput.getText().toString();
                Toast.makeText(MainActivity.this, txt, Toast.LENGTH_LONG).show();

                tvDisplay.setText(txt);

            }
        });

        tbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (tbtn.isChecked()){
                    tbtn.setEnabled(true);

            }else{
                    tbtn.setEnabled(false);
                }




            }
        });

        btnDisplay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String stringResponse = etInput.getText().toString();
                String newTxt;

                int checkedRadioId = rgGender.getCheckedRadioButtonId();
                if(checkedRadioId == R.id.radioButtonGenderMale){
                    newTxt = "he says" + stringResponse;

                }
                else{
                    newTxt = "he says" + stringResponse;

                }
                tvDisplay.setText(newTxt);
            }
        });


    }
}