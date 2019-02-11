package a20_pc24.city;

import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;

import java.io.IOException;
import java.io.InputStream;

public class _Utiles {

    /**
     * Este método nos permite coger una imagen o sonido de la carpeta Assets
     *
     * @param context definición de "Context": https://stackoverflow.com/questions/3572463/what-is-context-on-android
     * @param filePath
     * @return devuelve el bitmap creado a partir del context y la ruta
     */

    public static Bitmap getBitmapFromAsset(Context context, String filePath) {
        AssetManager assetManager = context.getAssets();
        InputStream istr = null;
        Bitmap bitmap = null;

        try {
            istr = assetManager.open(filePath);
            bitmap = BitmapFactory.decodeStream(istr);
        } catch (IOException e) {
            // handle exception
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
        Bitmap flipedBM = Bitmap.createBitmap(bm, 0, 0, bm.getWidth(), bm.getHeight(), m, true);
        return flipedBM;
    }

    /**
     * Espeja el Bitmap dado en vertical
     * Fuente: https://acomputerengineer.wordpress.com/2016/06/07/flip-imagebitmap-horizontally-and-vertically-in-android/
     * @param bm bitmap que vamos a usar
     * @return bm girado horizontalmente
     */

    public static Bitmap flipBitmapY(Bitmap bm){
        Matrix m = new Matrix();
        m.preScale(-1.0f, 1.0f);
        Bitmap flipedBM = Bitmap.createBitmap(bm, 0, 0, bm.getWidth(), bm.getHeight(), m, true);
        return flipedBM;
    }

    //Origen: https://stackoverflow.com/questions/8501309/android-get-bitmap-or-sound-from-assets

    //EXIT APPLICATION: https://stackoverflow.com/questions/6330200/how-to-quit-android-application-programmatically
    //IDEAS:
    //fling: https://code.tutsplus.com/tutorials/adding-physics-based-animations-to-android-apps--cms-29053
    //https://www.udemy.com/libgdx-game-development-masterclass/
}
