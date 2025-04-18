package x5;

import android.hardware.SensorManager;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes3.dex */
public final class d {

    /* renamed from: c, reason: collision with root package name */
    public static SensorManager f27376c;

    /* renamed from: d, reason: collision with root package name */
    public static k f27377d;

    /* renamed from: e, reason: collision with root package name */
    public static String f27378e;

    /* renamed from: h, reason: collision with root package name */
    public static volatile boolean f27381h;
    public static final d a = new d();

    /* renamed from: b, reason: collision with root package name */
    public static final l f27375b = new l();

    /* renamed from: f, reason: collision with root package name */
    public static final AtomicBoolean f27379f = new AtomicBoolean(true);

    /* renamed from: g, reason: collision with root package name */
    public static final AtomicBoolean f27380g = new AtomicBoolean(false);

    public static final String a() {
        if (m6.a.b(d.class)) {
            return null;
        }
        try {
            if (f27378e == null) {
                f27378e = UUID.randomUUID().toString();
            }
            String str = f27378e;
            if (str != null) {
                return str;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
        } catch (Throwable th2) {
            m6.a.a(d.class, th2);
            return null;
        }
    }
}
