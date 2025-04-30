package E2;

import android.app.Application;
import com.facebook.internal.p;
import com.facebook.internal.r;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.lang.ref.WeakReference;
import java.util.UUID;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    public static final String f980a;
    public static final ScheduledExecutorService b;

    /* renamed from: c, reason: collision with root package name */
    public static volatile ScheduledFuture f981c;

    /* renamed from: d, reason: collision with root package name */
    public static final Object f982d;

    /* renamed from: e, reason: collision with root package name */
    public static final AtomicInteger f983e;

    /* renamed from: f, reason: collision with root package name */
    public static volatile m f984f;

    /* renamed from: g, reason: collision with root package name */
    public static final AtomicBoolean f985g;

    /* renamed from: h, reason: collision with root package name */
    public static String f986h;

    /* renamed from: i, reason: collision with root package name */
    public static long f987i;

    /* renamed from: j, reason: collision with root package name */
    public static int f988j;

    /* renamed from: k, reason: collision with root package name */
    public static WeakReference f989k;

    static {
        String canonicalName = d.class.getCanonicalName();
        if (canonicalName == null) {
            canonicalName = "com.facebook.appevents.internal.ActivityLifecycleTracker";
        }
        f980a = canonicalName;
        b = Executors.newSingleThreadScheduledExecutor();
        f982d = new Object();
        f983e = new AtomicInteger(0);
        f985g = new AtomicBoolean(false);
    }

    public static void a() {
        ScheduledFuture scheduledFuture;
        synchronized (f982d) {
            try {
                if (f981c != null && (scheduledFuture = f981c) != null) {
                    scheduledFuture.cancel(false);
                }
                f981c = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static final UUID b() {
        m mVar;
        if (f984f == null || (mVar = f984f) == null) {
            return null;
        }
        return mVar.f1001c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v1, types: [android.app.Application$ActivityLifecycleCallbacks, java.lang.Object] */
    public static final void c(Application application, String str) {
        G7.j.e(application, MimeTypes.BASE_TYPE_APPLICATION);
        int i9 = 1;
        if (!f985g.compareAndSet(false, true)) {
            return;
        }
        r rVar = r.f13653a;
        r.a(new A4.a(i9), p.CodelessEvents);
        f986h = str;
        application.registerActivityLifecycleCallbacks(new Object());
    }
}
