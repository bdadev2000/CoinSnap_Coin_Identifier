package m1;

import android.app.Activity;
import android.app.Application;
import android.app.Notification;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import androidx.core.app.NotificationManagerCompat;
import androidx.core.app.O;
import androidx.lifecycle.C0513x;
import androidx.lifecycle.E;
import androidx.lifecycle.EnumC0503m;
import androidx.lifecycle.EnumC0504n;
import androidx.lifecycle.I;
import androidx.lifecycle.InterfaceC0510u;
import com.google.android.gms.ads.AdActivity;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.appopen.AppOpenAd;
import com.google.ar.core.G;
import com.tools.arruler.photomeasure.camera.ruler.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Iterator;
import p1.C2538b;
import r1.DialogC2656a;
import x0.AbstractC2914a;

/* loaded from: classes.dex */
public final class k implements Application.ActivityLifecycleCallbacks, InterfaceC0510u {
    public static volatile k m = null;

    /* renamed from: n, reason: collision with root package name */
    public static boolean f21742n = false;

    /* renamed from: d, reason: collision with root package name */
    public AppOpenAd.AppOpenAdLoadCallback f21744d;

    /* renamed from: f, reason: collision with root package name */
    public Activity f21745f;

    /* renamed from: k, reason: collision with root package name */
    public final ArrayList f21750k;
    public AppOpenAd b = null;

    /* renamed from: c, reason: collision with root package name */
    public AppOpenAd f21743c = null;

    /* renamed from: g, reason: collision with root package name */
    public long f21746g = 0;

    /* renamed from: h, reason: collision with root package name */
    public long f21747h = 0;

    /* renamed from: i, reason: collision with root package name */
    public boolean f21748i = false;

    /* renamed from: j, reason: collision with root package name */
    public boolean f21749j = false;
    public DialogC2656a l = null;

    public k() {
        new B3.k(this, 19);
        this.f21750k = new ArrayList();
    }

    public static synchronized k f() {
        k kVar;
        synchronized (k.class) {
            try {
                if (m == null) {
                    m = new k();
                }
                kVar = m;
            } catch (Throwable th) {
                throw th;
            }
        }
        return kVar;
    }

    public final void d() {
        DialogC2656a dialogC2656a = this.l;
        if (dialogC2656a != null && dialogC2656a.isShowing()) {
            try {
                this.l.dismiss();
            } catch (Exception e4) {
                e4.printStackTrace();
            }
        }
    }

    public final void e(boolean z8) {
        String d2;
        Log.d("AppOpenManager", "fetchAd: isSplash = " + z8);
        if (g(z8)) {
            return;
        }
        this.f21744d = new i(this, z8);
        if (this.f21745f != null) {
            C2538b a6 = C2538b.a();
            Activity activity = this.f21745f;
            if (a6.m) {
                return;
            }
            if (Arrays.asList(activity.getResources().getStringArray(R.array.list_id_test)).contains(null)) {
                Activity activity2 = this.f21745f;
                O o3 = new O(activity2, "warning_ads");
                o3.f4369e = O.b("Found test ad id");
                if (z8) {
                    d2 = "Splash Ads: ";
                } else {
                    d2 = AbstractC2914a.d("AppResume Ads: ", null);
                }
                o3.f4370f = O.b(d2);
                o3.f4381s.icon = R.drawable.ic_warning;
                Notification a9 = o3.a();
                NotificationManagerCompat from = NotificationManagerCompat.from(activity2);
                a9.flags |= 16;
                if (Build.VERSION.SDK_INT >= 26) {
                    from.createNotificationChannel(G.c());
                }
                from.notify(!z8 ? 1 : 0, a9);
            }
        }
        AppOpenAd.load((Context) null, (String) null, new AdRequest.Builder().build(), 1, this.f21744d);
    }

    public final boolean g(boolean z8) {
        long j7;
        boolean z9;
        if (z8) {
            j7 = this.f21747h;
        } else {
            j7 = this.f21746g;
        }
        if (new Date().getTime() - j7 < 14400000) {
            z9 = true;
        } else {
            z9 = false;
        }
        Log.d("AppOpenManager", "isAdAvailable: " + z9);
        if (z8) {
            if (this.f21743c == null) {
                return false;
            }
        } else if (this.b == null) {
            return false;
        }
        if (!z9) {
            return false;
        }
        return true;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        this.f21745f = null;
        Log.d("AppOpenManager", "onActivityDestroyed: null");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        this.f21745f = activity;
        Log.d("AppOpenManager", "onActivityResumed: " + this.f21745f);
        if (!activity.getClass().getName().equals(AdActivity.class.getName())) {
            Log.d("AppOpenManager", "onActivityResumed 1: with ".concat(activity.getClass().getName()));
            e(false);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        this.f21745f = activity;
        Log.d("AppOpenManager", "onActivityStarted: " + this.f21745f);
    }

    @E(EnumC0503m.ON_PAUSE)
    public void onPause() {
        Log.d("AppOpenManager", "onPause");
    }

    @E(EnumC0503m.ON_START)
    public void onResume() {
        if (this.f21748i) {
            Log.d("AppOpenManager", "onResume: interstitial is showing");
            return;
        }
        if (this.f21749j) {
            Log.d("AppOpenManager", "onResume:ad resume disable ad by action");
            this.f21749j = false;
            return;
        }
        Iterator it = this.f21750k.iterator();
        while (it.hasNext()) {
            if (((Class) it.next()).getName().equals(this.f21745f.getClass().getName())) {
                Log.d("AppOpenManager", "onStart: activity is disabled");
                return;
            }
        }
        Log.d("AppOpenManager", "onStart: show resume ads :".concat(this.f21745f.getClass().getName()));
        if (this.f21745f != null && !C2538b.a().m) {
            StringBuilder sb = new StringBuilder("showAdIfAvailable: ");
            I i9 = I.f4828k;
            sb.append(i9.f4833h.f4904d);
            Log.d("AppOpenManager", sb.toString());
            Log.d("AppOpenManager", "showAd isSplash: false");
            C0513x c0513x = i9.f4833h;
            EnumC0504n enumC0504n = c0513x.f4904d;
            EnumC0504n enumC0504n2 = EnumC0504n.f4894f;
            if (enumC0504n.compareTo(enumC0504n2) >= 0) {
                if (!f21742n && g(false)) {
                    Log.d("AppOpenManager", "Will show ad isSplash:false");
                    if (this.b != null && this.f21745f != null && !C2538b.a().m && c0513x.f4904d.compareTo(enumC0504n2) >= 0) {
                        try {
                            d();
                            DialogC2656a dialogC2656a = new DialogC2656a(this.f21745f, R.style.AppTheme);
                            this.l = dialogC2656a;
                            try {
                                dialogC2656a.show();
                            } catch (Exception unused) {
                                return;
                            }
                        } catch (Exception e4) {
                            e4.printStackTrace();
                        }
                        AppOpenAd appOpenAd = this.b;
                        if (appOpenAd != null) {
                            appOpenAd.setFullScreenContentCallback(new j(this));
                            this.b.show(this.f21745f);
                            return;
                        } else {
                            d();
                            return;
                        }
                    }
                    return;
                }
                Log.d("AppOpenManager", "Ad is not ready");
                e(false);
                return;
            }
            Log.d("AppOpenManager", "showAdIfAvailable: return");
        }
    }

    @E(EnumC0503m.ON_STOP)
    public void onStop() {
        Log.d("AppOpenManager", "onStop: app stop");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }
}
