package a20_pc24.city;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.util.Log;
import android.view.MotionEvent;

public class EeJuego extends EE_EsquemaEscena {
    public EeJuego(Context cntx, int idEscena, int anchoPantalla, int altoPantalla) {
        super(cntx, idEscena, anchoPantalla, altoPantalla);

//        fondo = BitmapFactory.decodeResource(cntx.getResources(),R.drawable.b);
//        fondo = _Utiles.getBitmapFromAsset(this.cntx,"cityscape/a.png");
//        fondo = Bitmap.createScaledBitmap(fondo, anchoPantalla, altoPantalla, false);
    }

    public void dibujar(Canvas c) {
        try{
            c.drawBitmap(fondo,0,0,null);
            super.dibujar(c);
            //Llamamos a super para poner el botón de salir
//            c.drawText("Menú", getAnchoPantalla()/2, getAltoPantalla()/5, pTexto);
//            c.drawText("Menú", getAnchoPantalla()/2+5, getAltoPantalla()/5+10, pTexto2);

        }catch(Exception e){
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
            case MotionEvent.ACTION_POINTER_DOWN:  // Segundo y siguientes tocan
                break;

            case MotionEvent.ACTION_UP:                     // Al levantar el último dedo
            case MotionEvent.ACTION_POINTER_UP:  // Al levantar un dedo que no es el último
//                if(pulsa(juego,event)) {
//                    return 1;
//                }else if(pulsa(ayuda,event)){
//                    return 99;
//                }else if(pulsa(opciones,event)){
//                    return 98;
//
//                }else if(pulsa(records,event)){
//                    return 97;
//                }
                break;

            case MotionEvent.ACTION_MOVE: // Se mueve alguno de los dedos

                break;
            default:  Log.i("Otra acción", "Acción no definida: "+accion);
        }

        int idPadre = super.onTouchEvent(event);
        if(idPadre!=getIdEscena()){
            return idPadre;
        }

        return getIdEscena();
    }
}

