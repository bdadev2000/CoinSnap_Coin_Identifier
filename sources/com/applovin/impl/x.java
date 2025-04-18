package com.applovin.impl;

import android.content.DialogInterface;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RectShape;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.amazon.device.ads.AdError;
import com.amazon.device.ads.DTBAdResponse;
import com.applovin.impl.mediation.debugger.ui.testmode.AdControlButton;
import com.applovin.impl.o0;
import com.applovin.impl.y;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxAdRevenueListener;
import com.applovin.mediation.MaxAdViewAdListener;
import com.applovin.mediation.MaxDebuggerAdUnitDetailActivity;
import com.applovin.mediation.MaxError;
import com.applovin.mediation.MaxReward;
import com.applovin.mediation.MaxRewardedAdListener;
import com.applovin.mediation.ads.MaxAdView;
import com.applovin.mediation.ads.MaxAppOpenAd;
import com.applovin.mediation.ads.MaxInterstitialAd;
import com.applovin.mediation.ads.MaxRewardedAd;
import com.applovin.mediation.ads.MaxRewardedInterstitialAd;
import com.applovin.mediation.nativeAds.MaxNativeAdListener;
import com.applovin.mediation.nativeAds.MaxNativeAdLoader;
import com.applovin.mediation.nativeAds.MaxNativeAdView;
import com.applovin.sdk.AppLovinSdkUtils;
import com.applovin.sdk.R;
import java.util.List;

/* loaded from: classes.dex */
public abstract class x extends ne implements AdControlButton.a, MaxRewardedAdListener, MaxAdViewAdListener, MaxAdRevenueListener, o0.a {
    private com.applovin.impl.sdk.k a;

    /* renamed from: b, reason: collision with root package name */
    private z f8879b;

    /* renamed from: c, reason: collision with root package name */
    private kr f8880c;

    /* renamed from: d, reason: collision with root package name */
    private y f8881d;

    /* renamed from: f, reason: collision with root package name */
    private MaxAdView f8882f;

    /* renamed from: g, reason: collision with root package name */
    private MaxInterstitialAd f8883g;

    /* renamed from: h, reason: collision with root package name */
    private MaxAppOpenAd f8884h;

    /* renamed from: i, reason: collision with root package name */
    private MaxRewardedInterstitialAd f8885i;

    /* renamed from: j, reason: collision with root package name */
    private MaxRewardedAd f8886j;

    /* renamed from: k, reason: collision with root package name */
    private MaxNativeAdView f8887k;

    /* renamed from: l, reason: collision with root package name */
    private MaxNativeAdLoader f8888l;

    /* renamed from: m, reason: collision with root package name */
    private MaxAd f8889m;

    /* renamed from: n, reason: collision with root package name */
    private d0 f8890n;

    /* renamed from: o, reason: collision with root package name */
    private List f8891o;

    /* renamed from: p, reason: collision with root package name */
    private ListView f8892p;

    /* renamed from: q, reason: collision with root package name */
    private View f8893q;

    /* renamed from: r, reason: collision with root package name */
    private AdControlButton f8894r;

    /* renamed from: s, reason: collision with root package name */
    private TextView f8895s;

    /* renamed from: t, reason: collision with root package name */
    private o0 f8896t;

    /* loaded from: classes.dex */
    public class a extends MaxNativeAdListener {
        public a() {
        }

        @Override // com.applovin.mediation.nativeAds.MaxNativeAdListener
        public void onNativeAdClicked(MaxAd maxAd) {
            x.this.onAdClicked(maxAd);
        }

        @Override // com.applovin.mediation.nativeAds.MaxNativeAdListener
        public void onNativeAdLoadFailed(String str, MaxError maxError) {
            x.this.onAdLoadFailed(str, maxError);
        }

        @Override // com.applovin.mediation.nativeAds.MaxNativeAdListener
        public void onNativeAdLoaded(MaxNativeAdView maxNativeAdView, MaxAd maxAd) {
            if (x.this.f8889m != null) {
                x.this.f8888l.destroy(x.this.f8889m);
            }
            x.this.f8889m = maxAd;
            if (maxNativeAdView != null) {
                x.this.f8887k = maxNativeAdView;
            } else {
                x xVar = x.this;
                com.applovin.impl.sdk.k unused = x.this.a;
                xVar.f8887k = new MaxNativeAdView(MaxNativeAdView.MEDIUM_TEMPLATE_1, com.applovin.impl.sdk.k.k());
                x.this.f8888l.render(x.this.f8887k, maxAd);
            }
            x.this.onAdLoaded(maxAd);
        }
    }

