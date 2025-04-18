package com.applovin.impl;

import com.applovin.impl.dp;
import com.applovin.impl.f9;

/* loaded from: classes3.dex */
public final class ab implements q7 {

    /* renamed from: b, reason: collision with root package name */
    private qo f22727b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f22728c;
    private int e;

    /* renamed from: f, reason: collision with root package name */
    private int f22729f;

    /* renamed from: a, reason: collision with root package name */
    private final bh f22726a = new bh(10);
    private long d = -9223372036854775807L;

    @Override // com.applovin.impl.q7
    public void a() {
        this.f22728c = false;
        this.d = -9223372036854775807L;
    }

    @Override // com.applovin.impl.q7
    public void b() {
        int i2;
        b1.b(this.f22727b);
        if (this.f22728c && (i2 = this.e) != 0 && this.f22729f == i2) {
            long j2 = this.d;
            if (j2 != -9223372036854775807L) {
                this.f22727b.a(j2, 1, i2, 0, null);
            }
            this.f22728c = false;
        }
    }

    @Override // com.applovin.impl.q7
    public void a(long j2, int i2) {
        if ((i2 & 4) == 0) {
            return;
        }
        this.f22728c = true;
        if (j2 != -9223372036854775807L) {
            this.d = j2;
        }
        this.e = 0;
        this.f22729f = 0;
    }

    @Override // com.applovin.impl.q7
    public void a(bh bhVar) {
        b1.b(this.f22727b);
        if (this.f22728c) {
            int a2 = bhVar.a();
            int i2 = this.f22729f;
            if (i2 < 10) {
                int min = Math.min(a2, 10 - i2);
                System.arraycopy(bhVar.c(), bhVar.d(), this.f22726a.c(), this.f22729f, min);
                if (this.f22729f + min == 10) {
                    this.f22726a.f(0);
                    if (73 == this.f22726a.w() && 68 == this.f22726a.w() && 51 == this.f22726a.w()) {
                        this.f22726a.g(3);
                        this.e = this.f22726a.v() + 10;
                    } else {
                        pc.d("Id3Reader", "Discarding invalid ID3 tag");
                        this.f22728c = false;
                        return;
                    }
                }
            }
            int min2 = Math.min(a2, this.e - this.f22729f);
            this.f22727b.a(bhVar, min2);
            this.f22729f += min2;
        }
    }

    @Override // com.applovin.impl.q7
    public void a(m8 m8Var, dp.d dVar) {
        dVar.a();
        qo a2 = m8Var.a(dVar.c(), 5);
        this.f22727b = a2;
        a2.a(new f9.b().c(dVar.b()).f("application/id3").a());
    }
}
