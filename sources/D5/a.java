package D5;

import java.util.Arrays;

/* loaded from: classes3.dex */
public final class a implements Cloneable {

    /* renamed from: c, reason: collision with root package name */
    public int f745c = 0;
    public int[] b = new int[1];

    public final void a(boolean z8) {
        c(this.f745c + 1);
        if (z8) {
            int[] iArr = this.b;
            int i9 = this.f745c;
            int i10 = i9 / 32;
            iArr[i10] = (1 << (i9 & 31)) | iArr[i10];
        }
        this.f745c++;
    }

    public final void b(int i9, int i10) {
        if (i10 >= 0 && i10 <= 32) {
            c(this.f745c + i10);
            while (i10 > 0) {
                boolean z8 = true;
                if (((i9 >> (i10 - 1)) & 1) != 1) {
                    z8 = false;
                }
                a(z8);
                i10--;
            }
            return;
        }
        throw new IllegalArgumentException("Num bits must be between 0 and 32");
    }

    public final void c(int i9) {
        int[] iArr = this.b;
        if (i9 > (iArr.length << 5)) {
            int[] iArr2 = new int[(i9 + 31) / 32];
            System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
            this.b = iArr2;
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, D5.a] */
    public final Object clone() {
        int[] iArr = (int[]) this.b.clone();
        int i9 = this.f745c;
        ?? obj = new Object();
        obj.b = iArr;
        obj.f745c = i9;
        return obj;
    }

    public final boolean d(int i9) {
        if (((1 << (i9 & 31)) & this.b[i9 / 32]) != 0) {
            return true;
        }
        return false;
    }

    public final int e() {
        return (this.f745c + 7) / 8;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (this.f745c != aVar.f745c || !Arrays.equals(this.b, aVar.b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.b) + (this.f745c * 31);
    }

    public final String toString() {
        char c9;
        int i9 = this.f745c;
        StringBuilder sb = new StringBuilder((i9 / 8) + i9 + 1);
        for (int i10 = 0; i10 < this.f745c; i10++) {
            if ((i10 & 7) == 0) {
                sb.append(' ');
            }
            if (d(i10)) {
                c9 = 'X';
            } else {
                c9 = '.';
            }
            sb.append(c9);
        }
        return sb.toString();
    }
}
