package com.applovin.impl.mediation.debugger.ui.testmode;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.Switch;
import android.widget.TextView;
import androidx.annotation.NonNull;
import com.amazon.device.ads.AdError;
import com.amazon.device.ads.AdRegistration;
import com.amazon.device.ads.DTBAdResponse;
import com.applovin.impl.C0731o0;
import com.applovin.impl.C0735p0;
import com.applovin.impl.fe;
import com.applovin.impl.mediation.debugger.ui.testmode.AdControlButton;
import com.applovin.impl.ne;
import com.applovin.impl.sdk.k;
import com.applovin.impl.sdk.t;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.zp;
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
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class a extends ne implements MaxRewardedAdListener, MaxAdViewAdListener, AdControlButton.a, MaxAdRevenueListener, C0731o0.a {

    /* renamed from: A, reason: collision with root package name */
    private Map f9101A;

    /* renamed from: a, reason: collision with root package name */
    private fe f9102a;
    private k b;

    /* renamed from: c, reason: collision with root package name */
    private MaxAdView f9103c;

    /* renamed from: d, reason: collision with root package name */
    private MaxAdView f9104d;

    /* renamed from: f, reason: collision with root package name */
    private MaxInterstitialAd f9105f;

    /* renamed from: g, reason: collision with root package name */
    private MaxAppOpenAd f9106g;

    /* renamed from: h, reason: collision with root package name */
    private MaxRewardedInterstitialAd f9107h;

    /* renamed from: i, reason: collision with root package name */
    private MaxRewardedAd f9108i;

    /* renamed from: j, reason: collision with root package name */
    private MaxAd f9109j;

    /* renamed from: k, reason: collision with root package name */
    private MaxNativeAdLoader f9110k;
    private List l;
    private String m;

    /* renamed from: n, reason: collision with root package name */
    private AdControlButton f9111n;

    /* renamed from: o, reason: collision with root package name */
    private AdControlButton f9112o;

    /* renamed from: p, reason: collision with root package name */
    private AdControlButton f9113p;

    /* renamed from: q, reason: collision with root package name */
    private AdControlButton f9114q;

    /* renamed from: r, reason: collision with root package name */
    private AdControlButton f9115r;

    /* renamed from: s, reason: collision with root package name */
    private AdControlButton f9116s;

    /* renamed from: t, reason: collision with root package name */
    private AdControlButton f9117t;

    /* renamed from: u, reason: collision with root package name */
    private Button f9118u;

    /* renamed from: v, reason: collision with root package name */
    private Button f9119v;

    /* renamed from: w, reason: collision with root package name */
    private FrameLayout f9120w;

    /* renamed from: x, reason: collision with root package name */
    private FrameLayout f9121x;

    /* renamed from: y, reason: collision with root package name */
    private Switch f9122y;

    /* renamed from: z, reason: collision with root package name */
    private Switch f9123z;

    /* renamed from: com.applovin.impl.mediation.debugger.ui.testmode.a$a, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class C0025a extends MaxNativeAdListener {
        public C0025a() {
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
            if (a.this.f9109j != null) {
                a.this.f9110k.destroy(a.this.f9109j);
            }
            a.this.f9109j = maxAd;
            a.this.f9121x.removeAllViews();
            a.this.f9121x.addView(maxNativeAdView);
            a.this.onAdLoaded(maxAd);
        }
    }

    private void e() {
        List r9 = this.f9102a.r();
        MaxAdFormat maxAdFormat = MaxAdFormat.REWARDED;
        if (r9.contains(maxAdFormat)) {
            String str = "test_mode_rewarded_" + this.f9102a.m();
            this.m = str;
            MaxRewardedAd maxRewardedAd = MaxRewardedAd.getInstance(str, this.b.v0(), this);
            this.f9108i = maxRewardedAd;
            maxRewardedAd.setExtraParameter("disable_auto_retries", "true");
            this.f9108i.setListener(this);
            AdControlButton adControlButton = (AdControlButton) findViewById(R.id.rewarded_control_button);
            this.f9116s = adControlButton;
            adControlButton.setOnClickListener(this);
            this.f9116s.setFormat(maxAdFormat);
            return;
        }
        findViewById(R.id.rewarded_control_view).setVisibility(8);
    }

    @Override // com.applovin.impl.ne
    public k getSdk() {
        return this.b;
    }

    public String getTestModeNetwork(MaxAdFormat maxAdFormat) {
        if (this.f9102a.w() != null && this.f9102a.w().containsKey(maxAdFormat)) {
            return (String) this.f9102a.w().get(maxAdFormat);
        }
        return this.f9102a.m();
    }

    public void initialize(fe feVar) {
        this.f9102a = feVar;
        this.b = feVar.o();
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
    public void onAdDisplayFailed(@NonNull MaxAd maxAd, @NonNull MaxError maxError) {
        a(maxAd.getAdUnitId()).setControlState(AdControlButton.b.LOAD);
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

    @Override // com.applovin.mediation.MaxAdListener
    public void onAdLoadFailed(@NonNull String str, @NonNull MaxError maxError) {
        AdControlButton a6 = a(str);
        a6.setControlState(AdControlButton.b.LOAD);
        zp.a(maxError, a6.getFormat().getLabel(), this);
    }

    @Override // com.applovin.mediation.MaxAdListener
    public void onAdLoaded(@NonNull MaxAd maxAd) {
        AdControlButton a6 = a(maxAd.getAdUnitId());
        if (!maxAd.getFormat().isAdViewAd() && !maxAd.getFormat().equals(MaxAdFormat.NATIVE)) {
            a6.setControlState(AdControlButton.b.SHOW);
        } else {
            a6.setControlState(AdControlButton.b.LOAD);
        }
    }

    @Override // com.applovin.impl.C0731o0.a
    public void onAdResponseLoaded(DTBAdResponse dTBAdResponse, MaxAdFormat maxAdFormat) {
        if (MaxAdFormat.BANNER != maxAdFormat && MaxAdFormat.LEADER != maxAdFormat) {
            if (MaxAdFormat.MREC == maxAdFormat) {
                this.f9104d.setLocalExtraParameter("amazon_ad_response", dTBAdResponse);
            } else if (MaxAdFormat.INTERSTITIAL == maxAdFormat) {
                this.f9105f.setLocalExtraParameter("amazon_ad_response", dTBAdResponse);
            } else if (MaxAdFormat.APP_OPEN == maxAdFormat) {
                this.f9106g.setLocalExtraParameter("amazon_ad_response", dTBAdResponse);
            } else if (MaxAdFormat.REWARDED_INTERSTITIAL == maxAdFormat) {
                this.f9107h.setLocalExtraParameter("amazon_ad_response", dTBAdResponse);
            } else if (MaxAdFormat.REWARDED == maxAdFormat) {
                this.f9108i.setLocalExtraParameter("amazon_ad_response", dTBAdResponse);
            } else if (MaxAdFormat.NATIVE == maxAdFormat) {
                this.f9110k.setLocalExtraParameter("amazon_ad_response", dTBAdResponse);
            }
        } else {
            this.f9103c.setLocalExtraParameter("amazon_ad_response", dTBAdResponse);
        }
        a(maxAdFormat);
    }

    @Override // com.applovin.mediation.MaxAdRevenueListener
    public void onAdRevenuePaid(@NonNull MaxAd maxAd) {
        zp.a("onAdRevenuePaid", maxAd, this);
    }

    @Override // com.applovin.impl.mediation.debugger.ui.testmode.AdControlButton.a
    public void onClick(AdControlButton adControlButton) {
        MaxAdFormat format = adControlButton.getFormat();
        AdControlButton.b bVar = AdControlButton.b.LOAD;
        if (bVar == adControlButton.getControlState()) {
            adControlButton.setControlState(AdControlButton.b.LOADING);
            Map map = this.f9101A;
            if (map != null && map.get(format) != null) {
                ((C0731o0) this.f9101A.get(format)).a();
                return;
            } else {
                a(format);
                return;
            }
        }
        if (AdControlButton.b.SHOW == adControlButton.getControlState()) {
            adControlButton.setControlState(bVar);
            b(format);
        }
    }

    @Override // com.applovin.impl.ne, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (this.f9102a == null) {
            t.h("MaxDebuggerMultiAdActivity", "Failed to initialize activity with a network model.");
            return;
        }
        setContentView(R.layout.mediation_debugger_multi_ad_activity);
        setTitle(this.f9102a.g() + " Test Ads");
        this.l = this.b.n0().b();
        a();
        c();
        b();
        e();
        d();
        findViewById(R.id.rewarded_interstitial_control_view).setVisibility(8);
        findViewById(R.id.app_open_ad_control_view).setVisibility(8);
        this.f9118u = (Button) findViewById(R.id.show_mrec_button);
        this.f9119v = (Button) findViewById(R.id.show_native_button);
        if (this.f9102a.G() && this.f9102a.r().contains(MaxAdFormat.MREC)) {
            this.f9121x.setVisibility(8);
            this.f9118u.setBackgroundColor(-1);
            this.f9119v.setBackgroundColor(-3355444);
            final int i9 = 0;
            this.f9118u.setOnClickListener(new View.OnClickListener(this) { // from class: com.applovin.impl.mediation.debugger.ui.testmode.b

                /* renamed from: c, reason: collision with root package name */
                public final /* synthetic */ a f9125c;

                {
                    this.f9125c = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i9) {
                        case 0:
                            this.f9125c.a(view);
                            return;
                        case 1:
                            this.f9125c.b(view);
                            return;
                        case 2:
                            this.f9125c.c(view);
                            return;
                        default:
                            this.f9125c.d(view);
                            return;
                    }
                }
            });
            final int i10 = 1;
            this.f9119v.setOnClickListener(new View.OnClickListener(this) { // from class: com.applovin.impl.mediation.debugger.ui.testmode.b

                /* renamed from: c, reason: collision with root package name */
                public final /* synthetic */ a f9125c;

                {
                    this.f9125c = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i10) {
                        case 0:
                            this.f9125c.a(view);
                            return;
                        case 1:
                            this.f9125c.b(view);
                            return;
                        case 2:
                            this.f9125c.c(view);
                            return;
                        default:
                            this.f9125c.d(view);
                            return;
                    }
                }
            });
        } else {
            this.f9118u.setVisibility(8);
            this.f9119v.setVisibility(8);
        }
        this.f9122y = (Switch) findViewById(R.id.native_banner_switch);
        this.f9123z = (Switch) findViewById(R.id.native_mrec_switch);
        if (this.f9102a.H()) {
            final int i11 = 2;
            this.f9122y.setOnClickListener(new View.OnClickListener(this) { // from class: com.applovin.impl.mediation.debugger.ui.testmode.b

                /* renamed from: c, reason: collision with root package name */
                public final /* synthetic */ a f9125c;

                {
                    this.f9125c = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i11) {
                        case 0:
                            this.f9125c.a(view);
                            return;
                        case 1:
                            this.f9125c.b(view);
                            return;
                        case 2:
                            this.f9125c.c(view);
                            return;
                        default:
                            this.f9125c.d(view);
                            return;
                    }
                }
            });
            final int i12 = 3;
            this.f9123z.setOnClickListener(new View.OnClickListener(this) { // from class: com.applovin.impl.mediation.debugger.ui.testmode.b

                /* renamed from: c, reason: collision with root package name */
                public final /* synthetic */ a f9125c;

                {
                    this.f9125c = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i12) {
                        case 0:
                            this.f9125c.a(view);
                            return;
                        case 1:
                            this.f9125c.b(view);
                            return;
                        case 2:
                            this.f9125c.c(view);
                            return;
                        default:
                            this.f9125c.d(view);
                            return;
                    }
                }
            });
        } else {
            this.f9122y.setVisibility(8);
            this.f9123z.setVisibility(8);
        }
        if (StringUtils.isValidString(this.f9102a.e()) && this.f9102a.d() != null && this.f9102a.d().size() > 0) {
            AdRegistration.getInstance(this.f9102a.e(), this);
            AdRegistration.enableTesting(true);
            AdRegistration.enableLogging(true);
            HashMap hashMap = new HashMap(this.f9102a.d().size());
            for (MaxAdFormat maxAdFormat : this.f9102a.d().keySet()) {
                hashMap.put(maxAdFormat, new C0731o0((C0735p0) this.f9102a.d().get(maxAdFormat), maxAdFormat, this));
            }
            this.f9101A = hashMap;
        }
        try {
            setRequestedOrientation(7);
        } catch (Throwable th) {
            t.c("AppLovinSdk", "Failed to set portrait orientation", th);
        }
    }

    @Override // com.applovin.impl.ne, android.app.Activity
    public void onDestroy() {
        MaxAd maxAd;
        super.onDestroy();
        this.b.n0().a(this.l);
        MaxAdView maxAdView = this.f9103c;
        if (maxAdView != null) {
            maxAdView.destroy();
        }
        MaxAdView maxAdView2 = this.f9104d;
        if (maxAdView2 != null) {
            maxAdView2.destroy();
        }
        MaxInterstitialAd maxInterstitialAd = this.f9105f;
        if (maxInterstitialAd != null) {
            maxInterstitialAd.destroy();
        }
        MaxRewardedAd maxRewardedAd = this.f9108i;
        if (maxRewardedAd != null) {
            maxRewardedAd.destroy();
        }
        MaxNativeAdLoader maxNativeAdLoader = this.f9110k;
        if (maxNativeAdLoader != null && (maxAd = this.f9109j) != null) {
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

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void d(View view) {
        this.f9104d.removeAllViews();
        this.f9112o.setControlState(AdControlButton.b.LOAD);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(View view) {
        this.f9121x.setVisibility(0);
        this.f9120w.setVisibility(8);
        this.f9119v.setBackgroundColor(-1);
        this.f9118u.setBackgroundColor(-3355444);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c(View view) {
        this.f9103c.removeAllViews();
        this.f9111n.setControlState(AdControlButton.b.LOAD);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(View view) {
        this.f9120w.setVisibility(0);
        this.f9121x.setVisibility(8);
        this.f9118u.setBackgroundColor(-1);
        this.f9119v.setBackgroundColor(-3355444);
    }

    private void d() {
        this.f9121x = (FrameLayout) findViewById(R.id.native_ad_view_container);
        if (this.f9102a.G()) {
            MaxNativeAdLoader maxNativeAdLoader = new MaxNativeAdLoader("test_mode_native", this.b.v0(), this);
            this.f9110k = maxNativeAdLoader;
            maxNativeAdLoader.setExtraParameter("disable_auto_retries", "true");
            this.f9110k.setNativeAdListener(new C0025a());
            this.f9110k.setRevenueListener(this);
            AdControlButton adControlButton = (AdControlButton) findViewById(R.id.native_control_button);
            this.f9117t = adControlButton;
            adControlButton.setOnClickListener(this);
            this.f9117t.setFormat(MaxAdFormat.NATIVE);
            return;
        }
        findViewById(R.id.native_control_view).setVisibility(8);
        this.f9121x.setVisibility(8);
    }

    @Override // com.applovin.impl.C0731o0.a
    public void onAdLoadFailed(AdError adError, MaxAdFormat maxAdFormat) {
        if (MaxAdFormat.BANNER != maxAdFormat && MaxAdFormat.LEADER != maxAdFormat) {
            if (MaxAdFormat.MREC == maxAdFormat) {
                this.f9104d.setLocalExtraParameter("amazon_ad_error", adError);
            } else if (MaxAdFormat.INTERSTITIAL == maxAdFormat) {
                this.f9105f.setLocalExtraParameter("amazon_ad_error", adError);
            } else if (MaxAdFormat.APP_OPEN == maxAdFormat) {
                this.f9106g.setLocalExtraParameter("amazon_ad_error", adError);
            } else if (MaxAdFormat.REWARDED_INTERSTITIAL == maxAdFormat) {
                this.f9107h.setLocalExtraParameter("amazon_ad_error", adError);
            } else if (MaxAdFormat.REWARDED == maxAdFormat) {
                this.f9108i.setLocalExtraParameter("amazon_ad_error", adError);
            } else if (MaxAdFormat.NATIVE == maxAdFormat) {
                this.f9110k.setLocalExtraParameter("amazon_ad_error", adError);
            }
        } else {
            this.f9103c.setLocalExtraParameter("amazon_ad_error", adError);
        }
        a(maxAdFormat);
    }

    private void c() {
        this.f9120w = (FrameLayout) findViewById(R.id.mrec_ad_view_container);
        List r9 = this.f9102a.r();
        MaxAdFormat maxAdFormat = MaxAdFormat.MREC;
        if (r9.contains(maxAdFormat)) {
            MaxAdView maxAdView = new MaxAdView("test_mode_mrec", maxAdFormat, this.b.v0(), this);
            this.f9104d = maxAdView;
            maxAdView.setExtraParameter("disable_auto_retries", "true");
            this.f9104d.setExtraParameter("disable_precache", "true");
            this.f9104d.setExtraParameter("allow_pause_auto_refresh_immediately", "true");
            this.f9104d.stopAutoRefresh();
            this.f9104d.setListener(this);
            this.f9120w.addView(this.f9104d, new FrameLayout.LayoutParams(-1, -1));
            AdControlButton adControlButton = (AdControlButton) findViewById(R.id.mrec_control_button);
            this.f9112o = adControlButton;
            adControlButton.setOnClickListener(this);
            this.f9112o.setFormat(maxAdFormat);
            return;
        }
        findViewById(R.id.mrec_control_view).setVisibility(8);
        this.f9120w.setVisibility(8);
    }

    private void b() {
        List r9 = this.f9102a.r();
        MaxAdFormat maxAdFormat = MaxAdFormat.INTERSTITIAL;
        if (r9.contains(maxAdFormat)) {
            MaxInterstitialAd maxInterstitialAd = new MaxInterstitialAd("test_mode_interstitial", this.b.v0(), this);
            this.f9105f = maxInterstitialAd;
            maxInterstitialAd.setExtraParameter("disable_auto_retries", "true");
            this.f9105f.setListener(this);
            AdControlButton adControlButton = (AdControlButton) findViewById(R.id.interstitial_control_button);
            this.f9113p = adControlButton;
            adControlButton.setOnClickListener(this);
            this.f9113p.setFormat(maxAdFormat);
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
        if (this.f9102a.r().contains(maxAdFormat)) {
            MaxAdView maxAdView = new MaxAdView(str, maxAdFormat, this.b.v0(), this);
            this.f9103c = maxAdView;
            maxAdView.setExtraParameter("adaptive_banner", "false");
            this.f9103c.setExtraParameter("disable_auto_retries", "true");
            this.f9103c.setExtraParameter("disable_precache", "true");
            this.f9103c.setExtraParameter("allow_pause_auto_refresh_immediately", "true");
            this.f9103c.stopAutoRefresh();
            this.f9103c.setListener(this);
            frameLayout.addView(this.f9103c, new FrameLayout.LayoutParams(AppLovinSdkUtils.dpToPx(this, maxAdFormat.getSize().getWidth()), AppLovinSdkUtils.dpToPx(this, maxAdFormat.getSize().getHeight())));
            AdControlButton adControlButton = (AdControlButton) findViewById(R.id.banner_control_button);
            this.f9111n = adControlButton;
            adControlButton.setOnClickListener(this);
            this.f9111n.setFormat(maxAdFormat);
            return;
        }
        findViewById(R.id.banner_control_view).setVisibility(8);
        frameLayout.setVisibility(8);
    }

    private void b(MaxAdFormat maxAdFormat) {
        if (MaxAdFormat.INTERSTITIAL == maxAdFormat) {
            this.f9105f.showAd();
            return;
        }
        if (MaxAdFormat.APP_OPEN == maxAdFormat) {
            this.f9106g.showAd();
        } else if (MaxAdFormat.REWARDED_INTERSTITIAL == maxAdFormat) {
            this.f9107h.showAd();
        } else if (MaxAdFormat.REWARDED == maxAdFormat) {
            this.f9108i.showAd();
        }
    }

    private void a(MaxAdFormat maxAdFormat) {
        MaxAdFormat maxAdFormat2 = MaxAdFormat.BANNER;
        boolean z8 = false;
        boolean z9 = (maxAdFormat2 == maxAdFormat || MaxAdFormat.LEADER == maxAdFormat) && this.f9122y.isChecked();
        MaxAdFormat maxAdFormat3 = MaxAdFormat.MREC;
        if (maxAdFormat3 == maxAdFormat && this.f9123z.isChecked()) {
            z8 = true;
        }
        if (!z9 && !z8) {
            this.b.n0().a(getTestModeNetwork(maxAdFormat));
        } else {
            this.b.n0().a(this.f9102a.v());
        }
        if (maxAdFormat2 == maxAdFormat || MaxAdFormat.LEADER == maxAdFormat) {
            this.f9103c.loadAd();
            return;
        }
        if (maxAdFormat3 == maxAdFormat) {
            this.f9104d.loadAd();
            this.f9118u.callOnClick();
            return;
        }
        if (MaxAdFormat.INTERSTITIAL == maxAdFormat) {
            this.f9105f.loadAd();
            return;
        }
        if (MaxAdFormat.APP_OPEN == maxAdFormat) {
            this.f9106g.loadAd();
            return;
        }
        if (MaxAdFormat.REWARDED_INTERSTITIAL == maxAdFormat) {
            this.f9107h.loadAd();
            return;
        }
        if (MaxAdFormat.REWARDED == maxAdFormat) {
            this.f9108i.loadAd();
        } else if (MaxAdFormat.NATIVE == maxAdFormat) {
            this.f9110k.loadAd();
            this.f9119v.callOnClick();
        }
    }

    private AdControlButton a(String str) {
        if (!str.equals("test_mode_banner") && !str.equals("test_mode_leader")) {
            if (str.equals("test_mode_mrec")) {
                return this.f9112o;
            }
            if (str.equals("test_mode_interstitial")) {
                return this.f9113p;
            }
            if (str.equals("test_mode_app_open")) {
                return this.f9114q;
            }
            if (str.equals("test_mode_rewarded_interstitial")) {
                return this.f9115r;
            }
            if (str.equals(this.m)) {
                return this.f9116s;
            }
            if (str.equals("test_mode_native")) {
                return this.f9117t;
            }
            throw new IllegalArgumentException("Invalid test mode ad unit identifier provided ".concat(str));
        }
        return this.f9111n;
    }
}
