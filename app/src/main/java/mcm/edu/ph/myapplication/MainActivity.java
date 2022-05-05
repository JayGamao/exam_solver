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
        var1 = 2;
        var2 = 4;
        var3 = 6;
        var4 = 8;
        var5 = 10;


        ThirdClass op = new ThirdClass();
        ThirdClass op1 = new ThirdClass(var1, var2, var3,var4,var5);
        op1.Operation1(op1.var1, op1.var2, op1.var3, op1.var4);
        bleh.setText(String.valueOf(op1.var2));
    }
}