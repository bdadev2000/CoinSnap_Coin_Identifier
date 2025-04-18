package a8;

import androidx.work.p;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import n9.h0;
import n9.x;
import y7.l;
import y7.m;
import y7.n;

/* loaded from: classes3.dex */
public final class c implements l {

    /* renamed from: c, reason: collision with root package name */
    public int f313c;

    /* renamed from: e, reason: collision with root package name */
    public d f315e;

    /* renamed from: h, reason: collision with root package name */
    public long f318h;

    /* renamed from: i, reason: collision with root package name */
    public f f319i;

    /* renamed from: m, reason: collision with root package name */
    public int f323m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f324n;
    public final x a = new x(12);

    /* renamed from: b, reason: collision with root package name */
    public final b f312b = new b();

    /* renamed from: d, reason: collision with root package name */
    public n f314d = new p(0);

    /* renamed from: g, reason: collision with root package name */
    public f[] f317g = new f[0];

    /* renamed from: k, reason: collision with root package name */
    public long f321k = -1;

    /* renamed from: l, reason: collision with root package name */
    public long f322l = -1;

    /* renamed from: j, reason: collision with root package name */
    public int f320j = -1;

    /* renamed from: f, reason: collision with root package name */
    public long f316f = C.TIME_UNSET;

    @Override // y7.l
    public final void a(n nVar) {
        this.f313c = 0;
        this.f314d = nVar;
        this.f318h = -1L;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0032 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0358  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0033  */
    @Override // y7.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int b(y7.m r24, y7.p r25) {
        /*
            Method dump skipped, instructions count: 1038
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: a8.c.b(y7.m, y7.p):int");
    }

    public final f c(int i10) {
        boolean z10;
        for (f fVar : this.f317g) {
            if (fVar.f331b != i10 && fVar.f332c != i10) {
                z10 = false;
            } else {
                z10 = true;
            }
            if (z10) {
                return fVar;
            }
        }
        return null;
    }

    @Override // y7.l
    public final boolean d(m mVar) {
        x xVar = this.a;
        mVar.peekFully(xVar.a, 0, 12);
        xVar.G(0);
        if (xVar.i() != 1179011410) {
            return false;
        }
        xVar.H(4);
        if (xVar.i() != 541677121) {
            return false;
        }
        return true;
    }

    @Override // y7.l
    public final void release() {
    }

    @Override // y7.l
    public final void seek(long j3, long j10) {
        this.f318h = -1L;
        this.f319i = null;
        for (f fVar : this.f317g) {
            if (fVar.f339j == 0) {
                fVar.f337h = 0;
            } else {
                fVar.f337h = fVar.f341l[h0.f(fVar.f340k, j3, true)];
            }
        }
        if (j3 == 0) {
            if (this.f317g.length == 0) {
                this.f313c = 0;
                return;
            } else {
                this.f313c = 3;
                return;
            }
        }
        this.f313c = 6;
    }
}
