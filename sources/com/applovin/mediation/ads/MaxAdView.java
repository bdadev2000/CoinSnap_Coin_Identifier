package com.applovin.mediation.ads;

import a4.j;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.core.view.ViewCompat;
import com.applovin.adview.AppLovinAdView;
import com.applovin.impl.ar;
import com.applovin.impl.e0;
import com.applovin.impl.mediation.ads.MaxAdViewImpl;
import com.applovin.impl.mediation.ads.a;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxAdRequestListener;
import com.applovin.mediation.MaxAdRevenueListener;
import com.applovin.mediation.MaxAdReviewListener;
import com.applovin.mediation.MaxAdViewAdListener;
import com.applovin.sdk.AppLovinSdk;

/* loaded from: classes.dex */
public class MaxAdView extends RelativeLayout {
    private MaxAdViewImpl a;

    /* renamed from: b, reason: collision with root package name */
    private View f9517b;

    /* renamed from: c, reason: collision with root package name */
    private int f9518c;

    public MaxAdView(String str, Context context) {
        this(str, AppLovinSdk.getInstance(context), context);
    }

    private void a(String str, MaxAdFormat maxAdFormat, int i10, AppLovinSdk appLovinSdk, Context context) {
        View view = new View(context.getApplicationContext());
        this.f9517b = view;
        view.setBackgroundColor(0);
        addView(this.f9517b);
        this.f9517b.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
        this.f9518c = getVisibility();
        this.a = new MaxAdViewImpl(str.trim(), maxAdFormat, this, this.f9517b, appLovinSdk.a(), context);
        setGravity(i10);
        if (getBackground() instanceof ColorDrawable) {
            setBackgroundColor(((ColorDrawable) getBackground()).getColor());
        }
        super.setBackgroundColor(0);
    }

    public void destroy() {
        this.a.logApiCall("destroy()");
        this.a.destroy();
    }

    public MaxAdFormat getAdFormat() {
        return this.a.getAdFormat();
    }

    public String getAdUnitId() {
        return this.a.getAdUnitId();
    }

    public String getPlacement() {
        this.a.logApiCall("getPlacement()");
        return this.a.getPlacement();
    }

    public void loadAd() {
        this.a.logApiCall("loadAd()");
        this.a.loadAd();
    }

    @Override // android.view.View
    public void onWindowVisibilityChanged(int i10) {
        super.onWindowVisibilityChanged(i10);
        if (!isInEditMode()) {
            this.a.logApiCall("onWindowVisibilityChanged(visibility=" + i10 + ")");
            if (this.a != null && ar.a(this.f9518c, i10)) {
                this.a.onWindowVisibilityChanged(i10);
            }
            this.f9518c = i10;
        }
    }

    public void setAdReviewListener(MaxAdReviewListener maxAdReviewListener) {
        this.a.logApiCall("setAdReviewListener(listener=" + maxAdReviewListener + ")");
        this.a.setAdReviewListener(maxAdReviewListener);
    }

    @Override // android.view.View
    public void setAlpha(float f10) {
        this.a.logApiCall("setAlpha(alpha=" + f10 + ")");
        View view = this.f9517b;
        if (view != null) {
            view.setAlpha(f10);
        }
    }

    @Override // android.view.View
    public void setBackgroundColor(int i10) {
        this.a.logApiCall("setBackgroundColor(color=" + i10 + ")");
        MaxAdViewImpl maxAdViewImpl = this.a;
        if (maxAdViewImpl != null) {
            maxAdViewImpl.setPublisherBackgroundColor(i10);
        }
        View view = this.f9517b;
        if (view != null) {
            view.setBackgroundColor(i10);
        }
    }

    public void setCustomData(String str) {
        this.a.logApiCall("setCustomData(value=" + str + ")");
        this.a.setCustomData(str);
    }

