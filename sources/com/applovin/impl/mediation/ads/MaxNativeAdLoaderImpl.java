package com.applovin.impl.mediation.ads;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.applovin.impl.bc;
import com.applovin.impl.be;
import com.applovin.impl.ee;
import com.applovin.impl.h8;
import com.applovin.impl.kn;
import com.applovin.impl.mediation.MaxErrorImpl;
import com.applovin.impl.mediation.ads.a;
import com.applovin.impl.mediation.d;
import com.applovin.impl.qe;
import com.applovin.impl.sdk.a;
import com.applovin.impl.sdk.t;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sm;
import com.applovin.impl.v;
import com.applovin.impl.x3;
import com.applovin.impl.xl;
import com.applovin.impl.zp;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxError;
import com.applovin.mediation.nativeAds.MaxNativeAd;
import com.applovin.mediation.nativeAds.MaxNativeAdListener;
import com.applovin.mediation.nativeAds.MaxNativeAdView;
import com.applovin.sdk.AppLovinSdkUtils;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: classes.dex */
public class MaxNativeAdLoaderImpl extends com.applovin.impl.mediation.ads.a implements a.InterfaceC0033a, v.b {
    public static final String KEY_EXTRA_PARAMETER_AD_REQUEST_TYPE = "ad_request_type";
    private final c a;

    /* renamed from: b, reason: collision with root package name */
    private String f6057b;

    /* renamed from: c, reason: collision with root package name */
    private String f6058c;

    /* renamed from: d, reason: collision with root package name */
    private d.b f6059d;

    /* renamed from: e, reason: collision with root package name */
    private final Object f6060e;

    /* renamed from: f, reason: collision with root package name */
    private MaxNativeAdListener f6061f;

    /* renamed from: g, reason: collision with root package name */
    private final Map f6062g;

    /* renamed from: h, reason: collision with root package name */
    private final Set f6063h;

    /* loaded from: classes.dex */
    public class a implements Runnable {
        final /* synthetic */ MaxNativeAd a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ List f6064b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ ViewGroup f6065c;

        public a(MaxNativeAd maxNativeAd, List list, ViewGroup viewGroup) {
            this.a = maxNativeAd;
            this.f6064b = list;
            this.f6065c = viewGroup;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (!this.a.prepareForInteraction(this.f6064b, this.f6065c)) {
                t.h(MaxNativeAdLoaderImpl.this.tag, "Failed to prepare native ad for interaction...");
            }
        }
    }

    /* loaded from: classes.dex */
    public class b implements Runnable {
        final /* synthetic */ MaxNativeAdView a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ee f6067b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ MaxNativeAd f6068c;

        public b(MaxNativeAdView maxNativeAdView, ee eeVar, MaxNativeAd maxNativeAd) {
            this.a = maxNativeAdView;
            this.f6067b = eeVar;
            this.f6068c = maxNativeAd;
        }

        @Override // java.lang.Runnable
        public void run() {
            t tVar = MaxNativeAdLoaderImpl.this.logger;
            if (t.a()) {
                MaxNativeAdLoaderImpl maxNativeAdLoaderImpl = MaxNativeAdLoaderImpl.this;
                maxNativeAdLoaderImpl.logger.a(maxNativeAdLoaderImpl.tag, "Rendering native ad view: " + this.a);
            }
            this.a.render(this.f6067b, MaxNativeAdLoaderImpl.this.a, MaxNativeAdLoaderImpl.this.sdk);
            this.f6068c.setNativeAdView(this.a);
            if (!this.f6068c.prepareForInteraction(this.a.getClickableViews(), this.a)) {
                this.f6068c.prepareViewForInteraction(this.a);
            }
        }
    }

