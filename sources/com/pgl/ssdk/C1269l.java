package com.pgl.ssdk;

/* renamed from: com.pgl.ssdk.l, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1269l<A, B> {
    private final A a;

    /* renamed from: b, reason: collision with root package name */
    private final B f16561b;

    public C1269l(A a, B b3) {
        this.a = a;
        this.f16561b = b3;
    }

    public A a() {
        return this.a;
    }

    public B b() {
        return this.f16561b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C1269l.class != obj.getClass()) {
            return false;
        }
        C1269l c1269l = (C1269l) obj;
        A a = this.a;
        if (a == null) {
            if (c1269l.a != null) {
                return false;
            }
        } else if (!a.equals(c1269l.a)) {
            return false;
        }
        B b3 = this.f16561b;
        if (b3 == null) {
            if (c1269l.f16561b != null) {
                return false;
            }
        } else if (!b3.equals(c1269l.f16561b)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        int hashCode;
        A a = this.a;
        int i10 = 0;
        if (a == null) {
            hashCode = 0;
        } else {
            hashCode = a.hashCode();
        }
        int i11 = (hashCode + 31) * 31;
        B b3 = this.f16561b;
        if (b3 != null) {
            i10 = b3.hashCode();
        }
        return i11 + i10;
    }
}
