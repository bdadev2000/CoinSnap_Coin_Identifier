package com.applovin.impl;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Handler;
import android.os.StrictMode;
import android.text.TextUtils;
import android.view.ViewGroup;
import androidx.core.view.ViewCompat;
import androidx.lifecycle.AbstractC0505o;
import com.applovin.adview.AppLovinFullscreenActivity;
import com.applovin.adview.AppLovinFullscreenAdViewObserver;
import com.applovin.adview.AppLovinInterstitialAdDialog;
import com.applovin.impl.n9;
import com.applovin.impl.sdk.ad.AppLovinAdImpl;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdClickListener;
import com.applovin.sdk.AppLovinAdDisplayListener;
import com.applovin.sdk.AppLovinAdLoadListener;
import com.applovin.sdk.AppLovinAdSize;
import com.applovin.sdk.AppLovinAdVideoPlaybackListener;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinSdkUtils;
import java.lang.ref.WeakReference;
import java.util.Map;

/* loaded from: classes.dex */
public class ob implements AppLovinInterstitialAdDialog {

    /* renamed from: a */
    protected final com.applovin.impl.sdk.k f9392a;
    private final WeakReference b;

    /* renamed from: c */
    private final Map f9393c = Q7.n0.q();

    /* renamed from: d */
    private volatile AppLovinAdLoadListener f9394d;

    /* renamed from: e */
    private volatile AppLovinAdDisplayListener f9395e;

    /* renamed from: f */
    private volatile AppLovinAdVideoPlaybackListener f9396f;

    /* renamed from: g */
    private volatile AppLovinAdClickListener f9397g;

    /* renamed from: h */
    private volatile com.applovin.impl.sdk.ad.b f9398h;

    /* loaded from: classes.dex */
    public class a implements AppLovinAdLoadListener {
        public a() {
        }

        @Override // com.applovin.sdk.AppLovinAdLoadListener
        public void adReceived(AppLovinAd appLovinAd) {
            ob.this.b(appLovinAd);
            ob.this.showAndRender(appLovinAd);
        }

        @Override // com.applovin.sdk.AppLovinAdLoadListener
        public void failedToReceiveAd(int i9) {
            ob.this.b(i9);
        }
    }

    public ob(AppLovinSdk appLovinSdk, Context context) {
        if (appLovinSdk != null) {
            if (context != null) {
                this.f9392a = appLovinSdk.a();
                this.b = new WeakReference(context);
                return;
            }
            throw new IllegalArgumentException("No context specified");
        }
        throw new IllegalArgumentException("No sdk specified");
    }

    public void i() {
        com.applovin.impl.sdk.ad.b bVar = this.f9398h;
        long d2 = bVar.d();
        if (bVar.canExpire() && bVar.getTimeToLiveMillis() <= d2) {
            bVar.setExpired();
            bc.b(this.f9395e, bVar);
        } else if (d2 >= 0) {
            AppLovinSdkUtils.runOnUiThreadDelayed(new F(23, this, bVar), d2);
        }
    }

    @Override // com.applovin.adview.AppLovinInterstitialAdDialog
    public void setAdClickListener(AppLovinAdClickListener appLovinAdClickListener) {
        this.f9397g = appLovinAdClickListener;
    }

    @Override // com.applovin.adview.AppLovinInterstitialAdDialog
    public void setAdDisplayListener(AppLovinAdDisplayListener appLovinAdDisplayListener) {
        this.f9395e = appLovinAdDisplayListener;
    }

    @Override // com.applovin.adview.AppLovinInterstitialAdDialog
    public void setAdLoadListener(AppLovinAdLoadListener appLovinAdLoadListener) {
        this.f9394d = appLovinAdLoadListener;
    }

    @Override // com.applovin.adview.AppLovinInterstitialAdDialog
    public void setAdVideoPlaybackListener(AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener) {
        this.f9396f = appLovinAdVideoPlaybackListener;
    }

