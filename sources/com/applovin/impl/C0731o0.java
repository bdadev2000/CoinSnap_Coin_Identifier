package com.applovin.impl;

import com.amazon.device.ads.AdError;
import com.amazon.device.ads.DTBAdCallback;
import com.amazon.device.ads.DTBAdRequest;
import com.amazon.device.ads.DTBAdResponse;
import com.amazon.device.ads.DTBAdSize;
import com.applovin.mediation.MaxAdFormat;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.applovin.impl.o0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0731o0 implements DTBAdCallback {

    /* renamed from: a, reason: collision with root package name */
    private final MaxAdFormat f9374a;
    private final a b;

    /* renamed from: c, reason: collision with root package name */
    private DTBAdRequest f9375c;

    /* renamed from: com.applovin.impl.o0$a */
    /* loaded from: classes.dex */
    public interface a {
        void onAdLoadFailed(AdError adError, MaxAdFormat maxAdFormat);

        void onAdResponseLoaded(DTBAdResponse dTBAdResponse, MaxAdFormat maxAdFormat);
    }

    public C0731o0(C0735p0 c0735p0, MaxAdFormat maxAdFormat, a aVar) {
        this(Arrays.asList(c0735p0.a()), maxAdFormat, aVar);
    }

    public void a() {
        DTBAdRequest dTBAdRequest = this.f9375c;
        if (dTBAdRequest == null) {
            this.b.onAdLoadFailed(null, this.f9374a);
        } else {
            dTBAdRequest.loadAd(this);
        }
    }

    public void onFailure(AdError adError) {
        this.b.onAdLoadFailed(adError, this.f9374a);
    }

    public void onSuccess(DTBAdResponse dTBAdResponse) {
        this.b.onAdResponseLoaded(dTBAdResponse, this.f9374a);
    }

    public C0731o0(List list, MaxAdFormat maxAdFormat, a aVar) {
        this.f9374a = maxAdFormat;
        this.b = aVar;
        try {
            DTBAdSize[] dTBAdSizeArr = new DTBAdSize[list.size()];
            for (int i9 = 0; i9 < list.size(); i9++) {
                Object obj = list.get(i9);
                if (obj instanceof DTBAdSize) {
                    dTBAdSizeArr[i9] = (DTBAdSize) obj;
                }
            }
            DTBAdRequest dTBAdRequest = new DTBAdRequest();
            this.f9375c = dTBAdRequest;
            dTBAdRequest.setSizes(dTBAdSizeArr);
        } catch (Throwable unused) {
        }
    }
}
