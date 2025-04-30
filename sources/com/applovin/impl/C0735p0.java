package com.applovin.impl;

import com.amazon.device.ads.DTBAdSize;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.mediation.MaxAdFormat;
import org.json.JSONObject;

/* renamed from: com.applovin.impl.p0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0735p0 {

    /* renamed from: a, reason: collision with root package name */
    private final String f9962a;
    private final DTBAdSize b;

    /* renamed from: com.applovin.impl.p0$a */
    /* loaded from: classes.dex */
    public enum a {
        VIDEO,
        DISPLAY,
        INTERSTITIAL
    }

    public C0735p0(String str, JSONObject jSONObject, MaxAdFormat maxAdFormat) {
        this.f9962a = str;
        this.b = a(JsonUtils.getInt(jSONObject, "type", a(maxAdFormat).ordinal()), maxAdFormat, str);
    }

    public DTBAdSize a() {
        return this.b;
    }

    private a a(MaxAdFormat maxAdFormat) {
        return maxAdFormat.isAdViewAd() ? a.DISPLAY : a.INTERSTITIAL;
    }

    private DTBAdSize a(int i9, MaxAdFormat maxAdFormat, String str) {
        try {
            if (a.VIDEO.ordinal() == i9) {
                return new DTBAdSize.DTBVideo(320, 480, str);
            }
            if (a.DISPLAY.ordinal() == i9) {
                return new DTBAdSize(maxAdFormat.getSize().getWidth(), maxAdFormat.getSize().getHeight(), str);
            }
            if (a.INTERSTITIAL.ordinal() == i9) {
                return new DTBAdSize.DTBInterstitialAdSize(str);
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }
}
