package com.applovin.impl;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class p5 implements InterfaceC0727n0 {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f9973a;
    private final int b;

    /* renamed from: c, reason: collision with root package name */
    private final byte[] f9974c;

    /* renamed from: d, reason: collision with root package name */
    private final C0723m0[] f9975d;

    /* renamed from: e, reason: collision with root package name */
    private int f9976e;

    /* renamed from: f, reason: collision with root package name */
    private int f9977f;

    /* renamed from: g, reason: collision with root package name */
    private int f9978g;

    /* renamed from: h, reason: collision with root package name */
    private C0723m0[] f9979h;

    public p5(boolean z8, int i9) {
        this(z8, i9, 0);
    }

    @Override // com.applovin.impl.InterfaceC0727n0
    public synchronized void a(C0723m0 c0723m0) {
        C0723m0[] c0723m0Arr = this.f9975d;
        c0723m0Arr[0] = c0723m0;
        a(c0723m0Arr);
    }

    @Override // com.applovin.impl.InterfaceC0727n0
    public synchronized C0723m0 b() {
        C0723m0 c0723m0;
        try {
            this.f9977f++;
            int i9 = this.f9978g;
            if (i9 > 0) {
                C0723m0[] c0723m0Arr = this.f9979h;
                int i10 = i9 - 1;
                this.f9978g = i10;
                c0723m0 = (C0723m0) AbstractC0669a1.a(c0723m0Arr[i10]);
                this.f9979h[this.f9978g] = null;
            } else {
                c0723m0 = new C0723m0(new byte[this.b], 0);
            }
        } catch (Throwable th) {
            throw th;
        }
        return c0723m0;
    }

    @Override // com.applovin.impl.InterfaceC0727n0
    public int c() {
        return this.b;
    }

    public synchronized int d() {
        return this.f9977f * this.b;
    }

    public synchronized void e() {
        if (this.f9973a) {
            a(0);
        }
    }

    public p5(boolean z8, int i9, int i10) {
        AbstractC0669a1.a(i9 > 0);
        AbstractC0669a1.a(i10 >= 0);
        this.f9973a = z8;
        this.b = i9;
        this.f9978g = i10;
        this.f9979h = new C0723m0[i10 + 100];
        if (i10 > 0) {
            this.f9974c = new byte[i10 * i9];
            for (int i11 = 0; i11 < i10; i11++) {
                this.f9979h[i11] = new C0723m0(this.f9974c, i11 * i9);
            }
        } else {
            this.f9974c = null;
        }
        this.f9975d = new C0723m0[1];
    }

    @Override // com.applovin.impl.InterfaceC0727n0
    public synchronized void a(C0723m0[] c0723m0Arr) {
        try {
            int i9 = this.f9978g;
            int length = c0723m0Arr.length + i9;
            C0723m0[] c0723m0Arr2 = this.f9979h;
            if (length >= c0723m0Arr2.length) {
                this.f9979h = (C0723m0[]) Arrays.copyOf(c0723m0Arr2, Math.max(c0723m0Arr2.length * 2, i9 + c0723m0Arr.length));
            }
            for (C0723m0 c0723m0 : c0723m0Arr) {
                C0723m0[] c0723m0Arr3 = this.f9979h;
                int i10 = this.f9978g;
                this.f9978g = i10 + 1;
                c0723m0Arr3[i10] = c0723m0;
            }
            this.f9977f -= c0723m0Arr.length;
            notifyAll();
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized void a(int i9) {
        boolean z8 = i9 < this.f9976e;
        this.f9976e = i9;
        if (z8) {
            a();
        }
    }

    @Override // com.applovin.impl.InterfaceC0727n0
    public synchronized void a() {
        try {
            int i9 = 0;
            int max = Math.max(0, yp.a(this.f9976e, this.b) - this.f9977f);
            int i10 = this.f9978g;
            if (max >= i10) {
                return;
            }
            if (this.f9974c != null) {
                int i11 = i10 - 1;
                while (i9 <= i11) {
                    C0723m0 c0723m0 = (C0723m0) AbstractC0669a1.a(this.f9979h[i9]);
                    if (c0723m0.f8887a == this.f9974c) {
                        i9++;
                    } else {
                        C0723m0 c0723m02 = (C0723m0) AbstractC0669a1.a(this.f9979h[i11]);
                        if (c0723m02.f8887a != this.f9974c) {
                            i11--;
                        } else {
                            C0723m0[] c0723m0Arr = this.f9979h;
                            c0723m0Arr[i9] = c0723m02;
                            c0723m0Arr[i11] = c0723m0;
                            i11--;
                            i9++;
                        }
                    }
                }
                max = Math.max(max, i9);
                if (max >= this.f9978g) {
                    return;
                }
            }
            Arrays.fill(this.f9979h, max, this.f9978g, (Object) null);
            this.f9978g = max;
        } catch (Throwable th) {
            throw th;
        }
    }
}
