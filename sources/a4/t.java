package a4;

import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class t {
    public final String a;

    /* renamed from: b, reason: collision with root package name */
    public final s f160b;

    public t(JSONObject jSONObject) {
        jSONObject.optString("basePlanId");
        jSONObject.optString("offerId").isEmpty();
        this.a = jSONObject.getString("offerIdToken");
        this.f160b = new s(jSONObject.getJSONArray("pricingPhases"));
        JSONObject optJSONObject = jSONObject.optJSONObject("installmentPlanDetails");
        if (optJSONObject != null) {
            new ef.b(optJSONObject);
        }
        JSONObject optJSONObject2 = jSONObject.optJSONObject("transitionPlanDetails");
        if (optJSONObject2 != null) {
            new androidx.appcompat.widget.v(optJSONObject2);
        }
        ArrayList arrayList = new ArrayList();
        JSONArray optJSONArray = jSONObject.optJSONArray("offerTags");
        if (optJSONArray != null) {
            for (int i10 = 0; i10 < optJSONArray.length(); i10++) {
                arrayList.add(optJSONArray.getString(i10));
            }
        }
    }
}
