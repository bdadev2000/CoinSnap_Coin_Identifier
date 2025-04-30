package J1;

import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public final String f1527a;
    public final k b;

    public l(JSONObject jSONObject) {
        jSONObject.optString("basePlanId");
        jSONObject.optString("offerId").getClass();
        this.f1527a = jSONObject.getString("offerIdToken");
        this.b = new k(jSONObject.getJSONArray("pricingPhases"));
        JSONObject optJSONObject = jSONObject.optJSONObject("installmentPlanDetails");
        if (optJSONObject != null) {
            optJSONObject.getInt("commitmentPaymentsCount");
            optJSONObject.optInt("subsequentCommitmentPaymentsCount");
        }
        JSONObject optJSONObject2 = jSONObject.optJSONObject("transitionPlanDetails");
        if (optJSONObject2 != null) {
            optJSONObject2.getString("productId");
            optJSONObject2.optString(CampaignEx.JSON_KEY_TITLE);
            optJSONObject2.optString("name");
            optJSONObject2.optString("description");
            optJSONObject2.optString("basePlanId");
            JSONObject optJSONObject3 = optJSONObject2.optJSONObject("pricingPhase");
            if (optJSONObject3 != null) {
                optJSONObject3.optString("billingPeriod");
                optJSONObject3.optString("priceCurrencyCode");
                optJSONObject3.optString("formattedPrice");
                optJSONObject3.optLong("priceAmountMicros");
                optJSONObject3.optInt("recurrenceMode");
                optJSONObject3.optInt("billingCycleCount");
            }
        }
        ArrayList arrayList = new ArrayList();
        JSONArray optJSONArray = jSONObject.optJSONArray("offerTags");
        if (optJSONArray != null) {
            for (int i9 = 0; i9 < optJSONArray.length(); i9++) {
                arrayList.add(optJSONArray.getString(i9));
            }
        }
    }
}
