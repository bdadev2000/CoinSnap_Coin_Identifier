package com.applovin.impl;

import com.applovin.impl.sdk.utils.JsonUtils;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class rq {
    private final int a;

    /* renamed from: b, reason: collision with root package name */
    private final int f7389b;

    /* renamed from: c, reason: collision with root package name */
    private final int f7390c;

    /* renamed from: d, reason: collision with root package name */
    private final int f7391d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f7392e;

    /* renamed from: f, reason: collision with root package name */
    private final int f7393f;

    /* renamed from: g, reason: collision with root package name */
    private final int f7394g;

    /* renamed from: h, reason: collision with root package name */
    private final int f7395h;

    /* renamed from: i, reason: collision with root package name */
    private final float f7396i;

    /* renamed from: j, reason: collision with root package name */
    private final float f7397j;

    public rq(JSONObject jSONObject, com.applovin.impl.sdk.k kVar) {
        kVar.L();
        if (com.applovin.impl.sdk.t.a()) {
            kVar.L().d("VideoButtonProperties", "Updating video button properties with JSON = " + JsonUtils.maybeConvertToIndentedString(jSONObject));
        }
        this.a = JsonUtils.getInt(jSONObject, "width", 64);
        this.f7389b = JsonUtils.getInt(jSONObject, "height", 7);
        this.f7390c = JsonUtils.getInt(jSONObject, "margin", 20);
        this.f7391d = JsonUtils.getInt(jSONObject, "gravity", 85);
        this.f7392e = JsonUtils.getBoolean(jSONObject, "tap_to_fade", Boolean.FALSE).booleanValue();
        this.f7393f = JsonUtils.getInt(jSONObject, "tap_to_fade_duration_milliseconds", 500);
        this.f7394g = JsonUtils.getInt(jSONObject, "fade_in_duration_milliseconds", 500);
        this.f7395h = JsonUtils.getInt(jSONObject, "fade_out_duration_milliseconds", 500);
        this.f7396i = JsonUtils.getFloat(jSONObject, "fade_in_delay_seconds", 1.0f);
        this.f7397j = JsonUtils.getFloat(jSONObject, "fade_out_delay_seconds", 6.0f);
    }

    public float a() {
        return this.f7396i;
    }

    public long b() {
        return this.f7394g;
    }

    public float c() {
        return this.f7397j;
    }

    public long d() {
        return this.f7395h;
    }

    public int e() {
        return this.f7391d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        rq rqVar = (rq) obj;
        if (this.a == rqVar.a && this.f7389b == rqVar.f7389b && this.f7390c == rqVar.f7390c && this.f7391d == rqVar.f7391d && this.f7392e == rqVar.f7392e && this.f7393f == rqVar.f7393f && this.f7394g == rqVar.f7394g && this.f7395h == rqVar.f7395h && Float.compare(rqVar.f7396i, this.f7396i) == 0 && Float.compare(rqVar.f7397j, this.f7397j) == 0) {
            return true;
        }
        return false;
    }

    public int f() {
        return this.f7389b;
    }

    public int g() {
        return this.f7390c;
    }

    public long h() {
        return this.f7393f;
    }

    public int hashCode() {
        int i10;
        int i11 = ((((((((((((((this.a * 31) + this.f7389b) * 31) + this.f7390c) * 31) + this.f7391d) * 31) + (this.f7392e ? 1 : 0)) * 31) + this.f7393f) * 31) + this.f7394g) * 31) + this.f7395h) * 31;
        float f10 = this.f7396i;
        int i12 = 0;
        if (f10 != 0.0f) {
            i10 = Float.floatToIntBits(f10);
        } else {
            i10 = 0;
        }
        int i13 = (i11 + i10) * 31;
        float f11 = this.f7397j;
        if (f11 != 0.0f) {
            i12 = Float.floatToIntBits(f11);
        }
        return i13 + i12;
    }

    public int i() {
        return this.a;
    }

    public boolean j() {
        return this.f7392e;
    }

    public String toString() {
        return "VideoButtonProperties{widthPercentOfScreen=" + this.a + ", heightPercentOfScreen=" + this.f7389b + ", margin=" + this.f7390c + ", gravity=" + this.f7391d + ", tapToFade=" + this.f7392e + ", tapToFadeDurationMillis=" + this.f7393f + ", fadeInDurationMillis=" + this.f7394g + ", fadeOutDurationMillis=" + this.f7395h + ", fadeInDelay=" + this.f7396i + ", fadeOutDelay=" + this.f7397j + AbstractJsonLexerKt.END_OBJ;
    }
}