    /* loaded from: classes.dex */
    public class c implements a.InterfaceC0023a {
        private c() {
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdClicked(MaxAd maxAd) {
            t tVar = MaxNativeAdLoaderImpl.this.logger;
            if (t.a()) {
                MaxNativeAdLoaderImpl maxNativeAdLoaderImpl = MaxNativeAdLoaderImpl.this;
                maxNativeAdLoaderImpl.logger.a(maxNativeAdLoaderImpl.tag, "MaxNativeAdListener.onNativeAdClicked(nativeAd=" + maxAd + "), listener=" + MaxNativeAdLoaderImpl.this.f6061f);
            }
            bc.a(MaxNativeAdLoaderImpl.this.f6061f, maxAd, true);
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdDisplayFailed(MaxAd maxAd, MaxError maxError) {
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdDisplayed(MaxAd maxAd) {
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdHidden(MaxAd maxAd) {
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdLoadFailed(String str, MaxError maxError) {
            MaxNativeAdLoaderImpl.this.a(((MaxErrorImpl) maxError).getLoadTag());
            t tVar = MaxNativeAdLoaderImpl.this.logger;
            if (t.a()) {
                MaxNativeAdLoaderImpl maxNativeAdLoaderImpl = MaxNativeAdLoaderImpl.this;
                maxNativeAdLoaderImpl.logger.a(maxNativeAdLoaderImpl.tag, "MaxNativeAdListener.onNativeAdLoadFailed(adUnitId=" + str + ", error=" + maxError + "), listener=" + MaxNativeAdLoaderImpl.this.f6061f);
            }
            bc.a(MaxNativeAdLoaderImpl.this.f6061f, str, maxError, true);
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdLoaded(MaxAd maxAd) {
            AppLovinSdkUtils.runOnUiThread(new com.applovin.impl.mediation.ads.c(this, maxAd, 2));
        }

        @Override // com.applovin.mediation.MaxAdRequestListener
        public void onAdRequestStarted(String str) {
        }

        @Override // com.applovin.mediation.MaxAdRevenueListener
        public void onAdRevenuePaid(MaxAd maxAd) {
            t tVar = MaxNativeAdLoaderImpl.this.logger;
            if (t.a()) {
                MaxNativeAdLoaderImpl maxNativeAdLoaderImpl = MaxNativeAdLoaderImpl.this;
                maxNativeAdLoaderImpl.logger.a(maxNativeAdLoaderImpl.tag, "MaxAdRevenueListener.onAdRevenuePaid(ad=" + maxAd + "), listener=" + MaxNativeAdLoaderImpl.this.revenueListener);
            }
            bc.a(MaxNativeAdLoaderImpl.this.revenueListener, maxAd, true);
        }

        public /* synthetic */ c(MaxNativeAdLoaderImpl maxNativeAdLoaderImpl, a aVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a(MaxAd maxAd) {
            t tVar = MaxNativeAdLoaderImpl.this.logger;
            if (t.a()) {
                MaxNativeAdLoaderImpl maxNativeAdLoaderImpl = MaxNativeAdLoaderImpl.this;
                maxNativeAdLoaderImpl.logger.a(maxNativeAdLoaderImpl.tag, "Native ad loaded");
            }
            ee eeVar = (ee) maxAd;
            eeVar.g(MaxNativeAdLoaderImpl.this.f6057b);
            eeVar.f(MaxNativeAdLoaderImpl.this.f6058c);
            MaxNativeAdLoaderImpl.this.sdk.v().d(eeVar);
            synchronized (MaxNativeAdLoaderImpl.this.f6060e) {
                MaxNativeAdLoaderImpl.this.f6063h.add(eeVar);
            }
            MaxNativeAdView a = MaxNativeAdLoaderImpl.this.a(eeVar.L());
            if (a == null) {
                t tVar2 = MaxNativeAdLoaderImpl.this.logger;
                if (t.a()) {
                    MaxNativeAdLoaderImpl maxNativeAdLoaderImpl2 = MaxNativeAdLoaderImpl.this;
                    maxNativeAdLoaderImpl2.logger.a(maxNativeAdLoaderImpl2.tag, "No custom view provided, checking template");
                }
                String o02 = eeVar.o0();
                if (StringUtils.isValidString(o02)) {
                    t tVar3 = MaxNativeAdLoaderImpl.this.logger;
                    if (t.a()) {
                        MaxNativeAdLoaderImpl maxNativeAdLoaderImpl3 = MaxNativeAdLoaderImpl.this;
                        a4.j.x("Using template: ", o02, "...", maxNativeAdLoaderImpl3.logger, maxNativeAdLoaderImpl3.tag);
                    }
                    a = new MaxNativeAdView(o02, com.applovin.impl.sdk.k.k());
                }
            }
            if (a == null) {
                t tVar4 = MaxNativeAdLoaderImpl.this.logger;
                if (t.a()) {
                    MaxNativeAdLoaderImpl maxNativeAdLoaderImpl4 = MaxNativeAdLoaderImpl.this;
                    maxNativeAdLoaderImpl4.logger.a(maxNativeAdLoaderImpl4.tag, "No native ad view to render. Returning the native ad to be rendered later.");
                }
                t tVar5 = MaxNativeAdLoaderImpl.this.logger;
                if (t.a()) {
                    MaxNativeAdLoaderImpl maxNativeAdLoaderImpl5 = MaxNativeAdLoaderImpl.this;
                    maxNativeAdLoaderImpl5.logger.a(maxNativeAdLoaderImpl5.tag, "MaxNativeAdListener.onNativeAdLoaded(nativeAdView=null, nativeAd=" + maxAd + "), listener=" + MaxNativeAdLoaderImpl.this.f6061f);
                }
                bc.a(MaxNativeAdLoaderImpl.this.f6061f, (MaxNativeAdView) null, maxAd, true);
                MaxNativeAdLoaderImpl.this.a(eeVar);
                return;
            }
            a(a);
            MaxNativeAdLoaderImpl.this.a(a, eeVar, eeVar.getNativeAd());
            t tVar6 = MaxNativeAdLoaderImpl.this.logger;
            if (t.a()) {
                MaxNativeAdLoaderImpl maxNativeAdLoaderImpl6 = MaxNativeAdLoaderImpl.this;
                maxNativeAdLoaderImpl6.logger.a(maxNativeAdLoaderImpl6.tag, "MaxNativeAdListener.onNativeAdLoaded(nativeAdView=" + a + ", nativeAd=" + maxAd + "), listener=" + MaxNativeAdLoaderImpl.this.f6061f);
            }
            bc.a(MaxNativeAdLoaderImpl.this.f6061f, a, maxAd, true);
            MaxNativeAdLoaderImpl.this.a(eeVar);
            MaxNativeAdLoaderImpl.this.a(a);
        }

        private void a(MaxNativeAdView maxNativeAdView) {
            ee b3;
            com.applovin.impl.mediation.ads.b adViewTracker = maxNativeAdView.getAdViewTracker();
            if (adViewTracker == null || (b3 = adViewTracker.b()) == null) {
                return;
            }
            t tVar = MaxNativeAdLoaderImpl.this.logger;
            if (t.a()) {
                MaxNativeAdLoaderImpl maxNativeAdLoaderImpl = MaxNativeAdLoaderImpl.this;
                maxNativeAdLoaderImpl.logger.a(maxNativeAdLoaderImpl.tag, "Destroying previous ad");
            }
            MaxNativeAdLoaderImpl.this.destroy(b3);
        }
    }

    public MaxNativeAdLoaderImpl(String str, com.applovin.impl.sdk.k kVar) {
        super(str, MaxAdFormat.NATIVE, "MaxNativeAdLoader", kVar);
        this.a = new c(this, null);
        this.f6059d = d.b.PUBLISHER_INITIATED;
        this.f6060e = new Object();
        this.f6062g = new HashMap();
        this.f6063h = new HashSet();
        kVar.h().a(this);
        if (t.a()) {
            this.logger.a(this.tag, "Created new MaxNativeAdLoader (" + this + ")");
        }
    }

    @Override // com.applovin.impl.mediation.ads.a
    public void destroy() {
        this.f6061f = null;
        this.sdk.h().b(this);
        synchronized (this.f6060e) {
            this.f6062g.clear();
            this.f6063h.clear();
        }
        super.destroy();
    }

    public String getPlacement() {
        return this.f6057b;
    }

    public void handleNativeAdViewRendered(MaxAd maxAd) {
        MaxNativeAd nativeAd = ((ee) maxAd).getNativeAd();
        if (nativeAd == null) {
            if (t.a()) {
                this.logger.b(this.tag, "Failed to handle native ad rendered. Could not retrieve MaxNativeAd. The ad may have already been destroyed.");
                return;
            }
            return;
        }
        com.applovin.impl.mediation.ads.b adViewTracker = nativeAd.getAdViewTracker();
        if (adViewTracker == null) {
            if (t.a()) {
                this.logger.b(this.tag, "Failed to handle native ad rendered. Could not retrieve tracker. Ad might not have been registered via MaxNativeAdLoader.a(...).");
                return;
            }
            return;
        }
        adViewTracker.c();
    }

    public void loadAd(@Nullable MaxNativeAdView maxNativeAdView) {
        String str;
        if (t.a()) {
            this.logger.a(this.tag, "Loading native ad for '" + this.adUnitId + "' into '" + maxNativeAdView + "' and notifying " + this.a + "...");
        }
        Map<String, Object> map = this.extraParameters;
        if (maxNativeAdView != null) {
            str = "custom_ad_view";
        } else {
            str = "no_ad_view";
        }
        map.put("integration_type", str);
        String lowerCase = UUID.randomUUID().toString().toLowerCase(Locale.US);
        a(lowerCase, maxNativeAdView);
        this.sdk.S().loadAd(this.adUnitId, lowerCase, MaxAdFormat.NATIVE, this.f6059d, this.localExtraParameters, this.extraParameters, com.applovin.impl.sdk.k.k(), this.a);
    }

    @Override // com.applovin.impl.sdk.a.InterfaceC0033a
    public void onAdExpired(h8 h8Var) {
        if (t.a()) {
            this.logger.a(this.tag, "Ad expired for ad unit id " + getAdUnitId());
        }
        if (t.a()) {
            this.logger.a(this.tag, "MaxNativeAdListener.onNativeAdExpired(nativeAd=" + h8Var + "), listener=" + this.f6061f);
        }
        bc.b(this.f6061f, (MaxAd) h8Var, true);
    }

    @Override // com.applovin.impl.v.b
    public void onCreativeIdGenerated(String str, String str2) {
        ee eeVar;
        Iterator it = this.f6063h.iterator();
        while (true) {
            if (it.hasNext()) {
                eeVar = (ee) it.next();
                if (eeVar.Q().equalsIgnoreCase(str)) {
                    break;
                }
            } else {
                eeVar = null;
                break;
            }
        }
        if (eeVar != null) {
            eeVar.h(str2);
            bc.b(this.adReviewListener, str2, eeVar);
            synchronized (this.f6060e) {
                this.f6063h.remove(eeVar);
            }
        }
    }

    public void registerClickableViews(List<View> list, ViewGroup viewGroup, MaxAd maxAd) {
        ee eeVar = (ee) maxAd;
        MaxNativeAd nativeAd = eeVar.getNativeAd();
        if (nativeAd == null) {
            if (t.a()) {
                this.logger.b(this.tag, "Failed to register native ad. Could not retrieve MaxNativeAd. The ad may have already been destroyed.");
                return;
            }
            return;
        }
        eeVar.a(viewGroup);
        this.sdk.v().d(eeVar);
        a((be) eeVar);
        nativeAd.setClickableViews(list);
        nativeAd.setAdViewTracker(new com.applovin.impl.mediation.ads.b(eeVar, viewGroup, this.a, this.sdk));
        a aVar = new a(nativeAd, list, viewGroup);
        if (nativeAd.shouldPrepareViewForInteractionOnMainThread()) {
            AppLovinSdkUtils.runOnUiThread(aVar);
        } else {
            this.sdk.l0().a((xl) new kn(this.sdk, "renderMaxNativeAd", aVar), sm.b.MEDIATION);
        }
    }

    public boolean render(MaxNativeAdView maxNativeAdView, MaxAd maxAd) {
        if (!(maxAd instanceof ee)) {
            t.h(this.tag, "Failed to render native ad. `ad` needs to be of type `MediatedNativeAd` to render.");
            return false;
        }
        if (maxNativeAdView == null) {
            t.h(this.tag, "Failed to render native ad. `adView` to render cannot be null.");
            return false;
        }
        ee eeVar = (ee) maxAd;
        MaxNativeAd nativeAd = eeVar.getNativeAd();
        if (nativeAd == null) {
            if (t.a()) {
                this.logger.b(this.tag, "Failed to render native ad. Could not retrieve MaxNativeAd. The ad may have already been destroyed.");
            }
            return false;
        }
        if (nativeAd.isExpired() && !((Boolean) this.sdk.a(qe.f7201m7)).booleanValue()) {
            t.h(this.tag, "Cancelled rendering for expired native ad. Check if an ad is expired before displaying using `MaxAd.getNativeAd().isExpired()`");
            return false;
        }
        a(maxNativeAdView, eeVar, nativeAd);
        a(maxNativeAdView);
        return true;
    }

    public void setCustomData(String str) {
        zp.b(str, this.tag);
        this.f6058c = str;
    }

    @Override // com.applovin.impl.mediation.ads.a
    public void setLocalExtraParameter(String str, Object obj) {
        super.setLocalExtraParameter(str, obj);
        if (KEY_EXTRA_PARAMETER_AD_REQUEST_TYPE.equalsIgnoreCase(str) && (obj instanceof d.b)) {
            this.f6059d = (d.b) obj;
        }
    }

    public void setNativeAdListener(MaxNativeAdListener maxNativeAdListener) {
        if (t.a()) {
            this.logger.a(this.tag, "Setting native ad listener: " + maxNativeAdListener);
        }
        this.f6061f = maxNativeAdListener;
    }

    public void setPlacement(String str) {
        this.f6057b = str;
    }

    @NonNull
    public String toString() {
        return "MaxNativeAdLoader{adUnitId='" + this.adUnitId + "', nativeAdListener=" + this.f6061f + ", revenueListener=" + this.revenueListener + AbstractJsonLexerKt.END_OBJ;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(MaxNativeAdView maxNativeAdView, ee eeVar, MaxNativeAd maxNativeAd) {
        eeVar.a(maxNativeAdView);
        a((be) eeVar);
        b bVar = new b(maxNativeAdView, eeVar, maxNativeAd);
        if (maxNativeAd.shouldPrepareViewForInteractionOnMainThread()) {
            AppLovinSdkUtils.runOnUiThread(bVar);
        } else {
            this.sdk.l0().a((xl) new kn(this.sdk, "renderMaxNativeAd", bVar), sm.b.MEDIATION);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(ee eeVar) {
        if (eeVar.n0().get()) {
            return;
        }
        this.sdk.f().a(eeVar, this);
    }

    public void destroy(MaxAd maxAd) {
        com.applovin.impl.mediation.ads.b adViewTracker;
        if (maxAd instanceof ee) {
            ee eeVar = (ee) maxAd;
            if (eeVar.r0()) {
                if (t.a()) {
                    this.logger.a(this.tag, "Native ad (" + eeVar + ") has already been destroyed");
                    return;
                }
                return;
            }
            synchronized (this.f6060e) {
                this.f6063h.remove(eeVar);
            }
            MaxNativeAdView l02 = eeVar.l0();
            if (l02 != null && (adViewTracker = l02.getAdViewTracker()) != null && maxAd.equals(adViewTracker.b())) {
                l02.recycle();
            }
            MaxNativeAd nativeAd = eeVar.getNativeAd();
            if (nativeAd != null && nativeAd.getAdViewTracker() != null) {
                nativeAd.getAdViewTracker().a();
            }
            this.sdk.f().a(eeVar);
            this.sdk.S().destroyAd(eeVar);
            this.sdk.M().c(this.adUnitId, eeVar.L());
            return;
        }
        if (t.a()) {
            this.logger.a(this.tag, "Destroy failed on non-native ad(" + maxAd + ")");
        }
    }

    private void a(String str, MaxNativeAdView maxNativeAdView) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        synchronized (this.f6060e) {
            this.f6062g.put(str, maxNativeAdView);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public MaxNativeAdView a(String str) {
        MaxNativeAdView maxNativeAdView;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        synchronized (this.f6060e) {
            maxNativeAdView = (MaxNativeAdView) this.f6062g.remove(str);
        }
        return maxNativeAdView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(MaxNativeAdView maxNativeAdView) {
        com.applovin.impl.mediation.ads.b adViewTracker = maxNativeAdView.getAdViewTracker();
        if (adViewTracker != null) {
            if (x3.e()) {
                if (maxNativeAdView.isAttachedToWindow()) {
                    adViewTracker.c();
                }
            } else if (maxNativeAdView.getParent() != null) {
                adViewTracker.c();
            }
        }
    }
}
