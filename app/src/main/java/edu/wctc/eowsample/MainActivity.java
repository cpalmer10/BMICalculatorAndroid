package edu.wctc.eowsample;

import android.icu.text.DecimalFormat;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

@RequiresApi(api = Build.VERSION_CODES.N)
public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    protected EditText in_weight;
    protected EditText in_height;
    protected Button in_button;
    protected TextView out_results;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        in_button = (Button) findViewById(R.id.button);
        in_button.setOnClickListener(this);
        in_weight = (EditText) findViewById(R.id.in_weight);
        in_height = (EditText) findViewById(R.id.in_height);
        out_results = (TextView) findViewById(R.id.out_bmi);

    }

    @Override
    public void onClick(View view){
        String weight = in_weight.getText().toString();
        String height = in_height.getText().toString();
        DecimalFormat numberFormat = new DecimalFormat("#.00");

        //add code


        double answer = (Double.parseDouble(weight) / Math.pow(Double.parseDouble(height), 2)) * 703;
        String results = "" + numberFormat.format(answer);
        out_results.setText(results);
    }
}
