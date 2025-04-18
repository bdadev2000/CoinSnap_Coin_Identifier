package l8;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import androidx.core.app.h;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.ArrayList;
import n9.h0;
import s7.f0;
import s7.g;
import s7.i0;
import s7.k1;
import s7.l1;
import s7.r0;
import v8.u0;
import y5.f;

/* loaded from: classes3.dex */
public final class e extends g implements Handler.Callback {

    /* renamed from: q, reason: collision with root package name */
    public final c f21163q;

    /* renamed from: r, reason: collision with root package name */
    public final f0 f21164r;

    /* renamed from: s, reason: collision with root package name */
    public final Handler f21165s;

    /* renamed from: t, reason: collision with root package name */
    public final d f21166t;
    public p6.a u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f21167v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f21168w;

    /* renamed from: x, reason: collision with root package name */
    public long f21169x;

    /* renamed from: y, reason: collision with root package name */
    public b f21170y;

    /* renamed from: z, reason: collision with root package name */
    public long f21171z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(f0 f0Var, Looper looper) {
        super(5);
        Handler handler;
        f fVar = c.f21161b;
        this.f21164r = f0Var;
        if (looper == null) {
            handler = null;
        } else {
            int i10 = h0.a;
            handler = new Handler(looper, this);
        }
        this.f21165s = handler;
        this.f21163q = fVar;
        this.f21166t = new d();
        this.f21171z = C.TIME_UNSET;
    }

    public final void A(b bVar) {
        f0 f0Var = this.f21164r;
        i0 i0Var = f0Var.f24350b;
        l1 l1Var = i0Var.f24401e0;
        l1Var.getClass();
        k1 k1Var = new k1(l1Var);
        int i10 = 0;
        while (true) {
            a[] aVarArr = bVar.f21159b;
            if (i10 >= aVarArr.length) {
                break;
            }
            aVarArr[i10].g(k1Var);
            i10++;
        }
        i0Var.f24401e0 = new l1(k1Var);
        l1 m10 = i0Var.m();
        boolean equals = m10.equals(i0Var.M);
        x.e eVar = i0Var.f24411l;
        if (!equals) {
            i0Var.M = m10;
            eVar.j(14, new h(f0Var, 17));
        }
        eVar.j(28, new h(bVar, 18));
        eVar.g();
    }

    @Override // s7.g
    public final String f() {
        return "MetadataRenderer";
    }

    @Override // s7.g
    public final boolean h() {
        return this.f21168w;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (message.what == 0) {
            A((b) message.obj);
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
        this.f21170y = null;
        this.u = null;
        this.f21171z = C.TIME_UNSET;
    }

    @Override // s7.g
    public final void l(long j3, boolean z10) {
        this.f21170y = null;
        this.f21167v = false;
        this.f21168w = false;
    }

    @Override // s7.g
    public final void q(r0[] r0VarArr, long j3, long j10) {
        this.u = ((f) this.f21163q).a(r0VarArr[0]);
        b bVar = this.f21170y;
        if (bVar != null) {
            long j11 = this.f21171z;
            long j12 = bVar.f21160c;
            long j13 = (j11 + j12) - j10;
            if (j12 != j13) {
                bVar = new b(j13, bVar.f21159b);
            }
            this.f21170y = bVar;
        }
        this.f21171z = j10;
    }

    @Override // s7.g
    public final void s(long j3, long j10) {
        boolean z10 = true;
        while (z10) {
            if (!this.f21167v && this.f21170y == null) {
                d dVar = this.f21166t;
                dVar.e();
                r4.c cVar = this.f24360d;
                cVar.i();
                int r6 = r(cVar, dVar, 0);
                if (r6 == -4) {
                    if (dVar.c(4)) {
                        this.f21167v = true;
                    } else {
                        dVar.f21162l = this.f21169x;
                        dVar.h();
                        p6.a aVar = this.u;
                        int i10 = h0.a;
                        b f10 = aVar.f(dVar);
                        if (f10 != null) {
                            ArrayList arrayList = new ArrayList(f10.f21159b.length);
                            y(f10, arrayList);
                            if (!arrayList.isEmpty()) {
                                this.f21170y = new b(z(dVar.f26892h), (a[]) arrayList.toArray(new a[0]));
                            }
                        }
                    }
                } else if (r6 == -5) {
                    r0 r0Var = (r0) cVar.f24000d;
                    r0Var.getClass();
                    this.f21169x = r0Var.f24727r;
                }
            }
            b bVar = this.f21170y;
            if (bVar != null && bVar.f21160c <= z(j3)) {
                b bVar2 = this.f21170y;
                Handler handler = this.f21165s;
                if (handler != null) {
                    handler.obtainMessage(0, bVar2).sendToTarget();
                } else {
                    A(bVar2);
                }
                this.f21170y = null;
                z10 = true;
            } else {
                z10 = false;
            }
            if (this.f21167v && this.f21170y == null) {
                this.f21168w = true;
            }
        }
    }

    @Override // s7.g
    public final int w(r0 r0Var) {
        int i10;
        if (((f) this.f21163q).c(r0Var)) {
            if (r0Var.I == 0) {
                i10 = 4;
            } else {
                i10 = 2;
            }
            return g.b(i10, 0, 0);
        }
        return g.b(0, 0, 0);
    }

    public final void y(b bVar, ArrayList arrayList) {
        int i10 = 0;
        while (true) {
            a[] aVarArr = bVar.f21159b;
            if (i10 < aVarArr.length) {
                r0 d10 = aVarArr[i10].d();
                if (d10 != null) {
                    f fVar = (f) this.f21163q;
                    if (fVar.c(d10)) {
                        p6.a a = fVar.a(d10);
                        byte[] p10 = aVarArr[i10].p();
                        p10.getClass();
                        d dVar = this.f21166t;
                        dVar.e();
                        dVar.g(p10.length);
                        dVar.f26890f.put(p10);
                        dVar.h();
                        b f10 = a.f(dVar);
                        if (f10 != null) {
                            y(f10, arrayList);
                        }
                        i10++;
                    }
                }
                arrayList.add(aVarArr[i10]);
                i10++;
            } else {
                return;
            }
        }
    }

    public final long z(long j3) {
        boolean z10;
        boolean z11 = true;
        if (j3 != C.TIME_UNSET) {
            z10 = true;
        } else {
            z10 = false;
        }
        u0.m(z10);
        if (this.f21171z == C.TIME_UNSET) {
            z11 = false;
        }
        u0.m(z11);
        return j3 - this.f21171z;
    }
}