    @Override // com.applovin.adview.AppLovinInterstitialAdDialog
    public void setExtraInfo(String str, Object obj) {
        if (str != null) {
            this.f9393c.put(str, obj);
            return;
        }
        throw new IllegalArgumentException("No key specified");
    }

    @Override // com.applovin.adview.AppLovinInterstitialAdDialog
    public void show() {
        a(new a());
    }

    @Override // com.applovin.adview.AppLovinInterstitialAdDialog
    public void showAndRender(AppLovinAd appLovinAd) {
        AppLovinAd a6 = zp.a(appLovinAd, this.f9392a);
        Context e4 = e();
        String a9 = a(a6, appLovinAd, e4);
        if (StringUtils.isValidString(a9)) {
            a(appLovinAd, a9);
        } else {
            a((com.applovin.impl.sdk.ad.b) a6, e4);
        }
    }

    public String toString() {
        return "AppLovinInterstitialAdDialog{}";
    }

    private Context e() {
        return (Context) this.b.get();
    }

    private void h() {
        if (this.f9392a.e().a() == null) {
            this.f9392a.F().c(aa.f6608r);
        }
    }

    public AppLovinAdDisplayListener c() {
        return this.f9395e;
    }

    public AppLovinAdVideoPlaybackListener d() {
        return this.f9396f;
    }

    public com.applovin.impl.sdk.ad.b f() {
        return this.f9398h;
    }

    public Map g() {
        return this.f9393c;
    }

    public AppLovinAdClickListener b() {
        return this.f9397g;
    }

    private void b(Context context) {
        Intent intent = new Intent(context, (Class<?>) AppLovinFullscreenActivity.class);
        intent.putExtra("com.applovin.interstitial.sdk_key", this.f9392a.d0());
        AppLovinFullscreenActivity.parentInterstitialWrapper = this;
        if (this.f9392a.e().a() == null && ((Boolean) this.f9392a.a(oj.f9619K2)).booleanValue()) {
            intent.addFlags(8388608);
        }
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        if (context instanceof Activity) {
            context.startActivity(intent);
            ((Activity) context).overridePendingTransition(0, 0);
        } else {
            intent.addFlags(268435456);
            context.startActivity(intent);
        }
        StrictMode.setThreadPolicy(allowThreadDiskReads);
    }

    public void a() {
        this.f9397g = null;
        this.f9394d = null;
        this.f9396f = null;
        this.f9395e = null;
    }

    @Override // com.applovin.adview.AppLovinInterstitialAdDialog
    public void showAndRender(AppLovinAd appLovinAd, ViewGroup viewGroup, AbstractC0505o abstractC0505o) {
        if (viewGroup != null && abstractC0505o != null) {
            AppLovinAd a6 = zp.a(appLovinAd, this.f9392a);
            Context e4 = e();
            String a9 = a(a6, appLovinAd, e4);
            if (StringUtils.isValidString(a9)) {
                a(appLovinAd, a9);
                return;
            }
            AppLovinFullscreenAdViewObserver appLovinFullscreenAdViewObserver = new AppLovinFullscreenAdViewObserver(abstractC0505o, this, this.f9392a);
            abstractC0505o.a(appLovinFullscreenAdViewObserver);
            a((com.applovin.impl.sdk.ad.b) a6, viewGroup, appLovinFullscreenAdViewObserver, e4);
            return;
        }
        com.applovin.impl.sdk.t.h("InterstitialAdDialogWrapper", "Failed to show interstitial: attempting to show ad with null container view or lifecycle object");
        a(appLovinAd, "Failed to show interstitial: attempting to show ad with null container view or lifecycle object");
    }

    /* loaded from: classes.dex */
    public class b implements n9.d {

        /* renamed from: a */
        final /* synthetic */ Context f9400a;
        final /* synthetic */ AppLovinFullscreenAdViewObserver b;

