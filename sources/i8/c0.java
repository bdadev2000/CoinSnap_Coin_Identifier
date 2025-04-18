package i8;

import kotlin.UByte;

/* loaded from: classes3.dex */
public final class c0 implements i0 {
    public final b0 a;

    /* renamed from: b, reason: collision with root package name */
    public final n9.x f19227b = new n9.x(32);

    /* renamed from: c, reason: collision with root package name */
    public int f19228c;

    /* renamed from: d, reason: collision with root package name */
    public int f19229d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f19230e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f19231f;

    public c0(b0 b0Var) {
        this.a = b0Var;
    }

    @Override // i8.i0
    public final void a(int i10, n9.x xVar) {
        boolean z10;
        int i11;
        boolean z11;
        if ((i10 & 1) != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            i11 = xVar.f22599b + xVar.v();
        } else {
            i11 = -1;
        }
        if (this.f19231f) {
            if (!z10) {
                return;
            }
            this.f19231f = false;
            xVar.G(i11);
            this.f19229d = 0;
        }
        while (true) {
            int i12 = xVar.f22600c - xVar.f22599b;
            if (i12 > 0) {
                int i13 = this.f19229d;
                n9.x xVar2 = this.f19227b;
                if (i13 < 3) {
                    if (i13 == 0) {
                        int v10 = xVar.v();
                        xVar.G(xVar.f22599b - 1);
                        if (v10 == 255) {
                            this.f19231f = true;
                            return;
                        }
                    }
                    int min = Math.min(xVar.f22600c - xVar.f22599b, 3 - this.f19229d);
                    xVar.d(xVar2.a, this.f19229d, min);
                    int i14 = this.f19229d + min;
                    this.f19229d = i14;
                    if (i14 == 3) {
                        xVar2.G(0);
                        xVar2.F(3);
                        xVar2.H(1);
                        int v11 = xVar2.v();
                        int v12 = xVar2.v();
                        if ((v11 & 128) != 0) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        this.f19230e = z11;
                        int i15 = (((v11 & 15) << 8) | v12) + 3;
                        this.f19228c = i15;
                        byte[] bArr = xVar2.a;
                        if (bArr.length < i15) {
                            xVar2.a(Math.min(4098, Math.max(i15, bArr.length * 2)));
                        }
                    }
                } else {
                    int min2 = Math.min(i12, this.f19228c - i13);
                    xVar.d(xVar2.a, this.f19229d, min2);
                    int i16 = this.f19229d + min2;
                    this.f19229d = i16;
                    int i17 = this.f19228c;
                    if (i16 != i17) {
                        continue;
                    } else {
                        if (this.f19230e) {
                            byte[] bArr2 = xVar2.a;
                            int i18 = n9.h0.a;
                            int i19 = -1;
                            for (int i20 = 0; i20 < i17; i20++) {
                                i19 = n9.h0.f22555m[((i19 >>> 24) ^ (bArr2[i20] & UByte.MAX_VALUE)) & 255] ^ (i19 << 8);
                            }
                            if (i19 != 0) {
                                this.f19231f = true;
                                return;
                            }
                            xVar2.F(this.f19228c - 4);
                        } else {
                            xVar2.F(i17);
                        }
                        xVar2.G(0);
                        this.a.a(xVar2);
                        this.f19229d = 0;
                    }
                }
            } else {
                return;
            }
        }
    }

    @Override // i8.i0
    public final void b(n9.f0 f0Var, y7.n nVar, h0 h0Var) {
        this.a.b(f0Var, nVar, h0Var);
        this.f19231f = true;
    }

    @Override // i8.i0
    public final void seek() {
        this.f19231f = true;
    }
}
