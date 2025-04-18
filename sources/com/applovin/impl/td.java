package com.applovin.impl;

/* loaded from: classes.dex */
public class td {
    public final Object a;

    /* renamed from: b, reason: collision with root package name */
    public final int f8260b;

    /* renamed from: c, reason: collision with root package name */
    public final int f8261c;

    /* renamed from: d, reason: collision with root package name */
    public final long f8262d;

    /* renamed from: e, reason: collision with root package name */
    public final int f8263e;

    public td(td tdVar) {
        this.a = tdVar.a;
        this.f8260b = tdVar.f8260b;
        this.f8261c = tdVar.f8261c;
        this.f8262d = tdVar.f8262d;
        this.f8263e = tdVar.f8263e;
    }

    public td a(Object obj) {
        return this.a.equals(obj) ? this : new td(obj, this.f8260b, this.f8261c, this.f8262d, this.f8263e);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof td)) {
            return false;
        }
        td tdVar = (td) obj;
        if (this.a.equals(tdVar.a) && this.f8260b == tdVar.f8260b && this.f8261c == tdVar.f8261c && this.f8262d == tdVar.f8262d && this.f8263e == tdVar.f8263e) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return ((((((((this.a.hashCode() + 527) * 31) + this.f8260b) * 31) + this.f8261c) * 31) + ((int) this.f8262d)) * 31) + this.f8263e;
    }

    public boolean a() {
        return this.f8260b != -1;
    }

    public td(Object obj) {
        this(obj, -1L);
    }

    public td(Object obj, int i10, int i11, long j3) {
        this(obj, i10, i11, j3, -1);
    }

    private td(Object obj, int i10, int i11, long j3, int i12) {
        this.a = obj;
        this.f8260b = i10;
        this.f8261c = i11;
        this.f8262d = j3;
        this.f8263e = i12;
    }

    public td(Object obj, long j3) {
        this(obj, -1, -1, j3, -1);
    }

    public td(Object obj, long j3, int i10) {
        this(obj, -1, -1, j3, i10);
    }
}
