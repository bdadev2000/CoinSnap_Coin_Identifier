package i8;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.Collections;
import java.util.List;

/* loaded from: classes3.dex */
public final class f0 implements y7.l {
    public final List a;

    /* renamed from: b, reason: collision with root package name */
    public final n9.x f19288b = new n9.x(new byte[9400], 0);

    /* renamed from: c, reason: collision with root package name */
    public final SparseIntArray f19289c;

    /* renamed from: d, reason: collision with root package name */
    public final g f19290d;

    /* renamed from: e, reason: collision with root package name */
    public final SparseArray f19291e;

    /* renamed from: f, reason: collision with root package name */
    public final SparseBooleanArray f19292f;

    /* renamed from: g, reason: collision with root package name */
    public final SparseBooleanArray f19293g;

    /* renamed from: h, reason: collision with root package name */
    public final d0 f19294h;

    /* renamed from: i, reason: collision with root package name */
    public b8.a f19295i;

    /* renamed from: j, reason: collision with root package name */
    public y7.n f19296j;

    /* renamed from: k, reason: collision with root package name */
    public int f19297k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f19298l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f19299m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f19300n;

    /* renamed from: o, reason: collision with root package name */
    public i0 f19301o;

    /* renamed from: p, reason: collision with root package name */
    public int f19302p;

    public f0(n9.f0 f0Var, g gVar) {
        this.f19290d = gVar;
        this.a = Collections.singletonList(f0Var);
        SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
        this.f19292f = sparseBooleanArray;
        this.f19293g = new SparseBooleanArray();
        SparseArray sparseArray = new SparseArray();
        this.f19291e = sparseArray;
        this.f19289c = new SparseIntArray();
        this.f19294h = new d0();
        this.f19296j = y7.n.f27990n8;
        this.f19302p = -1;
        sparseBooleanArray.clear();
        sparseArray.clear();
        SparseArray sparseArray2 = new SparseArray();
        int size = sparseArray2.size();
        for (int i10 = 0; i10 < size; i10++) {
            sparseArray.put(sparseArray2.keyAt(i10), (i0) sparseArray2.valueAt(i10));
        }
        sparseArray.put(0, new c0(new r4.c(this)));
        this.f19301o = null;
    }

