package com.applovin.mediation.nativeAds.adPlacer;

import C0.a;
import D3.b;
import K.m;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
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
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public class MaxAdPlacer implements zc.a {

    /* renamed from: a */
    private AppLovinSdkUtils.Size f12743a;
    private MaxNativeAdViewBinder b;

    /* renamed from: c */
    private final uc f12744c;

    /* renamed from: d */
    private final zc f12745d;

    /* renamed from: e */
    private Listener f12746e;
    protected final t logger;
    protected final k sdk;

    /* loaded from: classes.dex */
    public interface Listener {
        void onAdClicked(MaxAd maxAd);

        void onAdLoaded(int i9);

        void onAdRemoved(int i9);

        void onAdRevenuePaid(MaxAd maxAd);
    }

    public MaxAdPlacer(MaxAdPlacerSettings maxAdPlacerSettings, Context context) {
        this(maxAdPlacerSettings, AppLovinSdk.getInstance(context), context);
    }

    public void clearAds() {
        a(this.f12744c.b(), new b(this, 22));
    }

    public Collection<Integer> clearTrailingAds(int i9) {
        Collection<Integer> e4 = this.f12744c.e(i9);
        if (!e4.isEmpty()) {
            a(e4, new a(i9, this, e4, 1));
        }
        return e4;
    }

    public void destroy() {
        if (t.a()) {
            this.logger.a("MaxAdPlacer", "Destroying ad placer");
        }
        clearAds();
        this.f12745d.c();
    }

    public long getAdItemId(int i9) {
        if (isFilledPosition(i9)) {
            return -System.identityHashCode(this.f12744c.a(i9));
        }
        return 0L;
    }

    public AppLovinSdkUtils.Size getAdSize(int i9, int i10) {
        boolean z8;
        int i11;
        double d2;
        int i12;
        if (isFilledPosition(i9)) {
            AppLovinSdkUtils.Size size = this.f12743a;
            if (size != AppLovinSdkUtils.Size.ZERO) {
                z8 = true;
            } else {
                z8 = false;
            }
            if (z8) {
                i11 = size.getWidth();
            } else {
                i11 = 360;
            }
            int min = Math.min(i11, i10);
            ee eeVar = (ee) this.f12744c.a(i9);
            if ("small_template_1".equalsIgnoreCase(eeVar.o0())) {
                if (z8) {
                    i12 = this.f12743a.getHeight();
                } else {
                    i12 = 120;
                }
                return new AppLovinSdkUtils.Size(min, i12);
            }
            if (MaxNativeAdView.MEDIUM_TEMPLATE_1.equalsIgnoreCase(eeVar.o0())) {
                if (z8) {
                    d2 = this.f12743a.getWidth() / this.f12743a.getHeight();
                } else {
                    d2 = 1.2d;
                }
                return new AppLovinSdkUtils.Size(min, (int) (min / d2));
            }
            if (z8) {
                return this.f12743a;
            }
            if (eeVar.l0() != null) {
                View mainView = eeVar.l0().getMainView();
                return new AppLovinSdkUtils.Size(mainView.getMeasuredWidth(), mainView.getMeasuredHeight());
            }
        }
        return AppLovinSdkUtils.Size.ZERO;
    }

    public int getAdjustedCount(int i9) {
        return this.f12744c.b(i9);
    }

    public int getAdjustedPosition(int i9) {
        return this.f12744c.c(i9);
    }

    public int getOriginalPosition(int i9) {
        return this.f12744c.d(i9);
    }

    public void insertItem(int i9) {
        if (t.a()) {
            this.logger.a("MaxAdPlacer", "Inserting item at position: " + i9);
        }
        this.f12744c.f(i9);
    }

    public boolean isAdPosition(int i9) {
        return this.f12744c.g(i9);
    }

    public boolean isFilledPosition(int i9) {
        return this.f12744c.h(i9);
    }

    public void loadAds() {
        if (t.a()) {
            this.logger.a("MaxAdPlacer", "Loading ads");
        }
        this.f12745d.e();
    }

    public void moveItem(int i9, int i10) {
        this.f12744c.b(i9, i10);
    }

    @Override // com.applovin.impl.zc.a
    public void onAdRevenuePaid(MaxAd maxAd) {
        Listener listener = this.f12746e;
        if (listener != null) {
            listener.onAdRevenuePaid(maxAd);
        }
    }

    @Override // com.applovin.impl.zc.a
    public void onNativeAdClicked(MaxAd maxAd) {
        Listener listener = this.f12746e;
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

    public void removeItem(int i9) {
        List emptyList;
        if (isFilledPosition(i9)) {
            emptyList = Collections.singletonList(Integer.valueOf(i9));
        } else {
            emptyList = Collections.emptyList();
        }
        a(emptyList, new m(i9, 4, this));
    }

    public void renderAd(int i9, ViewGroup viewGroup) {
        MaxAd a6 = this.f12744c.a(i9);
        if (a6 == null) {
            if (t.a()) {
                this.logger.a("MaxAdPlacer", "An ad is not available for position: " + i9);
                return;
            }
            return;
        }
        MaxNativeAdView l02 = ((ee) a6).l0();
        if (l02 != null) {
            if (t.a()) {
                this.logger.a("MaxAdPlacer", "Using pre-rendered ad at position: " + i9);
            }
        } else if (this.b != null) {
            l02 = new MaxNativeAdView(this.b, viewGroup.getContext());
            if (this.f12745d.a(l02, a6)) {
                if (t.a()) {
                    this.logger.a("MaxAdPlacer", "Rendered ad at position: " + i9);
                }
            } else if (t.a()) {
                this.logger.b("MaxAdPlacer", "Unable to render ad at position: " + i9);
            }
        } else {
            if (t.a()) {
                this.logger.b("MaxAdPlacer", "Unable to render ad at position: " + i9 + ". If you're using a custom ad template, check that nativeAdViewBinder is set.");
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

    public void setAdSize(int i9, int i10) {
        this.f12743a = new AppLovinSdkUtils.Size(i9, i10);
    }

    public void setListener(Listener listener) {
        this.f12746e = listener;
    }

    public void setNativeAdViewBinder(MaxNativeAdViewBinder maxNativeAdViewBinder) {
        this.b = maxNativeAdViewBinder;
    }

    public void updateFillablePositions(int i9, int i10) {
        this.f12744c.c(i9, i10);
        if (i9 != -1 && i10 != -1) {
            a();
        }
    }

    public MaxAdPlacer(MaxAdPlacerSettings maxAdPlacerSettings, AppLovinSdk appLovinSdk, Context context) {
        this.f12743a = AppLovinSdkUtils.Size.ZERO;
        k a6 = appLovinSdk.a();
        this.sdk = a6;
        t L8 = a6.L();
        this.logger = L8;
        this.f12744c = new uc(maxAdPlacerSettings);
        this.f12745d = new zc(maxAdPlacerSettings, context, this);
        if (t.a()) {
            L8.a("MaxAdPlacer", "Initializing ad placer with settings: " + maxAdPlacerSettings);
        }
    }

    public /* synthetic */ void a(int i9, Collection collection) {
        if (t.a()) {
            this.logger.a("MaxAdPlacer", "Clearing trailing ads after position " + i9);
        }
        this.f12744c.a(collection);
    }

    public /* synthetic */ void b() {
        if (t.a()) {
            this.logger.a("MaxAdPlacer", "Clearing all cached ads");
        }
        this.f12744c.a();
        this.f12745d.a();
    }

    public /* synthetic */ void a(int i9) {
        if (t.a()) {
            this.logger.a("MaxAdPlacer", "Removing item at position: " + i9);
        }
        this.f12744c.i(i9);
    }

    private void a() {
        int c9;
        while (this.f12745d.d() && (c9 = this.f12744c.c()) != -1) {
            if (t.a()) {
                this.logger.a("MaxAdPlacer", "Placing ad at position: " + c9);
            }
            this.f12744c.a(this.f12745d.b(), c9);
            Listener listener = this.f12746e;
            if (listener != null) {
                listener.onAdLoaded(c9);
            }
        }
    }

    private void a(Collection collection, Runnable runnable) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            this.f12745d.a(this.f12744c.a(((Integer) it.next()).intValue()));
        }
        runnable.run();
        if (collection.isEmpty()) {
            return;
        }
        if (t.a()) {
            this.logger.a("MaxAdPlacer", "Removed " + collection.size() + " ads from stream: " + collection);
        }
        if (this.f12746e != null) {
            Iterator it2 = collection.iterator();
            while (it2.hasNext()) {
                this.f12746e.onAdRemoved(((Integer) it2.next()).intValue());
            }
        }
    }
}
