package y8;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import n9.h0;
import s7.r0;
import v8.z0;

/* loaded from: classes3.dex */
public final class n implements z0 {

    /* renamed from: b, reason: collision with root package name */
    public final r0 f28100b;

    /* renamed from: d, reason: collision with root package name */
    public long[] f28102d;

    /* renamed from: f, reason: collision with root package name */
    public boolean f28103f;

    /* renamed from: g, reason: collision with root package name */
    public z8.g f28104g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f28105h;

    /* renamed from: i, reason: collision with root package name */
    public int f28106i;

    /* renamed from: c, reason: collision with root package name */
    public final r4.c f28101c = new r4.c(25);

    /* renamed from: j, reason: collision with root package name */
    public long f28107j = C.TIME_UNSET;

    public n(z8.g gVar, r0 r0Var, boolean z10) {
        this.f28100b = r0Var;
        this.f28104g = gVar;
        this.f28102d = gVar.f28618b;
        b(gVar, z10);
    }

    public final void a(long j3) {
        boolean z10 = true;
        int b3 = h0.b(this.f28102d, j3, true);
        this.f28106i = b3;
        if (!this.f28103f || b3 != this.f28102d.length) {
            z10 = false;
        }
        if (!z10) {
            j3 = C.TIME_UNSET;
        }
        this.f28107j = j3;
    }

    public final void b(z8.g gVar, boolean z10) {
        long j3;
        int i10 = this.f28106i;
        if (i10 == 0) {
            j3 = -9223372036854775807L;
        } else {
            j3 = this.f28102d[i10 - 1];
        }
        this.f28103f = z10;
        this.f28104g = gVar;
        long[] jArr = gVar.f28618b;
        this.f28102d = jArr;
        long j10 = this.f28107j;
        if (j10 != C.TIME_UNSET) {
            a(j10);
        } else if (j3 != C.TIME_UNSET) {
            this.f28106i = h0.b(jArr, j3, false);
        }
    }

    @Override // v8.z0
    public final int d(r4.c cVar, w7.i iVar, int i10) {
        boolean z10;
        int i11 = this.f28106i;
        if (i11 == this.f28102d.length) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10 && !this.f28103f) {
            iVar.f26867c = 4;
            return -4;
        }
        if ((i10 & 2) == 0 && this.f28105h) {
            if (z10) {
                return -3;
            }
            if ((i10 & 1) == 0) {
                this.f28106i = i11 + 1;
            }
            if ((i10 & 4) == 0) {
                byte[] o10 = this.f28101c.o(this.f28104g.a[i11]);
                iVar.g(o10.length);
                iVar.f26890f.put(o10);
            }
            iVar.f26892h = this.f28102d[i11];
            iVar.f26867c = 1;
            return -4;
        }
        cVar.f24000d = this.f28100b;
        this.f28105h = true;
        return -5;
    }

    @Override // v8.z0
    public final boolean isReady() {
        return true;
    }

    @Override // v8.z0
    public final void maybeThrowError() {
    }

    @Override // v8.z0
    public final int skipData(long j3) {
        int max = Math.max(this.f28106i, h0.b(this.f28102d, j3, true));
        int i10 = max - this.f28106i;
        this.f28106i = max;
        return i10;
    }
}
