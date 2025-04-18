package com.applovin.impl;

/* loaded from: classes3.dex */
public class c4 {

    /* renamed from: a, reason: collision with root package name */
    private final l3 f23202a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f23203b;

    public c4() {
        this(l3.f24977a);
    }

    public synchronized void a() {
        while (!this.f23203b) {
            wait();
        }
    }

    public synchronized void b() {
        boolean z2 = false;
        while (!this.f23203b) {
            try {
                wait();
            } catch (InterruptedException unused) {
                z2 = true;
            }
        }
        if (z2) {
            Thread.currentThread().interrupt();
        }
    }

    public synchronized boolean c() {
        boolean z2;
        z2 = this.f23203b;
        this.f23203b = false;
        return z2;
    }

    public synchronized boolean d() {
        return this.f23203b;
    }

    public synchronized boolean e() {
        if (this.f23203b) {
            return false;
        }
        this.f23203b = true;
        notifyAll();
        return true;
    }

    public c4(l3 l3Var) {
        this.f23202a = l3Var;
    }
}
