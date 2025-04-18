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
import com.applovin.impl.fe;
import com.applovin.impl.mediation.debugger.ui.testmode.AdControlButton;
import com.applovin.impl.ne;
import com.applovin.impl.o0;
import com.applovin.impl.p0;
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
public abstract class a extends ne implements MaxRewardedAdListener, MaxAdViewAdListener, AdControlButton.a, MaxAdRevenueListener, o0.a {
    private Map A;
    private fe a;

    /* renamed from: b, reason: collision with root package name */
    private k f6148b;

    /* renamed from: c, reason: collision with root package name */
    private MaxAdView f6149c;

    /* renamed from: d, reason: collision with root package name */
    private MaxAdView f6150d;

    /* renamed from: f, reason: collision with root package name */
    private MaxInterstitialAd f6151f;

    /* renamed from: g, reason: collision with root package name */
    private MaxAppOpenAd f6152g;

    /* renamed from: h, reason: collision with root package name */
    private MaxRewardedInterstitialAd f6153h;

    /* renamed from: i, reason: collision with root package name */
    private MaxRewardedAd f6154i;

    /* renamed from: j, reason: collision with root package name */
    private MaxAd f6155j;

    /* renamed from: k, reason: collision with root package name */
    private MaxNativeAdLoader f6156k;

    /* renamed from: l, reason: collision with root package name */
    private List f6157l;

    /* renamed from: m, reason: collision with root package name */
    private String f6158m;

    /* renamed from: n, reason: collision with root package name */
    private AdControlButton f6159n;

    /* renamed from: o, reason: collision with root package name */
    private AdControlButton f6160o;

    /* renamed from: p, reason: collision with root package name */
    private AdControlButton f6161p;

    /* renamed from: q, reason: collision with root package name */
    private AdControlButton f6162q;

    /* renamed from: r, reason: collision with root package name */
    private AdControlButton f6163r;

    /* renamed from: s, reason: collision with root package name */
    private AdControlButton f6164s;

    /* renamed from: t, reason: collision with root package name */
    private AdControlButton f6165t;
    private Button u;

    /* renamed from: v, reason: collision with root package name */
    private Button f6166v;

    /* renamed from: w, reason: collision with root package name */
    private FrameLayout f6167w;

    /* renamed from: x, reason: collision with root package name */
    private FrameLayout f6168x;

    /* renamed from: y, reason: collision with root package name */
    private Switch f6169y;

