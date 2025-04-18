package com.applovin.impl;

import com.applovin.impl.sdk.utils.JsonUtils;
import com.google.firebase.analytics.FirebaseAnalytics;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class dg {

    /* renamed from: a, reason: collision with root package name */
    private final String f23483a;

    /* renamed from: b, reason: collision with root package name */
    private final String f23484b;

    public dg(JSONObject jSONObject, com.applovin.impl.sdk.j jVar) {
        this.f23483a = JsonUtils.getString(jSONObject, "id", "");
        this.f23484b = JsonUtils.getString(jSONObject, FirebaseAnalytics.Param.PRICE, null);
    }

    public String a() {
        return this.f23483a;
    }

    public String b() {
        return this.f23484b;
    }
}
