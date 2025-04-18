package androidx.core.os;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import androidx.annotation.RequiresApi;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes3.dex */
public final class HandlerCompat {

    @RequiresApi
    /* loaded from: classes3.dex */
    public static class Api28Impl {
        public static Handler a(Looper looper) {
            return Handler.createAsync(looper);
        }
    }

    @RequiresApi
    /* loaded from: classes3.dex */
    public static class Api29Impl {
    }

    public static Handler a(Looper looper) {
        if (Build.VERSION.SDK_INT >= 28) {
            return Api28Impl.a(looper);
        }
        try {
            return (Handler) Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(looper, null, Boolean.TRUE);
        } catch (IllegalAccessException e) {
            e = e;
            Log.w("HandlerCompat", "Unable to invoke Handler(Looper, Callback, boolean) constructor", e);
            return new Handler(looper);
        } catch (InstantiationException e2) {
            e = e2;
            Log.w("HandlerCompat", "Unable to invoke Handler(Looper, Callback, boolean) constructor", e);
            return new Handler(looper);
        } catch (NoSuchMethodException e3) {
            e = e3;
            Log.w("HandlerCompat", "Unable to invoke Handler(Looper, Callback, boolean) constructor", e);
            return new Handler(looper);
        } catch (InvocationTargetException e4) {
            Throwable cause = e4.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            throw new RuntimeException(cause);
        }
    }
}
