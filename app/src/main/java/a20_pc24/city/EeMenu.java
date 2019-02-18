package a20_pc24.city;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.Log;
import android.view.MotionEvent;

import a20_pc24.city.sprites._ParallaxBm;

//Id 0

public class EeMenu extends EE_EsquemaEscena {

    Rect ayuda, opciones, juego, records;
    _Boton btnAyuda, btnOpciones, btnJuego, btnRecords;
    _Boton []btnArr;
    Paint tit, tit2;
    int alto;
    int ancho, ancho2;

    _ParallaxBm imgParallax0, imgParallax1, imgParallax2, imgParallax3, imgParallax4, imgParallax5;

    public EeMenu(Context cntx, int idEscena, int anchoPantalla, int altoPantalla) {
        super(cntx, idEscena, anchoPantalla, altoPantalla);



        alto=altoPantalla/7;
        ancho=anchoPantalla/5;

        ancho2=anchoPantalla/10;

//        juego = new Rect(ancho,alto,ancho*4,alto*3);
        btnJuego=new _Boton
                        (ancho,alto,ancho*4,alto*3,
                        Color.RED, true, "Entrar", 96);

//        opciones = new Rect(ancho2,alto*4,ancho2*3,alto*6);
        btnOpciones=new _Boton
                        (ancho2,alto*4,ancho2*3,alto*6,
                        Color.CYAN, true, "Opciones", 97);

//        ayuda = new Rect(ancho2*4,alto*4,ancho2*6,alto*6);
        btnAyuda=new _Boton
                        (ancho2*4,alto*4,ancho2*6,alto*6,
                        Color.CYAN, true, "Ayuda", 98);

//        records = new Rect(ancho2*7,alto*4,ancho2*9,alto*6);
        btnRecords=new _Boton
                        (ancho2*7,alto*4,ancho2*9,alto*6,
                        Color.CYAN, true, "Récords", 99);
        this.btnArr = new _Boton[]{btnJuego,btnOpciones,btnAyuda,btnRecords};

        this.imgParallax0 = new _ParallaxBm(         //Fondo cielo
                _Utiles.getBitmapFromAsset("parallax/parallax0.png"),_Dimensiones.screenDPsX*1/2500, 0,0,false);
        this.imgParallax2 = new _ParallaxBm(         //Fondo llanuras
                _Utiles.getBitmapFromAsset("parallax/parallax2.png"),_Dimensiones.screenDPsX*1/1000, 0,0, false);
        this.imgParallax3 = new _ParallaxBm(         //Edificios claros
                _Utiles.getBitmapFromAsset("parallax/parallax3.png"),_Dimensiones.screenDPsX*1/650, 0,0,false);
        this.imgParallax4 = new _ParallaxBm(         //Edificios oscuros
                _Utiles.getBitmapFromAsset("parallax/parallax4.png"),_Dimensiones.screenDPsX*1/350, 0,0, false);
        this.imgParallax5 = new _ParallaxBm(         //Farolas y calle
                _Utiles.getBitmapFromAsset("parallax/parallax5.png"),_Dimensiones.screenDPsX*1/200, 0,0, false);

        /*Movimiento vertical*/
        this.imgParallax1 = new _ParallaxBm(         //La luna
                _Utiles.getBitmapFromAsset("parallax/parallax1.png"),0.1f, 0,0,true);
    }

    public void dibujar(Canvas c) {
//        try{
        imgParallax0.dibujaParallax(c);
        imgParallax1.dibujaParallax(c);
        imgParallax2.dibujaParallax(c);
        imgParallax3.dibujaParallax(c);
        super.dibujar(c);
//            c.drawText("Menú", getAnchoPantalla()/2, getAltoPantalla()/5, pTexto);
//            c.drawText("Menú", getAnchoPantalla()/2+5, getAltoPantalla()/5+10, pTexto2);

//            c.drawRect(juego,pBoton);
//            c.drawText("Jugar",juego.centerX(),juego.centerY()+alto/2, pTexto);
//
//            c.drawRect(ayuda, pBoton2);
//            c.drawRect(opciones, pBoton2);
//            c.drawRect(records,pBoton2);
//        }catch(Exception e){
//            Log.i("Error al dibujar", e.getLocalizedMessage());
//        }
        btnJuego.dibujaBoton(c);
        imgParallax4.dibujaParallax(c);
        btnOpciones.dibujaBoton(c);
        btnAyuda.dibujaBoton(c);
        btnRecords.dibujaBoton(c);
        imgParallax5.dibujaParallax(c);
    }

    public void actualizarFisica() {
        this.imgParallax0.actualizaPosicionParallax();
        imgParallax1.actualizaPosicionParallax();
        imgParallax2.actualizaPosicionParallax();
        imgParallax3.actualizaPosicionParallax();
        imgParallax4.actualizaPosicionParallax();
        imgParallax5.actualizaPosicionParallax();
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
                for(_Boton btnAux: btnArr){
                    if(btnAux.pulsaBoton(event)){
                        return btnAux.btnValue;
                    }
                }
                break;
            case MotionEvent.ACTION_POINTER_UP:  // Al levantar un dedo que no es el último
                break;
            case MotionEvent.ACTION_MOVE: // Se mueve alguno de los dedos
                break;
            default:  Log.i("Otra acción", "Acción no definida: "+accion);
                break;
        }
        return getIdEscena();
    }

}
