package a20_pc24.city;

import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.util.Log;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;

import a20_pc24.city.sprites.ST_TileSprite;

public class _Utiles {

    /**
     * Fuente: https://stackoverflow.com/questions/8501309/android-get-bitmap-or-sound-from-assets
     * Este método nos permite coger una imagen o sonido de la carpeta Assets
     *
     //@param context definición de "Context": https://stackoverflow.com/questions/3572463/what-is-context-on-android
     //Usamos la clase _Context para referenciar el mismo debido a los null pointer ocasionados
     * @param filePath
     * @return devuelve el bitmap creado a partir del context y la ruta
     */

    public static Bitmap getBitmapFromAsset(String filePath) {
//    public static Bitmap getBitmapFromAsset(Context context, String filePath) {
        AssetManager assetManager = _Context.getAppContext().getAssets();
        InputStream istr = null;
        Bitmap bitmap = null;

        try {
            istr = assetManager.open(filePath);
            bitmap = BitmapFactory.decodeStream(istr);
        } catch (IOException e) {
            e.printStackTrace();
        }

        return bitmap;
    }

    /**
     * Espeja el Bitmap dado en horizontal
     * Fuente: https://acomputerengineer.wordpress.com/2016/06/07/flip-imagebitmap-horizontally-and-vertically-in-android/
     * @param bm bitmap que vamos a usar
     * @return bm girado horizontalmente
     */

    public static Bitmap flipBitmapX(Bitmap bm){
        Matrix m = new Matrix();
        m.preScale(-1.0f, 1.0f);
        return Bitmap.createBitmap(bm, 0, 0, bm.getWidth(), bm.getHeight(), m, true);
    }

    /**
     * Espeja el Bitmap dado en vertical
     * Fuente: https://acomputerengineer.wordpress.com/2016/06/07/flip-imagebitmap-horizontally-and-vertically-in-android/
     * @param bm bitmap que vamos a usar
     * @return bm girado horizontalmente
     */

    public static Bitmap flipBitmapY(Bitmap bm) {
        Matrix m = new Matrix();
        m.preScale(-1.0f, 1.0f);
        return Bitmap.createBitmap(bm, 0, 0, bm.getWidth(), bm.getHeight(), m, true);
    }

    /**
     * Fuente: http://www.androidsnippets.com/combine-multiple-bitmap-into-one.html
     * Combinar varios Bitmap en uno
     *
     * @param bitmap arrayList de tiles que componen el mapa
     * @param mapaCoordenadas array bidimensional de coordenadas que indican la posición de cada tile
     * @return
     */

    public static Bitmap combineImageIntoOne(ArrayList<Bitmap> bitmap, int [][] mapaCoordenadas) {
        int w = 0, h = 0;
        for (int i = 0; i < bitmap.size(); i++) {
            if (i < bitmap.size() - 1) {
                w = bitmap.get(i).getWidth() > bitmap.get(i + 1).getWidth() ? bitmap.get(i).getWidth() : bitmap.get(i + 1).getWidth();
            }
            h += bitmap.get(i).getHeight();
        }

        Bitmap temp = Bitmap.createBitmap(w, h, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(temp);
        int top = 0;
        for (int i = 0; i < bitmap.size(); i++) {
            Log.d("HTML", "Combine: "+i+"/"+bitmap.size()+1);

            top = (i == 0 ? 0 : top+bitmap.get(i).getHeight());
            canvas.drawBitmap(bitmap.get(i), 0f, top, null);
        }
        return temp;
    }

    //EXIT APPLICATION: https://stackoverflow.com/questions/6330200/how-to-quit-android-application-programmatically
    //IDEAS:
    //fling: https://code.tutsplus.com/tutorials/adding-physics-based-animations-to-android-apps--cms-29053
    //https://www.udemy.com/libgdx-game-development-masterclass/
}
