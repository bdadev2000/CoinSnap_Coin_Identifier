package J1;

import Q7.n0;
import android.text.TextUtils;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;
import x0.AbstractC2914a;

/* loaded from: classes.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final String f1528a;
    public final JSONObject b;

    /* renamed from: c, reason: collision with root package name */
    public final String f1529c;

    /* renamed from: d, reason: collision with root package name */
    public final String f1530d;

    /* renamed from: e, reason: collision with root package name */
    public final String f1531e;

    /* renamed from: f, reason: collision with root package name */
    public final String f1532f;

    /* renamed from: g, reason: collision with root package name */
    public final String f1533g;

    /* renamed from: h, reason: collision with root package name */
    public final String f1534h;

    /* renamed from: i, reason: collision with root package name */
    public final ArrayList f1535i;

    /* renamed from: j, reason: collision with root package name */
    public final ArrayList f1536j;

    public m(String str) {
        ArrayList arrayList;
        this.f1528a = str;
        JSONObject jSONObject = new JSONObject(str);
        this.b = jSONObject;
        String optString = jSONObject.optString("productId");
        this.f1529c = optString;
        String optString2 = jSONObject.optString("type");
        this.f1530d = optString2;
        if (!TextUtils.isEmpty(optString)) {
            if (!TextUtils.isEmpty(optString2)) {
                this.f1531e = jSONObject.optString(CampaignEx.JSON_KEY_TITLE);
                jSONObject.optString("name");
                this.f1532f = jSONObject.optString("description");
                jSONObject.optString("packageDisplayName");
                jSONObject.optString("iconUrl");
                this.f1533g = jSONObject.optString("skuDetailsToken");
                this.f1534h = jSONObject.optString("serializedDocid");
                JSONArray optJSONArray = jSONObject.optJSONArray("subscriptionOfferDetails");
                if (optJSONArray != null) {
                    ArrayList arrayList2 = new ArrayList();
                    for (int i9 = 0; i9 < optJSONArray.length(); i9++) {
                        arrayList2.add(new l(optJSONArray.getJSONObject(i9)));
                    }
                    this.f1535i = arrayList2;
                } else {
                    if (!optString2.equals("subs") && !optString2.equals("play_pass_subs")) {
                        arrayList = null;
                    } else {
                        arrayList = new ArrayList();
                    }
                    this.f1535i = arrayList;
                }
                JSONObject optJSONObject = this.b.optJSONObject("oneTimePurchaseOfferDetails");
                JSONArray optJSONArray2 = this.b.optJSONArray("oneTimePurchaseOfferDetailsList");
                ArrayList arrayList3 = new ArrayList();
                if (optJSONArray2 != null) {
                    for (int i10 = 0; i10 < optJSONArray2.length(); i10++) {
                        arrayList3.add(new i(optJSONArray2.getJSONObject(i10)));
                    }
                    this.f1536j = arrayList3;
                    return;
                }
                if (optJSONObject != null) {
                    arrayList3.add(new i(optJSONObject));
                    this.f1536j = arrayList3;
                    return;
                } else {
                    this.f1536j = null;
                    return;
                }
            }
            throw new IllegalArgumentException("Product type cannot be empty.");
        }
        throw new IllegalArgumentException("Product id cannot be empty.");
    }

    public final i a() {
        ArrayList arrayList = this.f1536j;
        if (arrayList != null && !arrayList.isEmpty()) {
            return (i) arrayList.get(0);
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        return TextUtils.equals(this.f1528a, ((m) obj).f1528a);
    }

    public final int hashCode() {
        return this.f1528a.hashCode();
    }

    public final String toString() {
        String obj = this.b.toString();
        String valueOf = String.valueOf(this.f1535i);
        StringBuilder sb = new StringBuilder("ProductDetails{jsonString='");
        AbstractC2914a.j(sb, this.f1528a, "', parsedJson=", obj, ", productId='");
        sb.append(this.f1529c);
        sb.append("', productType='");
        sb.append(this.f1530d);
        sb.append("', title='");
        sb.append(this.f1531e);
        sb.append("', productDetailsToken='");
        return n0.m(sb, this.f1533g, "', subscriptionOfferDetails=", valueOf, "}");
    }
}
