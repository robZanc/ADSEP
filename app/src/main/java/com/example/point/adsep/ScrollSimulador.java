package com.example.point.adsep;

import android.content.ContentValues;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class ScrollSimulador extends AppCompatActivity {


    private TextView pregunta;
    private RadioButton rb1,rb2,rb3,rb4;

    String [] resp=new String[13];
    String [] respC=new String[13];


    int contRes=0;
    int contP=1;
    int contR1=1;
    int contR2=2;
    int contR3=3;
    int contR4=4;
    int buenas=0;
    int malas=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scrolling);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        pregunta=(TextView) findViewById(R.id.tvs);
        rb1=(RadioButton) findViewById(R.id.radioButton);
        rb2=(RadioButton) findViewById(R.id.radioButton2);
        rb3=(RadioButton) findViewById(R.id.radioButton3);
        rb4=(RadioButton) findViewById(R.id.radioButton4);

        AdminSQLiteOpenHelper admin=new AdminSQLiteOpenHelper(this,"Simulador",null,1);
        SQLiteDatabase db=admin.getWritableDatabase();


            Cursor fila = db.rawQuery("select descripcion from preguntas where idPregunta=1", null);
            if (fila.moveToFirst()) {
                pregunta.setText(fila.getString(0));
            } else {
                Toast.makeText(this, "Lo sentimos, algo salio mal", Toast.LENGTH_SHORT).show();
            }

            Cursor rad1 = db.rawQuery("select descripcion from respuestas where idRespuesta=1" , null);
            if (rad1.moveToFirst()) {
                rb1.setText(rad1.getString(0));
            } else {
                Toast.makeText(this, "Lo sentimos, algo salio mal", Toast.LENGTH_SHORT).show();
            }

            Cursor rad2 = db.rawQuery("select descripcion from respuestas where idRespuesta=2", null);
            if (rad2.moveToFirst()) {
                rb2.setText(rad2.getString(0));
            } else {
                Toast.makeText(this, "Lo sentimos, algo salio mal", Toast.LENGTH_SHORT).show();
            }

            Cursor rad3 = db.rawQuery("select descripcion from respuestas where idRespuesta=3", null);
            if (rad3.moveToFirst()) {
                rb3.setText(rad3.getString(0));
            } else {
                Toast.makeText(this, "Lo sentimos, algo salio mal", Toast.LENGTH_SHORT).show();
            }

            Cursor rad4 = db.rawQuery("select descripcion from respuestas where idRespuesta=4", null);
            if (rad4.moveToFirst()) {
                rb4.setText(rad4.getString(0));
            } else {
                Toast.makeText(this, "Lo sentimos, algo salio mal", Toast.LENGTH_SHORT).show();
            }
            db.close();
    }






    /**
     * Metodo para cambiar de pregunta en el simulador mediante base de datos y que al mismo tiempo guarda la respuesta elegida en un vector y resetea los radio buttoons
     * @param vi es la vista en la que se encuentra
     */
    public void onClickPreg(View vi){
        saveAnsw(vi);

        AdminSQLiteOpenHelper admin=new AdminSQLiteOpenHelper(this,"Simulador",null,1);
        SQLiteDatabase db=admin.getWritableDatabase();

        if(contP>=resp.length){
            Intent intent=new Intent(getApplicationContext(),Feedback.class);
            startActivity(intent);
        }else {
            Cursor fila = db.rawQuery("select descripcion from preguntas where idPregunta=" + (contP + 1), null);
            if (fila.moveToFirst()) {
                pregunta.setText(fila.getString(0));
            } else {
                Toast.makeText(this, "Lo sentimos, algo salio mal", Toast.LENGTH_SHORT).show();
            }

            Cursor rad1 = db.rawQuery("select descripcion from respuestas where idRespuesta=" + (contR1 + 4), null);
            if (rad1.moveToFirst()) {
                rb1.setText(rad1.getString(0));
            } else {
                Toast.makeText(this, "Lo sentimos, algo salio mal", Toast.LENGTH_SHORT).show();
            }

            Cursor rad2 = db.rawQuery("select descripcion from respuestas where idRespuesta=" + (contR2 + 4), null);
            if (rad2.moveToFirst()) {
                rb2.setText(rad2.getString(0));
            } else {
                Toast.makeText(this, "Lo sentimos, algo salio mal", Toast.LENGTH_SHORT).show();
            }

            Cursor rad3 = db.rawQuery("select descripcion from respuestas where idRespuesta=" + (contR3 + 4), null);
            if (rad3.moveToFirst()) {
                rb3.setText(rad3.getString(0));
            } else {
                Toast.makeText(this, "Lo sentimos, algo salio mal", Toast.LENGTH_SHORT).show();
            }

            Cursor rad4 = db.rawQuery("select descripcion from respuestas where idRespuesta=" + (contR4 + 4), null);
            if (rad4.moveToFirst()) {
                rb4.setText(rad4.getString(0));
            } else {
                Toast.makeText(this, "Lo sentimos, algo salio mal", Toast.LENGTH_SHORT).show();
            }

            contP++;
            contRes++;
            contR1 = contR1 + 4;
            contR2 = contR2 + 4;
            contR3 = contR3 + 4;
            contR4 = contR4 + 4;
            db.close();
        }
    }

    /**
     * Metodo que compara los radio buttons y si uno está seleccionado envia la respuesta que contiene en su texto a un vector y resetea su valor Checked
     * @param vi es la vista en la que se encuentra
     */
    public void saveAnsw(View vi){
        AdminSQLiteOpenHelper admin=new AdminSQLiteOpenHelper(this,"Simulador",null,1);
        SQLiteDatabase db=admin.getWritableDatabase();
        if(rb1.isChecked()){
            resp[contRes]=rb1.getText().toString();
            ContentValues respuesta=new ContentValues();
            respuesta.put("respuestaElegida", resp[contRes]);
            db.update("preguntas",respuesta,"idPregunta="+(contRes+1),null);
            rb1.setChecked(false);
        }else if(rb2.isChecked()){
            resp[contRes]=rb2.getText().toString();
            ContentValues respuesta=new ContentValues();
            respuesta.put("respuestaElegida", resp[contRes]);
            rb2.setChecked(false);
        }else if(rb3.isChecked()){
            resp[contRes]=rb3.getText().toString();
            ContentValues respuesta=new ContentValues();
            respuesta.put("respuestaElegida",resp[contRes]);
            db.update("preguntas",respuesta,"idPregunta="+(contRes+1),null);
            rb3.setChecked(false);
        }else if(rb4.isChecked()){
            resp[contRes]=rb4.getText().toString();
            ContentValues respuesta=new ContentValues();
            respuesta.put("respuestaElegida",resp[contRes]);
            db.update("preguntas",respuesta,"idPregunta="+(contRes+1),null);
            rb4.setChecked(false);
        }

        db.close();
    }


    /**
     * Metodo que regresa a la pregunta anterior mediante base de datos.
     * @param vi es la vista en la que se encuentra
     */
    public void onClickBackPreg(View vi){
        AdminSQLiteOpenHelper admin=new AdminSQLiteOpenHelper(this,"Simulador",null,1);
        SQLiteDatabase db=admin.getWritableDatabase();


        Cursor fila=db.rawQuery("select descripcion from preguntas where idPregunta="+(contP-1), null);
        if(fila.moveToFirst() ){
            pregunta.setText(fila.getString(0));
        }else{
            Toast.makeText(this,"Lo sentimos, algo salio mal",Toast.LENGTH_SHORT).show();
        }

        Cursor rad1=db.rawQuery("select descripcion from respuestas where idRespuesta="+(contR1-4),null);
        if(rad1.moveToFirst()){
            rb1.setText(rad1.getString(0));
        }else{
            Toast.makeText(this,"Lo sentimos, algo salio mal",Toast.LENGTH_SHORT).show();
        }

        Cursor rad2=db.rawQuery("select descripcion from respuestas where idRespuesta="+(contR2-4),null);
        if(rad2.moveToFirst()){
            rb2.setText(rad2.getString(0));
        }else{
            Toast.makeText(this,"Lo sentimos, algo salio mal",Toast.LENGTH_SHORT).show();
        }

        Cursor rad3=db.rawQuery("select descripcion from respuestas where idRespuesta="+(contR3-4),null);
        if(rad3.moveToFirst()){
            rb3.setText(rad3.getString(0));
        }else{
            Toast.makeText(this,"Lo sentimos, algo salio mal",Toast.LENGTH_SHORT).show();
        }

        Cursor rad4=db.rawQuery("select descripcion from respuestas where idRespuesta="+(contR4-4),null);
        if(rad4.moveToFirst()){
            rb4.setText(rad4.getString(0));
        }else{
            Toast.makeText(this,"Lo sentimos, algo salio mal",Toast.LENGTH_SHORT).show();
        }

        contP--;
        contRes--;
        contR1=contR1-4;
        contR2=contR2-4;
        contR3=contR3-4;
        contR4=contR4-4;
        db.close();

    }

}
