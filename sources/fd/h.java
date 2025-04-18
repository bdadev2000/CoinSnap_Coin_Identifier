package fd;

import java.util.Map;

/* loaded from: classes4.dex */
public final class h extends s.a {

    /* renamed from: b, reason: collision with root package name */
    public static final int[] f17808b = {1, 1, 1, 1};

    /* renamed from: c, reason: collision with root package name */
    public static final int[] f17809c = {3, 1, 1};

    /* renamed from: d, reason: collision with root package name */
    public static final int[][] f17810d = {new int[]{1, 1, 3, 3, 1}, new int[]{3, 1, 1, 1, 3}, new int[]{1, 3, 1, 1, 3}, new int[]{3, 3, 1, 1, 1}, new int[]{1, 1, 3, 1, 3}, new int[]{3, 1, 3, 1, 1}, new int[]{1, 3, 3, 1, 1}, new int[]{1, 1, 1, 3, 3}, new int[]{3, 1, 1, 3, 1}, new int[]{1, 3, 1, 3, 1}};

    @Override // s.a, ad.e
    public final cd.b c(String str, ad.a aVar, int i10, int i11, Map map) {
        if (aVar == ad.a.ITF) {
            return super.c(str, aVar, i10, i11, map);
        }
        throw new IllegalArgumentException("Can only encode ITF, but got ".concat(String.valueOf(aVar)));
    }

    @Override // s.a
    public final boolean[] h(String str) {
        int length = str.length();
        if (length % 2 == 0) {
            if (length <= 80) {
                boolean[] zArr = new boolean[(length * 9) + 9];
                int a = s.a.a(zArr, 0, f17808b, true);
                for (int i10 = 0; i10 < length; i10 += 2) {
                    int digit = Character.digit(str.charAt(i10), 10);
                    int digit2 = Character.digit(str.charAt(i10 + 1), 10);
                    int[] iArr = new int[10];
                    for (int i11 = 0; i11 < 5; i11++) {
                        int i12 = i11 * 2;
                        int[][] iArr2 = f17810d;
                        iArr[i12] = iArr2[digit][i11];
                        iArr[i12 + 1] = iArr2[digit2][i11];
                    }
                    a += s.a.a(zArr, a, iArr, true);
                }
                s.a.a(zArr, a, f17809c, true);
                return zArr;
            }
            throw new IllegalArgumentException("Requested contents should be less than 80 digits long, but got ".concat(String.valueOf(length)));
        }
        throw new IllegalArgumentException("The length of the input should be even");
    }
}
