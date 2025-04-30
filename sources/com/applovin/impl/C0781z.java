package com.applovin.impl;

import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.mediation.MaxAdFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.applovin.impl.z, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0781z implements Comparable {

    /* renamed from: a, reason: collision with root package name */
    private final String f12487a;
    private final String b;

    /* renamed from: c, reason: collision with root package name */
    private final MaxAdFormat f12488c;

    /* renamed from: d, reason: collision with root package name */
    private final C0668a0 f12489d;

    /* renamed from: f, reason: collision with root package name */
    private final List f12490f;

    public C0781z(JSONObject jSONObject, Map map, com.applovin.impl.sdk.k kVar) {
        this.f12487a = JsonUtils.getString(jSONObject, "name", "");
        this.b = JsonUtils.getString(jSONObject, "display_name", "");
        this.f12488c = MaxAdFormat.formatFromString(JsonUtils.getString(jSONObject, "format", null));
        JSONArray jSONArray = JsonUtils.getJSONArray(jSONObject, "waterfalls", new JSONArray());
        this.f12490f = new ArrayList(jSONArray.length());
        for (int i9 = 0; i9 < jSONArray.length(); i9++) {
            JSONObject jSONObject2 = JsonUtils.getJSONObject(jSONArray, i9, (JSONObject) null);
            if (jSONObject2 != null) {
                this.f12490f.add(new C0668a0(jSONObject2, map, this.f12488c, kVar));
            }
        }
        this.f12489d = this.f12490f.isEmpty() ? null : (C0668a0) this.f12490f.get(0);
    }

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(C0781z c0781z) {
        return this.b.compareToIgnoreCase(c0781z.b);
    }

    public String b() {
        MaxAdFormat maxAdFormat = this.f12488c;
        if (maxAdFormat != null) {
            return maxAdFormat.getLabel();
        }
        return "Unknown";
    }

    public String c() {
        return this.f12487a;
    }

    public String d() {
        return this.b;
    }

    public String e() {
        return "\n---------- " + this.b + " ----------\nIdentifier - " + this.f12487a + "\nFormat     - " + b();
    }

    public C0668a0 f() {
        return this.f12489d;
    }

    public List g() {
        return this.f12490f;
    }

    public MaxAdFormat a() {
        return this.f12488c;
    }
}
