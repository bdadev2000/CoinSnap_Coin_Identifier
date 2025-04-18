package com.ads.control.admob;

import a4.h0;
import android.app.Activity;
import android.app.Application;
import android.app.Notification;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import androidx.activity.i;
import androidx.core.app.NotificationManagerCompat;
import androidx.core.app.f1;
import androidx.core.app.s0;
import androidx.lifecycle.g0;
import androidx.lifecycle.l0;
import androidx.lifecycle.n;
import androidx.lifecycle.o;
import androidx.lifecycle.u;
import androidx.lifecycle.x;
import c3.l;
import c3.m;
import com.google.android.gms.ads.AdActivity;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.appopen.AppOpenAd;
import com.plantcare.ai.identifier.plantid.R;
import g3.c;
import i3.a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import vd.e;

/* loaded from: classes.dex */
public class AppOpenManager implements Application.ActivityLifecycleCallbacks, u {

    /* renamed from: p, reason: collision with root package name */
    public static volatile AppOpenManager f2904p = null;

    /* renamed from: q, reason: collision with root package name */
    public static boolean f2905q = false;

    /* renamed from: d, reason: collision with root package name */
    public AppOpenAd.AppOpenAdLoadCallback f2908d;

    /* renamed from: f, reason: collision with root package name */
    public String f2909f;

    /* renamed from: g, reason: collision with root package name */
    public Activity f2910g;

    /* renamed from: h, reason: collision with root package name */
    public Application f2911h;

    /* renamed from: n, reason: collision with root package name */
    public final ArrayList f2917n;

    /* renamed from: b, reason: collision with root package name */
    public AppOpenAd f2906b = null;

    /* renamed from: c, reason: collision with root package name */
    public AppOpenAd f2907c = null;

    /* renamed from: i, reason: collision with root package name */
    public long f2912i = 0;

    /* renamed from: j, reason: collision with root package name */
    public long f2913j = 0;

    /* renamed from: k, reason: collision with root package name */
    public boolean f2914k = true;

    /* renamed from: l, reason: collision with root package name */
    public boolean f2915l = false;

    /* renamed from: m, reason: collision with root package name */
    public boolean f2916m = false;

    /* renamed from: o, reason: collision with root package name */
    public a f2918o = null;

    private AppOpenManager() {
        new i(this, 11);
        this.f2917n = new ArrayList();
    }

    public static synchronized AppOpenManager f() {
        AppOpenManager appOpenManager;
        synchronized (AppOpenManager.class) {
            if (f2904p == null) {
                f2904p = new AppOpenManager();
            }
            appOpenManager = f2904p;
        }
        return appOpenManager;
    }

    public final void c(Class cls) {
        Log.d("AppOpenManager", "disableAppResumeWithActivity: ".concat(cls.getName()));
        this.f2917n.add(cls);
    }

