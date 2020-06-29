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

public class telaDescricaoSamoieda extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_descricao_samoieda);

        ImageView imgSamoieda_femea = (ImageView) findViewById(R.id.imgSamoieda_femea);
        imgSamoieda_femea.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(telaDescricaoSamoieda.this, telaSamoiedaFemea.class);
                startActivity(intent);
            }
        });

        TextView txtSamoieda_femea = (TextView) findViewById(R.id.txtSamoieda_femea);
        txtSamoieda_femea.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(telaDescricaoSamoieda.this, telaSamoiedaFemea.class);
                startActivity(intent);
            }
        });

        ImageView imgSamoieda_macho = (ImageView) findViewById(R.id.imgSamoieda_macho);
        imgSamoieda_macho.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(telaDescricaoSamoieda.this, telaSamoiedaMacho.class);
                startActivity(intent);
            }
        });

        TextView txtSamoieda_macho = (TextView) findViewById(R.id.txtSamoieda_macho);
        txtSamoieda_macho.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(telaDescricaoSamoieda.this, telaSamoiedaMacho.class);
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
                Intent pagInicial = new Intent(telaDescricaoSamoieda.this, telaRaca.class);
                startActivity(pagInicial);
                break;

            case R.id.labrador:
                Intent labrador = new Intent(telaDescricaoSamoieda.this, telaDescricaoLabrador.class);
                startActivity(labrador);
                break;

            case R.id.pastoralemao:
                Intent pastoralemao = new Intent(telaDescricaoSamoieda.this, telaDescricaoPastorAlemao.class);
                startActivity(pastoralemao);
                break;

            case R.id.buldogue:
                Intent buldogue = new Intent(telaDescricaoSamoieda.this, activityTelaDescricaoBuldogue.class);
                startActivity(buldogue);
                break;

            case R.id.poodle:
                Intent poodle = new Intent(telaDescricaoSamoieda.this, activityTelaDescricaoPoodle.class);
                startActivity(poodle);
                break;

            case R.id.chihuahua:
                Intent chihuahua = new Intent(telaDescricaoSamoieda.this, telaDescricaoChihuahua.class);
                startActivity(chihuahua);
                break;

            case R.id.pug:
                Intent pug = new Intent(telaDescricaoSamoieda.this, tela_descricao_pug.class);
                startActivity(pug);
                break;

            case R.id.jindo:
                Intent jindo = new Intent(telaDescricaoSamoieda.this, tela_descricao_jindo.class);
                startActivity(jindo);
                break;

            case R.id.chowchow:
                Intent chowchow = new Intent(telaDescricaoSamoieda.this, telaDescricaoChowchow.class);
                startActivity(chowchow);
                break;

            case R.id.samoieda:
                Intent samoieda = new Intent(telaDescricaoSamoieda.this, telaDescricaoSamoieda.class);
                startActivity(samoieda);
                break;

        }
        return (super.onOptionsItemSelected(item));
    }
}