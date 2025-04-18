package com.applovin.impl;

import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.mediation.MaxAdFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class a0 {

    /* renamed from: a, reason: collision with root package name */
    private final String f22664a;

    /* renamed from: b, reason: collision with root package name */
    private final String f22665b;

    /* renamed from: c, reason: collision with root package name */
    private final kr f22666c;
    private final List d;
    private final List e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f22667f = false;

    public a0(JSONObject jSONObject, Map map, MaxAdFormat maxAdFormat, com.applovin.impl.sdk.j jVar) {
        this.f22664a = JsonUtils.getString(jSONObject, "name", "");
        this.f22665b = JsonUtils.getString(jSONObject, "experiment", null);
        this.f22666c = a(jSONObject);
        this.d = a("bidders", jSONObject, map, maxAdFormat, jVar);
        this.e = a("waterfall", jSONObject, map, maxAdFormat, jVar);
    }

    public List a() {
        return this.d;
    }

    public String b() {
        return this.f22665b;
    }

    public String c() {
        return this.f22664a;
    }

    public kr d() {
        return this.f22666c;
    }

    public List e() {
        return this.e;
    }

    public boolean f() {
        return this.f22667f;
    }

    private List a(String str, JSONObject jSONObject, Map map, MaxAdFormat maxAdFormat, com.applovin.impl.sdk.j jVar) {
        ke keVar;
        ArrayList arrayList = new ArrayList();
        JSONArray jSONArray = JsonUtils.getJSONArray(jSONObject, str, new JSONArray());
        for (int i2 = 0; i2 < jSONArray.length(); i2++) {
            JSONObject jSONObject2 = JsonUtils.getJSONObject(jSONArray, i2, (JSONObject) null);
            if (jSONObject2 != null && (keVar = (ke) map.get(JsonUtils.getString(jSONObject2, "adapter_class", ""))) != null) {
                if (keVar.B()) {
                    this.f22667f = true;
                }
                arrayList.add(new ir(jSONObject2, maxAdFormat, keVar, jVar));
            }
        }
        return arrayList;
    }

    private kr a(JSONObject jSONObject) {
        return new kr(JsonUtils.getJSONObject(jSONObject, "targeting"));
    }
}
