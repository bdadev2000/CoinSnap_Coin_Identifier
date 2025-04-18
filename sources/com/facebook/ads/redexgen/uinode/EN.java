package com.facebook.ads.redexgen.uinode;

import android.database.Cursor;
import android.util.Log;
import android.util.Pair;
import com.applovin.exoplayer2.common.base.Ascii;
import java.util.Arrays;
import kotlin.io.encoding.Base64;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: assets/audience_network.dex */
public final class EN implements YH {
    public static byte[] A03;
    public static String[] A04 = {"zSqnO64p11LQVC3SPrHTwk7q", "RQQcRArwNRw7pCFobI7zm4AECBhyO", "uX7W3VjoXSZ8mIic8tH9fb17VHeYN2EI", "VdQ4q", "h", "roUcO9bhLUMzgbi0", "6tdL5l5B64y16QievzXwm2hdxMIwTdT2", "M1EyYsdVjnJYnVOvo"};
    public boolean A00 = true;
    public final C1069Ym A01;
    public final C04047o A02;

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A03, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 85);
        }
        return new String(copyOfRange);
    }

    public static void A04() {
        String[] strArr = A04;
        if (strArr[7].length() == strArr[5].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A04;
        strArr2[0] = "GUa5RhIL61d4FW3HWW0RBx9i";
        strArr2[1] = "4nKtohmUbY7tHai9z2t8ojCMJbrZv";
        A03 = new byte[]{62, Ascii.FS, 19, 90, 9, 93, Ascii.EM, Ascii.CAN, 17, Ascii.CAN, 9, Ascii.CAN, 93, Ascii.FS, 9, 9, Ascii.CAN, Ascii.DLE, Ascii.CR, 9, Ascii.SO, 93, Ascii.CAN, 5, Ascii.RS, Ascii.CAN, Ascii.CAN, Ascii.EM, Ascii.CAN, Ascii.EM, 93, Ascii.CAN, Ascii.VT, Ascii.CAN, 19, 9, Ascii.SO, 83, Ascii.DLE, Ascii.NAK, 7, Ascii.CAN, Ascii.NAK, 46, 59, 59, 42, 34, 63, 59, Byte.MAX_VALUE, 122, 111, 122, Ascii.DLE, Ascii.GS, 50, 36, 50, 50, 40, 46, 47, Ascii.RS, 40, 37, 32, 54, 32, 32, 58, 60, Base64.padSymbol, Ascii.FF, 39, 58, 62, 54, 76, 81, 85, 93, Ascii.DC4, Ascii.SI, Ascii.VT, 5, Ascii.SO, 63, 9, 4, Byte.MAX_VALUE, 114, 123, 110};
    }

    static {
        A04();
    }

    public EN(C1069Ym c1069Ym) {
        this.A01 = c1069Ym;
        this.A02 = new C04047o(c1069Ym);
    }

    private JSONArray A01(Cursor cursor) throws JSONException {
        JSONArray jSONArray = new JSONArray();
        cursor.moveToPosition(-1);
        while (cursor.moveToNext()) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(A00(54, 2, 44), cursor.getString(C1068Yl.A04.A00));
            jSONObject.put(A00(82, 8, 53), cursor.getString(C1068Yl.A09.A00));
            jSONObject.put(A00(90, 4, 94), cursor.getString(C1068Yl.A0A.A00));
            jSONObject.put(A00(78, 4, 109), C0728Lf.A02(cursor.getDouble(C1068Yl.A08.A00)));
            jSONObject.put(A00(66, 12, 6), C0728Lf.A02(cursor.getDouble(C1068Yl.A07.A00)));
            jSONObject.put(A00(56, 10, 20), cursor.getString(C1068Yl.A06.A00));
            String string = cursor.getString(C1068Yl.A03.A00);
            jSONObject.put(A00(50, 4, 78), string != null ? new JSONObject(string) : new JSONObject());
            jSONObject.put(A00(43, 7, 26), cursor.getString(C1068Yl.A02.A00));
            jSONObject.put(A00(38, 5, 36), this.A01.A03().A7H());
            jSONArray.put(jSONObject);
        }
        return jSONArray;
    }

    private JSONArray A02(Cursor cursor) throws JSONException {
        JSONArray jSONArray = new JSONArray();
        cursor.moveToPosition(-1);
        while (cursor.moveToNext()) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(A00(54, 2, 44), cursor.getString(2));
            jSONObject.put(A00(82, 8, 53), cursor.getString(0));
            jSONObject.put(A00(90, 4, 94), cursor.getString(4));
            jSONObject.put(A00(78, 4, 109), C0728Lf.A02(cursor.getDouble(5)));
            jSONObject.put(A00(66, 12, 6), C0728Lf.A02(cursor.getDouble(6)));
            jSONObject.put(A00(56, 10, 20), cursor.getString(7));
            String string = cursor.getString(8);
            jSONObject.put(A00(50, 4, 78), string != null ? new JSONObject(string) : new JSONObject());
            jSONObject.put(A00(43, 7, 26), cursor.getString(9));
            jSONObject.put(A00(38, 5, 36), this.A01.A03().A7H());
            jSONArray.put(jSONObject);
        }
        return jSONArray;
    }

    public static JSONObject A03(Cursor cursor) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        while (cursor.moveToNext()) {
            String string = cursor.getString(C1067Yk.A02.A00);
            String string2 = cursor.getString(C1067Yk.A01.A00);
            String[] strArr = A04;
            if (strArr[6].charAt(14) != strArr[2].charAt(14)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A04;
            strArr2[7] = "IfQdYzKY6vCyBSxPg";
            strArr2[5] = "fxZpsWnZoPKbT5Dt";
            jSONObject.put(string, string2);
        }
        return jSONObject;
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC04358v
    public final int A4I(int i10) {
        int i11 = 0;
        if (i10 > -1) {
            try {
                i11 = this.A02.A08(i10);
            } catch (Exception e2) {
                if (this.A01.A04().A8z()) {
                    Log.e(YH.A00, A00(0, 38, 40), e2);
                }
            }
        }
        this.A02.A0I();
        if (this.A00) {
            this.A02.A0J();
        }
        return i11;
    }

    @Override // com.facebook.ads.redexgen.uinode.C8w
    public final void A4J() {
        this.A02.A0H();
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC04358v
    public final boolean A53(String str) {
        return this.A02.A0K(str);
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC04358v
    public final JSONArray A5y() {
        Cursor cursor = null;
        try {
            cursor = this.A02.A0A();
            JSONArray jSONArray = null;
            if (cursor.getCount() > 0) {
                jSONArray = A01(cursor);
            }
            if (cursor != null) {
                cursor.close();
            }
            return jSONArray;
        } catch (JSONException unused) {
            if (cursor != null) {
                cursor.close();
                return null;
            }
            return null;
        } catch (Throwable th2) {
            if (cursor != null) {
                cursor.close();
            }
            throw th2;
        }
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC04358v
    public final JSONObject A5z() {
        Cursor cursor = null;
        try {
            cursor = this.A02.A0B();
            JSONObject jSONObject = null;
            if (cursor.getCount() > 0) {
                jSONObject = A03(cursor);
            }
            if (cursor != null) {
                cursor.close();
            }
            return jSONObject;
        } catch (JSONException unused) {
            if (cursor != null) {
                cursor.close();
                return null;
            }
            return null;
        } catch (Throwable th2) {
            if (cursor != null) {
                cursor.close();
            }
            throw th2;
        }
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC04358v
    public final int A6z() {
        Cursor cursor = null;
        try {
            cursor = this.A02.A09();
            return cursor.moveToFirst() ? cursor.getInt(0) : 0;
        } finally {
            if (cursor != null) {
                cursor.close();
            }
        }
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC04358v
    public final String A72(String str) {
        String str2 = null;
        Cursor A0D = this.A02.A0D(str);
        if (A0D != null) {
            if (A0D.moveToNext() && A0D.getCount() > 0) {
                C04037m c04037m = C1068Yl.A0A;
                String[] strArr = A04;
                String str3 = strArr[7];
                String eventType = strArr[5];
                if (str3.length() == eventType.length()) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A04;
                strArr2[3] = "VgiME";
                strArr2[4] = "4";
                String eventType2 = c04037m.A01;
                str2 = A0D.getString(A0D.getColumnIndex(eventType2));
            }
            A0D.close();
        }
        return str2;
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC04358v
    public final Pair<JSONObject, JSONArray> A89(int i10) {
        Cursor cursor = null;
        try {
            try {
                cursor = this.A02.A0C(i10);
                JSONArray events = null;
                JSONObject tokens = null;
                if (cursor.getCount() > 0) {
                    tokens = A03(cursor);
                    events = A02(cursor);
                }
                Pair<JSONObject, JSONArray> pair = new Pair<>(tokens, events);
                if (cursor != null) {
                    cursor.close();
                }
                return pair;
            } catch (JSONException unused) {
                Pair<JSONObject, JSONArray> pair2 = new Pair<>(null, null);
                if (cursor != null) {
                    cursor.close();
                }
                return pair2;
            }
        } catch (Throwable th2) {
            if (cursor != null) {
                cursor.close();
            }
            throw th2;
        }
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC04358v
    public final boolean A8m(String str) {
        return this.A02.A0L(str);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.8t != com.facebook.ads.internal.eventstorage.AdEventStorageCallback<java.lang.String> */
    @Override // com.facebook.ads.redexgen.uinode.C8w
    public final void AHE(C0675Iz c0675Iz, AbstractC04338t<String> abstractC04338t) {
        this.A02.A0G(c0675Iz.A08(), c0675Iz.A05().A00, c0675Iz.A06().toString(), c0675Iz.A04(), c0675Iz.A03(), c0675Iz.A07(), c0675Iz.A09(), abstractC04338t);
    }
}
