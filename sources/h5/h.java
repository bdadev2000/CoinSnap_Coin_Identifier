package H5;

import y2.AbstractC2947c;

/* loaded from: classes3.dex */
public abstract class h extends AbstractC2947c {
    public static final int[] b = {1, 1, 1};

    /* renamed from: c, reason: collision with root package name */
    public static final int[] f1388c = {1, 1, 1, 1, 1};

    /* renamed from: d, reason: collision with root package name */
    public static final int[] f1389d = {1, 1, 1, 1, 1, 1};

    /* renamed from: e, reason: collision with root package name */
    public static final int[][] f1390e;

    /* renamed from: f, reason: collision with root package name */
    public static final int[][] f1391f;

    static {
        int[][] iArr = {new int[]{3, 2, 1, 1}, new int[]{2, 2, 2, 1}, new int[]{2, 1, 2, 2}, new int[]{1, 4, 1, 1}, new int[]{1, 1, 3, 2}, new int[]{1, 2, 3, 1}, new int[]{1, 1, 1, 4}, new int[]{1, 3, 1, 2}, new int[]{1, 2, 1, 3}, new int[]{3, 1, 1, 2}};
        f1390e = iArr;
        int[][] iArr2 = new int[20];
        f1391f = iArr2;
        System.arraycopy(iArr, 0, iArr2, 0, 10);
        for (int i9 = 10; i9 < 20; i9++) {
            int[] iArr3 = f1390e[i9 - 10];
            int[] iArr4 = new int[iArr3.length];
            for (int i10 = 0; i10 < iArr3.length; i10++) {
                iArr4[i10] = iArr3[(iArr3.length - i10) - 1];
            }
            f1391f[i9] = iArr4;
        }
    }

    public static int A(CharSequence charSequence) {
        int length = charSequence.length();
        int i9 = 0;
        for (int i10 = length - 1; i10 >= 0; i10 -= 2) {
            int charAt = charSequence.charAt(i10) - '0';
            if (charAt >= 0 && charAt <= 9) {
                i9 += charAt;
            } else {
                A5.b bVar = A5.b.f74d;
                if (A5.c.b) {
                    throw new Exception();
                }
                throw A5.b.f74d;
            }
        }
        int i11 = i9 * 3;
        for (int i12 = length - 2; i12 >= 0; i12 -= 2) {
            int charAt2 = charSequence.charAt(i12) - '0';
            if (charAt2 >= 0 && charAt2 <= 9) {
                i11 += charAt2;
            } else {
                A5.b bVar2 = A5.b.f74d;
                if (A5.c.b) {
                    throw new Exception();
                }
                throw A5.b.f74d;
            }
        }
        return (1000 - i11) % 10;
    }

    public static boolean z(CharSequence charSequence) {
        int length = charSequence.length();
        if (length == 0) {
            return false;
        }
        int i9 = length - 1;
        if (A(charSequence.subSequence(0, i9)) != Character.digit(charSequence.charAt(i9), 10)) {
            return false;
        }
        return true;
    }
}
