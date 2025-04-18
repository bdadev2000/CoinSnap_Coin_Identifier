package com.applovin.impl;

import com.applovin.impl.d9;
import com.applovin.impl.ej;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.io.EOFException;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class q0 implements i8 {

    /* renamed from: r */
    private static final int[] f7048r;
    private static final int u;
    private final byte[] a;

    /* renamed from: b */
    private final int f7051b;

    /* renamed from: c */
    private boolean f7052c;

    /* renamed from: d */
    private long f7053d;

    /* renamed from: e */
    private int f7054e;

    /* renamed from: f */
    private int f7055f;

    /* renamed from: g */
    private boolean f7056g;

    /* renamed from: h */
    private long f7057h;

    /* renamed from: i */
    private int f7058i;

    /* renamed from: j */
    private int f7059j;

    /* renamed from: k */
    private long f7060k;

    /* renamed from: l */
    private k8 f7061l;

    /* renamed from: m */
    private ro f7062m;

    /* renamed from: n */
    private ej f7063n;

    /* renamed from: o */
    private boolean f7064o;

    /* renamed from: p */
    public static final m8 f7046p = new ht(12);

    /* renamed from: q */
    private static final int[] f7047q = {13, 14, 16, 18, 20, 21, 27, 32, 6, 7, 6, 6, 1, 1, 1, 1};

    /* renamed from: s */
    private static final byte[] f7049s = yp.c("#!AMR\n");

    /* renamed from: t */
    private static final byte[] f7050t = yp.c("#!AMR-WB\n");

    static {
        int[] iArr = {18, 24, 33, 37, 41, 47, 51, 59, 61, 6, 1, 1, 1, 1, 1, 1};
        f7048r = iArr;
        u = iArr[8];
    }

    public q0() {
        this(0);
    }

    private void b() {
        a1.b(this.f7062m);
        yp.a(this.f7061l);
    }

    private boolean c(int i10) {
        return i10 >= 0 && i10 <= 15 && (d(i10) || b(i10));
    }

    private boolean d(int i10) {
        return this.f7052c && (i10 < 10 || i10 > 13);
    }

    public static /* synthetic */ i8[] e() {
        return c();
    }

    @Override // com.applovin.impl.i8
    public void a() {
    }

    public q0(int i10) {
        this.f7051b = (i10 & 2) != 0 ? i10 | 1 : i10;
        this.a = new byte[1];
        this.f7058i = -1;
    }

    private static int a(int i10, long j3) {
        return (int) (((i10 * 8) * 1000000) / j3);
    }

    private boolean c(j8 j8Var) {
        byte[] bArr = f7049s;
        if (a(j8Var, bArr)) {
            this.f7052c = false;
            j8Var.a(bArr.length);
            return true;
        }
        byte[] bArr2 = f7050t;
        if (!a(j8Var, bArr2)) {
            return false;
        }
        this.f7052c = true;
        j8Var.a(bArr2.length);
        return true;
    }

    private void d() {
        if (this.f7064o) {
            return;
        }
        this.f7064o = true;
        boolean z10 = this.f7052c;
        this.f7062m.a(new d9.b().f(z10 ? MimeTypes.AUDIO_AMR_WB : MimeTypes.AUDIO_AMR_NB).i(u).c(1).n(z10 ? 16000 : 8000).a());
    }

    private ej a(long j3, boolean z10) {
        return new n4(j3, this.f7057h, a(this.f7058i, 20000L), this.f7058i, z10);
    }

    private boolean b(int i10) {
        return !this.f7052c && (i10 < 12 || i10 > 14);
    }

    private int b(j8 j8Var) {
        j8Var.b();
        j8Var.c(this.a, 0, 1);
        byte b3 = this.a[0];
        if ((b3 & 131) <= 0) {
            return a((b3 >> 3) & 15);
        }
        throw ah.a("Invalid padding bits for frame header " + ((int) b3), null);
    }

    private int a(int i10) {
        if (c(i10)) {
            return this.f7052c ? f7048r[i10] : f7047q[i10];
        }
        StringBuilder sb2 = new StringBuilder("Illegal AMR ");
        sb2.append(this.f7052c ? "WB" : "NB");
        sb2.append(" frame type ");
        sb2.append(i10);
        throw ah.a(sb2.toString(), null);
    }

    public static /* synthetic */ i8[] c() {
        return new i8[]{new q0()};
    }

    @Override // com.applovin.impl.i8
    public void a(k8 k8Var) {
        this.f7061l = k8Var;
        this.f7062m = k8Var.a(0, 1);
        k8Var.c();
    }

    private int d(j8 j8Var) {
        if (this.f7055f == 0) {
            try {
                int b3 = b(j8Var);
                this.f7054e = b3;
                this.f7055f = b3;
                if (this.f7058i == -1) {
                    this.f7057h = j8Var.f();
                    this.f7058i = this.f7054e;
                }
                if (this.f7058i == this.f7054e) {
                    this.f7059j++;
                }
            } catch (EOFException unused) {
                return -1;
            }
        }
        int a = this.f7062m.a((e5) j8Var, this.f7055f, true);
        if (a == -1) {
            return -1;
        }
        int i10 = this.f7055f - a;
        this.f7055f = i10;
        if (i10 > 0) {
            return 0;
        }
        this.f7062m.a(this.f7060k + this.f7053d, 1, this.f7054e, 0, null);
        this.f7053d += 20000;
        return 0;
    }

    private void a(long j3, int i10) {
        int i11;
        if (this.f7056g) {
            return;
        }
        int i12 = this.f7051b;
        if ((i12 & 1) != 0 && j3 != -1 && ((i11 = this.f7058i) == -1 || i11 == this.f7054e)) {
            if (this.f7059j >= 20 || i10 == -1) {
                ej a = a(j3, (i12 & 2) != 0);
                this.f7063n = a;
                this.f7061l.a(a);
                this.f7056g = true;
                return;
            }
            return;
        }
        ej.b bVar = new ej.b(C.TIME_UNSET);
        this.f7063n = bVar;
        this.f7061l.a(bVar);
        this.f7056g = true;
    }

    private static boolean a(j8 j8Var, byte[] bArr) {
        j8Var.b();
        byte[] bArr2 = new byte[bArr.length];
        j8Var.c(bArr2, 0, bArr.length);
        return Arrays.equals(bArr2, bArr);
    }

    @Override // com.applovin.impl.i8
    public int a(j8 j8Var, qh qhVar) {
        b();
        if (j8Var.f() == 0 && !c(j8Var)) {
            throw ah.a("Could not find AMR header.", null);
        }
        d();
        int d10 = d(j8Var);
        a(j8Var.a(), d10);
        return d10;
    }

    @Override // com.applovin.impl.i8
    public void a(long j3, long j10) {
        this.f7053d = 0L;
        this.f7054e = 0;
        this.f7055f = 0;
        if (j3 != 0) {
            ej ejVar = this.f7063n;
            if (ejVar instanceof n4) {
                this.f7060k = ((n4) ejVar).d(j3);
                return;
            }
        }
        this.f7060k = 0L;
    }

    @Override // com.applovin.impl.i8
    public boolean a(j8 j8Var) {
        return c(j8Var);
    }
}
