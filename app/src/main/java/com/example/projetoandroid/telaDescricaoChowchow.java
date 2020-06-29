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

public class telaDescricaoChowchow extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_descricao_chowchow);

        ImageView imgChowchow_femea = (ImageView) findViewById(R.id.imgChowchow_femea);
        imgChowchow_femea.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(telaDescricaoChowchow.this, telaChowchowFemea.class);
                startActivity(intent);
            }
        });

        TextView txtChowchow_femea = (TextView) findViewById(R.id.txtChowchow_femea);
        txtChowchow_femea.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(telaDescricaoChowchow.this, telaChowchowFemea.class);
                startActivity(intent);
            }
        });

        ImageView imgChowchow_macho = (ImageView) findViewById(R.id.imgChowchow_macho);
        imgChowchow_macho.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(telaDescricaoChowchow.this, telaChowchowMacho.class);
                startActivity(intent);
            }
        });

        TextView txtChowchow_macho = (TextView) findViewById(R.id.txtChowchow_macho);
        txtChowchow_macho.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(telaDescricaoChowchow.this, telaChowchowMacho.class);
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
                Intent pagInicial = new Intent(telaDescricaoChowchow.this, telaRaca.class);
                startActivity(pagInicial);
                break;

            case R.id.labrador:
                Intent labrador = new Intent(telaDescricaoChowchow.this, telaDescricaoLabrador.class);
                startActivity(labrador);
                break;

            case R.id.pastoralemao:
                Intent pastoralemao = new Intent(telaDescricaoChowchow.this, telaDescricaoPastorAlemao.class);
                startActivity(pastoralemao);
                break;

            case R.id.buldogue:
                Intent buldogue = new Intent(telaDescricaoChowchow.this, activityTelaDescricaoBuldogue.class);
                startActivity(buldogue);
                break;

            case R.id.poodle:
                Intent poodle = new Intent(telaDescricaoChowchow.this, activityTelaDescricaoPoodle.class);
                startActivity(poodle);
                break;

            case R.id.chihuahua:
                Intent chihuahua = new Intent(telaDescricaoChowchow.this, telaDescricaoChihuahua.class);
                startActivity(chihuahua);
                break;

            case R.id.pug:
                Intent pug = new Intent(telaDescricaoChowchow.this, tela_descricao_pug.class);
                startActivity(pug);
                break;

            case R.id.jindo:
                Intent jindo = new Intent(telaDescricaoChowchow.this, tela_descricao_jindo.class);
                startActivity(jindo);
                break;

            case R.id.chowchow:
                Intent chowchow = new Intent(telaDescricaoChowchow.this, telaDescricaoChowchow.class);
                startActivity(chowchow);
                break;

            case R.id.samoieda:
                Intent samoieda = new Intent(telaDescricaoChowchow.this, telaDescricaoSamoieda.class);
                startActivity(samoieda);
                break;

        }
        return (super.onOptionsItemSelected(item));
    }
}