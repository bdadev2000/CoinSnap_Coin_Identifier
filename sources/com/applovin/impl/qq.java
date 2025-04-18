package com.applovin.impl;

import com.applovin.impl.sdk.utils.JsonUtils;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class qq {

    /* renamed from: a, reason: collision with root package name */
    private final int f26206a;

    /* renamed from: b, reason: collision with root package name */
    private final int f26207b;

    /* renamed from: c, reason: collision with root package name */
    private final int f26208c;
    private final int d;
    private final boolean e;

    /* renamed from: f, reason: collision with root package name */
    private final int f26209f;

    /* renamed from: g, reason: collision with root package name */
    private final int f26210g;

    /* renamed from: h, reason: collision with root package name */
    private final int f26211h;

    /* renamed from: i, reason: collision with root package name */
    private final float f26212i;

    /* renamed from: j, reason: collision with root package name */
    private final float f26213j;

    public qq(JSONObject jSONObject, com.applovin.impl.sdk.j jVar) {
        jVar.J();
        if (com.applovin.impl.sdk.n.a()) {
            jVar.J().d("VideoButtonProperties", "Updating video button properties with JSON = " + JsonUtils.maybeConvertToIndentedString(jSONObject));
        }
        this.f26206a = JsonUtils.getInt(jSONObject, ViewHierarchyConstants.DIMENSION_WIDTH_KEY, 64);
        this.f26207b = JsonUtils.getInt(jSONObject, ViewHierarchyConstants.DIMENSION_HEIGHT_KEY, 7);
        this.f26208c = JsonUtils.getInt(jSONObject, "margin", 20);
        this.d = JsonUtils.getInt(jSONObject, "gravity", 85);
        this.e = JsonUtils.getBoolean(jSONObject, "tap_to_fade", Boolean.FALSE).booleanValue();
        this.f26209f = JsonUtils.getInt(jSONObject, "tap_to_fade_duration_milliseconds", com.safedk.android.internal.d.f29936c);
        this.f26210g = JsonUtils.getInt(jSONObject, "fade_in_duration_milliseconds", com.safedk.android.internal.d.f29936c);
        this.f26211h = JsonUtils.getInt(jSONObject, "fade_out_duration_milliseconds", com.safedk.android.internal.d.f29936c);
        this.f26212i = JsonUtils.getFloat(jSONObject, "fade_in_delay_seconds", 1.0f);
        this.f26213j = JsonUtils.getFloat(jSONObject, "fade_out_delay_seconds", 6.0f);
    }

    public float a() {
        return this.f26212i;
    }

    public long b() {
        return this.f26210g;
    }

    public float c() {
        return this.f26213j;
    }

    public long d() {
        return this.f26211h;
    }

    public int e() {
        return this.d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        qq qqVar = (qq) obj;
        return this.f26206a == qqVar.f26206a && this.f26207b == qqVar.f26207b && this.f26208c == qqVar.f26208c && this.d == qqVar.d && this.e == qqVar.e && this.f26209f == qqVar.f26209f && this.f26210g == qqVar.f26210g && this.f26211h == qqVar.f26211h && Float.compare(qqVar.f26212i, this.f26212i) == 0 && Float.compare(qqVar.f26213j, this.f26213j) == 0;
    }

    public int f() {
        return this.f26207b;
    }

    public int g() {
        return this.f26208c;
    }

    public long h() {
        return this.f26209f;
    }

    public int hashCode() {
        int i2 = ((((((((((((((this.f26206a * 31) + this.f26207b) * 31) + this.f26208c) * 31) + this.d) * 31) + (this.e ? 1 : 0)) * 31) + this.f26209f) * 31) + this.f26210g) * 31) + this.f26211h) * 31;
        float f2 = this.f26212i;
        int floatToIntBits = (i2 + (f2 != 0.0f ? Float.floatToIntBits(f2) : 0)) * 31;
        float f3 = this.f26213j;
        return floatToIntBits + (f3 != 0.0f ? Float.floatToIntBits(f3) : 0);
    }

    public int i() {
        return this.f26206a;
    }

    public boolean j() {
        return this.e;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("VideoButtonProperties{widthPercentOfScreen=");
        sb.append(this.f26206a);
        sb.append(", heightPercentOfScreen=");
        sb.append(this.f26207b);
        sb.append(", margin=");
        sb.append(this.f26208c);
        sb.append(", gravity=");
        sb.append(this.d);
        sb.append(", tapToFade=");
        sb.append(this.e);
        sb.append(", tapToFadeDurationMillis=");
        sb.append(this.f26209f);
        sb.append(", fadeInDurationMillis=");
        sb.append(this.f26210g);
        sb.append(", fadeOutDurationMillis=");
        sb.append(this.f26211h);
        sb.append(", fadeInDelay=");
        sb.append(this.f26212i);
        sb.append(", fadeOutDelay=");
        return android.support.v4.media.d.n(sb, this.f26213j, '}');
    }
}
