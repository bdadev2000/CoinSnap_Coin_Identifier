package cd;

import java.util.Arrays;

/* loaded from: classes4.dex */
public final class a implements Cloneable {

    /* renamed from: b, reason: collision with root package name */
    public int[] f2781b;

    /* renamed from: c, reason: collision with root package name */
    public int f2782c;

    public a() {
        this.f2782c = 0;
        this.f2781b = new int[1];
    }

    public final void a(boolean z10) {
        c(this.f2782c + 1);
        if (z10) {
            int[] iArr = this.f2781b;
            int i10 = this.f2782c;
            int i11 = i10 / 32;
            iArr[i11] = (1 << (i10 & 31)) | iArr[i11];
        }
        this.f2782c++;
    }

    public final void b(int i10, int i11) {
        if (i11 >= 0 && i11 <= 32) {
            c(this.f2782c + i11);
            while (i11 > 0) {
                boolean z10 = true;
                if (((i10 >> (i11 - 1)) & 1) != 1) {
                    z10 = false;
                }
                a(z10);
                i11--;
            }
            return;
        }
        throw new IllegalArgumentException("Num bits must be between 0 and 32");
    }

    public final void c(int i10) {
        int[] iArr = this.f2781b;
        if (i10 > (iArr.length << 5)) {
            int[] iArr2 = new int[(i10 + 31) / 32];
            System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
            this.f2781b = iArr2;
        }
    }

    public final Object clone() {
        return new a((int[]) this.f2781b.clone(), this.f2782c);
    }

    public final boolean d(int i10) {
        return ((1 << (i10 & 31)) & this.f2781b[i10 / 32]) != 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (this.f2782c != aVar.f2782c || !Arrays.equals(this.f2781b, aVar.f2781b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f2781b) + (this.f2782c * 31);
    }

    public final String toString() {
        char c10;
        int i10 = this.f2782c;
        StringBuilder sb2 = new StringBuilder((i10 / 8) + i10 + 1);
        for (int i11 = 0; i11 < this.f2782c; i11++) {
            if ((i11 & 7) == 0) {
                sb2.append(' ');
            }
            if (d(i11)) {
                c10 = 'X';
            } else {
                c10 = '.';
            }
            sb2.append(c10);
        }
        return sb2.toString();
    }

    public a(int[] iArr, int i10) {
        this.f2781b = iArr;
        this.f2782c = i10;
    }
}
