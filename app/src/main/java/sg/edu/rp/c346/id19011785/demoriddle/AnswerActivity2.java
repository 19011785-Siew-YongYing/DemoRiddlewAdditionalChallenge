package sg.edu.rp.c346.id19011785.demoriddle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class AnswerActivity2 extends AppCompatActivity {

    TextView tvAns2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_answer2);

        tvAns2 = findViewById(R.id.ansView2);
        Intent i = getIntent();
        String ans = i.getStringExtra("Question");
        tvAns2.setText(ans + " Answer is: Gone");

    }
}