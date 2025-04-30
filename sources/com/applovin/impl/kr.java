package com.applovin.impl;

import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.mediation.MaxAdFormat;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class kr {

    /* renamed from: a, reason: collision with root package name */
    private final ec f8755a;
    private final yf b;

    /* renamed from: c, reason: collision with root package name */
    private final List f8756c;

    public kr(JSONObject jSONObject, MaxAdFormat maxAdFormat, fe feVar, com.applovin.impl.sdk.k kVar) {
        boolean z8;
        JSONObject jSONObject2 = JsonUtils.getJSONObject(jSONObject, "bidder_placement", (JSONObject) null);
        if (jSONObject2 != null) {
            this.b = new yf(jSONObject2, kVar);
        } else {
            this.b = null;
        }
        String string = JsonUtils.getString(jSONObject, "name", "");
        String string2 = JsonUtils.getString(jSONObject, "display_name", "");
        if (jSONObject2 != null) {
            z8 = true;
        } else {
            z8 = false;
        }
        this.f8755a = new ec(string, string2, z8, feVar);
        JSONArray jSONArray = JsonUtils.getJSONArray(jSONObject, "placements", new JSONArray());
        this.f8756c = new ArrayList(jSONArray.length());
        for (int i9 = 0; i9 < jSONArray.length(); i9++) {
            JSONObject jSONObject3 = JsonUtils.getJSONObject(jSONArray, i9, (JSONObject) null);
            if (jSONObject3 != null) {
                this.f8756c.add(new yf(jSONObject3, kVar));
            }
        }
    }

    public yf a() {
        return this.b;
    }

    public ec b() {
        return this.f8755a;
    }

    public List c() {
        return this.f8756c;
    }

    public boolean d() {
        if (this.b != null) {
            return true;
        }
        return false;
    }
}
