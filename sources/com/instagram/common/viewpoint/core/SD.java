package com.instagram.common.viewpoint.core;

import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import java.util.Arrays;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'A03' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByField(EnumVisitor.java:372)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:337)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:322)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInvoke(EnumVisitor.java:293)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:266)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: assets/audience_network.dex */
public abstract class SD {
    public static byte[] A00;
    public static String[] A01 = {"tECI8EX1cuXhUwYvYft6TDcXrBYDxzmb", "U9lWMC", "VeFVBuimOKBZ6IhnkHNGVdQ2rus8nhqD", "5Ss9iINs1N203h8UwVdzTm0B7XXAo0aC", "SEbmC0K2IQ7flaHMYhUIDNtJoPD", "aE6Std6il1HEkTA4be5XQZw6wdO2x4l2", "Oc9eC60MpRTSk1JwhF2h3JFaDWGSLdec", "vmvIsg"};
    public static final /* synthetic */ SD[] A02;
    public static final SD A03;
    public static final SD A04;
    public static final SD A05;
    public static final SD A06;
    public static final SD A07;
    public static final SD A08;

    public static String A02(int i2, int i3, int i4) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i2, i2 + i3);
        for (int i5 = 0; i5 < copyOfRange.length; i5++) {
            copyOfRange[i5] = (byte) ((copyOfRange[i5] ^ i4) ^ 79);
        }
        return new String(copyOfRange);
    }

    public static void A03() {
        A00 = new byte[]{20, 39, 39, 52, 44, 71, 106, 106, 105, 96, 100, 107, 102, 77, 87, 64, 78, 71, 105, 78, 84, 95, 114, 122, 117, 115, 100, 46, 9, 15, 20, 19, 26, 94, 101, 96, 101, 100, 124, 101, 43, Byte.MAX_VALUE, 114, 123, 110, 43, 100, 109, 43, 97, 120, 100, 101, 43, 100, 105, 97, 110, 104, Byte.MAX_VALUE, 43, 96, 110, 114};
    }

    public abstract boolean A05(JSONArray jSONArray, int i2);

    public abstract boolean A06(JSONArray jSONArray, JSONArray jSONArray2, int i2);

    public abstract boolean A07(JSONObject jSONObject, String str);

    public abstract boolean A08(JSONObject jSONObject, JSONObject jSONObject2, String str);

    static {
        A03();
        final String A022 = A02(0, 5, 26);
        final int i2 = 0;
        A03 = new SD(A022, i2) { // from class: com.facebook.ads.redexgen.X.KK
            @Override // com.instagram.common.viewpoint.core.SD
            public final boolean A05(JSONArray jSONArray, int i3) {
                return jSONArray.optJSONArray(i3) != null;
            }

            @Override // com.instagram.common.viewpoint.core.SD
            public final boolean A06(JSONArray jSONArray, JSONArray jSONArray2, int i3) {
                return SE.A01(jSONArray.optJSONArray(i3), jSONArray2.optJSONArray(i3));
            }

            @Override // com.instagram.common.viewpoint.core.SD
            public final boolean A07(JSONObject jSONObject, String str) {
                return jSONObject.optJSONArray(str) != null;
            }

            @Override // com.instagram.common.viewpoint.core.SD
            public final boolean A08(JSONObject jSONObject, JSONObject jSONObject2, String str) {
                return SE.A01(jSONObject.optJSONArray(str), jSONObject2.optJSONArray(str));
            }
        };
        final String A023 = A02(5, 7, 74);
        final int i3 = 1;
        A04 = new SD(A023, i3) { // from class: com.facebook.ads.redexgen.X.KF
            @Override // com.instagram.common.viewpoint.core.SD
            public final boolean A05(JSONArray jSONArray, int i4) {
                return jSONArray.optBoolean(i4, true) == jSONArray.optBoolean(i4, false);
            }

            @Override // com.instagram.common.viewpoint.core.SD
            public final boolean A06(JSONArray jSONArray, JSONArray jSONArray2, int i4) {
                return jSONArray.optBoolean(i4) == jSONArray2.optBoolean(i4);
            }

            @Override // com.instagram.common.viewpoint.core.SD
            public final boolean A07(JSONObject jSONObject, String str) {
                return jSONObject.optBoolean(str, true) == jSONObject.optBoolean(str, false);
            }

            @Override // com.instagram.common.viewpoint.core.SD
            public final boolean A08(JSONObject jSONObject, JSONObject jSONObject2, String str) {
                return jSONObject.optBoolean(str) == jSONObject2.optBoolean(str);
            }
        };
        final String A024 = A02(12, 6, 109);
        final int i4 = 2;
        A05 = new SD(A024, i4) { // from class: com.facebook.ads.redexgen.X.K3
            public static String[] A00 = {"1ZkmGDQLr4HHzESqnZwtiaJskrCoCdgr", "ZuXKvCVbKiCO09p9pYqDyLAizJSm2C6Q", "nueEAEfgKP3aoalcvcV3IYW8uca", "ZSO21PM30lkMK5VtmFwCGRnC4HfRl6Ua", "ewMxBq6LlUCdKuikxzCZkjc2M9R", "JDKZd", "VKrSZQCGjlRNXLKdswkZgNPUMacPzyqz", "RC4irD47U"};

            @Override // com.instagram.common.viewpoint.core.SD
            public final boolean A05(JSONArray jSONArray, int i5) {
                return jSONArray.optInt(i5, 0) == jSONArray.optInt(i5, 1) && jSONArray.optDouble(i5, FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) == jSONArray.optDouble(i5, 1.0d) && ((double) jSONArray.optInt(i5, 0)) != jSONArray.optDouble(i5, FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE);
            }

            @Override // com.instagram.common.viewpoint.core.SD
            public final boolean A06(JSONArray jSONArray, JSONArray jSONArray2, int i5) {
                return jSONArray.optDouble(i5) == jSONArray2.optDouble(i5);
            }

            @Override // com.instagram.common.viewpoint.core.SD
            public final boolean A07(JSONObject jSONObject, String str) {
                if (jSONObject.optInt(str, 0) != jSONObject.optInt(str, 1)) {
                    return false;
                }
                double optDouble = jSONObject.optDouble(str, FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE);
                if (A00[0].charAt(28) != 'C') {
                    throw new RuntimeException();
                }
                String[] strArr = A00;
                strArr[2] = "ccqqHA83ZTWiIg3HPQbc0aiXb2J";
                strArr[4] = "9RASlEbgrOZWYduHYKXmEPevqLf";
                return optDouble == jSONObject.optDouble(str, 1.0d) && ((double) jSONObject.optInt(str, 0)) != jSONObject.optDouble(str, FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE);
            }

            @Override // com.instagram.common.viewpoint.core.SD
            public final boolean A08(JSONObject jSONObject, JSONObject jSONObject2, String str) {
                return jSONObject.optDouble(str) == jSONObject2.optDouble(str);
            }
        };
        final String A025 = A02(18, 3, 111);
        final int i5 = 3;
        A06 = new SD(A025, i5) { // from class: com.facebook.ads.redexgen.X.K2
            public static String[] A00 = {"n7SKlqK", "ov2fNltgQ2EAr85rcAXjQlotsfjsnjuH", "ovWB89LlYvQ4xO5HZfV2GFW4RL9XN4h2", "w8d2diIE5BdvGUn1gxyTHp0hEgENQTV7", "yQnpH44oXSx8ccz3NjdKCULhtA2Hxjvh", "86uwoduXnLYKbsdqFVwkHHSOZ5iH2tHE", "J0bksEA3Nc1mI6xnOvQtusRgBbL88ZUJ", "XzqVLub6oNjkAstpNhW0t4rN94XX0A8D"};

            @Override // com.instagram.common.viewpoint.core.SD
            public final boolean A05(JSONArray jSONArray, int i6) {
                if (jSONArray.optInt(i6, 0) != jSONArray.optInt(i6, 1) || jSONArray.optDouble(i6, FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) != jSONArray.optDouble(i6, 1.0d)) {
                    return false;
                }
                int optInt = jSONArray.optInt(i6, 0);
                if (A00[4].charAt(31) != 'h') {
                    throw new RuntimeException();
                }
                A00[4] = "ESUjQDK13szqjYK8RJAQddjghxYzdQOh";
                return ((double) optInt) == jSONArray.optDouble(i6, FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE);
            }

            @Override // com.instagram.common.viewpoint.core.SD
            public final boolean A06(JSONArray jSONArray, JSONArray jSONArray2, int i6) {
                return jSONArray.optInt(i6) == jSONArray2.optInt(i6);
            }

            @Override // com.instagram.common.viewpoint.core.SD
            public final boolean A07(JSONObject jSONObject, String str) {
                if (jSONObject.optInt(str, 0) != jSONObject.optInt(str, 1) || jSONObject.optDouble(str, FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) != jSONObject.optDouble(str, 1.0d)) {
                    return false;
                }
                int optInt = jSONObject.optInt(str, 0);
                String[] strArr = A00;
                if (strArr[1].charAt(1) != strArr[2].charAt(1)) {
                    throw new RuntimeException();
                }
                A00[0] = "ksANhPg";
                return ((double) optInt) == jSONObject.optDouble(str, FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE);
            }

            @Override // com.instagram.common.viewpoint.core.SD
            public final boolean A08(JSONObject jSONObject, JSONObject jSONObject2, String str) {
                return jSONObject.optInt(str) == jSONObject2.optInt(str);
            }
        };
        final String A026 = A02(21, 6, 95);
        final int i6 = 4;
        A07 = new SD(A026, i6) { // from class: com.facebook.ads.redexgen.X.K1
            @Override // com.instagram.common.viewpoint.core.SD
            public final boolean A05(JSONArray jSONArray, int i7) {
                return jSONArray.optJSONObject(i7) != null;
            }

            @Override // com.instagram.common.viewpoint.core.SD
            public final boolean A06(JSONArray jSONArray, JSONArray jSONArray2, int i7) {
                return SE.A02(jSONArray.optJSONObject(i7), jSONArray2.optJSONObject(i7));
            }

            @Override // com.instagram.common.viewpoint.core.SD
            public final boolean A07(JSONObject jSONObject, String str) {
                return jSONObject.optJSONObject(str) != null;
            }

            @Override // com.instagram.common.viewpoint.core.SD
            public final boolean A08(JSONObject jSONObject, JSONObject jSONObject2, String str) {
                return SE.A02(jSONObject.optJSONObject(str), jSONObject2.optJSONObject(str));
            }
        };
        final String A027 = A02(27, 6, 50);
        final int i7 = 5;
        A08 = new SD(A027, i7) { // from class: com.facebook.ads.redexgen.X.K0
            @Override // com.instagram.common.viewpoint.core.SD
            public final boolean A05(JSONArray jSONArray, int i8) {
                return jSONArray.optString(i8) != null;
            }

            @Override // com.instagram.common.viewpoint.core.SD
            public final boolean A06(JSONArray jSONArray, JSONArray jSONArray2, int i8) {
                return jSONArray.optString(i8).equals(jSONArray2.optString(i8));
            }

            @Override // com.instagram.common.viewpoint.core.SD
            public final boolean A07(JSONObject jSONObject, String str) {
                return jSONObject.optString(str) != null;
            }

            @Override // com.instagram.common.viewpoint.core.SD
            public final boolean A08(JSONObject jSONObject, JSONObject jSONObject2, String str) {
                return jSONObject.optString(str).equals(jSONObject2.optString(str));
            }
        };
        A02 = A04();
    }

    public SD(String str, int i2) {
    }

    public static SD A00(JSONArray jSONArray, int i2) {
        for (SD type : values()) {
            if (A01[0].charAt(25) != 'B') {
                throw new RuntimeException();
            }
            A01[0] = "tSTzibjLEZmnKLeJSBWWFmo8ABKhWaoK";
            if (type.A05(jSONArray, i2)) {
                return type;
            }
        }
        throw new AssertionError(A02(33, 31, 68));
    }

    public static SD A01(JSONObject jSONObject, String str) {
        for (SD type : values()) {
            String[] strArr = A01;
            if (strArr[3].charAt(28) == strArr[6].charAt(28)) {
                throw new RuntimeException();
            }
            A01[0] = "zRruk8gFetbjQnDa2F20MljfYBQnm1P6";
            if (type.A07(jSONObject, str)) {
                return type;
            }
        }
        throw new AssertionError(A02(33, 31, 68));
    }

    public static /* synthetic */ SD[] A04() {
        return new SD[]{A03, A04, A05, A06, A07, A08};
    }

    public static SD valueOf(String str) {
        return (SD) Enum.valueOf(SD.class, str);
    }

    public static SD[] values() {
        return (SD[]) A02.clone();
    }
}
