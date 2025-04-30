package r;

import P.i;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import e1.f;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* renamed from: r.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2652c extends f {

    /* renamed from: a, reason: collision with root package name */
    public final Object f22810a = new Object();
    public final ExecutorService b = Executors.newFixedThreadPool(4, new ThreadFactoryC2651b());

    /* renamed from: c, reason: collision with root package name */
    public volatile Handler f22811c;

    public static Handler v(Looper looper) {
        if (Build.VERSION.SDK_INT >= 28) {
            return i.b(looper);
        }
        try {
            return (Handler) Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(looper, null, Boolean.TRUE);
        } catch (IllegalAccessException | InstantiationException | NoSuchMethodException unused) {
            return new Handler(looper);
        } catch (InvocationTargetException unused2) {
            return new Handler(looper);
        }
    }
}
