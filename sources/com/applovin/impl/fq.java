package com.applovin.impl;

import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes.dex */
public abstract class fq {

    /* renamed from: f, reason: collision with root package name */
    private static final List f7745f = Arrays.asList(MimeTypes.VIDEO_MP4, MimeTypes.VIDEO_WEBM, MimeTypes.VIDEO_H263, "video/x-matroska");

    /* renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.k f7746a;

    /* renamed from: c, reason: collision with root package name */
    private final JSONObject f7747c;

    /* renamed from: d, reason: collision with root package name */
    private final JSONObject f7748d;
    protected List b = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    private final long f7749e = System.currentTimeMillis();

    public fq(JSONObject jSONObject, JSONObject jSONObject2, com.applovin.impl.sdk.k kVar) {
        this.f7746a = kVar;
        this.f7747c = jSONObject;
        this.f7748d = jSONObject2;
    }

    public List a() {
        return this.b;
    }

    public JSONObject b() {
        return this.f7747c;
    }

    public long c() {
        return this.f7749e;
    }

    public int d() {
        return this.b.size();
    }

    public JSONObject e() {
        return this.f7748d;
    }

    public List f() {
        List<String> explode = CollectionUtils.explode(JsonUtils.getString(this.f7747c, "vast_preferred_video_types", null));
        if (explode.isEmpty()) {
            return f7745f;
        }
        return explode;
    }

    public int g() {
        return zp.a(JsonUtils.getInt(this.f7747c, "video_completion_percent", -1));
    }
}
