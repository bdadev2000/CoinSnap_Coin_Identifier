package R7;

import G7.j;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import t7.AbstractC2712a;
import t7.C2721j;

/* loaded from: classes3.dex */
public abstract class d {
    private static volatile Choreographer choreographer;

    static {
        Object b;
        try {
            b = new c(a(Looper.getMainLooper()));
        } catch (Throwable th) {
            b = AbstractC2712a.b(th);
        }
        if (b instanceof C2721j) {
            b = null;
        }
    }

    public static final Handler a(Looper looper) {
        if (Build.VERSION.SDK_INT >= 28) {
            Object invoke = Handler.class.getDeclaredMethod("createAsync", Looper.class).invoke(null, looper);
            j.c(invoke, "null cannot be cast to non-null type android.os.Handler");
            return (Handler) invoke;
        }
        try {
            return (Handler) Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(looper, null, Boolean.TRUE);
        } catch (NoSuchMethodException unused) {
            return new Handler(looper);
        }
    }
}
