package informatico.to.log_inapp.Principal;

import androidx.appcompat.app.AppCompatActivity;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import informatico.to.log_inapp.DataBase.DBHelper;
import informatico.to.log_inapp.R;

public class PrincipalMenu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal_menu);
        /*Creamos una variable string del titulo*/
        String Title="Bienvenido a la Aplicación";
        /*Pintamos el titula de la actividad*/
        this.setTitle(Title);
       }
}