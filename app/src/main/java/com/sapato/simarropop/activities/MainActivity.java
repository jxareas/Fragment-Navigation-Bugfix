package com.sapato.simarropop.activities;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.sapato.simarropop.R;
import com.sapato.simarropop.fragments.ArticuloFragment;
import com.sapato.simarropop.fragments.MensajeFragment;
import com.sapato.simarropop.fragments.ProfileFragment;

public class MainActivity extends AppCompatActivity {

    private BottomNavigationView bottomNavigationView;
    // TODO : Move this to some fragment-scoped `SwipeRefreshLayout`
//    private SwipeRefreshLayout swipeRefreshLayout;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        swipeRefreshLayout = findViewById(R.id.swipe_refresh_layout);

//        swipeRefreshLayout.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() {
//            @Override
//            public void onRefresh() {
//                // Aquí puedes actualizar tus datos y detener la animación de refresco cuando se complete la operación
//                swipeRefreshLayout.setRefreshing(false);
//            }
//        });

        bottomNavigationView = findViewById(R.id.bottom_navigation);

        //Lo primero que te muestra al entrar a la app, para que no se quede en blanco
        if (savedInstanceState == null) {
            ArticuloFragment fragment = new ArticuloFragment();
            getSupportFragmentManager().beginTransaction()
                    .add(R.id.contenedorPrincipal, fragment)
                    .commit();
        }

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.productos:
                        if (savedInstanceState == null) {
                            ArticuloFragment fragment = new ArticuloFragment();
                            getSupportFragmentManager().beginTransaction()
                                    .replace(R.id.contenedorPrincipal, fragment)
                                    .commit();
                        }
                        break;
                    case R.id.mensajes:
                        if (savedInstanceState == null) {
                            MensajeFragment fragment = new MensajeFragment();
                            getSupportFragmentManager().beginTransaction()
                                    .replace(R.id.contenedorPrincipal, fragment)
                                    .commit();
                        }
                        break;
                    case R.id.mis_productos:
                        // handle mis_productos action
                        break;
                    case R.id.perfil:
                        if (savedInstanceState == null) {

                            ProfileFragment fragment = new ProfileFragment();
                            getSupportFragmentManager().beginTransaction()
                                    .replace(R.id.contenedorPrincipal, fragment)
                                    .commit();
                        }
                        break;
                }
                return true;
            }
        });
    }
}