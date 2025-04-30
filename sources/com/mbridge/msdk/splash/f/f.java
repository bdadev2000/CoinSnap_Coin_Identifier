package com.mbridge.msdk.splash.f;

import com.mbridge.msdk.foundation.entity.o;

/* loaded from: classes3.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    private int f17939a;
    private String b;

    /* renamed from: c, reason: collision with root package name */
    private int f17940c;

    /* renamed from: d, reason: collision with root package name */
    private int f17941d;

    /* renamed from: e, reason: collision with root package name */
    private int f17942e;

    public final int a() {
        return this.f17939a;
    }

    public final String b() {
        return this.b;
    }

    public final int c() {
        return this.f17940c;
    }

    public final int d() {
        return this.f17941d;
    }

    public final int e() {
        return this.f17942e;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NativeAdvancedV3ParamsEntity{reqType=");
        sb.append(this.f17939a);
        sb.append(", session_id='");
        sb.append(this.b);
        sb.append("', offset=");
        sb.append(this.f17940c);
        sb.append(", expectWidth=");
        sb.append(this.f17941d);
        sb.append(", expectHeight=");
        return o.l(sb, this.f17942e, '}');
    }

    public final void a(int i9) {
        this.f17939a = i9;
    }

    public final void b(int i9) {
        this.f17940c = i9;
    }

    public final void c(int i9) {
        this.f17941d = i9;
    }

    public final void d(int i9) {
        this.f17942e = i9;
    }

    public final void a(String str) {
        this.b = str;
    }
}
