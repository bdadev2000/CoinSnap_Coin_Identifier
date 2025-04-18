package l;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* loaded from: classes.dex */
public final class d extends va.b {

    /* renamed from: i, reason: collision with root package name */
    public final Object f21088i = new Object();

    /* renamed from: j, reason: collision with root package name */
    public final ExecutorService f21089j = Executors.newFixedThreadPool(4, new c(this));

    /* renamed from: k, reason: collision with root package name */
    public volatile Handler f21090k;

    public static Handler u(Looper looper) {
        Handler createAsync;
        if (Build.VERSION.SDK_INT >= 28) {
            createAsync = Handler.createAsync(looper);
            return createAsync;
        }
        try {
            return (Handler) Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(looper, null, Boolean.TRUE);
        } catch (IllegalAccessException | InstantiationException | NoSuchMethodException unused) {
            return new Handler(looper);
        } catch (InvocationTargetException unused2) {
            return new Handler(looper);
        }
    }

    public final void v(Runnable runnable) {
        this.f21089j.execute(runnable);
    }
}
