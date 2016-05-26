package itcr.animacion;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.MenuItem;
import android.view.ViewAnimationUtils;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.widget.Toolbar;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        //getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    public void ocultarPantalla(View v) {
        final View miEncabezado = findViewById(R.id.encabezado);

        if (miEncabezado.getVisibility() == View.VISIBLE) {

            int cx = (miEncabezado.getLeft() + miEncabezado.getRight()) / 2;
            int cy = (miEncabezado.getTop() + miEncabezado.getBottom()) / 2;

            int radioInicial = miEncabezado.getWidth();

            Animator anim = ViewAnimationUtils.createCircularReveal(miEncabezado, cx, cy, radioInicial, 0);
            anim.addListener(new AnimatorListenerAdapter() {
                @Override
                public void onAnimationEnd(Animator animation) {
                    super.onAnimationEnd(animation);
                    miEncabezado.setVisibility(View.INVISIBLE);
                }

            });
            anim.start();
        }
    }

    public void mostrarPantalla(View v) {
        View miEncabezado = findViewById(R.id.encabezado);

        if (miEncabezado.getVisibility() != View.VISIBLE) {

            int cx = (miEncabezado.getLeft() + miEncabezado.getRight()) / 2;
            int cy = (miEncabezado.getTop() + miEncabezado.getBottom()) / 2;

            int radioFinal = Math.max(miEncabezado.getWidth(), miEncabezado.getHeight());

            Animator anim = ViewAnimationUtils.createCircularReveal(miEncabezado, cx, cy, 0, radioFinal);

            miEncabezado.setVisibility(View.VISIBLE);
            anim.start();

        }
    }
}
