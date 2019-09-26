package br.com.etecia.appops;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar = findViewById(R.id.idToolBar);
        setSupportActionBar(toolbar);

        getSupportActionBar() .setDisplayHomeAsUpEnabled(true);
        getSupportActionBar() .setIcon(R.drawable.ic_ac);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.menu_principal,menu);

        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()) {
            case R.id.mCadastrar:
                startActivity(new Intent(getApplicationContext(), JanelaDois.class));
                Toast.makeText(getApplicationContext(), "Cliquei no Cadastrar", Toast.LENGTH_SHORT).show();
                break;
            case R.id.mAlterar:
                Toast.makeText(getApplicationContext(), "Cliquei no Alterar", Toast.LENGTH_SHORT).show();
                break;
            case R.id.mExcluir:
                Toast.makeText(getApplicationContext(), "Cliquei no Excluir", Toast.LENGTH_SHORT).show();
                break;
            case R.id.mPesquisar:
                Toast.makeText(getApplicationContext(), "Cliquei no Pesquisar", Toast.LENGTH_SHORT).show();
                break;
        }

        return true;
    }
}
