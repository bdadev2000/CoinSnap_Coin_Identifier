package com.applovin.mediation.nativeAds.adPlacer;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.material.ripple.a;
import androidx.core.content.res.b;
import com.applovin.impl.ed;
import com.applovin.impl.je;
import com.applovin.impl.sdk.j;
import com.applovin.impl.sdk.n;
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

/* loaded from: classes3.dex */
public class MaxAdPlacer implements ed.a {

    /* renamed from: a */
    private AppLovinSdkUtils.Size f28461a;

    /* renamed from: b */
    private MaxNativeAdViewBinder f28462b;

    /* renamed from: c */
    private final zc f28463c;
    private final ed d;
    private Listener e;
    protected final n logger;
    protected final j sdk;

    /* loaded from: classes3.dex */
    public interface Listener {
        void onAdClicked(MaxAd maxAd);

        void onAdLoaded(int i2);

        void onAdRemoved(int i2);

        void onAdRevenuePaid(MaxAd maxAd);
    }

    public MaxAdPlacer(MaxAdPlacerSettings maxAdPlacerSettings, Context context) {
        this(maxAdPlacerSettings, AppLovinSdk.getInstance(context), context);
    }

    public void clearAds() {
        a(this.f28463c.b(), new a(this, 10));
    }

    public Collection<Integer> clearTrailingAds(int i2) {
        Collection<Integer> e = this.f28463c.e(i2);
        if (!e.isEmpty()) {
            a(e, new androidx.profileinstaller.a(i2, this, e, 2));
        }
        return e;
    }

    public void destroy() {
        if (n.a()) {
            this.logger.a("MaxAdPlacer", "Destroying ad placer");
        }
        clearAds();
        this.d.c();
    }

    public long getAdItemId(int i2) {
        if (isFilledPosition(i2)) {
            return -System.identityHashCode(this.f28463c.a(i2));
        }
        return 0L;
    }

    public AppLovinSdkUtils.Size getAdSize(int i2, int i3) {
        if (isFilledPosition(i2)) {
            AppLovinSdkUtils.Size size = this.f28461a;
            boolean z2 = size != AppLovinSdkUtils.Size.ZERO;
            int min = Math.min(z2 ? size.getWidth() : 360, i3);
            je jeVar = (je) this.f28463c.a(i2);
            if ("small_template_1".equalsIgnoreCase(jeVar.t0())) {
                return new AppLovinSdkUtils.Size(min, z2 ? this.f28461a.getHeight() : 120);
            }
            if (MaxNativeAdView.MEDIUM_TEMPLATE_1.equalsIgnoreCase(jeVar.t0())) {
                return new AppLovinSdkUtils.Size(min, (int) (min / (z2 ? this.f28461a.getWidth() / this.f28461a.getHeight() : 1.2d)));
            }
            if (z2) {
                return this.f28461a;
            }
            if (jeVar.q0() != null) {
                View mainView = jeVar.q0().getMainView();
                return new AppLovinSdkUtils.Size(mainView.getMeasuredWidth(), mainView.getMeasuredHeight());
            }
        }
        return AppLovinSdkUtils.Size.ZERO;
    }

    public int getAdjustedCount(int i2) {
        return this.f28463c.b(i2);
    }

    public int getAdjustedPosition(int i2) {
        return this.f28463c.c(i2);
    }

    public int getOriginalPosition(int i2) {
        return this.f28463c.d(i2);
    }

    public void insertItem(int i2) {
        if (n.a()) {
            this.logger.a("MaxAdPlacer", "Inserting item at position: " + i2);
        }
        this.f28463c.f(i2);
    }

    public boolean isAdPosition(int i2) {
        return this.f28463c.g(i2);
    }

    public boolean isFilledPosition(int i2) {
        return this.f28463c.h(i2);
    }

    public void loadAds() {
        if (n.a()) {
            this.logger.a("MaxAdPlacer", "Loading ads");
        }
        this.d.e();
    }

    public void moveItem(int i2, int i3) {
        this.f28463c.b(i2, i3);
    }

    @Override // com.applovin.impl.ed.a
    public void onAdRevenuePaid(MaxAd maxAd) {
        Listener listener = this.e;
        if (listener != null) {
            listener.onAdRevenuePaid(maxAd);
        }
    }

    @Override // com.applovin.impl.ed.a
    public void onNativeAdClicked(MaxAd maxAd) {
        Listener listener = this.e;
        if (listener != null) {
            listener.onAdClicked(maxAd);
        }
    }

    @Override // com.applovin.impl.ed.a
    public void onNativeAdLoadFailed(String str, MaxError maxError) {
        if (n.a()) {
            this.logger.b("MaxAdPlacer", "Native ad failed to load: " + maxError);
        }
    }

