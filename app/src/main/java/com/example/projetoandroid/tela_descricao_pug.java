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

public class tela_descricao_pug extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_descricao_pug);

        ImageView imgPugFemea = (ImageView) findViewById(R.id.imgPug_femea);
        imgPugFemea.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(tela_descricao_pug.this, telaPugFemea.class);
                startActivity(intent);
            }
        });

        ImageView imgPugMacho = (ImageView) findViewById(R.id.imgPug_macho);
        imgPugMacho.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(tela_descricao_pug.this, tela_pug_macho.class);
                startActivity(intent);
            }
        });

        TextView txtPugFemea = (TextView) findViewById(R.id.txtPug_femea);
        txtPugFemea.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(tela_descricao_pug.this, telaPugFemea.class);
                startActivity(intent);
            }
        });

        TextView txtPugMacho = (TextView) findViewById(R.id.txtPug_macho);
        txtPugMacho.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(tela_descricao_pug.this, tela_pug_macho.class);
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
                Intent pagInicial = new Intent(tela_descricao_pug.this, telaRaca.class);
                startActivity(pagInicial);
                break;

            case R.id.labrador:
                Intent labrador = new Intent(tela_descricao_pug.this, telaDescricaoLabrador.class);
                startActivity(labrador);
                break;

            case R.id.pastoralemao:
                Intent pastoralemao = new Intent(tela_descricao_pug.this, telaDescricaoPastorAlemao.class);
                startActivity(pastoralemao);
                break;

            case R.id.buldogue:
                Intent buldogue = new Intent(tela_descricao_pug.this, activityTelaDescricaoBuldogue.class);
                startActivity(buldogue);
                break;

            case R.id.poodle:
                Intent poodle = new Intent(tela_descricao_pug.this, activityTelaDescricaoPoodle.class);
                startActivity(poodle);
                break;

            case R.id.chihuahua:
                Intent chihuahua = new Intent(tela_descricao_pug.this, telaDescricaoChihuahua.class);
                startActivity(chihuahua);
                break;

            case R.id.pug:
                Intent pug = new Intent(tela_descricao_pug.this, tela_descricao_pug.class);
                startActivity(pug);
                break;

            case R.id.jindo:
                Intent jindo = new Intent(tela_descricao_pug.this, tela_descricao_jindo.class);
                startActivity(jindo);
                break;

        }
        return (super.onOptionsItemSelected(item));
    }
}