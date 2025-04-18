package cd;

import java.util.Arrays;

/* loaded from: classes4.dex */
public final class b implements Cloneable {

    /* renamed from: b, reason: collision with root package name */
    public final int f2783b;

    /* renamed from: c, reason: collision with root package name */
    public final int f2784c;

    /* renamed from: d, reason: collision with root package name */
    public final int f2785d;

    /* renamed from: f, reason: collision with root package name */
    public final int[] f2786f;

    public b(int i10, int i11) {
        if (i10 > 0 && i11 > 0) {
            this.f2783b = i10;
            this.f2784c = i11;
            int i12 = (i10 + 31) / 32;
            this.f2785d = i12;
            this.f2786f = new int[i12 * i11];
            return;
        }
        throw new IllegalArgumentException("Both dimensions must be greater than 0");
    }

    public final boolean a(int i10, int i11) {
        if (((this.f2786f[(i10 / 32) + (i11 * this.f2785d)] >>> (i10 & 31)) & 1) != 0) {
            return true;
        }
        return false;
    }

    public final void b(int i10, int i11) {
        int i12 = (i10 / 32) + (i11 * this.f2785d);
        int[] iArr = this.f2786f;
        iArr[i12] = (1 << (i10 & 31)) | iArr[i12];
    }

    public final void c(int i10, int i11, int i12, int i13) {
        if (i11 >= 0 && i10 >= 0) {
            if (i13 > 0 && i12 > 0) {
                int i14 = i12 + i10;
                int i15 = i13 + i11;
                if (i15 <= this.f2784c && i14 <= this.f2783b) {
                    while (i11 < i15) {
                        int i16 = this.f2785d * i11;
                        for (int i17 = i10; i17 < i14; i17++) {
                            int i18 = (i17 / 32) + i16;
                            int[] iArr = this.f2786f;
                            iArr[i18] = iArr[i18] | (1 << (i17 & 31));
                        }
                        i11++;
                    }
                    return;
                }
                throw new IllegalArgumentException("The region must fit inside the matrix");
            }
            throw new IllegalArgumentException("Height and width must be at least 1");
        }
        throw new IllegalArgumentException("Left and top must be nonnegative");
    }

    public final Object clone() {
        return new b((int[]) this.f2786f.clone(), this.f2783b, this.f2784c, this.f2785d);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (this.f2783b != bVar.f2783b || this.f2784c != bVar.f2784c || this.f2785d != bVar.f2785d || !Arrays.equals(this.f2786f, bVar.f2786f)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i10 = this.f2783b;
        return Arrays.hashCode(this.f2786f) + (((((((i10 * 31) + i10) * 31) + this.f2784c) * 31) + this.f2785d) * 31);
    }

    public final String toString() {
        String str;
        int i10 = this.f2783b;
        int i11 = this.f2784c;
        StringBuilder sb2 = new StringBuilder((i10 + 1) * i11);
        for (int i12 = 0; i12 < i11; i12++) {
            for (int i13 = 0; i13 < i10; i13++) {
                if (a(i13, i12)) {
                    str = "X ";
                } else {
                    str = "  ";
                }
                sb2.append(str);
            }
            sb2.append("\n");
        }
        return sb2.toString();
    }

    public b(int[] iArr, int i10, int i11, int i12) {
        this.f2783b = i10;
        this.f2784c = i11;
        this.f2785d = i12;
        this.f2786f = iArr;
    }
}
