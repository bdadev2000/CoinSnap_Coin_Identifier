package com.applovin.impl;

import com.applovin.impl.d9;
import com.applovin.impl.ej;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.io.EOFException;
import java.util.Arrays;

/* renamed from: com.applovin.impl.q0 */
/* loaded from: classes.dex */
public final class C0739q0 implements i8 {

    /* renamed from: r */
    private static final int[] f10106r;

    /* renamed from: u */
    private static final int f10109u;

    /* renamed from: a */
    private final byte[] f10110a;
    private final int b;

    /* renamed from: c */
    private boolean f10111c;

    /* renamed from: d */
    private long f10112d;

    /* renamed from: e */
    private int f10113e;

    /* renamed from: f */
    private int f10114f;

    /* renamed from: g */
    private boolean f10115g;

    /* renamed from: h */
    private long f10116h;

    /* renamed from: i */
    private int f10117i;

    /* renamed from: j */
    private int f10118j;

    /* renamed from: k */
    private long f10119k;
    private k8 l;
    private ro m;

    /* renamed from: n */
    private ej f10120n;

    /* renamed from: o */
    private boolean f10121o;

    /* renamed from: p */
    public static final m8 f10104p = new A0(12);

    /* renamed from: q */
    private static final int[] f10105q = {13, 14, 16, 18, 20, 21, 27, 32, 6, 7, 6, 6, 1, 1, 1, 1};

    /* renamed from: s */
    private static final byte[] f10107s = yp.c("#!AMR\n");

    /* renamed from: t */
    private static final byte[] f10108t = yp.c("#!AMR-WB\n");

    static {
        int[] iArr = {18, 24, 33, 37, 41, 47, 51, 59, 61, 6, 1, 1, 1, 1, 1, 1};
        f10106r = iArr;
        f10109u = iArr[8];
    }

    public C0739q0() {
        this(0);
    }

    private void b() {
        AbstractC0669a1.b(this.m);
        yp.a(this.l);
    }

    private boolean c(int i9) {
        return i9 >= 0 && i9 <= 15 && (d(i9) || b(i9));
    }

    private boolean d(int i9) {
        return this.f10111c && (i9 < 10 || i9 > 13);
    }

    @Override // com.applovin.impl.i8
    public void a() {
    }

    public C0739q0(int i9) {
        this.b = (i9 & 2) != 0 ? i9 | 1 : i9;
        this.f10110a = new byte[1];
        this.f10117i = -1;
    }

    private static int a(int i9, long j7) {
        return (int) (((i9 * 8) * 1000000) / j7);
    }

    private boolean c(j8 j8Var) {
        byte[] bArr = f10107s;
        if (a(j8Var, bArr)) {
            this.f10111c = false;
            j8Var.a(bArr.length);
            return true;
        }
        byte[] bArr2 = f10108t;
        if (!a(j8Var, bArr2)) {
            return false;
        }
        this.f10111c = true;
        j8Var.a(bArr2.length);
        return true;
    }

    private void d() {
        if (this.f10121o) {
            return;
        }
        this.f10121o = true;
        boolean z8 = this.f10111c;
        this.m.a(new d9.b().f(z8 ? MimeTypes.AUDIO_AMR_WB : MimeTypes.AUDIO_AMR_NB).i(f10109u).c(1).n(z8 ? 16000 : 8000).a());
    }

    private ej a(long j7, boolean z8) {
        return new n4(j7, this.f10116h, a(this.f10117i, 20000L), this.f10117i, z8);
    }

    private boolean b(int i9) {
        return !this.f10111c && (i9 < 12 || i9 > 14);
    }

    private int b(j8 j8Var) {
        j8Var.b();
        j8Var.c(this.f10110a, 0, 1);
        byte b = this.f10110a[0];
        if ((b & 131) <= 0) {
            return a((b >> 3) & 15);
        }
        throw ah.a("Invalid padding bits for frame header " + ((int) b), null);
    }

    private int a(int i9) {
        if (c(i9)) {
            return this.f10111c ? f10106r[i9] : f10105q[i9];
        }
        StringBuilder sb = new StringBuilder("Illegal AMR ");
        sb.append(this.f10111c ? "WB" : "NB");
        sb.append(" frame type ");
        sb.append(i9);
        throw ah.a(sb.toString(), null);
    }

    public static /* synthetic */ i8[] c() {
        return new i8[]{new C0739q0()};
    }

    @Override // com.applovin.impl.i8
    public void a(k8 k8Var) {
        this.l = k8Var;
        this.m = k8Var.a(0, 1);
        k8Var.c();
    }

    private int d(j8 j8Var) {
        if (this.f10114f == 0) {
            try {
                int b = b(j8Var);
                this.f10113e = b;
                this.f10114f = b;
                if (this.f10117i == -1) {
                    this.f10116h = j8Var.f();
                    this.f10117i = this.f10113e;
                }
                if (this.f10117i == this.f10113e) {
                    this.f10118j++;
                }
            } catch (EOFException unused) {
                return -1;
            }
        }
        int a6 = this.m.a((e5) j8Var, this.f10114f, true);
        if (a6 == -1) {
            return -1;
        }
        int i9 = this.f10114f - a6;
        this.f10114f = i9;
        if (i9 > 0) {
            return 0;
        }
        this.m.a(this.f10119k + this.f10112d, 1, this.f10113e, 0, null);
        this.f10112d += 20000;
        return 0;
    }

    private void a(long j7, int i9) {
        int i10;
        if (this.f10115g) {
            return;
        }
        int i11 = this.b;
        if ((i11 & 1) != 0 && j7 != -1 && ((i10 = this.f10117i) == -1 || i10 == this.f10113e)) {
            if (this.f10118j >= 20 || i9 == -1) {
                ej a6 = a(j7, (i11 & 2) != 0);
                this.f10120n = a6;
                this.l.a(a6);
                this.f10115g = true;
                return;
            }
            return;
        }
        ej.b bVar = new ej.b(com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET);
        this.f10120n = bVar;
        this.l.a(bVar);
        this.f10115g = true;
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
        int d2 = d(j8Var);
        a(j8Var.a(), d2);
        return d2;
    }

    @Override // com.applovin.impl.i8
    public void a(long j7, long j9) {
        this.f10112d = 0L;
        this.f10113e = 0;
        this.f10114f = 0;
        if (j7 != 0) {
            ej ejVar = this.f10120n;
            if (ejVar instanceof n4) {
                this.f10119k = ((n4) ejVar).d(j7);
                return;
            }
        }
        this.f10119k = 0L;
    }

    @Override // com.applovin.impl.i8
    public boolean a(j8 j8Var) {
        return c(j8Var);
    }
}
