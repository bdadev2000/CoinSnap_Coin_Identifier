package v8;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import s7.p2;

/* loaded from: classes3.dex */
public final class f0 implements w, v {

    /* renamed from: b, reason: collision with root package name */
    public final w f26106b;

    /* renamed from: c, reason: collision with root package name */
    public final long f26107c;

    /* renamed from: d, reason: collision with root package name */
    public v f26108d;

    public f0(w wVar, long j3) {
        this.f26106b = wVar;
        this.f26107c = j3;
    }

    @Override // v8.v
    public final void a(w wVar) {
        v vVar = this.f26108d;
        vVar.getClass();
        vVar.a(this);
    }

    @Override // v8.a1
    public final void b(b1 b1Var) {
        v vVar = this.f26108d;
        vVar.getClass();
        vVar.b(this);
    }

    @Override // v8.b1
    public final boolean continueLoading(long j3) {
        return this.f26106b.continueLoading(j3 - this.f26107c);
    }

    @Override // v8.b1
    public final long getBufferedPositionUs() {
        long bufferedPositionUs = this.f26106b.getBufferedPositionUs();
        if (bufferedPositionUs == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return this.f26107c + bufferedPositionUs;
    }

    @Override // v8.b1
    public final long getNextLoadPositionUs() {
        long nextLoadPositionUs = this.f26106b.getNextLoadPositionUs();
        if (nextLoadPositionUs == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return this.f26107c + nextLoadPositionUs;
    }

    @Override // v8.w
    public final j1 getTrackGroups() {
        return this.f26106b.getTrackGroups();
    }

    @Override // v8.b1
    public final boolean isLoading() {
        return this.f26106b.isLoading();
    }

    @Override // v8.w
    public final void maybeThrowPrepareError() {
        this.f26106b.maybeThrowPrepareError();
    }

    @Override // v8.w
    public final void n(v vVar, long j3) {
        this.f26108d = vVar;
        this.f26106b.n(this, j3 - this.f26107c);
    }

    @Override // v8.w
    public final void o(long j3) {
        this.f26106b.o(j3 - this.f26107c);
    }

    @Override // v8.w
    public final long r(k9.q[] qVarArr, boolean[] zArr, z0[] z0VarArr, boolean[] zArr2, long j3) {
        z0[] z0VarArr2 = new z0[z0VarArr.length];
        int i10 = 0;
        while (true) {
            z0 z0Var = null;
            if (i10 >= z0VarArr.length) {
                break;
            }
            g0 g0Var = (g0) z0VarArr[i10];
            if (g0Var != null) {
                z0Var = g0Var.f26123b;
            }
            z0VarArr2[i10] = z0Var;
            i10++;
        }
        w wVar = this.f26106b;
        long j10 = this.f26107c;
        long r6 = wVar.r(qVarArr, zArr, z0VarArr2, zArr2, j3 - j10);
        for (int i11 = 0; i11 < z0VarArr.length; i11++) {
            z0 z0Var2 = z0VarArr2[i11];
            if (z0Var2 == null) {
                z0VarArr[i11] = null;
            } else {
                z0 z0Var3 = z0VarArr[i11];
                if (z0Var3 == null || ((g0) z0Var3).f26123b != z0Var2) {
                    z0VarArr[i11] = new g0(z0Var2, j10);
                }
            }
        }
        return r6 + j10;
    }

    @Override // v8.w
    public final long readDiscontinuity() {
        long readDiscontinuity = this.f26106b.readDiscontinuity();
        if (readDiscontinuity == C.TIME_UNSET) {
            return C.TIME_UNSET;
        }
        return this.f26107c + readDiscontinuity;
    }

    @Override // v8.b1
    public final void reevaluateBuffer(long j3) {
        this.f26106b.reevaluateBuffer(j3 - this.f26107c);
    }

    @Override // v8.w
    public final long s(long j3, p2 p2Var) {
        long j10 = this.f26107c;
        return this.f26106b.s(j3 - j10, p2Var) + j10;
    }

    @Override // v8.w
    public final long seekToUs(long j3) {
        long j10 = this.f26107c;
        return this.f26106b.seekToUs(j3 - j10) + j10;
    }
}
