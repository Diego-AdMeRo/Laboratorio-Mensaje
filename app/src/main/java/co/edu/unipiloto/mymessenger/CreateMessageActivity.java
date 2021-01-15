package co.edu.unipiloto.mymessenger;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class CreateMessageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_message);


    }

    public void OnSendMessageExternal(View v){
        EditText txtEmail = (EditText) findViewById(R.id.email);
        EditText txtSubject = (EditText) findViewById(R.id.subject);
        EditText txtMessage = (EditText) findViewById(R.id.message);
        Intent receiveMessageActivity = new Intent(Intent.ACTION_SEND);
        receiveMessageActivity.setType("text/plain");
        receiveMessageActivity.putExtra(Intent.EXTRA_EMAIL, new String [] {txtEmail.getText().toString()});
        receiveMessageActivity.putExtra(Intent.EXTRA_SUBJECT, txtSubject.getText().toString());
        receiveMessageActivity.putExtra(Intent.EXTRA_TEXT, txtMessage.getText().toString());
        startActivity(Intent.createChooser(receiveMessageActivity,"Enviar Email"));
    }

    public void OnSendMessageInternal(View v){
        EditText txtEmail = (EditText) findViewById(R.id.email);
        EditText txtSubject = (EditText) findViewById(R.id.subject);
        EditText txtMessage = (EditText) findViewById(R.id.message);
        Intent receiveMessageActivity = new Intent(CreateMessageActivity.this, ReceiveMessageActivity.class);
        receiveMessageActivity.putExtra("Email", txtEmail.getText().toString());
        receiveMessageActivity.putExtra("Subject", txtSubject.getText().toString());
        receiveMessageActivity.putExtra("Message", txtMessage.getText().toString());
        startActivity(receiveMessageActivity);
    }

}