package a20_pc24.city;

import android.app.Application;
import android.content.Context;

/**
 * Clase de apoyo
 *
 * Fuente: https://stackoverflow.com/questions/2002288/static-way-to-get-context-in-android
 *
 * Esta clase nos permite llamar a "context" desde cualquier clase
 */

public class _Context extends Application {
    private static Context context;

    public void onCreate() {
        super.onCreate();
        _Context.context = getApplicationContext();
    }
    public static Context getAppContext() {
        return _Context.context;
    }
}