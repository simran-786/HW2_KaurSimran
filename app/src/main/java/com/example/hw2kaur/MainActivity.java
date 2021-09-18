package com.example.hw2kaur;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{

    private EditText hugeInt1ET;
    private EditText hugeInt2ET;
    private TextView answertv;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.hugeInt1ET = (EditText)this.findViewById(R.id.hugeInt1ET);
        this.hugeInt2ET = (EditText)this.findViewById(R.id.hugeInt2ET);
        this.answertv = (TextView)this.findViewById(R.id.answertv);
    }

    public void onAddNumbersButtonPressed(View v)
    {
        HugeInteger hugeInt1 = new HugeInteger(this.hugeInt1ET.getText().toString());
        HugeInteger hugeInt2 = new HugeInteger(this.hugeInt2ET.getText().toString());
        HugeInteger answer = hugeInt1.add(hugeInt2);
        this.answertv.setText(answer.toString());
    }
}