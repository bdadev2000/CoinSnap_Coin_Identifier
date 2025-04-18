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
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;

/* loaded from: classes.dex */
public abstract class wc extends Activity implements vc.a {
    protected com.applovin.impl.sdk.k a;

    /* renamed from: b, reason: collision with root package name */
    protected vc f8766b;

    /* renamed from: c, reason: collision with root package name */
    protected xc f8767c = new xc(null);

    /* renamed from: d, reason: collision with root package name */
    private MaxAdapterListener f8768d;

    private void a(String str) {
        MaxAdapterError maxAdapterError = new MaxAdapterError(MaxAdapterError.ERROR_CODE_AD_DISPLAY_FAILED, com.applovin.impl.mediation.ads.e.f("Null hybrid ad view (", str, ")"));
        MaxAdapterListener maxAdapterListener = this.f8768d;
        if (maxAdapterListener instanceof MaxInterstitialAdapterListener) {
            ((MaxInterstitialAdapterListener) maxAdapterListener).onInterstitialAdDisplayFailed(maxAdapterError);
        } else if (maxAdapterListener instanceof MaxAppOpenAdapterListener) {
            ((MaxAppOpenAdapterListener) maxAdapterListener).onAppOpenAdDisplayFailed(maxAdapterError);
        } else {
            throw new IllegalStateException("Failed to fire display failed callback (" + this.f8768d + "): neither interstitial nor app open ad");
        }
        finish();
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        boolean z10 = true;
        requestWindowFeature(1);
        getWindow().setFlags(LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY, LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY);
        getWindow().addFlags(16777216);
        getWindow().addFlags(128);
        ViewGroup viewGroup = (ViewGroup) findViewById(R.id.content);
        viewGroup.setBackgroundColor(this.f8767c.a());
        com.applovin.impl.sdk.k kVar = this.a;
        if (kVar != null) {
            z10 = ((Boolean) kVar.a(oj.I2)).booleanValue();
        }
        r.a(z10, this);
        vc vcVar = new vc(this.f8767c, this);
        this.f8766b = vcVar;
        vcVar.setListener(this);
        this.f8766b.setVisibility(4);
        viewGroup.addView(this.f8766b);
        ar.a(this.f8766b, this.f8767c.b());
    }

    @Override // android.app.Activity
    public void onDestroy() {
        MaxAdapterListener maxAdapterListener = this.f8768d;
        if (maxAdapterListener != null) {
            if (maxAdapterListener instanceof MaxInterstitialAdapterListener) {
                ((MaxInterstitialAdapterListener) maxAdapterListener).onInterstitialAdHidden();
            } else if (maxAdapterListener instanceof MaxAppOpenAdapterListener) {
                ((MaxAppOpenAdapterListener) maxAdapterListener).onAppOpenAdHidden();
            } else {
                throw new IllegalStateException("Failed to fire hidden callback (" + this.f8768d + "): neither interstitial nor app open ad");
            }
        }
        super.onDestroy();
    }

    public void a(View view, String str) {
        if (view == null) {
            a(str);
            return;
        }
        ((ViewGroup) findViewById(R.id.content)).addView(view);
        this.f8766b.bringToFront();
        MaxAdapterListener maxAdapterListener = this.f8768d;
        if (maxAdapterListener instanceof MaxInterstitialAdapterListener) {
            ((MaxInterstitialAdapterListener) maxAdapterListener).onInterstitialAdDisplayed();
        } else {
            if (maxAdapterListener instanceof MaxAppOpenAdapterListener) {
                ((MaxAppOpenAdapterListener) maxAdapterListener).onAppOpenAdDisplayed();
                return;
            }
            throw new IllegalStateException("Failed to fire display callback (" + this.f8768d + "): neither interstitial nor app open ad");
        }
    }

    public void a(xc xcVar, com.applovin.impl.sdk.k kVar, MaxAdapterListener maxAdapterListener) {
        this.a = kVar;
        this.f8767c = xcVar;
        this.f8768d = maxAdapterListener;
    }

    @Override // com.applovin.impl.vc.a
    public void a(vc vcVar) {
        if (isFinishing()) {
            return;
        }
        finish();
    }
}
