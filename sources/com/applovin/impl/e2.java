package com.applovin.impl;

import java.util.Arrays;

/* loaded from: classes.dex */
public abstract class e2 implements f8 {
    protected final po a;

    /* renamed from: b */
    protected final int f4402b;

    /* renamed from: c */
    protected final int[] f4403c;

    /* renamed from: d */
    private final int f4404d;

    /* renamed from: e */
    private final d9[] f4405e;

    /* renamed from: f */
    private final long[] f4406f;

    /* renamed from: g */
    private int f4407g;

    public e2(po poVar, int[] iArr, int i10) {
        boolean z10;
        int i11 = 0;
        if (iArr.length > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        a1.b(z10);
        this.f4404d = i10;
        this.a = (po) a1.a(poVar);
        int length = iArr.length;
        this.f4402b = length;
        this.f4405e = new d9[length];
        for (int i12 = 0; i12 < iArr.length; i12++) {
            this.f4405e[i12] = poVar.a(iArr[i12]);
        }
        Arrays.sort(this.f4405e, new et(5));
        this.f4403c = new int[this.f4402b];
        while (true) {
            int i13 = this.f4402b;
            if (i11 < i13) {
                this.f4403c[i11] = poVar.a(this.f4405e[i11]);
                i11++;
            } else {
                this.f4406f = new long[i13];
                return;
            }
        }
    }

    public static /* synthetic */ int b(d9 d9Var, d9 d9Var2) {
        return a(d9Var, d9Var2);
    }

    @Override // com.applovin.impl.f8
    public void a(float f10) {
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        e2 e2Var = (e2) obj;
        if (this.a == e2Var.a && Arrays.equals(this.f4403c, e2Var.f4403c)) {
            return true;
        }
        return false;
    }

    @Override // com.applovin.impl.f8
    public void f() {
    }

    @Override // com.applovin.impl.f8
    public final d9 g() {
        return this.f4405e[h()];
    }

    public int hashCode() {
        if (this.f4407g == 0) {
            this.f4407g = Arrays.hashCode(this.f4403c) + (System.identityHashCode(this.a) * 31);
        }
        return this.f4407g;
    }

    @Override // com.applovin.impl.f8
    public void i() {
    }

    @Override // com.applovin.impl.to
    public final d9 a(int i10) {
        return this.f4405e[i10];
    }

    @Override // com.applovin.impl.to
    public final int b(int i10) {
        return this.f4403c[i10];
    }

    @Override // com.applovin.impl.to
    public final po a() {
        return this.a;
    }

    @Override // com.applovin.impl.to
    public final int b() {
        return this.f4403c.length;
    }

    public static /* synthetic */ int a(d9 d9Var, d9 d9Var2) {
        return d9Var2.f4224i - d9Var.f4224i;
    }
}
