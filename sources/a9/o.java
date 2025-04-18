package a9;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.google.common.collect.z1;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import n9.h0;
import n9.q;
import s7.f0;
import s7.i0;
import s7.r0;
import v8.u0;

/* loaded from: classes3.dex */
public final class o extends s7.g implements Handler.Callback {
    public l A;
    public m B;
    public m C;
    public int D;
    public long E;
    public long F;
    public long G;

    /* renamed from: q, reason: collision with root package name */
    public final Handler f406q;

    /* renamed from: r, reason: collision with root package name */
    public final n f407r;

    /* renamed from: s, reason: collision with root package name */
    public final k f408s;

    /* renamed from: t, reason: collision with root package name */
    public final r4.c f409t;
    public boolean u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f410v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f411w;

    /* renamed from: x, reason: collision with root package name */
    public int f412x;

    /* renamed from: y, reason: collision with root package name */
    public r0 f413y;

    /* renamed from: z, reason: collision with root package name */
    public i f414z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(f0 f0Var, Looper looper) {
        super(3);
        Handler handler;
        ni.a aVar = k.R7;
        this.f407r = f0Var;
        if (looper == null) {
            handler = null;
        } else {
            int i10 = h0.a;
            handler = new Handler(looper, this);
        }
        this.f406q = handler;
        this.f408s = aVar;
        this.f409t = new r4.c(14, 0);
        this.E = C.TIME_UNSET;
        this.F = C.TIME_UNSET;
        this.G = C.TIME_UNSET;
    }

    public final long A(long j3) {
        boolean z10;
        boolean z11 = true;
        if (j3 != C.TIME_UNSET) {
            z10 = true;
        } else {
            z10 = false;
        }
        u0.m(z10);
        if (this.F == C.TIME_UNSET) {
            z11 = false;
        }
        u0.m(z11);
        return j3 - this.F;
    }

    public final void B(c cVar) {
        com.google.common.collect.r0 r0Var = cVar.f383b;
        n nVar = this.f407r;
        ((f0) nVar).f24350b.f24411l.k(27, new d6.d(r0Var));
        i0 i0Var = ((f0) nVar).f24350b;
        i0Var.f24393a0 = cVar;
        i0Var.f24411l.k(27, new androidx.core.app.h(cVar, 20));
    }

    public final void C() {
        this.A = null;
        this.D = -1;
        m mVar = this.B;
        if (mVar != null) {
            mVar.e();
            this.B = null;
        }
        m mVar2 = this.C;
        if (mVar2 != null) {
            mVar2.e();
            this.C = null;
        }
    }

    @Override // s7.g
    public final String f() {
        return "TextRenderer";
    }

    @Override // s7.g
    public final boolean h() {
        return this.f410v;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (message.what == 0) {
            B((c) message.obj);
            return true;
        }
        throw new IllegalStateException();
    }

    @Override // s7.g
    public final boolean i() {
        return true;
    }

    @Override // s7.g
    public final void j() {
        this.f413y = null;
        this.E = C.TIME_UNSET;
        y();
        this.F = C.TIME_UNSET;
        this.G = C.TIME_UNSET;
        C();
        i iVar = this.f414z;
        iVar.getClass();
        iVar.release();
        this.f414z = null;
        this.f412x = 0;
    }

    @Override // s7.g
    public final void l(long j3, boolean z10) {
        this.G = j3;
        y();
        this.u = false;
        this.f410v = false;
        this.E = C.TIME_UNSET;
        if (this.f412x != 0) {
            C();
            i iVar = this.f414z;
            iVar.getClass();
            iVar.release();
            this.f414z = null;
            this.f412x = 0;
            this.f411w = true;
            r0 r0Var = this.f413y;
            r0Var.getClass();
            this.f414z = ((ni.a) this.f408s).p(r0Var);
            return;
        }
        C();
        i iVar2 = this.f414z;
        iVar2.getClass();
        iVar2.flush();
    }

    @Override // s7.g
    public final void q(r0[] r0VarArr, long j3, long j10) {
        this.F = j10;
        r0 r0Var = r0VarArr[0];
        this.f413y = r0Var;
        if (this.f414z != null) {
            this.f412x = 1;
            return;
        }
        this.f411w = true;
        r0Var.getClass();
        this.f414z = ((ni.a) this.f408s).p(r0Var);
    }

