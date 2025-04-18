package i8;

/* loaded from: classes3.dex */
public final class e implements y7.l {

    /* renamed from: d, reason: collision with root package name */
    public final n9.x f19254d;

    /* renamed from: e, reason: collision with root package name */
    public final y7.c0 f19255e;

    /* renamed from: f, reason: collision with root package name */
    public y7.n f19256f;

    /* renamed from: g, reason: collision with root package name */
    public long f19257g;

    /* renamed from: j, reason: collision with root package name */
    public boolean f19260j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f19261k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f19262l;
    public final int a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final f f19252b = new f(true, null);

    /* renamed from: c, reason: collision with root package name */
    public final n9.x f19253c = new n9.x(2048);

    /* renamed from: i, reason: collision with root package name */
    public int f19259i = -1;

    /* renamed from: h, reason: collision with root package name */
    public long f19258h = -1;

    public e() {
        n9.x xVar = new n9.x(10);
        this.f19254d = xVar;
        this.f19255e = new y7.c0(xVar.a, 2, (Object) null);
    }

    @Override // y7.l
    public final void a(y7.n nVar) {
        this.f19256f = nVar;
        this.f19252b.c(nVar, new h0(0, 1));
        nVar.endTracks();
    }

    /* JADX WARN: Code restructure failed: missing block: B:78:0x0090, code lost:
    
        r19.f19260j = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0099, code lost:
    
        throw s7.x1.a("Malformed ADTS stream", null);
     */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0118 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00bc  */
    @Override // y7.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int b(y7.m r20, y7.p r21) {
        /*
            Method dump skipped, instructions count: 305
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: i8.e.b(y7.m, y7.p):int");
    }

    public final int c(y7.m mVar) {
        int i10 = 0;
        while (true) {
            n9.x xVar = this.f19254d;
            mVar.peekFully(xVar.a, 0, 10);
            xVar.G(0);
            if (xVar.x() != 4801587) {
                break;
            }
            xVar.H(3);
            int u = xVar.u();
            i10 += u + 10;
            mVar.advancePeekPosition(u);
        }
        mVar.resetPeekPosition();
        mVar.advancePeekPosition(i10);
        if (this.f19258h == -1) {
            this.f19258h = i10;
        }
        return i10;
    }

    @Override // y7.l
    public final boolean d(y7.m mVar) {
        boolean z10;
        int c10 = c(mVar);
        int i10 = c10;
        int i11 = 0;
        int i12 = 0;
        do {
            n9.x xVar = this.f19254d;
            y7.h hVar = (y7.h) mVar;
            hVar.peekFully(xVar.a, 0, 2, false);
            xVar.G(0);
            if ((xVar.A() & 65526) == 65520) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10) {
                i10++;
                hVar.f27984f = 0;
                hVar.advancePeekPosition(i10, false);
            } else {
                i11++;
                if (i11 >= 4 && i12 > 188) {
                    return true;
                }
                hVar.peekFully(xVar.a, 0, 4, false);
                y7.c0 c0Var = this.f19255e;
                c0Var.o(14);
                int i13 = c0Var.i(13);
                if (i13 <= 6) {
                    i10++;
                    hVar.f27984f = 0;
                    hVar.advancePeekPosition(i10, false);
                } else {
                    hVar.advancePeekPosition(i13 - 6, false);
                    i12 += i13;
                }
            }
            i11 = 0;
            i12 = 0;
        } while (i10 - c10 < 8192);
        return false;
    }

    @Override // y7.l
    public final void release() {
    }

    @Override // y7.l
    public final void seek(long j3, long j10) {
        this.f19261k = false;
        this.f19252b.seek();
        this.f19257g = j10;
    }
}
