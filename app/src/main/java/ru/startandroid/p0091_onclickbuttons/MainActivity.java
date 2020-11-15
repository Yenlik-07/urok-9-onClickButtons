package ru.startandroid.p0091_onclickbuttons;

import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    TextView tvOut;
    Button btnOk;
    Button btnCancel;
    Button button3;
    /** Called when the activity is first created. */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvOut = (TextView) findViewById(R.id.tvOut);
        btnOk = (Button) findViewById(R.id.btnOk);
        btnCancel = (Button) findViewById(R.id.btnCancel);
        button3 = (Button) findViewById(R.id.button3);

        btnOk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvOut.setText("Нажата кнопка 1");
            }
        });
        btnCancel.setOnClickListener (this);

    }

    public void clickButton3(View view) {
        tvOut.setText("Нажата кнопка 3");
    }

    @Override
    public void onClick(View v) {
        tvOut.setText("Нажата кнопка 2");
    }
}