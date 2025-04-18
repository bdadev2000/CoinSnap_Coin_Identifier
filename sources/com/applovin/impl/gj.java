package com.applovin.impl;

/* loaded from: classes.dex */
public final class gj {

    /* renamed from: c, reason: collision with root package name */
    public static final gj f4942c = new gj(0, 0);
    public final long a;

    /* renamed from: b, reason: collision with root package name */
    public final long f4943b;

    public gj(long j3, long j10) {
        this.a = j3;
        this.f4943b = j10;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || gj.class != obj.getClass()) {
            return false;
        }
        gj gjVar = (gj) obj;
        if (this.a == gjVar.a && this.f4943b == gjVar.f4943b) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((int) this.a) * 31) + ((int) this.f4943b);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("[timeUs=");
        sb2.append(this.a);
        sb2.append(", position=");
        return a4.j.j(sb2, this.f4943b, "]");
    }
}
