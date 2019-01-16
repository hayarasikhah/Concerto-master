package concertoapp.sttnf;

import android.app.Application;
import android.support.multidex.MultiDex;

/**
 * Created by Haya Rasikhah on 1/9/2019.
 */

public class Concerto extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        MultiDex.install(this);
    }
}
