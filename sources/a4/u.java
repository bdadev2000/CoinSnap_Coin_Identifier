package a4;

import android.text.TextUtils;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class u {
    public final String a;

    /* renamed from: b, reason: collision with root package name */
    public final JSONObject f161b;

    /* renamed from: c, reason: collision with root package name */
    public final String f162c;

    /* renamed from: d, reason: collision with root package name */
    public final String f163d;

    /* renamed from: e, reason: collision with root package name */
    public final String f164e;

    /* renamed from: f, reason: collision with root package name */
    public final String f165f;

    /* renamed from: g, reason: collision with root package name */
    public final String f166g;

    /* renamed from: h, reason: collision with root package name */
    public final String f167h;

    /* renamed from: i, reason: collision with root package name */
    public final ArrayList f168i;

    /* renamed from: j, reason: collision with root package name */
    public final ArrayList f169j;

    public u(String str) {
        ArrayList arrayList;
        this.a = str;
        JSONObject jSONObject = new JSONObject(str);
        this.f161b = jSONObject;
        String optString = jSONObject.optString("productId");
        this.f162c = optString;
        String optString2 = jSONObject.optString("type");
        this.f163d = optString2;
        if (!TextUtils.isEmpty(optString)) {
            if (!TextUtils.isEmpty(optString2)) {
                this.f164e = jSONObject.optString(CampaignEx.JSON_KEY_TITLE);
                jSONObject.optString("name");
                this.f165f = jSONObject.optString("description");
                jSONObject.optString("packageDisplayName");
                jSONObject.optString("iconUrl");
                this.f166g = jSONObject.optString("skuDetailsToken");
                this.f167h = jSONObject.optString("serializedDocid");
                JSONArray optJSONArray = jSONObject.optJSONArray("subscriptionOfferDetails");
                if (optJSONArray != null) {
                    ArrayList arrayList2 = new ArrayList();
                    for (int i10 = 0; i10 < optJSONArray.length(); i10++) {
                        arrayList2.add(new t(optJSONArray.getJSONObject(i10)));
                    }
                    this.f168i = arrayList2;
                } else {
                    if (!optString2.equals("subs") && !optString2.equals("play_pass_subs")) {
                        arrayList = null;
                    } else {
                        arrayList = new ArrayList();
                    }
                    this.f168i = arrayList;
                }
                JSONObject optJSONObject = this.f161b.optJSONObject("oneTimePurchaseOfferDetails");
                JSONArray optJSONArray2 = this.f161b.optJSONArray("oneTimePurchaseOfferDetailsList");
                ArrayList arrayList3 = new ArrayList();
                if (optJSONArray2 != null) {
                    for (int i11 = 0; i11 < optJSONArray2.length(); i11++) {
                        arrayList3.add(new q(optJSONArray2.getJSONObject(i11)));
                    }
                    this.f169j = arrayList3;
                    return;
                }
                if (optJSONObject != null) {
                    arrayList3.add(new q(optJSONObject));
                    this.f169j = arrayList3;
                    return;
                } else {
                    this.f169j = null;
                    return;
                }
            }
            throw new IllegalArgumentException("Product type cannot be empty.");
        }
        throw new IllegalArgumentException("Product id cannot be empty.");
    }

    public final q a() {
        ArrayList arrayList = this.f169j;
        if (arrayList != null && !arrayList.isEmpty()) {
            return (q) arrayList.get(0);
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        return TextUtils.equals(this.a, ((u) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        String obj = this.f161b.toString();
        String valueOf = String.valueOf(this.f168i);
        StringBuilder sb2 = new StringBuilder("ProductDetails{jsonString='");
        sb2.append(this.a);
        sb2.append("', parsedJson=");
        sb2.append(obj);
        sb2.append(", productId='");
        sb2.append(this.f162c);
        sb2.append("', productType='");
        sb2.append(this.f163d);
        sb2.append("', title='");
        sb2.append(this.f164e);
        sb2.append("', productDetailsToken='");
        return j.k(sb2, this.f166g, "', subscriptionOfferDetails=", valueOf, "}");
    }
}
