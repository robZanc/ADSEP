package com.example.point.adsep;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

public class Feedback extends AppCompatActivity {

    private String [] respuestasCorrectas=new String[13];
    private String [] respuestasElegida=new String[13];
    int respuestasBuenas=0;
    int respuestasMalas=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feedback);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        TextView texto=(TextView) findViewById(R.id.texFeed);

        AdminSQLiteOpenHelper admin=new AdminSQLiteOpenHelper(this,"Simulador",null,1);
        SQLiteDatabase db=admin.getWritableDatabase();
        for(int i=1;i<respuestasCorrectas.length;i++){
            Cursor fila=db.rawQuery("select respuestaCor from preguntas where idPregunta="+(i),null);
            if(fila.moveToFirst()) {
                respuestasCorrectas[i] = fila.getString(0);
            }
        }

        for(int j=1;j<respuestasCorrectas.length;j++){
            Cursor re=db.rawQuery("select respuestaElegida from preguntas where idPregunta="+(j),null);
            if(re.moveToFirst()){
                respuestasElegida[j]=re.getString(0);
            }
        }
        db.close();

        for(int k=0;k<respuestasCorrectas.length;k++){
            if(respuestasCorrectas[k]==respuestasElegida[k]){
                respuestasBuenas++;
            }else{
                respuestasMalas++;
            }
        }

        texto.setText("Tienes "+respuestasBuenas+" respuestas correctas y "+respuestasMalas+" respuestas erroneas");

        db.close();

    }



    public void respuestas(View vi){
        AdminSQLiteOpenHelper admin=new AdminSQLiteOpenHelper(this,"Simulador",null,1);
        SQLiteDatabase db=admin.getWritableDatabase();
        for(int i=0;i<respuestasCorrectas.length;i++){
            Cursor fila=db.rawQuery("select respuestaCor from preguntas where idPregunta="+(i+1),null);
            respuestasCorrectas[i]=fila.getString(0);
        }

        for(int j=0;j<respuestasElegida.length;j++){
            Cursor re=db.rawQuery("select respuestaElegida from preguntas where idPregunta="+(j+1),null);
            respuestasElegida[j]=re.getString(0);
        }


    }

    String texto="";
    String quer="";

    public void revisarRespuestas(View vi){
        AdminSQLiteOpenHelper admin=new AdminSQLiteOpenHelper(this,"Simulador",null,1);
        SQLiteDatabase db=admin.getWritableDatabase();
        for(int i=0;i<respuestasCorrectas.length;i++){
            if(respuestasCorrectas[i]!=respuestasElegida[i]){
                Cursor fila=db.rawQuery("select descripcion from preguntas where idPregunta="+i+1,null);
                if(fila.moveToFirst()){
                    quer=fila.getString(0);
                    texto=texto+"\n"+quer;
                }
            }
        }
    }

}
