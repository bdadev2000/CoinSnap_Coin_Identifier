package com.facebook.ads.redexgen.uinode;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import android.util.Log;
import com.applovin.exoplayer2.common.base.Ascii;
import java.util.Arrays;
import java.util.UUID;
import kotlin.io.encoding.Base64;

/* renamed from: com.facebook.ads.redexgen.X.Yk, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1067Yk extends AbstractC04077s {
    public static byte[] A00;
    public static final C04037m A01;
    public static final C04037m A02;
    public static final C04037m[] A03;
    public static final String A04;
    public static final String A05;
    public static final String A06;
    public static final String A07;

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 36);
        }
        return new String(copyOfRange);
    }

    public static void A04() {
        A00 = new byte[]{19, Ascii.SO, 19, 91, 63, 44, 45, 36, 45, 60, 45, 72, 46, 58, 39, 37, 72, Ascii.FS, 7, 3, Ascii.CR, 6, Ascii.ESC, 72, 63, 32, 45, 58, 45, 72, 38, 39, 60, 72, 45, 48, 33, 59, 60, 59, 72, 64, 59, 45, 36, 45, 43, 60, 72, 89, 72, 46, 58, 39, 37, 72, Ascii.CR, Ascii.RS, Ascii.CR, 6, Ascii.FS, Ascii.ESC, 72, 63, 32, 45, 58, 45, 72, Ascii.FS, 7, 3, Ascii.CR, 6, Ascii.ESC, 70, 8, 53, 46, 40, Base64.padSymbol, 57, 36, 34, 35, 109, 58, 37, 40, 35, 109, 57, 63, 52, 36, 35, 42, 109, 57, 34, 109, 41, 40, 33, 40, 57, 40, 109, 46, 37, 36, 33, 41, 33, 40, 62, 62, 109, 57, 34, 38, 40, 35, 62, 99, Ascii.SYN, 49, 41, 62, 51, 54, 59, Byte.MAX_VALUE, 43, 48, 52, 58, 49, 113, 92, 77, 80, 92, 74, 91, 70, 74, 62, 78, 76, 87, 83, 95, 76, 71, 62, 85, 91, 71, 36, 55, 36, 47, 53, 50, 2, Ascii.EM, Ascii.GS, 19, Ascii.CAN, Ascii.EM, 2, 6, 8, 3, 50, 4, 9, 80, 75, 79, 65, 74, 87};
    }

    static {
        A04();
        C04037m c04037m = new C04037m(0, A00(170, 8, 73), A00(143, 16, 58));
        A02 = c04037m;
        C04037m c04037m2 = new C04037m(1, A00(165, 5, 82), A00(139, 4, 44));
        A01 = c04037m2;
        C04037m[] c04037mArr = {c04037m, c04037m2};
        A03 = c04037mArr;
        A07 = C1067Yk.class.getSimpleName();
        String A002 = A00(178, 6, 0);
        A05 = AbstractC04077s.A02(A002, c04037mArr);
        A06 = AbstractC04077s.A03(A002, c04037mArr, c04037m2);
        A04 = A00(5, 71, 76) + c04037m.A01 + A00(0, 3, 23) + A00(159, 6, 101) + A00(4, 1, 53) + C1068Yl.A09.A01 + A00(3, 1, 86);
    }

    public C1067Yk(C04047o c04047o) {
        super(c04047o);
    }

    @Override // com.facebook.ads.redexgen.uinode.AbstractC04077s
    public final String A06() {
        return A00(178, 6, 0);
    }

    @Override // com.facebook.ads.redexgen.uinode.AbstractC04077s
    public final C04037m[] A0A() {
        return A03;
    }

    public final Cursor A0B() {
        return A05().rawQuery(A05, null);
    }

    public final String A0C(String str) throws IllegalArgumentException, SQLiteException {
        if (!TextUtils.isEmpty(str)) {
            Cursor cursor = null;
            try {
                cursor = A05().rawQuery(A06, new String[]{str});
                String string = cursor.moveToNext() ? cursor.getString(A02.A00) : null;
                if (!TextUtils.isEmpty(string)) {
                    return string;
                }
                String uuid = UUID.randomUUID().toString();
                ContentValues contentValues = new ContentValues(2);
                contentValues.put(A02.A01, uuid);
                contentValues.put(A01.A01, str);
                A05().insertOrThrow(A00(178, 6, 0), null, contentValues);
                if (cursor != null) {
                    cursor.close();
                }
                return uuid;
            } finally {
                if (cursor != null) {
                    cursor.close();
                }
            }
        }
        throw new IllegalArgumentException(A00(125, 14, 123));
    }

    public final void A0D(C1069Ym c1069Ym) {
        try {
            A05().execSQL(A04);
        } catch (SQLException e2) {
            if (c1069Ym.A04().A8z()) {
                Log.e(A07, A00(76, 49, 105), e2);
            }
        }
    }
}