    @Override // com.applovin.impl.ne
    public com.applovin.impl.sdk.k getSdk() {
        return this.a;
    }

    public void initialize(z zVar, @Nullable a0 a0Var, @Nullable kr krVar, com.applovin.impl.sdk.k kVar) {
        List a10;
        this.a = kVar;
        this.f8879b = zVar;
        this.f8880c = krVar;
        this.f8891o = kVar.n0().b();
        y yVar = new y(zVar, a0Var, krVar, this);
        this.f8881d = yVar;
        yVar.a(new androidx.fragment.app.f(this, kVar, zVar, a0Var));
        b();
        if (zVar.f().f()) {
            if ((krVar == null || krVar.b().d().A()) && (a10 = kVar.P().a(zVar.c())) != null && !a10.isEmpty()) {
                this.f8896t = new o0(a10, zVar.a(), this);
            }
        }
    }

    @Override // com.applovin.mediation.MaxAdListener
    public void onAdClicked(@NonNull MaxAd maxAd) {
        zp.a("onAdClicked", maxAd, this);
    }

    @Override // com.applovin.mediation.MaxAdViewAdListener
    public void onAdCollapsed(@NonNull MaxAd maxAd) {
        zp.a("onAdCollapsed", maxAd, this);
    }

    @Override // com.applovin.mediation.MaxAdListener
    public void onAdDisplayFailed(MaxAd maxAd, MaxError maxError) {
        this.f8894r.setControlState(AdControlButton.b.LOAD);
        this.f8895s.setText("");
        zp.a("Failed to display " + maxAd.getFormat().getDisplayName(), "MAX Error\nCode: " + maxError.getCode() + "\nMessage: " + maxError.getMessage() + "\n\n" + maxAd.getNetworkName() + " Display Error\nCode: " + maxError.getMediatedNetworkErrorCode() + "\nMessage: " + maxError.getMediatedNetworkErrorMessage(), this);
    }

    @Override // com.applovin.mediation.MaxAdListener
    public void onAdDisplayed(@NonNull MaxAd maxAd) {
        zp.a("onAdDisplayed", maxAd, this);
    }

    @Override // com.applovin.mediation.MaxAdViewAdListener
    public void onAdExpanded(@NonNull MaxAd maxAd) {
        zp.a("onAdExpanded", maxAd, this);
    }

    @Override // com.applovin.mediation.MaxAdListener
    public void onAdHidden(@NonNull MaxAd maxAd) {
        zp.a("onAdHidden", maxAd, this);
    }

    @Override // com.applovin.impl.o0.a
    public void onAdLoadFailed(AdError adError, MaxAdFormat maxAdFormat) {
        if (maxAdFormat.isAdViewAd()) {
            this.f8882f.setLocalExtraParameter("amazon_ad_error", adError);
        } else if (MaxAdFormat.INTERSTITIAL == maxAdFormat) {
            this.f8883g.setLocalExtraParameter("amazon_ad_error", adError);
        } else if (MaxAdFormat.APP_OPEN == maxAdFormat) {
            this.f8884h.setLocalExtraParameter("amazon_ad_error", adError);
        } else if (MaxAdFormat.REWARDED_INTERSTITIAL == maxAdFormat) {
            this.f8885i.setLocalExtraParameter("amazon_ad_error", adError);
        } else if (MaxAdFormat.REWARDED == maxAdFormat) {
            this.f8886j.setLocalExtraParameter("amazon_ad_error", adError);
        } else if (MaxAdFormat.NATIVE == maxAdFormat) {
            this.f8888l.setLocalExtraParameter("amazon_ad_error", adError);
        }
        a(maxAdFormat);
    }

    @Override // com.applovin.mediation.MaxAdListener
    public void onAdLoaded(@NonNull MaxAd maxAd) {
        this.f8895s.setText(maxAd.getNetworkName() + " ad loaded");
        this.f8894r.setControlState(AdControlButton.b.SHOW);
        if (maxAd.getFormat().isAdViewAd()) {
            a(this.f8882f, maxAd.getFormat().getSize());
        } else if (MaxAdFormat.NATIVE == this.f8879b.a()) {
            a(this.f8887k, MaxAdFormat.MREC.getSize());
        }
    }

