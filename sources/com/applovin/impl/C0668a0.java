package com.applovin.impl;

import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.mediation.MaxAdFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.applovin.impl.a0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0668a0 {

    /* renamed from: a, reason: collision with root package name */
    private final String f6544a;
    private final String b;

    /* renamed from: c, reason: collision with root package name */
    private final lr f6545c;

    /* renamed from: d, reason: collision with root package name */
    private final List f6546d;

    /* renamed from: e, reason: collision with root package name */
    private final List f6547e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f6548f = false;

    public C0668a0(JSONObject jSONObject, Map map, MaxAdFormat maxAdFormat, com.applovin.impl.sdk.k kVar) {
        this.f6544a = JsonUtils.getString(jSONObject, "name", "");
        this.b = JsonUtils.getString(jSONObject, "experiment", null);
        this.f6545c = a(jSONObject);
        this.f6546d = a("bidders", jSONObject, map, maxAdFormat, kVar);
        this.f6547e = a("waterfall", jSONObject, map, maxAdFormat, kVar);
    }

    public List a() {
        return this.f6546d;
    }

    public String b() {
        return this.b;
    }

    public String c() {
        return this.f6544a;
    }

    public lr d() {
        return this.f6545c;
    }

    public List e() {
        return this.f6547e;
    }

    public boolean f() {
        return this.f6548f;
    }

    private List a(String str, JSONObject jSONObject, Map map, MaxAdFormat maxAdFormat, com.applovin.impl.sdk.k kVar) {
        fe feVar;
        ArrayList arrayList = new ArrayList();
        JSONArray jSONArray = JsonUtils.getJSONArray(jSONObject, str, new JSONArray());
        for (int i9 = 0; i9 < jSONArray.length(); i9++) {
            JSONObject jSONObject2 = JsonUtils.getJSONObject(jSONArray, i9, (JSONObject) null);
            if (jSONObject2 != null && (feVar = (fe) map.get(JsonUtils.getString(jSONObject2, "adapter_class", ""))) != null) {
                if (feVar.A()) {
                    this.f6548f = true;
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
