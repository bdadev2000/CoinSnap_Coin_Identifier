package z0;

/* loaded from: classes3.dex */
public abstract class j extends i {
    public static Integer J0(String str) {
        boolean z2;
        int i2;
        int i3;
        p0.a.s(str, "<this>");
        p0.a.u(10);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i4 = 0;
        char charAt = str.charAt(0);
        int i5 = -2147483647;
        if (p0.a.E(charAt, 48) < 0) {
            i2 = 1;
            if (length == 1) {
                return null;
            }
            if (charAt == '-') {
                i5 = Integer.MIN_VALUE;
                z2 = true;
            } else {
                if (charAt != '+') {
                    return null;
                }
                z2 = false;
            }
        } else {
            z2 = false;
            i2 = 0;
        }
        int i6 = -59652323;
        while (i2 < length) {
            int digit = Character.digit((int) str.charAt(i2), 10);
            if (digit < 0) {
                return null;
            }
            if ((i4 < i6 && (i6 != -59652323 || i4 < (i6 = i5 / 10))) || (i3 = i4 * 10) < i5 + digit) {
                return null;
            }
            i4 = i3 - digit;
            i2++;
        }
        return z2 ? Integer.valueOf(i4) : Integer.valueOf(-i4);
    }

    public static Long K0(String str) {
        boolean z2;
        p0.a.s(str, "<this>");
        p0.a.u(10);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i2 = 0;
        char charAt = str.charAt(0);
        long j2 = -9223372036854775807L;
        if (p0.a.E(charAt, 48) < 0) {
            z2 = true;
            if (length == 1) {
                return null;
            }
            if (charAt == '-') {
                j2 = Long.MIN_VALUE;
                i2 = 1;
            } else {
                if (charAt != '+') {
                    return null;
                }
                z2 = false;
                i2 = 1;
            }
        } else {
            z2 = false;
        }
        long j3 = -256204778801521550L;
        long j4 = 0;
        long j5 = -256204778801521550L;
        while (i2 < length) {
            int digit = Character.digit((int) str.charAt(i2), 10);
            if (digit < 0) {
                return null;
            }
            if (j4 < j5) {
                if (j5 != j3) {
                    return null;
                }
                j5 = j2 / 10;
                if (j4 < j5) {
                    return null;
                }
            }
            long j6 = j4 * 10;
            long j7 = digit;
            if (j6 < j2 + j7) {
                return null;
            }
            j4 = j6 - j7;
            i2++;
            j3 = -256204778801521550L;
        }
        return z2 ? Long.valueOf(j4) : Long.valueOf(-j4);
    }
}
