package com.instagram.common.viewpoint.core;

import java.util.Arrays;
import okio.Utf8;
import org.json.JSONObject;
import org.objectweb.asm.Opcodes;

/* renamed from: com.facebook.ads.redexgen.X.1a, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC01891a {
    public static byte[] A00;

    static {
        A0C();
    }

    public static String A02(int i2, int i3, int i4) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i2, i2 + i3);
        for (int i5 = 0; i5 < copyOfRange.length; i5++) {
            copyOfRange[i5] = (byte) ((copyOfRange[i5] - i4) - 121);
        }
        return new String(copyOfRange);
    }

    public static void A0C() {
        A00 = new byte[]{-8, 33, 36, 40, 26, -43, -10, 25, 15, 59, 58, 64, 53, 58, 65, 49, -20, 35, 45, 64, 47, 52, 53, 58, 51, 57, 101, 100, 106, 95, 100, 107, 91, 22, 109, 87, 106, 89, 94, 95, 100, 93, 22, 106, 101, 22, 104, 91, 89, 91, 95, 108, 91, 22, 87, 100, 22, 95, 100, 35, 93, 87, 99, 91, 22, 104, 91, 109, 87, 104, 90, 1, 45, 44, 50, 39, 44, 51, 35, -34, 53, 31, 50, 33, 38, 39, 44, 37, -34, 50, 45, -34, 48, 35, 33, 35, 39, 52, 35, -34, 57, 47, 51, 31, 44, 50, 39, 50, 55, 59, 57, 33, 51, 48, 48, 35, 44, 33, 55, 59, 12, 45, 34, 43, 38, 43, 36, -35, 38, 43, -35, 24, 48, 34, 32, 48, 26, 48, -28, 5, -6, 3, -2, 3, -4, -75, -2, 3, -61, -61, -61, -50, -31, -13, -35, -18, -32, -100, -27, -22, -100, -41, -17, -31, -33, -17, -39, -17, -38, -14, -16, -9, 44, 73, 72, 71, 76, 72, 75, 62, 61, -9, 11, 10, 5, -7, 2, -1, -7, 1, -11, -1, 4, -11, 14, 40, 60, 59, 54, 42, 51, 48, 42, 50, 38, 54, 55, 44, 53, 48, 53, 46, 84, 93, 96, 100, 86, 80, 82, 85, 31, 43, 42, 48, 37, 42, 49, 33, 27, 51, 29, 48, 31, 36, 37, 42, 35, 57, 69, 68, 74, Utf8.REPLACEMENT_BYTE, 68, 75, 59, 53, 77, 55, 74, 57, 62, Utf8.REPLACEMENT_BYTE, 68, 61, 53, 60, 69, 72, 53, 72, 59, 77, 55, 72, 58, 51, 49, 58, 49, 62, 53, 47, 43, 62, 49, 67, 45, 62, 48, 10, 8, 17, 8, 21, 12, 6, 2, 23, 8, 27, 23, 80, 67, 85, Utf8.REPLACEMENT_BYTE, 80, 66, 61, 71, 76, 61, 86, -7, -15, -17, -10, -15, -18, -19, -20, -15, -19, -16, -29, -30};
    }

    public static C1W A00(JSONObject jSONObject) {
        return new C1V().A06(A08(jSONObject)).A07(A07(jSONObject)).A05(A09(jSONObject)).A04(A06(jSONObject)).A08();
    }

    public static C01941f A01(JSONObject jSONObject) {
        return new C01931e().A06(A0A(jSONObject)).A07(A0B(jSONObject)).A05(A05(jSONObject)).A04(A04(jSONObject)).A08();
    }

    public static String A03(JSONObject jSONObject) {
        JSONObject optJSONObject = jSONObject.optJSONObject(A02(279, 12, 42));
        String A02 = A02(Opcodes.IRETURN, 9, 96);
        return optJSONObject == null ? A02 : optJSONObject.optString(A02(306, 9, 5), A02);
    }

    public static String A04(JSONObject jSONObject) {
        JSONObject optJSONObject = jSONObject.optJSONObject(A02(279, 12, 42));
        String A02 = A02(120, 18, 68);
        return optJSONObject == null ? A02 : optJSONObject.optString(A02(Opcodes.PUTFIELD, 14, 29), A02);
    }

    public static String A05(JSONObject jSONObject) {
        JSONObject optJSONObject = jSONObject.optJSONObject(A02(279, 12, 42));
        String A02 = A02(Opcodes.L2D, 13, 28);
        return optJSONObject == null ? A02 : optJSONObject.optString(A02(Opcodes.MONITOREXIT, 17, 78), A02);
    }

    public static String A06(JSONObject jSONObject) {
        JSONObject optJSONObject = jSONObject.optJSONObject(A02(279, 12, 42));
        String A02 = A02(0, 8, 60);
        return optJSONObject == null ? A02 : optJSONObject.optString(A02(212, 8, 120), A02);
    }

    public static String A07(JSONObject jSONObject) {
        JSONObject optJSONObject = jSONObject.optJSONObject(A02(279, 12, 42));
        String A02 = A02(71, 49, 69);
        return optJSONObject == null ? A02 : optJSONObject.optString(A02(237, 28, 93), A02);
    }

    public static String A08(JSONObject jSONObject) {
        JSONObject optJSONObject = jSONObject.optJSONObject(A02(279, 12, 42));
        String A02 = A02(25, 46, Opcodes.LUSHR);
        return optJSONObject == null ? A02 : optJSONObject.optString(A02(265, 14, 83), A02);
    }

    public static String A09(JSONObject jSONObject) {
        JSONObject optJSONObject = jSONObject.optJSONObject(A02(279, 12, 42));
        String A02 = A02(8, 17, 83);
        return optJSONObject == null ? A02 : optJSONObject.optString(A02(220, 17, 67), A02);
    }

    public static String A0A(JSONObject jSONObject) {
        JSONObject optJSONObject = jSONObject.optJSONObject(A02(279, 12, 42));
        String A02 = A02(Opcodes.DCMPL, 17, 3);
        return optJSONObject == null ? A02 : optJSONObject.optString(A02(291, 11, 101), A02);
    }

    public static String A0B(JSONObject jSONObject) {
        JSONObject optJSONObject = jSONObject.optJSONObject(A02(279, 12, 42));
        String A02 = A02(Opcodes.JSR, 4, 14);
        return optJSONObject == null ? A02 : optJSONObject.optString(A02(302, 4, 13), A02);
    }
}
