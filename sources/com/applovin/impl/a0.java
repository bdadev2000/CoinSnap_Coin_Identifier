package com.applovin.impl;

import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.mediation.MaxAdFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class a0 {
    private final String a;

    /* renamed from: b, reason: collision with root package name */
    private final String f3566b;

    /* renamed from: c, reason: collision with root package name */
    private final lr f3567c;

    /* renamed from: d, reason: collision with root package name */
    private final List f3568d;

    /* renamed from: e, reason: collision with root package name */
    private final List f3569e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f3570f = false;

    public a0(JSONObject jSONObject, Map map, MaxAdFormat maxAdFormat, com.applovin.impl.sdk.k kVar) {
        this.a = JsonUtils.getString(jSONObject, "name", "");
        this.f3566b = JsonUtils.getString(jSONObject, "experiment", null);
        this.f3567c = a(jSONObject);
        this.f3568d = a("bidders", jSONObject, map, maxAdFormat, kVar);
        this.f3569e = a("waterfall", jSONObject, map, maxAdFormat, kVar);
    }

    public List a() {
        return this.f3568d;
    }

    public String b() {
        return this.f3566b;
    }

    public String c() {
        return this.a;
    }

    public lr d() {
        return this.f3567c;
    }

    public List e() {
        return this.f3569e;
    }

    public boolean f() {
        return this.f3570f;
    }

    private List a(String str, JSONObject jSONObject, Map map, MaxAdFormat maxAdFormat, com.applovin.impl.sdk.k kVar) {
        fe feVar;
        ArrayList arrayList = new ArrayList();
        JSONArray jSONArray = JsonUtils.getJSONArray(jSONObject, str, new JSONArray());
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            JSONObject jSONObject2 = JsonUtils.getJSONObject(jSONArray, i10, (JSONObject) null);
            if (jSONObject2 != null && (feVar = (fe) map.get(JsonUtils.getString(jSONObject2, "adapter_class", ""))) != null) {
                if (feVar.A()) {
                    this.f3570f = true;
                }
                arrayList.add(new kr(jSONObject2, maxAdFormat, feVar, kVar));
            }
        }
        return arrayList;
    }

    private lr a(JSONObject jSONObject) {
        return new lr(JsonUtils.getJSONObject(jSONObject, "targeting"));
    }
}