    @Override // com.applovin.impl.o0.a
    public void onAdResponseLoaded(DTBAdResponse dTBAdResponse, MaxAdFormat maxAdFormat) {
        if (maxAdFormat.isAdViewAd()) {
            this.f8882f.setLocalExtraParameter("amazon_ad_response", dTBAdResponse);
        } else if (MaxAdFormat.INTERSTITIAL == maxAdFormat) {
            this.f8883g.setLocalExtraParameter("amazon_ad_response", dTBAdResponse);
        } else if (MaxAdFormat.APP_OPEN == maxAdFormat) {
            this.f8884h.setLocalExtraParameter("amazon_ad_response", dTBAdResponse);
        } else if (MaxAdFormat.REWARDED_INTERSTITIAL == maxAdFormat) {
            this.f8885i.setLocalExtraParameter("amazon_ad_response", dTBAdResponse);
        } else if (MaxAdFormat.REWARDED == maxAdFormat) {
            this.f8886j.setLocalExtraParameter("amazon_ad_response", dTBAdResponse);
        } else if (MaxAdFormat.NATIVE == maxAdFormat) {
            this.f8888l.setLocalExtraParameter("amazon_ad_response", dTBAdResponse);
        }
        a(maxAdFormat);
    }

    @Override // com.applovin.mediation.MaxAdRevenueListener
    public void onAdRevenuePaid(@NonNull MaxAd maxAd) {
        zp.a("onAdRevenuePaid", maxAd, this);
    }

    @Override // com.applovin.impl.mediation.debugger.ui.testmode.AdControlButton.a
    public void onClick(AdControlButton adControlButton) {
        if (this.a.n0().c()) {
            zp.a("Not Supported", "Ad loads are not supported while Test Mode is enabled. Please restart the app.", this);
            return;
        }
        if (this.f8881d.j() != this.f8879b.f()) {
            zp.a("Not Supported", "You cannot load an ad from this waterfall because it does not target the current device. To load an ad, please select the targeted waterfall.", this);
            return;
        }
        MaxAdFormat a10 = this.f8879b.a();
        AdControlButton.b bVar = AdControlButton.b.LOAD;
        if (bVar == adControlButton.getControlState()) {
            adControlButton.setControlState(AdControlButton.b.LOADING);
            o0 o0Var = this.f8896t;
            if (o0Var != null) {
                o0Var.a();
                return;
            } else {
                a(a10);
                return;
            }
        }
        if (AdControlButton.b.SHOW == adControlButton.getControlState()) {
            if (!a10.isAdViewAd() && a10 != MaxAdFormat.NATIVE) {
                adControlButton.setControlState(bVar);
            }
            b(a10);
        }
    }

