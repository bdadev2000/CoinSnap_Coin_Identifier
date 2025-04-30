package com.applovin.impl;

import com.applovin.impl.sdk.utils.JsonUtils;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class lr {

    /* renamed from: a, reason: collision with root package name */
    private final String f8872a;
    private final String b;

    /* renamed from: c, reason: collision with root package name */
    private final String f8873c;

    /* renamed from: d, reason: collision with root package name */
    private final String f8874d;

    /* renamed from: e, reason: collision with root package name */
    private final List f8875e;

    /* renamed from: f, reason: collision with root package name */
    private final List f8876f;

    public lr(JSONObject jSONObject) {
        this.f8872a = JsonUtils.getString(jSONObject, "user_type", "all");
        this.b = JsonUtils.getString(jSONObject, "device_type", "all");
        this.f8873c = JsonUtils.getString(jSONObject, "min_age", null);
        this.f8874d = JsonUtils.getString(jSONObject, "max_age", null);
        this.f8875e = JsonUtils.getList(jSONObject, "gender", null);
        this.f8876f = JsonUtils.getList(jSONObject, "keywords", null);
    }

    public String a() {
        return this.f8872a;
    }

    public String b() {
        return this.b;
    }

    public List c() {
        return this.f8875e;
    }

    public List d() {
        return this.f8876f;
    }

    public String e() {
        return this.f8874d;
    }

    public String f() {
        return this.f8873c;
    }
}
