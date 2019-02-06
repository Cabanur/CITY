package a20_pc24.city;

import android.content.Context;
import android.util.AttributeSet;
import android.view.SurfaceHolder;
import android.view.SurfaceView;

public class eejuego_PaartidaActual extends SurfaceView implements SurfaceHolder.Callback{

    /*  Muestra la pantalla de juego actual, en referencia al juego, puede ser:
     *  - CallePrincipal
     *  - EdificioSotano
     *  - EdificioPB
     *  - EdificioP1
     *  - EdificioP2
     *  - EdificioP3
     *  - EdificioP4
     *  - EdificioP4Tejado
     *  - MenuInterno y todos sus submenus
     */

    public eejuego_PaartidaActual(Context context) {
        super(context);
    }

    @Override
    public void surfaceCreated(SurfaceHolder holder) {

    }

    @Override
    public void surfaceChanged(SurfaceHolder holder, int format, int width, int height) {

    }

    @Override
    public void surfaceDestroyed(SurfaceHolder holder) {

    }
}