    @Override // s7.g
    public final void s(long j3, long j10) {
        boolean z10;
        boolean z11;
        long j11;
        r4.c cVar = this.f409t;
        this.G = j3;
        if (this.f24369n) {
            long j12 = this.E;
            if (j12 != C.TIME_UNSET && j3 >= j12) {
                C();
                this.f410v = true;
            }
        }
        if (this.f410v) {
            return;
        }
        m mVar = this.C;
        k kVar = this.f408s;
        if (mVar == null) {
            i iVar = this.f414z;
            iVar.getClass();
            iVar.setPositionUs(j3);
            try {
                i iVar2 = this.f414z;
                iVar2.getClass();
                this.C = (m) iVar2.dequeueOutputBuffer();
            } catch (j e2) {
                n9.o.d("TextRenderer", "Subtitle decoding failed. streamFormat=" + this.f413y, e2);
                y();
                C();
                i iVar3 = this.f414z;
                iVar3.getClass();
                iVar3.release();
                this.f414z = null;
                this.f412x = 0;
                this.f411w = true;
                r0 r0Var = this.f413y;
                r0Var.getClass();
                this.f414z = ((ni.a) kVar).p(r0Var);
                return;
            }
        }
        if (this.f24364i != 2) {
            return;
        }
        if (this.B != null) {
            long z12 = z();
            z10 = false;
            while (z12 <= j3) {
                this.D++;
                z12 = z();
                z10 = true;
            }
        } else {
            z10 = false;
        }
        m mVar2 = this.C;
        if (mVar2 != null) {
            if (mVar2.c(4)) {
                if (!z10 && z() == Long.MAX_VALUE) {
                    if (this.f412x == 2) {
                        C();
                        i iVar4 = this.f414z;
                        iVar4.getClass();
                        iVar4.release();
                        this.f414z = null;
                        this.f412x = 0;
                        this.f411w = true;
                        r0 r0Var2 = this.f413y;
                        r0Var2.getClass();
                        this.f414z = ((ni.a) kVar).p(r0Var2);
                    } else {
                        C();
                        this.f410v = true;
                    }
                }
            } else if (mVar2.f26896d <= j3) {
                m mVar3 = this.B;
                if (mVar3 != null) {
                    mVar3.e();
                }
                this.D = mVar2.getNextEventTimeIndex(j3);
                this.B = mVar2;
                this.C = null;
                z10 = true;
            }
        }
        if (z10) {
            this.B.getClass();
            int nextEventTimeIndex = this.B.getNextEventTimeIndex(j3);
            if (nextEventTimeIndex != 0 && this.B.getEventTimeCount() != 0) {
                if (nextEventTimeIndex == -1) {
                    j11 = this.B.getEventTime(r4.getEventTimeCount() - 1);
                } else {
                    j11 = this.B.getEventTime(nextEventTimeIndex - 1);
                }
            } else {
                j11 = this.B.f26896d;
            }
            c cVar2 = new c(A(j11), this.B.getCues(j3));
            Handler handler = this.f406q;
            if (handler != null) {
                handler.obtainMessage(0, cVar2).sendToTarget();
            } else {
                B(cVar2);
            }
        }
        if (this.f412x == 2) {
            return;
        }
        while (!this.u) {
            try {
                l lVar = this.A;
                if (lVar == null) {
                    i iVar5 = this.f414z;
                    iVar5.getClass();
                    lVar = (l) iVar5.dequeueInputBuffer();
                    if (lVar == null) {
                        return;
                    } else {
                        this.A = lVar;
                    }
                }
                if (this.f412x == 1) {
                    lVar.f26867c = 4;
                    i iVar6 = this.f414z;
                    iVar6.getClass();
                    iVar6.a(lVar);
                    this.A = null;
                    this.f412x = 2;
                    return;
                }
                int r6 = r(cVar, lVar, 0);
                if (r6 == -4) {
                    if (lVar.c(4)) {
                        this.u = true;
                        this.f411w = false;
                    } else {
                        r0 r0Var3 = (r0) cVar.f24000d;
                        if (r0Var3 == null) {
                            return;
                        }
                        lVar.f403l = r0Var3.f24727r;
                        lVar.h();
                        boolean z13 = this.f411w;
                        if (!lVar.c(1)) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        this.f411w = z13 & z11;
                    }
                    if (!this.f411w) {
                        i iVar7 = this.f414z;
                        iVar7.getClass();
                        iVar7.a(lVar);
                        this.A = null;
                    }
                } else if (r6 == -3) {
                    return;
                }
            } catch (j e10) {
                n9.o.d("TextRenderer", "Subtitle decoding failed. streamFormat=" + this.f413y, e10);
                y();
                C();
                i iVar8 = this.f414z;
                iVar8.getClass();
                iVar8.release();
                this.f414z = null;
                this.f412x = 0;
                this.f411w = true;
                r0 r0Var4 = this.f413y;
                r0Var4.getClass();
                this.f414z = ((ni.a) kVar).p(r0Var4);
                return;
            }
        }
    }

    @Override // s7.g
    public final int w(r0 r0Var) {
        int i10;
        if (((ni.a) this.f408s).v(r0Var)) {
            if (r0Var.I == 0) {
                i10 = 4;
            } else {
                i10 = 2;
            }
            return s7.g.b(i10, 0, 0);
        }
        if (q.k(r0Var.f24723n)) {
            return s7.g.b(1, 0, 0);
        }
        return s7.g.b(0, 0, 0);
    }

    public final void y() {
        c cVar = new c(A(this.G), z1.f12062g);
        Handler handler = this.f406q;
        if (handler != null) {
            handler.obtainMessage(0, cVar).sendToTarget();
        } else {
            B(cVar);
        }
    }

    public final long z() {
        if (this.D == -1) {
            return Long.MAX_VALUE;
        }
        this.B.getClass();
        if (this.D >= this.B.getEventTimeCount()) {
            return Long.MAX_VALUE;
        }
        return this.B.getEventTime(this.D);
    }
}
