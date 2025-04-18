package com.applovin.impl;

/* loaded from: classes.dex */
public abstract class l2 {

    /* renamed from: a, reason: collision with root package name */
    private int f24976a;

    public void b() {
        this.f24976a = 0;
    }

    public final void c(int i2) {
        this.f24976a = (~i2) & this.f24976a;
    }

    public final boolean d(int i2) {
        return (this.f24976a & i2) == i2;
    }

    public final void e(int i2) {
        this.f24976a = i2;
    }

    public final boolean f() {
        return d(1);
    }

    public final void b(int i2) {
        this.f24976a = i2 | this.f24976a;
    }

    public final boolean c() {
        return d(268435456);
    }

    public final boolean d() {
        return d(Integer.MIN_VALUE);
    }

    public final boolean e() {
        return d(4);
    }
}
