package fd;

import java.util.Map;

/* loaded from: classes4.dex */
public final class d extends s.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f17803b;

    public /* synthetic */ d(int i10) {
        this.f17803b = i10;
    }

    public static void r(boolean[] zArr, int i10, int[] iArr) {
        boolean z10;
        int length = iArr.length;
        int i11 = 0;
        while (i11 < length) {
            int i12 = i10 + 1;
            if (iArr[i11] != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            zArr[i10] = z10;
            i11++;
            i10 = i12;
        }
    }

    public static int s(int i10, String str) {
        int i11 = 0;
        int i12 = 1;
        for (int length = str.length() - 1; length >= 0; length--) {
            i11 += "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%abcd*".indexOf(str.charAt(length)) * i12;
            i12++;
            if (i12 > i10) {
                i12 = 1;
            }
        }
        return i11 % 47;
    }

    public static int t(int i10, CharSequence charSequence) {
        int length = charSequence.length();
        int i11 = 1;
        if (i10 >= length) {
            return 1;
        }
        char charAt = charSequence.charAt(i10);
        if (charAt == 241) {
            return 4;
        }
        if (charAt >= '0' && charAt <= '9') {
            int i12 = i10 + 1;
            i11 = 2;
            if (i12 >= length) {
                return 2;
            }
            char charAt2 = charSequence.charAt(i12);
            if (charAt2 >= '0' && charAt2 <= '9') {
                return 3;
            }
        }
        return i11;
    }

    public static void u(int i10, int[] iArr) {
        for (int i11 = 0; i11 < 9; i11++) {
            int i12 = 1;
            if (((1 << (8 - i11)) & i10) != 0) {
                i12 = 2;
            }
            iArr[i11] = i12;
        }
    }

    public static void v(int i10, int[] iArr) {
        for (int i11 = 0; i11 < 9; i11++) {
            int i12 = 1;
            if (((1 << (8 - i11)) & i10) == 0) {
                i12 = 0;
            }
            iArr[i11] = i12;
        }
    }

    @Override // s.a, ad.e
    public final cd.b c(String str, ad.a aVar, int i10, int i11, Map map) {
        switch (this.f17803b) {
            case 0:
                if (aVar == ad.a.CODE_128) {
                    return super.c(str, aVar, i10, i11, map);
                }
                throw new IllegalArgumentException("Can only encode CODE_128, but got ".concat(String.valueOf(aVar)));
            case 1:
                if (aVar == ad.a.CODE_39) {
                    return super.c(str, aVar, i10, i11, map);
                }
                throw new IllegalArgumentException("Can only encode CODE_39, but got ".concat(String.valueOf(aVar)));
            default:
                if (aVar == ad.a.CODE_93) {
                    return super.c(str, aVar, i10, i11, map);
                }
                throw new IllegalArgumentException("Can only encode CODE_93, but got ".concat(String.valueOf(aVar)));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:168:0x021a, code lost:
    
        if (t(r6 + 3, r15) == 3) goto L131;
     */
    /* JADX WARN: Code restructure failed: missing block: B:169:0x0235, code lost:
    
        r5 = 99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:175:0x0228, code lost:
    
        if (r13 == 2) goto L132;
     */
    /* JADX WARN: Code restructure failed: missing block: B:178:0x0233, code lost:
    
        if (r10 == 3) goto L131;
     */
    /* JADX WARN: Removed duplicated region for block: B:128:0x023b  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x028f  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0291 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0274  */
    @Override // s.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean[] h(java.lang.String r15) {
        /*
            Method dump skipped, instructions count: 906
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: fd.d.h(java.lang.String):boolean[]");
    }
}
