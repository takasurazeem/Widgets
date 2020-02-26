package com.aptech.widgets;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    final String TAG = "MainActivityTesting";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = findViewById(R.id.button);
        button.setClickable(false);

        CheckBox checkBox = findViewById(R.id.checkBox2);
        checkBox.setClickable(false);
        if (checkBox.isChecked()) {
            EditText et = findViewById(R.id.editText);
            et.setText(checkBox.getText());
        }
    }


    public void buttonClicked(View view) {
        Log.d(TAG, "buttonClicked: was clicked");
    }

    public void checkBoxClicked(View view) {
        CheckBox checkBox = (CheckBox) view;
        EditText et = findViewById(R.id.editText);
        if (checkBox.isChecked()) {
            et.setText(checkBox.getText());
        } else {
            et.setText("");
        }
    }

    public void whichEverButtonWasClicked(View radioButton) {
        if (radioButton.getId() == R.id.male) {
            Toast.makeText(this, "Male was clcicked", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(this, "Female was clcicked", Toast.LENGTH_SHORT).show();
        }
    }
}
