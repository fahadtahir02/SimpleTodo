package com.example.to_dofinalversion;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class EditActivity extends AppCompatActivity {

    EditText efItem;
    Button btnSave;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit);

        efItem = findViewById(R.id.efItem);
        btnSave = findViewById(R.id.btnSave);

        getSupportActionBar().setTitle("Edit Item");

        efItem.setText(getIntent().getStringExtra(MainActivity.KEY_ITEM_TEXT));



        // saves when user is done editing
        btnSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //create intent to contain results
                Intent intent = new Intent();

                //passes edited results
                intent.putExtra(MainActivity.KEY_ITEM_TEXT, efItem.getText().toString());
                intent.putExtra(MainActivity.KEY_ITEM_POSITION, getIntent().getExtras().getInt(MainActivity.KEY_ITEM_POSITION));


                //set result of Intent
                setResult(RESULT_OK, intent);

                //finish Activity and return
                finish();


            }
        });

    }
}