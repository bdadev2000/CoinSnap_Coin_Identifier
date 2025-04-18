package com.facebook.ads.redexgen.uinode;

import android.content.SharedPreferences;
import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import com.applovin.exoplayer2.common.base.Ascii;
import com.facebook.ads.internal.protocol.AdPlacementType;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;

/* loaded from: assets/audience_network.dex */
public final class K1 {
    public static byte[] A0C;
    public static String[] A0D = {"D9utVieqpHmzq", "1reJ20tywIkt8c03XFg68iFkPgUpcQh9", "1hiVgm3FzyAWthqubctijKn7iSl8t7OZ", "2MGbhVYWK6vnLzanQZMPK5FLJbU6N2Mg", "tHlP6Jv5sj70nCQXOaNATx3kiWqPf1Tp", "kSrICwDX6P2QTtBsWrInLj9wi3Ca9feR", "Z5GcmA6HHHf7tKUPWv2sbOMAsuTj15Gl", "CZogAanemwBaq"};
    public int A00;
    public C03987f A01;
    public EnumC0680Jg A02;
    public LQ A03;
    public String A04;
    public String A05;
    public String A06;
    public String A07;
    public boolean A08;
    public final C8Z A09;
    public final AdPlacementType A0A;
    public final C0685Jl A0B;

