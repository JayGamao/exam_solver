package mcm.edu.ph.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int var1, var2, var3, var4 ,var5;    TextView bleh;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lol);
        bleh = findViewById(R.id.answer);

        bleh.setText(String.valueOf());
    }
}