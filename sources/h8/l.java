package h8;

import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.util.ArrayList;
import java.util.Arrays;
import n9.o;
import n9.x;
import s7.q0;
import s7.r0;
import s7.x1;
import v8.u0;
import y7.c0;
import y7.d0;
import y7.e0;

/* loaded from: classes3.dex */
public final class l extends j {

    /* renamed from: n, reason: collision with root package name */
    public k f18917n;

    /* renamed from: o, reason: collision with root package name */
    public int f18918o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f18919p;

    /* renamed from: q, reason: collision with root package name */
    public e0 f18920q;

    /* renamed from: r, reason: collision with root package name */
    public f0.c f18921r;

    @Override // h8.j
    public final void a(long j3) {
        boolean z10;
        this.f18906g = j3;
        int i10 = 0;
        if (j3 != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f18919p = z10;
        e0 e0Var = this.f18920q;
        if (e0Var != null) {
            i10 = e0Var.f27966e;
        }
        this.f18918o = i10;
    }

    @Override // h8.j
    public final long b(x xVar) {
        int i10;
        int i11 = 0;
        byte b3 = xVar.a[0];
        if ((b3 & 1) == 1) {
            return -1L;
        }
        k kVar = this.f18917n;
        u0.p(kVar);
        boolean z10 = kVar.f18915d[(b3 >> 1) & (255 >>> (8 - kVar.f18916e))].a;
        e0 e0Var = kVar.a;
        if (!z10) {
            i10 = e0Var.f27966e;
        } else {
            i10 = e0Var.f27967f;
        }
        if (this.f18919p) {
            i11 = (this.f18918o + i10) / 4;
        }
        long j3 = i11;
        byte[] bArr = xVar.a;
        int length = bArr.length;
        int i12 = xVar.f22600c + 4;
        if (length < i12) {
            byte[] copyOf = Arrays.copyOf(bArr, i12);
            xVar.E(copyOf, copyOf.length);
        } else {
            xVar.F(i12);
        }
        byte[] bArr2 = xVar.a;
        int i13 = xVar.f22600c;
        bArr2[i13 - 4] = (byte) (j3 & 255);
        bArr2[i13 - 3] = (byte) ((j3 >>> 8) & 255);
        bArr2[i13 - 2] = (byte) ((j3 >>> 16) & 255);
        bArr2[i13 - 1] = (byte) ((j3 >>> 24) & 255);
        this.f18919p = true;
        this.f18918o = i10;
        return j3;
    }

    @Override // h8.j
    public final boolean c(x xVar, long j3, r4.c cVar) {
        k kVar;
        int i10;
        int i11;
        long j10;
        int i12;
        int i13;
        if (this.f18917n != null) {
            ((r0) cVar.f23999c).getClass();
            return false;
        }
        e0 e0Var = this.f18920q;
        int i14 = 4;
        if (e0Var == null) {
            com.bumptech.glide.d.K(1, xVar, false);
            xVar.m();
            int v10 = xVar.v();
            int m10 = xVar.m();
            int i15 = xVar.i();
            if (i15 <= 0) {
                i12 = -1;
            } else {
                i12 = i15;
            }
            int i16 = xVar.i();
            if (i16 <= 0) {
                i13 = -1;
            } else {
                i13 = i16;
            }
            xVar.i();
            int v11 = xVar.v();
            int pow = (int) Math.pow(2.0d, v11 & 15);
            int pow2 = (int) Math.pow(2.0d, (v11 & PsExtractor.VIDEO_STREAM_MASK) >> 4);
            xVar.v();
            this.f18920q = new e0(v10, m10, i12, i13, pow, pow2, Arrays.copyOf(xVar.a, xVar.f22600c));
        } else {
            f0.c cVar2 = this.f18921r;
            if (cVar2 == null) {
                this.f18921r = com.bumptech.glide.d.y(xVar, true, true);
            } else {
                int i17 = xVar.f22600c;
                byte[] bArr = new byte[i17];
                System.arraycopy(xVar.a, 0, bArr, 0, i17);
                int i18 = 5;
                com.bumptech.glide.d.K(5, xVar, false);
                int v12 = xVar.v() + 1;
                c0 c0Var = new c0(xVar.a, 0, (Object) null);
                c0Var.r(xVar.f22599b * 8);
                int i19 = 0;
                while (true) {
                    int i20 = 16;
                    if (i19 < v12) {
                        if (c0Var.i(24) == 5653314) {
                            int i21 = c0Var.i(16);
                            int i22 = c0Var.i(24);
                            if (!c0Var.h()) {
                                boolean h10 = c0Var.h();
                                for (int i23 = 0; i23 < i22; i23++) {
                                    if (h10) {
                                        if (c0Var.h()) {
                                            c0Var.r(i18);
                                        }
                                    } else {
                                        c0Var.r(i18);
                                    }
                                }
                            } else {
                                c0Var.r(i18);
                                int i24 = 0;
                                while (i24 < i22) {
                                    int i25 = 0;
                                    for (int i26 = i22 - i24; i26 > 0; i26 >>>= 1) {
                                        i25++;
                                    }
                                    i24 += c0Var.i(i25);
                                }
                            }
                            int i27 = c0Var.i(4);
                            if (i27 <= 2) {
                                if (i27 == 1 || i27 == 2) {
                                    c0Var.r(32);
                                    c0Var.r(32);
                                    int i28 = c0Var.i(4) + 1;
                                    c0Var.r(1);
                                    if (i27 == 1) {
                                        if (i21 != 0) {
                                            j10 = (long) Math.floor(Math.pow(i22, 1.0d / i21));
                                        } else {
                                            j10 = 0;
                                        }
                                    } else {
                                        j10 = i21 * i22;
                                    }
                                    c0Var.r((int) (j10 * i28));
                                }
                                i19++;
                                i18 = 5;
                            } else {
                                throw x1.a("lookup type greater than 2 not decodable: " + i27, null);
                            }
                        } else {
                            throw x1.a("expected code book to start with [0x56, 0x43, 0x42] at " + c0Var.g(), null);
                        }
                    } else {
                        int i29 = 6;
                        int i30 = c0Var.i(6) + 1;
                        for (int i31 = 0; i31 < i30; i31++) {
                            if (c0Var.i(16) != 0) {
                                throw x1.a("placeholder of time domain transforms not zeroed out", null);
                            }
                        }
                        int i32 = c0Var.i(6) + 1;
                        int i33 = 0;
                        while (true) {
                            int i34 = 3;
                            if (i33 < i32) {
                                int i35 = c0Var.i(i20);
                                if (i35 != 0) {
                                    if (i35 == 1) {
                                        int i36 = c0Var.i(5);
                                        int[] iArr = new int[i36];
                                        int i37 = -1;
                                        for (int i38 = 0; i38 < i36; i38++) {
                                            int i39 = c0Var.i(i14);
                                            iArr[i38] = i39;
                                            if (i39 > i37) {
                                                i37 = i39;
                                            }
                                        }
                                        int i40 = i37 + 1;
                                        int[] iArr2 = new int[i40];
                                        int i41 = 0;
                                        while (i41 < i40) {
                                            iArr2[i41] = c0Var.i(i34) + 1;
                                            int i42 = c0Var.i(2);
                                            int i43 = 8;
                                            if (i42 > 0) {
                                                c0Var.r(8);
                                            }
                                            int i44 = i40;
                                            int i45 = 0;
                                            while (i45 < (1 << i42)) {
                                                c0Var.r(i43);
                                                i45++;
                                                i43 = 8;
                                            }
                                            i41++;
                                            i40 = i44;
                                            i34 = 3;
                                        }
                                        c0Var.r(2);
                                        int i46 = c0Var.i(4);
                                        int i47 = 0;
                                        int i48 = 0;
                                        for (int i49 = 0; i49 < i36; i49++) {
                                            i47 += iArr2[iArr[i49]];
                                            while (i48 < i47) {
                                                c0Var.r(i46);
                                                i48++;
                                            }
                                        }
                                    } else {
                                        throw x1.a("floor type greater than 1 not decodable: " + i35, null);
                                    }
                                } else {
                                    int i50 = 8;
                                    c0Var.r(8);
                                    c0Var.r(16);
                                    c0Var.r(16);
                                    c0Var.r(6);
                                    c0Var.r(8);
                                    int i51 = c0Var.i(4) + 1;
                                    int i52 = 0;
                                    while (i52 < i51) {
                                        c0Var.r(i50);
                                        i52++;
                                        i50 = 8;
                                    }
                                }
                                i33++;
                                i29 = 6;
                                i20 = 16;
                                i14 = 4;
                            } else {
                                int i53 = c0Var.i(i29) + 1;
                                int i54 = 0;
                                while (i54 < i53) {
                                    if (c0Var.i(16) <= 2) {
                                        c0Var.r(24);
                                        c0Var.r(24);
                                        c0Var.r(24);
                                        int i55 = c0Var.i(i29) + 1;
                                        int i56 = 8;
                                        c0Var.r(8);
                                        int[] iArr3 = new int[i55];
                                        for (int i57 = 0; i57 < i55; i57++) {
                                            int i58 = c0Var.i(3);
                                            if (c0Var.h()) {
                                                i11 = c0Var.i(5);
                                            } else {
                                                i11 = 0;
                                            }
                                            iArr3[i57] = (i11 * 8) + i58;
                                        }
                                        int i59 = 0;
                                        while (i59 < i55) {
                                            int i60 = 0;
                                            while (i60 < i56) {
                                                if ((iArr3[i59] & (1 << i60)) != 0) {
                                                    c0Var.r(i56);
                                                }
                                                i60++;
                                                i56 = 8;
                                            }
                                            i59++;
                                            i56 = 8;
                                        }
                                        i54++;
                                        i29 = 6;
                                    } else {
                                        throw x1.a("residueType greater than 2 is not decodable", null);
                                    }
                                }
                                int i61 = c0Var.i(i29) + 1;
                                for (int i62 = 0; i62 < i61; i62++) {
                                    int i63 = c0Var.i(16);
                                    if (i63 != 0) {
                                        o.c("VorbisUtil", "mapping type other than 0 not supported: " + i63);
                                    } else {
                                        if (c0Var.h()) {
                                            i10 = c0Var.i(4) + 1;
                                        } else {
                                            i10 = 1;
                                        }
                                        boolean h11 = c0Var.h();
                                        int i64 = e0Var.a;
                                        if (h11) {
                                            int i65 = c0Var.i(8) + 1;
                                            for (int i66 = 0; i66 < i65; i66++) {
                                                int i67 = i64 - 1;
                                                int i68 = 0;
                                                for (int i69 = i67; i69 > 0; i69 >>>= 1) {
                                                    i68++;
                                                }
                                                c0Var.r(i68);
                                                int i70 = 0;
                                                while (i67 > 0) {
                                                    i70++;
                                                    i67 >>>= 1;
                                                }
                                                c0Var.r(i70);
                                            }
                                        }
                                        if (c0Var.i(2) == 0) {
                                            if (i10 > 1) {
                                                for (int i71 = 0; i71 < i64; i71++) {
                                                    c0Var.r(4);
                                                }
                                            }
                                            for (int i72 = 0; i72 < i10; i72++) {
                                                c0Var.r(8);
                                                c0Var.r(8);
                                                c0Var.r(8);
                                            }
                                        } else {
                                            throw x1.a("to reserved bits must be zero after mapping coupling steps", null);
                                        }
                                    }
                                }
                                int i73 = c0Var.i(6) + 1;
                                d0[] d0VarArr = new d0[i73];
                                for (int i74 = 0; i74 < i73; i74++) {
                                    boolean h12 = c0Var.h();
                                    c0Var.i(16);
                                    c0Var.i(16);
                                    c0Var.i(8);
                                    d0VarArr[i74] = new d0(h12);
                                }
                                if (c0Var.h()) {
                                    int i75 = 0;
                                    for (int i76 = i73 - 1; i76 > 0; i76 >>>= 1) {
                                        i75++;
                                    }
                                    kVar = new k(e0Var, cVar2, bArr, d0VarArr, i75);
                                } else {
                                    throw x1.a("framing bit after modes not set as expected", null);
                                }
                            }
                        }
                    }
                }
            }
        }
        kVar = null;
        this.f18917n = kVar;
        if (kVar == null) {
            return true;
        }
        ArrayList arrayList = new ArrayList();
        e0 e0Var2 = kVar.a;
        arrayList.add(e0Var2.f27968g);
        arrayList.add(kVar.f18914c);
        l8.b u = com.bumptech.glide.d.u(com.google.common.collect.r0.l((String[]) kVar.f18913b.f17517d));
        q0 q0Var = new q0();
        q0Var.f24667k = MimeTypes.AUDIO_VORBIS;
        q0Var.f24662f = e0Var2.f27965d;
        q0Var.f24663g = e0Var2.f27964c;
        q0Var.f24679x = e0Var2.a;
        q0Var.f24680y = e0Var2.f27963b;
        q0Var.f24669m = arrayList;
        q0Var.f24665i = u;
        cVar.f23999c = new r0(q0Var);
        return true;
    }

    @Override // h8.j
    public final void d(boolean z10) {
        super.d(z10);
        if (z10) {
            this.f18917n = null;
            this.f18920q = null;
            this.f18921r = null;
        }
        this.f18918o = 0;
        this.f18919p = false;
    }
}
