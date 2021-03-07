package mcm.edu.ph.antonio_intent;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button next = findViewById(R.id.btnNext);

        next.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        EditText input = findViewById(R.id.txtMonthValue);

        Intent i = new Intent(MainActivity.this, Activity2.class);

        if (v.getId() == R.id.btnNext) {
            int numberMonths = Integer.parseInt(String.valueOf(input.getText()));

            i.putExtra("INT_MONTHS", numberMonths);
            startActivity(i);
        }
    }
}
