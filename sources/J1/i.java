package J1;

import com.google.android.gms.internal.play_billing.zzai;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final String f1521a;
    public final long b;

    /* renamed from: c, reason: collision with root package name */
    public final String f1522c;

    /* renamed from: d, reason: collision with root package name */
    public final String f1523d;

    public i(JSONObject jSONObject) {
        this.f1521a = jSONObject.optString("formattedPrice");
        this.b = jSONObject.optLong("priceAmountMicros");
        this.f1522c = jSONObject.optString("priceCurrencyCode");
        String optString = jSONObject.optString("offerIdToken");
        this.f1523d = true == optString.isEmpty() ? null : optString;
        jSONObject.optString("offerId").isEmpty();
        jSONObject.optString("purchaseOptionId").isEmpty();
        jSONObject.optInt("offerType");
        JSONArray optJSONArray = jSONObject.optJSONArray("offerTags");
        ArrayList arrayList = new ArrayList();
        if (optJSONArray != null) {
            for (int i9 = 0; i9 < optJSONArray.length(); i9++) {
                arrayList.add(optJSONArray.getString(i9));
            }
        }
        zzai.zzj(arrayList);
        if (jSONObject.has("fullPriceMicros")) {
            jSONObject.optLong("fullPriceMicros");
        }
        JSONObject optJSONObject = jSONObject.optJSONObject("discountDisplayInfo");
        if (optJSONObject != null) {
            optJSONObject.getInt("percentageDiscount");
        }
        JSONObject optJSONObject2 = jSONObject.optJSONObject("validTimeWindow");
        if (optJSONObject2 != null) {
            optJSONObject2.getLong("startTimeMillis");
            optJSONObject2.getLong("endTimeMillis");
        }
        JSONObject optJSONObject3 = jSONObject.optJSONObject("limitedQuantityInfo");
        if (optJSONObject3 != null) {
            optJSONObject3.getInt("maximumQuantity");
            optJSONObject3.getInt("remainingQuantity");
        }
        JSONObject optJSONObject4 = jSONObject.optJSONObject("preorderDetails");
        if (optJSONObject4 != null) {
            optJSONObject4.getLong("preorderReleaseTimeMillis");
            optJSONObject4.getLong("preorderPresaleEndTimeMillis");
        }
        JSONObject optJSONObject5 = jSONObject.optJSONObject("rentalDetails");
        if (optJSONObject5 != null) {
            optJSONObject5.getString("rentalPeriod");
            optJSONObject5.optString("rentalExpirationPeriod").isEmpty();
        }
    }
}
