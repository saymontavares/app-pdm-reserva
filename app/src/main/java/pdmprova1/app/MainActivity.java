package pdmprova1.app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText EditUsuario;
    private EditText EditSenha;
    private Button btnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditUsuario = findViewById(R.id.EditUsuario);
        EditSenha = findViewById(R.id.EditSenha);
        btnLogin = findViewById(R.id.btnLogin);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (EditUsuario.getText().toString().isEmpty()) {
                    EditUsuario.requestFocus();
                    EditUsuario.setError("Preencha o campo!");
                } else if (EditSenha.getText().toString().isEmpty()) {
                    EditSenha.requestFocus();
                    EditSenha.setError("Preencha o campo!");
                } else {
                    if (EditUsuario.getText().toString().trim().equals("Administrador") && EditSenha.getText().toString().trim().equals("Administrador")) {
                        startActivity(new Intent(MainActivity.this, ReservarMesasActivity.class));
                    } else if (EditUsuario.getText().toString().trim().equals("Adm") && EditSenha.getText().toString().trim().equals("Adm123")) {
                        startActivity(new Intent(MainActivity.this, ReservarMesasActivity.class));
                    } else if (EditUsuario.getText().toString().trim().equals("Administrator") && EditSenha.getText().toString().trim().equals("Que3B1eng4ElT0r0")) {
                        startActivity(new Intent(MainActivity.this, ReservarMesasActivity.class));
                    } else if (EditUsuario.getText().toString().trim().equals("Root") && EditSenha.getText().toString().trim().equals("pr0m1uscu0")) {
                        startActivity(new Intent(MainActivity.this, ReservarMesasActivity.class));
                    } else {
                        Toast.makeText(MainActivity.this, "Usuário e/ou Senha incorreto!", Toast.LENGTH_LONG ).show();
                    }
                }
            }
        });
    }
}