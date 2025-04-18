package com.applovin.impl;

import com.applovin.impl.dp;
import com.applovin.impl.ij;

/* loaded from: classes2.dex */
public final class l implements k8 {
    public static final o8 d = new dt(7);

    /* renamed from: a */
    private final m f24954a = new m();

    /* renamed from: b */
    private final bh f24955b = new bh(16384);

    /* renamed from: c */
    private boolean f24956c;

    public static /* synthetic */ k8[] b() {
        return new k8[]{new l()};
    }

    @Override // com.applovin.impl.k8
    public void a() {
    }

    @Override // com.applovin.impl.k8
    public void a(m8 m8Var) {
        this.f24954a.a(m8Var, new dp.d(0, 1));
        m8Var.c();
        m8Var.a(new ij.b(-9223372036854775807L));
    }

    @Override // com.applovin.impl.k8
    public int a(l8 l8Var, th thVar) {
        int a2 = l8Var.a(this.f24955b.c(), 0, 16384);
        if (a2 == -1) {
            return -1;
        }
        this.f24955b.f(0);
        this.f24955b.e(a2);
        if (!this.f24956c) {
            this.f24954a.a(0L, 4);
            this.f24956c = true;
        }
        this.f24954a.a(this.f24955b);
        return 0;
    }

    @Override // com.applovin.impl.k8
    public void a(long j2, long j3) {
        this.f24956c = false;
        this.f24954a.a();
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
            l8Var.c(bhVar.c(), 0, 7);
            bhVar.f(0);
            int C = bhVar.C();
            if (C == 44096 || C == 44097) {
                i3++;
                if (i3 >= 4) {
                    return true;
                }
                int a2 = n.a(bhVar.c(), C);
                if (a2 == -1) {
                    return false;
                }
                l8Var.c(a2 - 7);
            } else {
                l8Var.b();
                i4++;
                if (i4 - i2 >= 8192) {
                    return false;
                }
                l8Var.c(i4);
                i3 = 0;
            }
        }
    }
}
