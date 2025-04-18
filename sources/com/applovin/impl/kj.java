package com.applovin.impl;

/* loaded from: classes.dex */
public final class kj {

    /* renamed from: c, reason: collision with root package name */
    public static final kj f24922c = new kj(0, 0);

    /* renamed from: a, reason: collision with root package name */
    public final long f24923a;

    /* renamed from: b, reason: collision with root package name */
    public final long f24924b;

    public kj(long j2, long j3) {
        this.f24923a = j2;
        this.f24924b = j3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || kj.class != obj.getClass()) {
            return false;
        }
        kj kjVar = (kj) obj;
        return this.f24923a == kjVar.f24923a && this.f24924b == kjVar.f24924b;
    }

    public int hashCode() {
        return (((int) this.f24923a) * 31) + ((int) this.f24924b);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[timeUs=");
        sb.append(this.f24923a);
        sb.append(", position=");
        return android.support.v4.media.d.p(sb, this.f24924b, "]");
    }
}
