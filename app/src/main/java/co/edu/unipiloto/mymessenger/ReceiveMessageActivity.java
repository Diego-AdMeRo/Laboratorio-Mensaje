package co.edu.unipiloto.mymessenger;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class ReceiveMessageActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_receive_message);

        TextView email = (TextView) findViewById(R.id.email);
        email.setText(getIntent().getStringExtra("Email"));
        TextView subject = (TextView) findViewById(R.id.subject);
        subject.setText(getIntent().getStringExtra("Subject"));
        TextView message = (TextView) findViewById(R.id.message);
        message.setText(getIntent().getStringExtra("Message"));

    }
}