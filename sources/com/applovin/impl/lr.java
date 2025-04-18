package com.applovin.impl;

import com.applovin.impl.sdk.utils.JsonUtils;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class lr {
    private final String a;

    /* renamed from: b, reason: collision with root package name */
    private final String f5909b;

    /* renamed from: c, reason: collision with root package name */
    private final String f5910c;

    /* renamed from: d, reason: collision with root package name */
    private final String f5911d;

    /* renamed from: e, reason: collision with root package name */
    private final List f5912e;

    /* renamed from: f, reason: collision with root package name */
    private final List f5913f;

    public lr(JSONObject jSONObject) {
        this.a = JsonUtils.getString(jSONObject, "user_type", "all");
        this.f5909b = JsonUtils.getString(jSONObject, "device_type", "all");
        this.f5910c = JsonUtils.getString(jSONObject, "min_age", null);
        this.f5911d = JsonUtils.getString(jSONObject, "max_age", null);
        this.f5912e = JsonUtils.getList(jSONObject, "gender", null);
        this.f5913f = JsonUtils.getList(jSONObject, "keywords", null);
    }

    public String a() {
        return this.a;
    }

    public String b() {
        return this.f5909b;
    }

    public List c() {
        return this.f5912e;
    }

    public List d() {
        return this.f5913f;
    }

    public String e() {
        return this.f5911d;
    }

    public String f() {
        return this.f5910c;
    }
}
