package y0;

import G7.j;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.util.Log;
import android.view.InputEvent;
import w0.C2860a;

/* loaded from: classes.dex */
public abstract class e {
    public static final d a(Context context) {
        int i9;
        A0.d dVar;
        j.e(context, "context");
        StringBuilder sb = new StringBuilder("AdServicesInfo.version=");
        int i10 = Build.VERSION.SDK_INT;
        C2860a c2860a = C2860a.f23658a;
        int i11 = 0;
        if (i10 >= 30) {
            i9 = c2860a.a();
        } else {
            i9 = 0;
        }
        sb.append(i9);
        Log.d("MeasurementManager", sb.toString());
        if (i10 >= 30) {
            i11 = c2860a.a();
        }
        if (i11 >= 5) {
            dVar = new A0.d(context);
        } else {
            dVar = null;
        }
        if (dVar == null) {
            return null;
        }
        return new d(dVar);
    }

    public abstract f4.c b();

    public abstract f4.c c(Uri uri, InputEvent inputEvent);

    public abstract f4.c d(Uri uri);
}
