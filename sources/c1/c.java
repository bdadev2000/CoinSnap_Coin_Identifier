package C1;

import java.util.Arrays;
import w4.v0;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final float[] f425a;
    public final int[] b;

    public c(float[] fArr, int[] iArr) {
        this.f425a = fArr;
        this.b = iArr;
    }

    public final void a(c cVar) {
        int i9 = 0;
        while (true) {
            int[] iArr = cVar.b;
            if (i9 < iArr.length) {
                this.f425a[i9] = cVar.f425a[i9];
                this.b[i9] = iArr[i9];
                i9++;
            } else {
                return;
            }
        }
    }

    public final c b(float[] fArr) {
        int k6;
        int[] iArr = new int[fArr.length];
        for (int i9 = 0; i9 < fArr.length; i9++) {
            float f9 = fArr[i9];
            float[] fArr2 = this.f425a;
            int binarySearch = Arrays.binarySearch(fArr2, f9);
            int[] iArr2 = this.b;
            if (binarySearch >= 0) {
                k6 = iArr2[binarySearch];
            } else {
                int i10 = -(binarySearch + 1);
                if (i10 == 0) {
                    k6 = iArr2[0];
                } else if (i10 == iArr2.length - 1) {
                    k6 = iArr2[iArr2.length - 1];
                } else {
                    int i11 = i10 - 1;
                    float f10 = fArr2[i11];
                    k6 = v0.k((f9 - f10) / (fArr2[i10] - f10), iArr2[i11], iArr2[i10]);
                }
            }
            iArr[i9] = k6;
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
        if (Arrays.equals(this.f425a, cVar.f425a) && Arrays.equals(this.b, cVar.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.b) + (Arrays.hashCode(this.f425a) * 31);
    }
}
