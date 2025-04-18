package z8;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.ArrayList;
import java.util.List;
import s7.r0;

/* loaded from: classes3.dex */
public final class k extends m implements y8.i {

    /* renamed from: j, reason: collision with root package name */
    public final n f28631j;

    public k(long j3, r0 r0Var, com.google.common.collect.r0 r0Var2, n nVar, ArrayList arrayList, List list, List list2) {
        super(r0Var, r0Var2, nVar, arrayList, list, list2);
        this.f28631j = nVar;
    }

    @Override // z8.m
    public final String a() {
        return null;
    }

    @Override // z8.m
    public final y8.i b() {
        return this;
    }

    @Override // z8.m
    public final j c() {
        return null;
    }

    @Override // y8.i
    public final long d(long j3, long j10) {
        return this.f28631j.e(j3, j10);
    }

    @Override // y8.i
    public final long e(long j3, long j10) {
        return this.f28631j.c(j3, j10);
    }

    @Override // y8.i
    public final long g(long j3, long j10) {
        n nVar = this.f28631j;
        if (nVar.f28644f != null) {
            return C.TIME_UNSET;
        }
        long b3 = nVar.b(j3, j10) + nVar.c(j3, j10);
        return (nVar.e(b3, j3) + nVar.g(b3)) - nVar.f28647i;
    }

    @Override // y8.i
    public final long getTimeUs(long j3) {
        return this.f28631j.g(j3);
    }

    @Override // y8.i
    public final j h(long j3) {
        return this.f28631j.h(j3, this);
    }

    @Override // y8.i
    public final long j(long j3, long j10) {
        return this.f28631j.f(j3, j10);
    }

    @Override // y8.i
    public final long m(long j3) {
        return this.f28631j.d(j3);
    }

    @Override // y8.i
    public final boolean t() {
        return this.f28631j.i();
    }

    @Override // y8.i
    public final long u() {
        return this.f28631j.f28642d;
    }

    @Override // y8.i
    public final long v(long j3, long j10) {
        return this.f28631j.b(j3, j10);
    }
}
