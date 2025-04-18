package androidx.recyclerview.widget;

import com.bytedance.sdk.component.Sg.YFl.Sg;
import com.bytedance.sdk.component.Sg.YFl.tN;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.IOException;

/* loaded from: classes.dex */
public final class c implements tN, y8.i {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f1881b;

    /* renamed from: c, reason: collision with root package name */
    public long f1882c;

    /* renamed from: d, reason: collision with root package name */
    public Object f1883d;

    public /* synthetic */ c(Object obj, long j3, int i10) {
        this.f1881b = i10;
        this.f1883d = obj;
        this.f1882c = j3;
    }

    @Override // com.bytedance.sdk.component.Sg.YFl.tN
    public final void YFl(Sg sg2, IOException iOException) {
        Object obj = this.f1883d;
        g5.a.c((g5.a) obj, ((g5.a) obj).f18196b, 601, iOException.getMessage());
        g5.b.a(((g5.a) this.f1883d).f18196b);
    }

    public final void a(int i10) {
        if (i10 >= 64) {
            Object obj = this.f1883d;
            if (((c) obj) != null) {
                ((c) obj).a(i10 - 64);
                return;
            }
            return;
        }
        this.f1882c &= ~(1 << i10);
    }

    public final int b(int i10) {
        Object obj = this.f1883d;
        if (((c) obj) == null) {
            if (i10 >= 64) {
                return Long.bitCount(this.f1882c);
            }
            return Long.bitCount(this.f1882c & ((1 << i10) - 1));
        }
        if (i10 < 64) {
            return Long.bitCount(this.f1882c & ((1 << i10) - 1));
        }
        return Long.bitCount(this.f1882c) + ((c) obj).b(i10 - 64);
    }

    public final void c() {
        if (((c) this.f1883d) == null) {
            this.f1883d = new c(0);
        }
    }

    @Override // y8.i
    public final long d(long j3, long j10) {
        return ((y7.f) this.f1883d).f27971d[(int) j3];
    }

    @Override // y8.i
    public final long e(long j3, long j10) {
        return 0L;
    }

    public final boolean f(int i10) {
        if (i10 >= 64) {
            c();
            return ((c) this.f1883d).f(i10 - 64);
        }
        if ((this.f1882c & (1 << i10)) != 0) {
            return true;
        }
        return false;
    }

    @Override // y8.i
    public final long g(long j3, long j10) {
        return C.TIME_UNSET;
    }

    @Override // y8.i
    public final long getTimeUs(long j3) {
        return ((y7.f) this.f1883d).f27972e[(int) j3] - this.f1882c;
    }

    @Override // y8.i
    public final z8.j h(long j3) {
        return new z8.j(null, ((y7.f) this.f1883d).f27970c[(int) j3], r0.f27969b[r8]);
    }

    public final void i(int i10, boolean z10) {
        boolean z11;
        if (i10 >= 64) {
            c();
            ((c) this.f1883d).i(i10 - 64, z10);
            return;
        }
        long j3 = this.f1882c;
        if ((Long.MIN_VALUE & j3) != 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        long j10 = (1 << i10) - 1;
        this.f1882c = ((j3 & (~j10)) << 1) | (j3 & j10);
        if (z10) {
            n(i10);
        } else {
            a(i10);
        }
        if (z11 || ((c) this.f1883d) != null) {
            c();
            ((c) this.f1883d).i(0, z11);
        }
    }

    @Override // y8.i
    public final long j(long j3, long j10) {
        y7.f fVar = (y7.f) this.f1883d;
        return n9.h0.f(fVar.f27972e, j3 + this.f1882c, true);
    }

    public final boolean k(int i10) {
        boolean z10;
        if (i10 >= 64) {
            c();
            return ((c) this.f1883d).k(i10 - 64);
        }
        long j3 = 1 << i10;
        long j10 = this.f1882c;
        if ((j10 & j3) != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        long j11 = j10 & (~j3);
        this.f1882c = j11;
        long j12 = j3 - 1;
        this.f1882c = (j11 & j12) | Long.rotateRight((~j12) & j11, 1);
        Object obj = this.f1883d;
        if (((c) obj) != null) {
            if (((c) obj).f(0)) {
                n(63);
            }
            ((c) this.f1883d).k(0);
        }
        return z10;
    }

    public final void l() {
        this.f1882c = 0L;
        Object obj = this.f1883d;
        if (((c) obj) != null) {
            ((c) obj).l();
        }
    }

    @Override // y8.i
    public final long m(long j3) {
        return ((y7.f) this.f1883d).a;
    }

    public final void n(int i10) {
        if (i10 >= 64) {
            c();
            ((c) this.f1883d).n(i10 - 64);
        } else {
            this.f1882c |= 1 << i10;
        }
    }

    @Override // y8.i
    public final boolean t() {
        return true;
    }

    public final String toString() {
        switch (this.f1881b) {
            case 0:
                if (((c) this.f1883d) == null) {
                    return Long.toBinaryString(this.f1882c);
                }
                return ((c) this.f1883d).toString() + "xx" + Long.toBinaryString(this.f1882c);
            default:
                return super.toString();
        }
    }

    @Override // y8.i
    public final long u() {
        return 0L;
    }

    @Override // y8.i
    public final long v(long j3, long j10) {
        return ((y7.f) this.f1883d).a;
    }

    public c(long j3, com.google.common.collect.z1 z1Var) {
        this.f1881b = 3;
        this.f1882c = j3;
        this.f1883d = z1Var;
    }

    public c(int i10) {
        this.f1881b = i10;
        if (i10 != 2) {
            this.f1882c = 0L;
        } else {
            this.f1882c = 0L;
            this.f1883d = l7.c.REASON_UNKNOWN;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:83:0x00c9, code lost:
    
        r0 = r18.f1883d;
        r3 = (g5.a) r0;
        r0 = ((g5.a) r0).f18196b;
        r4 = r20.tN();
        r3.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x00db, code lost:
    
        monitor-enter(r5.b.class);
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x00dc, code lost:
    
        r3 = r3.f18200f.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x00e6, code lost:
    
        if (r3.hasNext() == false) goto L119;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x00e8, code lost:
    
        r6 = (r5.b) r3.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x00ee, code lost:
    
        if (r6 == null) goto L122;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x00f0, code lost:
    
        r6.Sg(r0, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x00f4, code lost:
    
        monitor-exit(r5.b.class);
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x00f5, code lost:
    
        g5.a.b((g5.a) r18.f1883d, r13);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:23:0x01b2 A[Catch: all -> 0x01cd, TryCatch #6 {all -> 0x01cd, blocks: (B:18:0x0196, B:21:0x01a7, B:23:0x01b2, B:24:0x01b6), top: B:17:0x0196 }] */
    /* JADX WARN: Type inference failed for: r13v3 */
    @Override // com.bytedance.sdk.component.Sg.YFl.tN
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void YFl(com.bytedance.sdk.component.Sg.YFl.Sg r19, com.bytedance.sdk.component.Sg.YFl.EH r20) {
        /*
            Method dump skipped, instructions count: 518
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.c.YFl(com.bytedance.sdk.component.Sg.YFl.Sg, com.bytedance.sdk.component.Sg.YFl.EH):void");
    }
}
