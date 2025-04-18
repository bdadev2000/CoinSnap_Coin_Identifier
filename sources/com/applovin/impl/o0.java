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
    private final MaxAdFormat a;

    /* renamed from: b, reason: collision with root package name */
    private final a f6445b;

    /* renamed from: c, reason: collision with root package name */
    private DTBAdRequest f6446c;

    /* loaded from: classes.dex */
    public interface a {
        void onAdLoadFailed(AdError adError, MaxAdFormat maxAdFormat);

        void onAdResponseLoaded(DTBAdResponse dTBAdResponse, MaxAdFormat maxAdFormat);
    }

    public o0(p0 p0Var, MaxAdFormat maxAdFormat, a aVar) {
        this(Arrays.asList(p0Var.a()), maxAdFormat, aVar);
    }

    public void a() {
        DTBAdRequest dTBAdRequest = this.f6446c;
        if (dTBAdRequest == null) {
            this.f6445b.onAdLoadFailed(null, this.a);
        } else {
            dTBAdRequest.loadAd(this);
        }
    }

    public void onFailure(AdError adError) {
        this.f6445b.onAdLoadFailed(adError, this.a);
    }

    public void onSuccess(DTBAdResponse dTBAdResponse) {
        this.f6445b.onAdResponseLoaded(dTBAdResponse, this.a);
    }

    public o0(List list, MaxAdFormat maxAdFormat, a aVar) {
        this.a = maxAdFormat;
        this.f6445b = aVar;
        try {
            DTBAdSize[] dTBAdSizeArr = new DTBAdSize[list.size()];
            for (int i10 = 0; i10 < list.size(); i10++) {
                Object obj = list.get(i10);
                if (obj instanceof DTBAdSize) {
                    dTBAdSizeArr[i10] = (DTBAdSize) obj;
                }
            }
            DTBAdRequest dTBAdRequest = new DTBAdRequest();
            this.f6446c = dTBAdRequest;
            dTBAdRequest.setSizes(dTBAdSizeArr);
        } catch (Throwable unused) {
        }
    }
}
