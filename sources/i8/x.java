package i8;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import v8.u0;

/* loaded from: classes3.dex */
public final class x implements i0 {
    public final j a;

    /* renamed from: b, reason: collision with root package name */
    public final y7.c0 f19474b = new y7.c0(new byte[10], 2, (Object) null);

    /* renamed from: c, reason: collision with root package name */
    public int f19475c = 0;

    /* renamed from: d, reason: collision with root package name */
    public int f19476d;

    /* renamed from: e, reason: collision with root package name */
    public n9.f0 f19477e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f19478f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f19479g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f19480h;

    /* renamed from: i, reason: collision with root package name */
    public int f19481i;

    /* renamed from: j, reason: collision with root package name */
    public int f19482j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f19483k;

    /* renamed from: l, reason: collision with root package name */
    public long f19484l;

    public x(j jVar) {
        this.a = jVar;
    }

    @Override // i8.i0
    public final void a(int i10, n9.x xVar) {
        int i11;
        int i12;
        boolean z10;
        int i13;
        u0.p(this.f19477e);
        int i14 = i10 & 1;
        j jVar = this.a;
        int i15 = -1;
        int i16 = 3;
        int i17 = 2;
        if (i14 != 0) {
            int i18 = this.f19475c;
            if (i18 != 0 && i18 != 1) {
                if (i18 != 2) {
                    if (i18 == 3) {
                        if (this.f19482j != -1) {
                            n9.o.f("PesReader", "Unexpected start indicator: expected " + this.f19482j + " more bytes");
                        }
                        jVar.packetFinished();
                    } else {
                        throw new IllegalStateException();
                    }
                } else {
                    n9.o.f("PesReader", "Unexpected start indicator reading extended header");
                }
            }
            this.f19475c = 1;
            this.f19476d = 0;
        }
        int i19 = i10;
        while (true) {
            int i20 = xVar.f22600c;
            int i21 = xVar.f22599b;
            int i22 = i20 - i21;
            if (i22 > 0) {
                int i23 = this.f19475c;
                if (i23 != 0) {
                    y7.c0 c0Var = this.f19474b;
                    if (i23 != 1) {
                        if (i23 != i17) {
                            if (i23 == i16) {
                                int i24 = this.f19482j;
                                if (i24 == i15) {
                                    i11 = 0;
                                } else {
                                    i11 = i22 - i24;
                                }
                                if (i11 > 0) {
                                    i22 -= i11;
                                    xVar.F(i21 + i22);
                                }
                                jVar.a(xVar);
                                int i25 = this.f19482j;
                                if (i25 != i15) {
                                    int i26 = i25 - i22;
                                    this.f19482j = i26;
                                    if (i26 == 0) {
                                        jVar.packetFinished();
                                        this.f19475c = 1;
                                        this.f19476d = 0;
                                    }
                                }
                            } else {
                                throw new IllegalStateException();
                            }
                        } else {
                            if (c(Math.min(10, this.f19481i), xVar, c0Var.f27958d) && c(this.f19481i, xVar, null)) {
                                c0Var.o(0);
                                this.f19484l = C.TIME_UNSET;
                                if (this.f19478f) {
                                    c0Var.r(4);
                                    c0Var.r(1);
                                    c0Var.r(1);
                                    long i27 = (c0Var.i(i16) << 30) | (c0Var.i(15) << 15) | c0Var.i(15);
                                    c0Var.r(1);
                                    if (!this.f19480h && this.f19479g) {
                                        c0Var.r(4);
                                        c0Var.r(1);
                                        c0Var.r(1);
                                        c0Var.r(1);
                                        this.f19477e.b((c0Var.i(15) << 15) | (c0Var.i(3) << 30) | c0Var.i(15));
                                        this.f19480h = true;
                                    }
                                    this.f19484l = this.f19477e.b(i27);
                                }
                                if (this.f19483k) {
                                    i12 = 4;
                                } else {
                                    i12 = 0;
                                }
                                i19 |= i12;
                                jVar.b(i19, this.f19484l);
                                i16 = 3;
                                this.f19475c = 3;
                                this.f19476d = 0;
                            }
                            i15 = -1;
                            i17 = 2;
                        }
                    } else if (!c(9, xVar, c0Var.f27958d)) {
                        i15 = -1;
                        i17 = 2;
                    } else {
                        c0Var.o(0);
                        int i28 = c0Var.i(24);
                        if (i28 != 1) {
                            kotlin.reflect.jvm.internal.impl.serialization.deserialization.a.v("Unexpected start code prefix: ", i28, "PesReader");
                            i15 = -1;
                            this.f19482j = -1;
                            i17 = 2;
                            z10 = false;
                        } else {
                            c0Var.r(8);
                            int i29 = c0Var.i(16);
                            c0Var.r(5);
                            this.f19483k = c0Var.h();
                            c0Var.r(2);
                            this.f19478f = c0Var.h();
                            this.f19479g = c0Var.h();
                            c0Var.r(6);
                            int i30 = c0Var.i(8);
                            this.f19481i = i30;
                            if (i29 == 0) {
                                i15 = -1;
                                this.f19482j = -1;
                            } else {
                                int i31 = ((i29 + 6) - 9) - i30;
                                this.f19482j = i31;
                                if (i31 < 0) {
                                    n9.o.f("PesReader", "Found negative packet payload size: " + this.f19482j);
                                    i15 = -1;
                                    this.f19482j = -1;
                                } else {
                                    i15 = -1;
                                }
                            }
                            i17 = 2;
                            z10 = true;
                        }
                        if (z10) {
                            i13 = i17;
                        } else {
                            i13 = 0;
                        }
                        this.f19475c = i13;
                        this.f19476d = 0;
                    }
                } else {
                    xVar.H(i22);
                }
            } else {
                return;
            }
        }
    }

    @Override // i8.i0
    public final void b(n9.f0 f0Var, y7.n nVar, h0 h0Var) {
        this.f19477e = f0Var;
        this.a.c(nVar, h0Var);
    }

    public final boolean c(int i10, n9.x xVar, byte[] bArr) {
        int min = Math.min(xVar.f22600c - xVar.f22599b, i10 - this.f19476d);
        if (min <= 0) {
            return true;
        }
        if (bArr == null) {
            xVar.H(min);
        } else {
            xVar.d(bArr, this.f19476d, min);
        }
        int i11 = this.f19476d + min;
        this.f19476d = i11;
        if (i11 == i10) {
            return true;
        }
        return false;
    }

    @Override // i8.i0
    public final void seek() {
        this.f19475c = 0;
        this.f19476d = 0;
        this.f19480h = false;
        this.a.seek();
    }
}
