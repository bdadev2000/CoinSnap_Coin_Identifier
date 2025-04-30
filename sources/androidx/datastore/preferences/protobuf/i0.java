package androidx.datastore.preferences.protobuf;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class i0 {

    /* renamed from: f, reason: collision with root package name */
    public static final i0 f4576f = new i0(0, new int[0], new Object[0], false);

    /* renamed from: a, reason: collision with root package name */
    public int f4577a;
    public int[] b;

    /* renamed from: c, reason: collision with root package name */
    public Object[] f4578c;

    /* renamed from: d, reason: collision with root package name */
    public int f4579d = -1;

    /* renamed from: e, reason: collision with root package name */
    public boolean f4580e;

    public i0(int i9, int[] iArr, Object[] objArr, boolean z8) {
        this.f4577a = i9;
        this.b = iArr;
        this.f4578c = objArr;
        this.f4580e = z8;
    }

    public static i0 b() {
        return new i0(0, new int[8], new Object[8], true);
    }

    public final int a() {
        int N8;
        int i9 = this.f4579d;
        if (i9 != -1) {
            return i9;
        }
        int i10 = 0;
        for (int i11 = 0; i11 < this.f4577a; i11++) {
            int i12 = this.b[i11];
            int i13 = i12 >>> 3;
            int i14 = i12 & 7;
            if (i14 != 0) {
                if (i14 != 1) {
                    if (i14 != 2) {
                        if (i14 != 3) {
                            if (i14 == 5) {
                                ((Integer) this.f4578c[i11]).getClass();
                                N8 = C0435j.x(i13);
                            } else {
                                throw new IllegalStateException(A.b());
                            }
                        } else {
                            i10 = ((i0) this.f4578c[i11]).a() + (C0435j.K(i13) * 2) + i10;
                        }
                    } else {
                        N8 = C0435j.t(i13, (C0432g) this.f4578c[i11]);
                    }
                } else {
                    ((Long) this.f4578c[i11]).getClass();
                    N8 = C0435j.y(i13);
                }
            } else {
                N8 = C0435j.N(i13, ((Long) this.f4578c[i11]).longValue());
            }
            i10 = N8 + i10;
        }
        this.f4579d = i10;
        return i10;
    }

    public final void c(int i9, Object obj) {
        int i10;
        if (this.f4580e) {
            int i11 = this.f4577a;
            int[] iArr = this.b;
            if (i11 == iArr.length) {
                if (i11 < 4) {
                    i10 = 8;
                } else {
                    i10 = i11 >> 1;
                }
                int i12 = i11 + i10;
                this.b = Arrays.copyOf(iArr, i12);
                this.f4578c = Arrays.copyOf(this.f4578c, i12);
            }
            int[] iArr2 = this.b;
            int i13 = this.f4577a;
            iArr2[i13] = i9;
            this.f4578c[i13] = obj;
            this.f4577a = i13 + 1;
            return;
        }
        throw new UnsupportedOperationException();
    }

    public final void d(J j7) {
        if (this.f4577a == 0) {
            return;
        }
        j7.getClass();
        for (int i9 = 0; i9 < this.f4577a; i9++) {
            int i10 = this.b[i9];
            Object obj = this.f4578c[i9];
            int i11 = i10 >>> 3;
            int i12 = i10 & 7;
            if (i12 != 0) {
                if (i12 != 1) {
                    if (i12 != 2) {
                        if (i12 != 3) {
                            if (i12 == 5) {
                                j7.e(i11, ((Integer) obj).intValue());
                            } else {
                                throw new RuntimeException(A.b());
                            }
                        } else {
                            C0435j c0435j = (C0435j) j7.f4515a;
                            c0435j.i0(i11, 3);
                            ((i0) obj).d(j7);
                            c0435j.i0(i11, 4);
                        }
                    } else {
                        j7.b(i11, (C0432g) obj);
                    }
                } else {
                    j7.f(i11, ((Long) obj).longValue());
                }
            } else {
                j7.j(i11, ((Long) obj).longValue());
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof i0)) {
            return false;
        }
        i0 i0Var = (i0) obj;
        int i9 = this.f4577a;
        if (i9 == i0Var.f4577a) {
            int[] iArr = this.b;
            int[] iArr2 = i0Var.b;
            int i10 = 0;
            while (true) {
                if (i10 < i9) {
                    if (iArr[i10] != iArr2[i10]) {
                        break;
                    }
                    i10++;
                } else {
                    Object[] objArr = this.f4578c;
                    Object[] objArr2 = i0Var.f4578c;
                    int i11 = this.f4577a;
                    for (int i12 = 0; i12 < i11; i12++) {
                        if (objArr[i12].equals(objArr2[i12])) {
                        }
                    }
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int i9 = this.f4577a;
        int i10 = (527 + i9) * 31;
        int[] iArr = this.b;
        int i11 = 17;
        int i12 = 17;
        for (int i13 = 0; i13 < i9; i13++) {
            i12 = (i12 * 31) + iArr[i13];
        }
        int i14 = (i10 + i12) * 31;
        Object[] objArr = this.f4578c;
        int i15 = this.f4577a;
        for (int i16 = 0; i16 < i15; i16++) {
            i11 = (i11 * 31) + objArr[i16].hashCode();
        }
        return i14 + i11;
    }
}
