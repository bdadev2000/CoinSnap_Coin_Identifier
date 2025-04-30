package x8;

import G7.j;
import w8.w;

/* loaded from: classes3.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static final char[] f24250a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    public static final int a(char c9) {
        if ('0' <= c9 && c9 <= '9') {
            return c9 - '0';
        }
        if ('a' <= c9 && c9 <= 'f') {
            return c9 - 'W';
        }
        if ('A' <= c9 && c9 <= 'F') {
            return c9 - '7';
        }
        throw new IllegalArgumentException(j.j(Character.valueOf(c9), "Unexpected hex digit: "));
    }

    public static final int b(w wVar, int i9) {
        int i10;
        j.e(wVar, "<this>");
        int i11 = i9 + 1;
        int length = wVar.f24049g.length;
        int[] iArr = wVar.f24050h;
        j.e(iArr, "<this>");
        int i12 = length - 1;
        int i13 = 0;
        while (true) {
            if (i13 <= i12) {
                i10 = (i13 + i12) >>> 1;
                int i14 = iArr[i10];
                if (i14 < i11) {
                    i13 = i10 + 1;
                } else {
                    if (i14 <= i11) {
                        break;
                    }
                    i12 = i10 - 1;
                }
            } else {
                i10 = (-i13) - 1;
                break;
            }
        }
        if (i10 < 0) {
            return ~i10;
        }
        return i10;
    }
}
