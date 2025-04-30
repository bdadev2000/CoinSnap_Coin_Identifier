package com.meta.analytics.dsp.uinode;

import android.content.Context;
import com.applovin.exoplayer2.common.base.Ascii;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: assets/audience_network.dex */
public abstract class LW {
    public static byte[] A00;
    public static final Pattern A01;

    public static String A02(int i9, int i10, int i11) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i9, i9 + i10);
        for (int i12 = 0; i12 < copyOfRange.length; i12++) {
            copyOfRange[i12] = (byte) ((copyOfRange[i12] ^ i11) ^ 124);
        }
        return new String(copyOfRange);
    }

    public static void A07() {
        A00 = new byte[]{89, 45, 2, 90, Ascii.DLE, 5, 45, 2, 90, 42, Ascii.DLE, 92, Ascii.VT, 95, 44, 90, 88, 42, 48, 92, 43, 44, 95, 91, 120, 78, 73, 73, 94, 85, 79, Ascii.ESC, 72, 79, 90, 88, 80, Ascii.ESC, 79, 73, 90, 88, 94, 33, 45, 47, 108, 36, 35, 33, 39, 32, 45, 45, 41, 108, 35, 38, 49};
    }

    static {
        A07();
        A01 = Pattern.compile(A02(0, 24, 13));
    }

    public static String A00() {
        return A06(new Exception(A02(24, 19, 71)), -1, -1, false);
    }

    public static String A01(int i9) {
        if (i9 <= 0) {
            return null;
        }
        float rate = new Random().nextFloat();
        if (rate >= 1.0f / i9) {
            return null;
        }
        return A00();
    }

    public static String A03(Context context, Throwable th) {
        int A0I = C1225Ih.A0I(context);
        int maxStacktraceLines = C1225Ih.A02(context);
        return A06(th, A0I, maxStacktraceLines, C1225Ih.A1G(context));
    }

    public static String A04(String str) {
        Matcher matcher = A01.matcher(str);
        if (matcher.matches()) {
            return matcher.group(1);
        }
        return str;
    }

    public static String A06(Throwable th, int i9, int i10, boolean z8) {
        String A02 = A02(0, 0, 122);
        if (th == null) {
            return A02;
        }
        try {
            C1530Uh c1530Uh = new C1530Uh();
            LU lu = c1530Uh;
            if (i10 >= 0) {
                lu = new C1528Uf(lu, i10);
            }
            if (i9 >= 0) {
                lu = new C1527Ue(lu, i9, i9);
            }
            if (z8) {
                lu = new C1529Ug(lu);
            }
            C1531Ui c1531Ui = new C1531Ui(c1530Uh, 1, lu);
            th.printStackTrace(new PrintWriter(new LV(c1531Ui)));
            c1531Ui.flush();
            return c1530Uh.toString();
        } catch (Exception unused) {
            return A02;
        }
    }

    public static boolean A08(LT lt) {
        String middle = lt.A02();
        if (middle == null) {
            return false;
        }
        if (A0A(middle)) {
            return true;
        }
        Iterator<String> it = lt.A01().iterator();
        while (it.hasNext()) {
            if (A0A(it.next())) {
                return true;
            }
        }
        Iterator<String> it2 = lt.A00().iterator();
        while (it2.hasNext()) {
            if (A0A(it2.next())) {
                return true;
            }
        }
        return false;
    }

    public static boolean A0A(String str) {
        return str.contains(A02(43, 16, 62));
    }
}
