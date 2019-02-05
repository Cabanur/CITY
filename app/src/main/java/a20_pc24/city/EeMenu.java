package a20_pc24.city;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.Log;
import android.view.MotionEvent;

public class EeMenu extends EE_EsquemaEscena {

    Rect ayuda, opciones, juego, records;
    Paint tit, tit2;
    int alto;
    int ancho, ancho2;

    public EeMenu(Context cntx, int idEscena, int anchoPantalla, int altoPantalla) {
        super(cntx, idEscena, anchoPantalla, altoPantalla);
        fondo = BitmapFactory.decodeResource(cntx.getResources(),R.drawable.a);
        fondo = Bitmap.createScaledBitmap(fondo, anchoPantalla, altoPantalla, false);

        alto=altoPantalla/7;
        ancho=anchoPantalla/5;

        ancho2=anchoPantalla/10;

        juego = new Rect(ancho,alto,ancho*4,alto*3);

        opciones = new Rect(ancho2,alto*4,ancho2*3,alto*6);

        ayuda = new Rect(ancho2*4,alto*4,ancho2*6,alto*6);

        records = new Rect(ancho2*7,alto*4,ancho2*9,alto*6);

    }

    public void dibujar(Canvas c) {
        try{
            c.drawBitmap(fondo,0,0,null);
            super.dibujar(c);
//            c.drawText("Menú", getAnchoPantalla()/2, getAltoPantalla()/5, pTexto);
//            c.drawText("Menú", getAnchoPantalla()/2+5, getAltoPantalla()/5+10, pTexto2);

            c.drawRect(juego,pBoton);
            c.drawText("Jugar",juego.centerX(),juego.centerY()+alto/2, pTexto);

            c.drawRect(ayuda, pBoton2);
            c.drawRect(opciones, pBoton2);
            c.drawRect(records,pBoton2);
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
                if(pulsa(juego,event)) {
                    return 1;
                }
                else if(pulsa(opciones,event)){
                    return 97;
                }
                else if(pulsa(records,event)){
                    return 98;
                }
                else if(pulsa(ayuda,event)) {
                    return 99;
                }
                break;

            case MotionEvent.ACTION_MOVE: // Se mueve alguno de los dedos

                break;
            default:  Log.i("Otra acción", "Acción no definida: "+accion);
        }
        return getIdEscena();
    }

}
