package a20_pc24.city;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.SurfaceHolder;
import android.view.SurfaceView;

//Clase destinada a cargar la partida guardada
//

public class EepartidaActual extends EE_EsquemaEscena{

    public int idEscena;
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
        this.idEscena = idPartida;


        this.btnAtras.btnValue = 96;        //Necesario para volver. En un futuro dará acceso al menú in-Game
//  TODO      this.cargarPartida(idPartida);
    }

    public void dibujar(Canvas c) {
        try {
            c.drawBitmap(fondo, 0, 0, null);
            super.dibujar(c);
//            c.drawText("Menú", getAnchoPantalla()/2, getAltoPantalla()/5, pTexto);
//            c.drawText("Menú", getAnchoPantalla()/2+5, getAltoPantalla()/5+10, pTexto2);

        } catch (Exception e) {
            Log.i("Error al dibujar", e.getLocalizedMessage());
        }
    }

    public void actualizarFisica() {

    }


    public int onTouchEvent(MotionEvent event) {
        int pointerIndex = event.getActionIndex();        //Obtenemos el índice de la acción
        int pointerID = event.getPointerId(pointerIndex); //Obtenemos el Id del pointer asociado a la acción
        int accion = event.getActionMasked();             //Obtenemos el tipo de pulsación
        switch (accion) {
            case MotionEvent.ACTION_DOWN:           // Primer dedo toca

                break;
            case MotionEvent.ACTION_POINTER_DOWN:  // Segundo y siguientes tocan
                break;
            case MotionEvent.ACTION_UP:                     // Al levantar el último dedo
                    if(this.btnAtras.pulsaBoton(event)){
                        return this.btnAtras.btnValue;
                    }
                break;
            case MotionEvent.ACTION_POINTER_UP:  // Al levantar un dedo que no es el último
                break;
            case MotionEvent.ACTION_MOVE: // Se mueve alguno de los dedos
                break;
            default:
                Log.i("Otra acción", "Acción no definida: " + accion);
                break;
        }
        return getIdEscena();
    }

    /**
     * TODO Cargar partida
     */
//    public void cargarPartida(int idPartida){
//
//    }
}