package com.applovin.impl;

import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public abstract class eq {

    /* renamed from: f, reason: collision with root package name */
    private static final List f23740f = Arrays.asList("video/mp4", "video/webm", "video/3gpp", "video/x-matroska");

    /* renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.j f23741a;

    /* renamed from: c, reason: collision with root package name */
    private final JSONObject f23743c;
    private final JSONObject d;

    /* renamed from: b, reason: collision with root package name */
    protected List f23742b = new ArrayList();
    private final long e = System.currentTimeMillis();

    public eq(JSONObject jSONObject, JSONObject jSONObject2, com.applovin.impl.sdk.j jVar) {
        this.f23741a = jVar;
        this.f23743c = jSONObject;
        this.d = jSONObject2;
    }

    public List a() {
        return this.f23742b;
    }

    public JSONObject b() {
        return this.f23743c;
    }

    public long c() {
        return this.e;
    }

    public int d() {
        return this.f23742b.size();
    }

    public JSONObject e() {
        return this.d;
    }

    public List f() {
        List<String> explode = CollectionUtils.explode(JsonUtils.getString(this.f23743c, "vast_preferred_video_types", null));
        return !explode.isEmpty() ? explode : f23740f;
    }

    public int g() {
        return yp.a(JsonUtils.getInt(this.f23743c, "video_completion_percent", -1));
    }
}