        /* renamed from: c */
        final /* synthetic */ ViewGroup f9401c;

        public b(Context context, AppLovinFullscreenAdViewObserver appLovinFullscreenAdViewObserver, ViewGroup viewGroup) {
            this.f9400a = context;
            this.b = appLovinFullscreenAdViewObserver;
            this.f9401c = viewGroup;
        }

        @Override // com.applovin.impl.n9.d
        public void a(n9 n9Var) {
            if (r.a((Activity) this.f9400a)) {
                com.applovin.impl.sdk.t.h("InterstitialAdDialogWrapper", "Failed to show interstitial: attempting to show ad when parent activity is finishing");
                ob.a(ob.this.f9398h, ob.this.f9395e, "Failed to show interstitial: attempting to show ad when parent activity is finishing", null, null);
                return;
            }
            this.b.setPresenter(n9Var);
            try {
                n9Var.a(this.f9401c);
            } catch (Throwable th) {
                String str = "Failed to show interstitial: presenter threw exception " + th;
                com.applovin.impl.sdk.t.h("InterstitialAdDialogWrapper", str);
                ob.a(ob.this.f9398h, ob.this.f9395e, str, null, null);
            }
        }

        @Override // com.applovin.impl.n9.d
        public void a(String str, Throwable th) {
            ob.a(ob.this.f9398h, ob.this.f9395e, str, th, null);
        }
    }

    private void a(AppLovinAd appLovinAd, String str) {
        if (this.f9395e != null) {
            if (this.f9395e instanceof lb) {
                ((lb) this.f9395e).onAdDisplayFailed(str);
            } else {
                this.f9395e.adHidden(appLovinAd);
            }
        }
    }

    public static void a(com.applovin.impl.sdk.ad.b bVar, AppLovinAdDisplayListener appLovinAdDisplayListener, String str, Throwable th, AppLovinFullscreenActivity appLovinFullscreenActivity) {
        com.applovin.impl.sdk.t.c("InterstitialAdDialogWrapper", str, th);
        if (appLovinAdDisplayListener instanceof lb) {
            bc.a(appLovinAdDisplayListener, str);
        } else {
            bc.b(appLovinAdDisplayListener, bVar);
        }
        if (appLovinFullscreenActivity != null) {
            appLovinFullscreenActivity.dismiss();
        }
    }

    public void b(AppLovinAd appLovinAd) {
        AppLovinSdkUtils.runOnUiThread(new F(21, this, appLovinAd));
    }

    public void b(int i9) {
        AppLovinSdkUtils.runOnUiThread(new K0(i9, 2, this));
    }

    public /* synthetic */ void a(com.applovin.impl.sdk.ad.b bVar) {
        this.f9392a.L();
        if (com.applovin.impl.sdk.t.a()) {
            this.f9392a.L().a("InterstitialAdDialogWrapper", "Re-showing the current ad after app launch.");
        }
        showAndRender(bVar);
    }

    public /* synthetic */ void a(AppLovinAd appLovinAd) {
        if (this.f9394d != null) {
            this.f9394d.adReceived(appLovinAd);
        }
    }

    public /* synthetic */ void a(int i9) {
        if (this.f9394d != null) {
            this.f9394d.failedToReceiveAd(i9);
        }
    }

    public /* synthetic */ void a(Context context) {
        this.f9392a.L();
        if (com.applovin.impl.sdk.t.a()) {
            this.f9392a.L().a("InterstitialAdDialogWrapper", "Presenting ad in a fullscreen activity");
        }
        b(context);
    }

    public /* synthetic */ void a(ViewGroup viewGroup, Context context, AppLovinFullscreenAdViewObserver appLovinFullscreenAdViewObserver) {
        this.f9392a.L();
        if (com.applovin.impl.sdk.t.a()) {
            this.f9392a.L().a("InterstitialAdDialogWrapper", "Presenting ad in a containerView(" + viewGroup + ")");
        }
        viewGroup.setBackgroundColor(ViewCompat.MEASURED_STATE_MASK);
        n9.a(this.f9398h, this.f9397g, this.f9395e, this.f9396f, this.f9393c, this.f9392a, (Activity) context, new b(context, appLovinFullscreenAdViewObserver, viewGroup));
    }

