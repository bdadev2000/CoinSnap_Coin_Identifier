package com.applovin.mediation.ads;

import Q7.n0;
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
import com.applovin.impl.AbstractC0688e0;
import com.applovin.impl.ar;
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

    /* renamed from: a, reason: collision with root package name */
    private MaxAdViewImpl f12697a;
    private View b;

    /* renamed from: c, reason: collision with root package name */
    private int f12698c;

    public MaxAdView(String str, Context context) {
        this(str, AppLovinSdk.getInstance(context), context);
    }

    private void a(String str, MaxAdFormat maxAdFormat, int i9, AppLovinSdk appLovinSdk, Context context) {
        View view = new View(context.getApplicationContext());
        this.b = view;
        view.setBackgroundColor(0);
        addView(this.b);
        this.b.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
        this.f12698c = getVisibility();
        this.f12697a = new MaxAdViewImpl(str.trim(), maxAdFormat, this, this.b, appLovinSdk.a(), context);
        setGravity(i9);
        if (getBackground() instanceof ColorDrawable) {
            setBackgroundColor(((ColorDrawable) getBackground()).getColor());
        }
        super.setBackgroundColor(0);
    }

    public void destroy() {
        this.f12697a.logApiCall("destroy()");
        this.f12697a.destroy();
    }

    public MaxAdFormat getAdFormat() {
        return this.f12697a.getAdFormat();
    }

    public String getAdUnitId() {
        return this.f12697a.getAdUnitId();
    }

    public String getPlacement() {
        this.f12697a.logApiCall("getPlacement()");
        return this.f12697a.getPlacement();
    }

    public void loadAd() {
        this.f12697a.logApiCall("loadAd()");
        this.f12697a.loadAd();
    }

    @Override // android.view.View
    public void onWindowVisibilityChanged(int i9) {
        super.onWindowVisibilityChanged(i9);
        if (!isInEditMode()) {
            this.f12697a.logApiCall("onWindowVisibilityChanged(visibility=" + i9 + ")");
            if (this.f12697a != null && ar.a(this.f12698c, i9)) {
                this.f12697a.onWindowVisibilityChanged(i9);
            }
            this.f12698c = i9;
        }
    }

    public void setAdReviewListener(MaxAdReviewListener maxAdReviewListener) {
        this.f12697a.logApiCall("setAdReviewListener(listener=" + maxAdReviewListener + ")");
        this.f12697a.setAdReviewListener(maxAdReviewListener);
    }

    @Override // android.view.View
    public void setAlpha(float f9) {
        this.f12697a.logApiCall("setAlpha(alpha=" + f9 + ")");
        View view = this.b;
        if (view != null) {
            view.setAlpha(f9);
        }
    }

    @Override // android.view.View
    public void setBackgroundColor(int i9) {
        this.f12697a.logApiCall("setBackgroundColor(color=" + i9 + ")");
        MaxAdViewImpl maxAdViewImpl = this.f12697a;
        if (maxAdViewImpl != null) {
            maxAdViewImpl.setPublisherBackgroundColor(i9);
        }
        View view = this.b;
        if (view != null) {
            view.setBackgroundColor(i9);
        }
    }

    public void setCustomData(String str) {
        this.f12697a.logApiCall("setCustomData(value=" + str + ")");
        this.f12697a.setCustomData(str);
    }

    public void setExtraParameter(String str, String str2) {
        this.f12697a.logApiCall(n0.j("setExtraParameter(key=", str, ", value=", str2, ")"));
        this.f12697a.setExtraParameter(str, str2);
    }

    public void setListener(MaxAdViewAdListener maxAdViewAdListener) {
        this.f12697a.logApiCall("setListener(listener=" + maxAdViewAdListener + ")");
        this.f12697a.setListener(maxAdViewAdListener);
    }

    public void setLocalExtraParameter(String str, Object obj) {
        this.f12697a.logApiCall("setLocalExtraParameter(key=" + str + ", value=" + obj + ")");
        this.f12697a.setLocalExtraParameter(str, obj);
    }

    public void setPlacement(String str) {
        this.f12697a.logApiCall("setPlacement(placement=" + str + ")");
        this.f12697a.setPlacement(str);
    }

    public void setRequestListener(MaxAdRequestListener maxAdRequestListener) {
        this.f12697a.logApiCall("setRequestListener(listener=" + maxAdRequestListener + ")");
        this.f12697a.setRequestListener(maxAdRequestListener);
    }

    public void setRevenueListener(MaxAdRevenueListener maxAdRevenueListener) {
        this.f12697a.logApiCall("setRevenueListener(listener=" + maxAdRevenueListener + ")");
        this.f12697a.setRevenueListener(maxAdRevenueListener);
    }

    public void startAutoRefresh() {
        this.f12697a.logApiCall("startAutoRefresh()");
        this.f12697a.startAutoRefresh();
    }

    public void stopAutoRefresh() {
        this.f12697a.logApiCall("stopAutoRefresh()");
        this.f12697a.stopAutoRefresh();
    }

    @Override // android.view.View
    @NonNull
    public String toString() {
        MaxAdViewImpl maxAdViewImpl = this.f12697a;
        if (maxAdViewImpl != null) {
            return maxAdViewImpl.toString();
        }
        return "MaxAdView";
    }

    public MaxAdView(String str, AppLovinSdk appLovinSdk, Context context) {
        this(str, AbstractC0688e0.a(context), appLovinSdk, context);
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

    public MaxAdView(Context context, AttributeSet attributeSet, int i9) {
        super(context, attributeSet, i9);
        MaxAdFormat a6;
        String a9 = AbstractC0688e0.a(context, attributeSet, AppLovinAdView.NAMESPACE, "adUnitId");
        String a10 = AbstractC0688e0.a(context, attributeSet, AppLovinAdView.NAMESPACE, "adFormat");
        if (StringUtils.isValidString(a10)) {
            a6 = MaxAdFormat.formatFromString(a10);
        } else {
            a6 = AbstractC0688e0.a(context);
        }
        MaxAdFormat maxAdFormat = a6;
        int attributeIntValue = attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "gravity", 49);
        if (a9 != null) {
            if (!TextUtils.isEmpty(a9)) {
                if (isInEditMode()) {
                    a(context);
                    return;
                } else {
                    a(a9, maxAdFormat, attributeIntValue, AppLovinSdk.getInstance(context), context);
                    return;
                }
            }
            throw new IllegalArgumentException("Empty ad unit ID specified");
        }
        throw new IllegalArgumentException("No ad unit ID specified");
    }

    private void a(Context context) {
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        int i9 = displayMetrics.widthPixels;
        int i10 = displayMetrics.heightPixels;
        TextView textView = new TextView(context);
        textView.setBackgroundColor(Color.rgb(220, 220, 220));
        textView.setTextColor(ViewCompat.MEASURED_STATE_MASK);
        textView.setText("AppLovin MAX Ad");
        textView.setGravity(17);
        addView(textView, i9, i10);
    }
}
