package com.applovin.impl;

/* loaded from: classes.dex */
public class td {

    /* renamed from: a, reason: collision with root package name */
    public final Object f11475a;
    public final int b;

    /* renamed from: c, reason: collision with root package name */
    public final int f11476c;

    /* renamed from: d, reason: collision with root package name */
    public final long f11477d;

    /* renamed from: e, reason: collision with root package name */
    public final int f11478e;

    public td(td tdVar) {
        this.f11475a = tdVar.f11475a;
        this.b = tdVar.b;
        this.f11476c = tdVar.f11476c;
        this.f11477d = tdVar.f11477d;
        this.f11478e = tdVar.f11478e;
    }

    public td a(Object obj) {
        return this.f11475a.equals(obj) ? this : new td(obj, this.b, this.f11476c, this.f11477d, this.f11478e);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof td)) {
            return false;
        }
        td tdVar = (td) obj;
        if (this.f11475a.equals(tdVar.f11475a) && this.b == tdVar.b && this.f11476c == tdVar.f11476c && this.f11477d == tdVar.f11477d && this.f11478e == tdVar.f11478e) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return ((((((((this.f11475a.hashCode() + 527) * 31) + this.b) * 31) + this.f11476c) * 31) + ((int) this.f11477d)) * 31) + this.f11478e;
    }

    public boolean a() {
        return this.b != -1;
    }

    public td(Object obj) {
        this(obj, -1L);
    }

    public td(Object obj, int i9, int i10, long j7) {
        this(obj, i9, i10, j7, -1);
    }

    private td(Object obj, int i9, int i10, long j7, int i11) {
        this.f11475a = obj;
        this.b = i9;
        this.f11476c = i10;
        this.f11477d = j7;
        this.f11478e = i11;
    }

    public td(Object obj, long j7) {
        this(obj, -1, -1, j7, -1);
    }

    public td(Object obj, long j7, int i9) {
        this(obj, -1, -1, j7, i9);
    }
}
