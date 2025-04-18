package i8;

import androidx.core.app.NotificationCompat;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.util.Arrays;
import s7.q0;
import s7.r0;

/* loaded from: classes3.dex */
public final class f implements j {

    /* renamed from: v, reason: collision with root package name */
    public static final byte[] f19268v = {73, 68, 51};
    public final boolean a;

    /* renamed from: d, reason: collision with root package name */
    public final String f19271d;

    /* renamed from: e, reason: collision with root package name */
    public String f19272e;

    /* renamed from: f, reason: collision with root package name */
    public y7.a0 f19273f;

    /* renamed from: g, reason: collision with root package name */
    public y7.a0 f19274g;

    /* renamed from: k, reason: collision with root package name */
    public boolean f19278k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f19279l;

    /* renamed from: o, reason: collision with root package name */
    public int f19282o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f19283p;

    /* renamed from: r, reason: collision with root package name */
    public int f19285r;

    /* renamed from: t, reason: collision with root package name */
    public y7.a0 f19287t;
    public long u;

    /* renamed from: b, reason: collision with root package name */
    public final y7.c0 f19269b = new y7.c0(new byte[7], 2, (Object) null);

    /* renamed from: c, reason: collision with root package name */
    public final n9.x f19270c = new n9.x(Arrays.copyOf(f19268v, 10));

    /* renamed from: h, reason: collision with root package name */
    public int f19275h = 0;

    /* renamed from: i, reason: collision with root package name */
    public int f19276i = 0;

    /* renamed from: j, reason: collision with root package name */
    public int f19277j = NotificationCompat.FLAG_LOCAL_ONLY;

    /* renamed from: m, reason: collision with root package name */
    public int f19280m = -1;

    /* renamed from: n, reason: collision with root package name */
    public int f19281n = -1;

    /* renamed from: q, reason: collision with root package name */
    public long f19284q = C.TIME_UNSET;

    /* renamed from: s, reason: collision with root package name */
    public long f19286s = C.TIME_UNSET;

    public f(boolean z10, String str) {
        this.a = z10;
        this.f19271d = str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:102:0x026d, code lost:
    
        if (r9[r8] != 51) goto L123;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0250, code lost:
    
        if (((r8 & 8) >> 3) == r7) goto L122;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x029e  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x02db  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0274 A[EDGE_INSN: B:47:0x0274->B:48:0x0274 BREAK  A[LOOP:1: B:8:0x0189->B:36:0x02e4], SYNTHETIC] */
    @Override // i8.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(n9.x r23) {
        /*
            Method dump skipped, instructions count: 754
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: i8.f.a(n9.x):void");
    }

    @Override // i8.j
    public final void b(int i10, long j3) {
        if (j3 != C.TIME_UNSET) {
            this.f19286s = j3;
        }
    }

    @Override // i8.j
    public final void c(y7.n nVar, h0 h0Var) {
        h0Var.a();
        h0Var.b();
        this.f19272e = h0Var.f19318e;
        h0Var.b();
        y7.a0 track = nVar.track(h0Var.f19317d, 1);
        this.f19273f = track;
        this.f19287t = track;
        if (this.a) {
            h0Var.a();
            h0Var.b();
            y7.a0 track2 = nVar.track(h0Var.f19317d, 5);
            this.f19274g = track2;
            q0 q0Var = new q0();
            h0Var.b();
            q0Var.a = h0Var.f19318e;
            q0Var.f24667k = MimeTypes.APPLICATION_ID3;
            track2.f(new r0(q0Var));
            return;
        }
        this.f19274g = new y7.k();
    }

    public final boolean d(int i10, n9.x xVar, byte[] bArr) {
        int min = Math.min(xVar.f22600c - xVar.f22599b, i10 - this.f19276i);
        xVar.d(bArr, this.f19276i, min);
        int i11 = this.f19276i + min;
        this.f19276i = i11;
        if (i11 == i10) {
            return true;
        }
        return false;
    }

    @Override // i8.j
    public final void packetFinished() {
    }

    @Override // i8.j
    public final void seek() {
        this.f19286s = C.TIME_UNSET;
        this.f19279l = false;
        this.f19275h = 0;
        this.f19276i = 0;
        this.f19277j = NotificationCompat.FLAG_LOCAL_ONLY;
    }
}
