package com.instagram.common.viewpoint.core;

import android.content.ContentResolver;
import android.database.Cursor;
import java.util.Arrays;
import org.objectweb.asm.Opcodes;

/* renamed from: com.facebook.ads.redexgen.X.6J, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public abstract class C6J {
    public static byte[] A00;

    static {
        A02();
    }

    public static String A01(int i2, int i3, int i4) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i2, i2 + i3);
        for (int i5 = 0; i5 < copyOfRange.length; i5++) {
            copyOfRange[i5] = (byte) ((copyOfRange[i5] ^ i4) ^ 15);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A00 = new byte[]{61, 53, 56, 79, 64, 74, 92, 65, 71, 74, 71, 74, Byte.MAX_VALUE, 115, 114, 104, 121, 114, 104, 38, 51, 51, Byte.MAX_VALUE, 115, 113, 50, 122, 125, Byte.MAX_VALUE, 121, 126, 115, 115, 119, 50, 119, 125, 104, 125, 114, 125, 50, 108, 110, 115, 106, 117, 120, 121, 110, 50, 93, 104, 104, 110, 117, 126, 105, 104, 117, 115, 114, 85, 120, 76, 110, 115, 106, 117, 120, 121, 110, 18, 23, 19, 23, 10, 33, 10, 12, 31, 29, 21, 23, 16, 25};
    }

    public static C6I A00(ContentResolver contentResolver) {
        String A01 = A01(72, 14, Opcodes.LREM);
        String A012 = A01(3, 9, 33);
        String A013 = A01(0, 3, 83);
        Cursor c2 = null;
        try {
            c2 = contentResolver.query(L5.A00(A01(12, 60, 19)), new String[]{A013, A012, A01}, null, null, null);
            if (c2 == null || !c2.moveToFirst()) {
                return new C6I(null, null, false);
            }
            String string = c2.getString(c2.getColumnIndex(A013));
            String attributionId = c2.getString(c2.getColumnIndex(A012));
            C6I c6i = new C6I(string, attributionId, Boolean.valueOf(c2.getString(c2.getColumnIndex(A01))).booleanValue());
            if (c2 != null) {
                c2.close();
            }
            return c6i;
        } finally {
            if (c2 != null) {
                c2.close();
            }
        }
    }
}
