package com.applovin.impl;

import java.util.Arrays;

/* loaded from: classes2.dex */
public final class r5 implements n0 {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f26260a;

    /* renamed from: b, reason: collision with root package name */
    private final int f26261b;

    /* renamed from: c, reason: collision with root package name */
    private final byte[] f26262c;
    private final m0[] d;
    private int e;

    /* renamed from: f, reason: collision with root package name */
    private int f26263f;

    /* renamed from: g, reason: collision with root package name */
    private int f26264g;

    /* renamed from: h, reason: collision with root package name */
    private m0[] f26265h;

    public r5(boolean z2, int i2) {
        this(z2, i2, 0);
    }

    @Override // com.applovin.impl.n0
    public synchronized void a(m0 m0Var) {
        m0[] m0VarArr = this.d;
        m0VarArr[0] = m0Var;
        a(m0VarArr);
    }

    @Override // com.applovin.impl.n0
    public synchronized m0 b() {
        m0 m0Var;
        try {
            this.f26263f++;
            int i2 = this.f26264g;
            if (i2 > 0) {
                m0[] m0VarArr = this.f26265h;
                int i3 = i2 - 1;
                this.f26264g = i3;
                m0Var = (m0) b1.a(m0VarArr[i3]);
                this.f26265h[this.f26264g] = null;
            } else {
                m0Var = new m0(new byte[this.f26261b], 0);
            }
        } catch (Throwable th) {
            throw th;
        }
        return m0Var;
    }

    @Override // com.applovin.impl.n0
    public int c() {
        return this.f26261b;
    }

    public synchronized int d() {
        return this.f26263f * this.f26261b;
    }

    public synchronized void e() {
        if (this.f26260a) {
            a(0);
        }
    }

    public r5(boolean z2, int i2, int i3) {
        b1.a(i2 > 0);
        b1.a(i3 >= 0);
        this.f26260a = z2;
        this.f26261b = i2;
        this.f26264g = i3;
        this.f26265h = new m0[i3 + 100];
        if (i3 > 0) {
            this.f26262c = new byte[i3 * i2];
            for (int i4 = 0; i4 < i3; i4++) {
                this.f26265h[i4] = new m0(this.f26262c, i4 * i2);
            }
        } else {
            this.f26262c = null;
        }
        this.d = new m0[1];
    }

    @Override // com.applovin.impl.n0
    public synchronized void a(m0[] m0VarArr) {
        try {
            int i2 = this.f26264g;
            int length = m0VarArr.length + i2;
            m0[] m0VarArr2 = this.f26265h;
            if (length >= m0VarArr2.length) {
                this.f26265h = (m0[]) Arrays.copyOf(m0VarArr2, Math.max(m0VarArr2.length * 2, i2 + m0VarArr.length));
            }
            for (m0 m0Var : m0VarArr) {
                m0[] m0VarArr3 = this.f26265h;
                int i3 = this.f26264g;
                this.f26264g = i3 + 1;
                m0VarArr3[i3] = m0Var;
            }
            this.f26263f -= m0VarArr.length;
            notifyAll();
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized void a(int i2) {
        boolean z2 = i2 < this.e;
        this.e = i2;
        if (z2) {
            a();
        }
    }

    @Override // com.applovin.impl.n0
    public synchronized void a() {
        try {
            int i2 = 0;
            int max = Math.max(0, xp.a(this.e, this.f26261b) - this.f26263f);
            int i3 = this.f26264g;
            if (max >= i3) {
                return;
            }
            if (this.f26262c != null) {
                int i4 = i3 - 1;
                while (i2 <= i4) {
                    m0 m0Var = (m0) b1.a(this.f26265h[i2]);
                    if (m0Var.f25172a == this.f26262c) {
                        i2++;
                    } else {
                        m0 m0Var2 = (m0) b1.a(this.f26265h[i4]);
                        if (m0Var2.f25172a != this.f26262c) {
                            i4--;
                        } else {
                            m0[] m0VarArr = this.f26265h;
                            m0VarArr[i2] = m0Var2;
                            m0VarArr[i4] = m0Var;
                            i4--;
                            i2++;
                        }
                    }
                }
                max = Math.max(max, i2);
                if (max >= this.f26264g) {
                    return;
                }
            }
            Arrays.fill(this.f26265h, max, this.f26264g, (Object) null);
            this.f26264g = max;
        } catch (Throwable th) {
            throw th;
        }
    }
}
