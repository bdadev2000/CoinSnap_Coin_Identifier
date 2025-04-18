package com.applovin.impl;

import android.content.DialogInterface;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RectShape;
import android.os.Bundle;
import android.view.MotionEvent;
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
import com.facebook.internal.ServerProtocol;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.internal.special.SpecialsBridge;
import java.util.List;

/* loaded from: classes2.dex */
public abstract class x extends se implements AdControlButton.a, MaxRewardedAdListener, MaxAdViewAdListener, MaxAdRevenueListener, o0.a {

    /* renamed from: a */
    private com.applovin.impl.sdk.j f27798a;

    /* renamed from: b */
    private z f27799b;

    /* renamed from: c */
    private ir f27800c;
    private y d;

    /* renamed from: f */
    private MaxAdView f27801f;

    /* renamed from: g */
    private MaxInterstitialAd f27802g;

    /* renamed from: h */
    private MaxAppOpenAd f27803h;

    /* renamed from: i */
    private MaxRewardedInterstitialAd f27804i;

    /* renamed from: j */
    private MaxRewardedAd f27805j;

    /* renamed from: k */
    private MaxNativeAdView f27806k;

    /* renamed from: l */
    private MaxNativeAdLoader f27807l;

    /* renamed from: m */
    private MaxAd f27808m;

    /* renamed from: n */
    private d0 f27809n;

    /* renamed from: o */
    private List f27810o;

    /* renamed from: p */
    private ListView f27811p;

    /* renamed from: q */
    private View f27812q;

    /* renamed from: r */
    private AdControlButton f27813r;

    /* renamed from: s */
    private TextView f27814s;

    /* renamed from: t */
    private o0 f27815t;

