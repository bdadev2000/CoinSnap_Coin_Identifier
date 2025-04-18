package com.applovin.impl.mediation.ads;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.applovin.impl.gc;
import com.applovin.impl.ge;
import com.applovin.impl.j8;
import com.applovin.impl.je;
import com.applovin.impl.jn;
import com.applovin.impl.mediation.MaxErrorImpl;
import com.applovin.impl.mediation.ads.a;
import com.applovin.impl.mediation.d;
import com.applovin.impl.sdk.a;
import com.applovin.impl.sdk.n;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.tm;
import com.applovin.impl.v;
import com.applovin.impl.ve;
import com.applovin.impl.yl;
import com.applovin.impl.yp;
import com.applovin.impl.z3;
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

/* loaded from: classes2.dex */
public class MaxNativeAdLoaderImpl extends com.applovin.impl.mediation.ads.a implements a.InterfaceC0096a, v.b {
    public static final String KEY_EXTRA_PARAMETER_AD_REQUEST_TYPE = "ad_request_type";

    /* renamed from: a */
    private final c f25352a;

    /* renamed from: b */
    private String f25353b;

    /* renamed from: c */
    private String f25354c;
    private d.b d;
    private final Object e;

    /* renamed from: f */
    private MaxNativeAdListener f25355f;

    /* renamed from: g */
    private final Map f25356g;

    /* renamed from: h */
    private final Set f25357h;

    /* loaded from: classes2.dex */
    public class a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ MaxNativeAd f25358a;

        /* renamed from: b */
        final /* synthetic */ List f25359b;

        /* renamed from: c */
        final /* synthetic */ ViewGroup f25360c;

