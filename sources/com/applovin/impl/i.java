package com.applovin.impl;

import com.applovin.impl.dp;
import com.applovin.impl.ij;

/* loaded from: classes2.dex */
public final class i implements k8 {
    public static final o8 d = new dt(3);

    /* renamed from: a */
    private final j f24368a = new j();

    /* renamed from: b */
    private final bh f24369b = new bh(2786);

    /* renamed from: c */
    private boolean f24370c;

    public static /* synthetic */ k8[] b() {
        return new k8[]{new i()};
    }

    @Override // com.applovin.impl.k8
    public void a() {
    }

    @Override // com.applovin.impl.k8
    public void a(m8 m8Var) {
        this.f24368a.a(m8Var, new dp.d(0, 1));
        m8Var.c();
        m8Var.a(new ij.b(-9223372036854775807L));
    }

    @Override // com.applovin.impl.k8
    public int a(l8 l8Var, th thVar) {
        int a2 = l8Var.a(this.f24369b.c(), 0, 2786);
        if (a2 == -1) {
            return -1;
        }
        this.f24369b.f(0);
        this.f24369b.e(a2);
        if (!this.f24370c) {
            this.f24368a.a(0L, 4);
            this.f24370c = true;
        }
        this.f24368a.a(this.f24369b);
        return 0;
    }

    @Override // com.applovin.impl.k8
    public void a(long j2, long j3) {
        this.f24370c = false;
        this.f24368a.a();
    }

    @Override // com.applovin.impl.k8
    public boolean a(l8 l8Var) {
        bh bhVar = new bh(10);
        int i2 = 0;
        while (true) {
            l8Var.c(bhVar.c(), 0, 10);
            bhVar.f(0);
            if (bhVar.z() != 4801587) {
                break;
            }
            bhVar.g(3);
            int v2 = bhVar.v();
            i2 += v2 + 10;
            l8Var.c(v2);
        }
        l8Var.b();
        l8Var.c(i2);
        int i3 = 0;
        int i4 = i2;
        while (true) {
            l8Var.c(bhVar.c(), 0, 6);
            bhVar.f(0);
            if (bhVar.C() != 2935) {
                l8Var.b();
                i4++;
                if (i4 - i2 >= 8192) {
                    return false;
                }
                l8Var.c(i4);
                i3 = 0;
            } else {
                i3++;
                if (i3 >= 4) {
                    return true;
                }
                int a2 = k.a(bhVar.c());
                if (a2 == -1) {
                    return false;
                }
                l8Var.c(a2 - 6);
            }
        }
    }
}
