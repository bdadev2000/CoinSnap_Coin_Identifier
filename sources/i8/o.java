package i8;

import com.mbridge.msdk.playercommon.exoplayer2.C;

/* loaded from: classes3.dex */
public final class o implements j {

    /* renamed from: l, reason: collision with root package name */
    public static final float[] f19358l = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 1.0f};
    public final j0 a;

    /* renamed from: f, reason: collision with root package name */
    public n f19363f;

    /* renamed from: g, reason: collision with root package name */
    public long f19364g;

    /* renamed from: h, reason: collision with root package name */
    public String f19365h;

    /* renamed from: i, reason: collision with root package name */
    public y7.a0 f19366i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f19367j;

    /* renamed from: c, reason: collision with root package name */
    public final boolean[] f19360c = new boolean[4];

    /* renamed from: d, reason: collision with root package name */
    public final m f19361d = new m();

    /* renamed from: k, reason: collision with root package name */
    public long f19368k = C.TIME_UNSET;

    /* renamed from: e, reason: collision with root package name */
    public final w f19362e = new w(178);

    /* renamed from: b, reason: collision with root package name */
    public final n9.x f19359b = new n9.x();

    public o(j0 j0Var) {
        this.a = j0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0232 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0243  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0261  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x026e A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0278  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x027a  */
    @Override // i8.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(n9.x r26) {
        /*
            Method dump skipped, instructions count: 648
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: i8.o.a(n9.x):void");
    }

    @Override // i8.j
    public final void b(int i10, long j3) {
        if (j3 != C.TIME_UNSET) {
            this.f19368k = j3;
        }
    }

    @Override // i8.j
    public final void c(y7.n nVar, h0 h0Var) {
        h0Var.a();
        h0Var.b();
        this.f19365h = h0Var.f19318e;
        h0Var.b();
        y7.a0 track = nVar.track(h0Var.f19317d, 2);
        this.f19366i = track;
        this.f19363f = new n(track);
        j0 j0Var = this.a;
        if (j0Var != null) {
            j0Var.b(nVar, h0Var);
        }
    }

    @Override // i8.j
    public final void packetFinished() {
    }

    @Override // i8.j
    public final void seek() {
        n9.u.a(this.f19360c);
        m mVar = this.f19361d;
        mVar.a = false;
        mVar.f19348c = 0;
        mVar.f19347b = 0;
        n nVar = this.f19363f;
        if (nVar != null) {
            nVar.f19351b = false;
            nVar.f19352c = false;
            nVar.f19353d = false;
            nVar.f19354e = -1;
        }
        w wVar = this.f19362e;
        if (wVar != null) {
            wVar.c();
        }
        this.f19364g = 0L;
        this.f19368k = C.TIME_UNSET;
    }
}
