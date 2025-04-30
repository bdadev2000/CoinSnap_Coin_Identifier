package z2;

import android.hardware.SensorManager;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: c, reason: collision with root package name */
    public static SensorManager f24509c;

    /* renamed from: d, reason: collision with root package name */
    public static k f24510d;

    /* renamed from: e, reason: collision with root package name */
    public static String f24511e;

    /* renamed from: h, reason: collision with root package name */
    public static volatile boolean f24514h;

    /* renamed from: a, reason: collision with root package name */
    public static final d f24508a = new Object();
    public static final l b = new Object();

    /* renamed from: f, reason: collision with root package name */
    public static final AtomicBoolean f24512f = new AtomicBoolean(true);

    /* renamed from: g, reason: collision with root package name */
    public static final AtomicBoolean f24513g = new AtomicBoolean(false);

    public static final String a() {
        if (O2.a.b(d.class)) {
            return null;
        }
        try {
            if (f24511e == null) {
                f24511e = UUID.randomUUID().toString();
            }
            String str = f24511e;
            if (str != null) {
                return str;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
        } catch (Throwable th) {
            O2.a.a(d.class, th);
            return null;
        }
    }
}
