package com.applovin.impl;

import com.amazon.device.ads.AdError;
import com.amazon.device.ads.DTBAdCallback;
import com.amazon.device.ads.DTBAdRequest;
import com.amazon.device.ads.DTBAdResponse;
import com.amazon.device.ads.DTBAdSize;
import com.applovin.mediation.MaxAdFormat;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public class o0 implements DTBAdCallback {

    /* renamed from: a, reason: collision with root package name */
    private final MaxAdFormat f25800a;

    /* renamed from: b, reason: collision with root package name */
    private final a f25801b;

    /* renamed from: c, reason: collision with root package name */
    private DTBAdRequest f25802c;

    /* loaded from: classes.dex */
    public interface a {
        void onAdLoadFailed(AdError adError, MaxAdFormat maxAdFormat);

        void onAdResponseLoaded(DTBAdResponse dTBAdResponse, MaxAdFormat maxAdFormat);
    }

    public o0(p0 p0Var, MaxAdFormat maxAdFormat, a aVar) {
        this(Arrays.asList(p0Var.a()), maxAdFormat, aVar);
    }

    public void a() {
        DTBAdRequest dTBAdRequest = this.f25802c;
        if (dTBAdRequest == null) {
            this.f25801b.onAdLoadFailed(null, this.f25800a);
        } else {
            dTBAdRequest.loadAd(this);
        }
    }

    public void onFailure(AdError adError) {
        this.f25801b.onAdLoadFailed(adError, this.f25800a);
    }

    public void onSuccess(DTBAdResponse dTBAdResponse) {
        this.f25801b.onAdResponseLoaded(dTBAdResponse, this.f25800a);
    }

    public o0(List list, MaxAdFormat maxAdFormat, a aVar) {
        this.f25800a = maxAdFormat;
        this.f25801b = aVar;
        try {
            DTBAdSize[] dTBAdSizeArr = new DTBAdSize[list.size()];
            for (int i2 = 0; i2 < list.size(); i2++) {
                Object obj = list.get(i2);
                if (obj instanceof DTBAdSize) {
                    dTBAdSizeArr[i2] = (DTBAdSize) obj;
                }
            }
            DTBAdRequest dTBAdRequest = new DTBAdRequest();
            this.f25802c = dTBAdRequest;
            dTBAdRequest.setSizes(dTBAdSizeArr);
        } catch (Throwable unused) {
        }
    }
}
