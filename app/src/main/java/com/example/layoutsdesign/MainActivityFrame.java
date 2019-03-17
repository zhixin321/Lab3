package com.example.layoutsdesign;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivityFrame extends AppCompatActivity {
    TextView textViewFrame;
    EditText editTextFrame;
    Button buttonFrame;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_frame);

        textViewFrame = findViewById(R.id.textViewFrame);
        editTextFrame = findViewById(R.id.editTextFrame);
        buttonFrame = findViewById(R.id.buttonFrame);
    }

    public void fnGuess(View view)
    {
        String editTxt = editTextFrame.getText().toString();

        if(editTxt.equalsIgnoreCase(""))
        {

            textViewFrame.setError("Please fill the blank");
        }
        else if(editTxt.equals("frame"))
        {
            textViewFrame.setText("You are right!");
        }
        else
        {
            textViewFrame.setText("Opps!!! this is not a "+editTxt+" layout");
        }

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        getMenuInflater().inflate(R.menu.menulayout,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item)
    {
        int idMenu = item.getItemId();
        Intent intent = null;
        if(idMenu == R.id.linear)
        {
            intent = new Intent(this,MainActivityLinear.class);
        }
        else if(idMenu == R.id.relative)
        {
            intent = new Intent(this,MainActivityRelative.class);
        }
        else if(idMenu == R.id.constraint)
        {
            intent = new Intent(this,MainActivityConstraint.class);
        }
        else if(idMenu == R.id.table)
        {
            intent = new Intent(this,MainActivityTable.class);
        }
        else if(idMenu == R.id.frame)
        {
            intent = new Intent(this,MainActivityFrame.class);
        }
        else if(idMenu == R.id.absolute)
        {
            intent = new Intent(this,MainActivityAbsolute.class);
        }

        startActivity(intent);
        return super.onOptionsItemSelected(item);
    }
}
