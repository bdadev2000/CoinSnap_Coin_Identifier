package d8;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import n9.x;
import s7.q0;
import s7.r0;
import y7.a0;
import y7.h;
import y7.l;
import y7.m;
import y7.n;
import y7.r;

/* loaded from: classes3.dex */
public final class a implements l {

    /* renamed from: b, reason: collision with root package name */
    public n f16900b;

    /* renamed from: c, reason: collision with root package name */
    public int f16901c;

    /* renamed from: d, reason: collision with root package name */
    public int f16902d;

    /* renamed from: e, reason: collision with root package name */
    public int f16903e;

    /* renamed from: g, reason: collision with root package name */
    public r8.c f16905g;

    /* renamed from: h, reason: collision with root package name */
    public m f16906h;

    /* renamed from: i, reason: collision with root package name */
    public c f16907i;

    /* renamed from: j, reason: collision with root package name */
    public g8.n f16908j;
    public final x a = new x(6);

    /* renamed from: f, reason: collision with root package name */
    public long f16904f = -1;

    @Override // y7.l
    public final void a(n nVar) {
        this.f16900b = nVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x0168  */
    @Override // y7.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int b(y7.m r25, y7.p r26) {
        /*
            Method dump skipped, instructions count: 441
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: d8.a.b(y7.m, y7.p):int");
    }

    public final void c() {
        e(new l8.a[0]);
        n nVar = this.f16900b;
        nVar.getClass();
        nVar.endTracks();
        this.f16900b.d(new r(C.TIME_UNSET));
        this.f16901c = 6;
    }

    @Override // y7.l
    public final boolean d(m mVar) {
        h hVar = (h) mVar;
        if (f(hVar) != 65496) {
            return false;
        }
        int f10 = f(hVar);
        this.f16902d = f10;
        x xVar = this.a;
        if (f10 == 65504) {
            xVar.D(2);
            hVar.peekFully(xVar.a, 0, 2, false);
            hVar.advancePeekPosition(xVar.A() - 2, false);
            this.f16902d = f(hVar);
        }
        if (this.f16902d != 65505) {
            return false;
        }
        hVar.advancePeekPosition(2, false);
        xVar.D(6);
        hVar.peekFully(xVar.a, 0, 6, false);
        if (xVar.w() != 1165519206 || xVar.A() != 0) {
            return false;
        }
        return true;
    }

    public final void e(l8.a... aVarArr) {
        n nVar = this.f16900b;
        nVar.getClass();
        a0 track = nVar.track(LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY, 4);
        q0 q0Var = new q0();
        q0Var.f24666j = "image/jpeg";
        q0Var.f24665i = new l8.b(aVarArr);
        track.f(new r0(q0Var));
    }

    public final int f(h hVar) {
        x xVar = this.a;
        xVar.D(2);
        hVar.peekFully(xVar.a, 0, 2, false);
        return xVar.A();
    }

    @Override // y7.l
    public final void release() {
        g8.n nVar = this.f16908j;
        if (nVar != null) {
            nVar.getClass();
        }
    }

    @Override // y7.l
    public final void seek(long j3, long j10) {
        if (j3 == 0) {
            this.f16901c = 0;
            this.f16908j = null;
        } else if (this.f16901c == 5) {
            g8.n nVar = this.f16908j;
            nVar.getClass();
            nVar.seek(j3, j10);
        }
    }
}
