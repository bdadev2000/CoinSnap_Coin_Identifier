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
import com.applovin.impl.C0731o0;
import com.applovin.impl.C0777y;
import com.applovin.impl.mediation.debugger.ui.testmode.AdControlButton;
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

/* renamed from: com.applovin.impl.x */
/* loaded from: classes.dex */
public abstract class AbstractActivityC0773x extends ne implements AdControlButton.a, MaxRewardedAdListener, MaxAdViewAdListener, MaxAdRevenueListener, C0731o0.a {

    /* renamed from: a */
    private com.applovin.impl.sdk.k f12074a;
    private C0781z b;

    /* renamed from: c */
    private kr f12075c;

    /* renamed from: d */
    private C0777y f12076d;

    /* renamed from: f */
    private MaxAdView f12077f;

    /* renamed from: g */
    private MaxInterstitialAd f12078g;

    /* renamed from: h */
    private MaxAppOpenAd f12079h;

    /* renamed from: i */
    private MaxRewardedInterstitialAd f12080i;

    /* renamed from: j */
    private MaxRewardedAd f12081j;

    /* renamed from: k */
    private MaxNativeAdView f12082k;
    private MaxNativeAdLoader l;
    private MaxAd m;

    /* renamed from: n */
    private DialogC0683d0 f12083n;

    /* renamed from: o */
    private List f12084o;

    /* renamed from: p */
    private ListView f12085p;

    /* renamed from: q */
    private View f12086q;

    /* renamed from: r */
    private AdControlButton f12087r;

    /* renamed from: s */
    private TextView f12088s;

    /* renamed from: t */
    private C0731o0 f12089t;

    /* renamed from: com.applovin.impl.x$a */
    /* loaded from: classes.dex */
    public class a extends MaxNativeAdListener {
        public a() {
        }

        @Override // com.applovin.mediation.nativeAds.MaxNativeAdListener
        public void onNativeAdClicked(MaxAd maxAd) {
            AbstractActivityC0773x.this.onAdClicked(maxAd);
        }

        @Override // com.applovin.mediation.nativeAds.MaxNativeAdListener
        public void onNativeAdLoadFailed(String str, MaxError maxError) {
            AbstractActivityC0773x.this.onAdLoadFailed(str, maxError);
        }

        @Override // com.applovin.mediation.nativeAds.MaxNativeAdListener
        public void onNativeAdLoaded(MaxNativeAdView maxNativeAdView, MaxAd maxAd) {
            if (AbstractActivityC0773x.this.m != null) {
                AbstractActivityC0773x.this.l.destroy(AbstractActivityC0773x.this.m);
            }
            AbstractActivityC0773x.this.m = maxAd;
            if (maxNativeAdView != null) {
                AbstractActivityC0773x.this.f12082k = maxNativeAdView;
            } else {
                AbstractActivityC0773x abstractActivityC0773x = AbstractActivityC0773x.this;
                com.applovin.impl.sdk.k unused = AbstractActivityC0773x.this.f12074a;
                abstractActivityC0773x.f12082k = new MaxNativeAdView(MaxNativeAdView.MEDIUM_TEMPLATE_1, com.applovin.impl.sdk.k.k());
                AbstractActivityC0773x.this.l.render(AbstractActivityC0773x.this.f12082k, maxAd);
            }
            AbstractActivityC0773x.this.onAdLoaded(maxAd);
        }
    }

    @Override // com.applovin.impl.ne
    public com.applovin.impl.sdk.k getSdk() {
        return this.f12074a;
    }