    public final void d() {
        a aVar = this.f2918o;
        if (aVar != null && aVar.isShowing()) {
            try {
                this.f2918o.dismiss();
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }

    public final void e(boolean z10) {
        String str;
        String str2;
        String e2;
        Log.d("AppOpenManager", "fetchAd: isSplash = " + z10);
        if (g(z10)) {
            return;
        }
        this.f2908d = new l(this, z10);
        String str3 = null;
        if (this.f2910g != null) {
            c a = c.a();
            Activity activity = this.f2910g;
            if (a.f18018m) {
                return;
            }
            List asList = Arrays.asList(activity.getResources().getStringArray(R.array.list_id_test));
            if (z10) {
                str = null;
            } else {
                str = this.f2909f;
            }
            if (asList.contains(str)) {
                Activity activity2 = this.f2910g;
                if (z10) {
                    str2 = null;
                } else {
                    str2 = this.f2909f;
                }
                s0 s0Var = new s0(activity2, "warning_ads");
                s0Var.d("Found test ad id");
                if (z10) {
                    e2 = "Splash Ads: ";
                } else {
                    e2 = e.e("AppResume Ads: ", str2);
                }
                s0Var.f1229f = s0.b(e2);
                s0Var.f1242s.icon = R.drawable.ic_warning;
                Notification a10 = s0Var.a();
                NotificationManagerCompat from = NotificationManagerCompat.from(activity2);
                a10.flags |= 16;
                if (Build.VERSION.SDK_INT >= 26) {
                    h0.m();
                    from.createNotificationChannel(f1.c());
                }
                from.notify(!z10 ? 1 : 0, a10);
            }
        }
        AdRequest build = new AdRequest.Builder().build();
        Application application = this.f2911h;
        if (!z10) {
            str3 = this.f2909f;
        }
        AppOpenAd.load(application, str3, build, 1, this.f2908d);
    }

    public final boolean g(boolean z10) {
        long j3;
        boolean z11;
        if (z10) {
            j3 = this.f2913j;
        } else {
            j3 = this.f2912i;
        }
        if (new Date().getTime() - j3 < 14400000) {
            z11 = true;
        } else {
            z11 = false;
        }
        Log.d("AppOpenManager", "isAdAvailable: " + z11);
        if (!z10 ? this.f2906b != null : this.f2907c != null) {
            if (z11) {
                return true;
            }
        }
        return false;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        this.f2910g = null;
        Log.d("AppOpenManager", "onActivityDestroyed: null");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        this.f2910g = activity;
        Log.d("AppOpenManager", "onActivityResumed: " + this.f2910g);
        if (!activity.getClass().getName().equals(AdActivity.class.getName())) {
            Log.d("AppOpenManager", "onActivityResumed 1: with ".concat(activity.getClass().getName()));
            e(false);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        this.f2910g = activity;
        Log.d("AppOpenManager", "onActivityStarted: " + this.f2910g);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }

    @g0(n.ON_PAUSE)
    public void onPause() {
        Log.d("AppOpenManager", "onPause");
    }

    @g0(n.ON_START)
    public void onResume() {
        a aVar;
        if (!this.f2914k) {
            Log.d("AppOpenManager", "onResume: app resume is disabled");
            return;
        }
        if (this.f2915l) {
            Log.d("AppOpenManager", "onResume: interstitial is showing");
            return;
        }
        if (this.f2916m) {
            Log.d("AppOpenManager", "onResume:ad resume disable ad by action");
            this.f2916m = false;
            return;
        }
        Iterator it = this.f2917n.iterator();
        while (it.hasNext()) {
            if (((Class) it.next()).getName().equals(this.f2910g.getClass().getName())) {
                Log.d("AppOpenManager", "onStart: activity is disabled");
                return;
            }
        }
        Log.d("AppOpenManager", "onStart: show resume ads :".concat(this.f2910g.getClass().getName()));
        if (this.f2910g != null && !c.a().f18018m) {
            StringBuilder sb2 = new StringBuilder("showAdIfAvailable: ");
            l0 l0Var = l0.f1793k;
            sb2.append(l0Var.f1799h.f1835d);
            Log.d("AppOpenManager", sb2.toString());
            Log.d("AppOpenManager", "showAd isSplash: false");
            x xVar = l0Var.f1799h;
            o oVar = xVar.f1835d;
            o oVar2 = o.STARTED;
            if (!oVar.a(oVar2)) {
                Log.d("AppOpenManager", "showAdIfAvailable: return");
                return;
            }
            if (!f2905q && g(false)) {
                Log.d("AppOpenManager", "Will show ad isSplash:false");
                if (this.f2906b != null && this.f2910g != null && !c.a().f18018m && xVar.f1835d.a(oVar2)) {
                    int i10 = 1;
                    try {
                        d();
                        aVar = new a(this.f2910g, 1);
                        this.f2918o = aVar;
                    } catch (Exception e2) {
                        e2.printStackTrace();
                    }
                    try {
                        aVar.show();
                        AppOpenAd appOpenAd = this.f2906b;
                        if (appOpenAd != null) {
                            appOpenAd.setFullScreenContentCallback(new m(this, i10));
                            this.f2906b.show(this.f2910g);
                            return;
                        } else {
                            d();
                            return;
                        }
                    } catch (Exception unused) {
                        return;
                    }
                }
                return;
            }
            Log.d("AppOpenManager", "Ad is not ready");
            e(false);
        }
    }

    @g0(n.ON_STOP)
    public void onStop() {
        Log.d("AppOpenManager", "onStop: app stop");
    }
}
