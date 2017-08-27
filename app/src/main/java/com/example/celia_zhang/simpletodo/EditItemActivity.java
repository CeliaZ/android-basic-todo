package com.example.celia_zhang.simpletodo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import static android.widget.TextView.BufferType.EDITABLE;

public class EditItemActivity extends AppCompatActivity {
    EditText editText;
    String originalContent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_item);
        editText = (EditText) findViewById(R.id.editText);

        originalContent = getIntent().getStringExtra("original_content");
        editText.setText(originalContent, EDITABLE);
    }

    public void onUpdateItem(View v) {
        Intent data = new Intent();
        data.putExtra("updated_content", editText.getText().toString());
        // Activity finished ok, return the data
        setResult(RESULT_OK, data); // set result code and bundle data for response
        this.finish(); // closes the activity, pass data to parent
    }
}
