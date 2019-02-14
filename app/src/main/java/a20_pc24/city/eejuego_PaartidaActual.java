package a20_pc24.city;

import android.content.Context;
import android.util.AttributeSet;
import android.view.SurfaceHolder;
import android.view.SurfaceView;

public class eejuego_PaartidaActual extends EE_EsquemaEscena{

    /**
     * Extiende del esquema general de escenas.
     * Carga la partida guardada en el slot correspondiente.
     *
     * @param cntx recursos y datos de la aplicación
     * @param idEscena identificador correspondiente a esta escena
     *
     *
     * @param anchoPantalla prescindible en un futuro próximo
     * @param altoPantalla prescindible en un futuro próximo
     */

    public eejuego_PaartidaActual(Context cntx, int idEscena, int anchoPantalla, int altoPantalla, byte idPartida) {
        super(cntx, idEscena, anchoPantalla, altoPantalla);
//        this.cargarPartida(idPartida);
    }

}