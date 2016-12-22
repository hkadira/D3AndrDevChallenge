package org.neosoft.com.d3devchallenge;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class ActivityA extends AppCompatActivity {
    Spinner dropdown;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity);
        dropdown=(Spinner) findViewById(R.id.spinner);

        Toast.makeText(this,"Select option from the drop down",Toast.LENGTH_LONG).show();
    }

    public void display(View v){
        String selection= dropdown.getSelectedItem().toString();

        if(!selection.equals("Select an option")){
            TextView text=(TextView) findViewById(R.id.result);
            text.setText(selection);
        }
    }
}
