package com.example.projetoandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class tela_descricao_jindo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_descricao_jindo);

        ImageView imgJindo_femea = (ImageView) findViewById(R.id.imgJindo_femea);
        imgJindo_femea.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(tela_descricao_jindo.this, telaJindoFemea.class);
                startActivity(intent);
            }
        });

        TextView txtJindo_femea = (TextView) findViewById(R.id.txtJindo_femea);
        txtJindo_femea.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(tela_descricao_jindo.this, telaJindoFemea.class);
                startActivity(intent);
            }
        });

        ImageView imgJindo_macho = (ImageView) findViewById(R.id.imgJindo_macho);
        imgJindo_macho.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(tela_descricao_jindo.this, telaJindoMacho.class);
                startActivity(intent);
            }
        });

        TextView txtJindo_macho = (TextView) findViewById(R.id.txtJindo_macho);
        txtJindo_macho.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(tela_descricao_jindo.this, telaJindoMacho.class);
                startActivity(intent);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menuaction, menu);

        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId())
        {
            case R.id.paginaInicial:
                Intent pagInicial = new Intent(tela_descricao_jindo.this, telaRaca.class);
                startActivity(pagInicial);
                break;

            case R.id.labrador:
                Intent labrador = new Intent(tela_descricao_jindo.this, telaDescricaoLabrador.class);
                startActivity(labrador);
                break;

            case R.id.pastoralemao:
                Intent pastoralemao = new Intent(tela_descricao_jindo.this, telaDescricaoPastorAlemao.class);
                startActivity(pastoralemao);
                break;

            case R.id.buldogue:
                Intent buldogue = new Intent(tela_descricao_jindo.this, activityTelaDescricaoBuldogue.class);
                startActivity(buldogue);
                break;

            case R.id.poodle:
                Intent poodle = new Intent(tela_descricao_jindo.this, activityTelaDescricaoPoodle.class);
                startActivity(poodle);
                break;

            case R.id.chihuahua:
                Intent chihuahua = new Intent(tela_descricao_jindo.this, telaDescricaoChihuahua.class);
                startActivity(chihuahua);
                break;

            case R.id.pug:
                Intent pug = new Intent(tela_descricao_jindo.this, tela_descricao_pug.class);
                startActivity(pug);
                break;

            case R.id.jindo:
                Intent jindo = new Intent(tela_descricao_jindo.this, tela_descricao_jindo.class);
                startActivity(jindo);
                break;

        }
        return (super.onOptionsItemSelected(item));
    }
}