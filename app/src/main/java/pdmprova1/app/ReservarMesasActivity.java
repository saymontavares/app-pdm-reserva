package pdmprova1.app;

import android.content.SharedPreferences;
import android.os.Build;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.core.view.ViewCompat;

public class ReservarMesasActivity extends AppCompatActivity {

    private Button BtnReservar1;
    private Button BtnReservar2;
    private Button BtnReservar3;
    private Button BtnReservar4;
    private Button BtnReservar5;
    private Button BtnReservar6;
    private Button BtnReservar7;
    private Button BtnReservar8;
    private Button BtnReservar9;
    private Button BtnLiberarMesa;
    private Button BtnSalvarOperacao;
    private Button BtnReservarTodasMesas;
    private EditText InputNumLiberaMesa;

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reservar_mesas);

        BtnReservar1 = findViewById(R.id.btn_reservar_1);
        BtnReservar2 = findViewById(R.id.btn_reservar_2);
        BtnReservar3 = findViewById(R.id.btn_reservar_3);
        BtnReservar4 = findViewById(R.id.btn_reservar_4);
        BtnReservar5 = findViewById(R.id.btn_reservar_5);
        BtnReservar6 = findViewById(R.id.btn_reservar_6);
        BtnReservar7 = findViewById(R.id.btn_reservar_7);
        BtnReservar8 = findViewById(R.id.btn_reservar_8);
        BtnReservar9 = findViewById(R.id.btn_reservar_9);
        BtnLiberarMesa = findViewById(R.id.btn_liberar_mesa);
        BtnSalvarOperacao = findViewById(R.id.BtnSalvarOperacao);
        BtnReservarTodasMesas = findViewById(R.id.BtnReservarTodasMesas);
        InputNumLiberaMesa = findViewById(R.id.inputNumLiberaMesa);

        // load
        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(ReservarMesasActivity.this);
        BtnReservar1.setEnabled(preferences.getBoolean("mesa_1", false));
        BtnReservar1.setBackgroundTintList(ContextCompat.getColorStateList(ReservarMesasActivity.this, preferences.getBoolean("mesa_1", false) == false ? R.color.vermelho_claro : R.color.azul_btn_reservar));
        BtnReservar2.setEnabled(preferences.getBoolean("mesa_2", false));
        BtnReservar2.setBackgroundTintList(ContextCompat.getColorStateList(ReservarMesasActivity.this, preferences.getBoolean("mesa_2", false) == false ? R.color.vermelho_claro : R.color.azul_btn_reservar));
        BtnReservar3.setEnabled(preferences.getBoolean("mesa_3", false));
        BtnReservar3.setBackgroundTintList(ContextCompat.getColorStateList(ReservarMesasActivity.this, preferences.getBoolean("mesa_3", false) == false ? R.color.vermelho_claro : R.color.azul_btn_reservar));
        BtnReservar4.setEnabled(preferences.getBoolean("mesa_4", false));
        BtnReservar4.setBackgroundTintList(ContextCompat.getColorStateList(ReservarMesasActivity.this, preferences.getBoolean("mesa_4", false) == false ? R.color.vermelho_claro : R.color.azul_btn_reservar));
        BtnReservar5.setEnabled(preferences.getBoolean("mesa_5", false));
        BtnReservar5.setBackgroundTintList(ContextCompat.getColorStateList(ReservarMesasActivity.this, preferences.getBoolean("mesa_5", false) == false ? R.color.vermelho_claro : R.color.azul_btn_reservar));
        BtnReservar6.setEnabled(preferences.getBoolean("mesa_6", false));
        BtnReservar6.setBackgroundTintList(ContextCompat.getColorStateList(ReservarMesasActivity.this, preferences.getBoolean("mesa_6", false) == false ? R.color.vermelho_claro : R.color.azul_btn_reservar));
        BtnReservar7.setEnabled(preferences.getBoolean("mesa_7", false));
        BtnReservar7.setBackgroundTintList(ContextCompat.getColorStateList(ReservarMesasActivity.this, preferences.getBoolean("mesa_7", false) == false ? R.color.vermelho_claro : R.color.azul_btn_reservar));
        BtnReservar8.setEnabled(preferences.getBoolean("mesa_8", false));
        BtnReservar8.setBackgroundTintList(ContextCompat.getColorStateList(ReservarMesasActivity.this, preferences.getBoolean("mesa_8", false) == false ? R.color.vermelho_claro : R.color.azul_btn_reservar));
        BtnReservar9.setEnabled(preferences.getBoolean("mesa_9", false));
        BtnReservar9.setBackgroundTintList(ContextCompat.getColorStateList(ReservarMesasActivity.this, preferences.getBoolean("mesa_9", false) == false ? R.color.vermelho_claro : R.color.azul_btn_reservar));


        BtnReservar1.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
            @Override
            public void onClick(View v) {
                BtnReservar1.setBackgroundTintList(ContextCompat.getColorStateList(ReservarMesasActivity.this, R.color.vermelho_claro));
                BtnReservar1.setEnabled(false);
            }
        });

        BtnReservar2.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
            @Override
            public void onClick(View v) {
                BtnReservar2.setBackgroundTintList(ContextCompat.getColorStateList(ReservarMesasActivity.this, R.color.vermelho_claro));
                BtnReservar2.setEnabled(false);
            }
        });

        BtnReservar3.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
            @Override
            public void onClick(View v) {
                BtnReservar3.setBackgroundTintList(ContextCompat.getColorStateList(ReservarMesasActivity.this, R.color.vermelho_claro));
                BtnReservar3.setEnabled(false);
            }
        });

        BtnReservar4.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
            @Override
            public void onClick(View v) {
                BtnReservar4.setBackgroundTintList(ContextCompat.getColorStateList(ReservarMesasActivity.this, R.color.vermelho_claro));
                BtnReservar4.setEnabled(false);
            }
        });

        BtnReservar5.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
            @Override
            public void onClick(View v) {
                BtnReservar5.setBackgroundTintList(ContextCompat.getColorStateList(ReservarMesasActivity.this, R.color.vermelho_claro));
                BtnReservar5.setEnabled(false);
            }
        });

        BtnReservar6.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
            @Override
            public void onClick(View v) {
                BtnReservar6.setBackgroundTintList(ContextCompat.getColorStateList(ReservarMesasActivity.this, R.color.vermelho_claro));
                BtnReservar6.setEnabled(false);
            }
        });

        BtnReservar7.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
            @Override
            public void onClick(View v) {
                BtnReservar7.setBackgroundTintList(ContextCompat.getColorStateList(ReservarMesasActivity.this, R.color.vermelho_claro));
                BtnReservar7.setEnabled(false);
            }
        });

        BtnReservar8.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
            @Override
            public void onClick(View v) {
                BtnReservar8.setBackgroundTintList(ContextCompat.getColorStateList(ReservarMesasActivity.this, R.color.vermelho_claro));
                BtnReservar8.setEnabled(false);
            }
        });

        BtnReservar9.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
            @Override
            public void onClick(View v) {
                BtnReservar9.setBackgroundTintList(ContextCompat.getColorStateList(ReservarMesasActivity.this, R.color.vermelho_claro));
                BtnReservar9.setEnabled(false);
            }
        });

        BtnLiberarMesa.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
            @Override
            public void onClick(View v) {
                if (InputNumLiberaMesa.getText().toString().isEmpty()) {
                    InputNumLiberaMesa.setError("Preencha o campo!");
                    InputNumLiberaMesa.requestFocus();
                } else {
                    switch (InputNumLiberaMesa.getText().toString()) {
                        case "1":
                            if (BtnReservar1.isEnabled()) {
                                Toast.makeText(ReservarMesasActivity.this, "Mesa não reservada", Toast.LENGTH_LONG ).show();
                            } else {
                                BtnReservar1.setBackgroundTintList(ContextCompat.getColorStateList(ReservarMesasActivity.this, R.color.azul_btn_reservar));
                                BtnReservar1.setEnabled(true);
                            }
                            break;

                        case "2":
                            if (BtnReservar2.isEnabled()) {
                                Toast.makeText(ReservarMesasActivity.this, "Mesa não reservada", Toast.LENGTH_LONG ).show();
                            } else {
                                BtnReservar2.setBackgroundTintList(ContextCompat.getColorStateList(ReservarMesasActivity.this, R.color.azul_btn_reservar));
                                BtnReservar2.setEnabled(true);
                            }
                            break;

                        case "3":
                            if (BtnReservar3.isEnabled()) {
                                Toast.makeText(ReservarMesasActivity.this, "Mesa não reservada", Toast.LENGTH_LONG ).show();
                            } else {
                                BtnReservar3.setBackgroundTintList(ContextCompat.getColorStateList(ReservarMesasActivity.this, R.color.azul_btn_reservar));
                                BtnReservar3.setEnabled(true);
                            }
                            break;

                        case "4":
                            if (BtnReservar4.isEnabled()) {
                                Toast.makeText(ReservarMesasActivity.this, "Mesa não reservada", Toast.LENGTH_LONG ).show();
                            } else {
                                BtnReservar4.setBackgroundTintList(ContextCompat.getColorStateList(ReservarMesasActivity.this, R.color.azul_btn_reservar));
                                BtnReservar4.setEnabled(true);
                            }
                            break;

                        case "5":
                            if (BtnReservar5.isEnabled()) {
                                Toast.makeText(ReservarMesasActivity.this, "Mesa não reservada", Toast.LENGTH_LONG ).show();
                            } else {
                                BtnReservar5.setBackgroundTintList(ContextCompat.getColorStateList(ReservarMesasActivity.this, R.color.azul_btn_reservar));
                                BtnReservar5.setEnabled(true);
                            }
                            break;

                        case "6":
                            if (BtnReservar6.isEnabled()) {
                                Toast.makeText(ReservarMesasActivity.this, "Mesa não reservada", Toast.LENGTH_LONG ).show();
                            } else {
                                BtnReservar6.setBackgroundTintList(ContextCompat.getColorStateList(ReservarMesasActivity.this, R.color.azul_btn_reservar));
                                BtnReservar6.setEnabled(true);
                            }
                            break;

                        case "7":
                            if (BtnReservar7.isEnabled()) {
                                Toast.makeText(ReservarMesasActivity.this, "Mesa não reservada", Toast.LENGTH_LONG ).show();
                            } else {
                                BtnReservar7.setBackgroundTintList(ContextCompat.getColorStateList(ReservarMesasActivity.this, R.color.azul_btn_reservar));
                                BtnReservar7.setEnabled(true);
                            }
                            break;

                        case "8":
                            if (BtnReservar8.isEnabled()) {
                                Toast.makeText(ReservarMesasActivity.this, "Mesa não reservada", Toast.LENGTH_LONG ).show();
                            } else {
                                BtnReservar8.setBackgroundTintList(ContextCompat.getColorStateList(ReservarMesasActivity.this, R.color.azul_btn_reservar));
                                BtnReservar8.setEnabled(true);
                            }
                            break;

                        case "9":
                            if (BtnReservar9.isEnabled()) {
                                Toast.makeText(ReservarMesasActivity.this, "Mesa não reservada", Toast.LENGTH_LONG ).show();
                            } else {
                                BtnReservar9.setBackgroundTintList(ContextCompat.getColorStateList(ReservarMesasActivity.this, R.color.azul_btn_reservar));
                                BtnReservar9.setEnabled(true);
                            }
                            break;
                    }
                }
            }
        });

        BtnSalvarOperacao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(ReservarMesasActivity.this);
                SharedPreferences.Editor edit = preferences.edit();
                edit.putBoolean("mesa_1", BtnReservar1.isEnabled());
                edit.putBoolean("mesa_2", BtnReservar2.isEnabled());
                edit.putBoolean("mesa_3", BtnReservar3.isEnabled());
                edit.putBoolean("mesa_4", BtnReservar4.isEnabled());
                edit.putBoolean("mesa_5", BtnReservar5.isEnabled());
                edit.putBoolean("mesa_6", BtnReservar6.isEnabled());
                edit.putBoolean("mesa_7", BtnReservar7.isEnabled());
                edit.putBoolean("mesa_8", BtnReservar8.isEnabled());
                edit.putBoolean("mesa_9", BtnReservar9.isEnabled());
                edit.apply();

                Toast.makeText(ReservarMesasActivity.this, "Operações salvas!", Toast.LENGTH_LONG ).show();
            }
        });

        BtnReservarTodasMesas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!BtnReservar1.isEnabled() &&
                    !BtnReservar2.isEnabled() &&
                    !BtnReservar3.isEnabled() &&
                    !BtnReservar4.isEnabled() &&
                    !BtnReservar5.isEnabled() &&
                    !BtnReservar6.isEnabled() &&
                    !BtnReservar7.isEnabled() &&
                    !BtnReservar8.isEnabled() &&
                    !BtnReservar9.isEnabled()) {
                    Toast.makeText(ReservarMesasActivity.this, "Operação inválida. Todas as mesas já possuem reserva!", Toast.LENGTH_LONG ).show();
                } else {
                    SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(ReservarMesasActivity.this);
                    SharedPreferences.Editor edit = preferences.edit();
                    edit.putBoolean("mesa_1", false);
                    edit.putBoolean("mesa_2", false);
                    edit.putBoolean("mesa_3", false);
                    edit.putBoolean("mesa_4", false);
                    edit.putBoolean("mesa_5", false);
                    edit.putBoolean("mesa_6", false);
                    edit.putBoolean("mesa_7", false);
                    edit.putBoolean("mesa_8", false);
                    edit.putBoolean("mesa_9", false);
                    edit.apply();

                    BtnReservar1.setBackgroundTintList(ContextCompat.getColorStateList(ReservarMesasActivity.this, R.color.vermelho_claro));
                    BtnReservar1.setEnabled(false);
                    BtnReservar2.setBackgroundTintList(ContextCompat.getColorStateList(ReservarMesasActivity.this, R.color.vermelho_claro));
                    BtnReservar2.setEnabled(false);
                    BtnReservar3.setBackgroundTintList(ContextCompat.getColorStateList(ReservarMesasActivity.this, R.color.vermelho_claro));
                    BtnReservar3.setEnabled(false);
                    BtnReservar4.setBackgroundTintList(ContextCompat.getColorStateList(ReservarMesasActivity.this, R.color.vermelho_claro));
                    BtnReservar4.setEnabled(false);
                    BtnReservar5.setBackgroundTintList(ContextCompat.getColorStateList(ReservarMesasActivity.this, R.color.vermelho_claro));
                    BtnReservar5.setEnabled(false);
                    BtnReservar6.setBackgroundTintList(ContextCompat.getColorStateList(ReservarMesasActivity.this, R.color.vermelho_claro));
                    BtnReservar6.setEnabled(false);
                    BtnReservar7.setBackgroundTintList(ContextCompat.getColorStateList(ReservarMesasActivity.this, R.color.vermelho_claro));
                    BtnReservar7.setEnabled(false);
                    BtnReservar8.setBackgroundTintList(ContextCompat.getColorStateList(ReservarMesasActivity.this, R.color.vermelho_claro));
                    BtnReservar8.setEnabled(false);
                    BtnReservar9.setBackgroundTintList(ContextCompat.getColorStateList(ReservarMesasActivity.this, R.color.vermelho_claro));
                    BtnReservar9.setEnabled(false);

                    Toast.makeText(ReservarMesasActivity.this, "Todas as mesas reservadas!", Toast.LENGTH_LONG ).show();
                }
            }
        });
    }
}
