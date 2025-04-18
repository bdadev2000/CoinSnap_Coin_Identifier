package c1;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import d0.m;
import kotlin.jvm.internal.q;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes4.dex */
public abstract class g {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f22412a = 0;

    @Nullable
    private static volatile Choreographer choreographer;

    static {
        Object d;
        try {
            d = new e(a(Looper.getMainLooper()));
        } catch (Throwable th) {
            d = q.d(th);
        }
        if (d instanceof m) {
            d = null;
        }
    }

    public static final Handler a(Looper looper) {
        if (Build.VERSION.SDK_INT < 28) {
            try {
                return (Handler) Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(looper, null, Boolean.TRUE);
            } catch (NoSuchMethodException unused) {
                return new Handler(looper);
            }
        }
        Object invoke = Handler.class.getDeclaredMethod("createAsync", Looper.class).invoke(null, looper);
        p0.a.q(invoke, "null cannot be cast to non-null type android.os.Handler");
        return (Handler) invoke;
    }
}
