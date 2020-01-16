package com.example.test.myapplication;

import android.app.Dialog;
import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    private EditText editTex;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.btnCommit).setOnClickListener(this);

        findViewById(R.id.btnCommit2).setOnClickListener(this);

        findViewById(R.id.btnCommit3).setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btnCommit:
                LayoutInflater inflater = LayoutInflater.from(MainActivity.this);
                View view1 = inflater.inflate(R.layout.editbox_layout, null);
                editTex = (EditText) view1.findViewById(R.id.editText1);
                editTex.setHint("请输入");
                AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                builder.setTitle("信息");
                builder.setView(view1);
                builder.setPositiveButton("确定", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {

                                Toast.makeText(MainActivity.this, editTex.getText().toString(), Toast.LENGTH_SHORT).show();
                               // Toast.makeText(MainActivity.this, "11", Toast.LENGTH_SHORT).show();
                            }
                        }) ;
                builder.create().show();


                break;


        }

    }
}
