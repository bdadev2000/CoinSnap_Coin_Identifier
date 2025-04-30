package X7;

import V7.w;
import androidx.work.o;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public abstract class k {

    /* renamed from: a, reason: collision with root package name */
    public static final String f3735a;
    public static final long b;

    /* renamed from: c, reason: collision with root package name */
    public static final int f3736c;

    /* renamed from: d, reason: collision with root package name */
    public static final int f3737d;

    /* renamed from: e, reason: collision with root package name */
    public static final long f3738e;

    /* renamed from: f, reason: collision with root package name */
    public static final g f3739f;

    /* renamed from: g, reason: collision with root package name */
    public static final o f3740g;

    /* renamed from: h, reason: collision with root package name */
    public static final o f3741h;

    static {
        String str;
        int i9 = w.f3542a;
        try {
            str = System.getProperty("kotlinx.coroutines.scheduler.default.name");
        } catch (SecurityException unused) {
            str = null;
        }
        if (str == null) {
            str = "DefaultDispatcher";
        }
        f3735a = str;
        b = V7.a.i(100000L, 1L, Long.MAX_VALUE, "kotlinx.coroutines.scheduler.resolution.ns");
        int i10 = w.f3542a;
        if (i10 < 2) {
            i10 = 2;
        }
        f3736c = V7.a.j("kotlinx.coroutines.scheduler.core.pool.size", i10, 1, 0, 8);
        f3737d = V7.a.j("kotlinx.coroutines.scheduler.max.pool.size", 2097150, 0, 2097150, 4);
        f3738e = TimeUnit.SECONDS.toNanos(V7.a.i(60L, 1L, Long.MAX_VALUE, "kotlinx.coroutines.scheduler.keep.alive.sec"));
        f3739f = g.f3731a;
        f3740g = new o(0);
        f3741h = new o(1);
    }
}
