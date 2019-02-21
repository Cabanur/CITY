package a20_pc24.city;

import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Display;
import android.view.View;
import android.view.Window;

//Activity main -> lanzamiento
public class AM_Launch extends AppCompatActivity {

    /**
     * Crea la actividad a partir de los recursos dados
     * La sobreescritura es necesaria para lanzar la aplicación
     *
     * @param savedInstanceState recursos a partir de los que se crea la base de la aplicación
     */

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().requestFeature(Window.FEATURE_NO_TITLE);
        //    setContentView(R.layout.activity_main);

        View decorView = getWindow().getDecorView();
        int opciones = View.SYSTEM_UI_FLAG_FULLSCREEN        // pone la pantalla en modo pantalla completa ocultando elementos no criticos como la barra de estado.
                | View.SYSTEM_UI_FLAG_HIDE_NAVIGATION  // oculta la barra de navegación
                | View.SYSTEM_UI_FLAG_LAYOUT_STABLE
                | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
                | View.SYSTEM_UI_FLAG_IMMERSIVE
                | View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY;
        decorView.setSystemUiVisibility(opciones);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);

    //determinando tamaño pantalla en DP
        Display display = getWindowManager().getDefaultDisplay();
        _DimensionesDispositivo determinarDimensiones=new _DimensionesDispositivo(this, display);
    //

        EA_EscenaActual juego = new EA_EscenaActual(this);
        juego.setKeepScreenOn(true);

        setContentView(juego);
    }

    /**
     * Reanuda el transcurso del activity al ser esta restaurada
     * La sobreescritura es necesaria para resumir la aplicación
     */

    @Override
    protected void onResume() {
        super.onResume();
        //Se quita el getWindow porque no hace falta en el onResume
        View decorView = getWindow().getDecorView();
        int opciones = View.SYSTEM_UI_FLAG_FULLSCREEN       // pone la pantalla en modo pantalla completa ocultando elementos no criticos como la barra de estado.
                | View.SYSTEM_UI_FLAG_HIDE_NAVIGATION       // oculta la barra de navegación
                | View.SYSTEM_UI_FLAG_LAYOUT_STABLE
                | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
                | View.SYSTEM_UI_FLAG_IMMERSIVE
                | View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY;
        decorView.setSystemUiVisibility(opciones);

        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
    }
}
