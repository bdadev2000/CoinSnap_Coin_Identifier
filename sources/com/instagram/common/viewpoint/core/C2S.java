package com.instagram.common.viewpoint.core;

import android.content.Context;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import okio.Utf8;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.objectweb.asm.Opcodes;

/* renamed from: com.facebook.ads.redexgen.X.2S, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class C2S {
    public static byte[] A01;
    public static String[] A02 = {"pVDJwwImNDAzAU7MVHYB7KJyYkXB8ng6", "xCCCN", "WmAvu667o4AOfXv58a4lhsk2v5Ms6Skb", "l5AJTkPNjTtBLXifXwK6kFeEJ0fMsOcr", "3rlSEGUZnv4yJ13AM8B6pi", "FEUqx4", "USh9ikhtS0UWG5H8nhVral6z3PYi0bQO", "dZN"};
    public static final String[] A03;
    public final C2Y A00;

    public static String A02(int i2, int i3, int i4) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i2, i2 + i3);
        for (int i5 = 0; i5 < copyOfRange.length; i5++) {
            copyOfRange[i5] = (byte) ((copyOfRange[i5] ^ i4) ^ 58);
        }
        return new String(copyOfRange);
    }

    public static void A06() {
        A01 = new byte[]{106, 7, 43, 56, 33, 106, 43, 46, 106, 43, 57, 106, 37, 44, 44, 47, 36, 57, 35, 60, 47, 106, 37, 56, 106, 35, 36, 43, 58, 58, 56, 37, 58, 56, 35, 43, 62, 47, 104, 77, 9, 65, 64, 77, 77, 76, 71, 7, 106, 79, 11, 89, 78, 91, 68, 89, 95, 78, 79, 5, 18, Utf8.REPLACEMENT_BYTE, 54, 42, 122, 47, 41, 122, 47, 52, 62, Utf8.REPLACEMENT_BYTE, 40, 41, 46, 59, 52, 62, 122, 45, 50, 59, 46, 122, 51, 41, 122, 50, 59, 42, 42, Utf8.REPLACEMENT_BYTE, 52, 51, 52, 61, 116, 122, 13, 50, 35, 122, 62, 53, 52, 125, 46, 122, 35, 53, 47, 122, 45, 59, 52, 46, 122, 46, 53, 122, 41, Utf8.REPLACEMENT_BYTE, Utf8.REPLACEMENT_BYTE, 122, 46, 50, 51, 41, 101, 39, 10, 3, 31, 79, 26, 28, 79, 26, 1, 11, 10, 29, 28, 27, 14, 1, 11, 79, 24, 7, 14, 27, 79, 6, 28, 79, 7, 14, 31, 31, 10, 1, 6, 1, 8, 65, 79, 56, 7, 22, 79, 6, 28, 79, 27, 7, 6, 28, 79, 6, 1, 14, 31, 31, 29, 0, 31, 29, 6, 14, 27, 10, 80, 77, 108, 97, 96, 37, 68, 97, 118, 90, 85, 90, 92, 94, 27, 90, 95, 27, 75, 73, 94, 93, 94, 73, 94, 85, 88, 94, 72, 89, 120, 55, Byte.MAX_VALUE, 126, 115, 114, 55, 118, 115, 55, 120, 103, 99, 126, 120, 121, 100, 31, 62, 113, 35, 52, 33, 62, 35, 37, 113, 48, 53, 113, 62, 33, 37, 56, 62, Utf8.REPLACEMENT_BYTE, 34, 77, 122, 111, 112, 109, 107, Utf8.REPLACEMENT_BYTE, 94, 123, 73, Byte.MAX_VALUE, Byte.MAX_VALUE, 58, 124, Byte.MAX_VALUE, 109, Byte.MAX_VALUE, 104, 58, 123, 126, 105, 58, 118, 115, 113, Byte.MAX_VALUE, 58, 110, 114, 115, 105, 110, 81, 64, 25, 88, 84, 25, 112, 25, 74, 92, 92, 80, 87, 94, 25, 77, 81, 80, 74, 6, 60, 10, 16, 23, 69, 22, 16, 7, 8, 12, 22, 22, 12, 10, 11, 69, 12, 22, 69, 11, 10, 18, 69, 7, 0, 12, 11, 2, 69, 23, 0, 19, 12, 0, 18, 0, 1, 75, 76, 74, 125, 120, 67, Byte.MAX_VALUE, 116, 115, 117, Byte.MAX_VALUE, 121, 111, 67, 105, 110, 117, 102, 109, 108, 105, 97, 119, 96, 107, 90, 109, 96, 100, 97, 108, 107, 98, 38, 45, 44, 41, 33, 55, 32, 43, 26, 42, 53, 49, 44, 42, 43, 54, 117, 122, 125, 122, 96, 123, 118, 119, 76, 119, 118, 96, 112, 97, 122, 99, 103, 122, 124, 125, 74, 69, 66, 69, 95, 68, 73, 72, 115, 68, 69, 72, 73, 115, 77, 72, 90, 85, 82, 85, 79, 84, 89, 88, 99, 78, 89, 76, 83, 78, 72, 99, 93, 88, 59, 58, 55, 54, 12, 50, 55, 49, 48, 61, 60, 6, 56, 61, 6, 61, 60, 42, 58, 43, 48, 41, 45, 48, 54, 55, 61, 60, 49, 48, 10, 52, 49, 10, 51, 58, 57, 57, 58, 34, 10, 32, 37, 10, 61, 48, 52, 49, 60, 59, 50, 90, 91, 86, 87, 109, 83, 86, 109, 93, 66, 70, 91, 93, 92, 65, 89, 84, 70, 65, 106, 64, 69, 81, 84, 65, 80, 81, 106, 65, 92, 88, 80, 70, 65, 84, 88, 69, 40, 36, 43, 36, 34, 32, 26, 36, 33, 26, 53, 55, 32, 35, 32, 55, 32, 43, 38, 32, 54, 85, 89, 86, 89, 95, 93, 103, 89, 92, 103, 72, 74, 93, 94, 93, 74, 93, 86, 91, 93, 75, 103, 77, 74, 81, 117, 110, 119, 119, 98, 125, 121, 100, 98, 99, 82, 121, 104, 117, 121, 33, 62, 58, 39, 33, 32, 17, 56, 47, 34, 59, 43, 8, 31, 10, 21, 8, 14, 37, 27, 30, 39, 48, 37, 58, 39, 33, 10, 52, 49, 10, 49, 48, 38, 54, 39, 60, 37, 33, 60, 58, 59, 13, 26, 15, 16, 13, 11, 32, 30, 27, 32, 25, 16, 19, 19, 16, 8, 32, 10, 15, 32, 23, 26, 30, 27, 22, 17, 24, 66, 85, 64, 95, 66, 68, 111, 81, 84, 111, 95, 64, 68, 89, 95, 94, 67, 91, 76, 89, 70, 91, 93, 64, 71, 78, 16, 15, 30, 56, 6, 10, 56, 14, 56, 20, 2, 2, 14, 9, 0, 56, 19, 15, 14, 20};
    }

    static {
        A06();
        A03 = new String[]{A02(452, 7, 105), A02(459, 19, 99), A02(478, 25, 111), A02(503, 15, 8), A02(613, 9, 64), A02(622, 21, 111), A02(643, 27, 69), A02(670, 17, 10), A02(540, 21, 127), A02(418, 16, 22), A02(434, 18, 6), A02(398, 20, 41), A02(696, 20, 93), A02(352, 14, 38), A02(561, 25, 2)};
    }

    public C2S(C2Y c2y) {
        this.A00 = c2y;
    }

    private String A00() {
        return A03(A02(478, 25, 111), A02(60, 69, 96));
    }

    private String A01() {
        return A03(A02(643, 27, 69), A02(Opcodes.LOR, 64, 85));
    }

    private String A03(String str, String str2) {
        String A8T = this.A00.A8T(str, str2);
        if (A8T == null) {
            return str2;
        }
        String value = A02(586, 4, 33);
        return A8T.equals(value) ? str2 : A8T;
    }

    public static List<C2W> A04(String str) throws JSONException {
        if (TextUtils.isEmpty(str) || str.equalsIgnoreCase(A02(586, 4, 33))) {
            return new ArrayList();
        }
        JSONArray jSONArray = new JSONArray(str);
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < jSONArray.length(); i2++) {
            JSONObject jSONObject = (JSONObject) jSONArray.get(i2);
            C2W c2w = new C2W(jSONObject.getInt(A02(601, 12, 116)), jSONObject.getString(A02(590, 11, 55)), jSONObject.optString(A02(366, 16, 63)));
            Iterator<C2W> it = A04(jSONObject.optString(A02(382, 16, 127))).iterator();
            while (it.hasNext()) {
                c2w.A06(it.next());
            }
            arrayList.add(c2w);
        }
        return arrayList;
    }

    public static Map<String, String> A05(String str) {
        if (str != null && !str.isEmpty()) {
            if (A02[0].charAt(31) == '2') {
                throw new RuntimeException();
            }
            A02[0] = "A8tiJT5v19tpxSVqHJBkbDhH2RRDdRkC";
            if (!str.equals(A02(350, 2, 45))) {
                HashMap hashMap = new HashMap();
                try {
                    JSONObject jSONObject = new JSONObject(str);
                    for (String str2 : A03) {
                        if (!jSONObject.has(str2)) {
                            return null;
                        }
                        hashMap.put(str2, jSONObject.getString(str2));
                    }
                    if (A04(jSONObject.getString(A02(670, 17, 10))).size() == 0) {
                        A08(C8E.A28, new C8F(A02(239, 20, 107)));
                        return null;
                    }
                    if (A04(jSONObject.getString(A02(503, 15, 8))).size() == 0) {
                        A08(C8E.A25, new C8F(A02(221, 18, 45)));
                        return null;
                    }
                    return hashMap;
                } catch (JSONException e) {
                    A08(C8E.A27, new C8F(e));
                    return null;
                }
            }
        }
        return null;
    }

    private final void A07() {
        C1130bI A5o = this.A00.A5o();
        A5o.A00(A02(518, 22, 15), 0L);
        A5o.A02();
    }

    public static void A08(int i2, C8F c8f) {
        C1044Zr sdkContext = AbstractC03457i.A00();
        if (sdkContext != null) {
            sdkContext.A07().AA0(A02(687, 9, 19), i2, c8f);
        }
    }

    public final long A09() {
        return this.A00.A7i(A02(518, 22, 15), 0L);
    }

    public final C2W A0A() {
        C2W c2w = new C2W(A00());
        try {
            for (C2W hideAdParent : A04(A03(A02(503, 15, 8), A02(0, 0, 48)))) {
                c2w.A06(hideAdParent);
            }
        } catch (JSONException e) {
            A07();
            A08(C8E.A26, new C8F(e));
        }
        return c2w;
    }

    public final C2W A0B() {
        C2W c2w = new C2W(A01());
        try {
            for (C2W reportAdParent : A04(A03(A02(670, 17, 10), A02(0, 0, 48)))) {
                c2w.A06(reportAdParent);
            }
        } catch (JSONException e) {
            A07();
            A08(C8E.A29, new C8F(e));
        }
        return c2w;
    }

    public final String A0C() {
        return A03(A02(352, 14, 38), A02(0, 0, 48));
    }

    public final String A0D() {
        return A03(A02(398, 20, 41), A02(312, 38, 95));
    }

    public final String A0E() {
        return A03(A02(418, 16, 22), A02(38, 10, 19));
    }

    public final String A0F() {
        return A03(A02(434, 18, 6), A02(48, 12, 17));
    }

    public final String A0G() {
        return A03(A02(459, 19, 99), A02(268, 23, 32));
    }

    public final String A0H() {
        return A03(A02(452, 7, 105), A02(Opcodes.INSTANCEOF, 7, 63));
    }

    public final String A0I() {
        return A03(A02(561, 25, 2), A02(0, 0, 48));
    }

    public final String A0J() {
        return A03(A02(540, 21, 127), A02(200, 21, 1));
    }

    public final String A0K() {
        return A03(A02(622, 21, 111), A02(0, 38, 112));
    }

    public final String A0L() {
        return A03(A02(613, 9, 64), A02(259, 9, 37));
    }

    public final String A0M() {
        return A03(A02(696, 20, 93), A02(291, 21, 3));
    }

    public final void A0N(String str) {
        Map<String, String> A05 = A05(str);
        if (A05 == null || A05.size() != A03.length) {
            return;
        }
        C1130bI A5o = this.A00.A5o();
        for (String str2 : A03) {
            A5o.A01(str2, A05.get(str2));
        }
        if (A02[1].length() == 0) {
            throw new RuntimeException();
        }
        String[] strArr = A02;
        strArr[4] = "MCE7RaiUtGHbfQd9DpKX6Z";
        strArr[5] = "LB7njF";
        A5o.A00(A02(518, 22, 15), System.currentTimeMillis());
        A5o.A02();
    }

    public final boolean A0O(Context context, boolean z2) {
        return (z2 || C0608Im.A2U(context)) && ((A09() > 0L ? 1 : (A09() == 0L ? 0 : -1)) > 0);
    }
}
