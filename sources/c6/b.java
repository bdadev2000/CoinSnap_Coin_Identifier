package c6;

import android.app.Application;
import com.facebook.internal.t;
import com.facebook.internal.v;
import java.lang.ref.WeakReference;
import java.util.UUID;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public abstract class b {
    public static final String a;

    /* renamed from: b, reason: collision with root package name */
    public static final ScheduledExecutorService f2617b;

    /* renamed from: c, reason: collision with root package name */
    public static volatile ScheduledFuture f2618c;

    /* renamed from: d, reason: collision with root package name */
    public static final Object f2619d;

    /* renamed from: e, reason: collision with root package name */
    public static final AtomicInteger f2620e;

    /* renamed from: f, reason: collision with root package name */
    public static volatile l f2621f;

    /* renamed from: g, reason: collision with root package name */
    public static final AtomicBoolean f2622g;

    /* renamed from: h, reason: collision with root package name */
    public static String f2623h;

    /* renamed from: i, reason: collision with root package name */
    public static long f2624i;

    /* renamed from: j, reason: collision with root package name */
    public static int f2625j;

    /* renamed from: k, reason: collision with root package name */
    public static WeakReference f2626k;

    static {
        String canonicalName = b.class.getCanonicalName();
        if (canonicalName == null) {
            canonicalName = "com.facebook.appevents.internal.ActivityLifecycleTracker";
        }
        a = canonicalName;
        f2617b = Executors.newSingleThreadScheduledExecutor();
        f2619d = new Object();
        f2620e = new AtomicInteger(0);
        f2622g = new AtomicBoolean(false);
    }

    public static final UUID a() {
        l lVar;
        if (f2621f == null || (lVar = f2621f) == null) {
            return null;
        }
        return lVar.f2660c;
    }

    public static final void b(Application application, String str) {
        Intrinsics.checkNotNullParameter(application, "application");
        if (!f2622g.compareAndSet(false, true)) {
            return;
        }
        v vVar = v.a;
        v.a(new com.facebook.appevents.m(3), t.CodelessEvents);
        f2623h = str;
        application.registerActivityLifecycleCallbacks(new d3.f(2));
    }
}
