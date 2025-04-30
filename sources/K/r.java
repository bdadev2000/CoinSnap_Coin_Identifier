package k;

import android.app.Activity;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import java.util.Objects;

/* loaded from: classes.dex */
public abstract class r {
    public static OnBackInvokedDispatcher a(Activity activity) {
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        onBackInvokedDispatcher = activity.getOnBackInvokedDispatcher();
        return onBackInvokedDispatcher;
    }

    public static OnBackInvokedCallback b(Object obj, w wVar) {
        Objects.requireNonNull(wVar);
        M3.d dVar = new M3.d(wVar, 2);
        M3.c.i(obj).registerOnBackInvokedCallback(1000000, dVar);
        return dVar;
    }

    public static void c(Object obj, Object obj2) {
        M3.c.i(obj).unregisterOnBackInvokedCallback(M3.c.e(obj2));
    }
}
