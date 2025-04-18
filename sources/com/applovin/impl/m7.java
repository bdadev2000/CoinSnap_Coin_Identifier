package com.applovin.impl;

import com.applovin.impl.dp;
import com.applovin.impl.f9;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class m7 implements q7 {

    /* renamed from: a, reason: collision with root package name */
    private final List f25221a;

    /* renamed from: b, reason: collision with root package name */
    private final qo[] f25222b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f25223c;
    private int d;
    private int e;

    /* renamed from: f, reason: collision with root package name */
    private long f25224f = -9223372036854775807L;

    public m7(List list) {
        this.f25221a = list;
        this.f25222b = new qo[list.size()];
    }

    @Override // com.applovin.impl.q7
    public void a() {
        this.f25223c = false;
        this.f25224f = -9223372036854775807L;
    }

    @Override // com.applovin.impl.q7
    public void b() {
        if (this.f25223c) {
            if (this.f25224f != -9223372036854775807L) {
                for (qo qoVar : this.f25222b) {
                    qoVar.a(this.f25224f, 1, this.e, 0, null);
                }
            }
            this.f25223c = false;
        }
    }

    @Override // com.applovin.impl.q7
    public void a(long j2, int i2) {
        if ((i2 & 4) == 0) {
            return;
        }
        this.f25223c = true;
        if (j2 != -9223372036854775807L) {
            this.f25224f = j2;
        }
        this.e = 0;
        this.d = 2;
    }

    private boolean a(bh bhVar, int i2) {
        if (bhVar.a() == 0) {
            return false;
        }
        if (bhVar.w() != i2) {
            this.f25223c = false;
        }
        this.d--;
        return this.f25223c;
    }

    @Override // com.applovin.impl.q7
    public void a(bh bhVar) {
        if (this.f25223c) {
            if (this.d != 2 || a(bhVar, 32)) {
                if (this.d != 1 || a(bhVar, 0)) {
                    int d = bhVar.d();
                    int a2 = bhVar.a();
                    for (qo qoVar : this.f25222b) {
                        bhVar.f(d);
                        qoVar.a(bhVar, a2);
                    }
                    this.e += a2;
                }
            }
        }
    }

    @Override // com.applovin.impl.q7
    public void a(m8 m8Var, dp.d dVar) {
        for (int i2 = 0; i2 < this.f25222b.length; i2++) {
            dp.a aVar = (dp.a) this.f25221a.get(i2);
            dVar.a();
            qo a2 = m8Var.a(dVar.c(), 3);
            a2.a(new f9.b().c(dVar.b()).f("application/dvbsubs").a(Collections.singletonList(aVar.f23522c)).e(aVar.f23520a).a());
            this.f25222b[i2] = a2;
        }
    }
}
