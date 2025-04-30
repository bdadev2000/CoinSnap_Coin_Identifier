package com.applovin.impl.mediation.ads;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.applovin.impl.C0765v;
import com.applovin.impl.L;
import com.applovin.impl.bc;
import com.applovin.impl.be;
import com.applovin.impl.ee;
import com.applovin.impl.h8;
import com.applovin.impl.kn;
import com.applovin.impl.mediation.MaxErrorImpl;
import com.applovin.impl.mediation.ads.a;
import com.applovin.impl.mediation.d;
import com.applovin.impl.qe;
import com.applovin.impl.sdk.C0749a;
import com.applovin.impl.sdk.t;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sm;
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

/* loaded from: classes.dex */
public class MaxNativeAdLoaderImpl extends com.applovin.impl.mediation.ads.a implements C0749a.InterfaceC0033a, C0765v.b {
    public static final String KEY_EXTRA_PARAMETER_AD_REQUEST_TYPE = "ad_request_type";

    /* renamed from: a */
    private final c f9012a;
    private String b;

    /* renamed from: c */
    private String f9013c;

    /* renamed from: d */
    private d.b f9014d;

    /* renamed from: e */
    private final Object f9015e;

    /* renamed from: f */
    private MaxNativeAdListener f9016f;

    /* renamed from: g */
    private final Map f9017g;

    /* renamed from: h */
    private final Set f9018h;

    /* loaded from: classes.dex */
    public class a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ MaxNativeAd f9019a;
        final /* synthetic */ List b;

        /* renamed from: c */
        final /* synthetic */ ViewGroup f9020c;

