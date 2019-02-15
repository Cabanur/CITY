package a20_pc24.city;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.util.Log;
import android.view.MotionEvent;

import java.util.ArrayList;

import a20_pc24.city.sprites.ST_TileSprite;

//Id 96

public class EeJuego_aSeleccionPartida extends EE_EsquemaEscena {

    Rect boundsRect;
    BitmapDrawable mosaicDefinerBD;
    ArrayList<ST_TileSprite> arrL_TilesUsadas;
    ArrayList<_Boton> btnArrayList;

    _Boton btnP1, btnP2, btnP3;                 //El valor será respectivamente 1, 2, 3

    /**
     *
     * @param cntx
     * @param idEscena
     * @param anchoPantalla
     * @param altoPantalla
     */

    public EeJuego_aSeleccionPartida(Context cntx, int idEscena, int anchoPantalla, int altoPantalla) {
        super(cntx, idEscena, anchoPantalla, altoPantalla);
//        fondo = BitmapFactory.decodeResource(cntx.getResources(),R.drawable.b);
//        fondo = Bitmap.createScaledBitmap(fondo, anchoPantalla, altoPantalla, false);
//        fondo = _Utiles.getBitmapFromAsset(this.cntx,"menugraphics/savegame4smallcross.png");
//        fondo = Bitmap.createScaledBitmap(fondo,64,64,false);
//        this.savedGamesBackgroundTile1Spot = new ST_TileSprite(fondo,false,false,ST_TileSprite.TileTipo.SUELO);
                                    //Bitmap spriteIMG, double spriteChoordX, double spriteChoordY, boolean colisionable, boolean animado, TileTipo tileTipo



        btnP1=new _Boton
                (anchoPantalla*1/5,altoPantalla*1/7,
                 anchoPantalla-anchoPantalla*1/5,altoPantalla-altoPantalla*5/7,
                        Color.GREEN, true, "Partida 1", 1);

        btnP2=new _Boton
            (anchoPantalla*1/5,altoPantalla*3/7,
                    anchoPantalla-anchoPantalla*1/5,altoPantalla-altoPantalla*3/7,
                    Color.GREEN, true, "Partida 2",2);

        btnP3=new _Boton
            (anchoPantalla*1/5,altoPantalla*5/7,
                    anchoPantalla-anchoPantalla*1/5,altoPantalla-altoPantalla*1/7,
                    Color.GREEN, true, "Partida 3",3);
        this.btnAtras.btnValue = 0;

        this.btnArrayList = new ArrayList<>();
        this.btnArrayList.add(btnP1);
        this.btnArrayList.add(btnP2);
        this.btnArrayList.add(btnP3);
        this.btnArrayList.add(this.btnAtras);

        this.arrL_TilesUsadas = new ArrayList<>();

        this.arrL_TilesUsadas.add(_Tiles.MENU_SPOT);
        this.arrL_TilesUsadas.add(_Tiles.MENU_CROSS);
        this.arrL_TilesUsadas.add(_Tiles.MENU_CIRCLE);
    }

    public void dibujar(Canvas c) {
//        try{
            for(int i=0;i<getAltoPantalla();i+=64){
                for(int j=0;j<getAnchoPantalla();j+=64){
                    c.drawBitmap(this.arrL_TilesUsadas.get(
                            this.arrL_TilesUsadas.indexOf(_Tiles.MENU_SPOT)).getSpriteIMG(),j,i,null);
                    c.drawBitmap(
                            this.arrL_TilesUsadas.get(this.arrL_TilesUsadas.indexOf(_Tiles.MENU_CIRCLE)).getSpriteIMG(),j,i,null);
                    c.drawBitmap(
                            this.arrL_TilesUsadas.get(this.arrL_TilesUsadas.indexOf(_Tiles.MENU_CROSS)).getSpriteIMG(),j,i,null);
                }
            }

//            System.exit(0);
//            c.drawBitmap(fondo,0,0,null);
            btnP1.dibujaBoton(c);
            btnP2.dibujaBoton(c);
            btnP3.dibujaBoton(c);

            super.dibujar(c);                       //Llamamos a super para poner el botón de salir

            Log.i("TEST","ANCHO PANTALLA "+getAnchoPantalla());
            Log.i("TEST","ANCHO PANTALLA DPX "+ _Dimensiones.pXLargo);
            Log.i("TEST","ALTO PANTALLA "+getAltoPantalla());
            Log.i("TEST","ALTO PANTALLA DPY "+ _Dimensiones.pYAlto);

//            c.drawText("Menú", getAnchoPantalla()/2, getAltoPantalla()/5, pTexto);
//            c.drawText("Menú", getAnchoPantalla()/2+5, getAltoPantalla()/5+10, pTexto2);

//        }catch(Exception e){
//            Log.i("Error al dibujar", e.getLocalizedMessage());
//        }
    }

    public void actualizarFisica() {


    }


    public int onTouchEvent(MotionEvent event) {
        int pointerIndex = event.getActionIndex();          //Obtenemos el índice de la acción
        int pointerID = event.getPointerId(pointerIndex);   //Obtenemos el Id del pointer asociado a la acción
        int accion = event.getActionMasked();               //Obtenemos el tipo de pulsación
        switch (accion) {
            case MotionEvent.ACTION_DOWN:                   // Primer dedo toca
                break;
            case MotionEvent.ACTION_POINTER_DOWN:           // Segundo y siguientes tocan
                break;
            case MotionEvent.ACTION_UP:                     // Al levantar el último dedo
                Log.i("TOUCH","I TOUCH");
                for(_Boton b : btnArrayList){
                    if(b.pulsaBoton(event)){
                        return b.btnValue;
                    }
                }
                break;
            case MotionEvent.ACTION_POINTER_UP:  // Al levantar un dedo que no es el último
                /*
                if(pulsa(juego,event)) {
                    return 1;
                }else if(pulsa(ayuda,event)){
                    return 99;
                }else if(pulsa(opciones,event)){
                    return 98;

                }else if(pulsa(records,event)){
                    return 97;
                }
                */
                break;
            case MotionEvent.ACTION_MOVE: // Se mueve alguno de los dedos
                break;
            default:
                Log.i("Otra acción", "Acción no definida: "+accion);
                break;
        }

//        int idPadre = super.onTouchEvent(event);
//        if(idPadre!=getIdEscena()){
//            return idPadre;
//        }
//
        return getIdEscena();
    }
}