    /* renamed from: z, reason: collision with root package name */
    private Switch f6170z;

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
            if (a.this.f6155j != null) {
                a.this.f6156k.destroy(a.this.f6155j);
            }
            a.this.f6155j = maxAd;
            a.this.f6168x.removeAllViews();
            a.this.f6168x.addView(maxNativeAdView);
            a.this.onAdLoaded(maxAd);
        }
    }

    private void e() {
        List r6 = this.a.r();
        MaxAdFormat maxAdFormat = MaxAdFormat.REWARDED;
        if (r6.contains(maxAdFormat)) {
            String str = "test_mode_rewarded_" + this.a.m();
            this.f6158m = str;
            MaxRewardedAd maxRewardedAd = MaxRewardedAd.getInstance(str, this.f6148b.v0(), this);
            this.f6154i = maxRewardedAd;
            maxRewardedAd.setExtraParameter("disable_auto_retries", "true");
            this.f6154i.setListener(this);
            AdControlButton adControlButton = (AdControlButton) findViewById(R.id.rewarded_control_button);
            this.f6164s = adControlButton;
            adControlButton.setOnClickListener(this);
            this.f6164s.setFormat(maxAdFormat);
            return;
        }
        findViewById(R.id.rewarded_control_view).setVisibility(8);
    }

    @Override // com.applovin.impl.ne
    public k getSdk() {
        return this.f6148b;
    }

    public String getTestModeNetwork(MaxAdFormat maxAdFormat) {
        if (this.a.w() != null && this.a.w().containsKey(maxAdFormat)) {
            return (String) this.a.w().get(maxAdFormat);
        }
        return this.a.m();
    }

    public void initialize(fe feVar) {
        this.a = feVar;
        this.f6148b = feVar.o();
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
        AdControlButton a = a(str);
        a.setControlState(AdControlButton.b.LOAD);
        zp.a(maxError, a.getFormat().getLabel(), this);
    }

    @Override // com.applovin.mediation.MaxAdListener
    public void onAdLoaded(@NonNull MaxAd maxAd) {
        AdControlButton a = a(maxAd.getAdUnitId());
        if (!maxAd.getFormat().isAdViewAd() && !maxAd.getFormat().equals(MaxAdFormat.NATIVE)) {
            a.setControlState(AdControlButton.b.SHOW);
        } else {
            a.setControlState(AdControlButton.b.LOAD);
        }
    }

    @Override // com.applovin.impl.o0.a
    public void onAdResponseLoaded(DTBAdResponse dTBAdResponse, MaxAdFormat maxAdFormat) {
        if (MaxAdFormat.BANNER != maxAdFormat && MaxAdFormat.LEADER != maxAdFormat) {
            if (MaxAdFormat.MREC == maxAdFormat) {
                this.f6150d.setLocalExtraParameter("amazon_ad_response", dTBAdResponse);
            } else if (MaxAdFormat.INTERSTITIAL == maxAdFormat) {
                this.f6151f.setLocalExtraParameter("amazon_ad_response", dTBAdResponse);
            } else if (MaxAdFormat.APP_OPEN == maxAdFormat) {
                this.f6152g.setLocalExtraParameter("amazon_ad_response", dTBAdResponse);
            } else if (MaxAdFormat.REWARDED_INTERSTITIAL == maxAdFormat) {
                this.f6153h.setLocalExtraParameter("amazon_ad_response", dTBAdResponse);
            } else if (MaxAdFormat.REWARDED == maxAdFormat) {
                this.f6154i.setLocalExtraParameter("amazon_ad_response", dTBAdResponse);
            } else if (MaxAdFormat.NATIVE == maxAdFormat) {
                this.f6156k.setLocalExtraParameter("amazon_ad_response", dTBAdResponse);
            }
        } else {
            this.f6149c.setLocalExtraParameter("amazon_ad_response", dTBAdResponse);
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
            Map map = this.A;
            if (map != null && map.get(format) != null) {
                ((o0) this.A.get(format)).a();
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
        if (this.a == null) {
            t.h("MaxDebuggerMultiAdActivity", "Failed to initialize activity with a network model.");
            return;
        }
        setContentView(R.layout.mediation_debugger_multi_ad_activity);
        setTitle(this.a.g() + " Test Ads");
        this.f6157l = this.f6148b.n0().b();
        a();
        c();
        b();
        e();
        d();
        findViewById(R.id.rewarded_interstitial_control_view).setVisibility(8);
        findViewById(R.id.app_open_ad_control_view).setVisibility(8);
        this.u = (Button) findViewById(R.id.show_mrec_button);
        this.f6166v = (Button) findViewById(R.id.show_native_button);
        final int i10 = 1;
        if (this.a.G() && this.a.r().contains(MaxAdFormat.MREC)) {
            this.f6168x.setVisibility(8);
            this.u.setBackgroundColor(-1);
            this.f6166v.setBackgroundColor(-3355444);
            final int i11 = 0;
            this.u.setOnClickListener(new View.OnClickListener(this) { // from class: com.applovin.impl.mediation.debugger.ui.testmode.b

                /* renamed from: c, reason: collision with root package name */
                public final /* synthetic */ a f6172c;

                {
                    this.f6172c = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i12 = i11;
                    a aVar = this.f6172c;
                    switch (i12) {
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
            this.f6166v.setOnClickListener(new View.OnClickListener(this) { // from class: com.applovin.impl.mediation.debugger.ui.testmode.b

                /* renamed from: c, reason: collision with root package name */
                public final /* synthetic */ a f6172c;

                {
                    this.f6172c = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i12 = i10;
                    a aVar = this.f6172c;
                    switch (i12) {
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
            this.u.setVisibility(8);
            this.f6166v.setVisibility(8);
        }
        this.f6169y = (Switch) findViewById(R.id.native_banner_switch);
        this.f6170z = (Switch) findViewById(R.id.native_mrec_switch);
        if (this.a.H()) {
            final int i12 = 2;
            this.f6169y.setOnClickListener(new View.OnClickListener(this) { // from class: com.applovin.impl.mediation.debugger.ui.testmode.b

                /* renamed from: c, reason: collision with root package name */
                public final /* synthetic */ a f6172c;

                {
                    this.f6172c = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i122 = i12;
                    a aVar = this.f6172c;
                    switch (i122) {
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
            final int i13 = 3;
            this.f6170z.setOnClickListener(new View.OnClickListener(this) { // from class: com.applovin.impl.mediation.debugger.ui.testmode.b

                /* renamed from: c, reason: collision with root package name */
                public final /* synthetic */ a f6172c;

                {
                    this.f6172c = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i122 = i13;
                    a aVar = this.f6172c;
                    switch (i122) {
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
            this.f6169y.setVisibility(8);
            this.f6170z.setVisibility(8);
        }
        if (StringUtils.isValidString(this.a.e()) && this.a.d() != null && this.a.d().size() > 0) {
            AdRegistration.getInstance(this.a.e(), this);
            AdRegistration.enableTesting(true);
            AdRegistration.enableLogging(true);
            HashMap hashMap = new HashMap(this.a.d().size());
            for (MaxAdFormat maxAdFormat : this.a.d().keySet()) {
                hashMap.put(maxAdFormat, new o0((p0) this.a.d().get(maxAdFormat), maxAdFormat, this));
            }
            this.A = hashMap;
        }
        try {
            setRequestedOrientation(7);
        } catch (Throwable th2) {
            t.c("AppLovinSdk", "Failed to set portrait orientation", th2);
        }
    }

    @Override // com.applovin.impl.ne, android.app.Activity
    public void onDestroy() {
        MaxAd maxAd;
        super.onDestroy();
        this.f6148b.n0().a(this.f6157l);
        MaxAdView maxAdView = this.f6149c;
        if (maxAdView != null) {
            maxAdView.destroy();
        }
        MaxAdView maxAdView2 = this.f6150d;
        if (maxAdView2 != null) {
            maxAdView2.destroy();
        }
        MaxInterstitialAd maxInterstitialAd = this.f6151f;
        if (maxInterstitialAd != null) {
            maxInterstitialAd.destroy();
        }
        MaxRewardedAd maxRewardedAd = this.f6154i;
        if (maxRewardedAd != null) {
            maxRewardedAd.destroy();
        }
        MaxNativeAdLoader maxNativeAdLoader = this.f6156k;
        if (maxNativeAdLoader != null && (maxAd = this.f6155j) != null) {
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
        this.f6150d.removeAllViews();
        this.f6160o.setControlState(AdControlButton.b.LOAD);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(View view) {
        this.f6168x.setVisibility(0);
        this.f6167w.setVisibility(8);
        this.f6166v.setBackgroundColor(-1);
        this.u.setBackgroundColor(-3355444);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c(View view) {
        this.f6149c.removeAllViews();
        this.f6159n.setControlState(AdControlButton.b.LOAD);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(View view) {
        this.f6167w.setVisibility(0);
        this.f6168x.setVisibility(8);
        this.u.setBackgroundColor(-1);
        this.f6166v.setBackgroundColor(-3355444);
    }

    private void d() {
        this.f6168x = (FrameLayout) findViewById(R.id.native_ad_view_container);
        if (this.a.G()) {
            MaxNativeAdLoader maxNativeAdLoader = new MaxNativeAdLoader("test_mode_native", this.f6148b.v0(), this);
            this.f6156k = maxNativeAdLoader;
            maxNativeAdLoader.setExtraParameter("disable_auto_retries", "true");
            this.f6156k.setNativeAdListener(new C0025a());
            this.f6156k.setRevenueListener(this);
            AdControlButton adControlButton = (AdControlButton) findViewById(R.id.native_control_button);
            this.f6165t = adControlButton;
            adControlButton.setOnClickListener(this);
            this.f6165t.setFormat(MaxAdFormat.NATIVE);
            return;
        }
        findViewById(R.id.native_control_view).setVisibility(8);
        this.f6168x.setVisibility(8);
    }

    @Override // com.applovin.impl.o0.a
    public void onAdLoadFailed(AdError adError, MaxAdFormat maxAdFormat) {
        if (MaxAdFormat.BANNER != maxAdFormat && MaxAdFormat.LEADER != maxAdFormat) {
            if (MaxAdFormat.MREC == maxAdFormat) {
                this.f6150d.setLocalExtraParameter("amazon_ad_error", adError);
            } else if (MaxAdFormat.INTERSTITIAL == maxAdFormat) {
                this.f6151f.setLocalExtraParameter("amazon_ad_error", adError);
            } else if (MaxAdFormat.APP_OPEN == maxAdFormat) {
                this.f6152g.setLocalExtraParameter("amazon_ad_error", adError);
            } else if (MaxAdFormat.REWARDED_INTERSTITIAL == maxAdFormat) {
                this.f6153h.setLocalExtraParameter("amazon_ad_error", adError);
            } else if (MaxAdFormat.REWARDED == maxAdFormat) {
                this.f6154i.setLocalExtraParameter("amazon_ad_error", adError);
            } else if (MaxAdFormat.NATIVE == maxAdFormat) {
                this.f6156k.setLocalExtraParameter("amazon_ad_error", adError);
            }
        } else {
            this.f6149c.setLocalExtraParameter("amazon_ad_error", adError);
        }
        a(maxAdFormat);
    }

    private void c() {
        this.f6167w = (FrameLayout) findViewById(R.id.mrec_ad_view_container);
        List r6 = this.a.r();
        MaxAdFormat maxAdFormat = MaxAdFormat.MREC;
        if (r6.contains(maxAdFormat)) {
            MaxAdView maxAdView = new MaxAdView("test_mode_mrec", maxAdFormat, this.f6148b.v0(), this);
            this.f6150d = maxAdView;
            maxAdView.setExtraParameter("disable_auto_retries", "true");
            this.f6150d.setExtraParameter("disable_precache", "true");
            this.f6150d.setExtraParameter("allow_pause_auto_refresh_immediately", "true");
            this.f6150d.stopAutoRefresh();
            this.f6150d.setListener(this);
            this.f6167w.addView(this.f6150d, new FrameLayout.LayoutParams(-1, -1));
            AdControlButton adControlButton = (AdControlButton) findViewById(R.id.mrec_control_button);
            this.f6160o = adControlButton;
            adControlButton.setOnClickListener(this);
            this.f6160o.setFormat(maxAdFormat);
            return;
        }
        findViewById(R.id.mrec_control_view).setVisibility(8);
        this.f6167w.setVisibility(8);
    }

    private void b() {
        List r6 = this.a.r();
        MaxAdFormat maxAdFormat = MaxAdFormat.INTERSTITIAL;
        if (r6.contains(maxAdFormat)) {
            MaxInterstitialAd maxInterstitialAd = new MaxInterstitialAd("test_mode_interstitial", this.f6148b.v0(), this);
            this.f6151f = maxInterstitialAd;
            maxInterstitialAd.setExtraParameter("disable_auto_retries", "true");
            this.f6151f.setListener(this);
            AdControlButton adControlButton = (AdControlButton) findViewById(R.id.interstitial_control_button);
            this.f6161p = adControlButton;
            adControlButton.setOnClickListener(this);
            this.f6161p.setFormat(maxAdFormat);
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
        if (this.a.r().contains(maxAdFormat)) {
            MaxAdView maxAdView = new MaxAdView(str, maxAdFormat, this.f6148b.v0(), this);
            this.f6149c = maxAdView;
            maxAdView.setExtraParameter("adaptive_banner", "false");
            this.f6149c.setExtraParameter("disable_auto_retries", "true");
            this.f6149c.setExtraParameter("disable_precache", "true");
            this.f6149c.setExtraParameter("allow_pause_auto_refresh_immediately", "true");
            this.f6149c.stopAutoRefresh();
            this.f6149c.setListener(this);
            frameLayout.addView(this.f6149c, new FrameLayout.LayoutParams(AppLovinSdkUtils.dpToPx(this, maxAdFormat.getSize().getWidth()), AppLovinSdkUtils.dpToPx(this, maxAdFormat.getSize().getHeight())));
            AdControlButton adControlButton = (AdControlButton) findViewById(R.id.banner_control_button);
            this.f6159n = adControlButton;
            adControlButton.setOnClickListener(this);
            this.f6159n.setFormat(maxAdFormat);
            return;
        }
        findViewById(R.id.banner_control_view).setVisibility(8);
        frameLayout.setVisibility(8);
    }

    private void b(MaxAdFormat maxAdFormat) {
        if (MaxAdFormat.INTERSTITIAL == maxAdFormat) {
            this.f6151f.showAd();
            return;
        }
        if (MaxAdFormat.APP_OPEN == maxAdFormat) {
            this.f6152g.showAd();
        } else if (MaxAdFormat.REWARDED_INTERSTITIAL == maxAdFormat) {
            this.f6153h.showAd();
        } else if (MaxAdFormat.REWARDED == maxAdFormat) {
            this.f6154i.showAd();
        }
    }

    private void a(MaxAdFormat maxAdFormat) {
        MaxAdFormat maxAdFormat2 = MaxAdFormat.BANNER;
        boolean z10 = (maxAdFormat2 == maxAdFormat || MaxAdFormat.LEADER == maxAdFormat) && this.f6169y.isChecked();
        MaxAdFormat maxAdFormat3 = MaxAdFormat.MREC;
        boolean z11 = maxAdFormat3 == maxAdFormat && this.f6170z.isChecked();
        if (!z10 && !z11) {
            this.f6148b.n0().a(getTestModeNetwork(maxAdFormat));
        } else {
            this.f6148b.n0().a(this.a.v());
        }
        if (maxAdFormat2 == maxAdFormat || MaxAdFormat.LEADER == maxAdFormat) {
            this.f6149c.loadAd();
            return;
        }
        if (maxAdFormat3 == maxAdFormat) {
            this.f6150d.loadAd();
            this.u.callOnClick();
            return;
        }
        if (MaxAdFormat.INTERSTITIAL == maxAdFormat) {
            this.f6151f.loadAd();
            return;
        }
        if (MaxAdFormat.APP_OPEN == maxAdFormat) {
            this.f6152g.loadAd();
            return;
        }
        if (MaxAdFormat.REWARDED_INTERSTITIAL == maxAdFormat) {
            this.f6153h.loadAd();
            return;
        }
        if (MaxAdFormat.REWARDED == maxAdFormat) {
            this.f6154i.loadAd();
        } else if (MaxAdFormat.NATIVE == maxAdFormat) {
            this.f6156k.loadAd();
            this.f6166v.callOnClick();
        }
    }

    private AdControlButton a(String str) {
        if (!str.equals("test_mode_banner") && !str.equals("test_mode_leader")) {
            if (str.equals("test_mode_mrec")) {
                return this.f6160o;
            }
            if (str.equals("test_mode_interstitial")) {
                return this.f6161p;
            }
            if (str.equals("test_mode_app_open")) {
                return this.f6162q;
            }
            if (str.equals("test_mode_rewarded_interstitial")) {
                return this.f6163r;
            }
            if (str.equals(this.f6158m)) {
                return this.f6164s;
            }
            if (str.equals("test_mode_native")) {
                return this.f6165t;
            }
            throw new IllegalArgumentException("Invalid test mode ad unit identifier provided ".concat(str));
        }
        return this.f6159n;
    }
}
