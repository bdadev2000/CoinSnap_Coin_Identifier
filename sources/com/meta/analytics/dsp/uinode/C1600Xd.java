package com.meta.analytics.dsp.uinode;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.Xd, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1600Xd extends C6 {
    public static byte[] A01;
    public static String[] A02 = {"lkUmj0P9ANZweJy", "AYR", "2bCiSP20yUx8Jjv69HyX94pfkMFX1Tn5", "GuptQSCxLEDTiFK9bPX0ljmbSmBcx9xx", "QILfBos", "yeLNYaj", "n8HrTtIUehfoTgx", "xV0sp6lxPyztL8QZzt7llBh4QSI4V12v"};
    public long A00;

    public static String A04(int i9, int i10, int i11) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i9, i9 + i10);
        for (int i12 = 0; i12 < copyOfRange.length; i12++) {
            byte b = (byte) ((copyOfRange[i12] - i11) - 31);
            String[] strArr = A02;
            if (strArr[3].charAt(7) != strArr[7].charAt(7)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A02;
            strArr2[3] = "WF1W4nbxyUcfRBlDsHDD1CgmrC98ElX3";
            strArr2[7] = "aIs3tFZxis4srcfFD6vTbXobqrKXyR4d";
            copyOfRange[i12] = b;
        }
        return new String(copyOfRange);
    }

    public static void A0A() {
        A01 = new byte[]{-40, -23, -26, -43, -24, -35, -29, -30, 5, 4, -29, -5, 10, -9, -38, -9, 10, -9};
    }

    static {
        A0A();
    }

    public C1600Xd() {
        super(null);
        this.A00 = C.TIME_UNSET;
    }

    public static int A00(C1217Hz c1217Hz) {
        return c1217Hz.A0E();
    }

    public static Boolean A01(C1217Hz c1217Hz) {
        return Boolean.valueOf(c1217Hz.A0E() == 1);
    }

    public static Double A02(C1217Hz c1217Hz) {
        return Double.valueOf(Double.longBitsToDouble(c1217Hz.A0L()));
    }

    public static Object A03(C1217Hz c1217Hz, int i9) {
        switch (i9) {
            case 0:
                return A02(c1217Hz);
            case 1:
                return A01(c1217Hz);
            case 2:
                return A05(c1217Hz);
            case 3:
                return A09(c1217Hz);
            case 4:
            case 5:
            case 6:
            case 7:
            case 9:
            default:
                String[] strArr = A02;
                if (strArr[3].charAt(7) == strArr[7].charAt(7)) {
                    A02[2] = "Zl5TZ6M60aHBYOe9FM2F5W6f579JKUNd";
                    return null;
                }
                break;
            case 8:
                HashMap<String, Object> A08 = A08(c1217Hz);
                String[] strArr2 = A02;
                if (strArr2[0].length() == strArr2[6].length()) {
                    String[] strArr3 = A02;
                    strArr3[0] = "AtnlLuJZPUjXwht";
                    strArr3[6] = "kJYayAh32s2xp3N";
                    return A08;
                }
                break;
            case 10:
                return A06(c1217Hz);
            case 11:
                return A07(c1217Hz);
        }
        throw new RuntimeException();
    }

    public static String A05(C1217Hz c1217Hz) {
        int A0I = c1217Hz.A0I();
        int A06 = c1217Hz.A06();
        c1217Hz.A0Z(A0I);
        return new String(c1217Hz.A00, A06, A0I);
    }

    public static ArrayList<Object> A06(C1217Hz c1217Hz) {
        int A0H = c1217Hz.A0H();
        ArrayList<Object> arrayList = new ArrayList<>(A0H);
        for (int i9 = 0; i9 < A0H; i9++) {
            int count = A00(c1217Hz);
            arrayList.add(A03(c1217Hz, count));
        }
        return arrayList;
    }

    public static Date A07(C1217Hz c1217Hz) {
        Date date = new Date((long) A02(c1217Hz).doubleValue());
        c1217Hz.A0Z(2);
        return date;
    }

    public static HashMap<String, Object> A08(C1217Hz c1217Hz) {
        int A0H = c1217Hz.A0H();
        HashMap<String, Object> hashMap = new HashMap<>(A0H);
        for (int i9 = 0; i9 < A0H; i9++) {
            String A05 = A05(c1217Hz);
            int count = A00(c1217Hz);
            hashMap.put(A05, A03(c1217Hz, count));
        }
        return hashMap;
    }

    public static HashMap<String, Object> A09(C1217Hz c1217Hz) {
        HashMap<String, Object> hashMap = new HashMap<>();
        while (true) {
            String A05 = A05(c1217Hz);
            int A00 = A00(c1217Hz);
            if (A00 == 9) {
                return hashMap;
            }
            hashMap.put(A05, A03(c1217Hz, A00));
        }
    }

    @Override // com.meta.analytics.dsp.uinode.C6
    public final void A0B(C1217Hz c1217Hz, long j7) throws C10259v {
        if (A00(c1217Hz) == 2) {
            if (!A04(8, 10, 119).equals(A05(c1217Hz)) || A00(c1217Hz) != 8) {
                return;
            }
            Map<String, Object> metadata = A08(c1217Hz);
            String name = A04(0, 8, 85);
            if (metadata.containsKey(name)) {
                double durationSeconds = ((Double) metadata.get(name)).doubleValue();
                if (durationSeconds > 0.0d) {
                    this.A00 = (long) (1000000.0d * durationSeconds);
                    return;
                }
                return;
            }
            return;
        }
        throw new C10259v();
    }

    @Override // com.meta.analytics.dsp.uinode.C6
    public final boolean A0C(C1217Hz c1217Hz) {
        return true;
    }

    public final long A0D() {
        return this.A00;
    }
}
