package androidx.datastore.preferences.protobuf;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class s1 {

    /* renamed from: f, reason: collision with root package name */
    public static final s1 f1462f = new s1(0, new int[0], new Object[0], false);
    public int a;

    /* renamed from: b, reason: collision with root package name */
    public int[] f1463b;

    /* renamed from: c, reason: collision with root package name */
    public Object[] f1464c;

    /* renamed from: d, reason: collision with root package name */
    public int f1465d = -1;

    /* renamed from: e, reason: collision with root package name */
    public boolean f1466e;

    public s1(int i10, int[] iArr, Object[] objArr, boolean z10) {
        this.a = i10;
        this.f1463b = iArr;
        this.f1464c = objArr;
        this.f1466e = z10;
    }

    public final void a(int i10) {
        int[] iArr = this.f1463b;
        if (i10 > iArr.length) {
            int i11 = this.a;
            int i12 = (i11 / 2) + i11;
            if (i12 >= i10) {
                i10 = i12;
            }
            if (i10 < 8) {
                i10 = 8;
            }
            this.f1463b = Arrays.copyOf(iArr, i10);
            this.f1464c = Arrays.copyOf(this.f1464c, i10);
        }
    }

    public final int b() {
        int h02;
        int i10 = this.f1465d;
        if (i10 != -1) {
            return i10;
        }
        int i11 = 0;
        for (int i12 = 0; i12 < this.a; i12++) {
            int i13 = this.f1463b[i12];
            int i14 = i13 >>> 3;
            int i15 = i13 & 7;
            if (i15 != 0) {
                if (i15 != 1) {
                    if (i15 != 2) {
                        if (i15 != 3) {
                            if (i15 == 5) {
                                ((Integer) this.f1464c[i12]).intValue();
                                h02 = r.R(i14);
                            } else {
                                int i16 = j0.f1378c;
                                throw new IllegalStateException(new i0());
                            }
                        } else {
                            i11 = ((s1) this.f1464c[i12]).b() + (r.e0(i14) * 2) + i11;
                        }
                    } else {
                        h02 = r.O(i14, (k) this.f1464c[i12]);
                    }
                } else {
                    ((Long) this.f1464c[i12]).longValue();
                    h02 = r.S(i14);
                }
            } else {
                h02 = r.h0(i14, ((Long) this.f1464c[i12]).longValue());
            }
            i11 = h02 + i11;
        }
        this.f1465d = i11;
        return i11;
    }

    public final void c(int i10, Object obj) {
        if (this.f1466e) {
            a(this.a + 1);
            int[] iArr = this.f1463b;
            int i11 = this.a;
            iArr[i11] = i10;
            this.f1464c[i11] = obj;
            this.a = i11 + 1;
            return;
        }
        throw new UnsupportedOperationException();
    }

    public final void d(fb.c cVar) {
        if (this.a == 0) {
            return;
        }
        cVar.getClass();
        for (int i10 = 0; i10 < this.a; i10++) {
            int i11 = this.f1463b[i10];
            Object obj = this.f1464c[i10];
            int i12 = i11 >>> 3;
            int i13 = i11 & 7;
            if (i13 != 0) {
                if (i13 != 1) {
                    if (i13 != 2) {
                        if (i13 != 3) {
                            if (i13 == 5) {
                                cVar.B(i12, ((Integer) obj).intValue());
                            } else {
                                int i14 = j0.f1378c;
                                throw new RuntimeException(new i0());
                            }
                        } else {
                            ((r) cVar.f17773c).z0(i12, 3);
                            ((s1) obj).d(cVar);
                            ((r) cVar.f17773c).z0(i12, 4);
                        }
                    } else {
                        cVar.y(i12, (k) obj);
                    }
                } else {
                    cVar.C(i12, ((Long) obj).longValue());
                }
            } else {
                cVar.G(i12, ((Long) obj).longValue());
            }
        }
    }

    public final boolean equals(Object obj) {
        boolean z10;
        boolean z11;
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof s1)) {
            return false;
        }
        s1 s1Var = (s1) obj;
        int i10 = this.a;
        if (i10 == s1Var.a) {
            int[] iArr = this.f1463b;
            int[] iArr2 = s1Var.f1463b;
            int i11 = 0;
            while (true) {
                if (i11 < i10) {
                    if (iArr[i11] != iArr2[i11]) {
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
                Object[] objArr = this.f1464c;
                Object[] objArr2 = s1Var.f1464c;
                int i12 = this.a;
                int i13 = 0;
                while (true) {
                    if (i13 < i12) {
                        if (!objArr[i13].equals(objArr2[i13])) {
                            z11 = false;
                            break;
                        }
                        i13++;
                    } else {
                        z11 = true;
                        break;
                    }
                }
                if (z11) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10 = this.a;
        int i11 = (527 + i10) * 31;
        int[] iArr = this.f1463b;
        int i12 = 17;
        int i13 = 17;
        for (int i14 = 0; i14 < i10; i14++) {
            i13 = (i13 * 31) + iArr[i14];
        }
        int i15 = (i11 + i13) * 31;
        Object[] objArr = this.f1464c;
        int i16 = this.a;
        for (int i17 = 0; i17 < i16; i17++) {
            i12 = (i12 * 31) + objArr[i17].hashCode();
        }
        return i15 + i12;
    }
}
