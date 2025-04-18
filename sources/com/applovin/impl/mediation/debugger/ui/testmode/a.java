package com.applovin.impl.mediation.debugger.ui.testmode;

import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.Switch;
import android.widget.TextView;
import androidx.annotation.NonNull;
import com.amazon.device.ads.AdError;
import com.amazon.device.ads.AdRegistration;
import com.amazon.device.ads.DTBAdResponse;
import com.applovin.impl.ke;
import com.applovin.impl.mediation.debugger.ui.testmode.AdControlButton;
import com.applovin.impl.o0;
import com.applovin.impl.p0;
import com.applovin.impl.sdk.j;
import com.applovin.impl.sdk.n;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.se;
import com.applovin.impl.yp;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxAdRevenueListener;
import com.applovin.mediation.MaxAdViewAdListener;
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
import com.safedk.android.utils.g;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public abstract class a extends se implements MaxRewardedAdListener, MaxAdViewAdListener, AdControlButton.a, MaxAdRevenueListener, o0.a {
    private Map A;

    /* renamed from: a, reason: collision with root package name */
    private ke f25445a;

    /* renamed from: b, reason: collision with root package name */
    private j f25446b;

    /* renamed from: c, reason: collision with root package name */
    private MaxAdView f25447c;
    private MaxAdView d;

    /* renamed from: f, reason: collision with root package name */
    private MaxInterstitialAd f25448f;

    /* renamed from: g, reason: collision with root package name */
    private MaxAppOpenAd f25449g;

    /* renamed from: h, reason: collision with root package name */
    private MaxRewardedInterstitialAd f25450h;

    /* renamed from: i, reason: collision with root package name */
    private MaxRewardedAd f25451i;

    /* renamed from: j, reason: collision with root package name */
    private MaxAd f25452j;

    /* renamed from: k, reason: collision with root package name */
    private MaxNativeAdLoader f25453k;

    /* renamed from: l, reason: collision with root package name */
    private List f25454l;

    /* renamed from: m, reason: collision with root package name */
    private String f25455m;

    /* renamed from: n, reason: collision with root package name */
    private AdControlButton f25456n;

    /* renamed from: o, reason: collision with root package name */
    private AdControlButton f25457o;

    /* renamed from: p, reason: collision with root package name */
    private AdControlButton f25458p;

    /* renamed from: q, reason: collision with root package name */
    private AdControlButton f25459q;

    /* renamed from: r, reason: collision with root package name */
    private AdControlButton f25460r;

    /* renamed from: s, reason: collision with root package name */
    private AdControlButton f25461s;

    /* renamed from: t, reason: collision with root package name */
    private AdControlButton f25462t;

    /* renamed from: u, reason: collision with root package name */
    private Button f25463u;

    /* renamed from: v, reason: collision with root package name */
    private Button f25464v;
    private FrameLayout w;
    private FrameLayout x;

    /* renamed from: y, reason: collision with root package name */
    private Switch f25465y;

    /* renamed from: z, reason: collision with root package name */
    private Switch f25466z;

    /* renamed from: com.applovin.impl.mediation.debugger.ui.testmode.a$a, reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public class C0087a extends MaxNativeAdListener {
        public C0087a() {
        }

        @Override // com.applovin.mediation.nativeAds.MaxNativeAdListener
        public void onNativeAdClicked(MaxAd maxAd) {
            a.this.onAdClicked(maxAd);
        }

        @Override // com.applovin.mediation.nativeAds.MaxNativeAdListener
        public void onNativeAdLoadFailed(String str, MaxError maxError) {
            a.this.onAdLoadFailed(str, maxError);
        }

        @Override // com.applovin.mediation.nativeAds.MaxNativeAdListener
        public void onNativeAdLoaded(MaxNativeAdView maxNativeAdView, MaxAd maxAd) {
            if (a.this.f25452j != null) {
                a.this.f25453k.destroy(a.this.f25452j);
            }
            a.this.f25452j = maxAd;
            a.this.x.removeAllViews();
            a.this.x.addView(maxNativeAdView);
            a.this.onAdLoaded(maxAd);
        }
    }

    private void e() {
        List r2 = this.f25445a.r();
        MaxAdFormat maxAdFormat = MaxAdFormat.REWARDED;
        if (!r2.contains(maxAdFormat)) {
            findViewById(R.id.rewarded_control_view).setVisibility(8);
            return;
        }
        String str = "test_mode_rewarded_" + this.f25445a.m();
        this.f25455m = str;
        MaxRewardedAd maxRewardedAd = MaxRewardedAd.getInstance(str, this.f25446b.s0(), this);
        this.f25451i = maxRewardedAd;
        maxRewardedAd.setExtraParameter("disable_auto_retries", ServerProtocol.DIALOG_RETURN_SCOPES_TRUE);
        this.f25451i.setListener(this);
        AdControlButton adControlButton = (AdControlButton) findViewById(R.id.rewarded_control_button);
        this.f25461s = adControlButton;
        adControlButton.setOnClickListener(this);
        this.f25461s.setFormat(maxAdFormat);
    }

    @Override // com.applovin.impl.se, android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.activityOnTouch(g.f30048a, me);
        return super.dispatchTouchEvent(me);
    }

    @Override // com.applovin.impl.se
    public j getSdk() {
        return this.f25446b;
    }

    public String getTestModeNetwork(MaxAdFormat maxAdFormat) {
        return (this.f25445a.x() == null || !this.f25445a.x().containsKey(maxAdFormat)) ? this.f25445a.m() : (String) this.f25445a.x().get(maxAdFormat);
    }

    public void initialize(ke keVar) {
        this.f25445a = keVar;
        this.f25446b = keVar.o();
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
    public void onAdDisplayFailed(@NonNull MaxAd maxAd, @NonNull MaxError maxError) {
        a(maxAd.getAdUnitId()).setControlState(AdControlButton.b.LOAD);
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

    @Override // com.applovin.mediation.MaxAdListener
    public void onAdLoadFailed(@NonNull String str, @NonNull MaxError maxError) {
        AdControlButton a2 = a(str);
        a2.setControlState(AdControlButton.b.LOAD);
        yp.a(maxError, a2.getFormat().getLabel(), this);
    }

    @Override // com.applovin.mediation.MaxAdListener
    public void onAdLoaded(@NonNull MaxAd maxAd) {
        AdControlButton a2 = a(maxAd.getAdUnitId());
        if (maxAd.getFormat().isAdViewAd() || maxAd.getFormat().equals(MaxAdFormat.NATIVE)) {
            a2.setControlState(AdControlButton.b.LOAD);
        } else {
            a2.setControlState(AdControlButton.b.SHOW);
        }
    }

    @Override // com.applovin.impl.o0.a
    public void onAdResponseLoaded(DTBAdResponse dTBAdResponse, MaxAdFormat maxAdFormat) {
        if (MaxAdFormat.BANNER == maxAdFormat || MaxAdFormat.LEADER == maxAdFormat) {
            this.f25447c.setLocalExtraParameter("amazon_ad_response", dTBAdResponse);
        } else if (MaxAdFormat.MREC == maxAdFormat) {
            this.d.setLocalExtraParameter("amazon_ad_response", dTBAdResponse);
        } else if (MaxAdFormat.INTERSTITIAL == maxAdFormat) {
            this.f25448f.setLocalExtraParameter("amazon_ad_response", dTBAdResponse);
        } else if (MaxAdFormat.APP_OPEN == maxAdFormat) {
            this.f25449g.setLocalExtraParameter("amazon_ad_response", dTBAdResponse);
        } else if (MaxAdFormat.REWARDED_INTERSTITIAL == maxAdFormat) {
            this.f25450h.setLocalExtraParameter("amazon_ad_response", dTBAdResponse);
        } else if (MaxAdFormat.REWARDED == maxAdFormat) {
            this.f25451i.setLocalExtraParameter("amazon_ad_response", dTBAdResponse);
        } else if (MaxAdFormat.NATIVE == maxAdFormat) {
            this.f25453k.setLocalExtraParameter("amazon_ad_response", dTBAdResponse);
        }
        a(maxAdFormat);
    }

    @Override // com.applovin.mediation.MaxAdRevenueListener
    public void onAdRevenuePaid(@NonNull MaxAd maxAd) {
        yp.a("onAdRevenuePaid", maxAd, this);
    }

    @Override // com.applovin.impl.mediation.debugger.ui.testmode.AdControlButton.a
    public void onClick(AdControlButton adControlButton) {
        MaxAdFormat format = adControlButton.getFormat();
        AdControlButton.b bVar = AdControlButton.b.LOAD;
        if (bVar != adControlButton.getControlState()) {
            if (AdControlButton.b.SHOW == adControlButton.getControlState()) {
                adControlButton.setControlState(bVar);
                b(format);
                return;
            }
            return;
        }
        adControlButton.setControlState(AdControlButton.b.LOADING);
        Map map = this.A;
        if (map == null || map.get(format) == null) {
            a(format);
        } else {
            ((o0) this.A.get(format)).a();
        }
    }

    @Override // com.applovin.impl.se, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (this.f25445a == null) {
            n.h("MaxDebuggerMultiAdActivity", "Failed to initialize activity with a network model.");
            return;
        }
        setContentView(R.layout.mediation_debugger_multi_ad_activity);
        setTitle(this.f25445a.g() + " Test Ads");
        this.f25454l = this.f25446b.l0().b();
        a();
        c();
        b();
        e();
        d();
        findViewById(R.id.rewarded_interstitial_control_view).setVisibility(8);
        findViewById(R.id.app_open_ad_control_view).setVisibility(8);
        this.f25463u = (Button) findViewById(R.id.show_mrec_button);
        this.f25464v = (Button) findViewById(R.id.show_native_button);
        final int i2 = 1;
        if (this.f25445a.G() && this.f25445a.r().contains(MaxAdFormat.MREC)) {
            this.x.setVisibility(8);
            this.f25463u.setBackgroundColor(-1);
            this.f25464v.setBackgroundColor(-3355444);
            final int i3 = 0;
            this.f25463u.setOnClickListener(new View.OnClickListener(this) { // from class: com.applovin.impl.mediation.debugger.ui.testmode.b

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ a f25469b;

                {
                    this.f25469b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i4 = i3;
                    a aVar = this.f25469b;
                    switch (i4) {
                        case 0:
                            aVar.a(view);
                            return;
                        case 1:
                            aVar.b(view);
                            return;
                        case 2:
                            aVar.c(view);
                            return;
                        default:
                            aVar.d(view);
                            return;
                    }
                }
            });
            this.f25464v.setOnClickListener(new View.OnClickListener(this) { // from class: com.applovin.impl.mediation.debugger.ui.testmode.b

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ a f25469b;

                {
                    this.f25469b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i4 = i2;
                    a aVar = this.f25469b;
                    switch (i4) {
                        case 0:
                            aVar.a(view);
                            return;
                        case 1:
                            aVar.b(view);
                            return;
                        case 2:
                            aVar.c(view);
                            return;
                        default:
                            aVar.d(view);
                            return;
                    }
                }
            });
        } else {
            this.f25463u.setVisibility(8);
            this.f25464v.setVisibility(8);
        }
        this.f25465y = (Switch) findViewById(R.id.native_banner_switch);
        this.f25466z = (Switch) findViewById(R.id.native_mrec_switch);
        if (this.f25445a.H()) {
            final int i4 = 2;
            this.f25465y.setOnClickListener(new View.OnClickListener(this) { // from class: com.applovin.impl.mediation.debugger.ui.testmode.b

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ a f25469b;

                {
                    this.f25469b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i42 = i4;
                    a aVar = this.f25469b;
                    switch (i42) {
                        case 0:
                            aVar.a(view);
                            return;
                        case 1:
                            aVar.b(view);
                            return;
                        case 2:
                            aVar.c(view);
                            return;
                        default:
                            aVar.d(view);
                            return;
                    }
                }
            });
            final int i5 = 3;
            this.f25466z.setOnClickListener(new View.OnClickListener(this) { // from class: com.applovin.impl.mediation.debugger.ui.testmode.b

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ a f25469b;

                {
                    this.f25469b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i42 = i5;
                    a aVar = this.f25469b;
                    switch (i42) {
                        case 0:
                            aVar.a(view);
                            return;
                        case 1:
                            aVar.b(view);
                            return;
                        case 2:
                            aVar.c(view);
                            return;
                        default:
                            aVar.d(view);
                            return;
                    }
                }
            });
        } else {
            this.f25465y.setVisibility(8);
            this.f25466z.setVisibility(8);
        }
        if (StringUtils.isValidString(this.f25445a.e()) && this.f25445a.d() != null && this.f25445a.d().size() > 0) {
            AdRegistration.getInstance(this.f25445a.e(), this);
            AdRegistration.enableTesting(true);
            AdRegistration.enableLogging(true);
            HashMap hashMap = new HashMap(this.f25445a.d().size());
            for (MaxAdFormat maxAdFormat : this.f25445a.d().keySet()) {
                hashMap.put(maxAdFormat, new o0((p0) this.f25445a.d().get(maxAdFormat), maxAdFormat, this));
            }
            this.A = hashMap;
        }
        try {
            setRequestedOrientation(7);
        } catch (Throwable th) {
            n.c("AppLovinSdk", "Failed to set portrait orientation", th);
        }
    }

    @Override // com.applovin.impl.se, android.app.Activity
    public void onDestroy() {
        MaxAd maxAd;
        super.onDestroy();
        this.f25446b.l0().a(this.f25454l);
        MaxAdView maxAdView = this.f25447c;
        if (maxAdView != null) {
            SpecialsBridge.maxAdViewDestroy(maxAdView);
        }
        MaxAdView maxAdView2 = this.d;
        if (maxAdView2 != null) {
            SpecialsBridge.maxAdViewDestroy(maxAdView2);
        }
        MaxInterstitialAd maxInterstitialAd = this.f25448f;
        if (maxInterstitialAd != null) {
            maxInterstitialAd.destroy();
        }
        MaxRewardedAd maxRewardedAd = this.f25451i;
        if (maxRewardedAd != null) {
            maxRewardedAd.destroy();
        }
        MaxNativeAdLoader maxNativeAdLoader = this.f25453k;
        if (maxNativeAdLoader == null || (maxAd = this.f25452j) == null) {
            return;
        }
        maxNativeAdLoader.destroy(maxAd);
    }

    @Override // com.applovin.mediation.MaxRewardedAdListener
    public void onUserRewarded(@NonNull MaxAd maxAd, @NonNull MaxReward maxReward) {
        yp.a("onUserRewarded", maxAd, this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void d(View view) {
        this.d.removeAllViews();
        this.f25457o.setControlState(AdControlButton.b.LOAD);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(View view) {
        this.x.setVisibility(0);
        this.w.setVisibility(8);
        this.f25464v.setBackgroundColor(-1);
        this.f25463u.setBackgroundColor(-3355444);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c(View view) {
        this.f25447c.removeAllViews();
        this.f25456n.setControlState(AdControlButton.b.LOAD);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(View view) {
        this.w.setVisibility(0);
        this.x.setVisibility(8);
        this.f25463u.setBackgroundColor(-1);
        this.f25464v.setBackgroundColor(-3355444);
    }

    private void d() {
        this.x = (FrameLayout) findViewById(R.id.native_ad_view_container);
        if (this.f25445a.G()) {
            MaxNativeAdLoader maxNativeAdLoader = new MaxNativeAdLoader("test_mode_native", this.f25446b.s0(), this);
            this.f25453k = maxNativeAdLoader;
            maxNativeAdLoader.setExtraParameter("disable_auto_retries", ServerProtocol.DIALOG_RETURN_SCOPES_TRUE);
            this.f25453k.setNativeAdListener(new C0087a());
            this.f25453k.setRevenueListener(this);
            AdControlButton adControlButton = (AdControlButton) findViewById(R.id.native_control_button);
            this.f25462t = adControlButton;
            adControlButton.setOnClickListener(this);
            this.f25462t.setFormat(MaxAdFormat.NATIVE);
            return;
        }
        findViewById(R.id.native_control_view).setVisibility(8);
        this.x.setVisibility(8);
    }

    @Override // com.applovin.impl.o0.a
    public void onAdLoadFailed(AdError adError, MaxAdFormat maxAdFormat) {
        if (MaxAdFormat.BANNER != maxAdFormat && MaxAdFormat.LEADER != maxAdFormat) {
            if (MaxAdFormat.MREC == maxAdFormat) {
                this.d.setLocalExtraParameter("amazon_ad_error", adError);
            } else if (MaxAdFormat.INTERSTITIAL == maxAdFormat) {
                this.f25448f.setLocalExtraParameter("amazon_ad_error", adError);
            } else if (MaxAdFormat.APP_OPEN == maxAdFormat) {
                this.f25449g.setLocalExtraParameter("amazon_ad_error", adError);
            } else if (MaxAdFormat.REWARDED_INTERSTITIAL == maxAdFormat) {
                this.f25450h.setLocalExtraParameter("amazon_ad_error", adError);
            } else if (MaxAdFormat.REWARDED == maxAdFormat) {
                this.f25451i.setLocalExtraParameter("amazon_ad_error", adError);
            } else if (MaxAdFormat.NATIVE == maxAdFormat) {
                this.f25453k.setLocalExtraParameter("amazon_ad_error", adError);
            }
        } else {
            this.f25447c.setLocalExtraParameter("amazon_ad_error", adError);
        }
        a(maxAdFormat);
    }

    private void c() {
        this.w = (FrameLayout) findViewById(R.id.mrec_ad_view_container);
        List r2 = this.f25445a.r();
        MaxAdFormat maxAdFormat = MaxAdFormat.MREC;
        if (r2.contains(maxAdFormat)) {
            MaxAdView maxAdView = new MaxAdView("test_mode_mrec", maxAdFormat, this.f25446b.s0(), this);
            this.d = maxAdView;
            maxAdView.setExtraParameter("disable_auto_retries", ServerProtocol.DIALOG_RETURN_SCOPES_TRUE);
            this.d.setExtraParameter("disable_precache", ServerProtocol.DIALOG_RETURN_SCOPES_TRUE);
            this.d.setExtraParameter("allow_pause_auto_refresh_immediately", ServerProtocol.DIALOG_RETURN_SCOPES_TRUE);
            this.d.stopAutoRefresh();
            this.d.setListener(this);
            this.w.addView(this.d, new FrameLayout.LayoutParams(-1, -1));
            AdControlButton adControlButton = (AdControlButton) findViewById(R.id.mrec_control_button);
            this.f25457o = adControlButton;
            adControlButton.setOnClickListener(this);
            this.f25457o.setFormat(maxAdFormat);
            return;
        }
        findViewById(R.id.mrec_control_view).setVisibility(8);
        this.w.setVisibility(8);
    }

    private void b() {
        List r2 = this.f25445a.r();
        MaxAdFormat maxAdFormat = MaxAdFormat.INTERSTITIAL;
        if (r2.contains(maxAdFormat)) {
            MaxInterstitialAd maxInterstitialAd = new MaxInterstitialAd("test_mode_interstitial", this.f25446b.s0(), this);
            this.f25448f = maxInterstitialAd;
            maxInterstitialAd.setExtraParameter("disable_auto_retries", ServerProtocol.DIALOG_RETURN_SCOPES_TRUE);
            this.f25448f.setListener(this);
            AdControlButton adControlButton = (AdControlButton) findViewById(R.id.interstitial_control_button);
            this.f25458p = adControlButton;
            adControlButton.setOnClickListener(this);
            this.f25458p.setFormat(maxAdFormat);
            return;
        }
        findViewById(R.id.interstitial_control_view).setVisibility(8);
    }

    private void a() {
        MaxAdFormat maxAdFormat;
        String str;
        boolean isTablet = AppLovinSdkUtils.isTablet(this);
        FrameLayout frameLayout = (FrameLayout) findViewById(R.id.banner_ad_view_container);
        if (isTablet) {
            maxAdFormat = MaxAdFormat.LEADER;
            ((TextView) findViewById(R.id.banner_label)).setText("Leader");
            str = "test_mode_leader";
        } else {
            maxAdFormat = MaxAdFormat.BANNER;
            str = "test_mode_banner";
        }
        if (this.f25445a.r().contains(maxAdFormat)) {
            MaxAdView maxAdView = new MaxAdView(str, maxAdFormat, this.f25446b.s0(), this);
            this.f25447c = maxAdView;
            maxAdView.setExtraParameter("adaptive_banner", "false");
            this.f25447c.setExtraParameter("disable_auto_retries", ServerProtocol.DIALOG_RETURN_SCOPES_TRUE);
            this.f25447c.setExtraParameter("disable_precache", ServerProtocol.DIALOG_RETURN_SCOPES_TRUE);
            this.f25447c.setExtraParameter("allow_pause_auto_refresh_immediately", ServerProtocol.DIALOG_RETURN_SCOPES_TRUE);
            this.f25447c.stopAutoRefresh();
            this.f25447c.setListener(this);
            frameLayout.addView(this.f25447c, new FrameLayout.LayoutParams(AppLovinSdkUtils.dpToPx(this, maxAdFormat.getSize().getWidth()), AppLovinSdkUtils.dpToPx(this, maxAdFormat.getSize().getHeight())));
            AdControlButton adControlButton = (AdControlButton) findViewById(R.id.banner_control_button);
            this.f25456n = adControlButton;
            adControlButton.setOnClickListener(this);
            this.f25456n.setFormat(maxAdFormat);
            return;
        }
        findViewById(R.id.banner_control_view).setVisibility(8);
        frameLayout.setVisibility(8);
    }

    private void b(MaxAdFormat maxAdFormat) {
        if (MaxAdFormat.INTERSTITIAL == maxAdFormat) {
            this.f25448f.showAd();
            return;
        }
        if (MaxAdFormat.APP_OPEN == maxAdFormat) {
            this.f25449g.showAd();
        } else if (MaxAdFormat.REWARDED_INTERSTITIAL == maxAdFormat) {
            this.f25450h.showAd();
        } else if (MaxAdFormat.REWARDED == maxAdFormat) {
            this.f25451i.showAd();
        }
    }

    private void a(MaxAdFormat maxAdFormat) {
        MaxAdFormat maxAdFormat2 = MaxAdFormat.BANNER;
        boolean z2 = false;
        boolean z3 = (maxAdFormat2 == maxAdFormat || MaxAdFormat.LEADER == maxAdFormat) && this.f25465y.isChecked();
        MaxAdFormat maxAdFormat3 = MaxAdFormat.MREC;
        if (maxAdFormat3 == maxAdFormat && this.f25466z.isChecked()) {
            z2 = true;
        }
        if (!z3 && !z2) {
            this.f25446b.l0().a(getTestModeNetwork(maxAdFormat));
        } else {
            this.f25446b.l0().a(this.f25445a.w());
        }
        if (maxAdFormat2 == maxAdFormat || MaxAdFormat.LEADER == maxAdFormat) {
            this.f25447c.loadAd();
            return;
        }
        if (maxAdFormat3 == maxAdFormat) {
            this.d.loadAd();
            this.f25463u.callOnClick();
            return;
        }
        if (MaxAdFormat.INTERSTITIAL == maxAdFormat) {
            this.f25448f.loadAd();
            return;
        }
        if (MaxAdFormat.APP_OPEN == maxAdFormat) {
            this.f25449g.loadAd();
            return;
        }
        if (MaxAdFormat.REWARDED_INTERSTITIAL == maxAdFormat) {
            this.f25450h.loadAd();
            return;
        }
        if (MaxAdFormat.REWARDED == maxAdFormat) {
            this.f25451i.loadAd();
        } else if (MaxAdFormat.NATIVE == maxAdFormat) {
            this.f25453k.loadAd();
            this.f25464v.callOnClick();
        }
    }

    private AdControlButton a(String str) {
        if (str.equals("test_mode_banner") || str.equals("test_mode_leader")) {
            return this.f25456n;
        }
        if (str.equals("test_mode_mrec")) {
            return this.f25457o;
        }
        if (str.equals("test_mode_interstitial")) {
            return this.f25458p;
        }
        if (str.equals("test_mode_app_open")) {
            return this.f25459q;
        }
        if (str.equals("test_mode_rewarded_interstitial")) {
            return this.f25460r;
        }
        if (str.equals(this.f25455m)) {
            return this.f25461s;
        }
        if (str.equals("test_mode_native")) {
            return this.f25462t;
        }
        throw new IllegalArgumentException("Invalid test mode ad unit identifier provided ".concat(str));
    }
}
