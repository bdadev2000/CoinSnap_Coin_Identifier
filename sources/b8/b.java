package b8;

import com.bumptech.glide.c;
import com.bumptech.glide.d;
import com.google.common.collect.r0;
import java.util.Arrays;
import n9.h0;
import n9.x;
import q8.i;
import s7.x1;
import y7.a0;
import y7.c0;
import y7.h;
import y7.l;
import y7.m;
import y7.n;
import y7.p;
import y7.q;
import y7.r;
import y7.s;
import y7.u;

/* loaded from: classes3.dex */
public final class b implements l {

    /* renamed from: e, reason: collision with root package name */
    public n f2327e;

    /* renamed from: f, reason: collision with root package name */
    public a0 f2328f;

    /* renamed from: h, reason: collision with root package name */
    public l8.b f2330h;

    /* renamed from: i, reason: collision with root package name */
    public s f2331i;

    /* renamed from: j, reason: collision with root package name */
    public int f2332j;

    /* renamed from: k, reason: collision with root package name */
    public int f2333k;

    /* renamed from: l, reason: collision with root package name */
    public a f2334l;

    /* renamed from: m, reason: collision with root package name */
    public int f2335m;

    /* renamed from: n, reason: collision with root package name */
    public long f2336n;
    public final byte[] a = new byte[42];

    /* renamed from: b, reason: collision with root package name */
    public final x f2324b = new x(new byte[32768], 0);

    /* renamed from: c, reason: collision with root package name */
    public final boolean f2325c = false;

    /* renamed from: d, reason: collision with root package name */
    public final p f2326d = new p();

    /* renamed from: g, reason: collision with root package name */
    public int f2329g = 0;

    @Override // y7.l
    public final void a(n nVar) {
        this.f2327e = nVar;
        this.f2328f = nVar.track(0, 1);
        nVar.endTracks();
    }

