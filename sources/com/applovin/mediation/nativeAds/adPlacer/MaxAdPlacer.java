package com.applovin.mediation.nativeAds.adPlacer;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.d;
import com.applovin.impl.ee;
import com.applovin.impl.sdk.k;
import com.applovin.impl.sdk.t;
import com.applovin.impl.uc;
import com.applovin.impl.zc;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxError;
import com.applovin.mediation.nativeAds.MaxNativeAdView;
import com.applovin.mediation.nativeAds.MaxNativeAdViewBinder;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinSdkUtils;
import f0.m;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import o.q;

/* loaded from: classes.dex */
public class MaxAdPlacer implements zc.a {
    private AppLovinSdkUtils.Size a;

    /* renamed from: b */
    private MaxNativeAdViewBinder f9566b;

    /* renamed from: c */
    private final uc f9567c;

    /* renamed from: d */
    private final zc f9568d;

    /* renamed from: e */
    private Listener f9569e;
    protected final t logger;
    protected final k sdk;

    /* loaded from: classes.dex */
    public interface Listener {
        void onAdClicked(MaxAd maxAd);

        void onAdLoaded(int i10);

        void onAdRemoved(int i10);

        void onAdRevenuePaid(MaxAd maxAd);
    }

    public MaxAdPlacer(MaxAdPlacerSettings maxAdPlacerSettings, Context context) {
        this(maxAdPlacerSettings, AppLovinSdk.getInstance(context), context);
    }

    public static /* synthetic */ void a(MaxAdPlacer maxAdPlacer, int i10) {
        maxAdPlacer.a(i10);
    }

    public void clearAds() {
        a(this.f9567c.b(), new d(this, 16));
    }

    public Collection<Integer> clearTrailingAds(int i10) {
        Collection<Integer> e2 = this.f9567c.e(i10);
        if (!e2.isEmpty()) {
            a(e2, new q(this, i10, e2, 3));
        }
        return e2;
    }

    public void destroy() {
        if (t.a()) {
            this.logger.a("MaxAdPlacer", "Destroying ad placer");
        }
        clearAds();
        this.f9568d.c();
    }

    public long getAdItemId(int i10) {
        if (isFilledPosition(i10)) {
            return -System.identityHashCode(this.f9567c.a(i10));
        }
        return 0L;
    }

