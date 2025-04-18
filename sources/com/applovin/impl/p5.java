package com.applovin.impl;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class p5 implements n0 {
    private final boolean a;

    /* renamed from: b, reason: collision with root package name */
    private final int f6903b;

    /* renamed from: c, reason: collision with root package name */
    private final byte[] f6904c;

    /* renamed from: d, reason: collision with root package name */
    private final m0[] f6905d;

    /* renamed from: e, reason: collision with root package name */
    private int f6906e;

    /* renamed from: f, reason: collision with root package name */
    private int f6907f;

    /* renamed from: g, reason: collision with root package name */
    private int f6908g;

    /* renamed from: h, reason: collision with root package name */
    private m0[] f6909h;

    public p5(boolean z10, int i10) {
        this(z10, i10, 0);
    }

    @Override // com.applovin.impl.n0
    public synchronized void a(m0 m0Var) {
        m0[] m0VarArr = this.f6905d;
        m0VarArr[0] = m0Var;
        a(m0VarArr);
    }

    @Override // com.applovin.impl.n0
    public synchronized m0 b() {
        m0 m0Var;
        this.f6907f++;
        int i10 = this.f6908g;
        if (i10 > 0) {
            m0[] m0VarArr = this.f6909h;
            int i11 = i10 - 1;
            this.f6908g = i11;
            m0Var = (m0) a1.a(m0VarArr[i11]);
            this.f6909h[this.f6908g] = null;
        } else {
            m0Var = new m0(new byte[this.f6903b], 0);
        }
        return m0Var;
    }

    @Override // com.applovin.impl.n0
    public int c() {
        return this.f6903b;
    }

    public synchronized int d() {
        return this.f6907f * this.f6903b;
    }

    public synchronized void e() {
        if (this.a) {
            a(0);
        }
    }

    public p5(boolean z10, int i10, int i11) {
        a1.a(i10 > 0);
        a1.a(i11 >= 0);
        this.a = z10;
        this.f6903b = i10;
        this.f6908g = i11;
        this.f6909h = new m0[i11 + 100];
        if (i11 > 0) {
            this.f6904c = new byte[i11 * i10];
            for (int i12 = 0; i12 < i11; i12++) {
                this.f6909h[i12] = new m0(this.f6904c, i12 * i10);
            }
        } else {
            this.f6904c = null;
        }
        this.f6905d = new m0[1];
    }

    @Override // com.applovin.impl.n0
    public synchronized void a(m0[] m0VarArr) {
        int i10 = this.f6908g;
        int length = m0VarArr.length + i10;
        m0[] m0VarArr2 = this.f6909h;
        if (length >= m0VarArr2.length) {
            this.f6909h = (m0[]) Arrays.copyOf(m0VarArr2, Math.max(m0VarArr2.length * 2, i10 + m0VarArr.length));
        }
        for (m0 m0Var : m0VarArr) {
            m0[] m0VarArr3 = this.f6909h;
            int i11 = this.f6908g;
            this.f6908g = i11 + 1;
            m0VarArr3[i11] = m0Var;
        }
        this.f6907f -= m0VarArr.length;
        notifyAll();
    }

    public synchronized void a(int i10) {
        boolean z10 = i10 < this.f6906e;
        this.f6906e = i10;
        if (z10) {
            a();
        }
    }

    @Override // com.applovin.impl.n0
    public synchronized void a() {
        int i10 = 0;
        int max = Math.max(0, yp.a(this.f6906e, this.f6903b) - this.f6907f);
        int i11 = this.f6908g;
        if (max >= i11) {
            return;
        }
        if (this.f6904c != null) {
            int i12 = i11 - 1;
            while (i10 <= i12) {
                m0 m0Var = (m0) a1.a(this.f6909h[i10]);
                if (m0Var.a == this.f6904c) {
                    i10++;
                } else {
                    m0 m0Var2 = (m0) a1.a(this.f6909h[i12]);
                    if (m0Var2.a != this.f6904c) {
                        i12--;
                    } else {
                        m0[] m0VarArr = this.f6909h;
                        m0VarArr[i10] = m0Var2;
                        m0VarArr[i12] = m0Var;
                        i12--;
                        i10++;
                    }
                }
            }
            max = Math.max(max, i10);
            if (max >= this.f6908g) {
                return;
            }
        }
        Arrays.fill(this.f6909h, max, this.f6908g, (Object) null);
        this.f6908g = max;
    }
}
