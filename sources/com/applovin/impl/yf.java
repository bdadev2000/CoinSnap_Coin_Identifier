package com.applovin.impl;

import com.applovin.impl.sdk.utils.JsonUtils;
import com.mbridge.msdk.mbbid.out.BidResponsed;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class yf {
    private final String a;

    /* renamed from: b, reason: collision with root package name */
    private final String f9202b;

    public yf(JSONObject jSONObject, com.applovin.impl.sdk.k kVar) {
        this.a = JsonUtils.getString(jSONObject, "id", "");
        this.f9202b = JsonUtils.getString(jSONObject, BidResponsed.KEY_PRICE, null);
    }

    public String a() {
        return this.a;
    }

    public String b() {
        return this.f9202b;
    }
}
