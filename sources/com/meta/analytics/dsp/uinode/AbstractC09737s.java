package com.meta.analytics.dsp.uinode;

import android.database.sqlite.SQLiteDatabase;
import com.applovin.exoplayer2.common.base.Ascii;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.7s, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC09737s {
    public static byte[] A01;
    public static String[] A02 = {"HVKZvR5UTjStDLOL9o4rPessbKuh0O7V", "lcBs6IulTDBXs0xMNwr7074HBb5CT680", "pp9", "08Pk9qbigTz1ItVQ0hAeiWjKqsV0Kke0", "IZPR1WSW", "qkmVdqnPN26Te8aFuQlNVKOt05q5LyYY", "adXBxD3OrJvPB32QQ8w", "pvdflY6bA4nr3ZgRZtp7kAtC3Qj6GBkc"};
    public final C09707o A00;

    public static String A01(int i9, int i10, int i11) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i9, i9 + i10);
        for (int i12 = 0; i12 < copyOfRange.length; i12++) {
            copyOfRange[i12] = (byte) ((copyOfRange[i12] - i11) - 59);
        }
        return new String(copyOfRange);
    }

    public static void A04() {
        A01 = new byte[]{121, -127, 123, -104, 123, -102, -86, -48, -36, -39, -41, -86, -44, Ascii.VT, -4, -7, 6, -7, -44, -108, -118, 126, -126, -111, -124, Byte.MIN_VALUE, -109, -124, 95, -109, Byte.MIN_VALUE, -127, -117, -124, 95, -95, -81, -84, -83, 125, -79, -98, -97, -87, -94, 125, -90, -93, 125, -94, -75, -90, -80, -79, -80, 125, -8, -22, -15, -22, -24, -7, -59};
    }

    public abstract String A06();

    public abstract C09697m[] A0A();

    static {
        A04();
    }

    public AbstractC09737s(C09707o c09707o) {
        this.A00 = c09707o;
    }

    private String A00() {
        C09697m[] A0A = A0A();
        if (A0A.length < 1) {
            if (A02[4].length() != 8) {
                throw new RuntimeException();
            }
            String[] strArr = A02;
            strArr[0] = "NTtbWHu0RetWI6yxki67w6X3knWPKgwD";
            strArr[1] = "wg0AU135P1OwlpIQrYrtBV6UQnwqkPhP";
            return null;
        }
        String result = A01(0, 0, 31);
        for (int i9 = 0; i9 < A0A.length - 1; i9++) {
            result = result + A0A[i9].A02() + A01(20, 2, 35);
        }
        return result + A0A[A0A.length - 1].A02();
    }

    public static String A02(String str, C09697m[] c09697mArr) {
        StringBuilder sb = new StringBuilder(A01(56, 7, 106));
        for (int i9 = 0; i9 < c09697mArr.length - 1; i9++) {
            sb.append(c09697mArr[i9].A01);
            int i10 = A02[2].length();
            if (i10 != 3) {
                throw new RuntimeException();
            }
            A02[4] = "CXWyM2Ol";
            sb.append(A01(20, 2, 35));
        }
        sb.append(c09697mArr[c09697mArr.length - 1].A01);
        sb.append(A01(6, 6, 79));
        sb.append(str);
        return sb.toString();
    }

    public static String A03(String str, C09697m[] c09697mArr, C09697m c09697m) {
        return A02(str, c09697mArr) + A01(12, 7, 121) + c09697m.A01 + A01(2, 4, 32);
    }

    public final SQLiteDatabase A05() {
        return this.A00.A0E();
    }

    public final void A07(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL(A01(22, 13, 4) + A06() + A01(0, 2, 30) + A00() + A01(19, 1, 48));
    }

    public final void A08(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL(A01(35, 21, 34) + A06());
    }

    public final boolean A09() {
        return A05().delete(A06(), null, null) > 0;
    }
}
