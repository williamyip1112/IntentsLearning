package com.example.per2.intentslearning;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class SendMessageActivity extends AppCompatActivity {
    private Button buttonSend;
    private EditText editTextmessage;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_send_message);
        wireWidgets();
        buttonSend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //get the text from the edittext
                String message = editTextmessage.getText().toString();
                //create an intent
                Intent intentSendMessage = new Intent(SendMessageActivity.this, ReceiveMessageActivity.class);
                //package the text into the intent
                intentSendMessage.putExtra("themessage", message);

                //start the new activity
                startActivity(intentSendMessage);
            }
        });
    }

    private void wireWidgets() {
        buttonSend = findViewById(R.id.button_main_send);
        editTextmessage = findViewById(R.id.edittext_sendmessage_msg);


    }
}
