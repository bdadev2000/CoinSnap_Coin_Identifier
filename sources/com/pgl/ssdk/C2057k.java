package com.pgl.ssdk;

/* renamed from: com.pgl.ssdk.k, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2057k<A, B> {

    /* renamed from: a, reason: collision with root package name */
    private final A f19584a;
    private final B b;

    public C2057k(A a6, B b) {
        this.f19584a = a6;
        this.b = b;
    }

    public A a() {
        return this.f19584a;
    }

    public B b() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C2057k.class != obj.getClass()) {
            return false;
        }
        C2057k c2057k = (C2057k) obj;
        A a6 = this.f19584a;
        if (a6 == null) {
            if (c2057k.f19584a != null) {
                return false;
            }
        } else if (!a6.equals(c2057k.f19584a)) {
            return false;
        }
        B b = this.b;
        if (b == null) {
            if (c2057k.b != null) {
                return false;
            }
        } else if (!b.equals(c2057k.b)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        int hashCode;
        A a6 = this.f19584a;
        int i9 = 0;
        if (a6 == null) {
            hashCode = 0;
        } else {
            hashCode = a6.hashCode();
        }
        int i10 = (hashCode + 31) * 31;
        B b = this.b;
        if (b != null) {
            i9 = b.hashCode();
        }
        return i10 + i9;
    }
}
