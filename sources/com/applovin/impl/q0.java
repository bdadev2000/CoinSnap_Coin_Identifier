package com.applovin.impl;

import com.applovin.impl.f9;
import com.applovin.impl.ij;
import java.io.EOFException;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class q0 implements k8 {

    /* renamed from: r */
    private static final int[] f26135r;

    /* renamed from: u */
    private static final int f26138u;

    /* renamed from: a */
    private final byte[] f26139a;

    /* renamed from: b */
    private final int f26140b;

    /* renamed from: c */
    private boolean f26141c;
    private long d;
    private int e;

    /* renamed from: f */
    private int f26142f;

    /* renamed from: g */
    private boolean f26143g;

    /* renamed from: h */
    private long f26144h;

    /* renamed from: i */
    private int f26145i;

    /* renamed from: j */
    private int f26146j;

    /* renamed from: k */
    private long f26147k;

    /* renamed from: l */
    private m8 f26148l;

    /* renamed from: m */
    private qo f26149m;

    /* renamed from: n */
    private ij f26150n;

    /* renamed from: o */
    private boolean f26151o;

    /* renamed from: p */
    public static final o8 f26133p = new dt(12);

    /* renamed from: q */
    private static final int[] f26134q = {13, 14, 16, 18, 20, 21, 27, 32, 6, 7, 6, 6, 1, 1, 1, 1};

    /* renamed from: s */
    private static final byte[] f26136s = xp.c("#!AMR\n");

    /* renamed from: t */
    private static final byte[] f26137t = xp.c("#!AMR-WB\n");

    static {
        int[] iArr = {18, 24, 33, 37, 41, 47, 51, 59, 61, 6, 1, 1, 1, 1, 1, 1};
        f26135r = iArr;
        f26138u = iArr[8];
    }

    public q0() {
        this(0);
    }

    private boolean b(int i2) {
        return !this.f26141c && (i2 < 12 || i2 > 14);
    }

    private boolean c(int i2) {
        return i2 >= 0 && i2 <= 15 && (d(i2) || b(i2));
    }

    private boolean d(int i2) {
        return this.f26141c && (i2 < 10 || i2 > 13);
    }

    @Override // com.applovin.impl.k8
    public void a() {
    }

    public q0(int i2) {
        this.f26140b = (i2 & 2) != 0 ? i2 | 1 : i2;
        this.f26139a = new byte[1];
        this.f26145i = -1;
    }

    private static int a(int i2, long j2) {
        return (int) (((i2 * 8) * 1000000) / j2);
    }

    private void b() {
        b1.b(this.f26149m);
        xp.a(this.f26148l);
    }

    private boolean c(l8 l8Var) {
        byte[] bArr = f26136s;
        if (a(l8Var, bArr)) {
            this.f26141c = false;
            l8Var.a(bArr.length);
            return true;
        }
        byte[] bArr2 = f26137t;
        if (!a(l8Var, bArr2)) {
            return false;
        }
        this.f26141c = true;
        l8Var.a(bArr2.length);
        return true;
    }

    private void d() {
        if (this.f26151o) {
            return;
        }
        this.f26151o = true;
        boolean z2 = this.f26141c;
        this.f26149m.a(new f9.b().f(z2 ? "audio/amr-wb" : "audio/3gpp").i(f26138u).c(1).n(z2 ? 16000 : 8000).a());
    }

    private ij a(long j2, boolean z2) {
        return new p4(j2, this.f26144h, a(this.f26145i, 20000L), this.f26145i, z2);
    }

    private int b(l8 l8Var) {
        l8Var.b();
        l8Var.c(this.f26139a, 0, 1);
        byte b2 = this.f26139a[0];
        if ((b2 & 131) <= 0) {
            return a((b2 >> 3) & 15);
        }
        throw dh.a("Invalid padding bits for frame header " + ((int) b2), null);
    }

    private int a(int i2) {
        if (c(i2)) {
            return this.f26141c ? f26135r[i2] : f26134q[i2];
        }
        StringBuilder sb = new StringBuilder("Illegal AMR ");
        sb.append(this.f26141c ? "WB" : "NB");
        sb.append(" frame type ");
        sb.append(i2);
        throw dh.a(sb.toString(), null);
    }

    public static /* synthetic */ k8[] c() {
        return new k8[]{new q0()};
    }

    private int d(l8 l8Var) {
        if (this.f26142f == 0) {
            try {
                int b2 = b(l8Var);
                this.e = b2;
                this.f26142f = b2;
                if (this.f26145i == -1) {
                    this.f26144h = l8Var.f();
                    this.f26145i = this.e;
                }
                if (this.f26145i == this.e) {
                    this.f26146j++;
                }
            } catch (EOFException unused) {
                return -1;
            }
        }
        int a2 = this.f26149m.a((g5) l8Var, this.f26142f, true);
        if (a2 == -1) {
            return -1;
        }
        int i2 = this.f26142f - a2;
        this.f26142f = i2;
        if (i2 > 0) {
            return 0;
        }
        this.f26149m.a(this.f26147k + this.d, 1, this.e, 0, null);
        this.d += 20000;
        return 0;
    }

    @Override // com.applovin.impl.k8
    public void a(m8 m8Var) {
        this.f26148l = m8Var;
        this.f26149m = m8Var.a(0, 1);
        m8Var.c();
    }

    private void a(long j2, int i2) {
        int i3;
        if (this.f26143g) {
            return;
        }
        int i4 = this.f26140b;
        if ((i4 & 1) == 0 || j2 == -1 || !((i3 = this.f26145i) == -1 || i3 == this.e)) {
            ij.b bVar = new ij.b(-9223372036854775807L);
            this.f26150n = bVar;
            this.f26148l.a(bVar);
            this.f26143g = true;
            return;
        }
        if (this.f26146j >= 20 || i2 == -1) {
            ij a2 = a(j2, (i4 & 2) != 0);
            this.f26150n = a2;
            this.f26148l.a(a2);
            this.f26143g = true;
        }
    }

    private static boolean a(l8 l8Var, byte[] bArr) {
        l8Var.b();
        byte[] bArr2 = new byte[bArr.length];
        l8Var.c(bArr2, 0, bArr.length);
        return Arrays.equals(bArr2, bArr);
    }

    @Override // com.applovin.impl.k8
    public int a(l8 l8Var, th thVar) {
        b();
        if (l8Var.f() == 0 && !c(l8Var)) {
            throw dh.a("Could not find AMR header.", null);
        }
        d();
        int d = d(l8Var);
        a(l8Var.a(), d);
        return d;
    }

    @Override // com.applovin.impl.k8
    public void a(long j2, long j3) {
        this.d = 0L;
        this.e = 0;
        this.f26142f = 0;
        if (j2 != 0) {
            ij ijVar = this.f26150n;
            if (ijVar instanceof p4) {
                this.f26147k = ((p4) ijVar).d(j2);
                return;
            }
        }
        this.f26147k = 0L;
    }

    @Override // com.applovin.impl.k8
    public boolean a(l8 l8Var) {
        return c(l8Var);
    }
}
