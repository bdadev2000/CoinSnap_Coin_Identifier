package com.applovin.impl;

import com.applovin.impl.sdk.utils.JsonUtils;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class rq {

    /* renamed from: a, reason: collision with root package name */
    private final int f10526a;
    private final int b;

    /* renamed from: c, reason: collision with root package name */
    private final int f10527c;

    /* renamed from: d, reason: collision with root package name */
    private final int f10528d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f10529e;

    /* renamed from: f, reason: collision with root package name */
    private final int f10530f;

    /* renamed from: g, reason: collision with root package name */
    private final int f10531g;

    /* renamed from: h, reason: collision with root package name */
    private final int f10532h;

    /* renamed from: i, reason: collision with root package name */
    private final float f10533i;

    /* renamed from: j, reason: collision with root package name */
    private final float f10534j;

    public rq(JSONObject jSONObject, com.applovin.impl.sdk.k kVar) {
        kVar.L();
        if (com.applovin.impl.sdk.t.a()) {
            kVar.L().d("VideoButtonProperties", "Updating video button properties with JSON = " + JsonUtils.maybeConvertToIndentedString(jSONObject));
        }
        this.f10526a = JsonUtils.getInt(jSONObject, "width", 64);
        this.b = JsonUtils.getInt(jSONObject, "height", 7);
        this.f10527c = JsonUtils.getInt(jSONObject, "margin", 20);
        this.f10528d = JsonUtils.getInt(jSONObject, "gravity", 85);
        this.f10529e = JsonUtils.getBoolean(jSONObject, "tap_to_fade", Boolean.FALSE).booleanValue();
        this.f10530f = JsonUtils.getInt(jSONObject, "tap_to_fade_duration_milliseconds", 500);
        this.f10531g = JsonUtils.getInt(jSONObject, "fade_in_duration_milliseconds", 500);
        this.f10532h = JsonUtils.getInt(jSONObject, "fade_out_duration_milliseconds", 500);
        this.f10533i = JsonUtils.getFloat(jSONObject, "fade_in_delay_seconds", 1.0f);
        this.f10534j = JsonUtils.getFloat(jSONObject, "fade_out_delay_seconds", 6.0f);
    }

    public float a() {
        return this.f10533i;
    }

    public long b() {
        return this.f10531g;
    }

    public float c() {
        return this.f10534j;
    }

    public long d() {
        return this.f10532h;
    }

    public int e() {
        return this.f10528d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        rq rqVar = (rq) obj;
        if (this.f10526a == rqVar.f10526a && this.b == rqVar.b && this.f10527c == rqVar.f10527c && this.f10528d == rqVar.f10528d && this.f10529e == rqVar.f10529e && this.f10530f == rqVar.f10530f && this.f10531g == rqVar.f10531g && this.f10532h == rqVar.f10532h && Float.compare(rqVar.f10533i, this.f10533i) == 0 && Float.compare(rqVar.f10534j, this.f10534j) == 0) {
            return true;
        }
        return false;
    }

    public int f() {
        return this.b;
    }

    public int g() {
        return this.f10527c;
    }

    public long h() {
        return this.f10530f;
    }

    public int hashCode() {
        int i9;
        int i10 = ((((((((((((((this.f10526a * 31) + this.b) * 31) + this.f10527c) * 31) + this.f10528d) * 31) + (this.f10529e ? 1 : 0)) * 31) + this.f10530f) * 31) + this.f10531g) * 31) + this.f10532h) * 31;
        float f9 = this.f10533i;
        int i11 = 0;
        if (f9 != 0.0f) {
            i9 = Float.floatToIntBits(f9);
        } else {
            i9 = 0;
        }
        int i12 = (i10 + i9) * 31;
        float f10 = this.f10534j;
        if (f10 != 0.0f) {
            i11 = Float.floatToIntBits(f10);
        }
        return i12 + i11;
    }

    public int i() {
        return this.f10526a;
    }

    public boolean j() {
        return this.f10529e;
    }

    public String toString() {
        return "VideoButtonProperties{widthPercentOfScreen=" + this.f10526a + ", heightPercentOfScreen=" + this.b + ", margin=" + this.f10527c + ", gravity=" + this.f10528d + ", tapToFade=" + this.f10529e + ", tapToFadeDurationMillis=" + this.f10530f + ", fadeInDurationMillis=" + this.f10531g + ", fadeOutDurationMillis=" + this.f10532h + ", fadeInDelay=" + this.f10533i + ", fadeOutDelay=" + this.f10534j + '}';
    }
}
