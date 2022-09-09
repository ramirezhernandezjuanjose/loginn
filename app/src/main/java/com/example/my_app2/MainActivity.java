package com.example.my_app2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText et1;
    private EditText et2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



           et1=(EditText)findViewById(R.id.txt_usuario);
           et2=(EditText)findViewById(R.id.txt_password);


    }
    public void ingresar(View view){

        String nombre_usuario=et1.getText().toString();
        String password_usuario=et2.getText().toString();
         String password="usc";
         if (password.equals(password_usuario)){
             Toast.makeText(this,  "usuraio"+nombre_usuario+"acesso permitido", Toast.LENGTH_SHORT).show();
         }   else {
                   Toast.makeText(this, nombre_usuario + "acceso no permitido contraseña incorrecta", Toast.LENGTH_LONG).show();
         }


        //if(nomrbre_usuario.equalsIgnoreCase(comparacion2)fal ){
          //  Toast.makeText(this, "Aprobado", Toast.LENGTH_SHORT).show();
       // } else if(promedio <= 5){
           // Toast.makeText(this, "Reprobado", Toast.LENGTH_LONG).show();
       // }//
    }
}