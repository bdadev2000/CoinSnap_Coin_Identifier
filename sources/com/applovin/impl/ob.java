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
    protected final com.applovin.impl.sdk.k a;

    /* renamed from: b */
    private final WeakReference f6458b;

    /* renamed from: c */
    private final Map f6459c = a4.j.r();

    /* renamed from: d */
    private volatile AppLovinAdLoadListener f6460d;

    /* renamed from: e */
    private volatile AppLovinAdDisplayListener f6461e;

    /* renamed from: f */
    private volatile AppLovinAdVideoPlaybackListener f6462f;

    /* renamed from: g */
    private volatile AppLovinAdClickListener f6463g;

    /* renamed from: h */
    private volatile com.applovin.impl.sdk.ad.b f6464h;

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
        public void failedToReceiveAd(int i10) {
            ob.this.b(i10);
        }
    }

    public ob(AppLovinSdk appLovinSdk, Context context) {
        if (appLovinSdk != null) {
            if (context != null) {
                this.a = appLovinSdk.a();
                this.f6458b = new WeakReference(context);
                return;
            }
            throw new IllegalArgumentException("No context specified");
        }
        throw new IllegalArgumentException("No sdk specified");
    }

    public static /* synthetic */ void f(Runnable runnable, DialogInterface dialogInterface) {
        runnable.run();
    }

    public static /* synthetic */ void h(ob obVar, Context context, AppLovinFullscreenAdViewObserver appLovinFullscreenAdViewObserver, ViewGroup viewGroup) {
        obVar.a(viewGroup, context, appLovinFullscreenAdViewObserver);
    }

    @Override // com.applovin.adview.AppLovinInterstitialAdDialog
    public void setAdClickListener(AppLovinAdClickListener appLovinAdClickListener) {
        this.f6463g = appLovinAdClickListener;
    }

    @Override // com.applovin.adview.AppLovinInterstitialAdDialog
    public void setAdDisplayListener(AppLovinAdDisplayListener appLovinAdDisplayListener) {
        this.f6461e = appLovinAdDisplayListener;
    }

    @Override // com.applovin.adview.AppLovinInterstitialAdDialog
    public void setAdLoadListener(AppLovinAdLoadListener appLovinAdLoadListener) {
        this.f6460d = appLovinAdLoadListener;
    }

    @Override // com.applovin.adview.AppLovinInterstitialAdDialog
    public void setAdVideoPlaybackListener(AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener) {
        this.f6462f = appLovinAdVideoPlaybackListener;
    }

    @Override // com.applovin.adview.AppLovinInterstitialAdDialog
    public void setExtraInfo(String str, Object obj) {
        if (str != null) {
            this.f6459c.put(str, obj);
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
        AppLovinAd a10 = zp.a(appLovinAd, this.a);
        Context e2 = e();
        String a11 = a(a10, appLovinAd, e2);
        if (StringUtils.isValidString(a11)) {
            a(appLovinAd, a11);
        } else {
            a((com.applovin.impl.sdk.ad.b) a10, e2);
        }
    }

    public String toString() {
        return "AppLovinInterstitialAdDialog{}";
    }

    private Context e() {
        return (Context) this.f6458b.get();
    }

    private void h() {
        if (this.a.e().a() == null) {
            this.a.F().c(aa.f3628r);
        }
    }

    public AppLovinAdDisplayListener c() {
        return this.f6461e;
    }

    public AppLovinAdVideoPlaybackListener d() {
        return this.f6462f;
    }

    public com.applovin.impl.sdk.ad.b f() {
        return this.f6464h;
    }

    public Map g() {
        return this.f6459c;
    }

    public void i() {
        com.applovin.impl.sdk.ad.b bVar = this.f6464h;
        long d10 = bVar.d();
        if (bVar.canExpire() && bVar.getTimeToLiveMillis() <= d10) {
            bVar.setExpired();
            bc.b(this.f6461e, bVar);
        } else if (d10 >= 0) {
            AppLovinSdkUtils.runOnUiThreadDelayed(new rs(23, this, bVar), d10);
        }
    }

    public AppLovinAdClickListener b() {
        return this.f6463g;
    }

    private void b(Context context) {
        Intent intent = new Intent(context, (Class<?>) AppLovinFullscreenActivity.class);
        intent.putExtra("com.applovin.interstitial.sdk_key", this.a.d0());
        AppLovinFullscreenActivity.parentInterstitialWrapper = this;
        if (this.a.e().a() == null && ((Boolean) this.a.a(oj.K2)).booleanValue()) {
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
        this.f6463g = null;
        this.f6460d = null;
        this.f6462f = null;
        this.f6461e = null;
    }

    @Override // com.applovin.adview.AppLovinInterstitialAdDialog
    public void showAndRender(AppLovinAd appLovinAd, ViewGroup viewGroup, androidx.lifecycle.p pVar) {
        if (viewGroup != null && pVar != null) {
            AppLovinAd a10 = zp.a(appLovinAd, this.a);
            Context e2 = e();
            String a11 = a(a10, appLovinAd, e2);
            if (StringUtils.isValidString(a11)) {
                a(appLovinAd, a11);
                return;
            }
            AppLovinFullscreenAdViewObserver appLovinFullscreenAdViewObserver = new AppLovinFullscreenAdViewObserver(pVar, this, this.a);
            pVar.a(appLovinFullscreenAdViewObserver);
            a((com.applovin.impl.sdk.ad.b) a10, viewGroup, appLovinFullscreenAdViewObserver, e2);
            return;
        }
        com.applovin.impl.sdk.t.h("InterstitialAdDialogWrapper", "Failed to show interstitial: attempting to show ad with null container view or lifecycle object");
        a(appLovinAd, "Failed to show interstitial: attempting to show ad with null container view or lifecycle object");
    }

    /* loaded from: classes.dex */
    public class b implements n9.d {
        final /* synthetic */ Context a;

        /* renamed from: b */
        final /* synthetic */ AppLovinFullscreenAdViewObserver f6465b;

        /* renamed from: c */
        final /* synthetic */ ViewGroup f6466c;

        public b(Context context, AppLovinFullscreenAdViewObserver appLovinFullscreenAdViewObserver, ViewGroup viewGroup) {
            this.a = context;
            this.f6465b = appLovinFullscreenAdViewObserver;
            this.f6466c = viewGroup;
        }

        @Override // com.applovin.impl.n9.d
        public void a(n9 n9Var) {
            if (r.a((Activity) this.a)) {
                com.applovin.impl.sdk.t.h("InterstitialAdDialogWrapper", "Failed to show interstitial: attempting to show ad when parent activity is finishing");
                ob.a(ob.this.f6464h, ob.this.f6461e, "Failed to show interstitial: attempting to show ad when parent activity is finishing", null, null);
                return;
            }
            this.f6465b.setPresenter(n9Var);
            try {
                n9Var.a(this.f6466c);
            } catch (Throwable th2) {
                String str = "Failed to show interstitial: presenter threw exception " + th2;
                com.applovin.impl.sdk.t.h("InterstitialAdDialogWrapper", str);
                ob.a(ob.this.f6464h, ob.this.f6461e, str, null, null);
            }
        }

        @Override // com.applovin.impl.n9.d
        public void a(String str, Throwable th2) {
            ob.a(ob.this.f6464h, ob.this.f6461e, str, th2, null);
        }
    }

    private void a(AppLovinAd appLovinAd, String str) {
        if (this.f6461e != null) {
            if (this.f6461e instanceof lb) {
                ((lb) this.f6461e).onAdDisplayFailed(str);
            } else {
                this.f6461e.adHidden(appLovinAd);
            }
        }
    }

    public static void a(com.applovin.impl.sdk.ad.b bVar, AppLovinAdDisplayListener appLovinAdDisplayListener, String str, Throwable th2, AppLovinFullscreenActivity appLovinFullscreenActivity) {
        com.applovin.impl.sdk.t.c("InterstitialAdDialogWrapper", str, th2);
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
        AppLovinSdkUtils.runOnUiThread(new rs(22, this, appLovinAd));
    }

    public /* synthetic */ void a(com.applovin.impl.sdk.ad.b bVar) {
        this.a.L();
        if (com.applovin.impl.sdk.t.a()) {
            this.a.L().a("InterstitialAdDialogWrapper", "Re-showing the current ad after app launch.");
        }
        showAndRender(bVar);
    }

    public void b(int i10) {
        AppLovinSdkUtils.runOnUiThread(new st(i10, 2, this));
    }

    public /* synthetic */ void a(AppLovinAd appLovinAd) {
        if (this.f6460d != null) {
            this.f6460d.adReceived(appLovinAd);
        }
    }

    public /* synthetic */ void a(int i10) {
        if (this.f6460d != null) {
            this.f6460d.failedToReceiveAd(i10);
        }
    }

    public /* synthetic */ void a(Context context) {
        this.a.L();
        if (com.applovin.impl.sdk.t.a()) {
            this.a.L().a("InterstitialAdDialogWrapper", "Presenting ad in a fullscreen activity");
        }
        b(context);
    }

    public /* synthetic */ void a(ViewGroup viewGroup, Context context, AppLovinFullscreenAdViewObserver appLovinFullscreenAdViewObserver) {
        this.a.L();
        if (com.applovin.impl.sdk.t.a()) {
            this.a.L().a("InterstitialAdDialogWrapper", "Presenting ad in a containerView(" + viewGroup + ")");
        }
        viewGroup.setBackgroundColor(ViewCompat.MEASURED_STATE_MASK);
        n9.a(this.f6464h, this.f6463g, this.f6461e, this.f6462f, this.f6459c, this.a, (Activity) context, new b(context, appLovinFullscreenAdViewObserver, viewGroup));
    }

    private void a(AppLovinAdLoadListener appLovinAdLoadListener) {
        this.a.i().loadNextAd(AppLovinAdSize.INTERSTITIAL, appLovinAdLoadListener);
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
        if (!((AppLovinAdImpl) appLovinAd).hasShown() || !((Boolean) this.a.a(oj.Y1)).booleanValue()) {
            return null;
        }
        com.applovin.impl.sdk.t.h("InterstitialAdDialogWrapper", "Attempting to show ad again: " + appLovinAd);
        return "Attempting to show ad again";
    }

    private void a(com.applovin.impl.sdk.ad.b bVar, Context context, Runnable runnable) {
        if (TextUtils.isEmpty(bVar.H()) && bVar.Y0() && !c4.a(context) && (context instanceof Activity)) {
            AlertDialog create = new AlertDialog.Builder(context).setTitle(bVar.O()).setMessage(bVar.N()).setPositiveButton(bVar.M(), (DialogInterface.OnClickListener) null).create();
            create.setOnDismissListener(new ju(runnable, 0));
            create.show();
            return;
        }
        runnable.run();
    }

    private void a(com.applovin.impl.sdk.ad.b bVar, Context context) {
        h();
        this.a.f().a(bVar);
        this.f6464h = bVar;
        long max = Math.max(0L, ((Long) this.a.a(oj.f6722o2)).longValue());
        this.a.L();
        if (com.applovin.impl.sdk.t.a()) {
            this.a.L().a("InterstitialAdDialogWrapper", "Presenting ad with delay of " + max);
        }
        a(bVar, context, new iu(this, context, max, 0));
    }

    private void a(com.applovin.impl.sdk.ad.b bVar, final ViewGroup viewGroup, final AppLovinFullscreenAdViewObserver appLovinFullscreenAdViewObserver, final Context context) {
        h();
        this.a.f().a(bVar);
        this.f6464h = bVar;
        final long max = Math.max(0L, ((Long) this.a.a(oj.f6722o2)).longValue());
        this.a.L();
        if (com.applovin.impl.sdk.t.a()) {
            this.a.L().a("InterstitialAdDialogWrapper", "Presenting ad with delay of " + max);
        }
        a(bVar, context, new Runnable() { // from class: com.applovin.impl.ku
            @Override // java.lang.Runnable
            public final void run() {
                ob.this.a(context, viewGroup, appLovinFullscreenAdViewObserver, max);
            }
        });
    }

    public /* synthetic */ void a(Context context, long j3) {
        new Handler(context.getMainLooper()).postDelayed(new rs(21, this, context), j3);
    }

    public /* synthetic */ void a(Context context, ViewGroup viewGroup, AppLovinFullscreenAdViewObserver appLovinFullscreenAdViewObserver, long j3) {
        new Handler(context.getMainLooper()).postDelayed(new c3.b(this, context, appLovinFullscreenAdViewObserver, viewGroup), j3);
    }
}
