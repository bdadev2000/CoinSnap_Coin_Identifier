package d3;

import a6.i;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.util.Log;
import com.adjust.sdk.Adjust;
import com.applovin.impl.iu;
import com.applovin.impl.sdk.g0;
import com.facebook.appevents.h;
import com.facebook.internal.d0;
import com.facebook.internal.m;
import com.facebook.internal.z;
import com.facebook.m0;
import com.facebook.x;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.Timer;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import x5.k;
import x5.l;

/* loaded from: classes.dex */
public final class f implements Application.ActivityLifecycleCallbacks {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f16809b;

    public /* synthetic */ f(int i10) {
        this.f16809b = i10;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        switch (this.f16809b) {
            case 0:
                return;
            case 1:
                Intrinsics.checkNotNullParameter(activity, "activity");
                return;
            default:
                Intrinsics.checkNotNullParameter(activity, "activity");
                m mVar = d0.f11030d;
                m.n(m0.APP_EVENTS, c6.b.a, "onActivityCreated");
                c6.b.f2617b.execute(new g0(10));
                return;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        switch (this.f16809b) {
            case 0:
                return;
            case 1:
                Intrinsics.checkNotNullParameter(activity, "activity");
                return;
            default:
                Intrinsics.checkNotNullParameter(activity, "activity");
                m mVar = d0.f11030d;
                m.n(m0.APP_EVENTS, c6.b.a, "onActivityDestroyed");
                x5.d dVar = x5.d.a;
                if (!m6.a.b(x5.d.class)) {
                    try {
                        Intrinsics.checkNotNullParameter(activity, "activity");
                        x5.g C = x5.g.f27387f.C();
                        if (!m6.a.b(C)) {
                            try {
                                Intrinsics.checkNotNullParameter(activity, "activity");
                                C.f27392e.remove(Integer.valueOf(activity.hashCode()));
                                return;
                            } catch (Throwable th2) {
                                m6.a.a(C, th2);
                                return;
                            }
                        }
                        return;
                    } catch (Throwable th3) {
                        m6.a.a(x5.d.class, th3);
                        return;
                    }
                }
                return;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        ScheduledFuture scheduledFuture;
        switch (this.f16809b) {
            case 0:
                Adjust.onPause();
                return;
            case 1:
                Intrinsics.checkNotNullParameter(activity, "activity");
                return;
            default:
                Intrinsics.checkNotNullParameter(activity, "activity");
                m mVar = d0.f11030d;
                m0 m0Var = m0.APP_EVENTS;
                String str = c6.b.a;
                m.n(m0Var, str, "onActivityPaused");
                AtomicInteger atomicInteger = c6.b.f2620e;
                int i10 = 0;
                if (atomicInteger.decrementAndGet() < 0) {
                    atomicInteger.set(0);
                    Log.w(str, "Unexpected activity pause without a matching activity resume. Logging data may be incorrect. Make sure you call activateApp from your Application's onCreate method");
                }
                synchronized (c6.b.f2619d) {
                    if (c6.b.f2618c != null && (scheduledFuture = c6.b.f2618c) != null) {
                        scheduledFuture.cancel(false);
                    }
                    c6.b.f2618c = null;
                    Unit unit = Unit.INSTANCE;
                }
                long currentTimeMillis = System.currentTimeMillis();
                String k10 = com.facebook.internal.m0.k(activity);
                x5.d dVar = x5.d.a;
                if (!m6.a.b(x5.d.class)) {
                    try {
                        Intrinsics.checkNotNullParameter(activity, "activity");
                        if (x5.d.f27379f.get()) {
                            x5.g.f27387f.C().c(activity);
                            k kVar = x5.d.f27377d;
                            if (kVar != null && !m6.a.b(kVar)) {
                                try {
                                    if (((Activity) kVar.f27405b.get()) != null) {
                                        try {
                                            Timer timer = kVar.f27406c;
                                            if (timer != null) {
                                                timer.cancel();
                                            }
                                            kVar.f27406c = null;
                                        } catch (Exception e2) {
                                            Log.e(k.f27404e, "Error unscheduling indexing job", e2);
                                        }
                                    }
                                } catch (Throwable th2) {
                                    m6.a.a(kVar, th2);
                                }
                            }
                            SensorManager sensorManager = x5.d.f27376c;
                            if (sensorManager != null) {
                                sensorManager.unregisterListener(x5.d.f27375b);
                            }
                        }
                    } catch (Throwable th3) {
                        m6.a.a(x5.d.class, th3);
                    }
                }
                c6.b.f2617b.execute(new c6.a(currentTimeMillis, k10, i10));
                return;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        Boolean bool;
        ScheduledFuture scheduledFuture;
        int i10 = 6;
        switch (this.f16809b) {
            case 0:
                Adjust.onResume();
                return;
            case 1:
                Intrinsics.checkNotNullParameter(activity, "activity");
                try {
                    x.c().execute(new g0(i10));
                    return;
                } catch (Exception unused) {
                    return;
                }
            default:
                Intrinsics.checkNotNullParameter(activity, "activity");
                m mVar = d0.f11030d;
                m.n(m0.APP_EVENTS, c6.b.a, "onActivityResumed");
                Intrinsics.checkNotNullParameter(activity, "activity");
                c6.b.f2626k = new WeakReference(activity);
                c6.b.f2620e.incrementAndGet();
                synchronized (c6.b.f2619d) {
                    if (c6.b.f2618c != null && (scheduledFuture = c6.b.f2618c) != null) {
                        scheduledFuture.cancel(false);
                    }
                    bool = null;
                    c6.b.f2618c = null;
                    Unit unit = Unit.INSTANCE;
                }
                long currentTimeMillis = System.currentTimeMillis();
                c6.b.f2624i = currentTimeMillis;
                String k10 = com.facebook.internal.m0.k(activity);
                x5.d dVar = x5.d.a;
                if (!m6.a.b(x5.d.class)) {
                    try {
                        Intrinsics.checkNotNullParameter(activity, "activity");
                        if (x5.d.f27379f.get()) {
                            x5.g.f27387f.C().a(activity);
                            Context applicationContext = activity.getApplicationContext();
                            String b3 = x.b();
                            com.facebook.internal.x b10 = z.b(b3);
                            if (b10 != null) {
                                bool = Boolean.valueOf(b10.f11127h);
                            }
                            boolean areEqual = Intrinsics.areEqual(bool, Boolean.TRUE);
                            x5.d dVar2 = x5.d.a;
                            if (!areEqual) {
                                m6.a.b(dVar2);
                            } else {
                                SensorManager sensorManager = (SensorManager) applicationContext.getSystemService("sensor");
                                if (sensorManager != null) {
                                    x5.d.f27376c = sensorManager;
                                    Sensor defaultSensor = sensorManager.getDefaultSensor(1);
                                    k kVar = new k(activity);
                                    x5.d.f27377d = kVar;
                                    l lVar = x5.d.f27375b;
                                    androidx.fragment.app.e eVar = new androidx.fragment.app.e(i10, b10, b3);
                                    if (!m6.a.b(lVar)) {
                                        try {
                                            lVar.f27408b = eVar;
                                        } catch (Throwable th2) {
                                            m6.a.a(lVar, th2);
                                        }
                                    }
                                    sensorManager.registerListener(lVar, defaultSensor, 2);
                                    if (b10 != null && b10.f11127h) {
                                        kVar.c();
                                    }
                                }
                            }
                            m6.a.b(dVar2);
                        }
                    } catch (Throwable th3) {
                        m6.a.a(x5.d.class, th3);
                    }
                }
                v5.a aVar = v5.a.f26027b;
                if (!m6.a.b(v5.a.class)) {
                    try {
                        Intrinsics.checkNotNullParameter(activity, "activity");
                        try {
                            if (v5.a.f26028c) {
                                CopyOnWriteArraySet copyOnWriteArraySet = v5.c.f26033d;
                                if (!new HashSet(v5.c.a()).isEmpty()) {
                                    v5.d.f26036g.L(activity);
                                }
                            }
                        } catch (Exception unused2) {
                        }
                    } catch (Throwable th4) {
                        m6.a.a(v5.a.class, th4);
                    }
                }
                g6.d.d(activity);
                i.a();
                c6.b.f2617b.execute(new iu(currentTimeMillis, activity.getApplicationContext(), k10));
                return;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle outState) {
        switch (this.f16809b) {
            case 0:
                return;
            case 1:
                Intrinsics.checkNotNullParameter(activity, "activity");
                Intrinsics.checkNotNullParameter(outState, "outState");
                return;
            default:
                Intrinsics.checkNotNullParameter(activity, "activity");
                Intrinsics.checkNotNullParameter(outState, "outState");
                m mVar = d0.f11030d;
                m.n(m0.APP_EVENTS, c6.b.a, "onActivitySaveInstanceState");
                return;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        switch (this.f16809b) {
            case 0:
                return;
            case 1:
                Intrinsics.checkNotNullParameter(activity, "activity");
                return;
            default:
                Intrinsics.checkNotNullParameter(activity, "activity");
                c6.b.f2625j++;
                m mVar = d0.f11030d;
                m.n(m0.APP_EVENTS, c6.b.a, "onActivityStarted");
                return;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        switch (this.f16809b) {
            case 0:
                return;
            case 1:
                Intrinsics.checkNotNullParameter(activity, "activity");
                try {
                    if (Intrinsics.areEqual(a6.b.f245c, Boolean.TRUE) && Intrinsics.areEqual(activity.getLocalClassName(), "com.android.billingclient.api.ProxyBillingActivity")) {
                        x.c().execute(new g0(7));
                        return;
                    }
                    return;
                } catch (Exception unused) {
                    return;
                }
            default:
                Intrinsics.checkNotNullParameter(activity, "activity");
                m mVar = d0.f11030d;
                m.n(m0.APP_EVENTS, c6.b.a, "onActivityStopped");
                com.facebook.c cVar = com.facebook.appevents.k.f10950b;
                String str = com.facebook.appevents.l.f10951c;
                kc.c cVar2 = h.a;
                if (!m6.a.b(h.class)) {
                    try {
                        h.f10943b.execute(new g0(3));
                    } catch (Throwable th2) {
                        m6.a.a(h.class, th2);
                    }
                }
                c6.b.f2625j--;
                return;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f() {
        this(0);
        this.f16809b = 0;
    }
}
