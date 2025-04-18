package com.instagram.common.viewpoint.core;

import android.database.sqlite.SQLiteDatabase;
import java.util.Arrays;
import org.objectweb.asm.Opcodes;

/* renamed from: com.facebook.ads.redexgen.X.7w, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC03557w {
    public static byte[] A01;
    public final C03527s A00;

    static {
        A04();
    }

    public static String A01(int i2, int i3, int i4) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i2, i2 + i3);
        for (int i5 = 0; i5 < copyOfRange.length; i5++) {
            copyOfRange[i5] = (byte) ((copyOfRange[i5] ^ i4) ^ 3);
        }
        return new String(copyOfRange);
    }

    public static void A04() {
        A01 = new byte[]{85, 93, 87, 74, 87, 72, 54, 80, 68, 89, 91, 54, 84, 35, 60, 49, 38, 49, 84, 95, 4, 8, 79, 94, 73, 77, 88, 73, 44, 88, 77, 78, 64, 73, 44, 6, 16, 13, 18, 98, 22, 3, 0, 14, 7, 98, 11, 4, 98, 7, 26, 11, 17, 22, 17, 98, 34, 52, 61, 52, 50, 37, 81};
    }

    public abstract String A06();

    public abstract C7q[] A0A();

    public AbstractC03557w(C03527s c03527s) {
        this.A00 = c03527s;
    }

    private String A00() {
        C7q[] A0A = A0A();
        if (A0A.length < 1) {
            return null;
        }
        String result = A01(0, 0, 12);
        for (int i2 = 0; i2 < A0A.length - 1; i2++) {
            result = result + A0A[i2].A02() + A01(20, 2, 43);
        }
        return result + A0A[A0A.length - 1].A02();
    }

    public static String A02(String str, C7q[] c7qArr) {
        StringBuilder sb = new StringBuilder(A01(56, 7, Opcodes.FREM));
        for (int i2 = 0; i2 < c7qArr.length - 1; i2++) {
            sb.append(c7qArr[i2].A01);
            sb.append(A01(20, 2, 43));
        }
        sb.append(c7qArr[c7qArr.length - 1].A01);
        sb.append(A01(6, 6, 21));
        sb.append(str);
        return sb.toString();
    }

    public static String A03(String str, C7q[] c7qArr, C7q c7q) {
        return A02(str, c7qArr) + A01(12, 7, Opcodes.DNEG) + c7q.A01 + A01(2, 4, 116);
    }

    public final SQLiteDatabase A05() {
        return this.A00.A0E();
    }

    public final void A07(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL(A01(22, 13, 15) + A06() + A01(0, 2, Opcodes.FNEG) + A00() + A01(19, 1, Opcodes.LNEG));
    }

    public final void A08(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL(A01(35, 21, 65) + A06());
    }

    public final boolean A09() {
        return A05().delete(A06(), null, null) > 0;
    }
}
