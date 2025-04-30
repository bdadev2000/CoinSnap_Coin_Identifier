package O7;

import com.mbridge.msdk.playercommon.exoplayer2.C;

/* loaded from: classes3.dex */
public abstract class n extends m {
    public static final void u(String str) {
        throw new NumberFormatException("Invalid number format: '" + str + '\'');
    }

    public static Integer v(String str) {
        boolean z8;
        int i9;
        Integer valueOf;
        int i10;
        G7.j.e(str, "<this>");
        com.facebook.appevents.g.a(10);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i11 = 0;
        char charAt = str.charAt(0);
        int i12 = -2147483647;
        if (G7.j.f(charAt, 48) < 0) {
            i9 = 1;
            if (length == 1) {
                return null;
            }
            if (charAt == '-') {
                i12 = Integer.MIN_VALUE;
                z8 = true;
            } else {
                if (charAt != '+') {
                    return null;
                }
                z8 = false;
            }
        } else {
            z8 = false;
            i9 = 0;
        }
        int i13 = -59652323;
        while (i9 < length) {
            int digit = Character.digit((int) str.charAt(i9), 10);
            if (digit < 0) {
                return null;
            }
            if ((i11 < i13 && (i13 != -59652323 || i11 < (i13 = i12 / 10))) || (i10 = i11 * 10) < i12 + digit) {
                return null;
            }
            i11 = i10 - digit;
            i9++;
        }
        if (z8) {
            valueOf = Integer.valueOf(i11);
        } else {
            valueOf = Integer.valueOf(-i11);
        }
        return valueOf;
    }

    public static Long w(String str) {
        boolean z8;
        Long valueOf;
        G7.j.e(str, "<this>");
        com.facebook.appevents.g.a(10);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i9 = 0;
        char charAt = str.charAt(0);
        int f9 = G7.j.f(charAt, 48);
        long j7 = C.TIME_UNSET;
        if (f9 < 0) {
            z8 = true;
            if (length == 1) {
                return null;
            }
            if (charAt == '-') {
                j7 = Long.MIN_VALUE;
                i9 = 1;
            } else {
                if (charAt != '+') {
                    return null;
                }
                z8 = false;
                i9 = 1;
            }
        } else {
            z8 = false;
        }
        long j9 = -256204778801521550L;
        long j10 = 0;
        long j11 = -256204778801521550L;
        while (i9 < length) {
            int digit = Character.digit((int) str.charAt(i9), 10);
            if (digit < 0) {
                return null;
            }
            if (j10 < j11) {
                if (j11 != j9) {
                    return null;
                }
                j11 = j7 / 10;
                if (j10 < j11) {
                    return null;
                }
            }
            long j12 = j10 * 10;
            long j13 = digit;
            if (j12 < j7 + j13) {
                return null;
            }
            j10 = j12 - j13;
            i9++;
            j9 = -256204778801521550L;
        }
        if (z8) {
            valueOf = Long.valueOf(j10);
        } else {
            valueOf = Long.valueOf(-j10);
        }
        return valueOf;
    }
}
