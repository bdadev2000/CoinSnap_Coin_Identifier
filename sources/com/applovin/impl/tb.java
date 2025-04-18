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
import androidx.lifecycle.Lifecycle;
import com.applovin.adview.AppLovinFullscreenActivity;
import com.applovin.adview.AppLovinFullscreenAdViewObserver;
import com.applovin.adview.AppLovinInterstitialAdDialog;
import com.applovin.impl.p9;
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
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.utils.Logger;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public class tb implements AppLovinInterstitialAdDialog {

    /* renamed from: a */
    protected final com.applovin.impl.sdk.j f27039a;

    /* renamed from: b */
    private final WeakReference f27040b;

    /* renamed from: c */
    private final Map f27041c = Collections.synchronizedMap(new HashMap());
    private volatile AppLovinAdLoadListener d;
    private volatile AppLovinAdDisplayListener e;

    /* renamed from: f */
    private volatile AppLovinAdVideoPlaybackListener f27042f;

    /* renamed from: g */
    private volatile AppLovinAdClickListener f27043g;

    /* renamed from: h */
    private volatile com.applovin.impl.sdk.ad.b f27044h;

    /* loaded from: classes2.dex */
    public class a implements AppLovinAdLoadListener {
        public a() {
        }

        @Override // com.applovin.sdk.AppLovinAdLoadListener
        public void adReceived(AppLovinAd appLovinAd) {
            tb.this.b(appLovinAd);
            tb.this.showAndRender(appLovinAd);
        }

        @Override // com.applovin.sdk.AppLovinAdLoadListener
        public void failedToReceiveAd(int i2) {
            tb.this.b(i2);
        }
    }

    public tb(AppLovinSdk appLovinSdk, Context context) {
        if (appLovinSdk == null) {
            throw new IllegalArgumentException("No sdk specified");
        }
        if (context == null) {
            throw new IllegalArgumentException("No context specified");
        }
        this.f27039a = appLovinSdk.a();
        this.f27040b = new WeakReference(context);
    }

    private void i() {
        if (this.f27039a.e().a() == null) {
            this.f27039a.D().c(ca.f23254r);
        }
    }

    public static void safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(Context p02, Intent p12) {
        Logger.d("SafeDK-Special|SafeDK: Call> Landroid/content/Context;->startActivity(Landroid/content/Intent;)V");
        if (p12 == null) {
            return;
        }
        BrandSafetyUtils.detectAdClick(p12, com.safedk.android.utils.g.f30048a);
        p02.startActivity(p12);
    }

    public void a() {
        this.f27043g = null;
        this.d = null;
        this.f27042f = null;
        this.e = null;
    }

    @Override // com.applovin.adview.AppLovinInterstitialAdDialog
    public void setAdClickListener(AppLovinAdClickListener appLovinAdClickListener) {
        this.f27043g = appLovinAdClickListener;
    }

    @Override // com.applovin.adview.AppLovinInterstitialAdDialog
    public void setAdDisplayListener(AppLovinAdDisplayListener appLovinAdDisplayListener) {
        this.e = appLovinAdDisplayListener;
    }

    @Override // com.applovin.adview.AppLovinInterstitialAdDialog
    public void setAdLoadListener(AppLovinAdLoadListener appLovinAdLoadListener) {
        this.d = appLovinAdLoadListener;
    }

    @Override // com.applovin.adview.AppLovinInterstitialAdDialog
    public void setAdVideoPlaybackListener(AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener) {
        this.f27042f = appLovinAdVideoPlaybackListener;
    }

    @Override // com.applovin.adview.AppLovinInterstitialAdDialog
    public void setExtraInfo(String str, Object obj) {
        if (str == null) {
            throw new IllegalArgumentException("No key specified");
        }
        this.f27041c.put(str, obj);
    }

    @Override // com.applovin.adview.AppLovinInterstitialAdDialog
    public void show() {
        a(new a());
    }

    @Override // com.applovin.adview.AppLovinInterstitialAdDialog
    public void showAndRender(AppLovinAd appLovinAd) {
        AppLovinAd a2 = yp.a(appLovinAd, this.f27039a);
        Context e = e();
        String a3 = a(a2, appLovinAd, e);
        if (StringUtils.isValidString(a3)) {
            a(appLovinAd, a3);
        } else {
            a((com.applovin.impl.sdk.ad.b) a2, e);
        }
    }

    public String toString() {
        return "AppLovinInterstitialAdDialog{}";
    }

    private Context e() {
        return (Context) this.f27040b.get();
    }

    private long g() {
        String str = this.f27039a.g0().getExtraParameters().get("fullscreen_ad_display_delay_enabled");
        if (str == null || Boolean.parseBoolean(str)) {
            return Math.max(0L, ((Long) this.f27039a.a(sj.q2)).longValue());
        }
        return 0L;
    }

    public AppLovinAdClickListener b() {
        return this.f27043g;
    }

    public AppLovinAdDisplayListener c() {
        return this.e;
    }

    public AppLovinAdVideoPlaybackListener d() {
        return this.f27042f;
    }

    public com.applovin.impl.sdk.ad.b f() {
        return this.f27044h;
    }

    public Map h() {
        return this.f27041c;
    }

    private void b(Context context) {
        Intent intent = new Intent(context, (Class<?>) AppLovinFullscreenActivity.class);
        intent.putExtra("com.applovin.interstitial.sdk_key", this.f27039a.b0());
        AppLovinFullscreenActivity.parentInterstitialWrapper = this;
        if (this.f27039a.e().a() == null && ((Boolean) this.f27039a.a(sj.P2)).booleanValue()) {
            intent.addFlags(8388608);
        }
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        if (context instanceof Activity) {
            safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(context, intent);
            ((Activity) context).overridePendingTransition(0, 0);
        } else {
            intent.addFlags(268435456);
            safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(context, intent);
        }
        StrictMode.setThreadPolicy(allowThreadDiskReads);
    }

    private void a(AppLovinAd appLovinAd, String str) {
        if (this.e != null) {
            if (this.e instanceof qb) {
                ((qb) this.e).onAdDisplayFailed(str);
            } else {
                this.e.adHidden(appLovinAd);
            }
        }
    }

    @Override // com.applovin.adview.AppLovinInterstitialAdDialog
    public void showAndRender(AppLovinAd appLovinAd, ViewGroup viewGroup, Lifecycle lifecycle) {
        if (viewGroup != null && lifecycle != null) {
            AppLovinAd a2 = yp.a(appLovinAd, this.f27039a);
            Context e = e();
            String a3 = a(a2, appLovinAd, e);
            if (StringUtils.isValidString(a3)) {
                a(appLovinAd, a3);
                return;
            }
            AppLovinFullscreenAdViewObserver appLovinFullscreenAdViewObserver = new AppLovinFullscreenAdViewObserver(lifecycle, this, this.f27039a);
            lifecycle.a(appLovinFullscreenAdViewObserver);
            a((com.applovin.impl.sdk.ad.b) a2, viewGroup, appLovinFullscreenAdViewObserver, e);
            return;
        }
        com.applovin.impl.sdk.n.h("InterstitialAdDialogWrapper", "Failed to show interstitial: attempting to show ad with null container view or lifecycle object");
        a(appLovinAd, "Failed to show interstitial: attempting to show ad with null container view or lifecycle object");
    }

    /* loaded from: classes2.dex */
    public class b implements p9.d {

        /* renamed from: a */
        final /* synthetic */ Context f27046a;

        /* renamed from: b */
        final /* synthetic */ AppLovinFullscreenAdViewObserver f27047b;

        /* renamed from: c */
        final /* synthetic */ ViewGroup f27048c;

        public b(Context context, AppLovinFullscreenAdViewObserver appLovinFullscreenAdViewObserver, ViewGroup viewGroup) {
            this.f27046a = context;
            this.f27047b = appLovinFullscreenAdViewObserver;
            this.f27048c = viewGroup;
        }

        @Override // com.applovin.impl.p9.d
        public void a(p9 p9Var) {
            if (r.a((Activity) this.f27046a)) {
                com.applovin.impl.sdk.n.h("InterstitialAdDialogWrapper", "Failed to show interstitial: attempting to show ad when parent activity is finishing");
                tb.a(tb.this.f27044h, tb.this.e, "Failed to show interstitial: attempting to show ad when parent activity is finishing", null, null);
                return;
            }
            this.f27047b.setPresenter(p9Var);
            try {
                p9Var.a(this.f27048c);
            } catch (Throwable th) {
                String str = "Failed to show interstitial: presenter threw exception " + th;
                com.applovin.impl.sdk.n.h("InterstitialAdDialogWrapper", str);
                tb.a(tb.this.f27044h, tb.this.e, str, null, null);
            }
        }

        @Override // com.applovin.impl.p9.d
        public void a(String str, Throwable th) {
            tb.a(tb.this.f27044h, tb.this.e, str, th, null);
        }
    }

    public static void a(com.applovin.impl.sdk.ad.b bVar, AppLovinAdDisplayListener appLovinAdDisplayListener, String str, Throwable th, AppLovinFullscreenActivity appLovinFullscreenActivity) {
        com.applovin.impl.sdk.n.c("InterstitialAdDialogWrapper", str, th);
        if (appLovinAdDisplayListener instanceof qb) {
            gc.a(appLovinAdDisplayListener, str);
        } else {
            gc.b(appLovinAdDisplayListener, bVar);
        }
        if (appLovinFullscreenActivity != null) {
            appLovinFullscreenActivity.dismiss();
        }
    }

    public static /* synthetic */ void a(Runnable runnable, DialogInterface dialogInterface) {
        runnable.run();
    }

    public /* synthetic */ void a(AppLovinAd appLovinAd) {
        if (this.d != null) {
            this.d.adReceived(appLovinAd);
        }
    }

    public /* synthetic */ void a(int i2) {
        if (this.d != null) {
            this.d.failedToReceiveAd(i2);
        }
    }

    public /* synthetic */ void a(Context context) {
        this.f27039a.J();
        if (com.applovin.impl.sdk.n.a()) {
            this.f27039a.J().a("InterstitialAdDialogWrapper", "Presenting ad in a fullscreen activity");
        }
        b(context);
    }

    public void b(AppLovinAd appLovinAd) {
        AppLovinSdkUtils.runOnUiThread(new ms(26, this, appLovinAd));
    }

    public void b(int i2) {
        AppLovinSdkUtils.runOnUiThread(new du(i2, 2, this));
    }

    public /* synthetic */ void a(ViewGroup viewGroup, Context context, AppLovinFullscreenAdViewObserver appLovinFullscreenAdViewObserver) {
        this.f27039a.J();
        if (com.applovin.impl.sdk.n.a()) {
            this.f27039a.J().a("InterstitialAdDialogWrapper", "Presenting ad in a containerView(" + viewGroup + ")");
        }
        viewGroup.setBackgroundColor(-16777216);
        p9.a(this.f27044h, this.f27043g, this.e, this.f27042f, this.f27041c, this.f27039a, (Activity) context, new b(context, appLovinFullscreenAdViewObserver, viewGroup));
    }

    private void a(AppLovinAdLoadListener appLovinAdLoadListener) {
        this.f27039a.i().loadNextAd(AppLovinAdSize.INTERSTITIAL, appLovinAdLoadListener);
    }

    private String a(AppLovinAd appLovinAd, AppLovinAd appLovinAd2, Context context) {
        if (context == null) {
            com.applovin.impl.sdk.n.h("InterstitialAdDialogWrapper", "Failed to show interstitial: stale activity reference provided");
            return "Failed to show interstitial: stale activity reference provided";
        }
        if (appLovinAd == null) {
            com.applovin.impl.sdk.n.h("InterstitialAdDialogWrapper", "Unable to retrieve the loaded ad: " + appLovinAd2);
            return "Unable to retrieve the loaded ad";
        }
        if (!((AppLovinAdImpl) appLovinAd).hasShown() || !((Boolean) this.f27039a.a(sj.a2)).booleanValue()) {
            return null;
        }
        com.applovin.impl.sdk.n.h("InterstitialAdDialogWrapper", "Attempting to show ad again: " + appLovinAd);
        return "Attempting to show ad again";
    }

    private void a(com.applovin.impl.sdk.ad.b bVar, Context context, Runnable runnable) {
        if (TextUtils.isEmpty(bVar.H()) && bVar.c1() && !e4.a(context) && (context instanceof Activity)) {
            AlertDialog create = new AlertDialog.Builder(context).setTitle(bVar.O()).setMessage(bVar.N()).setPositiveButton(bVar.M(), (DialogInterface.OnClickListener) null).create();
            create.setOnDismissListener(new cw(runnable, 0));
            create.show();
            return;
        }
        runnable.run();
    }

    private void a(com.applovin.impl.sdk.ad.b bVar, Context context) {
        i();
        this.f27039a.f().a(bVar);
        this.f27044h = bVar;
        long g2 = g();
        this.f27039a.J();
        if (com.applovin.impl.sdk.n.a()) {
            this.f27039a.J().a("InterstitialAdDialogWrapper", "Presenting ad with delay " + g2 + "ms...");
        }
        a(bVar, context, new aw(this, context, g2, 0));
    }

    private void a(com.applovin.impl.sdk.ad.b bVar, final ViewGroup viewGroup, final AppLovinFullscreenAdViewObserver appLovinFullscreenAdViewObserver, final Context context) {
        i();
        this.f27039a.f().a(bVar);
        this.f27044h = bVar;
        final long g2 = g();
        this.f27039a.J();
        if (com.applovin.impl.sdk.n.a()) {
            this.f27039a.J().a("InterstitialAdDialogWrapper", "Presenting ad with delay " + g2 + "ms...");
        }
        a(bVar, context, new Runnable() { // from class: com.applovin.impl.bw
            @Override // java.lang.Runnable
            public final void run() {
                tb.this.a(context, viewGroup, appLovinFullscreenAdViewObserver, g2);
            }
        });
    }

    public /* synthetic */ void a(Context context, long j2) {
        new Handler(context.getMainLooper()).postDelayed(new ms(27, this, context), j2);
    }

    public /* synthetic */ void a(Context context, ViewGroup viewGroup, AppLovinFullscreenAdViewObserver appLovinFullscreenAdViewObserver, long j2) {
        new Handler(context.getMainLooper()).postDelayed(new ft(this, viewGroup, context, appLovinFullscreenAdViewObserver, 4), j2);
    }
}
