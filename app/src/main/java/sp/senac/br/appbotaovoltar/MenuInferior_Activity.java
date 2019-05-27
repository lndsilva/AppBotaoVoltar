package sp.senac.br.appbotaovoltar;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

public class MenuInferior_Activity extends AppCompatActivity implements BottomNavigationView.OnNavigationItemSelectedListener {

    private BottomNavigationView navigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu_inferior_layout);

        navigationView = (BottomNavigationView) findViewById(R.id.idBottomNavigation);
        navigationView.setOnNavigationItemSelectedListener(this);
    }


    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
        switch (menuItem.getItemId()) {
            case R.id.mBRecentes:
                startActivity(new Intent(getApplicationContext(), PrincipalActivity.class));
                break;
            case R.id.mBFavoritos:
                Toast.makeText(getApplicationContext(), "Cliquei no favoritos", Toast.LENGTH_SHORT).show();
                break;
            case R.id.mBLocalização:
                Toast.makeText(getApplicationContext(), "Cliquei na localização", Toast.LENGTH_SHORT).show();
                break;
        }

        return false;
    }
}
