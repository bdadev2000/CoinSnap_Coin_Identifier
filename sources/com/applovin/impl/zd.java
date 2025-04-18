package com.applovin.impl;

import com.applovin.impl.be;

/* loaded from: classes4.dex */
final class zd {

    /* renamed from: a, reason: collision with root package name */
    public final be.a f28322a;

    /* renamed from: b, reason: collision with root package name */
    public final long f28323b;

    /* renamed from: c, reason: collision with root package name */
    public final long f28324c;
    public final long d;
    public final long e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f28325f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f28326g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f28327h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f28328i;

    public zd(be.a aVar, long j2, long j3, long j4, long j5, boolean z2, boolean z3, boolean z4, boolean z5) {
        boolean z6 = false;
        b1.a(!z5 || z3);
        b1.a(!z4 || z3);
        if (!z2 || (!z3 && !z4 && !z5)) {
            z6 = true;
        }
        b1.a(z6);
        this.f28322a = aVar;
        this.f28323b = j2;
        this.f28324c = j3;
        this.d = j4;
        this.e = j5;
        this.f28325f = z2;
        this.f28326g = z3;
        this.f28327h = z4;
        this.f28328i = z5;
    }

    public zd a(long j2) {
        return j2 == this.f28324c ? this : new zd(this.f28322a, this.f28323b, j2, this.d, this.e, this.f28325f, this.f28326g, this.f28327h, this.f28328i);
    }

    public zd b(long j2) {
        return j2 == this.f28323b ? this : new zd(this.f28322a, j2, this.f28324c, this.d, this.e, this.f28325f, this.f28326g, this.f28327h, this.f28328i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || zd.class != obj.getClass()) {
            return false;
        }
        zd zdVar = (zd) obj;
        return this.f28323b == zdVar.f28323b && this.f28324c == zdVar.f28324c && this.d == zdVar.d && this.e == zdVar.e && this.f28325f == zdVar.f28325f && this.f28326g == zdVar.f28326g && this.f28327h == zdVar.f28327h && this.f28328i == zdVar.f28328i && xp.a(this.f28322a, zdVar.f28322a);
    }

    public int hashCode() {
        return ((((((((((((((((this.f28322a.hashCode() + 527) * 31) + ((int) this.f28323b)) * 31) + ((int) this.f28324c)) * 31) + ((int) this.d)) * 31) + ((int) this.e)) * 31) + (this.f28325f ? 1 : 0)) * 31) + (this.f28326g ? 1 : 0)) * 31) + (this.f28327h ? 1 : 0)) * 31) + (this.f28328i ? 1 : 0);
    }
}
