package v8;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import s7.p2;

/* loaded from: classes3.dex */
public final class q implements w, v {

    /* renamed from: b, reason: collision with root package name */
    public final z f26246b;

    /* renamed from: c, reason: collision with root package name */
    public final long f26247c;

    /* renamed from: d, reason: collision with root package name */
    public final m9.q f26248d;

    /* renamed from: f, reason: collision with root package name */
    public a f26249f;

    /* renamed from: g, reason: collision with root package name */
    public w f26250g;

    /* renamed from: h, reason: collision with root package name */
    public v f26251h;

    /* renamed from: i, reason: collision with root package name */
    public long f26252i = C.TIME_UNSET;

    public q(z zVar, m9.q qVar, long j3) {
        this.f26246b = zVar;
        this.f26248d = qVar;
        this.f26247c = j3;
    }

    @Override // v8.v
    public final void a(w wVar) {
        v vVar = this.f26251h;
        int i10 = n9.h0.a;
        vVar.a(this);
    }

    @Override // v8.a1
    public final void b(b1 b1Var) {
        v vVar = this.f26251h;
        int i10 = n9.h0.a;
        vVar.b(this);
    }

    public final void c(z zVar) {
        long j3 = this.f26252i;
        if (j3 == C.TIME_UNSET) {
            j3 = this.f26247c;
        }
        a aVar = this.f26249f;
        aVar.getClass();
        w a = aVar.a(zVar, this.f26248d, j3);
        this.f26250g = a;
        if (this.f26251h != null) {
            a.n(this, j3);
        }
    }

    @Override // v8.b1
    public final boolean continueLoading(long j3) {
        w wVar = this.f26250g;
        return wVar != null && wVar.continueLoading(j3);
    }

    public final void d() {
        if (this.f26250g != null) {
            a aVar = this.f26249f;
            aVar.getClass();
            aVar.m(this.f26250g);
        }
    }

    @Override // v8.b1
    public final long getBufferedPositionUs() {
        w wVar = this.f26250g;
        int i10 = n9.h0.a;
        return wVar.getBufferedPositionUs();
    }

    @Override // v8.b1
    public final long getNextLoadPositionUs() {
        w wVar = this.f26250g;
        int i10 = n9.h0.a;
        return wVar.getNextLoadPositionUs();
    }

    @Override // v8.w
    public final j1 getTrackGroups() {
        w wVar = this.f26250g;
        int i10 = n9.h0.a;
        return wVar.getTrackGroups();
    }

    @Override // v8.b1
    public final boolean isLoading() {
        w wVar = this.f26250g;
        return wVar != null && wVar.isLoading();
    }

    @Override // v8.w
    public final void maybeThrowPrepareError() {
        w wVar = this.f26250g;
        if (wVar != null) {
            wVar.maybeThrowPrepareError();
            return;
        }
        a aVar = this.f26249f;
        if (aVar != null) {
            aVar.i();
        }
    }

    @Override // v8.w
    public final void n(v vVar, long j3) {
        this.f26251h = vVar;
        w wVar = this.f26250g;
        if (wVar != null) {
            long j10 = this.f26252i;
            if (j10 == C.TIME_UNSET) {
                j10 = this.f26247c;
            }
            wVar.n(this, j10);
        }
    }

    @Override // v8.w
    public final void o(long j3) {
        w wVar = this.f26250g;
        int i10 = n9.h0.a;
        wVar.o(j3);
    }

    @Override // v8.w
    public final long r(k9.q[] qVarArr, boolean[] zArr, z0[] z0VarArr, boolean[] zArr2, long j3) {
        long j10;
        long j11 = this.f26252i;
        if (j11 != C.TIME_UNSET && j3 == this.f26247c) {
            this.f26252i = C.TIME_UNSET;
            j10 = j11;
        } else {
            j10 = j3;
        }
        w wVar = this.f26250g;
        int i10 = n9.h0.a;
        return wVar.r(qVarArr, zArr, z0VarArr, zArr2, j10);
    }

    @Override // v8.w
    public final long readDiscontinuity() {
        w wVar = this.f26250g;
        int i10 = n9.h0.a;
        return wVar.readDiscontinuity();
    }

    @Override // v8.b1
    public final void reevaluateBuffer(long j3) {
        w wVar = this.f26250g;
        int i10 = n9.h0.a;
        wVar.reevaluateBuffer(j3);
    }

    @Override // v8.w
    public final long s(long j3, p2 p2Var) {
        w wVar = this.f26250g;
        int i10 = n9.h0.a;
        return wVar.s(j3, p2Var);
    }

    @Override // v8.w
    public final long seekToUs(long j3) {
        w wVar = this.f26250g;
        int i10 = n9.h0.a;
        return wVar.seekToUs(j3);
    }
}