    @Override // y7.l
    public final int b(m mVar, p pVar) {
        nb.a aVar;
        boolean z10;
        l8.b bVar;
        y7.x rVar;
        long j3;
        boolean z11;
        boolean z12;
        boolean z13;
        int i10 = this.f2329g;
        Object obj = null;
        boolean z14 = true;
        int i11 = 0;
        if (i10 != 0) {
            int i12 = 2;
            byte[] bArr = this.a;
            if (i10 != 1) {
                int i13 = 3;
                int i14 = 4;
                if (i10 != 2) {
                    int i15 = 7;
                    if (i10 != 3) {
                        if (i10 != 4) {
                            if (i10 == 5) {
                                this.f2328f.getClass();
                                this.f2331i.getClass();
                                a aVar2 = this.f2334l;
                                if (aVar2 != null) {
                                    if (aVar2.f27961c != null) {
                                        z13 = true;
                                    } else {
                                        z13 = false;
                                    }
                                    if (z13) {
                                        return aVar2.a(mVar, pVar);
                                    }
                                }
                                if (this.f2336n == -1) {
                                    s sVar = this.f2331i;
                                    mVar.resetPeekPosition();
                                    mVar.advancePeekPosition(1);
                                    byte[] bArr2 = new byte[1];
                                    mVar.peekFully(bArr2, 0, 1);
                                    if ((bArr2[0] & 1) == 1) {
                                        z12 = true;
                                    } else {
                                        z12 = false;
                                    }
                                    mVar.advancePeekPosition(2);
                                    if (!z12) {
                                        i15 = 6;
                                    }
                                    x xVar = new x(i15);
                                    byte[] bArr3 = xVar.a;
                                    int i16 = 0;
                                    while (i16 < i15) {
                                        int b3 = mVar.b(0 + i16, i15 - i16, bArr3);
                                        if (b3 == -1) {
                                            break;
                                        }
                                        i16 += b3;
                                    }
                                    xVar.F(i16);
                                    mVar.resetPeekPosition();
                                    p pVar2 = new p();
                                    try {
                                        long B = xVar.B();
                                        if (!z12) {
                                            B *= sVar.f27994b;
                                        }
                                        pVar2.a = B;
                                    } catch (NumberFormatException unused) {
                                        z14 = false;
                                    }
                                    if (z14) {
                                        this.f2336n = pVar2.a;
                                        return 0;
                                    }
                                    throw x1.a(null, null);
                                }
                                x xVar2 = this.f2324b;
                                int i17 = xVar2.f22600c;
                                if (i17 < 32768) {
                                    int read = mVar.read(xVar2.a, i17, 32768 - i17);
                                    if (read != -1) {
                                        z14 = false;
                                    }
                                    if (!z14) {
                                        xVar2.F(i17 + read);
                                    } else if (xVar2.f22600c - xVar2.f22599b == 0) {
                                        long j10 = this.f2336n * 1000000;
                                        s sVar2 = this.f2331i;
                                        int i18 = h0.a;
                                        this.f2328f.d(j10 / sVar2.f27997e, 1, this.f2335m, 0, null);
                                        return -1;
                                    }
                                } else {
                                    z14 = false;
                                }
                                int i19 = xVar2.f22599b;
                                int i20 = this.f2335m;
                                int i21 = this.f2332j;
                                if (i20 < i21) {
                                    xVar2.H(Math.min(i21 - i20, xVar2.f22600c - i19));
                                }
                                this.f2331i.getClass();
                                int i22 = xVar2.f22599b;
                                while (true) {
                                    int i23 = xVar2.f22600c - 16;
                                    p pVar3 = this.f2326d;
                                    if (i22 <= i23) {
                                        xVar2.G(i22);
                                        if (c.g(xVar2, this.f2331i, this.f2333k, pVar3)) {
                                            xVar2.G(i22);
                                            j3 = pVar3.a;
                                            break;
                                        }
                                        i22++;
                                    } else {
                                        if (z14) {
                                            while (true) {
                                                int i24 = xVar2.f22600c;
                                                if (i22 <= i24 - this.f2332j) {
                                                    xVar2.G(i22);
                                                    try {
                                                        z11 = c.g(xVar2, this.f2331i, this.f2333k, pVar3);
                                                    } catch (IndexOutOfBoundsException unused2) {
                                                        z11 = false;
                                                    }
                                                    if (xVar2.f22599b > xVar2.f22600c) {
                                                        z11 = false;
                                                    }
                                                    if (z11) {
                                                        xVar2.G(i22);
                                                        j3 = pVar3.a;
                                                        break;
                                                    }
                                                    i22++;
                                                } else {
                                                    xVar2.G(i24);
                                                    break;
                                                }
                                            }
                                        } else {
                                            xVar2.G(i22);
                                        }
                                        j3 = -1;
                                    }
                                }
                                int i25 = xVar2.f22599b - i19;
                                xVar2.G(i19);
                                this.f2328f.a(i25, xVar2);
                                int i26 = this.f2335m + i25;
                                this.f2335m = i26;
                                if (j3 != -1) {
                                    long j11 = this.f2336n * 1000000;
                                    s sVar3 = this.f2331i;
                                    int i27 = h0.a;
                                    this.f2328f.d(j11 / sVar3.f27997e, 1, i26, 0, null);
                                    this.f2335m = 0;
                                    this.f2336n = j3;
                                }
                                int i28 = xVar2.f22600c;
                                int i29 = xVar2.f22599b;
                                int i30 = i28 - i29;
                                if (i30 >= 16) {
                                    return 0;
                                }
                                byte[] bArr4 = xVar2.a;
                                System.arraycopy(bArr4, i29, bArr4, 0, i30);
                                xVar2.G(0);
                                xVar2.F(i30);
                                return 0;
                            }
                            throw new IllegalStateException();
                        }
                        mVar.resetPeekPosition();
                        x xVar3 = new x(2);
                        mVar.peekFully(xVar3.a, 0, 2);
                        int A = xVar3.A();
                        if ((A >> 2) == 16382) {
                            mVar.resetPeekPosition();
                            this.f2333k = A;
                            n nVar = this.f2327e;
                            int i31 = h0.a;
                            long position = mVar.getPosition();
                            long length = mVar.getLength();
                            this.f2331i.getClass();
                            s sVar4 = this.f2331i;
                            if (sVar4.f28003k != null) {
                                rVar = new r(sVar4, position, i11);
                            } else if (length != -1 && sVar4.f28002j > 0) {
                                a aVar3 = new a(sVar4, this.f2333k, position, length);
                                this.f2334l = aVar3;
                                rVar = aVar3.a;
                            } else {
                                rVar = new r(sVar4.b());
                            }
                            nVar.d(rVar);
                            this.f2329g = 5;
                            return 0;
                        }
                        mVar.resetPeekPosition();
                        throw x1.a("First frame does not start with sync code.", null);
                    }
                    q qVar = new q(this.f2331i);
                    boolean z15 = false;
                    while (!z15) {
                        mVar.resetPeekPosition();
                        c0 c0Var = new c0(new byte[i14], i12, obj);
                        mVar.peekFully(c0Var.f27958d, i11, i14);
                        boolean h10 = c0Var.h();
                        int i32 = c0Var.i(i15);
                        int i33 = c0Var.i(24) + i14;
                        if (i32 == 0) {
                            byte[] bArr5 = new byte[38];
                            mVar.readFully(bArr5, i11, 38);
                            qVar.f27991b = new s(bArr5, i14);
                        } else {
                            s sVar5 = (s) qVar.f27991b;
                            if (sVar5 != null) {
                                if (i32 == i13) {
                                    x xVar4 = new x(i33);
                                    mVar.readFully(xVar4.a, i11, i33);
                                    qVar.f27991b = new s(sVar5.a, sVar5.f27994b, sVar5.f27995c, sVar5.f27996d, sVar5.f27997e, sVar5.f27999g, sVar5.f28000h, sVar5.f28002j, c6.c.y(xVar4), sVar5.f28004l);
                                } else {
                                    l8.b bVar2 = sVar5.f28004l;
                                    if (i32 == i14) {
                                        x xVar5 = new x(i33);
                                        mVar.readFully(xVar5.a, 0, i33);
                                        xVar5.H(i14);
                                        l8.b u = d.u(Arrays.asList((String[]) d.y(xVar5, false, false).f17517d));
                                        if (bVar2 == null) {
                                            bVar = u;
                                        } else {
                                            if (u != null) {
                                                bVar2 = bVar2.a(u.f21159b);
                                            }
                                            bVar = bVar2;
                                        }
                                        qVar.f27991b = new s(sVar5.a, sVar5.f27994b, sVar5.f27995c, sVar5.f27996d, sVar5.f27997e, sVar5.f27999g, sVar5.f28000h, sVar5.f28002j, sVar5.f28003k, bVar);
                                    } else {
                                        if (i32 == 6) {
                                            x xVar6 = new x(i33);
                                            mVar.readFully(xVar6.a, 0, i33);
                                            xVar6.H(4);
                                            l8.b bVar3 = new l8.b(r0.o(o8.a.a(xVar6)));
                                            if (bVar2 != null) {
                                                bVar3 = bVar2.a(bVar3.f21159b);
                                            }
                                            z10 = h10;
                                            qVar.f27991b = new s(sVar5.a, sVar5.f27994b, sVar5.f27995c, sVar5.f27996d, sVar5.f27997e, sVar5.f27999g, sVar5.f28000h, sVar5.f28002j, sVar5.f28003k, bVar3);
                                        } else {
                                            z10 = h10;
                                            mVar.skipFully(i33);
                                        }
                                        s sVar6 = (s) qVar.f27991b;
                                        int i34 = h0.a;
                                        this.f2331i = sVar6;
                                        z15 = z10;
                                        obj = null;
                                        i11 = 0;
                                        i12 = 2;
                                        i13 = 3;
                                        i14 = 4;
                                        i15 = 7;
                                    }
                                }
                            } else {
                                throw new IllegalArgumentException();
                            }
                        }
                        z10 = h10;
                        s sVar62 = (s) qVar.f27991b;
                        int i342 = h0.a;
                        this.f2331i = sVar62;
                        z15 = z10;
                        obj = null;
                        i11 = 0;
                        i12 = 2;
                        i13 = 3;
                        i14 = 4;
                        i15 = 7;
                    }
                    this.f2331i.getClass();
                    this.f2332j = Math.max(this.f2331i.f27995c, 6);
                    a0 a0Var = this.f2328f;
                    int i35 = h0.a;
                    a0Var.f(this.f2331i.c(bArr, this.f2330h));
                    this.f2329g = 4;
                    return 0;
                }
                x xVar7 = new x(4);
                mVar.readFully(xVar7.a, 0, 4);
                if (xVar7.w() == 1716281667) {
                    this.f2329g = 3;
                    return 0;
                }
                throw x1.a("Failed to read FLAC stream marker.", null);
            }
            mVar.peekFully(bArr, 0, bArr.length);
            mVar.resetPeekPosition();
            this.f2329g = 2;
            return 0;
        }
        boolean z16 = !this.f2325c;
        mVar.resetPeekPosition();
        long peekPosition = mVar.getPeekPosition();
        if (z16) {
            aVar = null;
        } else {
            aVar = i.f23716g;
        }
        l8.b f10 = new u(0).f(mVar, aVar);
        if (f10 == null || f10.f21159b.length == 0) {
            f10 = null;
        }
        mVar.skipFully((int) (mVar.getPeekPosition() - peekPosition));
        this.f2330h = f10;
        this.f2329g = 1;
        return 0;
    }

    @Override // y7.l
    public final boolean d(m mVar) {
        l8.b f10 = new u(0).f(mVar, i.f23716g);
        if (f10 != null) {
            int length = f10.f21159b.length;
        }
        x xVar = new x(4);
        ((h) mVar).peekFully(xVar.a, 0, 4, false);
        if (xVar.w() != 1716281667) {
            return false;
        }
        return true;
    }

    @Override // y7.l
    public final void release() {
    }

    @Override // y7.l
    public final void seek(long j3, long j10) {
        long j11 = 0;
        if (j3 == 0) {
            this.f2329g = 0;
        } else {
            a aVar = this.f2334l;
            if (aVar != null) {
                aVar.c(j10);
            }
        }
        if (j10 != 0) {
            j11 = -1;
        }
        this.f2336n = j11;
        this.f2335m = 0;
        this.f2324b.D(0);
    }
}
