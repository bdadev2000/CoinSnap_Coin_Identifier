package com.facebook.ads.redexgen.uinode;

import android.content.Context;
import android.text.TextUtils;
import com.applovin.exoplayer2.common.base.Ascii;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.mbridge.msdk.playercommon.exoplayer2.trackselection.AdaptiveTrackSelection;
import java.util.Arrays;
import java.util.HashMap;
import kotlin.io.encoding.Base64;
import org.json.JSONArray;
import org.json.JSONException;

/* loaded from: assets/audience_network.dex */
public abstract class Ij {
    public static byte[] A00;
    public static String[] A01 = {"UmMlfAJJysNoFzDVq3Qadmy32zpeb1XF", "HllnJbGbN3", "8LLGh47zYIGz9mlPEtFaTcZuh", "UxHymo9qL", "LEtC8FtnVg5ihxRCphfXt4mvpUeUrdN6", "uWIYhcHXlNvGJXs3GUOJ1PEuERlV4x7", "VZrIuYan0GxbimTZrmDwvEADARuUOj", "38Z9W6n0Eu6i9ylO2bMusVthcISfAJzl"};

    public static String A0L(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        int i13 = 0;
        while (true) {
            int length = copyOfRange.length;
            if (A01[2].length() == 18) {
                throw new RuntimeException();
            }
            A01[0] = "coY8s09zVAK7eBnMiZlV9B8LCQZOBRZX";
            if (i13 >= length) {
                return new String(copyOfRange);
            }
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 10);
            i13++;
        }
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 7 out of bounds for length 7
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:626)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    public static HashMap<String, Integer> A0M(Context context) throws JSONException {
        String A2V = C0659Ih.A0R(context).A2V(A0L(24, 35, 123), A0L(22, 2, 109));
        HashMap<String, Integer> hashMap = new HashMap<>();
        JSONArray jSONArray = new JSONArray(A2V);
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            String optString = jSONArray.optString(i10);
            if (!TextUtils.isEmpty(optString)) {
                String A0L = A0L(0, 1, 69);
                if (optString.contains(A0L)) {
                    String[] split = optString.split(A0L);
                    try {
                        hashMap.put(split[0], Integer.valueOf(Integer.parseInt(split[1])));
                    } catch (NumberFormatException unused) {
                        throw new JSONException(A0L(1, 21, 121));
                    }
                } else {
                    hashMap.put(optString, -1);
                }
            }
        }
        return hashMap;
    }

    public static void A0N() {
        A00 = new byte[]{113, 48, Ascii.DC2, Ascii.GS, 84, 7, 83, 3, Ascii.DC2, 1, 0, Ascii.SYN, 83, 0, Ascii.DC2, Ascii.RS, 3, Ascii.US, Ascii.SUB, Ascii.GS, Ascii.DC4, 93, 60, 58, Ascii.DLE, Ascii.NAK, Ascii.NAK, Ascii.CAN, 5, Ascii.CAN, Ascii.RS, Ascii.US, Ascii.DLE, Ascii.GS, 46, Ascii.NAK, Ascii.DC4, 19, 4, Ascii.SYN, 46, Ascii.GS, Ascii.RS, Ascii.SYN, Ascii.SYN, Ascii.CAN, Ascii.US, Ascii.SYN, 46, 19, Ascii.GS, Ascii.DLE, Ascii.DC2, Ascii.SUB, 46, Ascii.GS, Ascii.CAN, 2, 5, 55, 50, 50, 63, 34, 63, 57, 56, 55, 58, 9, 50, 51, 52, 35, 49, 9, 58, 57, 49, 49, 63, 56, 49, 9, 52, 58, 55, 53, Base64.padSymbol, 9, 58, 63, 37, 34, 9, 38, 51, 36, 53, 51, 56, 34, 55, 49, 51, 70, 67, 67, 78, 83, 78, 72, 73, 70, 75, 120, 67, 66, 69, 82, 64, 120, 75, 72, 64, 64, 78, 73, 64, 120, 84, 70, 74, 87, 75, 78, 73, 64, 120, 87, 66, 85, 68, 66, 73, 83, 70, 64, 66, 48, 53, 63, 38, Ascii.SO, 48, 53, 53, 56, 37, 56, 62, 63, 48, Base64.padSymbol, Ascii.SO, Base64.padSymbol, 62, 54, 54, 56, 63, 54, Ascii.SO, 35, 52, 37, 35, 40, Ascii.SO, Base64.padSymbol, 56, 60, 56, 37, 9, Ascii.FF, 6, Ascii.US, 55, 9, Ascii.FF, Ascii.FF, 1, Ascii.FS, 1, 7, 6, 9, 4, 55, 4, 7, Ascii.SI, Ascii.SI, 1, 6, Ascii.SI, 55, Ascii.GS, Ascii.ESC, Ascii.CR, 55, Ascii.FS, Ascii.CR, 5, Ascii.CAN, 55, Ascii.SO, 1, 4, Ascii.CR, 55, Ascii.SO, 7, Ascii.SUB, 55, Ascii.SUB, Ascii.CR, Ascii.US, Ascii.SUB, 1, Ascii.FS, Ascii.CR, 80, 85, 95, 70, 110, 80, 95, 85, 67, 94, 88, 85, 110, 80, 93, 70, 80, 72, 66, 110, 93, 94, 86, 110, 82, 94, 67, 84, 110, 87, 68, 95, 95, 84, 93, 110, 84, 71, 84, 95, 69, 66, Ascii.FS, Ascii.EM, 19, 10, 34, Ascii.FS, 19, Ascii.EM, Ascii.SI, Ascii.DC2, Ascii.DC4, Ascii.EM, 34, Ascii.RS, Ascii.FS, Ascii.RS, Ascii.NAK, Ascii.CAN, 34, Ascii.EM, Ascii.CAN, Ascii.US, 8, Ascii.SUB, 34, Ascii.CAN, Ascii.VT, Ascii.CAN, 19, 9, Ascii.SO, 34, Ascii.SO, Ascii.FS, Ascii.DLE, Ascii.CR, 17, Ascii.DC4, 19, Ascii.SUB, 34, Ascii.SI, Ascii.FS, 9, Ascii.CAN, 17, Ascii.DC4, Ascii.RS, 7, 47, 17, Ascii.RS, Ascii.DC4, 2, Ascii.US, Ascii.EM, Ascii.DC4, 47, Ascii.DC4, Ascii.EM, 3, 0, 17, 4, 19, Ascii.CAN, Ascii.NAK, 2, 47, Ascii.EM, Ascii.RS, Ascii.EM, 4, Ascii.EM, 17, Ascii.FS, 47, 2, Ascii.NAK, 4, 2, 9, 47, Ascii.DC4, Ascii.NAK, Ascii.FS, 17, 9, 47, Ascii.GS, 3, 113, 116, 126, 103, 79, 113, 126, 116, 98, Byte.MAX_VALUE, 121, 116, 79, 116, 121, 99, 96, 113, 100, 115, 120, 117, 98, 79, 125, 113, 104, 79, 98, 117, 100, 98, 105, 79, 115, Byte.MAX_VALUE, 101, 126, 100, 8, Ascii.CR, 7, Ascii.RS, 54, 8, 7, Ascii.CR, Ascii.ESC, 6, 0, Ascii.CR, 54, Ascii.SI, Ascii.FS, 7, 7, Ascii.FF, 5, 54, Ascii.CR, Ascii.FF, Ascii.VT, Ascii.FS, Ascii.SO, 54, Ascii.FF, Ascii.US, Ascii.FF, 7, Ascii.GS, Ascii.SUB, 54, Ascii.SUB, 8, 4, Ascii.EM, 5, 0, 7, Ascii.SO, 54, Ascii.ESC, 8, Ascii.GS, Ascii.FF, Ascii.DLE, Ascii.NAK, Ascii.US, 6, 46, Ascii.DLE, Ascii.US, Ascii.NAK, 3, Ascii.RS, Ascii.CAN, Ascii.NAK, 46, Ascii.CAN, 1, Ascii.DC2, 46, Ascii.NAK, Ascii.DC4, 19, 4, Ascii.SYN, 46, Ascii.DC4, 7, Ascii.DC4, Ascii.US, 5, 2, 46, 2, Ascii.DLE, Ascii.FS, 1, Ascii.GS, Ascii.CAN, Ascii.US, Ascii.SYN, 46, 3, Ascii.DLE, 5, Ascii.DC4, 114, 119, 125, 100, 76, 114, 125, 119, 97, 124, 122, 119, 76, Byte.MAX_VALUE, 124, 112, 114, Byte.MAX_VALUE, 76, 112, 124, 102, 125, 103, 118, 97, 96, 76, 96, 114, 126, 99, Byte.MAX_VALUE, 122, 125, 116, 76, 97, 114, 103, 118, 96, 101, 111, 118, 94, 96, 111, 101, 115, 110, 104, 101, 94, 111, 96, 117, 104, 119, 100, 94, 119, 104, 100, 118, 96, 99, 104, 109, 104, 117, 120, 94, 105, 104, 114, 117, 110, 115, 120, 94, 114, 96, 108, 113, 109, 104, 111, 102, 94, 115, 96, 117, 100, 66, 71, 77, 84, 124, 66, 77, 71, 81, 76, 74, 71, 124, 77, 70, 87, 84, 76, 81, 72, 124, 71, 70, 65, 86, 68, 124, 70, 85, 70, 77, 87, 80, 124, 80, 66, 78, 83, 79, 74, 77, 68, 124, 81, 66, 87, 70, 51, 54, 60, 37, Ascii.CR, 51, 60, 54, 32, Base64.padSymbol, 59, 54, Ascii.CR, 39, 33, 55, Ascii.CR, 62, Base64.padSymbol, 49, 51, 62, Ascii.CR, 49, Base64.padSymbol, 39, 60, 38, 55, 32, 33, 74, 79, 69, 92, 116, 79, 78, 73, 94, 76, 116, 71, 68, 76, 116, 77, 66, 71, 78, 116, 88, 66, 81, 78, 116, 71, 66, 70, 66, 95, 116, 73, 82, 95, 78, 88, 94, 91, 81, 72, 96, 91, 90, 93, 74, 88, 96, 83, 80, 88, 88, 86, 81, 88, 44, 41, 35, 58, Ascii.DC2, 41, 40, 47, 56, 42, Ascii.DC2, 33, 34, 42, 42, 36, 35, 42, Ascii.DC2, 40, 59, 40, 35, 57, Ascii.DC2, 33, 36, 32, 36, 57, Ascii.SI, 10, 0, Ascii.EM, 49, 2, 1, 9, 49, Ascii.SI, 10, 10, 7, Ascii.SUB, 7, 1, 0, Ascii.SI, 2, 49, 2, 1, 9, 9, 7, 0, 9, 49, Ascii.VT, Ascii.CAN, Ascii.VT, 0, Ascii.SUB, Ascii.GS, 49, 2, 7, 3, 7, Ascii.SUB, 100, 97, 107, 114, 90, 105, 106, 98, 90, 100, 97, 97, 108, 113, 108, 106, 107, 100, 105, 90, 105, 106, 98, 98, 108, 107, 98, 90, 108, 107, 90, 104, 96, 104, 106, 119, 124, 90, 96, 115, 96, 107, 113, 118, 90, 105, 108, 104, 108, 113, 66, 71, 77, 84, 124, 79, 76, 68, 124, 66, 71, 71, 74, 87, 74, 76, 77, 66, 79, 124, 79, 76, 68, 68, 74, 77, 68, 124, 80, 70, 80, 80, 74, 76, 77, 124, 70, 85, 70, 77, 87, 80, 124, 66, 79, 84, 66, 90, 80, 99, 102, 108, 117, 93, 113, 103, 108, 102, 93, 99, 102, 102, 107, 118, 107, 109, 108, 99, 110, 93, 102, 103, 96, 119, 101, 93, 110, 109, 101, 101, 107, 108, 101, 93, 113, 118, 99, 97, 105, 118, 112, 99, 97, 103, 123, 126, 116, 109, 69, 105, 114, 117, 111, 118, 126, 69, 111, 105, Byte.MAX_VALUE, 69, 124, 115, 118, Byte.MAX_VALUE, 69, 120, 123, 105, Byte.MAX_VALUE, 126, 69, 104, Byte.MAX_VALUE, 121, 117, 104, 126, 69, 126, 123, 110, 123, 120, 123, 105, Byte.MAX_VALUE, 35, 38, 44, 53, Ascii.GS, 55, 49, 39, Ascii.GS, 49, 42, 45, 48, 54, Ascii.GS, 39, 44, 52, Ascii.GS, 38, 35, 54, 35, Ascii.GS, 
        36, 45, 48, Ascii.GS, 35, 38, 38, 43, 54, 43, 45, 44, 35, 46, Ascii.GS, 46, 45, 37, 37, 43, 44, 37, 123, 125, 70, 125, 120, 109, 120, 70, 117, 118, 126, 126, 112, 119, 126, 70, 117, 112, 116, 112, 109, Base64.padSymbol, 38, 33, 46, 33, 45, 44, Ascii.ETB, 36, 39, 47, 47, 33, 38, 47, Ascii.ETB, 44, 33, 59, 56, 41, 60, 43, 32, Ascii.ETB, 33, 38, 60, 45, 58, 62, 41, 36, Ascii.ETB, 59, 45, 43, 39, 38, 44, 59, 114, 105, 110, 97, 110, 98, 99, 88, 107, 104, 96, 96, 110, 105, 96, 88, 98, 113, 98, 105, 115, 88, 107, 110, 106, 110, 115, Ascii.EM, 2, 5, 10, 5, 9, 8, 51, 0, 3, Ascii.VT, Ascii.VT, 5, 2, Ascii.VT, 51, 5, 1, 1, 9, 8, 5, Ascii.CR, Ascii.CAN, 9, 51, 8, 9, 0, Ascii.CR, Ascii.NAK, 51, 1, Ascii.US, 126, 101, 98, 109, 98, 110, 111, 84, 103, 100, 108, 108, 98, 101, 108, 84, 121, 110, Byte.MAX_VALUE, 121, 114, 84, 103, 98, 102, 98, Byte.MAX_VALUE};
    }

    static {
        A0N();
    }

    public static int A00(Context context) {
        return C0659Ih.A0R(context).A2T(A0L(750, 40, 100), 10);
    }

    public static int A01(Context context) {
        return C0659Ih.A0R(context).A2T(A0L(790, 50, 15), 50);
    }

    public static int A02(Context context) {
        return C0659Ih.A0R(context).A2T(A0L(149, 35, 91), 1);
    }

    public static int A03(Context context) {
        return A0H(context, A0L(59, 46, 92), 0);
    }

    public static int A04(Context context) {
        return A0H(context, A0L(105, 44, 45), 0);
    }

    public static int A05(Context context) {
        return C0659Ih.A0R(context).A2T(A0L(1022, 21, 19), 10);
    }

    public static int A06(Context context) {
        return C0659Ih.A0R(context).A2T(A0L(275, 45, 119), 0);
    }

    public static int A07(Context context) {
        return C0659Ih.A0R(context).A2T(A0L(TTAdConstant.STYLE_SIZE_RADIO_2_3, 36, 33), 10485760);
    }

    public static int A08(Context context) {
        return C0659Ih.A0R(context).A2T(A0L(720, 30, 71), 30);
    }

    public static int A09(Context context) {
        return C0659Ih.A0R(context).A2T(A0L(366, 39, 26), 5);
    }

    public static int A0A(Context context) {
        return C0659Ih.A0R(context).A2T(A0L(405, 46, 99), 0);
    }

    public static int A0B(Context context) {
        return C0659Ih.A0R(context).A2T(A0L(451, 43, 123), 0);
    }

    public static int A0C(Context context) {
        return C0659Ih.A0R(context).A2T(A0L(494, 41, 25), 0);
    }

    public static int A0D(Context context) {
        return C0659Ih.A0R(context).A2T(A0L(535, 53, 11), 0);
    }

    public static int A0E(Context context) {
        return C0659Ih.A0R(context).A2T(A0L(588, 47, 41), 0);
    }

    public static int A0F(Context context) {
        return C0659Ih.A0R(context).A2T(A0L(1084, 27, 13), 30);
    }

    public static int A0G(Context context) {
        return C0659Ih.A0R(context).A2T(A0L(1145, 27, 1), 20);
    }

    public static int A0H(Context context, String str, int i10) {
        int A2T = C0659Ih.A0R(context).A2T(str, i10);
        if (A2T >= 0 && A2T < 101) {
            return A2T;
        }
        return i10;
    }

    public static long A0I(Context context) {
        return C0659Ih.A0R(context).A2U(A0L(320, 46, 122), AdaptiveTrackSelection.DEFAULT_MIN_TIME_BETWEEN_BUFFER_REEVALUTATION_MS);
    }

    public static long A0J(Context context) {
        return C0659Ih.A0R(context).A2T(A0L(1043, 41, 66), 300) * 1000;
    }

    public static long A0K(Context context) {
        return C0659Ih.A0R(context).A2U(A0L(1111, 34, 102), 500L);
    }

    public static boolean A0O(Context context) {
        return C0659Ih.A0R(context).A2Z(A0L(184, 49, 98), true);
    }

    public static boolean A0P(Context context) {
        return C0659Ih.A0R(context).A2Z(A0L(702, 18, 53), false);
    }

    public static boolean A0Q(Context context) {
        return C0659Ih.A0R(context).A2Z(A0L(840, 49, 41), true);
    }

    public static boolean A0R(Context context) {
        return C0659Ih.A0R(context).A2Z(A0L(889, 45, 8), false);
    }

    public static boolean A0S(Context context) {
        return C0659Ih.A0R(context).A2Z(A0L(233, 42, 59), true);
    }

    public static boolean A0T(Context context) {
        return C0659Ih.A0R(context).A2Z(A0L(934, 42, 16), false);
    }

    public static boolean A0U(Context context) {
        return C0659Ih.A0R(context).A2Z(A0L(635, 31, 88), false);
    }

    public static boolean A0V(Context context) {
        return C0659Ih.A0R(context).A2Z(A0L(976, 46, 72), true);
    }
}
