package i8;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import s7.r0;

/* loaded from: classes3.dex */
public final class u implements j {
    public final String a;

    /* renamed from: b, reason: collision with root package name */
    public final n9.x f19440b;

    /* renamed from: c, reason: collision with root package name */
    public final y7.c0 f19441c;

    /* renamed from: d, reason: collision with root package name */
    public y7.a0 f19442d;

    /* renamed from: e, reason: collision with root package name */
    public String f19443e;

    /* renamed from: f, reason: collision with root package name */
    public r0 f19444f;

    /* renamed from: g, reason: collision with root package name */
    public int f19445g;

    /* renamed from: h, reason: collision with root package name */
    public int f19446h;

    /* renamed from: i, reason: collision with root package name */
    public int f19447i;

    /* renamed from: j, reason: collision with root package name */
    public int f19448j;

    /* renamed from: k, reason: collision with root package name */
    public long f19449k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f19450l;

    /* renamed from: m, reason: collision with root package name */
    public int f19451m;

    /* renamed from: n, reason: collision with root package name */
    public int f19452n;

    /* renamed from: o, reason: collision with root package name */
    public int f19453o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f19454p;

    /* renamed from: q, reason: collision with root package name */
    public long f19455q;

    /* renamed from: r, reason: collision with root package name */
    public int f19456r;

    /* renamed from: s, reason: collision with root package name */
    public long f19457s;

    /* renamed from: t, reason: collision with root package name */
    public int f19458t;
    public String u;

    public u(String str) {
        this.a = str;
        n9.x xVar = new n9.x(LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY);
        this.f19440b = xVar;
        this.f19441c = new y7.c0(xVar.a, 2, (Object) null);
        this.f19449k = C.TIME_UNSET;
    }

    /* JADX WARN: Code restructure failed: missing block: B:126:0x017e, code lost:
    
        throw s7.x1.a(null, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x018b, code lost:
    
        if (r23.f19450l == false) goto L68;
     */
    @Override // i8.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(n9.x r24) {
        /*
            Method dump skipped, instructions count: 592
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: i8.u.a(n9.x):void");
    }

    @Override // i8.j
    public final void b(int i10, long j3) {
        if (j3 != C.TIME_UNSET) {
            this.f19449k = j3;
        }
    }

    @Override // i8.j
    public final void c(y7.n nVar, h0 h0Var) {
        h0Var.a();
        h0Var.b();
        this.f19442d = nVar.track(h0Var.f19317d, 1);
        h0Var.b();
        this.f19443e = h0Var.f19318e;
    }

    @Override // i8.j
    public final void packetFinished() {
    }

    @Override // i8.j
    public final void seek() {
        this.f19445g = 0;
        this.f19449k = C.TIME_UNSET;
        this.f19450l = false;
    }
}
