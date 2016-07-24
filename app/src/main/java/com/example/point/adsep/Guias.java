package com.example.point.adsep;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

public class Guias extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_guias);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    /* Esta es la opción de settings en la barra principal
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.guias, menu);
        return true;
    }
    */

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.gsimulador) {
            Intent intent=new Intent(getApplicationContext(),Simulador.class);
            startActivity(intent);
            finish();
        } else if (id == R.id.gotra) {

        } else if (id == R.id.gsalir) {
            System.exit(0);
        } else if (id == R.id.gadsep) {

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

    public void onclickPdf(View vi){
        int select =vi.getId();
        try{
            if(select==R.id.iv1){
                String link="http://www.uv.mx/personal/grihernandez/files/2011/04/libromaestro.pdf";
                Intent intent=null;
                intent=new Intent(intent.ACTION_VIEW, Uri.parse(link));
                startActivity(intent);
            }else if(select==R.id.iv2){
                String link="https://mega.nz/#!UdVigISS!hFO1aDkFUJeS2DmbQcxaPI_4_DYyoF69D2o1igkUE84";
                Intent intent=null;
                intent=new Intent(intent.ACTION_VIEW, Uri.parse(link));
                startActivity(intent);
            }else if(select==R.id.iv3){
                String link="https://mega.nz/#!FFlnUBZA!PnZ5aEog4UdpJX9S10gGjSpdz4ttQl1sv9VJ5LuPrTo";
                Intent intent=null;
                intent=new Intent(intent.ACTION_VIEW, Uri.parse(link));
                startActivity(intent);
            }
        }catch(Exception e){

        }
    }
    
}
