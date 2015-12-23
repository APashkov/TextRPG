package com.example.artem.textrpg;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Editable;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void onClick(View v) {

        View commandTextEditView = findViewById(R.id.commandText);
        EditText commandTextEdit = (EditText)commandTextEditView;

        Editable commandText = commandTextEdit.getText();
        TextView consoleTextView = (TextView)findViewById(R.id.consoleText);
        consoleTextView.setText(commandText);
    }
}
