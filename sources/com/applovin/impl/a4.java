package com.applovin.impl;

/* loaded from: classes.dex */
public class a4 {

    /* renamed from: a, reason: collision with root package name */
    private final j3 f6549a;
    private boolean b;

    public a4() {
        this(j3.f8390a);
    }

    public synchronized void a() {
        while (!this.b) {
            wait();
        }
    }

    public synchronized void b() {
        boolean z8 = false;
        while (!this.b) {
            try {
                wait();
            } catch (InterruptedException unused) {
                z8 = true;
            }
        }
        if (z8) {
            Thread.currentThread().interrupt();
        }
    }

    public synchronized boolean c() {
        boolean z8;
        z8 = this.b;
        this.b = false;
        return z8;
    }

    public synchronized boolean d() {
        return this.b;
    }

    public synchronized boolean e() {
        if (this.b) {
            return false;
        }
        this.b = true;
        notifyAll();
        return true;
    }

    public a4(j3 j3Var) {
        this.f6549a = j3Var;
    }
}
