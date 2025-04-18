package h1;

import e1.t0;
import g1.b0;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public abstract class k {

    /* renamed from: a, reason: collision with root package name */
    public static final String f30754a;

    /* renamed from: b, reason: collision with root package name */
    public static final long f30755b;

    /* renamed from: c, reason: collision with root package name */
    public static final int f30756c;
    public static final int d;
    public static final long e;

    /* renamed from: f, reason: collision with root package name */
    public static final f f30757f;

    /* renamed from: g, reason: collision with root package name */
    public static final i f30758g;

    /* renamed from: h, reason: collision with root package name */
    public static final i f30759h;

    static {
        String str;
        int i2 = b0.f30594a;
        try {
            str = System.getProperty("kotlinx.coroutines.scheduler.default.name");
        } catch (SecurityException unused) {
            str = null;
        }
        if (str == null) {
            str = "DefaultDispatcher";
        }
        f30754a = str;
        f30755b = t0.B(100000L, 1L, Long.MAX_VALUE, "kotlinx.coroutines.scheduler.resolution.ns");
        int i3 = b0.f30594a;
        if (i3 < 2) {
            i3 = 2;
        }
        f30756c = t0.C("kotlinx.coroutines.scheduler.core.pool.size", i3, 1, 0, 8);
        d = t0.C("kotlinx.coroutines.scheduler.max.pool.size", 2097150, 0, 2097150, 4);
        e = TimeUnit.SECONDS.toNanos(t0.B(60L, 1L, Long.MAX_VALUE, "kotlinx.coroutines.scheduler.keep.alive.sec"));
        f30757f = f.f30748a;
        f30758g = new i(0);
        f30759h = new i(1);
    }
}
