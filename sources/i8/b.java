package i8;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import s7.r0;

/* loaded from: classes3.dex */
public final class b implements j {
    public final y7.c0 a;

    /* renamed from: b, reason: collision with root package name */
    public final n9.x f19214b;

    /* renamed from: c, reason: collision with root package name */
    public final String f19215c;

    /* renamed from: d, reason: collision with root package name */
    public String f19216d;

    /* renamed from: e, reason: collision with root package name */
    public y7.a0 f19217e;

    /* renamed from: f, reason: collision with root package name */
    public int f19218f;

    /* renamed from: g, reason: collision with root package name */
    public int f19219g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f19220h;

    /* renamed from: i, reason: collision with root package name */
    public long f19221i;

    /* renamed from: j, reason: collision with root package name */
    public r0 f19222j;

    /* renamed from: k, reason: collision with root package name */
    public int f19223k;

    /* renamed from: l, reason: collision with root package name */
    public long f19224l;

    public b(String str) {
        y7.c0 c0Var = new y7.c0(new byte[128], 2, (Object) null);
        this.a = c0Var;
        this.f19214b = new n9.x(c0Var.f27958d);
        this.f19218f = 0;
        this.f19224l = C.TIME_UNSET;
        this.f19215c = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0255  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0286  */
    @Override // i8.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(n9.x r28) {
        /*
            Method dump skipped, instructions count: 999
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: i8.b.a(n9.x):void");
    }

    @Override // i8.j
    public final void b(int i10, long j3) {
        if (j3 != C.TIME_UNSET) {
            this.f19224l = j3;
        }
    }

    @Override // i8.j
    public final void c(y7.n nVar, h0 h0Var) {
        h0Var.a();
        h0Var.b();
        this.f19216d = h0Var.f19318e;
        h0Var.b();
        this.f19217e = nVar.track(h0Var.f19317d, 1);
    }

    @Override // i8.j
    public final void packetFinished() {
    }

    @Override // i8.j
    public final void seek() {
        this.f19218f = 0;
        this.f19219g = 0;
        this.f19220h = false;
        this.f19224l = C.TIME_UNSET;
    }
}
