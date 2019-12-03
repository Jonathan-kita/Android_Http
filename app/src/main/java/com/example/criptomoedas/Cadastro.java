package com.example.criptomoedas;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Locale;

public class Cadastro extends Activity {
 EditText edit_1,edit_2,edit_3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro);
        edit_1 = (EditText) findViewById(R.id.editText);
        edit_2 = (EditText) findViewById(R.id.editText2);
        edit_3 = (EditText) findViewById(R.id.editText3);
        edit_3.setEnabled(false);

        Locale mLocale = new Locale("pt", "BR");
        edit_2.addTextChangedListener(new Mask(edit_2, mLocale));

    }

    public void insertbd(View view) {



        BackgroundTask task = new BackgroundTask(this);

        task.execute("registro",edit_1.getText().toString(),edit_2.getText().toString());

        startActivity(new Intent(this,Ranking.class));

    }

}