    @Override // com.applovin.impl.ne, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.mediation_debugger_ad_unit_detail_activity);
        setTitle(this.f8881d.k());
        this.f8892p = (ListView) findViewById(R.id.listView);
        this.f8893q = findViewById(R.id.ad_presenter_view);
        this.f8894r = (AdControlButton) findViewById(R.id.ad_control_button);
        this.f8895s = (TextView) findViewById(R.id.status_textview);
        this.f8892p.setAdapter((ListAdapter) this.f8881d);
        this.f8895s.setText(a());
        this.f8895s.setTypeface(Typeface.DEFAULT_BOLD);
        this.f8894r.setOnClickListener(this);
        ShapeDrawable shapeDrawable = new ShapeDrawable();
        shapeDrawable.setPadding(0, 10, 0, 0);
        shapeDrawable.getPaint().setColor(-1);
        shapeDrawable.getPaint().setShadowLayer(10, 0.0f, -10, 855638016);
        shapeDrawable.setShape(new RectShape());
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{shapeDrawable});
        layerDrawable.setLayerInset(0, 0, 10, 0, 0);
        this.f8893q.setBackground(layerDrawable);
    }

    @Override // com.applovin.impl.ne, android.app.Activity
    public void onDestroy() {
        MaxAd maxAd;
        super.onDestroy();
        if (this.f8880c != null) {
            this.a.n0().a(this.f8891o);
        }
        MaxAdView maxAdView = this.f8882f;
        if (maxAdView != null) {
            maxAdView.destroy();
        }
        MaxInterstitialAd maxInterstitialAd = this.f8883g;
        if (maxInterstitialAd != null) {
            maxInterstitialAd.destroy();
        }
        MaxAppOpenAd maxAppOpenAd = this.f8884h;
        if (maxAppOpenAd != null) {
            maxAppOpenAd.destroy();
        }
        MaxRewardedInterstitialAd maxRewardedInterstitialAd = this.f8885i;
        if (maxRewardedInterstitialAd != null) {
            maxRewardedInterstitialAd.destroy();
        }
        MaxRewardedAd maxRewardedAd = this.f8886j;
        if (maxRewardedAd != null) {
            maxRewardedAd.destroy();
        }
        MaxNativeAdLoader maxNativeAdLoader = this.f8888l;
        if (maxNativeAdLoader != null && (maxAd = this.f8889m) != null) {
            maxNativeAdLoader.destroy(maxAd);
        }
    }

    @Override // com.applovin.mediation.MaxRewardedAdListener
    public void onRewardedVideoCompleted(@NonNull MaxAd maxAd) {
        zp.a("onRewardedVideoCompleted", maxAd, this);
    }

    @Override // com.applovin.mediation.MaxRewardedAdListener
    public void onRewardedVideoStarted(@NonNull MaxAd maxAd) {
        zp.a("onRewardedVideoStarted", maxAd, this);
    }

    @Override // com.applovin.mediation.MaxRewardedAdListener
    public void onUserRewarded(@NonNull MaxAd maxAd, @NonNull MaxReward maxReward) {
        zp.a("onUserRewarded", maxAd, this);
    }

    private void b() {
        String c10 = this.f8879b.c();
        if (this.f8879b.a().isAdViewAd()) {
            MaxAdView maxAdView = new MaxAdView(c10, this.f8879b.a(), this.a.v0(), this);
            this.f8882f = maxAdView;
            maxAdView.setExtraParameter("adaptive_banner", "false");
            this.f8882f.setExtraParameter("disable_auto_retries", "true");
            this.f8882f.setExtraParameter("disable_precache", "true");
            this.f8882f.setExtraParameter("allow_pause_auto_refresh_immediately", "true");
            this.f8882f.stopAutoRefresh();
            this.f8882f.setListener(this);
            return;
        }
        if (MaxAdFormat.INTERSTITIAL == this.f8879b.a()) {
            MaxInterstitialAd maxInterstitialAd = new MaxInterstitialAd(c10, this.a.v0(), this);
            this.f8883g = maxInterstitialAd;
            maxInterstitialAd.setExtraParameter("disable_auto_retries", "true");
            this.f8883g.setListener(this);
            return;
        }
        if (MaxAdFormat.APP_OPEN == this.f8879b.a()) {
            MaxAppOpenAd maxAppOpenAd = new MaxAppOpenAd(c10, this.a.v0());
            this.f8884h = maxAppOpenAd;
            maxAppOpenAd.setExtraParameter("disable_auto_retries", "true");
            this.f8884h.setListener(this);
            return;
        }
        if (MaxAdFormat.REWARDED_INTERSTITIAL == this.f8879b.a()) {
            MaxRewardedInterstitialAd maxRewardedInterstitialAd = new MaxRewardedInterstitialAd(c10, this.a.v0(), this);
            this.f8885i = maxRewardedInterstitialAd;
            maxRewardedInterstitialAd.setExtraParameter("disable_auto_retries", "true");
            this.f8885i.setListener(this);
            return;
        }
        if (MaxAdFormat.REWARDED == this.f8879b.a()) {
            MaxRewardedAd maxRewardedAd = MaxRewardedAd.getInstance(c10, this.a.v0(), this);
            this.f8886j = maxRewardedAd;
            maxRewardedAd.setExtraParameter("disable_auto_retries", "true");
            this.f8886j.setListener(this);
            return;
        }
        if (MaxAdFormat.NATIVE == this.f8879b.a()) {
            MaxNativeAdLoader maxNativeAdLoader = new MaxNativeAdLoader(c10, this.a.v0(), this);
            this.f8888l = maxNativeAdLoader;
            maxNativeAdLoader.setExtraParameter("disable_auto_retries", "true");
            this.f8888l.setNativeAdListener(new a());
            this.f8888l.setRevenueListener(this);
        }
    }

    private String a() {
        return this.a.n0().c() ? "Not supported while Test Mode is enabled" : this.f8881d.j() != this.f8879b.f() ? "This waterfall is not targeted for the current device" : "Tap to load an ad";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(yb ybVar, z zVar, a0 a0Var, com.applovin.impl.sdk.k kVar, MaxDebuggerAdUnitDetailActivity maxDebuggerAdUnitDetailActivity) {
        maxDebuggerAdUnitDetailActivity.initialize(zVar, a0Var, ((y.b) ybVar).v(), kVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(com.applovin.impl.sdk.k kVar, z zVar, a0 a0Var, hb hbVar, yb ybVar) {
        if (ybVar instanceof y.b) {
            r.a(this, MaxDebuggerAdUnitDetailActivity.class, kVar.e(), new androidx.fragment.app.f(ybVar, zVar, a0Var, kVar));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(DialogInterface dialogInterface) {
        this.f8890n = null;
    }

    private void a(MaxAdFormat maxAdFormat) {
        if (this.f8880c != null) {
            this.a.n0().a(this.f8880c.b().b());
        }
        if (maxAdFormat.isAdViewAd()) {
            this.f8882f.setPlacement("[Mediation Debugger Live Ad]");
            this.f8882f.loadAd();
            return;
        }
        if (MaxAdFormat.INTERSTITIAL == this.f8879b.a()) {
            this.f8883g.loadAd();
            return;
        }
        if (MaxAdFormat.APP_OPEN == this.f8879b.a()) {
            this.f8884h.loadAd();
            return;
        }
        if (MaxAdFormat.REWARDED_INTERSTITIAL == this.f8879b.a()) {
            this.f8885i.loadAd();
            return;
        }
        if (MaxAdFormat.REWARDED == this.f8879b.a()) {
            this.f8886j.loadAd();
        } else if (MaxAdFormat.NATIVE == this.f8879b.a()) {
            this.f8888l.setPlacement("[Mediation Debugger Live Ad]");
            this.f8888l.loadAd();
        } else {
            zp.a("Live ads currently unavailable for ad format", this);
        }
    }

    @Override // com.applovin.mediation.MaxAdListener
    public void onAdLoadFailed(@NonNull String str, @NonNull MaxError maxError) {
        this.f8894r.setControlState(AdControlButton.b.LOAD);
        this.f8895s.setText("");
        if (204 == maxError.getCode()) {
            zp.a("No Fill", "No fills often happen in live environments. Please make sure to use the Mediation Debugger test mode before you go live.", this);
            return;
        }
        zp.a("", "Failed to load with error code: " + maxError.getCode(), this);
    }

    private void a(ViewGroup viewGroup, AppLovinSdkUtils.Size size) {
        if (this.f8890n != null) {
            return;
        }
        d0 d0Var = new d0(viewGroup, size, this);
        this.f8890n = d0Var;
        d0Var.setOnDismissListener(new ju(this, 1));
        this.f8890n.show();
    }

    private void b(MaxAdFormat maxAdFormat) {
        if (maxAdFormat.isAdViewAd()) {
            a(this.f8882f, maxAdFormat.getSize());
            return;
        }
        if (MaxAdFormat.INTERSTITIAL == this.f8879b.a()) {
            this.f8883g.showAd("[Mediation Debugger Live Ad]");
            return;
        }
        if (MaxAdFormat.APP_OPEN == this.f8879b.a()) {
            this.f8884h.showAd("[Mediation Debugger Live Ad]");
            return;
        }
        if (MaxAdFormat.REWARDED_INTERSTITIAL == this.f8879b.a()) {
            this.f8885i.showAd("[Mediation Debugger Live Ad]");
        } else if (MaxAdFormat.REWARDED == this.f8879b.a()) {
            this.f8886j.showAd("[Mediation Debugger Live Ad]");
        } else if (MaxAdFormat.NATIVE == this.f8879b.a()) {
            a(this.f8887k, MaxAdFormat.MREC.getSize());
        }
    }
}
