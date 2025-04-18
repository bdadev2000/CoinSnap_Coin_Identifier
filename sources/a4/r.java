package a4;

import org.json.JSONObject;

/* loaded from: classes.dex */
public final class r {
    public final String a;

    /* renamed from: b, reason: collision with root package name */
    public final long f158b;

    /* renamed from: c, reason: collision with root package name */
    public final String f159c;

    public r(JSONObject jSONObject) {
        jSONObject.optString("billingPeriod");
        this.f159c = jSONObject.optString("priceCurrencyCode");
        this.a = jSONObject.optString("formattedPrice");
        this.f158b = jSONObject.optLong("priceAmountMicros");
        jSONObject.optInt("recurrenceMode");
        jSONObject.optInt("billingCycleCount");
    }
}
