package H5;

import java.util.EnumMap;
import x0.AbstractC2914a;

/* loaded from: classes3.dex */
public final class g extends y8.a {

    /* renamed from: c, reason: collision with root package name */
    public static final int[] f1385c = {1, 1, 1, 1};

    /* renamed from: d, reason: collision with root package name */
    public static final int[] f1386d = {3, 1, 1};

    /* renamed from: f, reason: collision with root package name */
    public static final int[][] f1387f = {new int[]{1, 1, 3, 3, 1}, new int[]{3, 1, 1, 1, 3}, new int[]{1, 3, 1, 1, 3}, new int[]{3, 3, 1, 1, 1}, new int[]{1, 1, 3, 1, 3}, new int[]{3, 1, 3, 1, 1}, new int[]{1, 3, 3, 1, 1}, new int[]{1, 1, 1, 3, 3}, new int[]{3, 1, 1, 3, 1}, new int[]{1, 3, 1, 3, 1}};
    public final /* synthetic */ int b;

    public /* synthetic */ g(int i9) {
        this.b = i9;
    }

    public static int A(int i9, String str) {
        int i10 = 0;
        int i11 = 1;
        for (int length = str.length() - 1; length >= 0; length--) {
            i10 += "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%abcd*".indexOf(str.charAt(length)) * i11;
            i11++;
            if (i11 > i9) {
                i11 = 1;
            }
        }
        return i10 % 47;
    }

    public static int B(CharSequence charSequence, int i9) {
        int length = charSequence.length();
        int i10 = 1;
        if (i9 >= length) {
            return 1;
        }
        char charAt = charSequence.charAt(i9);
        if (charAt == 241) {
            return 4;
        }
        if (charAt >= '0' && charAt <= '9') {
            int i11 = i9 + 1;
            i10 = 2;
            if (i11 >= length) {
                return 2;
            }
            char charAt2 = charSequence.charAt(i11);
            if (charAt2 >= '0' && charAt2 <= '9') {
                return 3;
            }
        }
        return i10;
    }

    public static void C(int i9, int[] iArr) {
        for (int i10 = 0; i10 < 9; i10++) {
            int i11 = 1;
            if (((1 << (8 - i10)) & i9) != 0) {
                i11 = 2;
            }
            iArr[i10] = i11;
        }
    }

    public static void D(int i9, int[] iArr) {
        for (int i10 = 0; i10 < 9; i10++) {
            int i11 = 1;
            if (((1 << (8 - i10)) & i9) == 0) {
                i11 = 0;
            }
            iArr[i10] = i11;
        }
    }

    public static void z(boolean[] zArr, int i9, int[] iArr) {
        boolean z8;
        int length = iArr.length;
        int i10 = 0;
        while (i10 < length) {
            int i11 = i9 + 1;
            if (iArr[i10] != 0) {
                z8 = true;
            } else {
                z8 = false;
            }
            zArr[i9] = z8;
            i10++;
            i9 = i11;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:185:0x0295, code lost:
    
        if (B(r1, r6 + 3) == 3) goto L135;
     */
    /* JADX WARN: Code restructure failed: missing block: B:186:0x0297, code lost:
    
        r15 = 99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:192:0x02a5, code lost:
    
        if (r13 == 2) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:195:0x02b0, code lost:
    
        if (r12 == 3) goto L135;
     */
    /* JADX WARN: Removed duplicated region for block: B:136:0x02b5  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x030c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:148:0x024d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:159:0x02f1  */
    @Override // y8.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean[] g(java.lang.String r17) {
        /*
            Method dump skipped, instructions count: 1016
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: H5.g.g(java.lang.String):boolean[]");
    }

    @Override // y8.a, A5.d
    public final D5.b n(String str, int i9, EnumMap enumMap) {
        switch (this.b) {
            case 0:
                if (i9 == 9) {
                    return super.n(str, i9, enumMap);
                }
                throw new IllegalArgumentException("Can only encode ITF, but got ".concat(AbstractC2914a.m(i9)));
            case 1:
                if (i9 == 5) {
                    return super.n(str, i9, enumMap);
                }
                throw new IllegalArgumentException("Can only encode CODE_128, but got ".concat(AbstractC2914a.m(i9)));
            case 2:
                if (i9 == 3) {
                    return super.n(str, i9, enumMap);
                }
                throw new IllegalArgumentException("Can only encode CODE_39, but got ".concat(AbstractC2914a.m(i9)));
            default:
                if (i9 == 4) {
                    return super.n(str, i9, enumMap);
                }
                throw new IllegalArgumentException("Can only encode CODE_93, but got ".concat(AbstractC2914a.m(i9)));
        }
    }
}
