package com.applovin.impl;

import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.mediation.MaxAdFormat;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class ir {

    /* renamed from: a, reason: collision with root package name */
    private final jc f24532a;

    /* renamed from: b, reason: collision with root package name */
    private final dg f24533b;

    /* renamed from: c, reason: collision with root package name */
    private final List f24534c;

    public ir(JSONObject jSONObject, MaxAdFormat maxAdFormat, ke keVar, com.applovin.impl.sdk.j jVar) {
        JSONObject jSONObject2 = JsonUtils.getJSONObject(jSONObject, "bidder_placement", (JSONObject) null);
        if (jSONObject2 != null) {
            this.f24533b = new dg(jSONObject2, jVar);
        } else {
            this.f24533b = null;
        }
        this.f24532a = new jc(JsonUtils.getString(jSONObject, "name", ""), JsonUtils.getString(jSONObject, "display_name", ""), jSONObject2 != null, keVar);
        JSONArray jSONArray = JsonUtils.getJSONArray(jSONObject, "placements", new JSONArray());
        this.f24534c = new ArrayList(jSONArray.length());
        for (int i2 = 0; i2 < jSONArray.length(); i2++) {
            JSONObject jSONObject3 = JsonUtils.getJSONObject(jSONArray, i2, (JSONObject) null);
            if (jSONObject3 != null) {
                this.f24534c.add(new dg(jSONObject3, jVar));
            }
        }
    }

    public dg a() {
        return this.f24533b;
    }

    public jc b() {
        return this.f24532a;
    }

    public List c() {
        return this.f24534c;
    }

    public boolean d() {
        return this.f24533b != null;
    }
}
