package com.applovin.mediation.ads;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.compose.foundation.text.input.a;
import com.applovin.adview.AppLovinAdView;
import com.applovin.impl.e0;
import com.applovin.impl.mediation.ads.MaxAdViewImpl;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.zq;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxAdRequestListener;
import com.applovin.mediation.MaxAdRevenueListener;
import com.applovin.mediation.MaxAdReviewListener;
import com.applovin.mediation.MaxAdViewAdListener;
import com.applovin.sdk.AppLovinSdk;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.analytics.events.base.StatsEvent;
import com.safedk.android.utils.Logger;
import com.safedk.android.utils.g;

/* loaded from: classes3.dex */
public class MaxAdView extends RelativeLayout {

    /* renamed from: a, reason: collision with root package name */
    private MaxAdViewImpl f28404a;

    /* renamed from: b, reason: collision with root package name */
    private View f28405b;

    /* renamed from: c, reason: collision with root package name */
    private int f28406c;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MaxAdView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (StatsEvent) null);
        Logger.d("AppLovin|SafeDK: Execution> Lcom/applovin/mediation/ads/MaxAdView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V");
        CreativeInfoManager.onMaxAdViewCreated(this, getAdFormat(), getAdUnitId());
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MaxAdView(Context context, AttributeSet attributeSet, int i2) {
        this(context, attributeSet, i2, (StatsEvent) null);
        Logger.d("AppLovin|SafeDK: Execution> Lcom/applovin/mediation/ads/MaxAdView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V");
        CreativeInfoManager.onMaxAdViewCreated(this, getAdFormat(), getAdUnitId());
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MaxAdView(String str, Context context) {
        this(str, context, (StatsEvent) null);
        Logger.d("AppLovin|SafeDK: Execution> Lcom/applovin/mediation/ads/MaxAdView;-><init>(Ljava/lang/String;Landroid/content/Context;)V");
        CreativeInfoManager.onMaxAdViewCreated(this, getAdFormat(), getAdUnitId());
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    private MaxAdView(String p12, Context p2, StatsEvent p3) {
        this(p12, AppLovinSdk.getInstance(p2), p2);
        Logger.d("AppLovin|SafeDK: Execution> Lcom/applovin/mediation/ads/MaxAdView;-><init>(Ljava/lang/String;Landroid/content/Context;)V");
        if ("AppLovin|SafeDK: Execution> Lcom/applovin/mediation/ads/MaxAdView;-><init>(Ljava/lang/String;Landroid/content/Context;)V" == 0) {
        } else {
            this(p12, AppLovinSdk.getInstance(p2), p2);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MaxAdView(String str, MaxAdFormat maxAdFormat, Context context) {
        this(str, maxAdFormat, context, (StatsEvent) null);
        Logger.d("AppLovin|SafeDK: Execution> Lcom/applovin/mediation/ads/MaxAdView;-><init>(Ljava/lang/String;Lcom/applovin/mediation/MaxAdFormat;Landroid/content/Context;)V");
        CreativeInfoManager.onMaxAdViewCreated(this, getAdFormat(), getAdUnitId());
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MaxAdView(String str, MaxAdFormat maxAdFormat, AppLovinSdk appLovinSdk, Context context) {
        this(str, maxAdFormat, appLovinSdk, context, null);
        Logger.d("AppLovin|SafeDK: Execution> Lcom/applovin/mediation/ads/MaxAdView;-><init>(Ljava/lang/String;Lcom/applovin/mediation/MaxAdFormat;Lcom/applovin/sdk/AppLovinSdk;Landroid/content/Context;)V");
        CreativeInfoManager.onMaxAdViewCreated(this, getAdFormat(), getAdUnitId());
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MaxAdView(String str, AppLovinSdk appLovinSdk, Context context) {
        this(str, appLovinSdk, context, (StatsEvent) null);
        Logger.d("AppLovin|SafeDK: Execution> Lcom/applovin/mediation/ads/MaxAdView;-><init>(Ljava/lang/String;Lcom/applovin/sdk/AppLovinSdk;Landroid/content/Context;)V");
        CreativeInfoManager.onMaxAdViewCreated(this, getAdFormat(), getAdUnitId());
    }

    private void a(String str, MaxAdFormat maxAdFormat, int i2, AppLovinSdk appLovinSdk, Context context) {
        View view = new View(context.getApplicationContext());
        this.f28405b = view;
        view.setBackgroundColor(0);
        addView(this.f28405b);
        this.f28405b.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
        this.f28406c = getVisibility();
        this.f28404a = new MaxAdViewImpl(str.trim(), maxAdFormat, this, this.f28405b, appLovinSdk.a(), context);
        setGravity(i2);
        if (getBackground() instanceof ColorDrawable) {
            setBackgroundColor(((ColorDrawable) getBackground()).getColor());
        }
        super.setBackgroundColor(0);
    }

    public void destroy() {
        this.f28404a.logApiCall("destroy()");
        this.f28404a.destroy();
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch(g.f30048a, this, me);
        return super.dispatchTouchEvent(me);
    }

    public MaxAdFormat getAdFormat() {
        return this.f28404a.getAdFormat();
    }

    public String getAdUnitId() {
        return this.f28404a.getAdUnitId();
    }

    public String getPlacement() {
        this.f28404a.logApiCall("getPlacement()");
        return this.f28404a.getPlacement();
    }

    public void loadAd() {
        this.f28404a.logApiCall("loadAd()");
        this.f28404a.loadAd();
    }

    @Override // android.widget.RelativeLayout, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        }
    }

    @Override // android.view.View
    public void onWindowVisibilityChanged(int i2) {
        super.onWindowVisibilityChanged(i2);
        if (isInEditMode()) {
            return;
        }
        this.f28404a.logApiCall("onWindowVisibilityChanged(visibility=" + i2 + ")");
        if (this.f28404a != null && zq.a(this.f28406c, i2)) {
            this.f28404a.onWindowVisibilityChanged(i2);
        }
        this.f28406c = i2;
    }

    public void setAdReviewListener(MaxAdReviewListener maxAdReviewListener) {
        this.f28404a.logApiCall("setAdReviewListener(listener=" + maxAdReviewListener + ")");
        this.f28404a.setAdReviewListener(maxAdReviewListener);
    }

    @Override // android.view.View
    public void setAlpha(float f2) {
        this.f28404a.logApiCall("setAlpha(alpha=" + f2 + ")");
        View view = this.f28405b;
        if (view != null) {
            view.setAlpha(f2);
        }
    }

    @Override // android.view.View
    public void setBackgroundColor(int i2) {
        this.f28404a.logApiCall("setBackgroundColor(color=" + i2 + ")");
        MaxAdViewImpl maxAdViewImpl = this.f28404a;
        if (maxAdViewImpl != null) {
            maxAdViewImpl.setPublisherBackgroundColor(i2);
        }
        View view = this.f28405b;
        if (view != null) {
            view.setBackgroundColor(i2);
        }
    }

    public void setCustomData(String str) {
        this.f28404a.logApiCall("setCustomData(value=" + str + ")");
        this.f28404a.setCustomData(str);
    }

    public void setExtraParameter(String str, String str2) {
        this.f28404a.logApiCall(a.m("setExtraParameter(key=", str, ", value=", str2, ")"));
        this.f28404a.setExtraParameter(str, str2);
    }

    public void setListener(MaxAdViewAdListener maxAdViewAdListener) {
        this.f28404a.logApiCall("setListener(listener=" + maxAdViewAdListener + ")");
        this.f28404a.setListener(maxAdViewAdListener);
    }

    public void setLocalExtraParameter(String str, Object obj) {
        this.f28404a.logApiCall("setLocalExtraParameter(key=" + str + ", value=" + obj + ")");
        this.f28404a.setLocalExtraParameter(str, obj);
    }

    public void setPlacement(String str) {
        this.f28404a.logApiCall("setPlacement(placement=" + str + ")");
        this.f28404a.setPlacement(str);
    }

    public void setRequestListener(MaxAdRequestListener maxAdRequestListener) {
        this.f28404a.logApiCall("setRequestListener(listener=" + maxAdRequestListener + ")");
        this.f28404a.setRequestListener(maxAdRequestListener);
    }

    public void setRevenueListener(MaxAdRevenueListener maxAdRevenueListener) {
        this.f28404a.logApiCall("setRevenueListener(listener=" + maxAdRevenueListener + ")");
        this.f28404a.setRevenueListener(maxAdRevenueListener);
    }

    public void startAutoRefresh() {
        this.f28404a.logApiCall("startAutoRefresh()");
        this.f28404a.startAutoRefresh();
    }

    public void stopAutoRefresh() {
        this.f28404a.logApiCall("stopAutoRefresh()");
        this.f28404a.stopAutoRefresh();
    }

    @Override // android.view.View
    @NonNull
    public String toString() {
        MaxAdViewImpl maxAdViewImpl = this.f28404a;
        return maxAdViewImpl != null ? maxAdViewImpl.toString() : "MaxAdView";
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    private MaxAdView(String p12, AppLovinSdk p2, Context p3, StatsEvent p4) {
        this(p12, e0.a(p3), p2, p3);
        Logger.d("AppLovin|SafeDK: Execution> Lcom/applovin/mediation/ads/MaxAdView;-><init>(Ljava/lang/String;Lcom/applovin/sdk/AppLovinSdk;Landroid/content/Context;)V");
        if ("AppLovin|SafeDK: Execution> Lcom/applovin/mediation/ads/MaxAdView;-><init>(Ljava/lang/String;Lcom/applovin/sdk/AppLovinSdk;Landroid/content/Context;)V" == 0) {
        } else {
            this(p12, e0.a(p3), p2, p3);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    private MaxAdView(String p12, MaxAdFormat p2, Context p3, StatsEvent p4) {
        this(p12, p2, AppLovinSdk.getInstance(p3), p3);
        Logger.d("AppLovin|SafeDK: Execution> Lcom/applovin/mediation/ads/MaxAdView;-><init>(Ljava/lang/String;Lcom/applovin/mediation/MaxAdFormat;Landroid/content/Context;)V");
        if ("AppLovin|SafeDK: Execution> Lcom/applovin/mediation/ads/MaxAdView;-><init>(Ljava/lang/String;Lcom/applovin/mediation/MaxAdFormat;Landroid/content/Context;)V" == 0) {
        } else {
            this(p12, p2, AppLovinSdk.getInstance(p3), p3);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    private MaxAdView(String p12, MaxAdFormat p2, AppLovinSdk p3, Context p4, StatsEvent p5) {
        super(p4.getApplicationContext());
        Logger.d("AppLovin|SafeDK: Execution> Lcom/applovin/mediation/ads/MaxAdView;-><init>(Ljava/lang/String;Lcom/applovin/mediation/MaxAdFormat;Lcom/applovin/sdk/AppLovinSdk;Landroid/content/Context;)V");
        if ("AppLovin|SafeDK: Execution> Lcom/applovin/mediation/ads/MaxAdView;-><init>(Ljava/lang/String;Lcom/applovin/mediation/MaxAdFormat;Lcom/applovin/sdk/AppLovinSdk;Landroid/content/Context;)V" == 0) {
            return;
        }
        super(p4.getApplicationContext());
        com.applovin.impl.mediation.ads.a.logApiCall("MaxAdView", "MaxAdView(adUnitId=" + p12 + ", adFormat=" + p2 + ", sdk=" + p3 + ")");
        a(p12, p2, 49, p3, p4);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    private MaxAdView(Context p12, AttributeSet p2, StatsEvent p3) {
        this(p12, p2, 0);
        Logger.d("AppLovin|SafeDK: Execution> Lcom/applovin/mediation/ads/MaxAdView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V");
        if ("AppLovin|SafeDK: Execution> Lcom/applovin/mediation/ads/MaxAdView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V" == 0) {
        } else {
            this(p12, p2, 0);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    private MaxAdView(Context p12, AttributeSet p2, int p3, StatsEvent p4) {
        super(p12, p2, p3);
        MaxAdFormat a2;
        Logger.d("AppLovin|SafeDK: Execution> Lcom/applovin/mediation/ads/MaxAdView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V");
        if ("AppLovin|SafeDK: Execution> Lcom/applovin/mediation/ads/MaxAdView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V" == 0) {
            return;
        }
        super(p12, p2, p3);
        String a3 = e0.a(p12, p2, AppLovinAdView.NAMESPACE, "adUnitId");
        String a4 = e0.a(p12, p2, AppLovinAdView.NAMESPACE, "adFormat");
        if (StringUtils.isValidString(a4)) {
            a2 = MaxAdFormat.formatFromString(a4);
        } else {
            a2 = e0.a(p12);
        }
        MaxAdFormat maxAdFormat = a2;
        int attributeIntValue = p2.getAttributeIntValue("http://schemas.android.com/apk/res/android", "gravity", 49);
        if (a3 != null) {
            if (!TextUtils.isEmpty(a3)) {
                if (isInEditMode()) {
                    a(p12);
                    return;
                } else {
                    a(a3, maxAdFormat, attributeIntValue, AppLovinSdk.getInstance(p12), p12);
                    return;
                }
            }
            throw new IllegalArgumentException("Empty ad unit ID specified");
        }
        throw new IllegalArgumentException("No ad unit ID specified");
    }

    private void a(Context context) {
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        int i2 = displayMetrics.widthPixels;
        int i3 = displayMetrics.heightPixels;
        TextView textView = new TextView(context);
        textView.setBackgroundColor(Color.rgb(220, 220, 220));
        textView.setTextColor(-16777216);
        textView.setText("AppLovin MAX Ad");
        textView.setGravity(17);
        addView(textView, i2, i3);
    }
}
