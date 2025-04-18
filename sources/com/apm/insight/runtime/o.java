package com.apm.insight.runtime;

import android.app.Application;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.apm.insight.CrashType;
import com.apm.insight.ICrashCallback;
import com.apm.insight.IOOMCallback;
import com.apm.insight.nativecrash.NativeImpl;
import java.io.File;
import java.util.Map;

/* loaded from: classes.dex */
public class o {
    private static boolean a = false;

    /* renamed from: b, reason: collision with root package name */
    private static boolean f3340b = false;

    /* renamed from: c, reason: collision with root package name */
    private static boolean f3341c = false;

    /* renamed from: d, reason: collision with root package name */
    private static boolean f3342d = false;

    /* renamed from: e, reason: collision with root package name */
    private static boolean f3343e = false;

    /* renamed from: f, reason: collision with root package name */
    private static c f3344f = new c();

    /* renamed from: g, reason: collision with root package name */
    private static volatile boolean f3345g = false;

    /* renamed from: h, reason: collision with root package name */
    private static boolean f3346h = false;

    public static c a() {
        return f3344f;
    }

    public static void b(long j3) {
        NativeImpl.b(j3);
    }

    public static void c(long j3) {
        NativeImpl.c(j3);
    }

    public static void d(boolean z10) {
        com.apm.insight.i.e(z10);
    }

    public static boolean e() {
        return a;
    }

    public static void f() {
        if (!a || f3340b) {
            return;
        }
        Context g10 = com.apm.insight.i.g();
        com.apm.insight.g.a a10 = com.apm.insight.g.a.a();
        a10.a(new com.apm.insight.i.b(g10));
        a10.b(new com.apm.insight.g.d(g10));
    }

