package com.applovin.impl;

/* loaded from: classes.dex */
public final class gj {

    /* renamed from: c, reason: collision with root package name */
    public static final gj f7917c = new gj(0, 0);

    /* renamed from: a, reason: collision with root package name */
    public final long f7918a;
    public final long b;

    public gj(long j7, long j9) {
        this.f7918a = j7;
        this.b = j9;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || gj.class != obj.getClass()) {
            return false;
        }
        gj gjVar = (gj) obj;
        if (this.f7918a == gjVar.f7918a && this.b == gjVar.b) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((int) this.f7918a) * 31) + ((int) this.b);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[timeUs=");
        sb.append(this.f7918a);
        sb.append(", position=");
        return Q7.n0.k(sb, this.b, "]");
    }
}
