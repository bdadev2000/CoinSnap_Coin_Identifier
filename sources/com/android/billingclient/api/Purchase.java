package com.android.billingclient.api;

import android.text.TextUtils;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class Purchase {

    /* renamed from: a, reason: collision with root package name */
    public final String f5614a;
    public final String b;

    /* renamed from: c, reason: collision with root package name */
    public final JSONObject f5615c;

    public Purchase(String str, String str2) {
        this.f5614a = str;
        this.b = str2;
        this.f5615c = new JSONObject(str);
    }

    public final ArrayList a() {
        ArrayList arrayList = new ArrayList();
        JSONObject jSONObject = this.f5615c;
        if (jSONObject.has("productIds")) {
            JSONArray optJSONArray = jSONObject.optJSONArray("productIds");
            if (optJSONArray != null) {
                for (int i9 = 0; i9 < optJSONArray.length(); i9++) {
                    arrayList.add(optJSONArray.optString(i9));
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
        if (TextUtils.equals(this.f5614a, purchase.f5614a) && TextUtils.equals(this.b, purchase.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f5614a.hashCode();
    }

    public final String toString() {
        return "Purchase. Json: ".concat(String.valueOf(this.f5614a));
    }
}