    public void setExtraParameter(String str, String str2) {
        this.a.logApiCall(j.h("setExtraParameter(key=", str, ", value=", str2, ")"));
        this.a.setExtraParameter(str, str2);
    }

    public void setListener(MaxAdViewAdListener maxAdViewAdListener) {
        this.a.logApiCall("setListener(listener=" + maxAdViewAdListener + ")");
        this.a.setListener(maxAdViewAdListener);
    }

    public void setLocalExtraParameter(String str, Object obj) {
        this.a.logApiCall("setLocalExtraParameter(key=" + str + ", value=" + obj + ")");
        this.a.setLocalExtraParameter(str, obj);
    }

    public void setPlacement(String str) {
        this.a.logApiCall("setPlacement(placement=" + str + ")");
        this.a.setPlacement(str);
    }

    public void setRequestListener(MaxAdRequestListener maxAdRequestListener) {
        this.a.logApiCall("setRequestListener(listener=" + maxAdRequestListener + ")");
        this.a.setRequestListener(maxAdRequestListener);
    }

    public void setRevenueListener(MaxAdRevenueListener maxAdRevenueListener) {
        this.a.logApiCall("setRevenueListener(listener=" + maxAdRevenueListener + ")");
        this.a.setRevenueListener(maxAdRevenueListener);
    }

    public void startAutoRefresh() {
        this.a.logApiCall("startAutoRefresh()");
        this.a.startAutoRefresh();
    }

    public void stopAutoRefresh() {
        this.a.logApiCall("stopAutoRefresh()");
        this.a.stopAutoRefresh();
    }

    @Override // android.view.View
    @NonNull
    public String toString() {
        MaxAdViewImpl maxAdViewImpl = this.a;
        return maxAdViewImpl != null ? maxAdViewImpl.toString() : "MaxAdView";
    }

    public MaxAdView(String str, AppLovinSdk appLovinSdk, Context context) {
        this(str, e0.a(context), appLovinSdk, context);
    }

    public MaxAdView(String str, MaxAdFormat maxAdFormat, Context context) {
        this(str, maxAdFormat, AppLovinSdk.getInstance(context), context);
    }

    public MaxAdView(String str, MaxAdFormat maxAdFormat, AppLovinSdk appLovinSdk, Context context) {
        super(context.getApplicationContext());
        a.logApiCall("MaxAdView", "MaxAdView(adUnitId=" + str + ", adFormat=" + maxAdFormat + ", sdk=" + appLovinSdk + ")");
        a(str, maxAdFormat, 49, appLovinSdk, context);
    }

    public MaxAdView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public MaxAdView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        MaxAdFormat a;
        String a10 = e0.a(context, attributeSet, AppLovinAdView.NAMESPACE, "adUnitId");
        String a11 = e0.a(context, attributeSet, AppLovinAdView.NAMESPACE, "adFormat");
        if (StringUtils.isValidString(a11)) {
            a = MaxAdFormat.formatFromString(a11);
        } else {
            a = e0.a(context);
        }
        MaxAdFormat maxAdFormat = a;
        int attributeIntValue = attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "gravity", 49);
        if (a10 != null) {
            if (!TextUtils.isEmpty(a10)) {
                if (isInEditMode()) {
                    a(context);
                    return;
                } else {
                    a(a10, maxAdFormat, attributeIntValue, AppLovinSdk.getInstance(context), context);
                    return;
                }
            }
            throw new IllegalArgumentException("Empty ad unit ID specified");
        }
        throw new IllegalArgumentException("No ad unit ID specified");
    }

    private void a(Context context) {
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        int i10 = displayMetrics.widthPixels;
        int i11 = displayMetrics.heightPixels;
        TextView textView = new TextView(context);
        textView.setBackgroundColor(Color.rgb(220, 220, 220));
        textView.setTextColor(ViewCompat.MEASURED_STATE_MASK);
        textView.setText("AppLovin MAX Ad");
        textView.setGravity(17);
        addView(textView, i10, i11);
    }
}
