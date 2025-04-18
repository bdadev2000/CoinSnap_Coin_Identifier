package androidx.tracing;

import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes4.dex */
public final class Trace {

    /* renamed from: a, reason: collision with root package name */
    public static long f21513a;

    /* renamed from: b, reason: collision with root package name */
    public static Method f21514b;

    public static boolean a() {
        boolean isEnabled;
        try {
            if (f21514b == null) {
                isEnabled = android.os.Trace.isEnabled();
                return isEnabled;
            }
        } catch (NoClassDefFoundError | NoSuchMethodError unused) {
        }
        try {
            if (f21514b == null) {
                f21513a = android.os.Trace.class.getField("TRACE_TAG_APP").getLong(null);
                f21514b = android.os.Trace.class.getMethod("isTagEnabled", Long.TYPE);
            }
            return ((Boolean) f21514b.invoke(null, Long.valueOf(f21513a))).booleanValue();
        } catch (Exception e) {
            if (!(e instanceof InvocationTargetException)) {
                Log.v("Trace", "Unable to call isTagEnabled via reflection", e);
                return false;
            }
            Throwable cause = e.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            throw new RuntimeException(cause);
        }
    }
}
