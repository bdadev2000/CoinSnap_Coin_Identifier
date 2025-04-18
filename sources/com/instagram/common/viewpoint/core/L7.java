package com.instagram.common.viewpoint.core;

import android.text.TextUtils;
import com.google.common.primitives.UnsignedBytes;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.objectweb.asm.Opcodes;

/* loaded from: assets/audience_network.dex */
public final class L7 {
    public static boolean A00;
    public static boolean A01;
    public static byte[] A02;
    public static final Map<String, String> A03;

    public static String A00(int i2, int i3, int i4) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i2, i2 + i3);
        for (int i5 = 0; i5 < copyOfRange.length; i5++) {
            copyOfRange[i5] = (byte) ((copyOfRange[i5] - i4) - 29);
        }
        return new String(copyOfRange);
    }

    public static void A03() {
        A02 = new byte[]{-10, -14, -66, -11, -62, -11, -66, -76, -80, 124, -64, -61, -68, -68, -73, -68, -75, -83, -77, UnsignedBytes.MAX_POWER_OF_TWO, -77, -84, -86, -83, -99};
    }

    static {
        A03();
        A01 = false;
        A00 = false;
        A03 = Collections.synchronizedMap(new HashMap());
    }

    public static synchronized String A01(String str) {
        synchronized (L7.class) {
            if (!A04()) {
                return null;
            }
            return System.getProperty(A00(0, 7, Opcodes.DREM) + str);
        }
    }

    public static Map<String, String> A02() {
        if (!A04()) {
            return Collections.emptyMap();
        }
        return A03;
    }

    public static synchronized boolean A04() {
        boolean z2;
        synchronized (L7.class) {
            if (!A00) {
                A01 = A00(21, 4, 27).equals(System.getProperty(A00(7, 14, 49)));
                A00 = true;
            }
            z2 = A01;
        }
        return z2;
    }

    public static synchronized boolean A05(String str) {
        boolean z2;
        synchronized (L7.class) {
            z2 = !TextUtils.isEmpty(A01(str));
        }
        return z2;
    }
}
