package com.applovin.impl;

import com.applovin.impl.dp;
import com.applovin.impl.f9;

/* loaded from: classes3.dex */
public final class eh implements gj {

    /* renamed from: a, reason: collision with root package name */
    private f9 f23708a;

    /* renamed from: b, reason: collision with root package name */
    private ho f23709b;

    /* renamed from: c, reason: collision with root package name */
    private qo f23710c;

    public eh(String str) {
        this.f23708a = new f9.b().f(str).a();
    }

    private void a() {
        b1.b(this.f23709b);
        xp.a(this.f23710c);
    }

    @Override // com.applovin.impl.gj
    public void a(bh bhVar) {
        a();
        long b2 = this.f23709b.b();
        long c2 = this.f23709b.c();
        if (b2 == -9223372036854775807L || c2 == -9223372036854775807L) {
            return;
        }
        f9 f9Var = this.f23708a;
        if (c2 != f9Var.f23844q) {
            f9 a2 = f9Var.a().a(c2).a();
            this.f23708a = a2;
            this.f23710c.a(a2);
        }
        int a3 = bhVar.a();
        this.f23710c.a(bhVar, a3);
        this.f23710c.a(b2, 1, a3, 0, null);
    }

    @Override // com.applovin.impl.gj
    public void a(ho hoVar, m8 m8Var, dp.d dVar) {
        this.f23709b = hoVar;
        dVar.a();
        qo a2 = m8Var.a(dVar.c(), 5);
        this.f23710c = a2;
        a2.a(this.f23708a);
    }
}
