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
    ArrayList<ST_TileSprite> _TilesArrayList;
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


        //Creamos los botones correspondientes a cada partida
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
        //Re-defino el valor del botón "atrás"
        this.btnAtras.setBtnValue(0);

        //Añado todos los botones de esta escena en un arraylist
        this.btnArrayList = new ArrayList<>();
        this.btnArrayList.add(btnP1);
        this.btnArrayList.add(btnP2);
        this.btnArrayList.add(btnP3);
        this.btnArrayList.add(this.btnAtras);

        //Añado todos los tiles que voy a usar en esta escena en un arraylist
//        this._TilesArrayList = new ArrayList<>();
//
//        this._TilesArrayList.add(_Tiles.MENU_SPOT);
//        this._TilesArrayList.add(_Tiles.MENU_CROSS);
//        this._TilesArrayList.add(_Tiles.MENU_CIRCLE);
    }

    public void dibujar(Canvas c) {
        try{
            c.drawColor(Color.WHITE);
            int incremento = _Tiles.PLACEHOLDER.getSpriteDPsX();

            for(int i=0;i<getAltoPantalla();i+=incremento){
                for(int j=0;j<getAnchoPantalla();j+=incremento){
//                    c.drawBitmap(this._TilesArrayList.get(
//                            this._TilesArrayList.indexOf(_Tiles.MENU_SPOT)).getspriteBm(),j,i,null);
//                    c.drawBitmap(this._TilesArrayList.get(
//                            this._TilesArrayList.indexOf(_Tiles.MENU_CIRCLE)).getspriteBm(),j,i,null);
//                    c.drawBitmap(this._TilesArrayList.get(
//                            this._TilesArrayList.indexOf(_Tiles.MENU_CROSS)).getspriteBm(),j,i,null);
                    _Tiles.MENU_SPOT.spriteDibujar(c,j,i,1);
                    _Tiles.MENU_CIRCLE.spriteDibujar(c,j,i,1);
                    _Tiles.MENU_CROSS.spriteDibujar(c,j,i,1);
                }
            }

            btnP1.dibujaBoton(c);
            btnP2.dibujaBoton(c);
            btnP3.dibujaBoton(c);

            super.dibujar(c);                       //Llamamos a super para poner el botón de salir

//            Log.i("TEST","ANCHO PANTALLA "+getAnchoPantalla());
//            Log.i("TEST","ANCHO PANTALLA DPX "+ _DimensionesDispositivo.pXLargo);
//            Log.i("TEST","ALTO PANTALLA "+getAltoPantalla());
//            Log.i("TEST","ALTO PANTALLA DPY "+ _DimensionesDispositivo.pYAlto);

//            c.drawText("Menú", getAnchoPantalla()/2, getAltoPantalla()/5, pTexto);
//            c.drawText("Menú", getAnchoPantalla()/2+5, getAltoPantalla()/5+10, pTexto2);

        }catch(Exception e){
            Log.i("Error al dibujar", e.getLocalizedMessage());
        }
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
                Log.i("TOUCH","ALTO: "+ _DimensionesDispositivo.pYAlto+" LARGO: "+ _DimensionesDispositivo.pXLargo);
                for(_Boton b : btnArrayList){
                    if(b.pulsaBoton(event)){
                        return b.getBtnValue();
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