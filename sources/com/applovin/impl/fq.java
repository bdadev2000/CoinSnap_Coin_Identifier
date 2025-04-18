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
    private static final List f4787f = Arrays.asList(MimeTypes.VIDEO_MP4, MimeTypes.VIDEO_WEBM, MimeTypes.VIDEO_H263, "video/x-matroska");
    private final com.applovin.impl.sdk.k a;

    /* renamed from: c, reason: collision with root package name */
    private final JSONObject f4789c;

    /* renamed from: d, reason: collision with root package name */
    private final JSONObject f4790d;

    /* renamed from: b, reason: collision with root package name */
    protected List f4788b = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    private final long f4791e = System.currentTimeMillis();

    public fq(JSONObject jSONObject, JSONObject jSONObject2, com.applovin.impl.sdk.k kVar) {
        this.a = kVar;
        this.f4789c = jSONObject;
        this.f4790d = jSONObject2;
    }

    public List a() {
        return this.f4788b;
    }

    public JSONObject b() {
        return this.f4789c;
    }

    public long c() {
        return this.f4791e;
    }

    public int d() {
        return this.f4788b.size();
    }

    public JSONObject e() {
        return this.f4790d;
    }

    public List f() {
        List<String> explode = CollectionUtils.explode(JsonUtils.getString(this.f4789c, "vast_preferred_video_types", null));
        if (explode.isEmpty()) {
            return f4787f;
        }
        return explode;
    }

    public int g() {
        return zp.a(JsonUtils.getInt(this.f4789c, "video_completion_percent", -1));
    }
}
