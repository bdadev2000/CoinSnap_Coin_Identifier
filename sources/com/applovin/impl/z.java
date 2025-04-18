package com.applovin.impl;

import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.mediation.MaxAdFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class z implements Comparable {
    private final String a;

    /* renamed from: b, reason: collision with root package name */
    private final String f9304b;

    /* renamed from: c, reason: collision with root package name */
    private final MaxAdFormat f9305c;

    /* renamed from: d, reason: collision with root package name */
    private final a0 f9306d;

    /* renamed from: f, reason: collision with root package name */
    private final List f9307f;

    public z(JSONObject jSONObject, Map map, com.applovin.impl.sdk.k kVar) {
        this.a = JsonUtils.getString(jSONObject, "name", "");
        this.f9304b = JsonUtils.getString(jSONObject, "display_name", "");
        this.f9305c = MaxAdFormat.formatFromString(JsonUtils.getString(jSONObject, "format", null));
        JSONArray jSONArray = JsonUtils.getJSONArray(jSONObject, "waterfalls", new JSONArray());
        this.f9307f = new ArrayList(jSONArray.length());
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            JSONObject jSONObject2 = JsonUtils.getJSONObject(jSONArray, i10, (JSONObject) null);
            if (jSONObject2 != null) {
                this.f9307f.add(new a0(jSONObject2, map, this.f9305c, kVar));
            }
        }
        this.f9306d = this.f9307f.isEmpty() ? null : (a0) this.f9307f.get(0);
    }

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(z zVar) {
        return this.f9304b.compareToIgnoreCase(zVar.f9304b);
    }

    public String b() {
        MaxAdFormat maxAdFormat = this.f9305c;
        return maxAdFormat != null ? maxAdFormat.getLabel() : "Unknown";
    }

    public String c() {
        return this.a;
    }

    public String d() {
        return this.f9304b;
    }

    public String e() {
        return "\n---------- " + this.f9304b + " ----------\nIdentifier - " + this.a + "\nFormat     - " + b();
    }

    public a0 f() {
        return this.f9306d;
    }

    public List g() {
        return this.f9307f;
    }

    public MaxAdFormat a() {
        return this.f9305c;
    }
}
