package a20_pc24.city;

import android.content.Context;
import a20_pc24.city.sprites.ST_TileSprite;

public final class _Tiles {

    public Context tilesContext;
    //CalleCiudad
    public static ST_TileSprite CALLE_SUELO = new ST_TileSprite(_Utiles.getBitmapFromAsset("cityscape/suelosimple.png"), false, false, ST_TileSprite.TileAnim.NINGUNO);

    //Menu Tiles
    public static ST_TileSprite MENU_CROSS = new ST_TileSprite(_Utiles.getBitmapFromAsset("menugraphics/savegame4smallcross.png"), false, false, ST_TileSprite.TileAnim.NINGUNO);
    public static ST_TileSprite MENU_SPOT = new ST_TileSprite(_Utiles.getBitmapFromAsset("menugraphics/savegame1spot.png"), false, true, ST_TileSprite.TileAnim.HORIZONTAL);
    public static ST_TileSprite MENU_CIRCLE = new ST_TileSprite(_Utiles.getBitmapFromAsset("menugraphics/savegame1circle.png"), false, true, ST_TileSprite.TileAnim.HORIZONTAL);

    private _Tiles(){}
}
