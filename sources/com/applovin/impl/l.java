package com.applovin.impl;

import com.applovin.impl.ej;
import com.applovin.impl.ep;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import kotlinx.serialization.json.internal.JsonLexerKt;

/* loaded from: classes.dex */
public final class l implements i8 {

    /* renamed from: d, reason: collision with root package name */
    public static final m8 f5793d = new ht(9);
    private final m a = new m();

    /* renamed from: b, reason: collision with root package name */
    private final yg f5794b = new yg(JsonLexerKt.BATCH_SIZE);

    /* renamed from: c, reason: collision with root package name */
    private boolean f5795c;

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ i8[] b() {
        return new i8[]{new l()};
    }

    @Override // com.applovin.impl.i8
    public void a() {
    }

    @Override // com.applovin.impl.i8
    public void a(k8 k8Var) {
        this.a.a(k8Var, new ep.d(0, 1));
        k8Var.c();
        k8Var.a(new ej.b(C.TIME_UNSET));
    }

    @Override // com.applovin.impl.i8
    public int a(j8 j8Var, qh qhVar) {
        int a = j8Var.a(this.f5794b.c(), 0, JsonLexerKt.BATCH_SIZE);
        if (a == -1) {
            return -1;
        }
        this.f5794b.f(0);
        this.f5794b.e(a);
        if (!this.f5795c) {
            this.a.a(0L, 4);
            this.f5795c = true;
        }
        this.a.a(this.f5794b);
        return 0;
    }

    @Override // com.applovin.impl.i8
    public void a(long j3, long j10) {
        this.f5795c = false;
        this.a.a();
    }

    @Override // com.applovin.impl.i8
    public boolean a(j8 j8Var) {
        yg ygVar = new yg(10);
        int i10 = 0;
        while (true) {
            j8Var.c(ygVar.c(), 0, 10);
            ygVar.f(0);
            if (ygVar.z() != 4801587) {
                break;
            }
            ygVar.g(3);
            int v10 = ygVar.v();
            i10 += v10 + 10;
            j8Var.c(v10);
        }
        j8Var.b();
        j8Var.c(i10);
        int i11 = 0;
        int i12 = i10;
        while (true) {
            j8Var.c(ygVar.c(), 0, 7);
            ygVar.f(0);
            int C = ygVar.C();
            if (C == 44096 || C == 44097) {
                i11++;
                if (i11 >= 4) {
                    return true;
                }
                int a = n.a(ygVar.c(), C);
                if (a == -1) {
                    return false;
                }
                j8Var.c(a - 7);
            } else {
                j8Var.b();
                i12++;
                if (i12 - i10 >= 8192) {
                    return false;
                }
                j8Var.c(i12);
                i11 = 0;
            }
        }
    }
}