    public AppLovinSdkUtils.Size getAdSize(int i10, int i11) {
        boolean z10;
        int i12;
        double d10;
        int i13;
        if (isFilledPosition(i10)) {
            AppLovinSdkUtils.Size size = this.a;
            if (size != AppLovinSdkUtils.Size.ZERO) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                i12 = size.getWidth();
            } else {
                i12 = 360;
            }
            int min = Math.min(i12, i11);
            ee eeVar = (ee) this.f9567c.a(i10);
            if ("small_template_1".equalsIgnoreCase(eeVar.o0())) {
                if (z10) {
                    i13 = this.a.getHeight();
                } else {
                    i13 = 120;
                }
                return new AppLovinSdkUtils.Size(min, i13);
            }
            if (MaxNativeAdView.MEDIUM_TEMPLATE_1.equalsIgnoreCase(eeVar.o0())) {
                if (z10) {
                    d10 = this.a.getWidth() / this.a.getHeight();
                } else {
                    d10 = 1.2d;
                }
                return new AppLovinSdkUtils.Size(min, (int) (min / d10));
            }
            if (z10) {
                return this.a;
            }
            if (eeVar.l0() != null) {
                View mainView = eeVar.l0().getMainView();
                return new AppLovinSdkUtils.Size(mainView.getMeasuredWidth(), mainView.getMeasuredHeight());
            }
        }
        return AppLovinSdkUtils.Size.ZERO;
    }

    public int getAdjustedCount(int i10) {
        return this.f9567c.b(i10);
    }

    public int getAdjustedPosition(int i10) {
        return this.f9567c.c(i10);
    }

    public int getOriginalPosition(int i10) {
        return this.f9567c.d(i10);
    }

    public void insertItem(int i10) {
        if (t.a()) {
            this.logger.a("MaxAdPlacer", "Inserting item at position: " + i10);
        }
        this.f9567c.f(i10);
    }

    public boolean isAdPosition(int i10) {
        return this.f9567c.g(i10);
    }

    public boolean isFilledPosition(int i10) {
        return this.f9567c.h(i10);
    }

    public void loadAds() {
        if (t.a()) {
            this.logger.a("MaxAdPlacer", "Loading ads");
        }
        this.f9568d.e();
    }

    public void moveItem(int i10, int i11) {
        this.f9567c.b(i10, i11);
    }

    @Override // com.applovin.impl.zc.a
    public void onAdRevenuePaid(MaxAd maxAd) {
        Listener listener = this.f9569e;
        if (listener != null) {
            listener.onAdRevenuePaid(maxAd);
        }
    }

    @Override // com.applovin.impl.zc.a
    public void onNativeAdClicked(MaxAd maxAd) {
        Listener listener = this.f9569e;
        if (listener != null) {
            listener.onAdClicked(maxAd);
        }
    }

    @Override // com.applovin.impl.zc.a
    public void onNativeAdLoadFailed(String str, MaxError maxError) {
        if (t.a()) {
            this.logger.b("MaxAdPlacer", "Native ad failed to load: " + maxError);
        }
    }

    @Override // com.applovin.impl.zc.a
    public void onNativeAdLoaded() {
        if (t.a()) {
            this.logger.a("MaxAdPlacer", "Native ad enqueued");
        }
        a();
    }

    public void removeItem(int i10) {
        List emptyList;
        if (isFilledPosition(i10)) {
            emptyList = Collections.singletonList(Integer.valueOf(i10));
        } else {
            emptyList = Collections.emptyList();
        }
        a(emptyList, new m(i10, 3, this));
    }

    public void renderAd(int i10, ViewGroup viewGroup) {
        MaxAd a = this.f9567c.a(i10);
        if (a == null) {
            if (t.a()) {
                this.logger.a("MaxAdPlacer", "An ad is not available for position: " + i10);
                return;
            }
            return;
        }
        MaxNativeAdView l02 = ((ee) a).l0();
        if (l02 != null) {
            if (t.a()) {
                this.logger.a("MaxAdPlacer", "Using pre-rendered ad at position: " + i10);
            }
        } else if (this.f9566b != null) {
            l02 = new MaxNativeAdView(this.f9566b, viewGroup.getContext());
            if (this.f9568d.a(l02, a)) {
                if (t.a()) {
                    this.logger.a("MaxAdPlacer", "Rendered ad at position: " + i10);
                }
            } else if (t.a()) {
                this.logger.b("MaxAdPlacer", "Unable to render ad at position: " + i10);
            }
        } else {
            if (t.a()) {
                this.logger.b("MaxAdPlacer", "Unable to render ad at position: " + i10 + ". If you're using a custom ad template, check that nativeAdViewBinder is set.");
                return;
            }
            return;
        }
        for (int childCount = viewGroup.getChildCount(); childCount >= 0; childCount--) {
            if (viewGroup.getChildAt(childCount) instanceof MaxNativeAdView) {
                viewGroup.removeViewAt(childCount);
            }
        }
        if (l02.getParent() != null) {
            ((ViewGroup) l02.getParent()).removeView(l02);
        }
        viewGroup.addView(l02, -1, -1);
    }

    public void setAdSize(int i10, int i11) {
        this.a = new AppLovinSdkUtils.Size(i10, i11);
    }

    public void setListener(Listener listener) {
        this.f9569e = listener;
    }

    public void setNativeAdViewBinder(MaxNativeAdViewBinder maxNativeAdViewBinder) {
        this.f9566b = maxNativeAdViewBinder;
    }

    public void updateFillablePositions(int i10, int i11) {
        this.f9567c.c(i10, i11);
        if (i10 != -1 && i11 != -1) {
            a();
        }
    }

    public MaxAdPlacer(MaxAdPlacerSettings maxAdPlacerSettings, AppLovinSdk appLovinSdk, Context context) {
        this.a = AppLovinSdkUtils.Size.ZERO;
        k a = appLovinSdk.a();
        this.sdk = a;
        t L = a.L();
        this.logger = L;
        this.f9567c = new uc(maxAdPlacerSettings);
        this.f9568d = new zc(maxAdPlacerSettings, context, this);
        if (t.a()) {
            L.a("MaxAdPlacer", "Initializing ad placer with settings: " + maxAdPlacerSettings);
        }
    }

    public /* synthetic */ void a(int i10, Collection collection) {
        if (t.a()) {
            this.logger.a("MaxAdPlacer", "Clearing trailing ads after position " + i10);
        }
        this.f9567c.a(collection);
    }

    public /* synthetic */ void b() {
        if (t.a()) {
            this.logger.a("MaxAdPlacer", "Clearing all cached ads");
        }
        this.f9567c.a();
        this.f9568d.a();
    }

    public /* synthetic */ void a(int i10) {
        if (t.a()) {
            this.logger.a("MaxAdPlacer", "Removing item at position: " + i10);
        }
        this.f9567c.i(i10);
    }

    private void a() {
        int c10;
        while (this.f9568d.d() && (c10 = this.f9567c.c()) != -1) {
            if (t.a()) {
                this.logger.a("MaxAdPlacer", "Placing ad at position: " + c10);
            }
            this.f9567c.a(this.f9568d.b(), c10);
            Listener listener = this.f9569e;
            if (listener != null) {
                listener.onAdLoaded(c10);
            }
        }
    }

    private void a(Collection collection, Runnable runnable) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            this.f9568d.a(this.f9567c.a(((Integer) it.next()).intValue()));
        }
        runnable.run();
        if (collection.isEmpty()) {
            return;
        }
        if (t.a()) {
            this.logger.a("MaxAdPlacer", "Removed " + collection.size() + " ads from stream: " + collection);
        }
        if (this.f9569e != null) {
            Iterator it2 = collection.iterator();
            while (it2.hasNext()) {
                this.f9569e.onAdRemoved(((Integer) it2.next()).intValue());
            }
        }
    }
}
