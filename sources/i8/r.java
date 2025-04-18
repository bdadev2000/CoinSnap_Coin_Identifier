package i8;

import com.mbridge.msdk.playercommon.exoplayer2.C;

/* loaded from: classes3.dex */
public final class r implements j {
    public final r4.c a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f19401b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f19402c;

    /* renamed from: g, reason: collision with root package name */
    public long f19406g;

    /* renamed from: i, reason: collision with root package name */
    public String f19408i;

    /* renamed from: j, reason: collision with root package name */
    public y7.a0 f19409j;

    /* renamed from: k, reason: collision with root package name */
    public q f19410k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f19411l;

    /* renamed from: n, reason: collision with root package name */
    public boolean f19413n;

    /* renamed from: h, reason: collision with root package name */
    public final boolean[] f19407h = new boolean[3];

    /* renamed from: d, reason: collision with root package name */
    public final w f19403d = new w(7);

    /* renamed from: e, reason: collision with root package name */
    public final w f19404e = new w(8);

    /* renamed from: f, reason: collision with root package name */
    public final w f19405f = new w(6);

    /* renamed from: m, reason: collision with root package name */
    public long f19412m = C.TIME_UNSET;

    /* renamed from: o, reason: collision with root package name */
    public final n9.x f19414o = new n9.x();

    public r(r4.c cVar, boolean z10, boolean z11) {
        this.a = cVar;
        this.f19401b = z10;
        this.f19402c = z11;
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x01e2, code lost:
    
        if (r6.f19381n != r7.f19381n) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x01f3, code lost:
    
        if (r6.f19383p != r7.f19383p) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0201, code lost:
    
        if (r6.f19379l != r7.f19379l) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0207, code lost:
    
        if (r6 == false) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x029a, code lost:
    
        if (r5 != 1) goto L126;
     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x02ba A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:101:0x029d  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0222  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x024a  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0261 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x026f  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0278  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0299  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x02a2  */
    @Override // i8.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(n9.x r29) {
        /*
            Method dump skipped, instructions count: 706
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: i8.r.a(n9.x):void");
    }

    @Override // i8.j
    public final void b(int i10, long j3) {
        boolean z10;
        if (j3 != C.TIME_UNSET) {
            this.f19412m = j3;
        }
        boolean z11 = this.f19413n;
        if ((i10 & 2) != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f19413n = z10 | z11;
    }

    @Override // i8.j
    public final void c(y7.n nVar, h0 h0Var) {
        h0Var.a();
        h0Var.b();
        this.f19408i = h0Var.f19318e;
        h0Var.b();
        y7.a0 track = nVar.track(h0Var.f19317d, 2);
        this.f19409j = track;
        this.f19410k = new q(track, this.f19401b, this.f19402c);
        this.a.l(nVar, h0Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00ff  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void d(byte[] r18, int r19, int r20) {
        /*
            Method dump skipped, instructions count: 394
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: i8.r.d(byte[], int, int):void");
    }

    @Override // i8.j
    public final void packetFinished() {
    }

    @Override // i8.j
    public final void seek() {
        this.f19406g = 0L;
        this.f19413n = false;
        this.f19412m = C.TIME_UNSET;
        n9.u.a(this.f19407h);
        this.f19403d.c();
        this.f19404e.c();
        this.f19405f.c();
        q qVar = this.f19410k;
        if (qVar != null) {
            qVar.f19393k = false;
            qVar.f19397o = false;
            p pVar = qVar.f19396n;
            pVar.f19369b = false;
            pVar.a = false;
        }
    }
}
