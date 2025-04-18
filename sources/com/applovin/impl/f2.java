package com.applovin.impl;

import java.util.Arrays;

/* loaded from: classes3.dex */
public abstract class f2 implements h8 {

    /* renamed from: a */
    protected final oo f23802a;

    /* renamed from: b */
    protected final int f23803b;

    /* renamed from: c */
    protected final int[] f23804c;
    private final int d;
    private final f9[] e;

    /* renamed from: f */
    private final long[] f23805f;

    /* renamed from: g */
    private int f23806g;

    public f2(oo ooVar, int[] iArr, int i2) {
        int i3 = 0;
        b1.b(iArr.length > 0);
        this.d = i2;
        this.f23802a = (oo) b1.a(ooVar);
        int length = iArr.length;
        this.f23803b = length;
        this.e = new f9[length];
        for (int i4 = 0; i4 < iArr.length; i4++) {
            this.e[i4] = ooVar.a(iArr[i4]);
        }
        Arrays.sort(this.e, new ns(5));
        this.f23804c = new int[this.f23803b];
        while (true) {
            int i5 = this.f23803b;
            if (i3 >= i5) {
                this.f23805f = new long[i5];
                return;
            } else {
                this.f23804c[i3] = ooVar.a(this.e[i3]);
                i3++;
            }
        }
    }

    public static /* synthetic */ int b(f9 f9Var, f9 f9Var2) {
        return a(f9Var, f9Var2);
    }

    @Override // com.applovin.impl.so
    public final oo a() {
        return this.f23802a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        f2 f2Var = (f2) obj;
        return this.f23802a == f2Var.f23802a && Arrays.equals(this.f23804c, f2Var.f23804c);
    }

    @Override // com.applovin.impl.h8
    public void f() {
    }

    @Override // com.applovin.impl.h8
    public final f9 g() {
        return this.e[h()];
    }

    public int hashCode() {
        if (this.f23806g == 0) {
            this.f23806g = Arrays.hashCode(this.f23804c) + (System.identityHashCode(this.f23802a) * 31);
        }
        return this.f23806g;
    }

    @Override // com.applovin.impl.h8
    public void i() {
    }

    @Override // com.applovin.impl.h8
    public void a(float f2) {
    }

    @Override // com.applovin.impl.so
    public final int b(int i2) {
        return this.f23804c[i2];
    }

    @Override // com.applovin.impl.so
    public final f9 a(int i2) {
        return this.e[i2];
    }

    @Override // com.applovin.impl.so
    public final int b() {
        return this.f23804c.length;
    }

    public static /* synthetic */ int a(f9 f9Var, f9 f9Var2) {
        return f9Var2.f23836i - f9Var.f23836i;
    }
}
