package J1;

import org.json.JSONObject;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final String f1524a;
    public final long b;

    /* renamed from: c, reason: collision with root package name */
    public final String f1525c;

    public j(JSONObject jSONObject) {
        jSONObject.optString("billingPeriod");
        this.f1525c = jSONObject.optString("priceCurrencyCode");
        this.f1524a = jSONObject.optString("formattedPrice");
        this.b = jSONObject.optLong("priceAmountMicros");
        jSONObject.optInt("recurrenceMode");
        jSONObject.optInt("billingCycleCount");
    }
}
