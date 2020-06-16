package com.example.projetoandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class telaRaca extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_raca);

        ImageView imgRaca1 = (ImageView) findViewById(R.id.imgRaca1);
        imgRaca1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(telaRaca.this, telaDescricaoLabrador.class);
                startActivity(intent);
            }
        });

        TextView txtRaca1 = (TextView) findViewById(R.id.txtRaca1);
        txtRaca1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(telaRaca.this, telaDescricaoLabrador.class);
                startActivity(intent);
            }
        });

        ImageView imgRaca2 = (ImageView) findViewById(R.id.imgRaca2);
        imgRaca2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(telaRaca.this, telaDescricaoPastorAlemao.class);
                startActivity(intent);
            }
        });

        TextView txtRaca2 = (TextView) findViewById(R.id.txtRaca2);
        txtRaca2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(telaRaca.this, telaDescricaoPastorAlemao.class);
                startActivity(intent);
            }
        });

        ImageView imgRaca3 = (ImageView) findViewById(R.id.imgRaca3);
        imgRaca3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(telaRaca.this, telaDescricaoChihuahua.class);
                startActivity(intent);
            }
        });

        TextView txtRaca3 = (TextView) findViewById(R.id.txtRaca3);
        txtRaca3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(telaRaca.this, telaDescricaoChihuahua.class);
                startActivity(intent);
            }
        });


    }
}