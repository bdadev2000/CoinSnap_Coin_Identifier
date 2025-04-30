package com.meta.analytics.dsp.uinode;

import android.content.Context;
import android.text.TextUtils;
import com.applovin.exoplayer2.common.base.Ascii;
import com.facebook.ads.internal.adreportingconfig.AdReportingReason;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.redexgen.X.2S, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class C2S {
    public static byte[] A01;
    public static String[] A02 = {"9okEwBsJnxm4XP2uMdCs1TTs0ipxbCrx", "KwR5WWC5sufK43WzM862skA54ooPALBv", "gy93sI55ZIYYvh5J8OUT9qm2p9", "dxYBmhUa98SUIpbIHX6MiqZ5bWUPty4B", "67xZp2aOxtSOd7RgrTL8HL2Ne7", "07dtCbgrw0W8dRsWClXlOnRD4KzojNVd", "fNc2y58JlCy0XZUWB5ryiRvO0DobwJiD", "gLrzPSgUGRY8V9c6gRfYWq9AMfEa3UYZ"};
    public static final String[] A03;
    public final C2Y A00;

    public static String A02(int i9, int i10, int i11) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i9, i9 + i10);
        for (int i12 = 0; i12 < copyOfRange.length; i12++) {
            copyOfRange[i12] = (byte) ((copyOfRange[i12] - i11) - 96);
        }
        return new String(copyOfRange);
    }

    public static void A06() {
        A01 = new byte[]{-90, -45, -25, -8, -15, -90, -25, -22, -90, -25, -7, -90, -11, -20, -20, -21, -12, -7, -17, -4, -21, -90, -11, -8, -90, -17, -12, -25, -10, -10, -8, -11, -10, -8, -17, -25, -6, -21, -69, -34, -102, -30, -29, -34, -34, -33, -24, -88, -86, -51, -119, -37, -50, -39, -40, -37, -35, -50, -51, -105, 33, 62, 69, 73, -7, 78, 76, -7, 78, 71, 61, 62, 75, 76, 77, 58, 71, 61, -7, 80, 65, 58, 77, -7, 66, 76, -7, 65, 58, 73, 73, 62, 71, 66, 71, 64, 7, -7, 48, 65, 82, -7, 61, 72, 71, 0, 77, -7, 82, 72, 78, -7, 80, 58, 71, 77, -7, 77, 72, -7, 76, 62, 62, -7, 77, 65, 66, 76, Ascii.CAN, -54, -25, -18, -14, -94, -9, -11, -94, -9, -16, -26, -25, -12, -11, -10, -29, -16, -26, -94, -7, -22, -29, -10, -94, -21, -11, -94, -22, -29, -14, -14, -25, -16, -21, -16, -23, -80, -94, -39, -22, -5, -94, -21, -11, -94, -10, -22, -21, -11, -94, -21, -16, -29, -14, -14, -12, -15, -14, -12, -21, -29, -10, -25, -63, -61, -28, -33, -32, -101, -68, -33, 8, Ascii.FS, 41, Ascii.FS, 34, 32, -37, Ascii.FS, Ascii.US, -37, 43, 45, 32, 33, 32, 45, 32, 41, Ascii.RS, 32, 46, -72, -39, -118, -46, -45, -50, -49, -118, -53, -50, -118, -39, -38, -34, -45, -39, -40, -35, 19, 52, -27, 55, 42, 53, 52, 55, 57, -27, 38, 41, -27, 52, 53, 57, 46, 52, 51, 56, -37, -18, -7, -8, -5, -3, -87, -54, -19, -18, 0, 0, -69, 1, 0, Ascii.DC2, 0, Ascii.CR, -69, -4, -1, Ascii.SO, -69, 7, 4, 6, 0, -69, Ascii.SI, 3, 4, Ascii.SO, -56, -39, -22, -111, -46, -34, -111, -70, -111, -28, -42, -42, -38, -33, -40, -111, -27, -39, -38, -28, -80, 0, Ascii.SYN, Ascii.FS, Ascii.EM, -57, Ascii.SUB, Ascii.FS, 9, Ascii.DC4, Ascii.DLE, Ascii.SUB, Ascii.SUB, Ascii.DLE, Ascii.SYN, Ascii.NAK, -57, Ascii.DLE, Ascii.SUB, -57, Ascii.NAK, Ascii.SYN, Ascii.RS, -57, 9, Ascii.FF, Ascii.DLE, Ascii.NAK, Ascii.SO, -57, Ascii.EM, Ascii.FF, Ascii.GS, Ascii.DLE, Ascii.FF, Ascii.RS, Ascii.FF, Ascii.VT, -43, -4, -2, -17, -14, -19, -15, -10, -3, -9, -15, -13, 1, -19, 3, 0, -9, -44, -39, -38, -35, -43, -29, -42, -33, -48, -39, -42, -46, -43, -38, -33, -40, 39, 44, 45, 48, 40, 54, 41, 50, 35, 51, 52, 56, 45, 51, 50, 55, Ascii.DC4, Ascii.ETB, Ascii.FS, Ascii.ETB, 33, Ascii.SYN, 19, Ascii.DC2, Ascii.CR, Ascii.DC2, 19, 33, 17, 32, Ascii.ETB, Ascii.RS, 34, Ascii.ETB, Ascii.GS, Ascii.FS, Ascii.EM, Ascii.FS, 33, Ascii.FS, 38, Ascii.ESC, Ascii.CAN, Ascii.ETB, Ascii.DC2, Ascii.ESC, Ascii.FS, Ascii.ETB, Ascii.CAN, Ascii.DC2, Ascii.DC4, Ascii.ETB, 33, 36, 41, 36, 46, 35, 32, Ascii.US, Ascii.SUB, 45, 32, 43, 42, 45, 47, Ascii.SUB, Ascii.FS, Ascii.US, -36, -35, -40, -39, -45, -43, -40, 49, 50, 45, 46, 40, 42, 45, 40, 45, 46, 60, 44, 59, 50, 57, 61, 50, 56, 55, 40, 41, 36, 37, Ascii.US, 33, 36, Ascii.US, 38, 47, 44, 44, 47, 55, Ascii.US, 53, 48, Ascii.US, 40, 37, 33, 36, 41, 46, 39, -26, -25, -30, -29, -35, -33, -30, -35, -19, -18, -14, -25, -19, -20, -15, 68, 57, 75, 76, 55, 77, 72, 60, 57, 76, 61, 60, 55, 76, 65, 69, 61, 75, 76, 57, 69, 72, -28, -40, -27, -40, -34, -36, -42, -40, -37, -42, -25, -23, -36, -35, -36, -23, -36, -27, -38, -36, -22, 61, 49, 62, 49, 55, 53, 47, 49, 52, 47, 64, 66, 53, 54, 53, 66, 53, 62, 51, 53, 67, 47, 69, 66, 57, -11, -4, -13, -13, -16, -15, -11, -22, -16, -17, -32, -11, -26, -7, -11, 74, 75, 79, 68, 74, 73, 58, 81, 60, 71, 80, 64, 53, 40, 51, 50, 53, 55, 34, 36, 39, -38, -51, -40, -41, -38, -36, -57, -55, -52, -57, -52, -51, -37, -53, -38, -47, -40, -36, -47, -41, -42, Ascii.SYN, 9, Ascii.DC4, 19, Ascii.SYN, Ascii.CAN, 3, 5, 8, 3, 10, 19, Ascii.DLE, Ascii.DLE, 19, Ascii.ESC, 3, Ascii.EM, Ascii.DC4, 3, Ascii.FF, 9, 5, 8, Ascii.CR, Ascii.DC2, Ascii.VT, 7, -6, 5, 4, 7, 9, -12, -10, -7, -12, 4, 5, 9, -2, 4, 3, 8, -41, -54, -43, -44, -41, -39, -50, -45, -52, 75, 60, 77, 51, 53, 65, 51, 61, 51, 71, 57, 57, 61, 66, 59, 51, 72, 60, 61, 71};
    }

    static {
        A06();
        A03 = new String[]{A02(452, 7, 20), A02(459, 19, 105), A02(478, 25, 96), A02(503, 15, 30), A02(613, 9, 99), A02(622, 21, 8), A02(643, 27, 68), A02(670, 17, 53), A02(540, 21, 23), A02(418, 16, 83), A02(434, 18, 91), A02(398, 20, 78), A02(696, 20, 116), A02(352, 14, 46), A02(561, 25, 112)};
    }

    public C2S(C2Y c2y) {
        this.A00 = c2y;
    }

    private String A00() {
        return A03(A02(478, 25, 96), A02(60, 69, 121));
    }

    private String A01() {
        return A03(A02(643, 27, 68), A02(129, 64, 34));
    }

    private String A03(String str, String str2) {
        String A85 = this.A00.A85(str, str2);
        if (A85 == null) {
            return str2;
        }
        String value = A02(586, 4, 39);
        return A85.equals(value) ? str2 : A85;
    }

    public static List<C2W> A04(String str) throws JSONException {
        if (TextUtils.isEmpty(str) || str.equalsIgnoreCase(A02(586, 4, 39))) {
            return new ArrayList();
        }
        JSONArray jSONArray = new JSONArray(str);
        List<AdReportingReason> children = new ArrayList<>();
        for (int i9 = 0; i9 < jSONArray.length(); i9++) {
            JSONObject jSONObject = (JSONObject) jSONArray.get(i9);
            C2W c2w = new C2W(jSONObject.getInt(A02(601, 12, 123)), jSONObject.getString(A02(590, 11, 33)), jSONObject.optString(A02(366, 16, 17)));
            Iterator<C2W> it = A04(jSONObject.optString(A02(382, 16, 100))).iterator();
            while (it.hasNext()) {
                c2w.A06(it.next());
            }
            children.add(c2w);
            if (A02[0].charAt(8) == 'D') {
                throw new RuntimeException();
            }
            A02[1] = "UoOnH9Hv65m0hYQCpY1Dh";
        }
        return children;
    }

    public static Map<String, String> A05(String str) {
        if (str == null || str.isEmpty() || str.equals(A02(350, 2, 65))) {
            return null;
        }
        HashMap hashMap = new HashMap();
        try {
            JSONObject jSONObject = new JSONObject(str);
            for (String str2 : A03) {
                if (!jSONObject.has(str2)) {
                    return null;
                }
                hashMap.put(str2, jSONObject.getString(str2));
            }
            if (A04(jSONObject.getString(A02(670, 17, 53))).size() == 0) {
                A08(C8A.A28, new C8B(A02(239, 20, 101)));
                return null;
            }
            if (A04(jSONObject.getString(A02(503, 15, 30))).size() == 0) {
                A08(C8A.A25, new C8B(A02(221, 18, 10)));
                return null;
            }
            return hashMap;
        } catch (JSONException e4) {
            A08(C8A.A27, new C8B(e4));
            return null;
        }
    }

    private final void A07() {
        C1685aD A5S = this.A00.A5S();
        A5S.A00(A02(518, 22, 120), 0L);
        A5S.A02();
    }

    public static void A08(int i9, C8B c8b) {
        C1635Ym sdkContext = AbstractC09637e.A00();
        if (sdkContext != null) {
            sdkContext.A07().A9a(A02(687, 9, 5), i9, c8b);
        }
    }

    public final long A09() {
        return this.A00.A7K(A02(518, 22, 120), 0L);
    }

    public final C2W A0A() {
        C2W c2w = new C2W(A00());
        try {
            for (C2W hideAdParent : A04(A03(A02(503, 15, 30), A02(0, 0, 94)))) {
                c2w.A06(hideAdParent);
            }
        } catch (JSONException e4) {
            A07();
            A08(C8A.A26, new C8B(e4));
        }
        return c2w;
    }

    public final C2W A0B() {
        C2W c2w = new C2W(A01());
        try {
            for (C2W reportAdParent : A04(A03(A02(670, 17, 53), A02(0, 0, 94)))) {
                c2w.A06(reportAdParent);
            }
        } catch (JSONException e4) {
            A07();
            A08(C8A.A29, new C8B(e4));
        }
        return c2w;
    }

    public final String A0C() {
        return A03(A02(352, 14, 46), A02(0, 0, 94));
    }

    public final String A0D() {
        return A03(A02(398, 20, 78), A02(312, 38, 71));
    }

    public final String A0E() {
        return A03(A02(418, 16, 83), A02(38, 10, 26));
    }

    public final String A0F() {
        return A03(A02(434, 18, 91), A02(48, 12, 9));
    }

    public final String A0G() {
        return A03(A02(459, 19, 105), A02(268, 23, 59));
    }

    public final String A0H() {
        return A03(A02(452, 7, 20), A02(193, 7, 27));
    }

    public final String A0I() {
        return A03(A02(561, 25, 112), A02(0, 0, 94));
    }

    public final String A0J() {
        return A03(A02(540, 21, 23), A02(200, 21, 91));
    }

    public final String A0K() {
        return A03(A02(622, 21, 8), A02(0, 38, 38));
    }

    public final String A0L() {
        return A03(A02(613, 9, 99), A02(259, 9, 41));
    }

    public final String A0M() {
        return A03(A02(696, 20, 116), A02(291, 21, 17));
    }

    public final void A0N(String str) {
        Map<String, String> A05 = A05(str);
        if (A05 != null) {
            int size = A05.size();
            String[] strArr = A03;
            if (size != strArr.length) {
                return;
            }
            C1685aD A5S = this.A00.A5S();
            for (String str2 : strArr) {
                A5S.A01(str2, A05.get(str2));
            }
            A5S.A00(A02(518, 22, 120), System.currentTimeMillis());
            A5S.A02();
        }
    }

    public final boolean A0O(Context context, boolean z8) {
        return (z8 || C1225Ih.A29(context)) && ((A09() > 0L ? 1 : (A09() == 0L ? 0 : -1)) > 0);
    }
}
