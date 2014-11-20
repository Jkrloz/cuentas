package cl.sdomingu.cuentas;

import android.app.ActionBar;
import android.app.Activity;
import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;


public class Cuenta_Paso1 extends ListActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cuenta_paso1);

        getActionBar().setDisplayHomeAsUpEnabled(true);

        String[] amigos_lista = getResources().getStringArray(R.array.amigos_lista);

        ArrayAdapter<String> adaptador = new ArrayAdapter<String>(this, R.layout.amigo_list_conf,
                amigos_lista);

        setListAdapter(adaptador);

        ListView lv = getListView();

        lv.setTextFilterEnabled(true);

        /*AdapterView.OnItemClickListener escuchador = new AdapterView.OnItemClickListener() {

            // MŽtodo que se ejecuta cuando se hace click en un item
            @Override
            public void onItemClick(AdapterView<?> arg0, View view, int pos,
                                    long id) {

                // Creamos una burbuja emergente que despliega el pa’s elegido
                // por un tiempo largo
                Toast.makeText(getApplicationContext(), "Usted elegió: " + ((TextView) view).getText(),
                        Toast.LENGTH_SHORT).show();

            }

        };*/

        // Le asignamos un escuchador al ListView
        //lv.setOnItemClickListener(escuchador);
    }





    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_paso1, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.




        // Handle presses on the action bar items
        switch (item.getItemId()) {
            case R.id.action_paso2:{
                //si estoy en frieds, no hacer nada
                Intent act = new Intent(this, Cuenta_Paso2.class); startActivity(act);

                return true;

            }


            default:
                //return super.onOptionsItemSelected(item);
                onBackPressed();
                return true;
        }

    }

}
