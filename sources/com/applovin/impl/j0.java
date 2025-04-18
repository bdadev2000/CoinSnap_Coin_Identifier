package com.applovin.impl;

import com.applovin.impl.dp;
import com.applovin.impl.ij;
import java.io.EOFException;
import org.objectweb.asm.Opcodes;

/* loaded from: classes.dex */
public final class j0 implements k8 {

    /* renamed from: m */
    public static final o8 f24555m = new dt(5);

    /* renamed from: a */
    private final int f24556a;

    /* renamed from: b */
    private final k0 f24557b;

    /* renamed from: c */
    private final bh f24558c;
    private final bh d;
    private final ah e;

    /* renamed from: f */
    private m8 f24559f;

    /* renamed from: g */
    private long f24560g;

    /* renamed from: h */
    private long f24561h;

    /* renamed from: i */
    private int f24562i;

    /* renamed from: j */
    private boolean f24563j;

    /* renamed from: k */
    private boolean f24564k;

    /* renamed from: l */
    private boolean f24565l;

    public j0() {
        this(0);
    }

    private void b(l8 l8Var) {
        if (this.f24563j) {
            return;
        }
        this.f24562i = -1;
        l8Var.b();
        long j2 = 0;
        if (l8Var.f() == 0) {
            c(l8Var);
        }
        int i2 = 0;
        int i3 = 0;
        while (l8Var.b(this.d.c(), 0, 2, true)) {
            try {
                this.d.f(0);
                if (!k0.a(this.d.C())) {
                    break;
                }
                if (!l8Var.b(this.d.c(), 0, 4, true)) {
                    break;
                }
                this.e.c(14);
                int a2 = this.e.a(13);
                if (a2 > 6) {
                    j2 += a2;
                    i3++;
                    if (i3 == 1000 || !l8Var.a(a2 - 6, true)) {
                        break;
                    }
                } else {
                    this.f24563j = true;
                    throw dh.a("Malformed ADTS stream", null);
                }
            } catch (EOFException unused) {
            }
        }
        i2 = i3;
        l8Var.b();
        if (i2 > 0) {
            this.f24562i = (int) (j2 / i2);
        } else {
            this.f24562i = -1;
        }
        this.f24563j = true;
    }

    @Override // com.applovin.impl.k8
    public void a() {
    }

    public j0(int i2) {
        this.f24556a = (i2 & 2) != 0 ? i2 | 1 : i2;
        this.f24557b = new k0(true);
        this.f24558c = new bh(Opcodes.ACC_STRICT);
        this.f24562i = -1;
        this.f24561h = -1L;
        bh bhVar = new bh(10);
        this.d = bhVar;
        this.e = new ah(bhVar.c());
    }

    private static int a(int i2, long j2) {
        return (int) (((i2 * 8) * 1000000) / j2);
    }

    private int c(l8 l8Var) {
        int i2 = 0;
        while (true) {
            l8Var.c(this.d.c(), 0, 10);
            this.d.f(0);
            if (this.d.z() != 4801587) {
                break;
            }
            this.d.g(3);
            int v2 = this.d.v();
            i2 += v2 + 10;
            l8Var.c(v2);
        }
        l8Var.b();
        l8Var.c(i2);
        if (this.f24561h == -1) {
            this.f24561h = i2;
        }
        return i2;
    }

    private ij a(long j2, boolean z2) {
        return new p4(j2, this.f24561h, a(this.f24562i, this.f24557b.d()), this.f24562i, z2);
    }

    @Override // com.applovin.impl.k8
    public void a(m8 m8Var) {
        this.f24559f = m8Var;
        this.f24557b.a(m8Var, new dp.d(0, 1));
        m8Var.c();
    }

    @Override // com.applovin.impl.k8
    public int a(l8 l8Var, th thVar) {
        b1.b(this.f24559f);
        long a2 = l8Var.a();
        int i2 = this.f24556a;
        if ((i2 & 2) != 0 || ((i2 & 1) != 0 && a2 != -1)) {
            b(l8Var);
        }
        int a3 = l8Var.a(this.f24558c.c(), 0, Opcodes.ACC_STRICT);
        boolean z2 = a3 == -1;
        b(a2, z2);
        if (z2) {
            return -1;
        }
        this.f24558c.f(0);
        this.f24558c.e(a3);
        if (!this.f24564k) {
            this.f24557b.a(this.f24560g, 4);
            this.f24564k = true;
        }
        this.f24557b.a(this.f24558c);
        return 0;
    }

    @Override // com.applovin.impl.k8
    public void a(long j2, long j3) {
        this.f24564k = false;
        this.f24557b.a();
        this.f24560g = j3;
    }

    private void b(long j2, boolean z2) {
        if (this.f24565l) {
            return;
        }
        boolean z3 = (this.f24556a & 1) != 0 && this.f24562i > 0;
        if (z3 && this.f24557b.d() == -9223372036854775807L && !z2) {
            return;
        }
        if (z3 && this.f24557b.d() != -9223372036854775807L) {
            this.f24559f.a(a(j2, (this.f24556a & 2) != 0));
        } else {
            this.f24559f.a(new ij.b(-9223372036854775807L));
        }
        this.f24565l = true;
    }

    @Override // com.applovin.impl.k8
    public boolean a(l8 l8Var) {
        int c2 = c(l8Var);
        int i2 = c2;
        int i3 = 0;
        int i4 = 0;
        do {
            l8Var.c(this.d.c(), 0, 2);
            this.d.f(0);
            if (k0.a(this.d.C())) {
                i3++;
                if (i3 >= 4 && i4 > 188) {
                    return true;
                }
                l8Var.c(this.d.c(), 0, 4);
                this.e.c(14);
                int a2 = this.e.a(13);
                if (a2 <= 6) {
                    i2++;
                    l8Var.b();
                    l8Var.c(i2);
                } else {
                    l8Var.c(a2 - 6);
                    i4 += a2;
                }
            } else {
                i2++;
                l8Var.b();
                l8Var.c(i2);
            }
            i3 = 0;
            i4 = 0;
        } while (i2 - c2 < 8192);
        return false;
    }

    public static /* synthetic */ k8[] b() {
        return new k8[]{new j0()};
    }
}
