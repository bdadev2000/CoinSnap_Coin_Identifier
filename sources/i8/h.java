package i8;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import s7.r0;

/* loaded from: classes3.dex */
public final class h implements j {

    /* renamed from: b, reason: collision with root package name */
    public final String f19305b;

    /* renamed from: c, reason: collision with root package name */
    public String f19306c;

    /* renamed from: d, reason: collision with root package name */
    public y7.a0 f19307d;

    /* renamed from: f, reason: collision with root package name */
    public int f19309f;

    /* renamed from: g, reason: collision with root package name */
    public int f19310g;

    /* renamed from: h, reason: collision with root package name */
    public long f19311h;

    /* renamed from: i, reason: collision with root package name */
    public r0 f19312i;

    /* renamed from: j, reason: collision with root package name */
    public int f19313j;
    public final n9.x a = new n9.x(new byte[18]);

    /* renamed from: e, reason: collision with root package name */
    public int f19308e = 0;

    /* renamed from: k, reason: collision with root package name */
    public long f19314k = C.TIME_UNSET;

    public h(String str) {
        this.f19305b = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:62:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0238  */
    @Override // i8.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(n9.x r23) {
        /*
            Method dump skipped, instructions count: 711
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: i8.h.a(n9.x):void");
    }

    @Override // i8.j
    public final void b(int i10, long j3) {
        if (j3 != C.TIME_UNSET) {
            this.f19314k = j3;
        }
    }

    @Override // i8.j
    public final void c(y7.n nVar, h0 h0Var) {
        h0Var.a();
        h0Var.b();
        this.f19306c = h0Var.f19318e;
        h0Var.b();
        this.f19307d = nVar.track(h0Var.f19317d, 1);
    }

    @Override // i8.j
    public final void packetFinished() {
    }

    @Override // i8.j
    public final void seek() {
        this.f19308e = 0;
        this.f19309f = 0;
        this.f19310g = 0;
        this.f19314k = C.TIME_UNSET;
    }
}
