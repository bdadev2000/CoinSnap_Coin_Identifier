package E2;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.util.Log;
import com.facebook.H;
import com.facebook.internal.t;
import com.facebook.internal.w;
import com.facebook.internal.z;
import com.facebook.r;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Timer;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicInteger;
import x2.C2916a;
import x2.C2918c;
import x2.ViewTreeObserverOnGlobalFocusChangeListenerC2919d;

/* loaded from: classes.dex */
public final class c implements Application.ActivityLifecycleCallbacks {
    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        G7.j.e(activity, "activity");
        L4.f fVar = z.f13680c;
        L4.f.l(H.f13413f, d.f980a, "onActivityCreated");
        d.b.execute(new C2.b(4));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        G7.j.e(activity, "activity");
        L4.f fVar = z.f13680c;
        L4.f.l(H.f13413f, d.f980a, "onActivityDestroyed");
        z2.d dVar = z2.d.f24508a;
        if (!O2.a.b(z2.d.class)) {
            try {
                z2.g a6 = z2.g.f24519f.a();
                if (!O2.a.b(a6)) {
                    try {
                        a6.f24524e.remove(Integer.valueOf(activity.hashCode()));
                    } catch (Throwable th) {
                        O2.a.a(a6, th);
                    }
                }
            } catch (Throwable th2) {
                O2.a.a(z2.d.class, th2);
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        int i9 = 0;
        G7.j.e(activity, "activity");
        L4.f fVar = z.f13680c;
        H h6 = H.f13413f;
        String str = d.f980a;
        L4.f.l(h6, str, "onActivityPaused");
        AtomicInteger atomicInteger = d.f983e;
        if (atomicInteger.decrementAndGet() < 0) {
            atomicInteger.set(0);
            Log.w(str, "Unexpected activity pause without a matching activity resume. Logging data may be incorrect. Make sure you call activateApp from your Application's onCreate method");
        }
        d.a();
        long currentTimeMillis = System.currentTimeMillis();
        String k6 = com.facebook.internal.H.k(activity);
        z2.d dVar = z2.d.f24508a;
        if (!O2.a.b(z2.d.class)) {
            try {
                if (z2.d.f24512f.get()) {
                    z2.g.f24519f.a().c(activity);
                    z2.k kVar = z2.d.f24510d;
                    if (kVar != null && !O2.a.b(kVar)) {
                        try {
                            if (((Activity) kVar.b.get()) != null) {
                                try {
                                    Timer timer = kVar.f24532c;
                                    if (timer != null) {
                                        timer.cancel();
                                    }
                                    kVar.f24532c = null;
                                } catch (Exception e4) {
                                    Log.e(z2.k.f24530e, "Error unscheduling indexing job", e4);
                                }
                            }
                        } catch (Throwable th) {
                            O2.a.a(kVar, th);
                        }
                    }
                    SensorManager sensorManager = z2.d.f24509c;
                    if (sensorManager != null) {
                        sensorManager.unregisterListener(z2.d.b);
                    }
                }
            } catch (Throwable th2) {
                O2.a.a(z2.d.class, th2);
            }
        }
        d.b.execute(new b(currentTimeMillis, k6, i9));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        Boolean valueOf;
        G7.j.e(activity, "activity");
        L4.f fVar = z.f13680c;
        L4.f.l(H.f13413f, d.f980a, "onActivityResumed");
        d.f989k = new WeakReference(activity);
        d.f983e.incrementAndGet();
        d.a();
        long currentTimeMillis = System.currentTimeMillis();
        d.f987i = currentTimeMillis;
        String k6 = com.facebook.internal.H.k(activity);
        z2.d dVar = z2.d.f24508a;
        if (!O2.a.b(z2.d.class)) {
            try {
                if (z2.d.f24512f.get()) {
                    z2.g.f24519f.a().a(activity);
                    Context applicationContext = activity.getApplicationContext();
                    String b = r.b();
                    t b8 = w.b(b);
                    if (b8 == null) {
                        valueOf = null;
                    } else {
                        valueOf = Boolean.valueOf(b8.f13663g);
                    }
                    boolean a6 = G7.j.a(valueOf, Boolean.TRUE);
                    z2.d dVar2 = z2.d.f24508a;
                    if (!a6) {
                        O2.a.b(dVar2);
                    } else {
                        SensorManager sensorManager = (SensorManager) applicationContext.getSystemService("sensor");
                        if (sensorManager != null) {
                            z2.d.f24509c = sensorManager;
                            Sensor defaultSensor = sensorManager.getDefaultSensor(1);
                            z2.k kVar = new z2.k(activity);
                            z2.d.f24510d = kVar;
                            z2.l lVar = z2.d.b;
                            F2.e eVar = new F2.e(16, b8, b);
                            if (!O2.a.b(lVar)) {
                                try {
                                    lVar.b = eVar;
                                } catch (Throwable th) {
                                    O2.a.a(lVar, th);
                                }
                            }
                            sensorManager.registerListener(lVar, defaultSensor, 2);
                            if (b8 != null && b8.f13663g) {
                                kVar.c();
                            }
                        }
                    }
                    O2.a.b(dVar2);
                }
            } catch (Throwable th2) {
                O2.a.a(z2.d.class, th2);
            }
        }
        if (!O2.a.b(C2916a.class)) {
            try {
                if (C2916a.b) {
                    CopyOnWriteArraySet copyOnWriteArraySet = C2918c.f24219d;
                    if (!new HashSet(C2918c.a()).isEmpty()) {
                        HashMap hashMap = ViewTreeObserverOnGlobalFocusChangeListenerC2919d.f24222g;
                        C2916a.b(activity);
                    }
                }
            } catch (Exception unused) {
            } catch (Throwable th3) {
                O2.a.a(C2916a.class, th3);
            }
        }
        I2.d.d(activity);
        C2.k.a();
        d.b.execute(new a(currentTimeMillis, activity.getApplicationContext(), k6));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        G7.j.e(activity, "activity");
        G7.j.e(bundle, "outState");
        L4.f fVar = z.f13680c;
        L4.f.l(H.f13413f, d.f980a, "onActivitySaveInstanceState");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        G7.j.e(activity, "activity");
        d.f988j++;
        L4.f fVar = z.f13680c;
        L4.f.l(H.f13413f, d.f980a, "onActivityStarted");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        G7.j.e(activity, "activity");
        L4.f fVar = z.f13680c;
        L4.f.l(H.f13413f, d.f980a, "onActivityStopped");
        String str = com.facebook.appevents.l.f13492c;
        D0.i iVar = com.facebook.appevents.h.f13483a;
        if (!O2.a.b(com.facebook.appevents.h.class)) {
            try {
                com.facebook.appevents.h.b.execute(new C2.b(13));
            } catch (Throwable th) {
                O2.a.a(com.facebook.appevents.h.class, th);
            }
        }
        d.f988j--;
    }
}