        public a(MaxNativeAd maxNativeAd, List list, ViewGroup viewGroup) {
            this.f9019a = maxNativeAd;
            this.b = list;
            this.f9020c = viewGroup;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (!this.f9019a.prepareForInteraction(this.b, this.f9020c)) {
                t.h(MaxNativeAdLoaderImpl.this.tag, "Failed to prepare native ad for interaction...");
            }
        }
    }

    /* loaded from: classes.dex */
    public class b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ MaxNativeAdView f9022a;
        final /* synthetic */ ee b;

        /* renamed from: c */
        final /* synthetic */ MaxNativeAd f9023c;

        public b(MaxNativeAdView maxNativeAdView, ee eeVar, MaxNativeAd maxNativeAd) {
            this.f9022a = maxNativeAdView;
            this.b = eeVar;
            this.f9023c = maxNativeAd;
        }

        @Override // java.lang.Runnable
        public void run() {
            t tVar = MaxNativeAdLoaderImpl.this.logger;
            if (t.a()) {
                MaxNativeAdLoaderImpl maxNativeAdLoaderImpl = MaxNativeAdLoaderImpl.this;
                maxNativeAdLoaderImpl.logger.a(maxNativeAdLoaderImpl.tag, "Rendering native ad view: " + this.f9022a);
            }
            this.f9022a.render(this.b, MaxNativeAdLoaderImpl.this.f9012a, MaxNativeAdLoaderImpl.this.sdk);
            this.f9023c.setNativeAdView(this.f9022a);
            if (!this.f9023c.prepareForInteraction(this.f9022a.getClickableViews(), this.f9022a)) {
                this.f9023c.prepareViewForInteraction(this.f9022a);
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
                maxNativeAdLoaderImpl.logger.a(maxNativeAdLoaderImpl.tag, "MaxNativeAdListener.onNativeAdClicked(nativeAd=" + maxAd + "), listener=" + MaxNativeAdLoaderImpl.this.f9016f);
            }
            bc.a(MaxNativeAdLoaderImpl.this.f9016f, maxAd, true);
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
                maxNativeAdLoaderImpl.logger.a(maxNativeAdLoaderImpl.tag, "MaxNativeAdListener.onNativeAdLoadFailed(adUnitId=" + str + ", error=" + maxError + "), listener=" + MaxNativeAdLoaderImpl.this.f9016f);
            }
            bc.a(MaxNativeAdLoaderImpl.this.f9016f, str, maxError, true);
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdLoaded(MaxAd maxAd) {
            AppLovinSdkUtils.runOnUiThread(new d(this, maxAd, 2));
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

        public /* synthetic */ void a(MaxAd maxAd) {
            t tVar = MaxNativeAdLoaderImpl.this.logger;
            if (t.a()) {
                MaxNativeAdLoaderImpl maxNativeAdLoaderImpl = MaxNativeAdLoaderImpl.this;
                maxNativeAdLoaderImpl.logger.a(maxNativeAdLoaderImpl.tag, "Native ad loaded");
            }
            ee eeVar = (ee) maxAd;
            eeVar.g(MaxNativeAdLoaderImpl.this.b);
            eeVar.f(MaxNativeAdLoaderImpl.this.f9013c);
            MaxNativeAdLoaderImpl.this.sdk.v().d(eeVar);
            synchronized (MaxNativeAdLoaderImpl.this.f9015e) {
                MaxNativeAdLoaderImpl.this.f9018h.add(eeVar);
            }
            MaxNativeAdView a6 = MaxNativeAdLoaderImpl.this.a(eeVar.L());
            if (a6 == null) {
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
                        L.v("Using template: ", o02, "...", maxNativeAdLoaderImpl3.logger, maxNativeAdLoaderImpl3.tag);
                    }
                    a6 = new MaxNativeAdView(o02, com.applovin.impl.sdk.k.k());
                }
            }
            if (a6 == null) {
                t tVar4 = MaxNativeAdLoaderImpl.this.logger;
                if (t.a()) {
                    MaxNativeAdLoaderImpl maxNativeAdLoaderImpl4 = MaxNativeAdLoaderImpl.this;
                    maxNativeAdLoaderImpl4.logger.a(maxNativeAdLoaderImpl4.tag, "No native ad view to render. Returning the native ad to be rendered later.");
                }
                t tVar5 = MaxNativeAdLoaderImpl.this.logger;
                if (t.a()) {
                    MaxNativeAdLoaderImpl maxNativeAdLoaderImpl5 = MaxNativeAdLoaderImpl.this;
                    maxNativeAdLoaderImpl5.logger.a(maxNativeAdLoaderImpl5.tag, "MaxNativeAdListener.onNativeAdLoaded(nativeAdView=null, nativeAd=" + maxAd + "), listener=" + MaxNativeAdLoaderImpl.this.f9016f);
                }
                bc.a(MaxNativeAdLoaderImpl.this.f9016f, (MaxNativeAdView) null, maxAd, true);
                MaxNativeAdLoaderImpl.this.a(eeVar);
                return;
            }
            a(a6);
            MaxNativeAdLoaderImpl.this.a(a6, eeVar, eeVar.getNativeAd());
            t tVar6 = MaxNativeAdLoaderImpl.this.logger;
            if (t.a()) {
                MaxNativeAdLoaderImpl maxNativeAdLoaderImpl6 = MaxNativeAdLoaderImpl.this;
                maxNativeAdLoaderImpl6.logger.a(maxNativeAdLoaderImpl6.tag, "MaxNativeAdListener.onNativeAdLoaded(nativeAdView=" + a6 + ", nativeAd=" + maxAd + "), listener=" + MaxNativeAdLoaderImpl.this.f9016f);
            }
            bc.a(MaxNativeAdLoaderImpl.this.f9016f, a6, maxAd, true);
            MaxNativeAdLoaderImpl.this.a(eeVar);
            MaxNativeAdLoaderImpl.this.a(a6);
        }

        private void a(MaxNativeAdView maxNativeAdView) {
            ee b;
            com.applovin.impl.mediation.ads.b adViewTracker = maxNativeAdView.getAdViewTracker();
            if (adViewTracker == null || (b = adViewTracker.b()) == null) {
                return;
            }
            t tVar = MaxNativeAdLoaderImpl.this.logger;
            if (t.a()) {
                MaxNativeAdLoaderImpl maxNativeAdLoaderImpl = MaxNativeAdLoaderImpl.this;
                maxNativeAdLoaderImpl.logger.a(maxNativeAdLoaderImpl.tag, "Destroying previous ad");
            }
            MaxNativeAdLoaderImpl.this.destroy(b);
        }
    }

    public MaxNativeAdLoaderImpl(String str, com.applovin.impl.sdk.k kVar) {
        super(str, MaxAdFormat.NATIVE, "MaxNativeAdLoader", kVar);
        this.f9012a = new c(this, null);
        this.f9014d = d.b.PUBLISHER_INITIATED;
        this.f9015e = new Object();
        this.f9017g = new HashMap();
        this.f9018h = new HashSet();
        kVar.h().a(this);
        if (t.a()) {
            this.logger.a(this.tag, "Created new MaxNativeAdLoader (" + this + ")");
        }
    }

    @Override // com.applovin.impl.mediation.ads.a
    public void destroy() {
        this.f9016f = null;
        this.sdk.h().b(this);
        synchronized (this.f9015e) {
            this.f9017g.clear();
            this.f9018h.clear();
        }
        super.destroy();
    }

    public String getPlacement() {
        return this.b;
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
            this.logger.a(this.tag, "Loading native ad for '" + this.adUnitId + "' into '" + maxNativeAdView + "' and notifying " + this.f9012a + "...");
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
        this.sdk.S().loadAd(this.adUnitId, lowerCase, MaxAdFormat.NATIVE, this.f9014d, this.localExtraParameters, this.extraParameters, com.applovin.impl.sdk.k.k(), this.f9012a);
    }

    @Override // com.applovin.impl.sdk.C0749a.InterfaceC0033a
    public void onAdExpired(h8 h8Var) {
        if (t.a()) {
            this.logger.a(this.tag, "Ad expired for ad unit id " + getAdUnitId());
        }
        if (t.a()) {
            this.logger.a(this.tag, "MaxNativeAdListener.onNativeAdExpired(nativeAd=" + h8Var + "), listener=" + this.f9016f);
        }
        bc.b(this.f9016f, (MaxAd) h8Var, true);
    }

    @Override // com.applovin.impl.C0765v.b
    public void onCreativeIdGenerated(String str, String str2) {
        ee eeVar;
        Iterator it = this.f9018h.iterator();
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
            synchronized (this.f9015e) {
                this.f9018h.remove(eeVar);
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
        nativeAd.setAdViewTracker(new com.applovin.impl.mediation.ads.b(eeVar, viewGroup, this.f9012a, this.sdk));
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
        if (nativeAd.isExpired() && !((Boolean) this.sdk.a(qe.m7)).booleanValue()) {
            t.h(this.tag, "Cancelled rendering for expired native ad. Check if an ad is expired before displaying using `MaxAd.getNativeAd().isExpired()`");
            return false;
        }
        a(maxNativeAdView, eeVar, nativeAd);
        a(maxNativeAdView);
        return true;
    }

    public void setCustomData(String str) {
        zp.b(str, this.tag);
        this.f9013c = str;
    }

    @Override // com.applovin.impl.mediation.ads.a
    public void setLocalExtraParameter(String str, Object obj) {
        super.setLocalExtraParameter(str, obj);
        if (KEY_EXTRA_PARAMETER_AD_REQUEST_TYPE.equalsIgnoreCase(str) && (obj instanceof d.b)) {
            this.f9014d = (d.b) obj;
        }
    }

    public void setNativeAdListener(MaxNativeAdListener maxNativeAdListener) {
        if (t.a()) {
            this.logger.a(this.tag, "Setting native ad listener: " + maxNativeAdListener);
        }
        this.f9016f = maxNativeAdListener;
    }

    public void setPlacement(String str) {
        this.b = str;
    }

    @NonNull
    public String toString() {
        return "MaxNativeAdLoader{adUnitId='" + this.adUnitId + "', nativeAdListener=" + this.f9016f + ", revenueListener=" + this.revenueListener + '}';
    }

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
            synchronized (this.f9015e) {
                this.f9018h.remove(eeVar);
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
        synchronized (this.f9015e) {
            this.f9017g.put(str, maxNativeAdView);
        }
    }

    public MaxNativeAdView a(String str) {
        MaxNativeAdView maxNativeAdView;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        synchronized (this.f9015e) {
            maxNativeAdView = (MaxNativeAdView) this.f9017g.remove(str);
        }
        return maxNativeAdView;
    }

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
