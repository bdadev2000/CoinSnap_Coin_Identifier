package com.android.billingclient.api;

import android.text.TextUtils;
import com.mbridge.msdk.mbbid.out.BidResponsed;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class Purchase {
    public final String a;

    /* renamed from: b, reason: collision with root package name */
    public final String f2942b;

    /* renamed from: c, reason: collision with root package name */
    public final JSONObject f2943c;

    public Purchase(String str, String str2) {
        this.a = str;
        this.f2942b = str2;
        this.f2943c = new JSONObject(str);
    }

    public final int a() {
        return this.f2943c.optInt("purchaseState", 1) != 4 ? 1 : 2;
    }

    public final String b() {
        JSONObject jSONObject = this.f2943c;
        return jSONObject.optString(BidResponsed.KEY_TOKEN, jSONObject.optString("purchaseToken"));
    }

    public final ArrayList c() {
        ArrayList arrayList = new ArrayList();
        JSONObject jSONObject = this.f2943c;
        if (jSONObject.has("productIds")) {
            JSONArray optJSONArray = jSONObject.optJSONArray("productIds");
            if (optJSONArray != null) {
                for (int i10 = 0; i10 < optJSONArray.length(); i10++) {
                    arrayList.add(optJSONArray.optString(i10));
                }
            }
        } else if (jSONObject.has("productId")) {
            arrayList.add(jSONObject.optString("productId"));
        }
        return arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Purchase)) {
            return false;
        }
        Purchase purchase = (Purchase) obj;
        if (TextUtils.equals(this.a, purchase.a) && TextUtils.equals(this.f2942b, purchase.f2942b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Purchase. Json: ".concat(String.valueOf(this.a));
    }
}
