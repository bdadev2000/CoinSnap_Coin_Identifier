package com.applovin.impl;

import com.applovin.impl.sdk.utils.JsonUtils;
import com.mbridge.msdk.mbbid.out.BidResponsed;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class yf {

    /* renamed from: a, reason: collision with root package name */
    private final String f12402a;
    private final String b;

    public yf(JSONObject jSONObject, com.applovin.impl.sdk.k kVar) {
        this.f12402a = JsonUtils.getString(jSONObject, "id", "");
        this.b = JsonUtils.getString(jSONObject, BidResponsed.KEY_PRICE, null);
    }

    public String a() {
        return this.f12402a;
    }

    public String b() {
        return this.b;
    }
}
