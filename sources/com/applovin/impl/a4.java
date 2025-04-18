package com.applovin.impl;

/* loaded from: classes.dex */
public class a4 {
    private final j3 a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f3571b;

    public a4() {
        this(j3.a);
    }

    public synchronized void a() {
        while (!this.f3571b) {
            wait();
        }
    }

    public synchronized void b() {
        boolean z10 = false;
        while (!this.f3571b) {
            try {
                wait();
            } catch (InterruptedException unused) {
                z10 = true;
            }
        }
        if (z10) {
            Thread.currentThread().interrupt();
        }
    }

    public synchronized boolean c() {
        boolean z10;
        z10 = this.f3571b;
        this.f3571b = false;
        return z10;
    }

    public synchronized boolean d() {
        return this.f3571b;
    }

    public synchronized boolean e() {
        if (this.f3571b) {
            return false;
        }
        this.f3571b = true;
        notifyAll();
        return true;
    }

    public a4(j3 j3Var) {
        this.a = j3Var;
    }
}
