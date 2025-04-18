package com.applovin.impl;

import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.mediation.MaxAdFormat;
import com.facebook.internal.AnalyticsEvents;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class z implements Comparable {

    /* renamed from: a, reason: collision with root package name */
    private final String f28247a;

    /* renamed from: b, reason: collision with root package name */
    private final String f28248b;

    /* renamed from: c, reason: collision with root package name */
    private final MaxAdFormat f28249c;
    private final a0 d;

    /* renamed from: f, reason: collision with root package name */
    private final List f28250f;

    public z(JSONObject jSONObject, Map map, com.applovin.impl.sdk.j jVar) {
        this.f28247a = JsonUtils.getString(jSONObject, "name", "");
        this.f28248b = JsonUtils.getString(jSONObject, "display_name", "");
        this.f28249c = MaxAdFormat.formatFromString(JsonUtils.getString(jSONObject, "format", null));
        JSONArray jSONArray = JsonUtils.getJSONArray(jSONObject, "waterfalls", new JSONArray());
        this.f28250f = new ArrayList(jSONArray.length());
        for (int i2 = 0; i2 < jSONArray.length(); i2++) {
            JSONObject jSONObject2 = JsonUtils.getJSONObject(jSONArray, i2, (JSONObject) null);
            if (jSONObject2 != null) {
                this.f28250f.add(new a0(jSONObject2, map, this.f28249c, jVar));
            }
        }
        this.d = this.f28250f.isEmpty() ? null : (a0) this.f28250f.get(0);
    }

    public MaxAdFormat a() {
        return this.f28249c;
    }

    public String b() {
        MaxAdFormat maxAdFormat = this.f28249c;
        return maxAdFormat != null ? maxAdFormat.getLabel() : AnalyticsEvents.PARAMETER_DIALOG_OUTCOME_VALUE_UNKNOWN;
    }

    public String c() {
        return this.f28247a;
    }

    public String d() {
        return this.f28248b;
    }

    public String e() {
        return "\n---------- " + this.f28248b + " ----------\nIdentifier - " + this.f28247a + "\nFormat     - " + b();
    }

    public a0 f() {
        return this.d;
    }

    public List g() {
        return this.f28250f;
    }

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(z zVar) {
        return this.f28248b.compareToIgnoreCase(zVar.f28248b);
    }
}
