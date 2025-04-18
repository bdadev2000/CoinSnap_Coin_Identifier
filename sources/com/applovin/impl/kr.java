package com.applovin.impl;

import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.mediation.MaxAdFormat;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class kr {
    private final ec a;

    /* renamed from: b, reason: collision with root package name */
    private final yf f5778b;

    /* renamed from: c, reason: collision with root package name */
    private final List f5779c;

    public kr(JSONObject jSONObject, MaxAdFormat maxAdFormat, fe feVar, com.applovin.impl.sdk.k kVar) {
        boolean z10;
        JSONObject jSONObject2 = JsonUtils.getJSONObject(jSONObject, "bidder_placement", (JSONObject) null);
        if (jSONObject2 != null) {
            this.f5778b = new yf(jSONObject2, kVar);
        } else {
            this.f5778b = null;
        }
        String string = JsonUtils.getString(jSONObject, "name", "");
        String string2 = JsonUtils.getString(jSONObject, "display_name", "");
        if (jSONObject2 != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.a = new ec(string, string2, z10, feVar);
        JSONArray jSONArray = JsonUtils.getJSONArray(jSONObject, "placements", new JSONArray());
        this.f5779c = new ArrayList(jSONArray.length());
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            JSONObject jSONObject3 = JsonUtils.getJSONObject(jSONArray, i10, (JSONObject) null);
            if (jSONObject3 != null) {
                this.f5779c.add(new yf(jSONObject3, kVar));
            }
        }
    }

    public yf a() {
        return this.f5778b;
    }

    public ec b() {
        return this.a;
    }

    public List c() {
        return this.f5779c;
    }

    public boolean d() {
        return this.f5778b != null;
    }
}