        public a(MaxNativeAd maxNativeAd, List list, ViewGroup viewGroup) {
            this.f25358a = maxNativeAd;
            this.f25359b = list;
            this.f25360c = viewGroup;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f25358a.prepareForInteraction(this.f25359b, this.f25360c)) {
                return;
            }
            n.h(MaxNativeAdLoaderImpl.this.tag, "Failed to prepare native ad for interaction...");
        }
    }

    /* loaded from: classes2.dex */
    public class b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ MaxNativeAdView f25361a;

        /* renamed from: b */
        final /* synthetic */ je f25362b;

        /* renamed from: c */
        final /* synthetic */ MaxNativeAd f25363c;

        public b(MaxNativeAdView maxNativeAdView, je jeVar, MaxNativeAd maxNativeAd) {
            this.f25361a = maxNativeAdView;
            this.f25362b = jeVar;
            this.f25363c = maxNativeAd;
        }

        @Override // java.lang.Runnable
        public void run() {
            n nVar = MaxNativeAdLoaderImpl.this.logger;
            if (n.a()) {
                MaxNativeAdLoaderImpl maxNativeAdLoaderImpl = MaxNativeAdLoaderImpl.this;
                maxNativeAdLoaderImpl.logger.a(maxNativeAdLoaderImpl.tag, "Rendering native ad view: " + this.f25361a);
            }
            this.f25361a.render(this.f25362b, MaxNativeAdLoaderImpl.this.f25352a, MaxNativeAdLoaderImpl.this.sdk);
            this.f25363c.setNativeAdView(this.f25361a);
            if (this.f25363c.prepareForInteraction(this.f25361a.getClickableViews(), this.f25361a)) {
                return;
            }
            this.f25363c.prepareViewForInteraction(this.f25361a);
        }
    }

    /* loaded from: classes2.dex */
    public class c implements a.InterfaceC0085a {
        private c() {
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdClicked(MaxAd maxAd) {
            n nVar = MaxNativeAdLoaderImpl.this.logger;
            if (n.a()) {
                MaxNativeAdLoaderImpl maxNativeAdLoaderImpl = MaxNativeAdLoaderImpl.this;
                maxNativeAdLoaderImpl.logger.a(maxNativeAdLoaderImpl.tag, "MaxNativeAdListener.onNativeAdClicked(nativeAd=" + maxAd + "), listener=" + MaxNativeAdLoaderImpl.this.f25355f);
            }
            gc.a(MaxNativeAdLoaderImpl.this.f25355f, maxAd, true);
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
            n nVar = MaxNativeAdLoaderImpl.this.logger;
            if (n.a()) {
                MaxNativeAdLoaderImpl maxNativeAdLoaderImpl = MaxNativeAdLoaderImpl.this;
                maxNativeAdLoaderImpl.logger.a(maxNativeAdLoaderImpl.tag, "MaxNativeAdListener.onNativeAdLoadFailed(adUnitId=" + str + ", error=" + maxError + "), listener=" + MaxNativeAdLoaderImpl.this.f25355f);
            }
            gc.a(MaxNativeAdLoaderImpl.this.f25355f, str, maxError, true);
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdLoaded(MaxAd maxAd) {
            AppLovinSdkUtils.runOnUiThread(new l(1, this, maxAd));
        }

        @Override // com.applovin.mediation.MaxAdRequestListener
        public void onAdRequestStarted(String str) {
        }

        @Override // com.applovin.mediation.MaxAdRevenueListener
        public void onAdRevenuePaid(MaxAd maxAd) {
            n nVar = MaxNativeAdLoaderImpl.this.logger;
            if (n.a()) {
                MaxNativeAdLoaderImpl maxNativeAdLoaderImpl = MaxNativeAdLoaderImpl.this;
                maxNativeAdLoaderImpl.logger.a(maxNativeAdLoaderImpl.tag, "MaxAdRevenueListener.onAdRevenuePaid(ad=" + maxAd + "), listener=" + MaxNativeAdLoaderImpl.this.revenueListener);
            }
            gc.a(MaxNativeAdLoaderImpl.this.revenueListener, maxAd, true);
        }

        public /* synthetic */ c(MaxNativeAdLoaderImpl maxNativeAdLoaderImpl, a aVar) {
            this();
        }

        public /* synthetic */ void a(MaxAd maxAd) {
            n nVar = MaxNativeAdLoaderImpl.this.logger;
            if (n.a()) {
                MaxNativeAdLoaderImpl maxNativeAdLoaderImpl = MaxNativeAdLoaderImpl.this;
                maxNativeAdLoaderImpl.logger.a(maxNativeAdLoaderImpl.tag, "Native ad loaded");
            }
            je jeVar = (je) maxAd;
            jeVar.g(MaxNativeAdLoaderImpl.this.f25353b);
            jeVar.f(MaxNativeAdLoaderImpl.this.f25354c);
            MaxNativeAdLoaderImpl.this.sdk.w().d(jeVar);
            synchronized (MaxNativeAdLoaderImpl.this.e) {
                MaxNativeAdLoaderImpl.this.f25357h.add(jeVar);
            }
            MaxNativeAdView a2 = MaxNativeAdLoaderImpl.this.a(jeVar.M());
            if (a2 == null) {
                n nVar2 = MaxNativeAdLoaderImpl.this.logger;
                if (n.a()) {
                    MaxNativeAdLoaderImpl maxNativeAdLoaderImpl2 = MaxNativeAdLoaderImpl.this;
                    maxNativeAdLoaderImpl2.logger.a(maxNativeAdLoaderImpl2.tag, "No custom view provided, checking template");
                }
                String t02 = jeVar.t0();
                if (StringUtils.isValidString(t02)) {
                    n nVar3 = MaxNativeAdLoaderImpl.this.logger;
                    if (n.a()) {
                        MaxNativeAdLoaderImpl maxNativeAdLoaderImpl3 = MaxNativeAdLoaderImpl.this;
                        maxNativeAdLoaderImpl3.logger.a(maxNativeAdLoaderImpl3.tag, "Using template: " + t02 + "...");
                    }
                    a2 = new MaxNativeAdView(t02, com.applovin.impl.sdk.j.l());
                }
            }
            if (a2 == null) {
                n nVar4 = MaxNativeAdLoaderImpl.this.logger;
                if (n.a()) {
                    MaxNativeAdLoaderImpl maxNativeAdLoaderImpl4 = MaxNativeAdLoaderImpl.this;
                    maxNativeAdLoaderImpl4.logger.a(maxNativeAdLoaderImpl4.tag, "No native ad view to render. Returning the native ad to be rendered later.");
                }
                n nVar5 = MaxNativeAdLoaderImpl.this.logger;
                if (n.a()) {
                    MaxNativeAdLoaderImpl maxNativeAdLoaderImpl5 = MaxNativeAdLoaderImpl.this;
                    maxNativeAdLoaderImpl5.logger.a(maxNativeAdLoaderImpl5.tag, "MaxNativeAdListener.onNativeAdLoaded(nativeAdView=null, nativeAd=" + maxAd + "), listener=" + MaxNativeAdLoaderImpl.this.f25355f);
                }
                gc.a(MaxNativeAdLoaderImpl.this.f25355f, (MaxNativeAdView) null, maxAd, true);
                MaxNativeAdLoaderImpl.this.a(jeVar);
                return;
            }
            a(a2);
            MaxNativeAdLoaderImpl.this.a(a2, jeVar, jeVar.getNativeAd());
            n nVar6 = MaxNativeAdLoaderImpl.this.logger;
            if (n.a()) {
                MaxNativeAdLoaderImpl maxNativeAdLoaderImpl6 = MaxNativeAdLoaderImpl.this;
                maxNativeAdLoaderImpl6.logger.a(maxNativeAdLoaderImpl6.tag, "MaxNativeAdListener.onNativeAdLoaded(nativeAdView=" + a2 + ", nativeAd=" + maxAd + "), listener=" + MaxNativeAdLoaderImpl.this.f25355f);
            }
            gc.a(MaxNativeAdLoaderImpl.this.f25355f, a2, maxAd, true);
            MaxNativeAdLoaderImpl.this.a(jeVar);
            MaxNativeAdLoaderImpl.this.a(a2);
        }

        private void a(MaxNativeAdView maxNativeAdView) {
            je b2;
            com.applovin.impl.mediation.ads.b adViewTracker = maxNativeAdView.getAdViewTracker();
            if (adViewTracker == null || (b2 = adViewTracker.b()) == null) {
                return;
            }
            n nVar = MaxNativeAdLoaderImpl.this.logger;
            if (n.a()) {
                MaxNativeAdLoaderImpl maxNativeAdLoaderImpl = MaxNativeAdLoaderImpl.this;
                maxNativeAdLoaderImpl.logger.a(maxNativeAdLoaderImpl.tag, "Destroying previous ad");
            }
            MaxNativeAdLoaderImpl.this.destroy(b2);
        }
    }

    public MaxNativeAdLoaderImpl(String str, com.applovin.impl.sdk.j jVar) {
        super(str, MaxAdFormat.NATIVE, "MaxNativeAdLoader", jVar);
        this.f25352a = new c(this, null);
        this.d = d.b.PUBLISHER_INITIATED;
        this.e = new Object();
        this.f25356g = new HashMap();
        this.f25357h = new HashSet();
        jVar.h().a(this);
        if (n.a()) {
            this.logger.a(this.tag, "Created new MaxNativeAdLoader (" + this + ")");
        }
    }

    @Override // com.applovin.impl.mediation.ads.a
    public void destroy() {
        this.f25355f = null;
        this.sdk.h().b(this);
        synchronized (this.e) {
            this.f25356g.clear();
            this.f25357h.clear();
        }
        super.destroy();
    }

    public String getPlacement() {
        return this.f25353b;
    }

    public void handleNativeAdViewRendered(MaxAd maxAd) {
        MaxNativeAd nativeAd = ((je) maxAd).getNativeAd();
        if (nativeAd == null) {
            if (n.a()) {
                this.logger.b(this.tag, "Failed to handle native ad rendered. Could not retrieve MaxNativeAd. The ad may have already been destroyed.");
                return;
            }
            return;
        }
        com.applovin.impl.mediation.ads.b adViewTracker = nativeAd.getAdViewTracker();
        if (adViewTracker != null) {
            adViewTracker.c();
        } else if (n.a()) {
            this.logger.b(this.tag, "Failed to handle native ad rendered. Could not retrieve tracker. Ad might not have been registered via MaxNativeAdLoader.a(...).");
        }
    }

    public void loadAd(@Nullable MaxNativeAdView maxNativeAdView) {
        if (n.a()) {
            this.logger.a(this.tag, "Loading native ad for '" + this.adUnitId + "' into '" + maxNativeAdView + "' and notifying " + this.f25352a + "...");
        }
        this.extraParameters.put("integration_type", maxNativeAdView != null ? "custom_ad_view" : "no_ad_view");
        String lowerCase = UUID.randomUUID().toString().toLowerCase(Locale.US);
        a(lowerCase, maxNativeAdView);
        this.sdk.Q().loadAd(this.adUnitId, lowerCase, MaxAdFormat.NATIVE, this.d, this.localExtraParameters, this.extraParameters, com.applovin.impl.sdk.j.l(), this.f25352a);
    }

    @Override // com.applovin.impl.sdk.a.InterfaceC0096a
    public void onAdExpired(j8 j8Var) {
        if (n.a()) {
            this.logger.a(this.tag, "Ad expired for ad unit id " + getAdUnitId());
        }
        if (n.a()) {
            this.logger.a(this.tag, "MaxNativeAdListener.onNativeAdExpired(nativeAd=" + j8Var + "), listener=" + this.f25355f);
        }
        gc.b(this.f25355f, (MaxAd) j8Var, true);
    }

    @Override // com.applovin.impl.v.b
    public void onCreativeIdGenerated(String str, String str2) {
        je jeVar;
        Iterator it = this.f25357h.iterator();
        while (true) {
            if (!it.hasNext()) {
                jeVar = null;
                break;
            } else {
                jeVar = (je) it.next();
                if (jeVar.S().equalsIgnoreCase(str)) {
                    break;
                }
            }
        }
        if (jeVar != null) {
            jeVar.h(str2);
            gc.b(this.adReviewListener, str2, jeVar);
            synchronized (this.e) {
                this.f25357h.remove(jeVar);
            }
        }
    }

    public void registerClickableViews(List<View> list, ViewGroup viewGroup, MaxAd maxAd) {
        je jeVar = (je) maxAd;
        MaxNativeAd nativeAd = jeVar.getNativeAd();
        if (nativeAd == null) {
            if (n.a()) {
                this.logger.b(this.tag, "Failed to register native ad. Could not retrieve MaxNativeAd. The ad may have already been destroyed.");
                return;
            }
            return;
        }
        jeVar.a(viewGroup);
        this.sdk.w().d(jeVar);
        a((ge) jeVar);
        nativeAd.setClickableViews(list);
        nativeAd.setAdViewTracker(new com.applovin.impl.mediation.ads.b(jeVar, viewGroup, this.f25352a, this.sdk));
        a aVar = new a(nativeAd, list, viewGroup);
        if (nativeAd.shouldPrepareViewForInteractionOnMainThread()) {
            AppLovinSdkUtils.runOnUiThread(aVar);
        } else {
            this.sdk.j0().a((yl) new jn(this.sdk, "renderMaxNativeAd", aVar), tm.b.MEDIATION);
        }
    }

    public boolean render(MaxNativeAdView maxNativeAdView, MaxAd maxAd) {
        if (!(maxAd instanceof je)) {
            n.h(this.tag, "Failed to render native ad. `ad` needs to be of type `MediatedNativeAd` to render.");
            return false;
        }
        if (maxNativeAdView == null) {
            n.h(this.tag, "Failed to render native ad. `adView` to render cannot be null.");
            return false;
        }
        je jeVar = (je) maxAd;
        MaxNativeAd nativeAd = jeVar.getNativeAd();
        if (nativeAd == null) {
            if (n.a()) {
                this.logger.b(this.tag, "Failed to render native ad. Could not retrieve MaxNativeAd. The ad may have already been destroyed.");
            }
            return false;
        }
        if (nativeAd.isExpired() && !((Boolean) this.sdk.a(ve.u7)).booleanValue()) {
            n.h(this.tag, "Cancelled rendering for expired native ad. Check if an ad is expired before displaying using `MaxAd.getNativeAd().isExpired()`");
            return false;
        }
        a(maxNativeAdView, jeVar, nativeAd);
        a(maxNativeAdView);
        return true;
    }

    public void setCustomData(String str) {
        yp.b(str, this.tag);
        this.f25354c = str;
    }

    @Override // com.applovin.impl.mediation.ads.a
    public void setLocalExtraParameter(String str, Object obj) {
        super.setLocalExtraParameter(str, obj);
        if (KEY_EXTRA_PARAMETER_AD_REQUEST_TYPE.equalsIgnoreCase(str) && (obj instanceof d.b)) {
            this.d = (d.b) obj;
        }
    }

    public void setNativeAdListener(MaxNativeAdListener maxNativeAdListener) {
        if (n.a()) {
            this.logger.a(this.tag, "Setting native ad listener: " + maxNativeAdListener);
        }
        this.f25355f = maxNativeAdListener;
    }

    public void setPlacement(String str) {
        this.f25353b = str;
    }

    @NonNull
    public String toString() {
        return "MaxNativeAdLoader{adUnitId='" + this.adUnitId + "', nativeAdListener=" + this.f25355f + ", revenueListener=" + this.revenueListener + '}';
    }

    public void a(MaxNativeAdView maxNativeAdView, je jeVar, MaxNativeAd maxNativeAd) {
        jeVar.a(maxNativeAdView);
        a((ge) jeVar);
        b bVar = new b(maxNativeAdView, jeVar, maxNativeAd);
        if (maxNativeAd.shouldPrepareViewForInteractionOnMainThread()) {
            AppLovinSdkUtils.runOnUiThread(bVar);
        } else {
            this.sdk.j0().a((yl) new jn(this.sdk, "renderMaxNativeAd", bVar), tm.b.MEDIATION);
        }
    }

    public void destroy(MaxAd maxAd) {
        com.applovin.impl.mediation.ads.b adViewTracker;
        if (maxAd instanceof je) {
            je jeVar = (je) maxAd;
            if (jeVar.w0()) {
                if (n.a()) {
                    this.logger.a(this.tag, "Native ad (" + jeVar + ") has already been destroyed");
                    return;
                }
                return;
            }
            synchronized (this.e) {
                this.f25357h.remove(jeVar);
            }
            MaxNativeAdView q02 = jeVar.q0();
            if (q02 != null && (adViewTracker = q02.getAdViewTracker()) != null && maxAd.equals(adViewTracker.b())) {
                q02.recycle();
            }
            MaxNativeAd nativeAd = jeVar.getNativeAd();
            if (nativeAd != null && nativeAd.getAdViewTracker() != null) {
                nativeAd.getAdViewTracker().a();
            }
            this.sdk.f().a(jeVar);
            this.sdk.Q().destroyAd(jeVar);
            this.sdk.K().c(this.adUnitId, jeVar.M());
            return;
        }
        if (n.a()) {
            this.logger.a(this.tag, "Destroy failed on non-native ad(" + maxAd + ")");
        }
    }

    public void a(je jeVar) {
        if (jeVar.s0().get()) {
            return;
        }
        this.sdk.f().a(jeVar, this);
    }

    private void a(String str, MaxNativeAdView maxNativeAdView) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        synchronized (this.e) {
            this.f25356g.put(str, maxNativeAdView);
        }
    }

    public MaxNativeAdView a(String str) {
        MaxNativeAdView maxNativeAdView;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        synchronized (this.e) {
            maxNativeAdView = (MaxNativeAdView) this.f25356g.remove(str);
        }
        return maxNativeAdView;
    }

    public void a(MaxNativeAdView maxNativeAdView) {
        com.applovin.impl.mediation.ads.b adViewTracker = maxNativeAdView.getAdViewTracker();
        if (adViewTracker != null) {
            if (z3.e()) {
                if (maxNativeAdView.isAttachedToWindow()) {
                    adViewTracker.c();
                }
            } else if (maxNativeAdView.getParent() != null) {
                adViewTracker.c();
            }
        }
    }
}
