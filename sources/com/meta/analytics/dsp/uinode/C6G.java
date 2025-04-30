package com.meta.analytics.dsp.uinode;

import android.content.ContentResolver;
import android.database.Cursor;
import com.applovin.exoplayer2.common.base.Ascii;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.6G, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public abstract class C6G {
    public static byte[] A00;
    public static String[] A01 = {"BBXCQ1c8lWMx5iTCFSjBAsNmZ8", "uWpSMDe8Dl1QwAjraNXmi3HjN39WCwvV", "Nl77HN8SOPKSqciG8lmOC8DFY50qabgT", "qKAuPB5zte0w", "tHnAlNrx5zeOSNOAYBdYTMmeA", "muO01a58leOoeMmtxXp9cvgd3", "skgH0VF5dzwRL9wPv5", "Mbe4svBdXamA1BIwkYK5rcxDOVieSFVl"};

    public static String A01(int i9, int i10, int i11) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i9, i9 + i10);
        int i12 = 0;
        while (true) {
            int length = copyOfRange.length;
            if (A01[2].charAt(14) != 'i') {
                throw new RuntimeException();
            }
            String[] strArr = A01;
            strArr[3] = "5u7aTW8yax3G";
            strArr[6] = "UvSwr6xgQWJsIweShl";
            if (i12 >= length) {
                return new String(copyOfRange);
            }
            copyOfRange[i12] = (byte) ((copyOfRange[i12] ^ i11) ^ 109);
            i12++;
        }
    }

    public static void A02() {
        A00 = new byte[]{118, 126, 115, 115, 124, 118, 96, 125, 123, 118, 123, 118, 40, 36, 37, 63, 46, 37, 63, 113, 100, 100, 40, 36, 38, 101, 45, 42, 40, 46, 41, 36, 36, 32, 101, 32, 42, 63, 42, 37, 42, 101, 59, 57, 36, 61, 34, 47, 46, 57, 101, 10, 63, 63, 57, 34, 41, 62, 63, 34, 36, 37, 2, 47, Ascii.ESC, 57, 36, 61, 34, 47, 46, 57, 37, 32, 36, 32, 61, Ascii.SYN, 61, 59, 40, 42, 34, 32, 39, 46};
    }

    static {
        A02();
    }

    public static C6F A00(ContentResolver contentResolver) {
        String A012 = A01(72, 14, 36);
        String A013 = A01(3, 9, 127);
        String A014 = A01(0, 3, 122);
        Cursor c9 = null;
        try {
            c9 = contentResolver.query(AbstractC1287Ky.A00(A01(12, 60, 38)), new String[]{A014, A013, A012}, null, null, null);
            if (c9 == null || !c9.moveToFirst()) {
                return new C6F(null, null, false);
            }
            String string = c9.getString(c9.getColumnIndex(A014));
            String attributionId = c9.getString(c9.getColumnIndex(A013));
            C6F c6f = new C6F(string, attributionId, Boolean.valueOf(c9.getString(c9.getColumnIndex(A012))).booleanValue());
            if (c9 != null) {
                c9.close();
            }
            return c6f;
        } finally {
            if (c9 != null) {
                c9.close();
            }
        }
    }
}
