package i8;

import androidx.recyclerview.widget.y1;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import s7.q0;
import s7.r0;
import v8.u0;

/* loaded from: classes3.dex */
public final class d implements j {
    public final y7.c0 a;

    /* renamed from: b, reason: collision with root package name */
    public final n9.x f19232b;

    /* renamed from: c, reason: collision with root package name */
    public final String f19233c;

    /* renamed from: d, reason: collision with root package name */
    public String f19234d;

    /* renamed from: e, reason: collision with root package name */
    public y7.a0 f19235e;

    /* renamed from: f, reason: collision with root package name */
    public int f19236f;

    /* renamed from: g, reason: collision with root package name */
    public int f19237g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f19238h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f19239i;

    /* renamed from: j, reason: collision with root package name */
    public long f19240j;

    /* renamed from: k, reason: collision with root package name */
    public r0 f19241k;

    /* renamed from: l, reason: collision with root package name */
    public int f19242l;

    /* renamed from: m, reason: collision with root package name */
    public long f19243m;

    public d(String str) {
        y7.c0 c0Var = new y7.c0(new byte[16], 2, (Object) null);
        this.a = c0Var;
        this.f19232b = new n9.x(c0Var.f27958d);
        this.f19236f = 0;
        this.f19237g = 0;
        this.f19238h = false;
        this.f19239i = false;
        this.f19243m = C.TIME_UNSET;
        this.f19233c = str;
    }

    @Override // i8.j
    public final void a(n9.x xVar) {
        int i10;
        boolean z10;
        boolean z11;
        int v10;
        boolean z12;
        boolean z13;
        u0.p(this.f19235e);
        while (true) {
            int i11 = xVar.f22600c - xVar.f22599b;
            if (i11 > 0) {
                int i12 = this.f19236f;
                n9.x xVar2 = this.f19232b;
                boolean z14 = true;
                if (i12 != 0) {
                    if (i12 != 1) {
                        if (i12 == 2) {
                            int min = Math.min(i11, this.f19242l - this.f19237g);
                            this.f19235e.a(min, xVar);
                            int i13 = this.f19237g + min;
                            this.f19237g = i13;
                            int i14 = this.f19242l;
                            if (i13 == i14) {
                                long j3 = this.f19243m;
                                if (j3 != C.TIME_UNSET) {
                                    this.f19235e.d(j3, 1, i14, 0, null);
                                    this.f19243m += this.f19240j;
                                }
                                this.f19236f = 0;
                            }
                        }
                    } else {
                        byte[] bArr = xVar2.a;
                        int min2 = Math.min(i11, 16 - this.f19237g);
                        xVar.d(bArr, this.f19237g, min2);
                        int i15 = this.f19237g + min2;
                        this.f19237g = i15;
                        if (i15 != 16) {
                            z14 = false;
                        }
                        if (z14) {
                            y7.c0 c0Var = this.a;
                            c0Var.o(0);
                            y1 x10 = c6.c.x(c0Var);
                            r0 r0Var = this.f19241k;
                            if (r0Var == null || x10.f2085c != r0Var.A || x10.f2084b != r0Var.B || !"audio/ac4".equals(r0Var.f24723n)) {
                                q0 q0Var = new q0();
                                q0Var.a = this.f19234d;
                                q0Var.f24667k = "audio/ac4";
                                q0Var.f24679x = x10.f2085c;
                                q0Var.f24680y = x10.f2084b;
                                q0Var.f24659c = this.f19233c;
                                r0 r0Var2 = new r0(q0Var);
                                this.f19241k = r0Var2;
                                this.f19235e.f(r0Var2);
                            }
                            this.f19242l = x10.f2086d;
                            this.f19240j = (x10.f2087e * 1000000) / this.f19241k.B;
                            xVar2.G(0);
                            this.f19235e.a(16, xVar2);
                            this.f19236f = 2;
                        }
                    }
                } else {
                    while (true) {
                        i10 = 65;
                        if (xVar.f22600c - xVar.f22599b > 0) {
                            if (!this.f19238h) {
                                if (xVar.v() == 172) {
                                    z11 = true;
                                } else {
                                    z11 = false;
                                }
                                this.f19238h = z11;
                            } else {
                                v10 = xVar.v();
                                if (v10 == 172) {
                                    z12 = true;
                                } else {
                                    z12 = false;
                                }
                                this.f19238h = z12;
                                if (v10 == 64 || v10 == 65) {
                                    break;
                                }
                            }
                        } else {
                            z10 = false;
                            break;
                        }
                    }
                    if (v10 == 65) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    this.f19239i = z13;
                    z10 = true;
                    if (z10) {
                        this.f19236f = 1;
                        byte[] bArr2 = xVar2.a;
                        bArr2[0] = -84;
                        if (!this.f19239i) {
                            i10 = 64;
                        }
                        bArr2[1] = (byte) i10;
                        this.f19237g = 2;
                    }
                }
            } else {
                return;
            }
        }
    }

    @Override // i8.j
    public final void b(int i10, long j3) {
        if (j3 != C.TIME_UNSET) {
            this.f19243m = j3;
        }
    }

    @Override // i8.j
    public final void c(y7.n nVar, h0 h0Var) {
        h0Var.a();
        h0Var.b();
        this.f19234d = h0Var.f19318e;
        h0Var.b();
        this.f19235e = nVar.track(h0Var.f19317d, 1);
    }

    @Override // i8.j
    public final void packetFinished() {
    }

    @Override // i8.j
    public final void seek() {
        this.f19236f = 0;
        this.f19237g = 0;
        this.f19238h = false;
        this.f19239i = false;
        this.f19243m = C.TIME_UNSET;
    }
}
