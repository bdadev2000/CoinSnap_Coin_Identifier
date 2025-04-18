package x8;

import v8.y0;
import v8.z0;

/* loaded from: classes3.dex */
public final class h implements z0 {

    /* renamed from: b, reason: collision with root package name */
    public final j f27530b;

    /* renamed from: c, reason: collision with root package name */
    public final y0 f27531c;

    /* renamed from: d, reason: collision with root package name */
    public final int f27532d;

    /* renamed from: f, reason: collision with root package name */
    public boolean f27533f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ j f27534g;

    public h(j jVar, j jVar2, y0 y0Var, int i10) {
        this.f27534g = jVar;
        this.f27530b = jVar2;
        this.f27531c = y0Var;
        this.f27532d = i10;
    }

    public final void a() {
        if (!this.f27533f) {
            j jVar = this.f27534g;
            f0.c cVar = jVar.f27541i;
            int[] iArr = jVar.f27536c;
            int i10 = this.f27532d;
            cVar.d(iArr[i10], jVar.f27537d[i10], 0, null, jVar.f27553v);
            this.f27533f = true;
        }
    }

    @Override // v8.z0
    public final int d(r4.c cVar, w7.i iVar, int i10) {
        j jVar = this.f27534g;
        if (jVar.h()) {
            return -3;
        }
        a aVar = jVar.f27555x;
        y0 y0Var = this.f27531c;
        if (aVar != null && aVar.a(this.f27532d + 1) <= y0Var.f26337q + y0Var.f26339s) {
            return -3;
        }
        a();
        return y0Var.s(cVar, iVar, i10, jVar.f27556y);
    }

    @Override // v8.z0
    public final boolean isReady() {
        j jVar = this.f27534g;
        return !jVar.h() && this.f27531c.p(jVar.f27556y);
    }

    @Override // v8.z0
    public final void maybeThrowError() {
    }

    @Override // v8.z0
    public final int skipData(long j3) {
        j jVar = this.f27534g;
        if (jVar.h()) {
            return 0;
        }
        boolean z10 = jVar.f27556y;
        y0 y0Var = this.f27531c;
        int o10 = y0Var.o(j3, z10);
        a aVar = jVar.f27555x;
        if (aVar != null) {
            o10 = Math.min(o10, aVar.a(this.f27532d + 1) - (y0Var.f26337q + y0Var.f26339s));
        }
        y0Var.v(o10);
        if (o10 > 0) {
            a();
        }
        return o10;
    }
}
