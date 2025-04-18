package i8;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import kotlin.jvm.internal.ByteCompanionObject;

/* loaded from: classes3.dex */
public final class t implements j {
    public final r4.c a;

    /* renamed from: b, reason: collision with root package name */
    public String f19427b;

    /* renamed from: c, reason: collision with root package name */
    public y7.a0 f19428c;

    /* renamed from: d, reason: collision with root package name */
    public s f19429d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f19430e;

    /* renamed from: l, reason: collision with root package name */
    public long f19437l;

    /* renamed from: f, reason: collision with root package name */
    public final boolean[] f19431f = new boolean[3];

    /* renamed from: g, reason: collision with root package name */
    public final w f19432g = new w(32);

    /* renamed from: h, reason: collision with root package name */
    public final w f19433h = new w(33);

    /* renamed from: i, reason: collision with root package name */
    public final w f19434i = new w(34);

    /* renamed from: j, reason: collision with root package name */
    public final w f19435j = new w(39);

    /* renamed from: k, reason: collision with root package name */
    public final w f19436k = new w(40);

    /* renamed from: m, reason: collision with root package name */
    public long f19438m = C.TIME_UNSET;

    /* renamed from: n, reason: collision with root package name */
    public final n9.x f19439n = new n9.x();

    public t(r4.c cVar) {
        this.a = cVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x022d  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x023c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x020e  */
    @Override // i8.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(n9.x r36) {
        /*
            Method dump skipped, instructions count: 593
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: i8.t.a(n9.x):void");
    }

    @Override // i8.j
    public final void b(int i10, long j3) {
        if (j3 != C.TIME_UNSET) {
            this.f19438m = j3;
        }
    }

    @Override // i8.j
    public final void c(y7.n nVar, h0 h0Var) {
        h0Var.a();
        h0Var.b();
        this.f19427b = h0Var.f19318e;
        h0Var.b();
        y7.a0 track = nVar.track(h0Var.f19317d, 2);
        this.f19428c = track;
        this.f19429d = new s(track);
        this.a.l(nVar, h0Var);
    }

    public final void d(byte[] bArr, int i10, int i11) {
        boolean z10;
        s sVar = this.f19429d;
        if (sVar.f19419f) {
            int i12 = sVar.f19417d;
            int i13 = (i10 + 2) - i12;
            if (i13 < i11) {
                if ((bArr[i13] & ByteCompanionObject.MIN_VALUE) != 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                sVar.f19420g = z10;
                sVar.f19419f = false;
            } else {
                sVar.f19417d = (i11 - i10) + i12;
            }
        }
        if (!this.f19430e) {
            this.f19432g.a(bArr, i10, i11);
            this.f19433h.a(bArr, i10, i11);
            this.f19434i.a(bArr, i10, i11);
        }
        this.f19435j.a(bArr, i10, i11);
        this.f19436k.a(bArr, i10, i11);
    }

    @Override // i8.j
    public final void packetFinished() {
    }

    @Override // i8.j
    public final void seek() {
        this.f19437l = 0L;
        this.f19438m = C.TIME_UNSET;
        n9.u.a(this.f19431f);
        this.f19432g.c();
        this.f19433h.c();
        this.f19434i.c();
        this.f19435j.c();
        this.f19436k.c();
        s sVar = this.f19429d;
        if (sVar != null) {
            sVar.f19419f = false;
            sVar.f19420g = false;
            sVar.f19421h = false;
            sVar.f19422i = false;
            sVar.f19423j = false;
        }
    }
}
