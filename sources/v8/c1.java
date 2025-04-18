package v8;

import java.util.Arrays;
import java.util.Random;

/* loaded from: classes3.dex */
public final class c1 {
    public final Random a;

    /* renamed from: b, reason: collision with root package name */
    public final int[] f26083b;

    /* renamed from: c, reason: collision with root package name */
    public final int[] f26084c;

    public c1() {
        this(new Random());
    }

    public final c1 a(int i10, int i11) {
        Random random;
        int[] iArr;
        int[] iArr2 = new int[i11];
        int[] iArr3 = new int[i11];
        int i12 = 0;
        while (true) {
            random = this.a;
            iArr = this.f26083b;
            if (i12 >= i11) {
                break;
            }
            iArr2[i12] = random.nextInt(iArr.length + 1);
            int i13 = i12 + 1;
            int nextInt = random.nextInt(i13);
            iArr3[i12] = iArr3[nextInt];
            iArr3[nextInt] = i12 + i10;
            i12 = i13;
        }
        Arrays.sort(iArr2);
        int[] iArr4 = new int[iArr.length + i11];
        int i14 = 0;
        int i15 = 0;
        for (int i16 = 0; i16 < iArr.length + i11; i16++) {
            if (i14 < i11 && i15 == iArr2[i14]) {
                iArr4[i16] = iArr3[i14];
                i14++;
            } else {
                int i17 = i15 + 1;
                int i18 = iArr[i15];
                iArr4[i16] = i18;
                if (i18 >= i10) {
                    iArr4[i16] = i18 + i11;
                }
                i15 = i17;
            }
        }
        return new c1(iArr4, new Random(random.nextLong()));
    }

    public c1(Random random) {
        this(new int[0], random);
    }

    public c1(int[] iArr, Random random) {
        this.f26083b = iArr;
        this.a = random;
        this.f26084c = new int[iArr.length];
        for (int i10 = 0; i10 < iArr.length; i10++) {
            this.f26084c[iArr[i10]] = i10;
        }
    }
}