    @Override // y7.l
    public final void a(y7.n nVar) {
        this.f19296j = nVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v10 */
    /* JADX WARN: Type inference failed for: r10v12 */
    /* JADX WARN: Type inference failed for: r10v13 */
    /* JADX WARN: Type inference failed for: r10v14 */
    /* JADX WARN: Type inference failed for: r10v15 */
    /* JADX WARN: Type inference failed for: r10v2 */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r10v6 */
    /* JADX WARN: Type inference failed for: r10v7 */
    /* JADX WARN: Type inference failed for: r10v8 */
    /* JADX WARN: Type inference failed for: r10v9 */
    /* JADX WARN: Type inference failed for: r13v1 */
    /* JADX WARN: Type inference failed for: r13v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r13v3 */
    /* JADX WARN: Type inference failed for: r13v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r13v5 */
    /* JADX WARN: Type inference failed for: r13v6 */
    /* JADX WARN: Type inference failed for: r13v7 */
    /* JADX WARN: Type inference failed for: r15v0 */
    /* JADX WARN: Type inference failed for: r15v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r15v11 */
    /* JADX WARN: Type inference failed for: r15v2 */
    /* JADX WARN: Type inference failed for: r15v3 */
    /* JADX WARN: Type inference failed for: r15v4 */
    /* JADX WARN: Type inference failed for: r15v6 */
    /* JADX WARN: Type inference failed for: r3v23 */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v2, types: [android.util.SparseBooleanArray] */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Type inference failed for: r8v8 */
    @Override // y7.l
    public final int b(y7.m mVar, y7.p pVar) {
        ?? r13;
        ?? r15;
        ?? r10;
        int i10;
        ?? r102;
        ?? r72;
        i0 i0Var;
        ?? r103;
        int i11;
        ?? r32;
        ?? r104;
        int i12;
        ?? r82;
        long length = mVar.getLength();
        if (this.f19298l) {
            if (length != -1) {
                r32 = true;
            } else {
                r32 = false;
            }
            long j3 = C.TIME_UNSET;
            d0 d0Var = this.f19294h;
            if (r32 != false && !d0Var.f19246d) {
                int i13 = this.f19302p;
                if (i13 <= 0) {
                    d0Var.a(mVar);
                    return 0;
                }
                boolean z10 = d0Var.f19248f;
                n9.x xVar = d0Var.f19245c;
                int i14 = d0Var.a;
                if (!z10) {
                    long length2 = mVar.getLength();
                    int min = (int) Math.min(i14, length2);
                    long j10 = length2 - min;
                    if (mVar.getPosition() != j10) {
                        pVar.a = j10;
                        i12 = 1;
                    } else {
                        xVar.D(min);
                        mVar.resetPeekPosition();
                        mVar.peekFully(xVar.a, 0, min);
                        int i15 = xVar.f22599b;
                        int i16 = xVar.f22600c;
                        int i17 = i16 - 188;
                        while (true) {
                            if (i17 < i15) {
                                break;
                            }
                            byte[] bArr = xVar.a;
                            int i18 = -4;
                            int i19 = 0;
                            while (true) {
                                if (i18 <= 4) {
                                    int i20 = (i18 * 188) + i17;
                                    if (i20 >= i15 && i20 < i16 && bArr[i20] == 71) {
                                        i19++;
                                        if (i19 == 5) {
                                            r82 = true;
                                            break;
                                        }
                                    } else {
                                        i19 = 0;
                                    }
                                    i18++;
                                } else {
                                    r82 = false;
                                    break;
                                }
                            }
                            if (r82 != false) {
                                long x10 = com.bumptech.glide.d.x(i17, i13, xVar);
                                if (x10 != C.TIME_UNSET) {
                                    j3 = x10;
                                    break;
                                }
                            }
                            i17--;
                        }
                        d0Var.f19250h = j3;
                        d0Var.f19248f = true;
                        i12 = 0;
                    }
                } else {
                    if (d0Var.f19250h == C.TIME_UNSET) {
                        d0Var.a(mVar);
                        return 0;
                    }
                    if (!d0Var.f19247e) {
                        int min2 = (int) Math.min(i14, mVar.getLength());
                        long j11 = 0;
                        if (mVar.getPosition() != j11) {
                            pVar.a = j11;
                            i12 = 1;
                        } else {
                            xVar.D(min2);
                            mVar.resetPeekPosition();
                            mVar.peekFully(xVar.a, 0, min2);
                            int i21 = xVar.f22599b;
                            int i22 = xVar.f22600c;
                            while (true) {
                                if (i21 >= i22) {
                                    break;
                                }
                                if (xVar.a[i21] == 71) {
                                    long x11 = com.bumptech.glide.d.x(i21, i13, xVar);
                                    if (x11 != C.TIME_UNSET) {
                                        j3 = x11;
                                        break;
                                    }
                                }
                                i21++;
                            }
                            d0Var.f19249g = j3;
                            d0Var.f19247e = true;
                            i12 = 0;
                        }
                    } else {
                        long j12 = d0Var.f19249g;
                        if (j12 == C.TIME_UNSET) {
                            d0Var.a(mVar);
                            return 0;
                        }
                        n9.f0 f0Var = d0Var.f19244b;
                        long b3 = f0Var.b(d0Var.f19250h) - f0Var.b(j12);
                        d0Var.f19251i = b3;
                        if (b3 < 0) {
                            n9.o.f("TsDurationReader", "Invalid duration: " + d0Var.f19251i + ". Using TIME_UNSET instead.");
                            d0Var.f19251i = C.TIME_UNSET;
                        }
                        d0Var.a(mVar);
                        return 0;
                    }
                }
                return i12;
            }
            if (!this.f19299m) {
                this.f19299m = true;
                long j13 = d0Var.f19251i;
                if (j13 != C.TIME_UNSET) {
                    r13 = 0;
                    r15 = 1;
                    b8.a aVar = new b8.a(d0Var.f19244b, j13, length, this.f19302p, 112800);
                    this.f19295i = aVar;
                    this.f19296j.d(aVar.a);
                } else {
                    r13 = 0;
                    r15 = 1;
                    this.f19296j.d(new y7.r(j13));
                }
            } else {
                r13 = 0;
                r15 = 1;
            }
            if (this.f19300n) {
                this.f19300n = r13;
                seek(0L, 0L);
                if (mVar.getPosition() != 0) {
                    pVar.a = 0L;
                    return r15 == true ? 1 : 0;
                }
            }
            b8.a aVar2 = this.f19295i;
            if (aVar2 != null) {
                if (aVar2.f27961c != null) {
                    r104 = r15 == true ? 1 : 0;
                } else {
                    r104 = r13 == true ? 1 : 0;
                }
                if (r104 != false) {
                    return aVar2.a(mVar, pVar);
                }
            }
        } else {
            r13 = 0;
            r15 = 1;
        }
        n9.x xVar2 = this.f19288b;
        byte[] bArr2 = xVar2.a;
        int i23 = xVar2.f22599b;
        if (9400 - i23 < 188) {
            int i24 = xVar2.f22600c - i23;
            if (i24 > 0) {
                System.arraycopy(bArr2, i23, bArr2, r13, i24);
            }
            xVar2.E(bArr2, i24);
        }
        while (true) {
            int i25 = xVar2.f22600c;
            if (i25 - xVar2.f22599b < 188) {
                int read = mVar.read(bArr2, i25, 9400 - i25);
                if (read == -1) {
                    r10 = r13;
                    break;
                }
                xVar2.F(i25 + read);
            } else {
                r10 = r15;
                break;
            }
        }
        if (r10 == false) {
            return -1;
        }
        int i26 = xVar2.f22599b;
        int i27 = xVar2.f22600c;
        byte[] bArr3 = xVar2.a;
        while (i26 < i27 && bArr3[i26] != 71) {
            i26++;
        }
        xVar2.G(i26);
        int i28 = i26 + 188;
        int i29 = xVar2.f22600c;
        if (i28 > i29) {
            return r13;
        }
        int f10 = xVar2.f();
        if ((8388608 & f10) != 0) {
            xVar2.G(i28);
            return r13;
        }
        if ((4194304 & f10) != 0) {
            i10 = r15;
        } else {
            i10 = r13;
        }
        int i30 = i10 | 0;
        int i31 = (2096896 & f10) >> 8;
        if ((f10 & 32) != 0) {
            r102 = r15;
        } else {
            r102 = r13;
        }
        if ((f10 & 16) != 0) {
            r72 = r15;
        } else {
            r72 = r13;
        }
        if (r72 != false) {
            i0Var = (i0) this.f19291e.get(i31);
        } else {
            i0Var = null;
        }
        if (i0Var == null) {
            xVar2.G(i28);
            return r13;
        }
        int i32 = f10 & 15;
        SparseIntArray sparseIntArray = this.f19289c;
        int i33 = sparseIntArray.get(i31, i32 - 1);
        sparseIntArray.put(i31, i32);
        if (i33 == i32) {
            xVar2.G(i28);
            return r13;
        }
        if (i32 != ((i33 + r15) & 15)) {
            i0Var.seek();
        }
        if (r102 != false) {
            int v10 = xVar2.v();
            if ((xVar2.v() & 64) != 0) {
                i11 = 2;
            } else {
                i11 = r13;
            }
            i30 |= i11;
            xVar2.H(v10 - r15);
        }
        boolean z11 = this.f19298l;
        if (!z11 && this.f19293g.get(i31, r13)) {
            r103 = r13;
        } else {
            r103 = r15;
        }
        if (r103 != false) {
            xVar2.F(i28);
            i0Var.a(i30, xVar2);
            xVar2.F(i29);
        }
        if (!z11 && this.f19298l && length != -1) {
            this.f19300n = r15;
        }
        xVar2.G(i28);
        return r13;
    }

    @Override // y7.l
    public final boolean d(y7.m mVar) {
        boolean z10;
        byte[] bArr = this.f19288b.a;
        y7.h hVar = (y7.h) mVar;
        hVar.peekFully(bArr, 0, 940, false);
        for (int i10 = 0; i10 < 188; i10++) {
            int i11 = 0;
            while (true) {
                if (i11 < 5) {
                    if (bArr[(i11 * 188) + i10] != 71) {
                        z10 = false;
                        break;
                    }
                    i11++;
                } else {
                    z10 = true;
                    break;
                }
            }
            if (z10) {
                hVar.skipFully(i10);
                return true;
            }
        }
        return false;
    }

    @Override // y7.l
    public final void release() {
    }

    @Override // y7.l
    public final void seek(long j3, long j10) {
        b8.a aVar;
        long j11;
        boolean z10;
        List list = this.a;
        int size = list.size();
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            n9.f0 f0Var = (n9.f0) list.get(i11);
            synchronized (f0Var) {
                j11 = f0Var.f22536b;
            }
            boolean z11 = true;
            if (j11 == C.TIME_UNSET) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10) {
                long c10 = f0Var.c();
                if (c10 == C.TIME_UNSET || c10 == 0 || c10 == j10) {
                    z11 = false;
                }
                z10 = z11;
            }
            if (z10) {
                f0Var.d(j10);
            }
        }
        if (j10 != 0 && (aVar = this.f19295i) != null) {
            aVar.c(j10);
        }
        this.f19288b.D(0);
        this.f19289c.clear();
        while (true) {
            SparseArray sparseArray = this.f19291e;
            if (i10 < sparseArray.size()) {
                ((i0) sparseArray.valueAt(i10)).seek();
                i10++;
            } else {
                return;
            }
        }
    }
}
