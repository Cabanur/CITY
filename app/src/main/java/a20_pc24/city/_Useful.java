package a20_pc24.city;

import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

import java.io.IOException;
import java.io.InputStream;

public class _Useful {

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
    //Origen: https://stackoverflow.com/questions/8501309/android-get-bitmap-or-sound-from-assets


    //https://gamedevelopment.tutsplus.com/tutorials/an-introduction-to-creating-a-tile-map-engine--gamedev-10900
}
