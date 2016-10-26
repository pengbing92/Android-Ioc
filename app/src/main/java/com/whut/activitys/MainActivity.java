package com.whut.activitys;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.whut.annotation.ContentView;
import com.whut.annotation.ViewInject;
import com.whut.utils.ViewInjectUtils;

@ContentView(value = R.layout.activity_main)
public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @ViewInject(R.id.id_btn1)
    private Button mBtn1;

    @ViewInject(R.id.id_btn2)
    private Button mBtn2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ViewInjectUtils.inject(this);

        mBtn1.setOnClickListener(this);
        mBtn2.setOnClickListener(this);


    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.id_btn1:
                Toast.makeText(this,"btn1",Toast.LENGTH_SHORT).show();
                break;
            case R.id.id_btn2:
                Toast.makeText(this,"btn2",Toast.LENGTH_SHORT).show();
        }
    }
}
