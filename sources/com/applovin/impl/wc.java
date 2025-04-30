package com.applovin.impl;

import android.R;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import com.applovin.impl.vc;
import com.applovin.mediation.adapter.MaxAdapterError;
import com.applovin.mediation.adapter.listeners.MaxAdapterListener;
import com.applovin.mediation.adapter.listeners.MaxAppOpenAdapterListener;
import com.applovin.mediation.adapter.listeners.MaxInterstitialAdapterListener;
import x0.AbstractC2914a;

/* loaded from: classes.dex */
public abstract class wc extends Activity implements vc.a {

    /* renamed from: a, reason: collision with root package name */
    protected com.applovin.impl.sdk.k f11978a;
    protected vc b;

    /* renamed from: c, reason: collision with root package name */
    protected xc f11979c = new xc(null);

    /* renamed from: d, reason: collision with root package name */
    private MaxAdapterListener f11980d;

    public void a(View view, String str) {
        if (view == null) {
            a(str);
            return;
        }
        ((ViewGroup) findViewById(R.id.content)).addView(view);
        this.b.bringToFront();
        MaxAdapterListener maxAdapterListener = this.f11980d;
        if (maxAdapterListener instanceof MaxInterstitialAdapterListener) {
            ((MaxInterstitialAdapterListener) maxAdapterListener).onInterstitialAdDisplayed();
        } else {
            if (maxAdapterListener instanceof MaxAppOpenAdapterListener) {
                ((MaxAppOpenAdapterListener) maxAdapterListener).onAppOpenAdDisplayed();
                return;
            }
            throw new IllegalStateException("Failed to fire display callback (" + this.f11980d + "): neither interstitial nor app open ad");
        }
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        boolean z8 = true;
        requestWindowFeature(1);
        getWindow().setFlags(1024, 1024);
        getWindow().addFlags(16777216);
        getWindow().addFlags(128);
        ViewGroup viewGroup = (ViewGroup) findViewById(R.id.content);
        viewGroup.setBackgroundColor(this.f11979c.a());
        com.applovin.impl.sdk.k kVar = this.f11978a;
        if (kVar != null) {
            z8 = ((Boolean) kVar.a(oj.f9607I2)).booleanValue();
        }
        r.a(z8, this);
        vc vcVar = new vc(this.f11979c, this);
        this.b = vcVar;
        vcVar.setListener(this);
        this.b.setVisibility(4);
        viewGroup.addView(this.b);
        ar.a(this.b, this.f11979c.b());
    }

    @Override // android.app.Activity
    public void onDestroy() {
        MaxAdapterListener maxAdapterListener = this.f11980d;
        if (maxAdapterListener != null) {
            if (maxAdapterListener instanceof MaxInterstitialAdapterListener) {
                ((MaxInterstitialAdapterListener) maxAdapterListener).onInterstitialAdHidden();
            } else if (maxAdapterListener instanceof MaxAppOpenAdapterListener) {
                ((MaxAppOpenAdapterListener) maxAdapterListener).onAppOpenAdHidden();
            } else {
                throw new IllegalStateException("Failed to fire hidden callback (" + this.f11980d + "): neither interstitial nor app open ad");
            }
        }
        super.onDestroy();
    }

    private void a(String str) {
        MaxAdapterError maxAdapterError = new MaxAdapterError(MaxAdapterError.ERROR_CODE_AD_DISPLAY_FAILED, AbstractC2914a.e("Null hybrid ad view (", str, ")"));
        MaxAdapterListener maxAdapterListener = this.f11980d;
        if (maxAdapterListener instanceof MaxInterstitialAdapterListener) {
            ((MaxInterstitialAdapterListener) maxAdapterListener).onInterstitialAdDisplayFailed(maxAdapterError);
        } else if (maxAdapterListener instanceof MaxAppOpenAdapterListener) {
            ((MaxAppOpenAdapterListener) maxAdapterListener).onAppOpenAdDisplayFailed(maxAdapterError);
        } else {
            throw new IllegalStateException("Failed to fire display failed callback (" + this.f11980d + "): neither interstitial nor app open ad");
        }
        finish();
    }

    public void a(xc xcVar, com.applovin.impl.sdk.k kVar, MaxAdapterListener maxAdapterListener) {
        this.f11978a = kVar;
        this.f11979c = xcVar;
        this.f11980d = maxAdapterListener;
    }

    @Override // com.applovin.impl.vc.a
    public void a(vc vcVar) {
        if (isFinishing()) {
            return;
        }
        finish();
    }
}
