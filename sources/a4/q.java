package a4;

import com.google.android.gms.internal.play_billing.zzai;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class q {
    public final String a;

    /* renamed from: b, reason: collision with root package name */
    public final long f155b;

    /* renamed from: c, reason: collision with root package name */
    public final String f156c;

    /* renamed from: d, reason: collision with root package name */
    public final String f157d;

    public q(JSONObject jSONObject) {
        this.a = jSONObject.optString("formattedPrice");
        this.f155b = jSONObject.optLong("priceAmountMicros");
        this.f156c = jSONObject.optString("priceCurrencyCode");
        String optString = jSONObject.optString("offerIdToken");
        this.f157d = true == optString.isEmpty() ? null : optString;
        jSONObject.optString("offerId").isEmpty();
        jSONObject.optString("purchaseOptionId").isEmpty();
        jSONObject.optInt("offerType");
        JSONArray optJSONArray = jSONObject.optJSONArray("offerTags");
        ArrayList arrayList = new ArrayList();
        if (optJSONArray != null) {
            for (int i10 = 0; i10 < optJSONArray.length(); i10++) {
                arrayList.add(optJSONArray.getString(i10));
            }
        }
        zzai.zzj(arrayList);
        if (jSONObject.has("fullPriceMicros")) {
            jSONObject.optLong("fullPriceMicros");
        }
        JSONObject optJSONObject = jSONObject.optJSONObject("discountDisplayInfo");
        int i11 = 6;
        if (optJSONObject != null) {
            new com.facebook.b(optJSONObject, i11);
        }
        JSONObject optJSONObject2 = jSONObject.optJSONObject("validTimeWindow");
        int i12 = 7;
        if (optJSONObject2 != null) {
            new z1.d(optJSONObject2, 7);
        }
        JSONObject optJSONObject3 = jSONObject.optJSONObject("limitedQuantityInfo");
        if (optJSONObject3 != null) {
            new z1.d(optJSONObject3, 6);
        }
        JSONObject optJSONObject4 = jSONObject.optJSONObject("preorderDetails");
        if (optJSONObject4 != null) {
            new com.facebook.b(optJSONObject4, i12);
        }
        JSONObject optJSONObject5 = jSONObject.optJSONObject("rentalDetails");
        if (optJSONObject5 != null) {
            new y(optJSONObject5);
        }
    }
}
