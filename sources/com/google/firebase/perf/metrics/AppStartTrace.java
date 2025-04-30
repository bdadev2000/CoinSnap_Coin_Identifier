package com.google.firebase.perf.metrics;

import A4.d;
import R3.e;
import U3.n;
import Y4.a;
import a5.C0397a;
import android.R;
import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.os.Build;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.view.View;
import androidx.annotation.Keep;
import androidx.lifecycle.E;
import androidx.lifecycle.EnumC0503m;
import androidx.lifecycle.I;
import androidx.lifecycle.InterfaceC0510u;
import b5.b;
import com.google.firebase.perf.metrics.AppStartTrace;
import com.google.firebase.perf.session.SessionManager;
import com.google.firebase.perf.v1.TraceMetric;
import com.mbridge.msdk.foundation.entity.o;
import e5.C2221a;
import g4.C2291a;
import g4.C2296f;
import g5.C2303f;
import h5.ViewTreeObserverOnDrawListenerC2321b;
import h5.ViewTreeObserverOnPreDrawListenerC2324e;
import h5.i;
import i5.EnumC2355j;
import i5.J;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public class AppStartTrace implements Application.ActivityLifecycleCallbacks, InterfaceC0510u {

    /* renamed from: A, reason: collision with root package name */
    public static volatile AppStartTrace f14339A;

    /* renamed from: B, reason: collision with root package name */
    public static ExecutorService f14340B;

    /* renamed from: y, reason: collision with root package name */
    public static final i f14341y = new i();

    /* renamed from: z, reason: collision with root package name */
    public static final long f14342z = TimeUnit.MINUTES.toMicros(1);

    /* renamed from: c, reason: collision with root package name */
    public final C2303f f14343c;

    /* renamed from: d, reason: collision with root package name */
    public final e f14344d;

    /* renamed from: f, reason: collision with root package name */
    public final a f14345f;

    /* renamed from: g, reason: collision with root package name */
    public final J f14346g;

    /* renamed from: h, reason: collision with root package name */
    public Application f14347h;

    /* renamed from: j, reason: collision with root package name */
    public final i f14349j;

    /* renamed from: k, reason: collision with root package name */
    public final i f14350k;

    /* renamed from: t, reason: collision with root package name */
    public C2221a f14357t;
    public boolean b = false;

    /* renamed from: i, reason: collision with root package name */
    public boolean f14348i = false;
    public i l = null;
    public i m = null;

    /* renamed from: n, reason: collision with root package name */
    public i f14351n = null;

    /* renamed from: o, reason: collision with root package name */
    public i f14352o = null;

    /* renamed from: p, reason: collision with root package name */
    public i f14353p = null;

    /* renamed from: q, reason: collision with root package name */
    public i f14354q = null;

    /* renamed from: r, reason: collision with root package name */
    public i f14355r = null;

    /* renamed from: s, reason: collision with root package name */
    public i f14356s = null;

    /* renamed from: u, reason: collision with root package name */
    public boolean f14358u = false;

    /* renamed from: v, reason: collision with root package name */
    public int f14359v = 0;

    /* renamed from: w, reason: collision with root package name */
    public final b f14360w = new b(this);

    /* renamed from: x, reason: collision with root package name */
    public boolean f14361x = false;

    public AppStartTrace(C2303f c2303f, e eVar, a aVar, ThreadPoolExecutor threadPoolExecutor) {
        i iVar = null;
        this.f14343c = c2303f;
        this.f14344d = eVar;
        this.f14345f = aVar;
        f14340B = threadPoolExecutor;
        J newBuilder = TraceMetric.newBuilder();
        newBuilder.k("_experiment_app_start_ttid");
        this.f14346g = newBuilder;
        long startElapsedRealtime = Process.getStartElapsedRealtime();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        long micros = timeUnit.toMicros(startElapsedRealtime);
        long micros2 = timeUnit.toMicros(System.currentTimeMillis());
        TimeUnit timeUnit2 = TimeUnit.NANOSECONDS;
        this.f14349j = new i((micros - timeUnit2.toMicros(SystemClock.elapsedRealtimeNanos())) + micros2, micros);
        C2291a c2291a = (C2291a) C2296f.c().b(C2291a.class);
        if (c2291a != null) {
            long micros3 = timeUnit.toMicros(c2291a.b);
            iVar = new i((micros3 - timeUnit2.toMicros(SystemClock.elapsedRealtimeNanos())) + timeUnit.toMicros(System.currentTimeMillis()), micros3);
        }
        this.f14350k = iVar;
    }

    public static boolean f(Application application) {
        ActivityManager activityManager = (ActivityManager) application.getSystemService("activity");
        if (activityManager == null) {
            return true;
        }
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = activityManager.getRunningAppProcesses();
        if (runningAppProcesses != null) {
            String packageName = application.getPackageName();
            String j7 = o.j(packageName, ":");
            for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                if (runningAppProcessInfo.importance == 100 && (runningAppProcessInfo.processName.equals(packageName) || runningAppProcessInfo.processName.startsWith(j7))) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    @Keep
    public static void setLauncherActivityOnCreateTime(String str) {
    }

    @Keep
    public static void setLauncherActivityOnResumeTime(String str) {
    }

    @Keep
    public static void setLauncherActivityOnStartTime(String str) {
    }

    public final i d() {
        i iVar = this.f14350k;
        if (iVar != null) {
            return iVar;
        }
        return f14341y;
    }

    public final i e() {
        i iVar = this.f14349j;
        if (iVar != null) {
            return iVar;
        }
        return d();
    }

    public final void g(J j7) {
        if (this.f14354q != null && this.f14355r != null && this.f14356s != null) {
            f14340B.execute(new d(8, this, j7));
            h();
        }
    }

    public final synchronized void h() {
        if (!this.b) {
            return;
        }
        I.f4828k.f4833h.b(this);
        this.f14347h.unregisterActivityLifecycleCallbacks(this);
        this.b = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0040 A[Catch: all -> 0x001a, TRY_LEAVE, TryCatch #0 {all -> 0x001a, blocks: (B:3:0x0001, B:5:0x0005, B:8:0x000a, B:10:0x000f, B:14:0x001d, B:16:0x0040), top: B:2:0x0001 }] */
    @Override // android.app.Application.ActivityLifecycleCallbacks
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized void onActivityCreated(android.app.Activity r4, android.os.Bundle r5) {
        /*
            r3 = this;
            monitor-enter(r3)
            boolean r5 = r3.f14358u     // Catch: java.lang.Throwable -> L1a
            if (r5 != 0) goto L44
            h5.i r5 = r3.l     // Catch: java.lang.Throwable -> L1a
            if (r5 == 0) goto La
            goto L44
        La:
            boolean r5 = r3.f14361x     // Catch: java.lang.Throwable -> L1a
            r0 = 1
            if (r5 != 0) goto L1c
            android.app.Application r5 = r3.f14347h     // Catch: java.lang.Throwable -> L1a
            boolean r5 = f(r5)     // Catch: java.lang.Throwable -> L1a
            if (r5 == 0) goto L18
            goto L1c
        L18:
            r5 = 0
            goto L1d
        L1a:
            r4 = move-exception
            goto L46
        L1c:
            r5 = r0
        L1d:
            r3.f14361x = r5     // Catch: java.lang.Throwable -> L1a
            java.lang.ref.WeakReference r5 = new java.lang.ref.WeakReference     // Catch: java.lang.Throwable -> L1a
            r5.<init>(r4)     // Catch: java.lang.Throwable -> L1a
            R3.e r4 = r3.f14344d     // Catch: java.lang.Throwable -> L1a
            r4.getClass()     // Catch: java.lang.Throwable -> L1a
            h5.i r4 = new h5.i     // Catch: java.lang.Throwable -> L1a
            r4.<init>()     // Catch: java.lang.Throwable -> L1a
            r3.l = r4     // Catch: java.lang.Throwable -> L1a
            h5.i r4 = r3.e()     // Catch: java.lang.Throwable -> L1a
            h5.i r5 = r3.l     // Catch: java.lang.Throwable -> L1a
            long r4 = r4.d(r5)     // Catch: java.lang.Throwable -> L1a
            long r1 = com.google.firebase.perf.metrics.AppStartTrace.f14342z     // Catch: java.lang.Throwable -> L1a
            int r4 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r4 <= 0) goto L42
            r3.f14348i = r0     // Catch: java.lang.Throwable -> L1a
        L42:
            monitor-exit(r3)
            return
        L44:
            monitor-exit(r3)
            return
        L46:
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.perf.metrics.AppStartTrace.onActivityCreated(android.app.Activity, android.os.Bundle):void");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        if (!this.f14358u && !this.f14348i && this.f14345f.f()) {
            activity.findViewById(R.id.content).getViewTreeObserver().removeOnDrawListener(this.f14360w);
        }
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [b5.a] */
    /* JADX WARN: Type inference failed for: r3v5, types: [b5.a] */
    /* JADX WARN: Type inference failed for: r4v5, types: [b5.a] */
    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final synchronized void onActivityResumed(Activity activity) {
        try {
            if (!this.f14358u && !this.f14348i) {
                boolean f9 = this.f14345f.f();
                if (f9) {
                    View findViewById = activity.findViewById(R.id.content);
                    findViewById.getViewTreeObserver().addOnDrawListener(this.f14360w);
                    final int i9 = 0;
                    ViewTreeObserverOnDrawListenerC2321b viewTreeObserverOnDrawListenerC2321b = new ViewTreeObserverOnDrawListenerC2321b(findViewById, new Runnable(this) { // from class: b5.a

                        /* renamed from: c, reason: collision with root package name */
                        public final /* synthetic */ AppStartTrace f5320c;

                        {
                            this.f5320c = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            String str;
                            AppStartTrace appStartTrace = this.f5320c;
                            switch (i9) {
                                case 0:
                                    if (appStartTrace.f14356s == null) {
                                        appStartTrace.f14344d.getClass();
                                        appStartTrace.f14356s = new i();
                                        J newBuilder = TraceMetric.newBuilder();
                                        newBuilder.k("_experiment_onDrawFoQ");
                                        newBuilder.i(appStartTrace.e().b);
                                        newBuilder.j(appStartTrace.e().d(appStartTrace.f14356s));
                                        TraceMetric traceMetric = (TraceMetric) newBuilder.build();
                                        J j7 = appStartTrace.f14346g;
                                        j7.d(traceMetric);
                                        if (appStartTrace.f14349j != null) {
                                            J newBuilder2 = TraceMetric.newBuilder();
                                            newBuilder2.k("_experiment_procStart_to_classLoad");
                                            newBuilder2.i(appStartTrace.e().b);
                                            newBuilder2.j(appStartTrace.e().d(appStartTrace.d()));
                                            j7.d((TraceMetric) newBuilder2.build());
                                        }
                                        if (appStartTrace.f14361x) {
                                            str = "true";
                                        } else {
                                            str = "false";
                                        }
                                        j7.h(str);
                                        j7.g(appStartTrace.f14359v, "onDrawCount");
                                        j7.c(appStartTrace.f14357t.c());
                                        appStartTrace.g(j7);
                                        return;
                                    }
                                    return;
                                case 1:
                                    if (appStartTrace.f14354q == null) {
                                        appStartTrace.f14344d.getClass();
                                        appStartTrace.f14354q = new i();
                                        long j9 = appStartTrace.e().b;
                                        J j10 = appStartTrace.f14346g;
                                        j10.i(j9);
                                        j10.j(appStartTrace.e().d(appStartTrace.f14354q));
                                        appStartTrace.g(j10);
                                        return;
                                    }
                                    return;
                                case 2:
                                    if (appStartTrace.f14355r == null) {
                                        appStartTrace.f14344d.getClass();
                                        appStartTrace.f14355r = new i();
                                        J newBuilder3 = TraceMetric.newBuilder();
                                        newBuilder3.k("_experiment_preDrawFoQ");
                                        newBuilder3.i(appStartTrace.e().b);
                                        newBuilder3.j(appStartTrace.e().d(appStartTrace.f14355r));
                                        TraceMetric traceMetric2 = (TraceMetric) newBuilder3.build();
                                        J j11 = appStartTrace.f14346g;
                                        j11.d(traceMetric2);
                                        appStartTrace.g(j11);
                                        return;
                                    }
                                    return;
                                default:
                                    i iVar = AppStartTrace.f14341y;
                                    appStartTrace.getClass();
                                    J newBuilder4 = TraceMetric.newBuilder();
                                    newBuilder4.k("_as");
                                    newBuilder4.i(appStartTrace.d().b);
                                    newBuilder4.j(appStartTrace.d().d(appStartTrace.f14351n));
                                    ArrayList arrayList = new ArrayList(3);
                                    J newBuilder5 = TraceMetric.newBuilder();
                                    newBuilder5.k("_astui");
                                    newBuilder5.i(appStartTrace.d().b);
                                    newBuilder5.j(appStartTrace.d().d(appStartTrace.l));
                                    arrayList.add((TraceMetric) newBuilder5.build());
                                    if (appStartTrace.m != null) {
                                        J newBuilder6 = TraceMetric.newBuilder();
                                        newBuilder6.k("_astfd");
                                        newBuilder6.i(appStartTrace.l.b);
                                        newBuilder6.j(appStartTrace.l.d(appStartTrace.m));
                                        arrayList.add((TraceMetric) newBuilder6.build());
                                        J newBuilder7 = TraceMetric.newBuilder();
                                        newBuilder7.k("_asti");
                                        newBuilder7.i(appStartTrace.m.b);
                                        newBuilder7.j(appStartTrace.m.d(appStartTrace.f14351n));
                                        arrayList.add((TraceMetric) newBuilder7.build());
                                    }
                                    newBuilder4.b(arrayList);
                                    newBuilder4.c(appStartTrace.f14357t.c());
                                    appStartTrace.f14343c.c((TraceMetric) newBuilder4.build(), EnumC2355j.FOREGROUND_BACKGROUND);
                                    return;
                            }
                        }
                    });
                    if (Build.VERSION.SDK_INT < 26 && (!findViewById.getViewTreeObserver().isAlive() || !findViewById.isAttachedToWindow())) {
                        findViewById.addOnAttachStateChangeListener(new n(viewTreeObserverOnDrawListenerC2321b, 1));
                        final int i10 = 1;
                        final int i11 = 2;
                        findViewById.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserverOnPreDrawListenerC2324e(findViewById, new Runnable(this) { // from class: b5.a

                            /* renamed from: c, reason: collision with root package name */
                            public final /* synthetic */ AppStartTrace f5320c;

                            {
                                this.f5320c = this;
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                String str;
                                AppStartTrace appStartTrace = this.f5320c;
                                switch (i10) {
                                    case 0:
                                        if (appStartTrace.f14356s == null) {
                                            appStartTrace.f14344d.getClass();
                                            appStartTrace.f14356s = new i();
                                            J newBuilder = TraceMetric.newBuilder();
                                            newBuilder.k("_experiment_onDrawFoQ");
                                            newBuilder.i(appStartTrace.e().b);
                                            newBuilder.j(appStartTrace.e().d(appStartTrace.f14356s));
                                            TraceMetric traceMetric = (TraceMetric) newBuilder.build();
                                            J j7 = appStartTrace.f14346g;
                                            j7.d(traceMetric);
                                            if (appStartTrace.f14349j != null) {
                                                J newBuilder2 = TraceMetric.newBuilder();
                                                newBuilder2.k("_experiment_procStart_to_classLoad");
                                                newBuilder2.i(appStartTrace.e().b);
                                                newBuilder2.j(appStartTrace.e().d(appStartTrace.d()));
                                                j7.d((TraceMetric) newBuilder2.build());
                                            }
                                            if (appStartTrace.f14361x) {
                                                str = "true";
                                            } else {
                                                str = "false";
                                            }
                                            j7.h(str);
                                            j7.g(appStartTrace.f14359v, "onDrawCount");
                                            j7.c(appStartTrace.f14357t.c());
                                            appStartTrace.g(j7);
                                            return;
                                        }
                                        return;
                                    case 1:
                                        if (appStartTrace.f14354q == null) {
                                            appStartTrace.f14344d.getClass();
                                            appStartTrace.f14354q = new i();
                                            long j9 = appStartTrace.e().b;
                                            J j10 = appStartTrace.f14346g;
                                            j10.i(j9);
                                            j10.j(appStartTrace.e().d(appStartTrace.f14354q));
                                            appStartTrace.g(j10);
                                            return;
                                        }
                                        return;
                                    case 2:
                                        if (appStartTrace.f14355r == null) {
                                            appStartTrace.f14344d.getClass();
                                            appStartTrace.f14355r = new i();
                                            J newBuilder3 = TraceMetric.newBuilder();
                                            newBuilder3.k("_experiment_preDrawFoQ");
                                            newBuilder3.i(appStartTrace.e().b);
                                            newBuilder3.j(appStartTrace.e().d(appStartTrace.f14355r));
                                            TraceMetric traceMetric2 = (TraceMetric) newBuilder3.build();
                                            J j11 = appStartTrace.f14346g;
                                            j11.d(traceMetric2);
                                            appStartTrace.g(j11);
                                            return;
                                        }
                                        return;
                                    default:
                                        i iVar = AppStartTrace.f14341y;
                                        appStartTrace.getClass();
                                        J newBuilder4 = TraceMetric.newBuilder();
                                        newBuilder4.k("_as");
                                        newBuilder4.i(appStartTrace.d().b);
                                        newBuilder4.j(appStartTrace.d().d(appStartTrace.f14351n));
                                        ArrayList arrayList = new ArrayList(3);
                                        J newBuilder5 = TraceMetric.newBuilder();
                                        newBuilder5.k("_astui");
                                        newBuilder5.i(appStartTrace.d().b);
                                        newBuilder5.j(appStartTrace.d().d(appStartTrace.l));
                                        arrayList.add((TraceMetric) newBuilder5.build());
                                        if (appStartTrace.m != null) {
                                            J newBuilder6 = TraceMetric.newBuilder();
                                            newBuilder6.k("_astfd");
                                            newBuilder6.i(appStartTrace.l.b);
                                            newBuilder6.j(appStartTrace.l.d(appStartTrace.m));
                                            arrayList.add((TraceMetric) newBuilder6.build());
                                            J newBuilder7 = TraceMetric.newBuilder();
                                            newBuilder7.k("_asti");
                                            newBuilder7.i(appStartTrace.m.b);
                                            newBuilder7.j(appStartTrace.m.d(appStartTrace.f14351n));
                                            arrayList.add((TraceMetric) newBuilder7.build());
                                        }
                                        newBuilder4.b(arrayList);
                                        newBuilder4.c(appStartTrace.f14357t.c());
                                        appStartTrace.f14343c.c((TraceMetric) newBuilder4.build(), EnumC2355j.FOREGROUND_BACKGROUND);
                                        return;
                                }
                            }
                        }, new Runnable(this) { // from class: b5.a

                            /* renamed from: c, reason: collision with root package name */
                            public final /* synthetic */ AppStartTrace f5320c;

                            {
                                this.f5320c = this;
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                String str;
                                AppStartTrace appStartTrace = this.f5320c;
                                switch (i11) {
                                    case 0:
                                        if (appStartTrace.f14356s == null) {
                                            appStartTrace.f14344d.getClass();
                                            appStartTrace.f14356s = new i();
                                            J newBuilder = TraceMetric.newBuilder();
                                            newBuilder.k("_experiment_onDrawFoQ");
                                            newBuilder.i(appStartTrace.e().b);
                                            newBuilder.j(appStartTrace.e().d(appStartTrace.f14356s));
                                            TraceMetric traceMetric = (TraceMetric) newBuilder.build();
                                            J j7 = appStartTrace.f14346g;
                                            j7.d(traceMetric);
                                            if (appStartTrace.f14349j != null) {
                                                J newBuilder2 = TraceMetric.newBuilder();
                                                newBuilder2.k("_experiment_procStart_to_classLoad");
                                                newBuilder2.i(appStartTrace.e().b);
                                                newBuilder2.j(appStartTrace.e().d(appStartTrace.d()));
                                                j7.d((TraceMetric) newBuilder2.build());
                                            }
                                            if (appStartTrace.f14361x) {
                                                str = "true";
                                            } else {
                                                str = "false";
                                            }
                                            j7.h(str);
                                            j7.g(appStartTrace.f14359v, "onDrawCount");
                                            j7.c(appStartTrace.f14357t.c());
                                            appStartTrace.g(j7);
                                            return;
                                        }
                                        return;
                                    case 1:
                                        if (appStartTrace.f14354q == null) {
                                            appStartTrace.f14344d.getClass();
                                            appStartTrace.f14354q = new i();
                                            long j9 = appStartTrace.e().b;
                                            J j10 = appStartTrace.f14346g;
                                            j10.i(j9);
                                            j10.j(appStartTrace.e().d(appStartTrace.f14354q));
                                            appStartTrace.g(j10);
                                            return;
                                        }
                                        return;
                                    case 2:
                                        if (appStartTrace.f14355r == null) {
                                            appStartTrace.f14344d.getClass();
                                            appStartTrace.f14355r = new i();
                                            J newBuilder3 = TraceMetric.newBuilder();
                                            newBuilder3.k("_experiment_preDrawFoQ");
                                            newBuilder3.i(appStartTrace.e().b);
                                            newBuilder3.j(appStartTrace.e().d(appStartTrace.f14355r));
                                            TraceMetric traceMetric2 = (TraceMetric) newBuilder3.build();
                                            J j11 = appStartTrace.f14346g;
                                            j11.d(traceMetric2);
                                            appStartTrace.g(j11);
                                            return;
                                        }
                                        return;
                                    default:
                                        i iVar = AppStartTrace.f14341y;
                                        appStartTrace.getClass();
                                        J newBuilder4 = TraceMetric.newBuilder();
                                        newBuilder4.k("_as");
                                        newBuilder4.i(appStartTrace.d().b);
                                        newBuilder4.j(appStartTrace.d().d(appStartTrace.f14351n));
                                        ArrayList arrayList = new ArrayList(3);
                                        J newBuilder5 = TraceMetric.newBuilder();
                                        newBuilder5.k("_astui");
                                        newBuilder5.i(appStartTrace.d().b);
                                        newBuilder5.j(appStartTrace.d().d(appStartTrace.l));
                                        arrayList.add((TraceMetric) newBuilder5.build());
                                        if (appStartTrace.m != null) {
                                            J newBuilder6 = TraceMetric.newBuilder();
                                            newBuilder6.k("_astfd");
                                            newBuilder6.i(appStartTrace.l.b);
                                            newBuilder6.j(appStartTrace.l.d(appStartTrace.m));
                                            arrayList.add((TraceMetric) newBuilder6.build());
                                            J newBuilder7 = TraceMetric.newBuilder();
                                            newBuilder7.k("_asti");
                                            newBuilder7.i(appStartTrace.m.b);
                                            newBuilder7.j(appStartTrace.m.d(appStartTrace.f14351n));
                                            arrayList.add((TraceMetric) newBuilder7.build());
                                        }
                                        newBuilder4.b(arrayList);
                                        newBuilder4.c(appStartTrace.f14357t.c());
                                        appStartTrace.f14343c.c((TraceMetric) newBuilder4.build(), EnumC2355j.FOREGROUND_BACKGROUND);
                                        return;
                                }
                            }
                        }));
                    }
                    findViewById.getViewTreeObserver().addOnDrawListener(viewTreeObserverOnDrawListenerC2321b);
                    final int i102 = 1;
                    final int i112 = 2;
                    findViewById.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserverOnPreDrawListenerC2324e(findViewById, new Runnable(this) { // from class: b5.a

                        /* renamed from: c, reason: collision with root package name */
                        public final /* synthetic */ AppStartTrace f5320c;

                        {
                            this.f5320c = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            String str;
                            AppStartTrace appStartTrace = this.f5320c;
                            switch (i102) {
                                case 0:
                                    if (appStartTrace.f14356s == null) {
                                        appStartTrace.f14344d.getClass();
                                        appStartTrace.f14356s = new i();
                                        J newBuilder = TraceMetric.newBuilder();
                                        newBuilder.k("_experiment_onDrawFoQ");
                                        newBuilder.i(appStartTrace.e().b);
                                        newBuilder.j(appStartTrace.e().d(appStartTrace.f14356s));
                                        TraceMetric traceMetric = (TraceMetric) newBuilder.build();
                                        J j7 = appStartTrace.f14346g;
                                        j7.d(traceMetric);
                                        if (appStartTrace.f14349j != null) {
                                            J newBuilder2 = TraceMetric.newBuilder();
                                            newBuilder2.k("_experiment_procStart_to_classLoad");
                                            newBuilder2.i(appStartTrace.e().b);
                                            newBuilder2.j(appStartTrace.e().d(appStartTrace.d()));
                                            j7.d((TraceMetric) newBuilder2.build());
                                        }
                                        if (appStartTrace.f14361x) {
                                            str = "true";
                                        } else {
                                            str = "false";
                                        }
                                        j7.h(str);
                                        j7.g(appStartTrace.f14359v, "onDrawCount");
                                        j7.c(appStartTrace.f14357t.c());
                                        appStartTrace.g(j7);
                                        return;
                                    }
                                    return;
                                case 1:
                                    if (appStartTrace.f14354q == null) {
                                        appStartTrace.f14344d.getClass();
                                        appStartTrace.f14354q = new i();
                                        long j9 = appStartTrace.e().b;
                                        J j10 = appStartTrace.f14346g;
                                        j10.i(j9);
                                        j10.j(appStartTrace.e().d(appStartTrace.f14354q));
                                        appStartTrace.g(j10);
                                        return;
                                    }
                                    return;
                                case 2:
                                    if (appStartTrace.f14355r == null) {
                                        appStartTrace.f14344d.getClass();
                                        appStartTrace.f14355r = new i();
                                        J newBuilder3 = TraceMetric.newBuilder();
                                        newBuilder3.k("_experiment_preDrawFoQ");
                                        newBuilder3.i(appStartTrace.e().b);
                                        newBuilder3.j(appStartTrace.e().d(appStartTrace.f14355r));
                                        TraceMetric traceMetric2 = (TraceMetric) newBuilder3.build();
                                        J j11 = appStartTrace.f14346g;
                                        j11.d(traceMetric2);
                                        appStartTrace.g(j11);
                                        return;
                                    }
                                    return;
                                default:
                                    i iVar = AppStartTrace.f14341y;
                                    appStartTrace.getClass();
                                    J newBuilder4 = TraceMetric.newBuilder();
                                    newBuilder4.k("_as");
                                    newBuilder4.i(appStartTrace.d().b);
                                    newBuilder4.j(appStartTrace.d().d(appStartTrace.f14351n));
                                    ArrayList arrayList = new ArrayList(3);
                                    J newBuilder5 = TraceMetric.newBuilder();
                                    newBuilder5.k("_astui");
                                    newBuilder5.i(appStartTrace.d().b);
                                    newBuilder5.j(appStartTrace.d().d(appStartTrace.l));
                                    arrayList.add((TraceMetric) newBuilder5.build());
                                    if (appStartTrace.m != null) {
                                        J newBuilder6 = TraceMetric.newBuilder();
                                        newBuilder6.k("_astfd");
                                        newBuilder6.i(appStartTrace.l.b);
                                        newBuilder6.j(appStartTrace.l.d(appStartTrace.m));
                                        arrayList.add((TraceMetric) newBuilder6.build());
                                        J newBuilder7 = TraceMetric.newBuilder();
                                        newBuilder7.k("_asti");
                                        newBuilder7.i(appStartTrace.m.b);
                                        newBuilder7.j(appStartTrace.m.d(appStartTrace.f14351n));
                                        arrayList.add((TraceMetric) newBuilder7.build());
                                    }
                                    newBuilder4.b(arrayList);
                                    newBuilder4.c(appStartTrace.f14357t.c());
                                    appStartTrace.f14343c.c((TraceMetric) newBuilder4.build(), EnumC2355j.FOREGROUND_BACKGROUND);
                                    return;
                            }
                        }
                    }, new Runnable(this) { // from class: b5.a

                        /* renamed from: c, reason: collision with root package name */
                        public final /* synthetic */ AppStartTrace f5320c;

                        {
                            this.f5320c = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            String str;
                            AppStartTrace appStartTrace = this.f5320c;
                            switch (i112) {
                                case 0:
                                    if (appStartTrace.f14356s == null) {
                                        appStartTrace.f14344d.getClass();
                                        appStartTrace.f14356s = new i();
                                        J newBuilder = TraceMetric.newBuilder();
                                        newBuilder.k("_experiment_onDrawFoQ");
                                        newBuilder.i(appStartTrace.e().b);
                                        newBuilder.j(appStartTrace.e().d(appStartTrace.f14356s));
                                        TraceMetric traceMetric = (TraceMetric) newBuilder.build();
                                        J j7 = appStartTrace.f14346g;
                                        j7.d(traceMetric);
                                        if (appStartTrace.f14349j != null) {
                                            J newBuilder2 = TraceMetric.newBuilder();
                                            newBuilder2.k("_experiment_procStart_to_classLoad");
                                            newBuilder2.i(appStartTrace.e().b);
                                            newBuilder2.j(appStartTrace.e().d(appStartTrace.d()));
                                            j7.d((TraceMetric) newBuilder2.build());
                                        }
                                        if (appStartTrace.f14361x) {
                                            str = "true";
                                        } else {
                                            str = "false";
                                        }
                                        j7.h(str);
                                        j7.g(appStartTrace.f14359v, "onDrawCount");
                                        j7.c(appStartTrace.f14357t.c());
                                        appStartTrace.g(j7);
                                        return;
                                    }
                                    return;
                                case 1:
                                    if (appStartTrace.f14354q == null) {
                                        appStartTrace.f14344d.getClass();
                                        appStartTrace.f14354q = new i();
                                        long j9 = appStartTrace.e().b;
                                        J j10 = appStartTrace.f14346g;
                                        j10.i(j9);
                                        j10.j(appStartTrace.e().d(appStartTrace.f14354q));
                                        appStartTrace.g(j10);
                                        return;
                                    }
                                    return;
                                case 2:
                                    if (appStartTrace.f14355r == null) {
                                        appStartTrace.f14344d.getClass();
                                        appStartTrace.f14355r = new i();
                                        J newBuilder3 = TraceMetric.newBuilder();
                                        newBuilder3.k("_experiment_preDrawFoQ");
                                        newBuilder3.i(appStartTrace.e().b);
                                        newBuilder3.j(appStartTrace.e().d(appStartTrace.f14355r));
                                        TraceMetric traceMetric2 = (TraceMetric) newBuilder3.build();
                                        J j11 = appStartTrace.f14346g;
                                        j11.d(traceMetric2);
                                        appStartTrace.g(j11);
                                        return;
                                    }
                                    return;
                                default:
                                    i iVar = AppStartTrace.f14341y;
                                    appStartTrace.getClass();
                                    J newBuilder4 = TraceMetric.newBuilder();
                                    newBuilder4.k("_as");
                                    newBuilder4.i(appStartTrace.d().b);
                                    newBuilder4.j(appStartTrace.d().d(appStartTrace.f14351n));
                                    ArrayList arrayList = new ArrayList(3);
                                    J newBuilder5 = TraceMetric.newBuilder();
                                    newBuilder5.k("_astui");
                                    newBuilder5.i(appStartTrace.d().b);
                                    newBuilder5.j(appStartTrace.d().d(appStartTrace.l));
                                    arrayList.add((TraceMetric) newBuilder5.build());
                                    if (appStartTrace.m != null) {
                                        J newBuilder6 = TraceMetric.newBuilder();
                                        newBuilder6.k("_astfd");
                                        newBuilder6.i(appStartTrace.l.b);
                                        newBuilder6.j(appStartTrace.l.d(appStartTrace.m));
                                        arrayList.add((TraceMetric) newBuilder6.build());
                                        J newBuilder7 = TraceMetric.newBuilder();
                                        newBuilder7.k("_asti");
                                        newBuilder7.i(appStartTrace.m.b);
                                        newBuilder7.j(appStartTrace.m.d(appStartTrace.f14351n));
                                        arrayList.add((TraceMetric) newBuilder7.build());
                                    }
                                    newBuilder4.b(arrayList);
                                    newBuilder4.c(appStartTrace.f14357t.c());
                                    appStartTrace.f14343c.c((TraceMetric) newBuilder4.build(), EnumC2355j.FOREGROUND_BACKGROUND);
                                    return;
                            }
                        }
                    }));
                }
                if (this.f14351n != null) {
                    return;
                }
                new WeakReference(activity);
                this.f14344d.getClass();
                this.f14351n = new i();
                this.f14357t = SessionManager.getInstance().perfSession();
                C0397a.d().a("onResume(): " + activity.getClass().getName() + ": " + d().d(this.f14351n) + " microseconds");
                final int i12 = 3;
                f14340B.execute(new Runnable(this) { // from class: b5.a

                    /* renamed from: c, reason: collision with root package name */
                    public final /* synthetic */ AppStartTrace f5320c;

                    {
                        this.f5320c = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        String str;
                        AppStartTrace appStartTrace = this.f5320c;
                        switch (i12) {
                            case 0:
                                if (appStartTrace.f14356s == null) {
                                    appStartTrace.f14344d.getClass();
                                    appStartTrace.f14356s = new i();
                                    J newBuilder = TraceMetric.newBuilder();
                                    newBuilder.k("_experiment_onDrawFoQ");
                                    newBuilder.i(appStartTrace.e().b);
                                    newBuilder.j(appStartTrace.e().d(appStartTrace.f14356s));
                                    TraceMetric traceMetric = (TraceMetric) newBuilder.build();
                                    J j7 = appStartTrace.f14346g;
                                    j7.d(traceMetric);
                                    if (appStartTrace.f14349j != null) {
                                        J newBuilder2 = TraceMetric.newBuilder();
                                        newBuilder2.k("_experiment_procStart_to_classLoad");
                                        newBuilder2.i(appStartTrace.e().b);
                                        newBuilder2.j(appStartTrace.e().d(appStartTrace.d()));
                                        j7.d((TraceMetric) newBuilder2.build());
                                    }
                                    if (appStartTrace.f14361x) {
                                        str = "true";
                                    } else {
                                        str = "false";
                                    }
                                    j7.h(str);
                                    j7.g(appStartTrace.f14359v, "onDrawCount");
                                    j7.c(appStartTrace.f14357t.c());
                                    appStartTrace.g(j7);
                                    return;
                                }
                                return;
                            case 1:
                                if (appStartTrace.f14354q == null) {
                                    appStartTrace.f14344d.getClass();
                                    appStartTrace.f14354q = new i();
                                    long j9 = appStartTrace.e().b;
                                    J j10 = appStartTrace.f14346g;
                                    j10.i(j9);
                                    j10.j(appStartTrace.e().d(appStartTrace.f14354q));
                                    appStartTrace.g(j10);
                                    return;
                                }
                                return;
                            case 2:
                                if (appStartTrace.f14355r == null) {
                                    appStartTrace.f14344d.getClass();
                                    appStartTrace.f14355r = new i();
                                    J newBuilder3 = TraceMetric.newBuilder();
                                    newBuilder3.k("_experiment_preDrawFoQ");
                                    newBuilder3.i(appStartTrace.e().b);
                                    newBuilder3.j(appStartTrace.e().d(appStartTrace.f14355r));
                                    TraceMetric traceMetric2 = (TraceMetric) newBuilder3.build();
                                    J j11 = appStartTrace.f14346g;
                                    j11.d(traceMetric2);
                                    appStartTrace.g(j11);
                                    return;
                                }
                                return;
                            default:
                                i iVar = AppStartTrace.f14341y;
                                appStartTrace.getClass();
                                J newBuilder4 = TraceMetric.newBuilder();
                                newBuilder4.k("_as");
                                newBuilder4.i(appStartTrace.d().b);
                                newBuilder4.j(appStartTrace.d().d(appStartTrace.f14351n));
                                ArrayList arrayList = new ArrayList(3);
                                J newBuilder5 = TraceMetric.newBuilder();
                                newBuilder5.k("_astui");
                                newBuilder5.i(appStartTrace.d().b);
                                newBuilder5.j(appStartTrace.d().d(appStartTrace.l));
                                arrayList.add((TraceMetric) newBuilder5.build());
                                if (appStartTrace.m != null) {
                                    J newBuilder6 = TraceMetric.newBuilder();
                                    newBuilder6.k("_astfd");
                                    newBuilder6.i(appStartTrace.l.b);
                                    newBuilder6.j(appStartTrace.l.d(appStartTrace.m));
                                    arrayList.add((TraceMetric) newBuilder6.build());
                                    J newBuilder7 = TraceMetric.newBuilder();
                                    newBuilder7.k("_asti");
                                    newBuilder7.i(appStartTrace.m.b);
                                    newBuilder7.j(appStartTrace.m.d(appStartTrace.f14351n));
                                    arrayList.add((TraceMetric) newBuilder7.build());
                                }
                                newBuilder4.b(arrayList);
                                newBuilder4.c(appStartTrace.f14357t.c());
                                appStartTrace.f14343c.c((TraceMetric) newBuilder4.build(), EnumC2355j.FOREGROUND_BACKGROUND);
                                return;
                        }
                    }
                });
                if (!f9) {
                    h();
                }
            }
        } finally {
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final synchronized void onActivityStarted(Activity activity) {
        if (!this.f14358u && this.m == null && !this.f14348i) {
            this.f14344d.getClass();
            this.m = new i();
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }

    @E(EnumC0503m.ON_STOP)
    @Keep
    public void onAppEnteredBackground() {
        if (!this.f14358u && !this.f14348i && this.f14353p == null) {
            this.f14344d.getClass();
            this.f14353p = new i();
            J newBuilder = TraceMetric.newBuilder();
            newBuilder.k("_experiment_firstBackgrounding");
            newBuilder.i(e().b);
            newBuilder.j(e().d(this.f14353p));
            this.f14346g.d((TraceMetric) newBuilder.build());
        }
    }

    @E(EnumC0503m.ON_START)
    @Keep
    public void onAppEnteredForeground() {
        if (!this.f14358u && !this.f14348i && this.f14352o == null) {
            this.f14344d.getClass();
            this.f14352o = new i();
            J newBuilder = TraceMetric.newBuilder();
            newBuilder.k("_experiment_firstForegrounding");
            newBuilder.i(e().b);
            newBuilder.j(e().d(this.f14352o));
            this.f14346g.d((TraceMetric) newBuilder.build());
        }
    }
}
