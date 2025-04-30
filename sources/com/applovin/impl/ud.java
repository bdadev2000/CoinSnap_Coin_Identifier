package com.applovin.impl;

import com.applovin.impl.wd;

/* loaded from: classes.dex */
final class ud {

    /* renamed from: a, reason: collision with root package name */
    public final wd.a f11582a;
    public final long b;

    /* renamed from: c, reason: collision with root package name */
    public final long f11583c;

    /* renamed from: d, reason: collision with root package name */
    public final long f11584d;

    /* renamed from: e, reason: collision with root package name */
    public final long f11585e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f11586f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f11587g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f11588h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f11589i;

    public ud(wd.a aVar, long j7, long j9, long j10, long j11, boolean z8, boolean z9, boolean z10, boolean z11) {
        boolean z12;
        boolean z13;
        boolean z14 = true;
        if (z11 && !z9) {
            z12 = false;
        } else {
            z12 = true;
        }
        AbstractC0669a1.a(z12);
        if (z10 && !z9) {
            z13 = false;
        } else {
            z13 = true;
        }
        AbstractC0669a1.a(z13);
        if (z8 && (z9 || z10 || z11)) {
            z14 = false;
        }
        AbstractC0669a1.a(z14);
        this.f11582a = aVar;
        this.b = j7;
        this.f11583c = j9;
        this.f11584d = j10;
        this.f11585e = j11;
        this.f11586f = z8;
        this.f11587g = z9;
        this.f11588h = z10;
        this.f11589i = z11;
    }

    public ud a(long j7) {
        if (j7 == this.f11583c) {
            return this;
        }
        return new ud(this.f11582a, this.b, j7, this.f11584d, this.f11585e, this.f11586f, this.f11587g, this.f11588h, this.f11589i);
    }

    public ud b(long j7) {
        if (j7 == this.b) {
            return this;
        }
        return new ud(this.f11582a, j7, this.f11583c, this.f11584d, this.f11585e, this.f11586f, this.f11587g, this.f11588h, this.f11589i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ud.class != obj.getClass()) {
            return false;
        }
        ud udVar = (ud) obj;
        if (this.b == udVar.b && this.f11583c == udVar.f11583c && this.f11584d == udVar.f11584d && this.f11585e == udVar.f11585e && this.f11586f == udVar.f11586f && this.f11587g == udVar.f11587g && this.f11588h == udVar.f11588h && this.f11589i == udVar.f11589i && yp.a(this.f11582a, udVar.f11582a)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return ((((((((((((((((this.f11582a.hashCode() + 527) * 31) + ((int) this.b)) * 31) + ((int) this.f11583c)) * 31) + ((int) this.f11584d)) * 31) + ((int) this.f11585e)) * 31) + (this.f11586f ? 1 : 0)) * 31) + (this.f11587g ? 1 : 0)) * 31) + (this.f11588h ? 1 : 0)) * 31) + (this.f11589i ? 1 : 0);
    }
}