    public static void g() {
        if (a) {
            com.apm.insight.b.g.a(com.apm.insight.i.g()).c();
            f3341c = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x004f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void h(boolean r3) {
        /*
            android.content.Context r0 = com.apm.insight.i.g()
            com.apm.insight.runtime.a.f.a()
            com.apm.insight.runtime.m.a()
            java.lang.String r1 = "Npth.initAsync-createCallbackThread"
            com.apm.insight.k.a(r1)
            int r1 = com.apm.insight.nativecrash.NativeImpl.b()
            com.apm.insight.k.a()
            com.apm.insight.nativecrash.NativeImpl.c()
            boolean r2 = com.apm.insight.runtime.o.f3343e
            if (r2 == 0) goto L27
            com.apm.insight.d r1 = com.apm.insight.c.a()
            java.lang.String r2 = "NativeLibraryLoad faild"
        L23:
            r1.a(r2)
            goto L30
        L27:
            if (r1 >= 0) goto L30
            com.apm.insight.d r1 = com.apm.insight.c.a()
            java.lang.String r2 = "createCallbackThread faild"
            goto L23
        L30:
            java.lang.String r1 = "Npth.initAsync-NpthDataManager"
            com.apm.insight.k.a(r1)
            com.apm.insight.e.a r1 = com.apm.insight.e.a.a()
            r1.a(r0)
            com.apm.insight.k.a()
            com.apm.insight.c.a()
            java.lang.String r1 = "Npth.initAsync-LaunchScanner"
            com.apm.insight.k.a(r1)
            com.apm.insight.k.i.a(r0)
            com.apm.insight.k.a()
            if (r3 == 0) goto L60
            java.lang.String r1 = "Npth.initAsync-CrashANRHandler"
            com.apm.insight.k.a(r1)
            com.apm.insight.b.g r0 = com.apm.insight.b.g.a(r0)
            r0.c()
            com.apm.insight.k.a()
            com.apm.insight.runtime.o.f3341c = r3
        L60:
            java.lang.String r3 = "Npth.initAsync-EventUploadQueue"
            com.apm.insight.k.a(r3)
            com.apm.insight.k.g r3 = com.apm.insight.k.g.a()
            r3.b()
            com.apm.insight.k.a()
            java.lang.String r3 = "Npth.initAsync-BlockMonitor"
            com.apm.insight.k.a(r3)
            com.apm.insight.k.a()
            java.lang.String r3 = "Npth.initAsync-OriginExceptionMonitor"
            com.apm.insight.k.a(r3)
            com.apm.insight.k.a()
            com.apm.insight.nativecrash.NativeImpl.f()
            com.apm.insight.j.a()
            com.apm.insight.k.k.d()
            com.apm.insight.nativecrash.NativeImpl.j()
            java.lang.String r3 = "afterNpthInitAsync"
            java.lang.String r0 = "noValue"
            com.apm.insight.runtime.r.a(r3, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.apm.insight.runtime.o.h(boolean):void");
    }

    public static boolean i() {
        return com.apm.insight.b.c.c();
    }

    public static void j() {
        if (a) {
            com.apm.insight.b.g.a(com.apm.insight.i.g()).d();
            f3341c = false;
        }
    }

    public static boolean k() {
        return com.apm.insight.g.a.b() || NativeImpl.d();
    }

    public static boolean l() {
        return com.apm.insight.g.a.c() || NativeImpl.d();
    }

    public static boolean m() {
        return com.apm.insight.g.a.b();
    }

    public static boolean n() {
        return f3346h;
    }

    public static void o() {
        f3346h = true;
    }

    private static boolean q() {
        return false;
    }

    public static void a(long j3) {
        NativeImpl.a(j3);
    }

    public static void b(ICrashCallback iCrashCallback, CrashType crashType) {
        a().b(iCrashCallback, crashType);
    }

    public static void c(String str) {
        NativeImpl.b(str);
    }

    public static boolean d() {
        return f3342d;
    }

    private static void g(final boolean z10) {
        p.b().a(new Runnable() { // from class: com.apm.insight.runtime.o.2
            @Override // java.lang.Runnable
            public void run() {
                if (!o.f3345g) {
                    new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.apm.insight.runtime.o.2.1
                        @Override // java.lang.Runnable
                        public void run() {
                            boolean unused = o.f3345g = true;
                            NativeImpl.h();
                        }
                    });
                }
                o.h(z10);
            }
        }, 0L);
    }

    public static boolean h() {
        if (a && !f3342d) {
            boolean a10 = NativeImpl.a(com.apm.insight.i.g());
            f3342d = a10;
            if (!a10) {
                f3343e = true;
            }
        }
        return f3342d;
    }

    public static synchronized void a(@NonNull Application application, @NonNull Context context, boolean z10, boolean z11, boolean z12, boolean z13, long j3) {
        synchronized (o.class) {
            long uptimeMillis = SystemClock.uptimeMillis();
            if (a) {
                return;
            }
            a = true;
            if (context == null || application == null) {
                throw new IllegalArgumentException("context or Application must be not null.");
            }
            com.apm.insight.i.a(application, context);
            if (com.apm.insight.i.t() && (a(application) || b(application) || q())) {
                Log.e("apminsight", "Inner npth checked.");
                return;
            }
            if (z10 || z11) {
                com.apm.insight.g.a a10 = com.apm.insight.g.a.a();
                if (z11) {
                    a10.a(new com.apm.insight.i.b(context));
                }
                if (z10) {
                    a10.b(new com.apm.insight.g.d(context));
                }
                f3340b = true;
            }
            NativeImpl.a();
            if (z12) {
                boolean a11 = NativeImpl.a(context);
                f3342d = a11;
                if (!a11) {
                    f3343e = true;
                }
            }
            if (Looper.myLooper() == Looper.getMainLooper()) {
                f3345g = true;
                NativeImpl.h();
            }
            g(z13);
            com.apm.insight.l.p.a((Object) ("Npth.init takes " + (SystemClock.uptimeMillis() - uptimeMillis) + " ms."));
        }
    }

    @Deprecated
    public static void b(String str) {
        if (com.apm.insight.i.i().isReportErrorEnable()) {
            com.apm.insight.g.a.c(str);
        }
    }

    public static void c(boolean z10) {
        com.apm.insight.i.d(z10);
    }

    public static synchronized void a(@NonNull Context context, boolean z10, boolean z11, boolean z12, boolean z13, long j3) {
        Application application;
        synchronized (o.class) {
            if (com.apm.insight.i.h() != null) {
                application = com.apm.insight.i.h();
            } else if (context instanceof Application) {
                application = (Application) context;
                if (application.getBaseContext() == null) {
                    throw new IllegalArgumentException("The Application passed in when init has not been attached, please pass a attachBaseContext as param and call Npth.setApplication(Application) before init.");
                }
            } else {
                application = (Application) context.getApplicationContext();
                if (application == null) {
                    throw new IllegalArgumentException("Can not get the Application instance since a baseContext was passed in when init, please call Npth.setApplication(Application) before init.");
                }
                if (application.getBaseContext() != null) {
                    context = application.getBaseContext();
                }
            }
            a(application, context, z10, z11, z12, z13, j3);
        }
    }

    public static void b(boolean z10) {
        com.apm.insight.i.c(z10);
    }

    public static boolean c() {
        return f3341c;
    }

    public static void a(ICrashCallback iCrashCallback, CrashType crashType) {
        a().a(iCrashCallback, crashType);
    }

    public static boolean b() {
        return f3340b;
    }

    public static void a(IOOMCallback iOOMCallback) {
        a().a(iOOMCallback);
    }

    private static boolean b(Context context) {
        try {
            return new File(context.getApplicationInfo().nativeLibraryDir, "libnpth.so").exists();
        } catch (Throwable unused) {
            return false;
        }
    }

    public static void a(IOOMCallback iOOMCallback, CrashType crashType) {
        a().b(iOOMCallback);
    }

    public static void a(@NonNull com.apm.insight.e eVar) {
        com.apm.insight.i.i().setEncryptImpl(eVar);
    }

    public static void a(com.apm.insight.k.h hVar) {
        com.apm.insight.k.e.a(hVar);
    }

    public static void a(j jVar) {
        k.a(jVar);
    }

    public static void a(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        com.apm.insight.d.a.a(str);
    }

    public static void a(String str, com.apm.insight.a.b bVar, com.apm.insight.a.c cVar) {
        if (TextUtils.isEmpty(str) || !new File(str).exists()) {
            return;
        }
        com.apm.insight.a.a.a().a(str, bVar, cVar);
    }

    public static void a(final String str, final com.apm.insight.f fVar) {
        p.b().a(new Runnable() { // from class: com.apm.insight.runtime.o.1
            @Override // java.lang.Runnable
            public void run() {
                if (com.apm.insight.l.a.b(com.apm.insight.i.g())) {
                    com.apm.insight.b.d.a(str, fVar);
                }
            }
        });
    }

    public static void a(String str, @Nullable Map<? extends String, ? extends String> map, @Nullable Map<String, String> map2, @Nullable com.apm.insight.g gVar) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        com.apm.insight.d.a.a(str, map, map2, gVar);
    }

    public static void a(String str, @Nullable Map<? extends String, ? extends String> map, @Nullable Map<String, String> map2, @Nullable Map<String, String> map3, @Nullable com.apm.insight.g gVar) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        com.apm.insight.d.a.a(str, map, map2, map3, gVar);
    }

    @Deprecated
    public static void a(@NonNull Throwable th2) {
        if (com.apm.insight.i.i().isReportErrorEnable()) {
            com.apm.insight.g.a.a(th2);
        }
    }

    public static void a(boolean z10) {
        com.apm.insight.i.b(z10);
    }

    private static boolean a(Context context) {
        try {
            return new File(com.apm.insight.l.n.j(context), "npth").exists();
        } catch (Throwable unused) {
            return false;
        }
    }
}
