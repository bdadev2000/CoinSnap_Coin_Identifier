package c8;

import n9.x;
import y7.h;
import y7.l;
import y7.m;
import y7.n;

/* loaded from: classes3.dex */
public final class b implements l {

    /* renamed from: f, reason: collision with root package name */
    public n f2719f;

    /* renamed from: h, reason: collision with root package name */
    public boolean f2721h;

    /* renamed from: i, reason: collision with root package name */
    public long f2722i;

    /* renamed from: j, reason: collision with root package name */
    public int f2723j;

    /* renamed from: k, reason: collision with root package name */
    public int f2724k;

    /* renamed from: l, reason: collision with root package name */
    public int f2725l;

    /* renamed from: m, reason: collision with root package name */
    public long f2726m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f2727n;

    /* renamed from: o, reason: collision with root package name */
    public a f2728o;

    /* renamed from: p, reason: collision with root package name */
    public e f2729p;
    public final x a = new x(4);

    /* renamed from: b, reason: collision with root package name */
    public final x f2715b = new x(9);

    /* renamed from: c, reason: collision with root package name */
    public final x f2716c = new x(11);

    /* renamed from: d, reason: collision with root package name */
    public final x f2717d = new x();

    /* renamed from: e, reason: collision with root package name */
    public final c f2718e = new c();

    /* renamed from: g, reason: collision with root package name */
    public int f2720g = 1;

    @Override // y7.l
    public final void a(n nVar) {
        this.f2719f = nVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:58:0x005e, code lost:
    
        if (r2.l(r14, r7) != false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0060, code lost:
    
        r2 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0088, code lost:
    
        if (r2.l(r14, r7) != false) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00d9 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0009 A[SYNTHETIC] */
    @Override // y7.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int b(y7.m r17, y7.p r18) {
        /*
            Method dump skipped, instructions count: 384
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: c8.b.b(y7.m, y7.p):int");
    }

    public final x c(m mVar) {
        int i10 = this.f2725l;
        x xVar = this.f2717d;
        byte[] bArr = xVar.a;
        if (i10 > bArr.length) {
            xVar.E(new byte[Math.max(bArr.length * 2, i10)], 0);
        } else {
            xVar.G(0);
        }
        xVar.F(this.f2725l);
        mVar.readFully(xVar.a, 0, this.f2725l);
        return xVar;
    }

    @Override // y7.l
    public final boolean d(m mVar) {
        x xVar = this.a;
        h hVar = (h) mVar;
        hVar.peekFully(xVar.a, 0, 3, false);
        xVar.G(0);
        if (xVar.x() != 4607062) {
            return false;
        }
        hVar.peekFully(xVar.a, 0, 2, false);
        xVar.G(0);
        if ((xVar.A() & 250) != 0) {
            return false;
        }
        hVar.peekFully(xVar.a, 0, 4, false);
        xVar.G(0);
        int f10 = xVar.f();
        hVar.f27984f = 0;
        hVar.advancePeekPosition(f10, false);
        hVar.peekFully(xVar.a, 0, 4, false);
        xVar.G(0);
        if (xVar.f() != 0) {
            return false;
        }
        return true;
    }

    @Override // y7.l
    public final void release() {
    }

    @Override // y7.l
    public final void seek(long j3, long j10) {
        if (j3 == 0) {
            this.f2720g = 1;
            this.f2721h = false;
        } else {
            this.f2720g = 3;
        }
        this.f2723j = 0;
    }
}
