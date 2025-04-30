package D5;

import java.util.Arrays;

/* loaded from: classes3.dex */
public final class b implements Cloneable {
    public final int b;

    /* renamed from: c, reason: collision with root package name */
    public final int f746c;

    /* renamed from: d, reason: collision with root package name */
    public final int f747d;

    /* renamed from: f, reason: collision with root package name */
    public final int[] f748f;

    public b(int i9, int i10) {
        if (i9 > 0 && i10 > 0) {
            this.b = i9;
            this.f746c = i10;
            int i11 = (i9 + 31) / 32;
            this.f747d = i11;
            this.f748f = new int[i11 * i10];
            return;
        }
        throw new IllegalArgumentException("Both dimensions must be greater than 0");
    }

    public final boolean a(int i9, int i10) {
        if (((this.f748f[(i9 / 32) + (i10 * this.f747d)] >>> (i9 & 31)) & 1) != 0) {
            return true;
        }
        return false;
    }

    public final void b(int i9, int i10) {
        int i11 = (i9 / 32) + (i10 * this.f747d);
        int[] iArr = this.f748f;
        iArr[i11] = (1 << (i9 & 31)) | iArr[i11];
    }

    public final void c(int i9, int i10, int i11, int i12) {
        if (i10 >= 0 && i9 >= 0) {
            if (i12 > 0 && i11 > 0) {
                int i13 = i11 + i9;
                int i14 = i12 + i10;
                if (i14 <= this.f746c && i13 <= this.b) {
                    while (i10 < i14) {
                        int i15 = this.f747d * i10;
                        for (int i16 = i9; i16 < i13; i16++) {
                            int i17 = (i16 / 32) + i15;
                            int[] iArr = this.f748f;
                            iArr[i17] = iArr[i17] | (1 << (i16 & 31));
                        }
                        i10++;
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
        return new b((int[]) this.f748f.clone(), this.b, this.f746c, this.f747d);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (this.b != bVar.b || this.f746c != bVar.f746c || this.f747d != bVar.f747d || !Arrays.equals(this.f748f, bVar.f748f)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i9 = this.b;
        return Arrays.hashCode(this.f748f) + (((((((i9 * 31) + i9) * 31) + this.f746c) * 31) + this.f747d) * 31);
    }

    public final String toString() {
        String str;
        int i9 = this.b;
        int i10 = this.f746c;
        StringBuilder sb = new StringBuilder((i9 + 1) * i10);
        for (int i11 = 0; i11 < i10; i11++) {
            for (int i12 = 0; i12 < i9; i12++) {
                if (a(i12, i11)) {
                    str = "X ";
                } else {
                    str = "  ";
                }
                sb.append(str);
            }
            sb.append("\n");
        }
        return sb.toString();
    }

    public b(int[] iArr, int i9, int i10, int i11) {
        this.b = i9;
        this.f746c = i10;
        this.f747d = i11;
        this.f748f = iArr;
    }
}