    private void a(AppLovinAdLoadListener appLovinAdLoadListener) {
        this.f9392a.i().loadNextAd(AppLovinAdSize.INTERSTITIAL, appLovinAdLoadListener);
    }

    private String a(AppLovinAd appLovinAd, AppLovinAd appLovinAd2, Context context) {
        if (context == null) {
            com.applovin.impl.sdk.t.h("InterstitialAdDialogWrapper", "Failed to show interstitial: stale activity reference provided");
            return "Failed to show interstitial: stale activity reference provided";
        }
        if (appLovinAd == null) {
            com.applovin.impl.sdk.t.h("InterstitialAdDialogWrapper", "Unable to retrieve the loaded ad: " + appLovinAd2);
            return "Unable to retrieve the loaded ad";
        }
        if (!((AppLovinAdImpl) appLovinAd).hasShown() || !((Boolean) this.f9392a.a(oj.f9710Y1)).booleanValue()) {
            return null;
        }
        com.applovin.impl.sdk.t.h("InterstitialAdDialogWrapper", "Attempting to show ad again: " + appLovinAd);
        return "Attempting to show ad again";
    }

    private void a(com.applovin.impl.sdk.ad.b bVar, Context context, Runnable runnable) {
        if (TextUtils.isEmpty(bVar.H()) && bVar.Y0() && !c4.a(context) && (context instanceof Activity)) {
            AlertDialog create = new AlertDialog.Builder(context).setTitle(bVar.O()).setMessage(bVar.N()).setPositiveButton(bVar.M(), (DialogInterface.OnClickListener) null).create();
            create.setOnDismissListener(new B1(runnable, 0));
            create.show();
            return;
        }
        runnable.run();
    }

    private void a(com.applovin.impl.sdk.ad.b bVar, Context context) {
        h();
        this.f9392a.f().a(bVar);
        this.f9398h = bVar;
        long max = Math.max(0L, ((Long) this.f9392a.a(oj.f9818o2)).longValue());
        this.f9392a.L();
        if (com.applovin.impl.sdk.t.a()) {
            this.f9392a.L().a("InterstitialAdDialogWrapper", "Presenting ad with delay of " + max);
        }
        a(bVar, context, new E2.a(this, context, max, 1));
    }

    private void a(com.applovin.impl.sdk.ad.b bVar, final ViewGroup viewGroup, final AppLovinFullscreenAdViewObserver appLovinFullscreenAdViewObserver, final Context context) {
        h();
        this.f9392a.f().a(bVar);
        this.f9398h = bVar;
        final long max = Math.max(0L, ((Long) this.f9392a.a(oj.f9818o2)).longValue());
        this.f9392a.L();
        if (com.applovin.impl.sdk.t.a()) {
            this.f9392a.L().a("InterstitialAdDialogWrapper", "Presenting ad with delay of " + max);
        }
        a(bVar, context, new Runnable() { // from class: com.applovin.impl.A1
            @Override // java.lang.Runnable
            public final void run() {
                ob.this.a(context, viewGroup, appLovinFullscreenAdViewObserver, max);
            }
        });
    }

    public /* synthetic */ void a(Context context, long j7) {
        new Handler(context.getMainLooper()).postDelayed(new F(22, this, context), j7);
    }

    public /* synthetic */ void a(Context context, ViewGroup viewGroup, AppLovinFullscreenAdViewObserver appLovinFullscreenAdViewObserver, long j7) {
        new Handler(context.getMainLooper()).postDelayed(new I2.f(this, viewGroup, context, appLovinFullscreenAdViewObserver, 3), j7);
    }
}
