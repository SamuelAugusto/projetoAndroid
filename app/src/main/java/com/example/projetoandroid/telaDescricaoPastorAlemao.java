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

public class telaDescricaoPastorAlemao extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_descricao_pastor_alemao);

        ImageView imgPastorAlemaoFemea = (ImageView) findViewById(R.id.imgPastorAlemao_femea);
        imgPastorAlemaoFemea.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(telaDescricaoPastorAlemao.this, telaPastoralemaoFemea.class);
                startActivity(intent);
            }
        });

        ImageView imgPastorAlemaoMacho = (ImageView) findViewById(R.id.imgPastorAlemao_macho);
        imgPastorAlemaoMacho.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(telaDescricaoPastorAlemao.this, telaPastoralemaoMacho.class);
                startActivity(intent);
            }
        });

        TextView txtPastorAlemaoFemea = (TextView) findViewById(R.id.txtPastorAlemao_femea);
        txtPastorAlemaoFemea.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(telaDescricaoPastorAlemao.this, telaPastoralemaoFemea.class);
                startActivity(intent);
            }
        });

        TextView txtPastorAlemaoMacho = (TextView) findViewById(R.id.txtPastorAlemao_macho);
        txtPastorAlemaoMacho.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(telaDescricaoPastorAlemao.this, telaPastoralemaoMacho.class);
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
                Intent pagInicial = new Intent(telaDescricaoPastorAlemao.this, telaRaca.class);
                startActivity(pagInicial);
                break;

            case R.id.labrador:
                Intent labrador = new Intent(telaDescricaoPastorAlemao.this, telaDescricaoLabrador.class);
                startActivity(labrador);
                break;

            case R.id.pastoralemao:
                Intent pastoralemao = new Intent(telaDescricaoPastorAlemao.this, telaDescricaoPastorAlemao.class);
                startActivity(pastoralemao);
                break;

            case R.id.buldogue:
                Intent buldogue = new Intent(telaDescricaoPastorAlemao.this, activityTelaDescricaoBuldogue.class);
                startActivity(buldogue);
                break;

            case R.id.poodle:
                Intent poodle = new Intent(telaDescricaoPastorAlemao.this, activityTelaDescricaoPoodle.class);
                startActivity(poodle);
                break;

            case R.id.chihuahua:
                Intent chihuahua = new Intent(telaDescricaoPastorAlemao.this, telaDescricaoChihuahua.class);
                startActivity(chihuahua);
                break;

            case R.id.pug:
                Intent pug = new Intent(telaDescricaoPastorAlemao.this, tela_descricao_pug.class);
                startActivity(pug);
                break;

            case R.id.jindo:
                Intent jindo = new Intent(telaDescricaoPastorAlemao.this, tela_descricao_jindo.class);
                startActivity(jindo);
                break;

        }
        return (super.onOptionsItemSelected(item));
    }
}