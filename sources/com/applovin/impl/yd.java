package com.applovin.impl;

/* loaded from: classes4.dex */
public class yd {

    /* renamed from: a, reason: collision with root package name */
    public final Object f28191a;

    /* renamed from: b, reason: collision with root package name */
    public final int f28192b;

    /* renamed from: c, reason: collision with root package name */
    public final int f28193c;
    public final long d;
    public final int e;

    public yd(yd ydVar) {
        this.f28191a = ydVar.f28191a;
        this.f28192b = ydVar.f28192b;
        this.f28193c = ydVar.f28193c;
        this.d = ydVar.d;
        this.e = ydVar.e;
    }

    public boolean a() {
        return this.f28192b != -1;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yd)) {
            return false;
        }
        yd ydVar = (yd) obj;
        return this.f28191a.equals(ydVar.f28191a) && this.f28192b == ydVar.f28192b && this.f28193c == ydVar.f28193c && this.d == ydVar.d && this.e == ydVar.e;
    }

    public int hashCode() {
        return ((((((((this.f28191a.hashCode() + 527) * 31) + this.f28192b) * 31) + this.f28193c) * 31) + ((int) this.d)) * 31) + this.e;
    }

    public yd a(Object obj) {
        return this.f28191a.equals(obj) ? this : new yd(obj, this.f28192b, this.f28193c, this.d, this.e);
    }

    public yd(Object obj) {
        this(obj, -1L);
    }

    public yd(Object obj, int i2, int i3, long j2) {
        this(obj, i2, i3, j2, -1);
    }

    private yd(Object obj, int i2, int i3, long j2, int i4) {
        this.f28191a = obj;
        this.f28192b = i2;
        this.f28193c = i3;
        this.d = j2;
        this.e = i4;
    }

    public yd(Object obj, long j2) {
        this(obj, -1, -1, j2, -1);
    }

    public yd(Object obj, long j2, int i2) {
        this(obj, -1, -1, j2, i2);
    }
}
