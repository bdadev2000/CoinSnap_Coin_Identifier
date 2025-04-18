package i8;

import com.mbridge.msdk.playercommon.exoplayer2.C;

/* loaded from: classes3.dex */
public final class l implements j {

    /* renamed from: q, reason: collision with root package name */
    public static final double[] f19330q = {23.976023976023978d, 24.0d, 25.0d, 29.97002997002997d, 30.0d, 50.0d, 59.94005994005994d, 60.0d};
    public String a;

    /* renamed from: b, reason: collision with root package name */
    public y7.a0 f19331b;

    /* renamed from: c, reason: collision with root package name */
    public final j0 f19332c;

    /* renamed from: d, reason: collision with root package name */
    public final n9.x f19333d;

    /* renamed from: e, reason: collision with root package name */
    public final w f19334e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean[] f19335f = new boolean[4];

    /* renamed from: g, reason: collision with root package name */
    public final k f19336g = new k();

    /* renamed from: h, reason: collision with root package name */
    public long f19337h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f19338i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f19339j;

    /* renamed from: k, reason: collision with root package name */
    public long f19340k;

    /* renamed from: l, reason: collision with root package name */
    public long f19341l;

    /* renamed from: m, reason: collision with root package name */
    public long f19342m;

    /* renamed from: n, reason: collision with root package name */
    public long f19343n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f19344o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f19345p;

    public l(j0 j0Var) {
        this.f19332c = j0Var;
        if (j0Var != null) {
            this.f19334e = new w(178);
            this.f19333d = new n9.x();
        } else {
            this.f19334e = null;
            this.f19333d = null;
        }
        this.f19341l = C.TIME_UNSET;
        this.f19343n = C.TIME_UNSET;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01cd  */
    @Override // i8.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(n9.x r21) {
        /*
            Method dump skipped, instructions count: 493
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: i8.l.a(n9.x):void");
    }

    @Override // i8.j
    public final void b(int i10, long j3) {
        this.f19341l = j3;
    }

    @Override // i8.j
    public final void c(y7.n nVar, h0 h0Var) {
        h0Var.a();
        h0Var.b();
        this.a = h0Var.f19318e;
        h0Var.b();
        this.f19331b = nVar.track(h0Var.f19317d, 2);
        j0 j0Var = this.f19332c;
        if (j0Var != null) {
            j0Var.b(nVar, h0Var);
        }
    }

    @Override // i8.j
    public final void packetFinished() {
    }

    @Override // i8.j
    public final void seek() {
        n9.u.a(this.f19335f);
        k kVar = this.f19336g;
        kVar.a = false;
        kVar.f19327b = 0;
        kVar.f19328c = 0;
        w wVar = this.f19334e;
        if (wVar != null) {
            wVar.c();
        }
        this.f19337h = 0L;
        this.f19338i = false;
        this.f19341l = C.TIME_UNSET;
        this.f19343n = C.TIME_UNSET;
    }
}
