package com.applovin.impl.sdk.ad;

import C2.k;
import G7.j;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import android.os.Bundle;
import com.applovin.impl.ql;
import com.applovin.impl.sdk.nativeAd.AppLovinNativeAdImpl;
import com.facebook.C;
import com.facebook.G;
import com.facebook.N;
import com.facebook.appevents.n;
import com.facebook.internal.H;
import com.facebook.internal.InterfaceC1846o;
import com.facebook.internal.p;
import com.facebook.internal.r;
import com.facebook.internal.t;
import com.facebook.internal.w;
import com.facebook.internal.z;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.FirebaseCommonRegistrar;
import com.google.firebase.abt.component.AbtRegistrar;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import com.google.firebase.perf.v1.PerfMetric;
import com.vungle.ads.internal.util.m;
import j5.C2398a;
import j5.C2399b;
import j5.C2400c;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;
import o4.InterfaceC2498d;
import o4.q;
import org.json.JSONException;
import t.InterfaceC2702a;
import t7.AbstractC2712a;
import x2.C2916a;

/* loaded from: classes.dex */
public final /* synthetic */ class g implements InterfaceC2702a, InterfaceC1846o, m, h3.e, InterfaceC2498d, h3.g, SuccessContinuation, N4.a {
    public final /* synthetic */ int b;

    public /* synthetic */ g(int i9) {
        this.b = i9;
    }

    @Override // N4.a
    public void a(N4.b bVar) {
    }

    @Override // t.InterfaceC2702a
    public Object apply(Object obj) {
        Boolean v6;
        Bundle k6;
        String o3;
        Bundle lambda$getDirectDownloadParameters$3;
        switch (this.b) {
            case 0:
                v6 = b.v((ql) obj);
                return v6;
            case 1:
                k6 = b.k((ql) obj);
                return k6;
            case 2:
                o3 = b.o((ql) obj);
                return o3;
            case 3:
                lambda$getDirectDownloadParameters$3 = AppLovinNativeAdImpl.lambda$getDirectDownloadParameters$3((ql) obj);
                return lambda$getDirectDownloadParameters$3;
            default:
                return ((PerfMetric) obj).toByteArray();
        }
    }

    @Override // h3.g
    public void b(Exception exc) {
    }

    public String c(Context context) {
        switch (this.b) {
            case 18:
                ApplicationInfo applicationInfo = context.getApplicationInfo();
                if (applicationInfo != null) {
                    return String.valueOf(applicationInfo.targetSdkVersion);
                }
                return "";
            case 19:
                ApplicationInfo applicationInfo2 = context.getApplicationInfo();
                if (applicationInfo2 != null) {
                    return String.valueOf(applicationInfo2.minSdkVersion);
                }
                return "";
            case 20:
                int i9 = Build.VERSION.SDK_INT;
                if (context.getPackageManager().hasSystemFeature("android.hardware.type.television")) {
                    return "tv";
                }
                if (context.getPackageManager().hasSystemFeature("android.hardware.type.watch")) {
                    return "watch";
                }
                if (context.getPackageManager().hasSystemFeature("android.hardware.type.automotive")) {
                    return "auto";
                }
                if (i9 >= 26 && context.getPackageManager().hasSystemFeature("android.hardware.type.embedded")) {
                    return "embedded";
                }
                return "";
            default:
                String installerPackageName = context.getPackageManager().getInstallerPackageName(context.getPackageName());
                if (installerPackageName != null) {
                    return FirebaseCommonRegistrar.a(installerPackageName);
                }
                return "";
        }
    }

    @Override // com.facebook.internal.InterfaceC1846o
    public void d(boolean z8) {
        int i9 = 1;
        switch (this.b) {
            case 4:
                if (z8 && N.b()) {
                    r rVar = r.f13653a;
                    r.a(new A4.a(6), p.CrashReport);
                    r.a(new A4.a(7), p.ErrorReport);
                    r.a(new A4.a(8), p.AnrReport);
                    return;
                }
                return;
            case 5:
                if (z8 && !O2.a.b(n.class)) {
                    try {
                        w.f13677e.add(new Object());
                        w.c();
                        return;
                    } catch (Throwable th) {
                        O2.a.a(n.class, th);
                        return;
                    }
                }
                return;
            case 6:
                if (z8) {
                    com.facebook.r.l = true;
                    return;
                }
                return;
            case 7:
                if (z8) {
                    com.facebook.r.m = true;
                    return;
                }
                return;
            case 8:
                if (z8) {
                    com.facebook.r.f13811n = true;
                    return;
                }
                return;
            case 9:
                if (z8 && !O2.a.b(C2916a.class)) {
                    try {
                        try {
                            com.facebook.r.c().execute(new C2.b(21));
                            return;
                        } catch (Throwable th2) {
                            O2.a.a(C2916a.class, th2);
                            return;
                        }
                    } catch (Exception unused) {
                        com.facebook.r rVar2 = com.facebook.r.f13801a;
                        return;
                    }
                }
                return;
            case 10:
                if (z8) {
                    H2.b bVar = H2.b.f1372a;
                    if (!O2.a.b(H2.b.class)) {
                        try {
                            H2.b.b = true;
                            H2.b.f1372a.b();
                            return;
                        } catch (Throwable th3) {
                            O2.a.a(H2.b.class, th3);
                            return;
                        }
                    }
                    return;
                }
                return;
            case 11:
                if (z8) {
                    F2.g gVar = F2.g.f1140a;
                    if (!O2.a.b(F2.g.class)) {
                        try {
                            H.K(new C2.b(5));
                            return;
                        } catch (Throwable th4) {
                            O2.a.a(F2.g.class, th4);
                            return;
                        }
                    }
                    return;
                }
                return;
            case 12:
                if (z8) {
                    B2.b bVar2 = B2.b.f275a;
                    if (!O2.a.b(B2.b.class)) {
                        try {
                            B2.b.b = true;
                            B2.b.f275a.a();
                            return;
                        } catch (Throwable th5) {
                            O2.a.a(B2.b.class, th5);
                            return;
                        }
                    }
                    return;
                }
                return;
            case 13:
                if (z8) {
                    k kVar = k.f527a;
                    if (!O2.a.b(k.class)) {
                        try {
                            k.b.set(true);
                            k.a();
                            return;
                        } catch (Throwable th6) {
                            O2.a.a(k.class, th6);
                            return;
                        }
                    }
                    return;
                }
                return;
            case 14:
                if (z8) {
                    D2.d dVar = D2.d.f735a;
                    if (!O2.a.b(D2.d.class)) {
                        try {
                            D2.d.b = true;
                            D2.d.f735a.a();
                            return;
                        } catch (Throwable th7) {
                            O2.a.a(D2.d.class, th7);
                            return;
                        }
                    }
                    return;
                }
                return;
            case 15:
                if (z8 && !O2.a.b(D2.b.class)) {
                    try {
                        D2.b bVar3 = D2.b.f732a;
                        if (!O2.a.b(bVar3)) {
                            try {
                                w wVar = w.f13674a;
                                t f9 = w.f(com.facebook.r.b(), false);
                                if (f9 != null) {
                                    D2.b.f733c = f9.f13668n;
                                }
                            } catch (Throwable th8) {
                                O2.a.a(bVar3, th8);
                            }
                        }
                        if (D2.b.f733c != null) {
                            D2.b.b = true;
                            return;
                        }
                        return;
                    } catch (Throwable th9) {
                        O2.a.a(D2.b.class, th9);
                        return;
                    }
                }
                return;
            default:
                if (z8) {
                    com.facebook.H h6 = com.facebook.H.f13413f;
                    try {
                        C c9 = new C(null, j.j("/cloudbridge_settings", com.facebook.r.b()), null, G.b, new com.facebook.w(i9));
                        L4.f fVar = z.f13680c;
                        com.facebook.r.h(h6);
                        c9.d();
                        return;
                    } catch (JSONException e4) {
                        L4.f fVar2 = z.f13680c;
                        AbstractC2712a.e(e4);
                        com.facebook.r.h(h6);
                        return;
                    }
                }
                return;
        }
    }

    @Override // o4.InterfaceC2498d
    public Object f(U4.p pVar) {
        switch (this.b) {
            case 23:
                return AbtRegistrar.a(pVar);
            case 24:
                Set a6 = pVar.a(q.a(C2398a.class));
                C2400c c2400c = C2400c.f21105d;
                if (c2400c == null) {
                    synchronized (C2400c.class) {
                        try {
                            c2400c = C2400c.f21105d;
                            if (c2400c == null) {
                                c2400c = new C2400c(0);
                                C2400c.f21105d = c2400c;
                            }
                        } finally {
                        }
                    }
                }
                return new C2399b(a6, c2400c);
            default:
                return (ScheduledExecutorService) ExecutorsRegistrar.f14323a.get();
        }
    }

    @Override // com.vungle.ads.internal.util.m
    public ObjectInputStream provideObjectInputStream(InputStream inputStream) {
        return com.vungle.ads.internal.util.n.a(inputStream);
    }

    @Override // com.google.android.gms.tasks.SuccessContinuation
    public Task then(Object obj) {
        switch (this.b) {
            case 26:
                return Tasks.forResult(null);
            default:
                return Tasks.forResult(null);
        }
    }
}
