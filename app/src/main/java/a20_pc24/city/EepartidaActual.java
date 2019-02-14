package a20_pc24.city;

import android.content.Context;
import android.util.AttributeSet;
import android.view.SurfaceHolder;
import android.view.SurfaceView;

//Clase destinada a cargar la partida guardada
//

public class EepartidaActual extends EE_EsquemaEscena{

    public int idEscena = 96;
    public int idPartida;


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

    public EepartidaActual(Context cntx, int idEscena, int anchoPantalla, int altoPantalla, int idPartida) {
        super(cntx, idEscena, anchoPantalla, altoPantalla);
        this.idPartida = idPartida;
//        this.cargarPartida(idPartida);
    }
}