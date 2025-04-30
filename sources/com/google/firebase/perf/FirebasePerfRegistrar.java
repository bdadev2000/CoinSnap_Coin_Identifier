package com.google.firebase.perf;

import B3.k;
import R3.e;
import U4.y;
import W4.a;
import W4.b;
import W4.d;
import android.app.Application;
import android.content.Context;
import androidx.annotation.Keep;
import androidx.lifecycle.I;
import com.bumptech.glide.c;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.perf.metrics.AppStartTrace;
import com.google.firebase.perf.session.SessionManager;
import g4.C2291a;
import g4.C2296f;
import g5.C2303f;
import h3.f;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import o4.C2495a;
import o4.C2496b;
import o4.C2502h;
import o4.InterfaceC2497c;
import o4.q;
import r7.C2681a;

@Keep
/* loaded from: classes2.dex */
public class FirebasePerfRegistrar implements ComponentRegistrar {
    private static final String EARLY_LIBRARY_NAME = "fire-perf-early";
    private static final String LIBRARY_NAME = "fire-perf";

    /* JADX WARN: Type inference failed for: r1v0, types: [W4.a, java.lang.Object] */
    public static a lambda$getComponents$0(q qVar, InterfaceC2497c interfaceC2497c) {
        AppStartTrace appStartTrace;
        boolean z8;
        C2296f c2296f = (C2296f) interfaceC2497c.b(C2296f.class);
        C2291a c2291a = (C2291a) interfaceC2497c.c(C2291a.class).get();
        Executor executor = (Executor) interfaceC2497c.f(qVar);
        ?? obj = new Object();
        c2296f.a();
        Context context = c2296f.f20433a;
        Y4.a e4 = Y4.a.e();
        e4.getClass();
        Y4.a.f3788d.b = c.N(context);
        e4.f3791c.c(context);
        X4.c a6 = X4.c.a();
        synchronized (a6) {
            if (!a6.f3690r) {
                Context applicationContext = context.getApplicationContext();
                if (applicationContext instanceof Application) {
                    ((Application) applicationContext).registerActivityLifecycleCallbacks(a6);
                    a6.f3690r = true;
                }
            }
        }
        Object obj2 = new Object();
        synchronized (a6.f3683i) {
            a6.f3683i.add(obj2);
        }
        if (c2291a != null) {
            if (AppStartTrace.f14339A != null) {
                appStartTrace = AppStartTrace.f14339A;
            } else {
                C2303f c2303f = C2303f.f20472u;
                e eVar = new e(24);
                if (AppStartTrace.f14339A == null) {
                    synchronized (AppStartTrace.class) {
                        try {
                            if (AppStartTrace.f14339A == null) {
                                AppStartTrace.f14339A = new AppStartTrace(c2303f, eVar, Y4.a.e(), new ThreadPoolExecutor(0, 1, AppStartTrace.f14342z + 10, TimeUnit.SECONDS, new LinkedBlockingQueue()));
                            }
                        } finally {
                        }
                    }
                }
                appStartTrace = AppStartTrace.f14339A;
            }
            synchronized (appStartTrace) {
                if (!appStartTrace.b) {
                    I.f4828k.f4833h.a(appStartTrace);
                    Context applicationContext2 = context.getApplicationContext();
                    if (applicationContext2 instanceof Application) {
                        ((Application) applicationContext2).registerActivityLifecycleCallbacks(appStartTrace);
                        if (!appStartTrace.f14361x && !AppStartTrace.f((Application) applicationContext2)) {
                            z8 = false;
                            appStartTrace.f14361x = z8;
                            appStartTrace.b = true;
                            appStartTrace.f14347h = (Application) applicationContext2;
                        }
                        z8 = true;
                        appStartTrace.f14361x = z8;
                        appStartTrace.b = true;
                        appStartTrace.f14347h = (Application) applicationContext2;
                    }
                }
            }
            executor.execute(new k(appStartTrace, 10));
        }
        SessionManager.getInstance().initializeGaugeCollection();
        return obj;
    }

    public static b providesFirebasePerformance(InterfaceC2497c interfaceC2497c) {
        interfaceC2497c.b(a.class);
        y yVar = new y((C2296f) interfaceC2497c.b(C2296f.class), (O4.e) interfaceC2497c.b(O4.e.class), interfaceC2497c.c(k5.k.class), interfaceC2497c.c(f.class));
        return (b) ((C2681a) C2681a.a(new Z4.a(new d(new Z4.a(yVar, 1), new Z4.a(yVar, 3), new Z4.a(yVar, 2), new Z4.a(yVar, 6), new Z4.a(yVar, 4), new Z4.a(yVar, 0), new Z4.a(yVar, 5)), 7))).get();
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    @Keep
    public List<C2496b> getComponents() {
        q qVar = new q(n4.d.class, Executor.class);
        C2495a a6 = C2496b.a(b.class);
        a6.f21938a = LIBRARY_NAME;
        a6.a(C2502h.b(C2296f.class));
        a6.a(new C2502h(k5.k.class, 1, 1));
        a6.a(C2502h.b(O4.e.class));
        a6.a(new C2502h(f.class, 1, 1));
        a6.a(C2502h.b(a.class));
        a6.f21942f = new A4.a(21);
        C2496b b = a6.b();
        C2495a a9 = C2496b.a(a.class);
        a9.f21938a = EARLY_LIBRARY_NAME;
        a9.a(C2502h.b(C2296f.class));
        a9.a(C2502h.a(C2291a.class));
        a9.a(new C2502h(qVar, 1, 0));
        a9.c(2);
        a9.f21942f = new L4.b(qVar, 2);
        return Arrays.asList(b, a9.b(), R2.b.k(LIBRARY_NAME, "21.0.1"));
    }
}