    public void initialize(C0781z c0781z, @Nullable C0668a0 c0668a0, @Nullable kr krVar, com.applovin.impl.sdk.k kVar) {
        List a6;
        this.f12074a = kVar;
        this.b = c0781z;
        this.f12075c = krVar;
        this.f12084o = kVar.n0().b();
        C0777y c0777y = new C0777y(c0781z, c0668a0, krVar, this);
        this.f12076d = c0777y;
        c0777y.a(new T2(this, kVar, c0781z, c0668a0));
        b();
        if (c0781z.f().f()) {
            if ((krVar == null || krVar.b().d().A()) && (a6 = kVar.P().a(c0781z.c())) != null && !a6.isEmpty()) {
                this.f12089t = new C0731o0(a6, c0781z.a(), this);
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
        this.f12087r.setControlState(AdControlButton.b.LOAD);
        this.f12088s.setText("");
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

    @Override // com.applovin.impl.C0731o0.a
    public void onAdLoadFailed(AdError adError, MaxAdFormat maxAdFormat) {
        if (maxAdFormat.isAdViewAd()) {
            this.f12077f.setLocalExtraParameter("amazon_ad_error", adError);
        } else if (MaxAdFormat.INTERSTITIAL == maxAdFormat) {
            this.f12078g.setLocalExtraParameter("amazon_ad_error", adError);
        } else if (MaxAdFormat.APP_OPEN == maxAdFormat) {
            this.f12079h.setLocalExtraParameter("amazon_ad_error", adError);
        } else if (MaxAdFormat.REWARDED_INTERSTITIAL == maxAdFormat) {
            this.f12080i.setLocalExtraParameter("amazon_ad_error", adError);
        } else if (MaxAdFormat.REWARDED == maxAdFormat) {
            this.f12081j.setLocalExtraParameter("amazon_ad_error", adError);
        } else if (MaxAdFormat.NATIVE == maxAdFormat) {
            this.l.setLocalExtraParameter("amazon_ad_error", adError);
        }
        a(maxAdFormat);
    }

    @Override // com.applovin.mediation.MaxAdListener
    public void onAdLoaded(@NonNull MaxAd maxAd) {
        this.f12088s.setText(maxAd.getNetworkName() + " ad loaded");
        this.f12087r.setControlState(AdControlButton.b.SHOW);
        if (maxAd.getFormat().isAdViewAd()) {
            a(this.f12077f, maxAd.getFormat().getSize());
        } else if (MaxAdFormat.NATIVE == this.b.a()) {
            a(this.f12082k, MaxAdFormat.MREC.getSize());
        }
    }

    @Override // com.applovin.impl.C0731o0.a
    public void onAdResponseLoaded(DTBAdResponse dTBAdResponse, MaxAdFormat maxAdFormat) {
        if (maxAdFormat.isAdViewAd()) {
            this.f12077f.setLocalExtraParameter("amazon_ad_response", dTBAdResponse);
        } else if (MaxAdFormat.INTERSTITIAL == maxAdFormat) {
            this.f12078g.setLocalExtraParameter("amazon_ad_response", dTBAdResponse);
        } else if (MaxAdFormat.APP_OPEN == maxAdFormat) {
            this.f12079h.setLocalExtraParameter("amazon_ad_response", dTBAdResponse);
        } else if (MaxAdFormat.REWARDED_INTERSTITIAL == maxAdFormat) {
            this.f12080i.setLocalExtraParameter("amazon_ad_response", dTBAdResponse);
        } else if (MaxAdFormat.REWARDED == maxAdFormat) {
            this.f12081j.setLocalExtraParameter("amazon_ad_response", dTBAdResponse);
        } else if (MaxAdFormat.NATIVE == maxAdFormat) {
            this.l.setLocalExtraParameter("amazon_ad_response", dTBAdResponse);
        }
        a(maxAdFormat);
    }

    @Override // com.applovin.mediation.MaxAdRevenueListener
    public void onAdRevenuePaid(@NonNull MaxAd maxAd) {
        zp.a("onAdRevenuePaid", maxAd, this);
    }

    @Override // com.applovin.impl.mediation.debugger.ui.testmode.AdControlButton.a
    public void onClick(AdControlButton adControlButton) {
        if (this.f12074a.n0().c()) {
            zp.a("Not Supported", "Ad loads are not supported while Test Mode is enabled. Please restart the app.", this);
            return;
        }
        if (this.f12076d.j() != this.b.f()) {
            zp.a("Not Supported", "You cannot load an ad from this waterfall because it does not target the current device. To load an ad, please select the targeted waterfall.", this);
            return;
        }
        MaxAdFormat a6 = this.b.a();
        AdControlButton.b bVar = AdControlButton.b.LOAD;
        if (bVar == adControlButton.getControlState()) {
            adControlButton.setControlState(AdControlButton.b.LOADING);
            C0731o0 c0731o0 = this.f12089t;
            if (c0731o0 != null) {
                c0731o0.a();
                return;
            } else {
                a(a6);
                return;
            }
        }
        if (AdControlButton.b.SHOW == adControlButton.getControlState()) {
            if (!a6.isAdViewAd() && a6 != MaxAdFormat.NATIVE) {
                adControlButton.setControlState(bVar);
            }
            b(a6);
        }
    }

    @Override // com.applovin.impl.ne, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.mediation_debugger_ad_unit_detail_activity);
        setTitle(this.f12076d.k());
        this.f12085p = (ListView) findViewById(R.id.listView);
        this.f12086q = findViewById(R.id.ad_presenter_view);
        this.f12087r = (AdControlButton) findViewById(R.id.ad_control_button);
        this.f12088s = (TextView) findViewById(R.id.status_textview);
        this.f12085p.setAdapter((ListAdapter) this.f12076d);
        this.f12088s.setText(a());
        this.f12088s.setTypeface(Typeface.DEFAULT_BOLD);
        this.f12087r.setOnClickListener(this);
        ShapeDrawable shapeDrawable = new ShapeDrawable();
        shapeDrawable.setPadding(0, 10, 0, 0);
        shapeDrawable.getPaint().setColor(-1);
        shapeDrawable.getPaint().setShadowLayer(10, 0.0f, -10, 855638016);
        shapeDrawable.setShape(new RectShape());
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{shapeDrawable});
        layerDrawable.setLayerInset(0, 0, 10, 0, 0);
        this.f12086q.setBackground(layerDrawable);
    }

    @Override // com.applovin.impl.ne, android.app.Activity
    public void onDestroy() {
        MaxAd maxAd;
        super.onDestroy();
        if (this.f12075c != null) {
            this.f12074a.n0().a(this.f12084o);
        }
        MaxAdView maxAdView = this.f12077f;
        if (maxAdView != null) {
            maxAdView.destroy();
        }
        MaxInterstitialAd maxInterstitialAd = this.f12078g;
        if (maxInterstitialAd != null) {
            maxInterstitialAd.destroy();
        }
        MaxAppOpenAd maxAppOpenAd = this.f12079h;
        if (maxAppOpenAd != null) {
            maxAppOpenAd.destroy();
        }
        MaxRewardedInterstitialAd maxRewardedInterstitialAd = this.f12080i;
        if (maxRewardedInterstitialAd != null) {
            maxRewardedInterstitialAd.destroy();
        }
        MaxRewardedAd maxRewardedAd = this.f12081j;
        if (maxRewardedAd != null) {
            maxRewardedAd.destroy();
        }
        MaxNativeAdLoader maxNativeAdLoader = this.l;
        if (maxNativeAdLoader != null && (maxAd = this.m) != null) {
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
        String c9 = this.b.c();
        if (this.b.a().isAdViewAd()) {
            MaxAdView maxAdView = new MaxAdView(c9, this.b.a(), this.f12074a.v0(), this);
            this.f12077f = maxAdView;
            maxAdView.setExtraParameter("adaptive_banner", "false");
            this.f12077f.setExtraParameter("disable_auto_retries", "true");
            this.f12077f.setExtraParameter("disable_precache", "true");
            this.f12077f.setExtraParameter("allow_pause_auto_refresh_immediately", "true");
            this.f12077f.stopAutoRefresh();
            this.f12077f.setListener(this);
            return;
        }
        if (MaxAdFormat.INTERSTITIAL == this.b.a()) {
            MaxInterstitialAd maxInterstitialAd = new MaxInterstitialAd(c9, this.f12074a.v0(), this);
            this.f12078g = maxInterstitialAd;
            maxInterstitialAd.setExtraParameter("disable_auto_retries", "true");
            this.f12078g.setListener(this);
            return;
        }
        if (MaxAdFormat.APP_OPEN == this.b.a()) {
            MaxAppOpenAd maxAppOpenAd = new MaxAppOpenAd(c9, this.f12074a.v0());
            this.f12079h = maxAppOpenAd;
            maxAppOpenAd.setExtraParameter("disable_auto_retries", "true");
            this.f12079h.setListener(this);
            return;
        }
        if (MaxAdFormat.REWARDED_INTERSTITIAL == this.b.a()) {
            MaxRewardedInterstitialAd maxRewardedInterstitialAd = new MaxRewardedInterstitialAd(c9, this.f12074a.v0(), this);
            this.f12080i = maxRewardedInterstitialAd;
            maxRewardedInterstitialAd.setExtraParameter("disable_auto_retries", "true");
            this.f12080i.setListener(this);
            return;
        }
        if (MaxAdFormat.REWARDED == this.b.a()) {
            MaxRewardedAd maxRewardedAd = MaxRewardedAd.getInstance(c9, this.f12074a.v0(), this);
            this.f12081j = maxRewardedAd;
            maxRewardedAd.setExtraParameter("disable_auto_retries", "true");
            this.f12081j.setListener(this);
            return;
        }
        if (MaxAdFormat.NATIVE == this.b.a()) {
            MaxNativeAdLoader maxNativeAdLoader = new MaxNativeAdLoader(c9, this.f12074a.v0(), this);
            this.l = maxNativeAdLoader;
            maxNativeAdLoader.setExtraParameter("disable_auto_retries", "true");
            this.l.setNativeAdListener(new a());
            this.l.setRevenueListener(this);
        }
    }

    private String a() {
        if (this.f12074a.n0().c()) {
            return "Not supported while Test Mode is enabled";
        }
        if (this.f12076d.j() != this.b.f()) {
            return "This waterfall is not targeted for the current device";
        }
        return "Tap to load an ad";
    }

    public static /* synthetic */ void a(yb ybVar, C0781z c0781z, C0668a0 c0668a0, com.applovin.impl.sdk.k kVar, MaxDebuggerAdUnitDetailActivity maxDebuggerAdUnitDetailActivity) {
        maxDebuggerAdUnitDetailActivity.initialize(c0781z, c0668a0, ((C0777y.b) ybVar).v(), kVar);
    }

    public /* synthetic */ void a(com.applovin.impl.sdk.k kVar, C0781z c0781z, C0668a0 c0668a0, hb hbVar, yb ybVar) {
        if (ybVar instanceof C0777y.b) {
            r.a(this, MaxDebuggerAdUnitDetailActivity.class, kVar.e(), new T2(ybVar, c0781z, c0668a0, kVar));
        }
    }

    public /* synthetic */ void a(DialogInterface dialogInterface) {
        this.f12083n = null;
    }

    @Override // com.applovin.mediation.MaxAdListener
    public void onAdLoadFailed(@NonNull String str, @NonNull MaxError maxError) {
        this.f12087r.setControlState(AdControlButton.b.LOAD);
        this.f12088s.setText("");
        if (204 == maxError.getCode()) {
            zp.a("No Fill", "No fills often happen in live environments. Please make sure to use the Mediation Debugger test mode before you go live.", this);
            return;
        }
        zp.a("", "Failed to load with error code: " + maxError.getCode(), this);
    }

    private void a(MaxAdFormat maxAdFormat) {
        if (this.f12075c != null) {
            this.f12074a.n0().a(this.f12075c.b().b());
        }
        if (maxAdFormat.isAdViewAd()) {
            this.f12077f.setPlacement("[Mediation Debugger Live Ad]");
            this.f12077f.loadAd();
            return;
        }
        if (MaxAdFormat.INTERSTITIAL == this.b.a()) {
            this.f12078g.loadAd();
            return;
        }
        if (MaxAdFormat.APP_OPEN == this.b.a()) {
            this.f12079h.loadAd();
            return;
        }
        if (MaxAdFormat.REWARDED_INTERSTITIAL == this.b.a()) {
            this.f12080i.loadAd();
            return;
        }
        if (MaxAdFormat.REWARDED == this.b.a()) {
            this.f12081j.loadAd();
        } else if (MaxAdFormat.NATIVE == this.b.a()) {
            this.l.setPlacement("[Mediation Debugger Live Ad]");
            this.l.loadAd();
        } else {
            zp.a("Live ads currently unavailable for ad format", this);
        }
    }

    private void a(ViewGroup viewGroup, AppLovinSdkUtils.Size size) {
        if (this.f12083n != null) {
            return;
        }
        DialogC0683d0 dialogC0683d0 = new DialogC0683d0(viewGroup, size, this);
        this.f12083n = dialogC0683d0;
        dialogC0683d0.setOnDismissListener(new B1(this, 1));
        this.f12083n.show();
    }

    private void b(MaxAdFormat maxAdFormat) {
        if (maxAdFormat.isAdViewAd()) {
            a(this.f12077f, maxAdFormat.getSize());
            return;
        }
        if (MaxAdFormat.INTERSTITIAL == this.b.a()) {
            this.f12078g.showAd("[Mediation Debugger Live Ad]");
            return;
        }
        if (MaxAdFormat.APP_OPEN == this.b.a()) {
            this.f12079h.showAd("[Mediation Debugger Live Ad]");
            return;
        }
        if (MaxAdFormat.REWARDED_INTERSTITIAL == this.b.a()) {
            this.f12080i.showAd("[Mediation Debugger Live Ad]");
        } else if (MaxAdFormat.REWARDED == this.b.a()) {
            this.f12081j.showAd("[Mediation Debugger Live Ad]");
        } else if (MaxAdFormat.NATIVE == this.b.a()) {
            a(this.f12082k, MaxAdFormat.MREC.getSize());
        }
    }
}