    @Override // com.applovin.impl.ed.a
    public void onNativeAdLoaded() {
        if (n.a()) {
            this.logger.a("MaxAdPlacer", "Native ad enqueued");
        }
        a();
    }

    public void removeItem(int i2) {
        a(isFilledPosition(i2) ? Collections.singletonList(Integer.valueOf(i2)) : Collections.emptyList(), new b(i2, 3, this));
    }

    public void renderAd(int i2, ViewGroup viewGroup) {
        MaxAd a2 = this.f28463c.a(i2);
        if (a2 == null) {
            if (n.a()) {
                this.logger.a("MaxAdPlacer", "An ad is not available for position: " + i2);
                return;
            }
            return;
        }
        MaxNativeAdView q02 = ((je) a2).q0();
        if (q02 == null) {
            if (this.f28462b == null) {
                if (n.a()) {
                    this.logger.b("MaxAdPlacer", "Unable to render ad at position: " + i2 + ". If you're using a custom ad template, check that nativeAdViewBinder is set.");
                    return;
                }
                return;
            }
            q02 = new MaxNativeAdView(this.f28462b, viewGroup.getContext());
            if (this.d.a(q02, a2)) {
                if (n.a()) {
                    this.logger.a("MaxAdPlacer", "Rendered ad at position: " + i2);
                }
            } else if (n.a()) {
                this.logger.b("MaxAdPlacer", "Unable to render ad at position: " + i2);
            }
        } else if (n.a()) {
            this.logger.a("MaxAdPlacer", "Using pre-rendered ad at position: " + i2);
        }
        for (int childCount = viewGroup.getChildCount(); childCount >= 0; childCount--) {
            if (viewGroup.getChildAt(childCount) instanceof MaxNativeAdView) {
                viewGroup.removeViewAt(childCount);
            }
        }
        if (q02.getParent() != null) {
            ((ViewGroup) q02.getParent()).removeView(q02);
        }
        viewGroup.addView(q02, -1, -1);
    }

    public void setAdSize(int i2, int i3) {
        this.f28461a = new AppLovinSdkUtils.Size(i2, i3);
    }

    public void setListener(Listener listener) {
        this.e = listener;
    }

    public void setNativeAdViewBinder(MaxNativeAdViewBinder maxNativeAdViewBinder) {
        this.f28462b = maxNativeAdViewBinder;
    }

    public void updateFillablePositions(int i2, int i3) {
        this.f28463c.c(i2, i3);
        if (i2 == -1 || i3 == -1) {
            return;
        }
        a();
    }

    public MaxAdPlacer(MaxAdPlacerSettings maxAdPlacerSettings, AppLovinSdk appLovinSdk, Context context) {
        this.f28461a = AppLovinSdkUtils.Size.ZERO;
        j a2 = appLovinSdk.a();
        this.sdk = a2;
        n J = a2.J();
        this.logger = J;
        this.f28463c = new zc(maxAdPlacerSettings);
        this.d = new ed(maxAdPlacerSettings, context, this);
        if (n.a()) {
            J.a("MaxAdPlacer", "Initializing ad placer with settings: " + maxAdPlacerSettings);
        }
    }

    public /* synthetic */ void a(int i2, Collection collection) {
        if (n.a()) {
            this.logger.a("MaxAdPlacer", "Clearing trailing ads after position " + i2);
        }
        this.f28463c.a(collection);
    }

    public /* synthetic */ void b() {
        if (n.a()) {
            this.logger.a("MaxAdPlacer", "Clearing all cached ads");
        }
        this.f28463c.a();
        this.d.a();
    }

    public /* synthetic */ void a(int i2) {
        if (n.a()) {
            this.logger.a("MaxAdPlacer", "Removing item at position: " + i2);
        }
        this.f28463c.i(i2);
    }

    private void a() {
        int c2;
        while (this.d.d() && (c2 = this.f28463c.c()) != -1) {
            if (n.a()) {
                this.logger.a("MaxAdPlacer", "Placing ad at position: " + c2);
            }
            this.f28463c.a(this.d.b(), c2);
            Listener listener = this.e;
            if (listener != null) {
                listener.onAdLoaded(c2);
            }
        }
    }

    private void a(Collection collection, Runnable runnable) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            this.d.a(this.f28463c.a(((Integer) it.next()).intValue()));
        }
        runnable.run();
        if (collection.isEmpty()) {
            return;
        }
        if (n.a()) {
            this.logger.a("MaxAdPlacer", "Removed " + collection.size() + " ads from stream: " + collection);
        }
        if (this.e != null) {
            Iterator it2 = collection.iterator();
            while (it2.hasNext()) {
                this.e.onAdRemoved(((Integer) it2.next()).intValue());
            }
        }
    }
}