    public static String A01(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A0C, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 87);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A0C = new byte[]{-69, -68, -91, -88, -61, -87, -68, -76, -87, -74, -83, -87, -78, -89, -87, -61, -72, -67, -76, -87, Ascii.DC2, Ascii.NAK, 48, 35, Ascii.SYN, 33, 32, 35, 37, Ascii.SUB, Ascii.US, Ascii.CAN, 48, Ascii.DC4, 32, Ascii.US, Ascii.ETB, Ascii.SUB, Ascii.CAN, 48, Ascii.GS, Ascii.DC2, 36, 37, 48, 38, 33, Ascii.NAK, Ascii.DC2, 37, Ascii.SYN, 48, 37, Ascii.SUB, Ascii.RS, Ascii.SYN, 10, 17, Ascii.FF, 39, 17, Ascii.FF, -32, -25, -30, -3, -14, -25, -21, -29, -3, -14, -19, -23, -29, -20, -29, -20, -23, -27, -18, -12, -1, -14, -27, -15, -11, -27, -13, -12, -1, -23, -28, -73, -61, -60, -60, -75, -50, -49, -41, -39, -23, -53, -50, -23, -45, -50, Ascii.VT, Ascii.RS, Ascii.SUB, Ascii.CAN, 7, 37, Ascii.SO, Ascii.SI, Ascii.DC4, Ascii.SUB, Ascii.EM, -16, -19, -15, -17, -16, -4, -5, -10, -8, -13, -65, -70, -68, -73, -43, -68, -62, -73, -67, -4, 6, Ascii.DC2, 0, 8, -1, 7, -4, Ascii.DC2, -12, -9, Ascii.DC2, -8, Ascii.VT, 3, -8, 5, -4, -8, 1, -10, -8, -14, -18, 6, -7, -20, -6, -5, -7, -16, -22, -5, -20, -21, -43, -54, -36, -35, -24, -36, -54, -33, -50, -51, -24, -43, -40, -52, -54, -43, -50, Ascii.SYN, Ascii.GS, Ascii.NAK, 39, 9, Ascii.FF, Ascii.ESC, 39, Ascii.SUB, Ascii.CR, Ascii.EM, Ascii.GS, Ascii.CR, Ascii.ESC, Ascii.FS, Ascii.CR, Ascii.FF, -86, -90, -101, -99, -97, -89, -97, -88, -82, -71, -93, -98, -59, -63, -74, -72, -70, -62, -70, -61, -55, -44, -55, -50, -59, -70, 39, Ascii.SUB, 38, 42, Ascii.SUB, 40, 41, 52, 41, Ascii.RS, 34, Ascii.SUB, Ascii.FS, Ascii.GS, 10, Ascii.FF, Ascii.DC4, 40, Ascii.GS, Ascii.ESC, 10, Ascii.FF, Ascii.SO, -49, -64, -56, -53, -57, -68, -49, -64, -38, -60, -65, Ascii.SO, -1, Ascii.CR, Ascii.SO, Ascii.EM, 7, 9, -2, -1, -30, -44, -49, -33, -45};
    }

    static {
        A02();
    }

    public K1(C03987f c03987f, String str, LQ lq, EnumC0680Jg enumC0680Jg, int i10, C0685Jl c0685Jl, String str2, String str3, String str4, C8Z c8z) {
        this.A01 = c03987f;
        this.A06 = str;
        this.A03 = lq;
        this.A02 = enumC0680Jg;
        this.A00 = i10;
        this.A0B = c0685Jl;
        this.A0A = enumC0680Jg.A04();
        this.A07 = str2;
        this.A05 = str3;
        this.A04 = str4;
        this.A09 = c8z;
    }

    private long A00() {
        SharedPreferences A00 = KE.A00(this.A01);
        String A01 = A01(0, 0, 83);
        String A012 = A01(173, 17, 50);
        String string = A00.getString(A012, A01);
        if (string == null) {
            return 0L;
        }
        String locale = Locale.getDefault().toString();
        if (A0D[5].length() != 32) {
            throw new RuntimeException();
        }
        String[] strArr = A0D;
        strArr[7] = "UbRIo10SAcnK0";
        strArr[0] = "rMKDtS17rDD7f";
        if (string.equals(locale)) {
            return C2T.A00(this.A01.A01()).A09();
        }
        A00.edit().putString(A012, Locale.getDefault().toString()).apply();
        return 0L;
    }

    private void A03(Map<String, String> params, String str, String str2) {
        params.put(str, str2);
    }

    public final int A04() {
        return this.A00;
    }

    public final C8Z A05() {
        return this.A09;
    }

    public final EnumC0680Jg A06() {
        return this.A02;
    }

    public final LQ A07() {
        return this.A03;
    }

    public final String A08() {
        return this.A06;
    }

    public final Map<String, String> A09(Map<String, String> map) {
        String A01;
        HashMap hashMap = new HashMap(map);
        A03(hashMap, A01(125, 4, 91), C6E.A00().A03());
        if (C6E.A00().A04()) {
            A01 = A01(0, 1, 52);
        } else {
            A01 = A01(1, 1, 52);
        }
        A03(hashMap, A01(129, 9, 31), A01);
        A03(hashMap, A01(93, 5, 29), String.valueOf(this.A09.A99()));
        String idfaFlag = A01(207, 12, 3);
        A03(hashMap, idfaFlag, this.A06);
        if (this.A0A != AdPlacementType.UNKNOWN) {
            A03(hashMap, A01(219, 14, 30), this.A0A.toString().toLowerCase());
        }
        LQ lq = this.A03;
        if (lq != null) {
            A03(hashMap, A01(276, 5, 52), String.valueOf(lq.A01()));
            A03(hashMap, A01(119, 6, 81), String.valueOf(this.A03.A00()));
        }
        EnumC0680Jg enumC0680Jg = this.A02;
        if (enumC0680Jg != null) {
            A03(hashMap, A01(NotificationCompat.FLAG_LOCAL_ONLY, 11, 36), String.valueOf(enumC0680Jg.A03()));
        }
        C8Z c8z = this.A09;
        C03987f c03987f = this.A01;
        String[] strArr = A0D;
        String idfaFlag2 = strArr[1];
        if (idfaFlag2.charAt(22) == strArr[3].charAt(22)) {
            String[] strArr2 = A0D;
            strArr2[1] = "IzDezfH0vo2hFBj3g0HaogFvU1PF9PgW";
            strArr2[3] = "07eFZyxYDfzIdCogAj5SagFmNdTPnXPY";
            if (c8z.isTestMode(c03987f)) {
                String A012 = A01(267, 9, 99);
                String A013 = A01(1, 1, 52);
                String[] strArr3 = A0D;
                String idfaFlag3 = strArr3[7];
                if (idfaFlag3.length() == strArr3[0].length()) {
                    A0D[5] = "fhkQkDUQCs0vTSuMh05aUEfBswduYuq5";
                    A03(hashMap, A012, A013);
                }
            }
            if (this.A09.A87() != null) {
                A03(hashMap, A01(98, 10, 51), this.A09.A87());
            }
            int i10 = this.A00;
            if (i10 != 0) {
                String idfaFlag4 = A01(190, 17, 113);
                A03(hashMap, idfaFlag4, String.valueOf(i10));
            }
            boolean z10 = this.A08;
            if (z10) {
                String idfaFlag5 = A01(138, 22, 92);
                A03(hashMap, idfaFlag5, String.valueOf(z10));
            }
            A03(hashMap, A01(160, 13, 80), String.valueOf(C0738Lp.A02(this.A01)));
            A03(hashMap, A01(233, 12, 126), C0728Lf.A05(System.currentTimeMillis()));
            if (this.A0B.A06() && this.A0B.A04() != null) {
                A03(hashMap, A01(56, 6, 113), this.A0B.A04());
            }
            String A05 = this.A0B.A05();
            if (!TextUtils.isEmpty(A05)) {
                A03(hashMap, A01(62, 14, 71), A05);
            }
            String str = this.A07;
            if (str != null) {
                A03(hashMap, A01(245, 11, 114), str);
            }
            A03(hashMap, A01(76, 17, 73), UUID.randomUUID().toString());
            A03(hashMap, A01(20, 36, 122), C0728Lf.A06(A00()));
            String str2 = this.A05;
            if (str2 != null) {
                A03(hashMap, A01(108, 11, 111), str2);
            }
            String str3 = this.A04;
            if (str3 != null) {
                if (A0D[5].length() == 32) {
                    String[] strArr4 = A0D;
                    strArr4[1] = "oug9irQjulGDcN1zjjec1oFwPujMP8yb";
                    strArr4[3] = "P1fPvVUp9X55Q5Xl2H8DBdFxzWSw3WjN";
                    A03(hashMap, A01(2, 18, 13), str3);
                }
            }
            return hashMap;
        }
        throw new RuntimeException();
    }
}
