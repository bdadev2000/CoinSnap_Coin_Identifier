package com.applovin.impl;

import com.applovin.impl.sdk.utils.JsonUtils;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class kr {

    /* renamed from: a, reason: collision with root package name */
    private final String f24940a;

    /* renamed from: b, reason: collision with root package name */
    private final String f24941b;

    /* renamed from: c, reason: collision with root package name */
    private final List f24942c;

    public kr(JSONObject jSONObject) {
        this.f24940a = JsonUtils.getString(jSONObject, "user_type", "all");
        this.f24941b = JsonUtils.getString(jSONObject, "device_type", "all");
        this.f24942c = JsonUtils.getStringList(jSONObject, "segments", null);
    }

    public String a() {
        return this.f24940a;
    }

    public String b() {
        return this.f24941b;
    }

    public List c() {
        return this.f24942c;
    }
}
