package com.meta.analytics.dsp.uinode;

import com.applovin.exoplayer2.common.base.Ascii;
import java.util.Arrays;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'A03' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* renamed from: com.facebook.ads.redexgen.X.Rh, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public abstract class EnumC1452Rh {
    public static byte[] A00;
    public static String[] A01 = {"nA8fLeyOwVmNwvq6aIqKxCaagHA5eYr", "8Z3ODqLNUnEAqB2P3Amw9Ur1PSsugik5", "YRmdf", "zIg3Ob9eurpeZ06C2uEHUxbrUPW1iO5", "DwODnBhAs5I9lGAPLwBjllp42Gjp41Mv", "6IL6kP5nz", "IHg6IZuYXxuMxytmBHiV", "YXmTZGEBqQ8NuPQvZDB03"};
    public static final /* synthetic */ EnumC1452Rh[] A02;
    public static final EnumC1452Rh A03;
    public static final EnumC1452Rh A04;
    public static final EnumC1452Rh A05;
    public static final EnumC1452Rh A06;
    public static final EnumC1452Rh A07;
    public static final EnumC1452Rh A08;

    public static String A02(int i9, int i10, int i11) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i9, i9 + i10);
        for (int i12 = 0; i12 < copyOfRange.length; i12++) {
            copyOfRange[i12] = (byte) ((copyOfRange[i12] - i11) - 4);
        }
        return new String(copyOfRange);
    }

    public static void A03() {
        A00 = new byte[]{-82, -33, -33, -50, -26, 110, -101, -101, -104, -111, -115, -102, -103, -60, -54, -73, -63, -70, Ascii.DEL, -92, -86, 101, 120, Byte.MIN_VALUE, 123, 121, -118, 123, -100, -102, -111, -106, -113, -99, -74, -77, -74, -73, -65, -74, 104, -68, -63, -72, -83, 104, -73, -82, 104, -78, -69, -73, -74, 104, -73, -86, -78, -83, -85, -68, 104, -77, -83, -63};
    }

    public abstract boolean A04(JSONArray jSONArray, int i9);

    public abstract boolean A05(JSONArray jSONArray, JSONArray jSONArray2, int i9);

    public abstract boolean A06(JSONObject jSONObject, String str);

    public abstract boolean A07(JSONObject jSONObject, JSONObject jSONObject2, String str);

    static {
        A03();
        final String A022 = A02(0, 5, 105);
        final int i9 = 0;
        EnumC1452Rh enumC1452Rh = new EnumC1452Rh(A022, i9) { // from class: com.facebook.ads.redexgen.X.J6
            @Override // com.meta.analytics.dsp.uinode.EnumC1452Rh
            public final boolean A04(JSONArray jSONArray, int i10) {
                return jSONArray.optJSONArray(i10) != null;
            }

            @Override // com.meta.analytics.dsp.uinode.EnumC1452Rh
            public final boolean A05(JSONArray jSONArray, JSONArray jSONArray2, int i10) {
                return AbstractC1453Ri.A01(jSONArray.optJSONArray(i10), jSONArray2.optJSONArray(i10));
            }

            @Override // com.meta.analytics.dsp.uinode.EnumC1452Rh
            public final boolean A06(JSONObject jSONObject, String str) {
                return jSONObject.optJSONArray(str) != null;
            }

            @Override // com.meta.analytics.dsp.uinode.EnumC1452Rh
            public final boolean A07(JSONObject jSONObject, JSONObject jSONObject2, String str) {
                return AbstractC1453Ri.A01(jSONObject.optJSONArray(str), jSONObject2.optJSONArray(str));
            }
        };
        A03 = enumC1452Rh;
        final String A023 = A02(5, 7, 40);
        final int i10 = 1;
        EnumC1452Rh enumC1452Rh2 = new EnumC1452Rh(A023, i10) { // from class: com.facebook.ads.redexgen.X.In
            @Override // com.meta.analytics.dsp.uinode.EnumC1452Rh
            public final boolean A04(JSONArray jSONArray, int i11) {
                return jSONArray.optBoolean(i11, true) == jSONArray.optBoolean(i11, false);
            }

            @Override // com.meta.analytics.dsp.uinode.EnumC1452Rh
            public final boolean A05(JSONArray jSONArray, JSONArray jSONArray2, int i11) {
                return jSONArray.optBoolean(i11) == jSONArray2.optBoolean(i11);
            }

            @Override // com.meta.analytics.dsp.uinode.EnumC1452Rh
            public final boolean A06(JSONObject jSONObject, String str) {
                return jSONObject.optBoolean(str, true) == jSONObject.optBoolean(str, false);
            }

            @Override // com.meta.analytics.dsp.uinode.EnumC1452Rh
            public final boolean A07(JSONObject jSONObject, JSONObject jSONObject2, String str) {
                return jSONObject.optBoolean(str) == jSONObject2.optBoolean(str);
            }
        };
        A04 = enumC1452Rh2;
        final String A024 = A02(12, 6, 81);
        final int i11 = 2;
        EnumC1452Rh enumC1452Rh3 = new EnumC1452Rh(A024, i11) { // from class: com.facebook.ads.redexgen.X.ID
            @Override // com.meta.analytics.dsp.uinode.EnumC1452Rh
            public final boolean A04(JSONArray jSONArray, int i12) {
                return jSONArray.optInt(i12, 0) == jSONArray.optInt(i12, 1) && jSONArray.optDouble(i12, 0.0d) == jSONArray.optDouble(i12, 1.0d) && ((double) jSONArray.optInt(i12, 0)) != jSONArray.optDouble(i12, 0.0d);
            }

            @Override // com.meta.analytics.dsp.uinode.EnumC1452Rh
            public final boolean A05(JSONArray jSONArray, JSONArray jSONArray2, int i12) {
                return jSONArray.optDouble(i12) == jSONArray2.optDouble(i12);
            }

            @Override // com.meta.analytics.dsp.uinode.EnumC1452Rh
            public final boolean A06(JSONObject jSONObject, String str) {
                return jSONObject.optInt(str, 0) == jSONObject.optInt(str, 1) && jSONObject.optDouble(str, 0.0d) == jSONObject.optDouble(str, 1.0d) && ((double) jSONObject.optInt(str, 0)) != jSONObject.optDouble(str, 0.0d);
            }

            @Override // com.meta.analytics.dsp.uinode.EnumC1452Rh
            public final boolean A07(JSONObject jSONObject, JSONObject jSONObject2, String str) {
                return jSONObject.optDouble(str) == jSONObject2.optDouble(str);
            }
        };
        A05 = enumC1452Rh3;
        final String A025 = A02(18, 3, 50);
        final int i12 = 3;
        EnumC1452Rh enumC1452Rh4 = new EnumC1452Rh(A025, i12) { // from class: com.facebook.ads.redexgen.X.I5
            @Override // com.meta.analytics.dsp.uinode.EnumC1452Rh
            public final boolean A04(JSONArray jSONArray, int i13) {
                return jSONArray.optInt(i13, 0) == jSONArray.optInt(i13, 1) && jSONArray.optDouble(i13, 0.0d) == jSONArray.optDouble(i13, 1.0d) && ((double) jSONArray.optInt(i13, 0)) == jSONArray.optDouble(i13, 0.0d);
            }

            @Override // com.meta.analytics.dsp.uinode.EnumC1452Rh
            public final boolean A05(JSONArray jSONArray, JSONArray jSONArray2, int i13) {
                return jSONArray.optInt(i13) == jSONArray2.optInt(i13);
            }

            @Override // com.meta.analytics.dsp.uinode.EnumC1452Rh
            public final boolean A06(JSONObject jSONObject, String str) {
                return jSONObject.optInt(str, 0) == jSONObject.optInt(str, 1) && jSONObject.optDouble(str, 0.0d) == jSONObject.optDouble(str, 1.0d) && ((double) jSONObject.optInt(str, 0)) == jSONObject.optDouble(str, 0.0d);
            }

            @Override // com.meta.analytics.dsp.uinode.EnumC1452Rh
            public final boolean A07(JSONObject jSONObject, JSONObject jSONObject2, String str) {
                return jSONObject.optInt(str) == jSONObject2.optInt(str);
            }
        };
        A06 = enumC1452Rh4;
        final String A026 = A02(21, 6, 18);
        final int i13 = 4;
        EnumC1452Rh enumC1452Rh5 = new EnumC1452Rh(A026, i13) { // from class: com.facebook.ads.redexgen.X.I4
            @Override // com.meta.analytics.dsp.uinode.EnumC1452Rh
            public final boolean A04(JSONArray jSONArray, int i14) {
                return jSONArray.optJSONObject(i14) != null;
            }

            @Override // com.meta.analytics.dsp.uinode.EnumC1452Rh
            public final boolean A05(JSONArray jSONArray, JSONArray jSONArray2, int i14) {
                return AbstractC1453Ri.A02(jSONArray.optJSONObject(i14), jSONArray2.optJSONObject(i14));
            }

            @Override // com.meta.analytics.dsp.uinode.EnumC1452Rh
            public final boolean A06(JSONObject jSONObject, String str) {
                return jSONObject.optJSONObject(str) != null;
            }

            @Override // com.meta.analytics.dsp.uinode.EnumC1452Rh
            public final boolean A07(JSONObject jSONObject, JSONObject jSONObject2, String str) {
                return AbstractC1453Ri.A02(jSONObject.optJSONObject(str), jSONObject2.optJSONObject(str));
            }
        };
        A07 = enumC1452Rh5;
        final String A027 = A02(27, 6, 36);
        final int i14 = 5;
        EnumC1452Rh enumC1452Rh6 = new EnumC1452Rh(A027, i14) { // from class: com.facebook.ads.redexgen.X.Hx
            @Override // com.meta.analytics.dsp.uinode.EnumC1452Rh
            public final boolean A04(JSONArray jSONArray, int i15) {
                return jSONArray.optString(i15) != null;
            }

            @Override // com.meta.analytics.dsp.uinode.EnumC1452Rh
            public final boolean A05(JSONArray jSONArray, JSONArray jSONArray2, int i15) {
                return jSONArray.optString(i15).equals(jSONArray2.optString(i15));
            }

            @Override // com.meta.analytics.dsp.uinode.EnumC1452Rh
            public final boolean A06(JSONObject jSONObject, String str) {
                return jSONObject.optString(str) != null;
            }

            @Override // com.meta.analytics.dsp.uinode.EnumC1452Rh
            public final boolean A07(JSONObject jSONObject, JSONObject jSONObject2, String str) {
                return jSONObject.optString(str).equals(jSONObject2.optString(str));
            }
        };
        A08 = enumC1452Rh6;
        A02 = new EnumC1452Rh[]{enumC1452Rh, enumC1452Rh2, enumC1452Rh3, enumC1452Rh4, enumC1452Rh5, enumC1452Rh6};
    }

    public EnumC1452Rh(String str, int i9) {
    }

    public static EnumC1452Rh A00(JSONArray jSONArray, int i9) {
        for (EnumC1452Rh type : values()) {
            if (A01[1].charAt(14) != '2') {
                throw new RuntimeException();
            }
            A01[4] = "PUsgFaltT51mxPXWqnHKjq6lqfkoVDea";
            if (type.A04(jSONArray, i9)) {
                return type;
            }
        }
        throw new AssertionError(A02(33, 31, 68));
    }

    public static EnumC1452Rh A01(JSONObject jSONObject, String str) {
        for (EnumC1452Rh enumC1452Rh : values()) {
            boolean A062 = enumC1452Rh.A06(jSONObject, str);
            if (A01[5].length() != 9) {
                throw new RuntimeException();
            }
            A01[6] = "GmRRmI3tzaTgoS0GQtjO0";
            if (A062) {
                return enumC1452Rh;
            }
        }
        throw new AssertionError(A02(33, 31, 68));
    }

    public static EnumC1452Rh valueOf(String str) {
        return (EnumC1452Rh) Enum.valueOf(EnumC1452Rh.class, str);
    }

    public static EnumC1452Rh[] values() {
        return (EnumC1452Rh[]) A02.clone();
    }
}
