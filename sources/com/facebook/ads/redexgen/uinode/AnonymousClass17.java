package com.facebook.ads.redexgen.uinode;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import com.applovin.exoplayer2.common.base.Ascii;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import kotlin.io.encoding.Base64;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.redexgen.X.17, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public abstract class AnonymousClass17 {
    public static byte[] A00;
    public static String[] A01 = {"qHmRz", "buvn2cesYrN8zmkoMAJdpkbnyQRY3iAF", "x7vS8I9TWcDRkC3QyQGWlMzhObF4g2wW", "AIjy2jeTbkREqnWnmOA9dVfWABJZ", "IfUpOWHYsX9n2UOxpamTmBNI3XVXxi7a", "s9Ktc", "3piv7SWQV7vtTtwTZRFeo4G9v1NaSSob", "iW7v8IxehIW1LC67DBoujqNPrB3dw9pM"};

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 61 out of bounds for length 61
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:626)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    public static AnonymousClass14 A01(C1070Yn c1070Yn, JSONObject jSONObject, String str, boolean z10, int i10, int i11) {
        if (jSONObject == null) {
            return new AnonymousClass14();
        }
        L4.A02(c1070Yn, A02(0, 23, 77));
        String optString = jSONObject.optString(A02(371, 10, 84));
        int optInt = jSONObject.optInt(A02(116, 12, 73), 0);
        String optString2 = jSONObject.optString(A02(253, 13, 84));
        String A02 = LJ.A02(jSONObject, A02(266, 12, 117));
        Uri A002 = TextUtils.isEmpty(A02) ? null : AbstractC0721Ky.A00(A02);
        String A022 = LJ.A02(jSONObject, A02(128, 4, 27));
        String A012 = LY.A01(A022);
        String A023 = LJ.A02(jSONObject, A02(101, 15, 115));
        String A024 = LJ.A02(jSONObject, A02(485, 5, 93));
        String A025 = LJ.A02(jSONObject, A02(477, 8, 5));
        String A026 = LJ.A02(jSONObject, A02(278, 8, 19));
        String A027 = LJ.A02(jSONObject, A02(431, 14, 38));
        String A028 = LJ.A02(jSONObject, A02(295, 16, 116));
        String A029 = LJ.A02(jSONObject, A02(445, 21, 93));
        String A0210 = LJ.A02(jSONObject, A02(87, 14, 42));
        String A0211 = LJ.A02(jSONObject, A02(351, 20, 77));
        String A0212 = LJ.A02(jSONObject, A02(335, 16, 70));
        String A0213 = LJ.A02(jSONObject, A02(318, 17, 98));
        String A0214 = LJ.A02(jSONObject, A02(132, 14, 22));
        FT A0215 = FT.A02(jSONObject, c1070Yn);
        JP A003 = JP.A00(jSONObject.optJSONObject(A02(286, 4, 64)));
        JP A004 = JP.A00(jSONObject.optJSONObject(A02(290, 5, 93)));
        JQ A005 = JQ.A00(jSONObject.optJSONObject(A02(466, 11, 125)));
        String A0216 = LJ.A02(jSONObject, A02(490, 15, 84));
        boolean optBoolean = jSONObject.optBoolean(A02(238, 15, 6));
        boolean optBoolean2 = jSONObject.optBoolean(A02(219, 19, 21));
        int optInt2 = jSONObject.optInt(A02(406, 25, 21), 4);
        int optInt3 = jSONObject.optInt(A02(381, 25, 112), 0);
        int optInt4 = jSONObject.optInt(A02(569, 31, 30), 0);
        int optInt5 = jSONObject.optInt(A02(600, 26, 108), 1000);
        JSONObject optJSONObject = jSONObject.optJSONObject(A02(53, 15, 6));
        JP A006 = optJSONObject != null ? JP.A00(optJSONObject) : null;
        String A0217 = LJ.A02(jSONObject, A02(68, 19, 17));
        EnumC02290j A007 = AbstractC02310l.A00(jSONObject);
        Collection<String> A03 = AbstractC02310l.A03(c1070Yn, jSONObject);
        String A0218 = LJ.A02(jSONObject, A02(560, 9, 56));
        long optLong = jSONObject.optLong(A02(536, 24, 95), -1L);
        String A0219 = LJ.A02(jSONObject, A02(527, 9, 77));
        String A0220 = A02(PglCryptUtils.ENCRYPT_FAILED, 22, 61);
        JU ju = !jSONObject.has(A0220) ? JU.A03 : jSONObject.optBoolean(A0220) ? JU.A05 : JU.A04;
        boolean optBoolean3 = jSONObject.optBoolean(A02(190, 29, 72));
        int optInt6 = jSONObject.optInt(A02(154, 36, 110), 100);
        ArrayList arrayList = null;
        try {
            JSONArray optJSONArray = jSONObject.optJSONArray(A02(146, 8, 0));
            if (optJSONArray != null && optJSONArray.length() > 0) {
                int length = optJSONArray.length();
                ArrayList arrayList2 = new ArrayList(length);
                for (int i12 = 0; i12 < length; i12++) {
                    try {
                        arrayList2.add(A01(c1070Yn, optJSONArray.getJSONObject(i12), str, true, i12, length));
                    } catch (JSONException e2) {
                        e = e2;
                        if (A01[6].charAt(19) != 'e') {
                            throw new RuntimeException();
                        }
                        String[] strArr = A01;
                        strArr[0] = "nA4Cb";
                        strArr[5] = "npWbY";
                        arrayList = arrayList2;
                        c1070Yn.A07().A9a(A02(311, 7, 91), C8A.A2A, new C8B(e));
                        Log.e(C1188bK.A0E, A02(23, 30, 50), e);
                        return new AnonymousClass14(A0217, A012, A022, A023, A024, A025, A026, A027, A028, A029, A0210, A0211, A0212, A0213, A0214, A006, A0215, A003, A004, A005, A0218, A0219, optLong, ju, z10, i10, i11, arrayList, str, optString, optInt, optString2, A002, A0216, optBoolean, optBoolean2, optInt3, optInt2, optInt4, optInt5, A007, A03, optInt6, optBoolean3);
                    }
                }
                arrayList = arrayList2;
            }
        } catch (JSONException e10) {
            e = e10;
        }
        return new AnonymousClass14(A0217, A012, A022, A023, A024, A025, A026, A027, A028, A029, A0210, A0211, A0212, A0213, A0214, A006, A0215, A003, A004, A005, A0218, A0219, optLong, ju, z10, i10, i11, arrayList, str, optString, optInt, optString2, A002, A0216, optBoolean, optBoolean2, optInt3, optInt2, optInt4, optInt5, A007, A03, optInt6, optBoolean3);
    }

    public static String A02(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 112);
        }
        return new String(copyOfRange);
    }

    public static void A03() {
        A00 = new byte[]{-2, 50, 33, 38, 34, 43, 32, 34, -35, Ascii.VT, 34, 49, 52, 44, 47, 40, -35, 9, 44, Ascii.RS, 33, 34, 33, -9, Ascii.DLE, 3, 4, Ascii.SO, 7, -62, Ascii.SYN, 17, -62, Ascii.DC2, 3, Ascii.DC4, Ascii.NAK, 7, -62, 5, 3, Ascii.DC4, 17, Ascii.ETB, Ascii.NAK, 7, Ascii.SO, -62, 6, 3, Ascii.SYN, 3, -48, -41, -38, -43, -39, -34, -27, -33, -39, -37, -23, -43, -33, -39, -27, -28, -30, -27, -32, -28, -23, -16, -22, -28, -26, -12, -32, -19, -22, -17, -20, -32, -10, -13, -19, -5, -2, -7, Ascii.SO, Ascii.FF, -5, 8, Ascii.CR, 6, -5, Ascii.SO, 3, 9, 8, 68, 71, 89, 72, 85, 87, 76, 86, 72, 85, 66, 81, 68, 80, 72, Ascii.SUB, 39, Ascii.CAN, 37, 40, 32, 40, Ascii.CAN, 45, 50, 41, Ascii.RS, -19, -6, -17, 4, -23, -25, -14, -14, -27, -6, -11, -27, -25, -23, -6, -17, -11, -12, -45, -47, -30, -33, -27, -29, -43, -36, 65, 77, 76, 82, 63, 71, 76, 67, 80, Base64.padSymbol, 84, 71, 67, 85, 63, 64, 71, 74, 71, 82, 87, Base64.padSymbol, 65, 70, 67, 65, 73, Base64.padSymbol, 71, 76, 82, 67, 80, 84, 63, 74, Ascii.ESC, 39, 38, 44, Ascii.EM, 33, 38, Ascii.GS, 42, Ascii.ETB, 46, 33, Ascii.GS, 47, Ascii.EM, Ascii.SUB, 33, 36, 33, 44, 49, Ascii.ETB, Ascii.GS, 38, Ascii.EM, Ascii.SUB, 36, Ascii.GS, Ascii.FS, -22, -13, -26, -25, -15, -22, -28, -8, -13, -26, -11, -8, -19, -12, -7, -28, -15, -12, -20, -37, -28, -41, -40, -30, -37, -43, -20, -33, -37, -19, -43, -30, -27, -35, 41, 50, 39, 54, Base64.padSymbol, 52, 56, 41, 40, 35, 39, 52, 49, 75, 71, 70, 73, 68, 72, 84, 82, 82, 70, 83, 73, -21, -24, -28, -25, -17, -20, -15, -24, Ascii.EM, 19, Ascii.US, Ascii.RS, 54, 58, 46, 52, 50, 80, 77, 82, 79, 67, 72, 73, 87, 71, 86, 77, 84, 88, 77, 83, 82, 59, 44, Base64.padSymbol, 62, 52, 57, 50, 66, 51, 71, 69, 55, 49, 70, 68, 51, 64, 69, 62, 51, 70, 59, 65, 64, 38, 34, Ascii.ETB, 47, Ascii.NAK, 42, 40, Ascii.ETB, 36, 41, 34, Ascii.ETB, 42, Ascii.US, 37, 36, 45, 47, 44, 42, 44, 49, 34, 33, Ascii.FS, 49, 47, Ascii.RS, 43, 48, 41, Ascii.RS, 49, 38, 44, 43, 54, 41, 53, 57, 41, 55, 56, 35, 45, 40, 83, 78, 65, 80, 83, 72, 79, 84, 63, 67, 79, 77, 80, 82, 69, 83, 83, 63, 81, 85, 65, 76, 73, 84, 89, -8, -13, -26, -11, -8, -19, -12, -7, -28, -15, -12, -20, -28, -23, -22, -15, -26, -2, -28, -8, -22, -24, -12, -13, -23, 9, 5, -7, -1, -9, 2, -11, -7, 5, 4, 10, -5, Ascii.SO, 10, 64, Base64.padSymbol, 60, 59, 64, 60, 63, 50, 49, 44, 65, 63, 46, 59, 64, 57, 46, 65, 54, 60, 59, 96, 97, 78, 95, 76, 95, 78, 97, 86, 91, 84, -24, -22, -41, -23, -34, -23, -31, -38, 65, 54, 65, 57, 50, 57, 55, 41, 40, 35, 54, 41, 52, 51, 54, 56, 35, 57, 54, 48, 35, Ascii.SYN, 17, Ascii.DC2, Ascii.FS, Ascii.FF, Ascii.SO, 34, 33, Ascii.FS, Ascii.GS, Ascii.EM, Ascii.SO, 38, Ascii.FF, Ascii.DC2, Ascii.ESC, Ascii.SO, Ascii.SI, Ascii.EM, Ascii.DC2, 17, 51, 38, 33, 34, 44, Ascii.FS, 42, 45, 33, 69, 56, 51, 52, 62, 46, 63, 65, 52, 59, 62, 48, 51, 46, 66, 56, 73, 52, 46, 49, 72, 67, 52, 66, Ascii.RS, 17, Ascii.FF, Ascii.CR, Ascii.ETB, 7, Ascii.GS, Ascii.SUB, Ascii.DC4, 4, -9, -13, 5, -17, -16, -9, -6, -9, 2, 7, -19, -15, -10, -13, -15, -7, -19, -9, -4, -9, 2, -9, -17, -6, -19, -14, -13, -6, -17, 7, 82, 69, 65, 83, Base64.padSymbol, 62, 69, 72, 69, 80, 85, 59, 63, 68, 65, 63, 71, 59, 69, 74, 80, 65, 78, 82, Base64.padSymbol, 72};
        String[] strArr = A01;
        if (strArr[1].charAt(29) != strArr[4].charAt(29)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A01;
        strArr2[0] = "aYUm7";
        strArr2[5] = "aSssW";
    }

    static {
        A03();
    }

    public static AnonymousClass14 A00(C1070Yn c1070Yn, JSONObject jSONObject, String str) {
        return A01(c1070Yn, jSONObject, str, false, -1, 0);
    }
}
