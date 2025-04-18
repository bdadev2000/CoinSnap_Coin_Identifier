package t3;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class c {
    public final float[] a;

    /* renamed from: b, reason: collision with root package name */
    public final int[] f25195b;

    public c(float[] fArr, int[] iArr) {
        this.a = fArr;
        this.f25195b = iArr;
    }

    public final void a(c cVar) {
        int i10 = 0;
        while (true) {
            int[] iArr = cVar.f25195b;
            if (i10 < iArr.length) {
                this.a[i10] = cVar.a[i10];
                this.f25195b[i10] = iArr[i10];
                i10++;
            } else {
                return;
            }
        }
    }

    public final c b(float[] fArr) {
        int n10;
        int[] iArr = new int[fArr.length];
        for (int i10 = 0; i10 < fArr.length; i10++) {
            float f10 = fArr[i10];
            float[] fArr2 = this.a;
            int binarySearch = Arrays.binarySearch(fArr2, f10);
            int[] iArr2 = this.f25195b;
            if (binarySearch >= 0) {
                n10 = iArr2[binarySearch];
            } else {
                int i11 = -(binarySearch + 1);
                if (i11 == 0) {
                    n10 = iArr2[0];
                } else if (i11 == iArr2.length - 1) {
                    n10 = iArr2[iArr2.length - 1];
                } else {
                    int i12 = i11 - 1;
                    float f11 = fArr2[i12];
                    n10 = d6.g.n((f10 - f11) / (fArr2[i11] - f11), iArr2[i12], iArr2[i11]);
                }
            }
            iArr[i10] = n10;
        }
        return new c(fArr, iArr);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || c.class != obj.getClass()) {
            return false;
        }
        c cVar = (c) obj;
        if (Arrays.equals(this.a, cVar.a) && Arrays.equals(this.f25195b, cVar.f25195b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f25195b) + (Arrays.hashCode(this.a) * 31);
    }
}
