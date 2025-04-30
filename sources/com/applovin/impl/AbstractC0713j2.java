package com.applovin.impl;

/* renamed from: com.applovin.impl.j2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0713j2 {

    /* renamed from: a, reason: collision with root package name */
    private int f8389a;

    public final void b(int i9) {
        this.f8389a = i9 | this.f8389a;
    }

    public final void c(int i9) {
        this.f8389a = (~i9) & this.f8389a;
    }

    public final boolean d(int i9) {
        return (this.f8389a & i9) == i9;
    }

    public final boolean e() {
        return d(4);
    }

    public final boolean f() {
        return d(1);
    }

    public void b() {
        this.f8389a = 0;
    }

    public final boolean c() {
        return d(268435456);
    }

    public final boolean d() {
        return d(Integer.MIN_VALUE);
    }

    public final void e(int i9) {
        this.f8389a = i9;
    }
}