    /* loaded from: classes2.dex */
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
            if (x.this.f27808m != null) {
                x.this.f27807l.destroy(x.this.f27808m);
            }
            x.this.f27808m = maxAd;
            if (maxNativeAdView != null) {
                x.this.f27806k = maxNativeAdView;
            } else {
                x xVar = x.this;
                com.applovin.impl.sdk.j unused = x.this.f27798a;
                xVar.f27806k = new MaxNativeAdView(MaxNativeAdView.MEDIUM_TEMPLATE_1, com.applovin.impl.sdk.j.l());
                x.this.f27807l.render(x.this.f27806k, maxAd);
            }
            x.this.onAdLoaded(maxAd);
        }
    }

    @Override // com.applovin.impl.se, android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.activityOnTouch(com.safedk.android.utils.g.f30048a, me);
        return super.dispatchTouchEvent(me);
    }

    @Override // com.applovin.impl.se
    public com.applovin.impl.sdk.j getSdk() {
        return this.f27798a;
    }

    public void initialize(z zVar, @Nullable a0 a0Var, @Nullable ir irVar, com.applovin.impl.sdk.j jVar) {
        List a2;
        this.f27798a = jVar;
        this.f27799b = zVar;
        this.f27800c = irVar;
        this.f27810o = jVar.l0().b();
        y yVar = new y(zVar, a0Var, irVar, this);
        this.d = yVar;
        yVar.a(new nw(this, jVar, zVar, a0Var));
        b();
        if (zVar.f().f()) {
            if ((irVar != null && !irVar.b().d().B()) || (a2 = jVar.N().a(zVar.c())) == null || a2.isEmpty()) {
                return;
            }
            this.f27815t = new o0(a2, zVar.a(), this);
        }
    }

    @Override // com.applovin.mediation.MaxAdListener
    public void onAdClicked(@NonNull MaxAd maxAd) {
        yp.a("onAdClicked", maxAd, this);
    }

    @Override // com.applovin.mediation.MaxAdViewAdListener
    public void onAdCollapsed(@NonNull MaxAd maxAd) {
        yp.a("onAdCollapsed", maxAd, this);
    }

    @Override // com.applovin.mediation.MaxAdListener
    public void onAdDisplayFailed(MaxAd maxAd, MaxError maxError) {
        this.f27813r.setControlState(AdControlButton.b.LOAD);
        this.f27814s.setText("");
        yp.a("Failed to display " + maxAd.getFormat().getDisplayName(), "MAX Error\nCode: " + maxError.getCode() + "\nMessage: " + maxError.getMessage() + "\n\n" + maxAd.getNetworkName() + " Display Error\nCode: " + maxError.getMediatedNetworkErrorCode() + "\nMessage: " + maxError.getMediatedNetworkErrorMessage(), this);
    }

    @Override // com.applovin.mediation.MaxAdListener
    public void onAdDisplayed(@NonNull MaxAd maxAd) {
        yp.a("onAdDisplayed", maxAd, this);
    }

    @Override // com.applovin.mediation.MaxAdViewAdListener
    public void onAdExpanded(@NonNull MaxAd maxAd) {
        yp.a("onAdExpanded", maxAd, this);
    }

    @Override // com.applovin.mediation.MaxAdListener
    public void onAdHidden(@NonNull MaxAd maxAd) {
        yp.a("onAdHidden", maxAd, this);
    }

    @Override // com.applovin.impl.o0.a
    public void onAdLoadFailed(AdError adError, MaxAdFormat maxAdFormat) {
        if (maxAdFormat.isAdViewAd()) {
            this.f27801f.setLocalExtraParameter("amazon_ad_error", adError);
        } else if (MaxAdFormat.INTERSTITIAL == maxAdFormat) {
            this.f27802g.setLocalExtraParameter("amazon_ad_error", adError);
        } else if (MaxAdFormat.APP_OPEN == maxAdFormat) {
            this.f27803h.setLocalExtraParameter("amazon_ad_error", adError);
        } else if (MaxAdFormat.REWARDED_INTERSTITIAL == maxAdFormat) {
            this.f27804i.setLocalExtraParameter("amazon_ad_error", adError);
        } else if (MaxAdFormat.REWARDED == maxAdFormat) {
            this.f27805j.setLocalExtraParameter("amazon_ad_error", adError);
        } else if (MaxAdFormat.NATIVE == maxAdFormat) {
            this.f27807l.setLocalExtraParameter("amazon_ad_error", adError);
        }
        a(maxAdFormat);
    }

    @Override // com.applovin.mediation.MaxAdListener
    public void onAdLoaded(@NonNull MaxAd maxAd) {
        this.f27814s.setText(maxAd.getNetworkName() + " ad loaded");
        this.f27813r.setControlState(AdControlButton.b.SHOW);
        if (maxAd.getFormat().isAdViewAd()) {
            a(this.f27801f, maxAd.getFormat().getSize());
        } else if (MaxAdFormat.NATIVE == this.f27799b.a()) {
            a(this.f27806k, MaxAdFormat.MREC.getSize());
        }
    }

    @Override // com.applovin.impl.o0.a
    public void onAdResponseLoaded(DTBAdResponse dTBAdResponse, MaxAdFormat maxAdFormat) {
        if (maxAdFormat.isAdViewAd()) {
            this.f27801f.setLocalExtraParameter("amazon_ad_response", dTBAdResponse);
        } else if (MaxAdFormat.INTERSTITIAL == maxAdFormat) {
            this.f27802g.setLocalExtraParameter("amazon_ad_response", dTBAdResponse);
        } else if (MaxAdFormat.APP_OPEN == maxAdFormat) {
            this.f27803h.setLocalExtraParameter("amazon_ad_response", dTBAdResponse);
        } else if (MaxAdFormat.REWARDED_INTERSTITIAL == maxAdFormat) {
            this.f27804i.setLocalExtraParameter("amazon_ad_response", dTBAdResponse);
        } else if (MaxAdFormat.REWARDED == maxAdFormat) {
            this.f27805j.setLocalExtraParameter("amazon_ad_response", dTBAdResponse);
        } else if (MaxAdFormat.NATIVE == maxAdFormat) {
            this.f27807l.setLocalExtraParameter("amazon_ad_response", dTBAdResponse);
        }
        a(maxAdFormat);
    }

    @Override // com.applovin.mediation.MaxAdRevenueListener
    public void onAdRevenuePaid(@NonNull MaxAd maxAd) {
        yp.a("onAdRevenuePaid", maxAd, this);
    }

    @Override // com.applovin.impl.mediation.debugger.ui.testmode.AdControlButton.a
    public void onClick(AdControlButton adControlButton) {
        if (this.f27798a.l0().c()) {
            yp.a("Not Supported", "Ad loads are not supported while Test Mode is enabled. Please restart the app.", this);
            return;
        }
        if (this.d.j() != this.f27799b.f()) {
            yp.a("Not Supported", "You cannot load an ad from this waterfall because it does not target the current device. To load an ad, please select the targeted waterfall.", this);
            return;
        }
        MaxAdFormat a2 = this.f27799b.a();
        AdControlButton.b bVar = AdControlButton.b.LOAD;
        if (bVar == adControlButton.getControlState()) {
            adControlButton.setControlState(AdControlButton.b.LOADING);
            o0 o0Var = this.f27815t;
            if (o0Var != null) {
                o0Var.a();
                return;
            } else {
                a(a2);
                return;
            }
        }
        if (AdControlButton.b.SHOW == adControlButton.getControlState()) {
            if (!a2.isAdViewAd() && a2 != MaxAdFormat.NATIVE) {
                adControlButton.setControlState(bVar);
            }
            b(a2);
        }
    }

    @Override // com.applovin.impl.se, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.mediation_debugger_ad_unit_detail_activity);
        setTitle(this.d.k());
        this.f27811p = (ListView) findViewById(R.id.listView);
        this.f27812q = findViewById(R.id.ad_presenter_view);
        this.f27813r = (AdControlButton) findViewById(R.id.ad_control_button);
        this.f27814s = (TextView) findViewById(R.id.status_textview);
        this.f27811p.setAdapter((ListAdapter) this.d);
        this.f27814s.setText(a());
        this.f27814s.setTypeface(Typeface.DEFAULT_BOLD);
        this.f27813r.setOnClickListener(this);
        ShapeDrawable shapeDrawable = new ShapeDrawable();
        shapeDrawable.setPadding(0, 10, 0, 0);
        shapeDrawable.getPaint().setColor(-1);
        shapeDrawable.getPaint().setShadowLayer(10, 0.0f, -10, 855638016);
        shapeDrawable.setShape(new RectShape());
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{shapeDrawable});
        layerDrawable.setLayerInset(0, 0, 10, 0, 0);
        this.f27812q.setBackground(layerDrawable);
    }

    @Override // com.applovin.impl.se, android.app.Activity
    public void onDestroy() {
        MaxAd maxAd;
        super.onDestroy();
        if (this.f27800c != null) {
            this.f27798a.l0().a(this.f27810o);
        }
        MaxAdView maxAdView = this.f27801f;
        if (maxAdView != null) {
            SpecialsBridge.maxAdViewDestroy(maxAdView);
        }
        MaxInterstitialAd maxInterstitialAd = this.f27802g;
        if (maxInterstitialAd != null) {
            maxInterstitialAd.destroy();
        }
        MaxAppOpenAd maxAppOpenAd = this.f27803h;
        if (maxAppOpenAd != null) {
            maxAppOpenAd.destroy();
        }
        MaxRewardedInterstitialAd maxRewardedInterstitialAd = this.f27804i;
        if (maxRewardedInterstitialAd != null) {
            maxRewardedInterstitialAd.destroy();
        }
        MaxRewardedAd maxRewardedAd = this.f27805j;
        if (maxRewardedAd != null) {
            maxRewardedAd.destroy();
        }
        MaxNativeAdLoader maxNativeAdLoader = this.f27807l;
        if (maxNativeAdLoader == null || (maxAd = this.f27808m) == null) {
            return;
        }
        maxNativeAdLoader.destroy(maxAd);
    }

    @Override // com.applovin.mediation.MaxRewardedAdListener
    public void onUserRewarded(@NonNull MaxAd maxAd, @NonNull MaxReward maxReward) {
        yp.a("onUserRewarded", maxAd, this);
    }

    public /* synthetic */ void a(DialogInterface dialogInterface) {
        this.f27809n = null;
    }

    private void b() {
        String c2 = this.f27799b.c();
        if (this.f27799b.a().isAdViewAd()) {
            MaxAdView maxAdView = new MaxAdView(c2, this.f27799b.a(), this.f27798a.s0(), this);
            this.f27801f = maxAdView;
            maxAdView.setExtraParameter("adaptive_banner", "false");
            this.f27801f.setExtraParameter("disable_auto_retries", ServerProtocol.DIALOG_RETURN_SCOPES_TRUE);
            this.f27801f.setExtraParameter("disable_precache", ServerProtocol.DIALOG_RETURN_SCOPES_TRUE);
            this.f27801f.setExtraParameter("allow_pause_auto_refresh_immediately", ServerProtocol.DIALOG_RETURN_SCOPES_TRUE);
            this.f27801f.stopAutoRefresh();
            this.f27801f.setListener(this);
            return;
        }
        if (MaxAdFormat.INTERSTITIAL == this.f27799b.a()) {
            MaxInterstitialAd maxInterstitialAd = new MaxInterstitialAd(c2, this.f27798a.s0(), this);
            this.f27802g = maxInterstitialAd;
            maxInterstitialAd.setExtraParameter("disable_auto_retries", ServerProtocol.DIALOG_RETURN_SCOPES_TRUE);
            this.f27802g.setListener(this);
            return;
        }
        if (MaxAdFormat.APP_OPEN == this.f27799b.a()) {
            MaxAppOpenAd maxAppOpenAd = new MaxAppOpenAd(c2, this.f27798a.s0());
            this.f27803h = maxAppOpenAd;
            maxAppOpenAd.setExtraParameter("disable_auto_retries", ServerProtocol.DIALOG_RETURN_SCOPES_TRUE);
            this.f27803h.setListener(this);
            return;
        }
        if (MaxAdFormat.REWARDED_INTERSTITIAL == this.f27799b.a()) {
            MaxRewardedInterstitialAd maxRewardedInterstitialAd = new MaxRewardedInterstitialAd(c2, this.f27798a.s0(), this);
            this.f27804i = maxRewardedInterstitialAd;
            maxRewardedInterstitialAd.setExtraParameter("disable_auto_retries", ServerProtocol.DIALOG_RETURN_SCOPES_TRUE);
            this.f27804i.setListener(this);
            return;
        }
        if (MaxAdFormat.REWARDED == this.f27799b.a()) {
            MaxRewardedAd maxRewardedAd = MaxRewardedAd.getInstance(c2, this.f27798a.s0(), this);
            this.f27805j = maxRewardedAd;
            maxRewardedAd.setExtraParameter("disable_auto_retries", ServerProtocol.DIALOG_RETURN_SCOPES_TRUE);
            this.f27805j.setListener(this);
            return;
        }
        if (MaxAdFormat.NATIVE == this.f27799b.a()) {
            MaxNativeAdLoader maxNativeAdLoader = new MaxNativeAdLoader(c2, this.f27798a.s0(), this);
            this.f27807l = maxNativeAdLoader;
            maxNativeAdLoader.setExtraParameter("disable_auto_retries", ServerProtocol.DIALOG_RETURN_SCOPES_TRUE);
            this.f27807l.setNativeAdListener(new a());
            this.f27807l.setRevenueListener(this);
        }
    }

    private String a() {
        return this.f27798a.l0().c() ? "Not supported while Test Mode is enabled" : this.d.j() != this.f27799b.f() ? "This waterfall is not targeted for the current device" : "Tap to load an ad";
    }

    public static /* synthetic */ void a(dc dcVar, z zVar, a0 a0Var, com.applovin.impl.sdk.j jVar, MaxDebuggerAdUnitDetailActivity maxDebuggerAdUnitDetailActivity) {
        maxDebuggerAdUnitDetailActivity.initialize(zVar, a0Var, ((y.b) dcVar).v(), jVar);
    }

    public /* synthetic */ void a(com.applovin.impl.sdk.j jVar, z zVar, a0 a0Var, lb lbVar, dc dcVar) {
        if (dcVar instanceof y.b) {
            r.a(this, MaxDebuggerAdUnitDetailActivity.class, jVar.e(), new nw(dcVar, zVar, a0Var, jVar));
        }
    }

    private void a(MaxAdFormat maxAdFormat) {
        if (this.f27800c != null) {
            this.f27798a.l0().a(this.f27800c.b().b());
        }
        if (maxAdFormat.isAdViewAd()) {
            this.f27801f.setPlacement("[Mediation Debugger Live Ad]");
            this.f27801f.loadAd();
            return;
        }
        if (MaxAdFormat.INTERSTITIAL == this.f27799b.a()) {
            this.f27802g.loadAd();
            return;
        }
        if (MaxAdFormat.APP_OPEN == this.f27799b.a()) {
            this.f27803h.loadAd();
            return;
        }
        if (MaxAdFormat.REWARDED_INTERSTITIAL == this.f27799b.a()) {
            this.f27804i.loadAd();
            return;
        }
        if (MaxAdFormat.REWARDED == this.f27799b.a()) {
            this.f27805j.loadAd();
        } else if (MaxAdFormat.NATIVE == this.f27799b.a()) {
            this.f27807l.setPlacement("[Mediation Debugger Live Ad]");
            this.f27807l.loadAd();
        } else {
            yp.a("Live ads currently unavailable for ad format", this);
        }
    }

    @Override // com.applovin.mediation.MaxAdListener
    public void onAdLoadFailed(@NonNull String str, @NonNull MaxError maxError) {
        this.f27813r.setControlState(AdControlButton.b.LOAD);
        this.f27814s.setText("");
        if (204 == maxError.getCode()) {
            yp.a("No Fill", "No fills often happen in live environments. Please make sure to use the Mediation Debugger test mode before you go live.", this);
            return;
        }
        yp.a("", "Failed to load with error code: " + maxError.getCode(), this);
    }

    private void a(ViewGroup viewGroup, AppLovinSdkUtils.Size size) {
        if (this.f27809n != null) {
            return;
        }
        d0 d0Var = new d0(viewGroup, size, this);
        this.f27809n = d0Var;
        d0Var.setOnDismissListener(new cw(this, 1));
        this.f27809n.show();
    }

    private void b(MaxAdFormat maxAdFormat) {
        if (maxAdFormat.isAdViewAd()) {
            a(this.f27801f, maxAdFormat.getSize());
            return;
        }
        if (MaxAdFormat.INTERSTITIAL == this.f27799b.a()) {
            this.f27802g.showAd("[Mediation Debugger Live Ad]");
            return;
        }
        if (MaxAdFormat.APP_OPEN == this.f27799b.a()) {
            this.f27803h.showAd("[Mediation Debugger Live Ad]");
            return;
        }
        if (MaxAdFormat.REWARDED_INTERSTITIAL == this.f27799b.a()) {
            this.f27804i.showAd("[Mediation Debugger Live Ad]");
        } else if (MaxAdFormat.REWARDED == this.f27799b.a()) {
            this.f27805j.showAd("[Mediation Debugger Live Ad]");
        } else if (MaxAdFormat.NATIVE == this.f27799b.a()) {
            a(this.f27806k, MaxAdFormat.MREC.getSize());
        }
    }
}
