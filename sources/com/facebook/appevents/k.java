package com.facebook.appevents;

import T.C0282m;
import android.app.Activity;
import android.app.job.JobParameters;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Process;
import android.os.StrictMode;
import android.util.Log;
import android.view.View;
import android.webkit.WebView;
import android.widget.EditText;
import com.facebook.C0785a;
import com.facebook.internal.H;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;
import com.mbridge.msdk.foundation.tools.SameMD5;
import com.vungle.ads.C2133p0;
import com.vungle.ads.C2144v0;
import com.vungle.ads.InterfaceC2072c0;
import com.vungle.ads.P;
import com.vungle.ads.T;
import com.vungle.ads.U;
import com.vungle.ads.internal.Z;
import com.vungle.ads.o1;
import f.x;
import f7.C2275b;
import g5.C2299b;
import g5.C2303f;
import java.io.Serializable;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.Callable;
import k.AbstractActivityC2417f;
import k.C2426o;
import k.ExecutorC2421j;
import p4.ThreadFactoryC2543a;
import r1.DialogC2656a;
import u7.AbstractC2816g;
import x2.ViewTreeObserverOnGlobalFocusChangeListenerC2919d;

/* loaded from: classes.dex */
public final /* synthetic */ class k implements Runnable {
    public final /* synthetic */ int b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f13490c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f13491d;

    public /* synthetic */ k(int i9, Object obj, Object obj2) {
        this.b = i9;
        this.f13490c = obj;
        this.f13491d = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        N4.a aVar;
        switch (this.b) {
            case 0:
                Context context = (Context) this.f13490c;
                G7.j.e(context, "$context");
                l lVar = (l) this.f13491d;
                G7.j.e(lVar, "$logger");
                Bundle bundle = new Bundle();
                String[] strArr = {"com.facebook.core.Core", "com.facebook.login.Login", "com.facebook.share.Share", "com.facebook.places.Places", "com.facebook.messenger.Messenger", "com.facebook.applinks.AppLinks", "com.facebook.marketing.Marketing", "com.facebook.gamingservices.GamingServices", "com.facebook.all.All", "com.android.billingclient.api.BillingClient", "com.android.vending.billing.IInAppBillingService"};
                String[] strArr2 = {"core_lib_included", "login_lib_included", "share_lib_included", "places_lib_included", "messenger_lib_included", "applinks_lib_included", "marketing_lib_included", "gamingservices_lib_included", "all_lib_included", "billing_client_lib_included", "billing_service_lib_included"};
                int i9 = 0;
                int i10 = 0;
                while (true) {
                    int i11 = i9 + 1;
                    String str = strArr[i9];
                    String str2 = strArr2[i9];
                    try {
                        Class.forName(str);
                        bundle.putInt(str2, 1);
                        i10 |= 1 << i9;
                    } catch (ClassNotFoundException unused) {
                    }
                    if (i11 > 10) {
                        SharedPreferences sharedPreferences = context.getSharedPreferences("com.facebook.sdk.appEventPreferences", 0);
                        if (sharedPreferences.getInt("kitsBitmask", 0) != i10) {
                            sharedPreferences.edit().putInt("kitsBitmask", i10).apply();
                            lVar.f(bundle, "fb_sdk_initialize");
                            return;
                        }
                        return;
                    }
                    i9 = i11;
                }
            case 1:
                P.m9onLoadFailure$lambda1((P) this.f13490c, (o1) this.f13491d);
                return;
            case 2:
                T.m17onFailure$lambda6((U) this.f13490c, (o1) this.f13491d);
                return;
            case 3:
                C2133p0.c((C2144v0) this.f13490c, (o1) this.f13491d);
                return;
            case 4:
                Z.d((Z) this.f13490c, (InterfaceC2072c0) this.f13491d);
                return;
            case 5:
                Z.a((InterfaceC2072c0) this.f13490c, (o1) this.f13491d);
                return;
            case 6:
                com.vungle.ads.internal.load.j.a((com.vungle.ads.internal.load.j) this.f13490c, (com.vungle.ads.internal.load.a) this.f13491d);
                return;
            case 7:
                com.vungle.ads.internal.network.l.a((com.vungle.ads.internal.network.l) this.f13490c, (String) this.f13491d);
                return;
            case 8:
                com.vungle.ads.internal.platform.b.a((com.vungle.ads.internal.platform.b) this.f13490c, (S.a) this.f13491d);
                return;
            case 9:
                com.vungle.ads.internal.ui.p.b((com.vungle.ads.internal.ui.p) this.f13490c, (WebView) this.f13491d);
                return;
            case 10:
                f.l lVar2 = (f.l) this.f13490c;
                G7.j.e(lVar2, "this$0");
                x xVar = (x) this.f13491d;
                G7.j.e(xVar, "$dispatcher");
                lVar2.getLifecycle().a(new C0282m(1, xVar, lVar2));
                return;
            case 11:
                C2275b.m122apply$lambda0((C2275b) this.f13490c, (HashMap) ((Serializable) this.f13491d));
                return;
            case 12:
                C2303f c2303f = (C2303f) this.f13490c;
                c2303f.getClass();
                C2299b c2299b = (C2299b) this.f13491d;
                c2303f.d(c2299b.f20455a, c2299b.b);
                return;
            case 13:
                h7.c.c((h7.c) this.f13490c, (String) this.f13491d);
                return;
            case 14:
                Runnable runnable = (Runnable) this.f13491d;
                ExecutorC2421j executorC2421j = (ExecutorC2421j) this.f13490c;
                executorC2421j.getClass();
                try {
                    runnable.run();
                    return;
                } finally {
                    executorC2421j.a();
                }
            case 15:
                m1.g gVar = (m1.g) this.f13490c;
                DialogC2656a dialogC2656a = gVar.f21731d;
                if (dialogC2656a != null && dialogC2656a.isShowing() && !((AbstractActivityC2417f) this.f13491d).isDestroyed()) {
                    gVar.f21731d.dismiss();
                    return;
                }
                return;
            case 16:
                m1.g gVar2 = (m1.g) this.f13491d;
                DialogC2656a dialogC2656a2 = gVar2.f21731d;
                if (dialogC2656a2 != null && dialogC2656a2.isShowing() && !((Activity) ((Context) this.f13490c)).isDestroyed()) {
                    gVar2.f21731d.dismiss();
                    return;
                }
                return;
            case 17:
                o4.o oVar = (o4.o) this.f13490c;
                N4.b bVar = (N4.b) this.f13491d;
                if (oVar.b == o4.o.f21968d) {
                    synchronized (oVar) {
                        aVar = oVar.f21969a;
                        oVar.f21969a = null;
                        oVar.b = bVar;
                    }
                    aVar.a(bVar);
                    return;
                }
                throw new IllegalStateException("provide() can be called only once.");
            case 18:
                o4.m mVar = (o4.m) this.f13490c;
                N4.b bVar2 = (N4.b) this.f13491d;
                synchronized (mVar) {
                    try {
                        if (mVar.b == null) {
                            mVar.f21966a.add(bVar2);
                        } else {
                            mVar.b.add(bVar2.get());
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
            case 19:
                ThreadFactoryC2543a threadFactoryC2543a = (ThreadFactoryC2543a) this.f13490c;
                Process.setThreadPriority(threadFactoryC2543a.f22219c);
                StrictMode.ThreadPolicy threadPolicy = threadFactoryC2543a.f22220d;
                if (threadPolicy != null) {
                    StrictMode.setThreadPolicy(threadPolicy);
                }
                ((Runnable) this.f13491d).run();
                return;
            case 20:
                Callable callable = (Callable) this.f13490c;
                C2426o c2426o = (C2426o) this.f13491d;
                try {
                    ((p4.h) c2426o.f21320c).h(callable.call());
                    return;
                } catch (Exception e4) {
                    ((p4.h) c2426o.f21320c).i(e4);
                    return;
                }
            case 21:
                int i12 = JobInfoSchedulerService.b;
                ((JobInfoSchedulerService) this.f13490c).jobFinished((JobParameters) this.f13491d, false);
                return;
            case 22:
                View view = (View) this.f13490c;
                ViewTreeObserverOnGlobalFocusChangeListenerC2919d viewTreeObserverOnGlobalFocusChangeListenerC2919d = (ViewTreeObserverOnGlobalFocusChangeListenerC2919d) this.f13491d;
                if (!O2.a.b(ViewTreeObserverOnGlobalFocusChangeListenerC2919d.class)) {
                    try {
                        G7.j.e(view, "$view");
                        G7.j.e(viewTreeObserverOnGlobalFocusChangeListenerC2919d, "this$0");
                        if (view instanceof EditText) {
                            viewTreeObserverOnGlobalFocusChangeListenerC2919d.b(view);
                            return;
                        }
                        return;
                    } catch (Throwable th2) {
                        O2.a.a(ViewTreeObserverOnGlobalFocusChangeListenerC2919d.class, th2);
                        return;
                    }
                }
                return;
            case 23:
                List list = (List) this.f13491d;
                G7.j.e(list, "$processedEvents");
                HashSet hashSet = y2.j.f24364a;
                Integer num = (Integer) this.f13490c;
                if (!AbstractC2816g.I(hashSet, num) && AbstractC2816g.I(y2.j.b, num)) {
                    if (y2.j.f24367e >= 5) {
                        y2.j.b().clear();
                        y2.j.f24367e = 0;
                        return;
                    } else {
                        y2.j.b().addAll(0, list);
                        y2.j.f24367e++;
                        return;
                    }
                }
                return;
            case 24:
                String str3 = (String) this.f13490c;
                Bundle bundle2 = (Bundle) this.f13491d;
                if (!O2.a.b(z2.c.class)) {
                    try {
                        G7.j.e(str3, "$eventName");
                        G7.j.e(bundle2, "$parameters");
                        new l(com.facebook.r.a(), (String) null).d(bundle2, str3);
                        return;
                    } catch (Throwable th3) {
                        O2.a.a(z2.c.class, th3);
                        return;
                    }
                }
                return;
            case 25:
                z2.k kVar = (z2.k) this.f13490c;
                TimerTask timerTask = (TimerTask) this.f13491d;
                if (!O2.a.b(z2.k.class)) {
                    try {
                        G7.j.e(kVar, "this$0");
                        G7.j.e(timerTask, "$indexingTask");
                        try {
                            Timer timer = kVar.f24532c;
                            if (timer != null) {
                                timer.cancel();
                            }
                            kVar.f24533d = null;
                            Timer timer2 = new Timer();
                            timer2.scheduleAtFixedRate(timerTask, 0L, 1000L);
                            kVar.f24532c = timer2;
                            return;
                        } catch (Exception e9) {
                            Log.e(z2.k.f24530e, "Error scheduling indexing job", e9);
                            return;
                        }
                    } catch (Throwable th4) {
                        O2.a.a(z2.k.class, th4);
                        return;
                    }
                }
                return;
            default:
                String str4 = (String) this.f13490c;
                z2.k kVar2 = (z2.k) this.f13491d;
                if (!O2.a.b(z2.k.class)) {
                    try {
                        G7.j.e(str4, "$tree");
                        G7.j.e(kVar2, "this$0");
                        byte[] bytes = str4.getBytes(O7.a.f2244a);
                        G7.j.d(bytes, "(this as java.lang.String).getBytes(charset)");
                        String v6 = H.v(SameMD5.TAG, bytes);
                        Date date = C0785a.f13439n;
                        C0785a m = g.m();
                        if (v6 == null || !v6.equals(kVar2.f24533d)) {
                            String str5 = z2.k.f24530e;
                            kVar2.b(i.d(str4, m, com.facebook.r.b()), v6);
                            return;
                        }
                        return;
                    } catch (Throwable th5) {
                        O2.a.a(z2.k.class, th5);
                        return;
                    }
                }
                return;
        }
    }

    public /* synthetic */ k(m1.g gVar, Context context) {
        this.b = 16;
        this.f13491d = gVar;
        this.f13490c = context;
    }
}
