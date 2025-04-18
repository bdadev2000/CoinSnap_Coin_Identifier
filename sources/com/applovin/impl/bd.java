package com.applovin.impl;

import android.R;
import android.app.Activity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import com.applovin.impl.ad;
import com.applovin.mediation.adapter.MaxAdapterError;
import com.applovin.mediation.adapter.listeners.MaxAdapterListener;
import com.applovin.mediation.adapter.listeners.MaxAppOpenAdapterListener;
import com.applovin.mediation.adapter.listeners.MaxInterstitialAdapterListener;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import okhttp3.internal.http2.Http2Connection;

/* loaded from: classes3.dex */
public abstract class bd extends Activity implements ad.a {

    /* renamed from: a, reason: collision with root package name */
    protected com.applovin.impl.sdk.j f23055a;

    /* renamed from: b, reason: collision with root package name */
    protected ad f23056b;

    /* renamed from: c, reason: collision with root package name */
    protected cd f23057c = new cd(null);
    private MaxAdapterListener d;

    public void a(cd cdVar, com.applovin.impl.sdk.j jVar, MaxAdapterListener maxAdapterListener) {
        this.f23055a = jVar;
        this.f23057c = cdVar;
        this.d = maxAdapterListener;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.activityOnTouch(com.safedk.android.utils.g.f30048a, me);
        return super.dispatchTouchEvent(me);
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        requestWindowFeature(1);
        getWindow().setFlags(1024, 1024);
        getWindow().addFlags(Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE);
        getWindow().addFlags(128);
        ViewGroup viewGroup = (ViewGroup) findViewById(R.id.content);
        viewGroup.setBackgroundColor(this.f23057c.a());
        com.applovin.impl.sdk.j jVar = this.f23055a;
        r.a(jVar != null ? ((Boolean) jVar.a(sj.N2)).booleanValue() : true, this);
        ad adVar = new ad(this.f23057c, this);
        this.f23056b = adVar;
        adVar.setListener(this);
        this.f23056b.setVisibility(4);
        viewGroup.addView(this.f23056b);
        zq.a(this.f23056b, this.f23057c.b());
    }

    @Override // android.app.Activity
    public void onDestroy() {
        MaxAdapterListener maxAdapterListener = this.d;
        if (maxAdapterListener != null) {
            if (maxAdapterListener instanceof MaxInterstitialAdapterListener) {
                ((MaxInterstitialAdapterListener) maxAdapterListener).onInterstitialAdHidden();
            } else {
                if (!(maxAdapterListener instanceof MaxAppOpenAdapterListener)) {
                    throw new IllegalStateException("Failed to fire hidden callback (" + this.d + "): neither interstitial nor app open ad");
                }
                ((MaxAppOpenAdapterListener) maxAdapterListener).onAppOpenAdHidden();
            }
        }
        super.onDestroy();
    }

    private void a(String str) {
        MaxAdapterError maxAdapterError = new MaxAdapterError(MaxAdapterError.ERROR_CODE_AD_DISPLAY_FAILED, androidx.compose.foundation.text.input.a.A("Null hybrid ad view (", str, ")"));
        MaxAdapterListener maxAdapterListener = this.d;
        if (maxAdapterListener instanceof MaxInterstitialAdapterListener) {
            ((MaxInterstitialAdapterListener) maxAdapterListener).onInterstitialAdDisplayFailed(maxAdapterError);
        } else if (maxAdapterListener instanceof MaxAppOpenAdapterListener) {
            ((MaxAppOpenAdapterListener) maxAdapterListener).onAppOpenAdDisplayFailed(maxAdapterError);
        } else {
            throw new IllegalStateException("Failed to fire display failed callback (" + this.d + "): neither interstitial nor app open ad");
        }
        finish();
    }

    public void a(View view, String str) {
        if (view == null) {
            a(str);
            return;
        }
        ((ViewGroup) findViewById(R.id.content)).addView(view);
        this.f23056b.bringToFront();
        MaxAdapterListener maxAdapterListener = this.d;
        if (maxAdapterListener instanceof MaxInterstitialAdapterListener) {
            ((MaxInterstitialAdapterListener) maxAdapterListener).onInterstitialAdDisplayed();
        } else {
            if (maxAdapterListener instanceof MaxAppOpenAdapterListener) {
                ((MaxAppOpenAdapterListener) maxAdapterListener).onAppOpenAdDisplayed();
                return;
            }
            throw new IllegalStateException("Failed to fire display callback (" + this.d + "): neither interstitial nor app open ad");
        }
    }

    @Override // com.applovin.impl.ad.a
    public void a(ad adVar) {
        if (isFinishing()) {
            return;
        }
        finish();
    }
}
