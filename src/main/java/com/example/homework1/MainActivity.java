package com.example.homework1;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Switch switch1 = findViewById(R.id.switch1);
        final TextView txv = findViewById(R.id.txv);

        switch1.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View v) {
                    txv.setText("Please Enter Your Name.");
                }
        });
    }

    int size=30;

    public void bigger(View v){     // 按钮对应的onclick 响应
        TextView txv;
        txv= (TextView) findViewById(R.id.txv);  // 根据ID找到对应的text对象
        txv.setTextSize(++size);
    }

    public void smaller(View v){     // 按钮对应的onclick 响应
        TextView txv;
        txv= (TextView) findViewById(R.id.txv);  // 根据ID找到对应的text对象
        txv.setTextSize(--size);
    }

    public void display(View v){     // 另外一个按钮对应的onclick 响应
        EditText name= (EditText) findViewById(R.id.editText);  //根据ID找到对象
        TextView text2= (TextView) findViewById(R.id.txv);
        text2.setText(name.getText().toString());
    }

}
