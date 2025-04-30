package com.applovin.impl;

import java.util.Arrays;

/* renamed from: com.applovin.impl.e2 */
/* loaded from: classes.dex */
public abstract class AbstractC0690e2 implements f8 {

    /* renamed from: a */
    protected final po f7374a;
    protected final int b;

    /* renamed from: c */
    protected final int[] f7375c;

    /* renamed from: d */
    private final int f7376d;

    /* renamed from: e */
    private final d9[] f7377e;

    /* renamed from: f */
    private final long[] f7378f;

    /* renamed from: g */
    private int f7379g;

    public AbstractC0690e2(po poVar, int[] iArr, int i9) {
        boolean z8;
        int i10 = 0;
        if (iArr.length > 0) {
            z8 = true;
        } else {
            z8 = false;
        }
        AbstractC0669a1.b(z8);
        this.f7376d = i9;
        this.f7374a = (po) AbstractC0669a1.a(poVar);
        int length = iArr.length;
        this.b = length;
        this.f7377e = new d9[length];
        for (int i11 = 0; i11 < iArr.length; i11++) {
            this.f7377e[i11] = poVar.a(iArr[i11]);
        }
        Arrays.sort(this.f7377e, new X(5));
        this.f7375c = new int[this.b];
        while (true) {
            int i12 = this.b;
            if (i10 < i12) {
                this.f7375c[i10] = poVar.a(this.f7377e[i10]);
                i10++;
            } else {
                this.f7378f = new long[i12];
                return;
            }
        }
    }

    public static /* synthetic */ int b(d9 d9Var, d9 d9Var2) {
        return a(d9Var, d9Var2);
    }

    @Override // com.applovin.impl.f8
    public void a(float f9) {
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AbstractC0690e2 abstractC0690e2 = (AbstractC0690e2) obj;
        if (this.f7374a == abstractC0690e2.f7374a && Arrays.equals(this.f7375c, abstractC0690e2.f7375c)) {
            return true;
        }
        return false;
    }

    @Override // com.applovin.impl.f8
    public void f() {
    }

    @Override // com.applovin.impl.f8
    public final d9 g() {
        return this.f7377e[h()];
    }

    public int hashCode() {
        if (this.f7379g == 0) {
            this.f7379g = Arrays.hashCode(this.f7375c) + (System.identityHashCode(this.f7374a) * 31);
        }
        return this.f7379g;
    }

    @Override // com.applovin.impl.f8
    public void i() {
    }

    @Override // com.applovin.impl.to
    public final d9 a(int i9) {
        return this.f7377e[i9];
    }

    @Override // com.applovin.impl.to
    public final int b(int i9) {
        return this.f7375c[i9];
    }

    @Override // com.applovin.impl.to
    public final po a() {
        return this.f7374a;
    }

    @Override // com.applovin.impl.to
    public final int b() {
        return this.f7375c.length;
    }

    public static /* synthetic */ int a(d9 d9Var, d9 d9Var2) {
        return d9Var2.f7208i - d9Var.f7208i;
    }
}
