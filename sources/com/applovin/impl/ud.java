package com.applovin.impl;

import com.applovin.impl.wd;

/* loaded from: classes.dex */
final class ud {
    public final wd.a a;

    /* renamed from: b, reason: collision with root package name */
    public final long f8367b;

    /* renamed from: c, reason: collision with root package name */
    public final long f8368c;

    /* renamed from: d, reason: collision with root package name */
    public final long f8369d;

    /* renamed from: e, reason: collision with root package name */
    public final long f8370e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f8371f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f8372g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f8373h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f8374i;

    public ud(wd.a aVar, long j3, long j10, long j11, long j12, boolean z10, boolean z11, boolean z12, boolean z13) {
        boolean z14;
        boolean z15;
        boolean z16 = false;
        if (z13 && !z11) {
            z14 = false;
        } else {
            z14 = true;
        }
        a1.a(z14);
        if (z12 && !z11) {
            z15 = false;
        } else {
            z15 = true;
        }
        a1.a(z15);
        if (!z10 || (!z11 && !z12 && !z13)) {
            z16 = true;
        }
        a1.a(z16);
        this.a = aVar;
        this.f8367b = j3;
        this.f8368c = j10;
        this.f8369d = j11;
        this.f8370e = j12;
        this.f8371f = z10;
        this.f8372g = z11;
        this.f8373h = z12;
        this.f8374i = z13;
    }

    public ud a(long j3) {
        if (j3 == this.f8368c) {
            return this;
        }
        return new ud(this.a, this.f8367b, j3, this.f8369d, this.f8370e, this.f8371f, this.f8372g, this.f8373h, this.f8374i);
    }

    public ud b(long j3) {
        if (j3 == this.f8367b) {
            return this;
        }
        return new ud(this.a, j3, this.f8368c, this.f8369d, this.f8370e, this.f8371f, this.f8372g, this.f8373h, this.f8374i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ud.class != obj.getClass()) {
            return false;
        }
        ud udVar = (ud) obj;
        if (this.f8367b == udVar.f8367b && this.f8368c == udVar.f8368c && this.f8369d == udVar.f8369d && this.f8370e == udVar.f8370e && this.f8371f == udVar.f8371f && this.f8372g == udVar.f8372g && this.f8373h == udVar.f8373h && this.f8374i == udVar.f8374i && yp.a(this.a, udVar.a)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return ((((((((((((((((this.a.hashCode() + 527) * 31) + ((int) this.f8367b)) * 31) + ((int) this.f8368c)) * 31) + ((int) this.f8369d)) * 31) + ((int) this.f8370e)) * 31) + (this.f8371f ? 1 : 0)) * 31) + (this.f8372g ? 1 : 0)) * 31) + (this.f8373h ? 1 : 0)) * 31) + (this.f8374i ? 1 : 0);
    }
}
