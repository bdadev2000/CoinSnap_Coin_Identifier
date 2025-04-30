package com.meta.analytics.dsp.uinode;

import android.text.TextUtils;
import com.applovin.exoplayer2.common.base.Ascii;
import com.facebook.ads.internal.protocol.AdErrorType;
import java.util.Arrays;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: assets/audience_network.dex */
public final class K5 {
    public static K5 A00;
    public static byte[] A01;
    public static String[] A02 = {"Nd0aIJaSSdT6golxDxmvfQ8KGIhkioAs", "ixyRHf3ginhO64aTdthArc1g6ok2H3", "GbO21nRDfLqDtubwMBv4WZcS7UdykcI0", "mXXayHEFxYYogLv80iNIAWV0V8DSaho2", "P31SQSGtrqVfDfZK9ecLZSYzpsOr4NmF", "LoLWC0hqSx9uRqEUKclND68NLRAhrZnk", "BjBhbLG4paZ7rOUqjAFqxmQoWglNay8W", "K86adGKhBwKF7i3Zzr1zFaSNRf7F"};

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 16 out of bounds for length 16
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:626)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    private C1538Up A01(C1636Yn c1636Yn, JSONObject jSONObject, long j7) throws JSONException {
        JSONObject jSONObject2 = jSONObject.getJSONArray(A04(151, 10, 78)).getJSONObject(0);
        C8T A002 = C8T.A00(jSONObject2.getJSONObject(A04(115, 10, 70)));
        String optString = jSONObject2.optString(A04(130, 14, 18));
        String optString2 = jSONObject2.optString(A04(0, 19, 98));
        String A04 = A04(100, 15, 87);
        C8S c8s = new C8S(A002, optString, optString2, jSONObject2.has(A04) ? jSONObject2.optString(A04) : null);
        String A042 = A04(26, 3, 57);
        if (jSONObject2.has(A042)) {
            JSONArray jSONArray = jSONObject2.getJSONArray(A042);
            int i9 = 0;
            while (true) {
                int length = jSONArray.length();
                String[] strArr = A02;
                if (strArr[5].charAt(22) == strArr[0].charAt(22)) {
                    String[] strArr2 = A02;
                    strArr2[5] = "EVHdYwJmDBIkQbvU6cH0jf8LCXZeDjo6";
                    strArr2[0] = "LqKeHeP2dtVwdsKCNOcbJj8gANtIspsD";
                    if (i9 >= length) {
                        break;
                    }
                    JSONObject jSONObject3 = jSONArray.getJSONObject(i9);
                    JC.A06(c1636Yn, jSONObject3, j7, null);
                    String optString3 = jSONObject3.optString(A04(19, 7, 39));
                    String optString4 = jSONObject3.optString(A04(85, 15, 63));
                    JSONObject optJSONObject = jSONObject3.optJSONObject(A04(63, 4, 116));
                    JSONArray optJSONArray = jSONObject3.optJSONArray(A04(161, 8, 90));
                    if (optJSONObject != null) {
                        c8s.A0A(new C8Q(optString3, optString4, optJSONObject, optJSONArray));
                    } else {
                        c1636Yn.A0E().A4t(AdErrorType.UNKNOWN_ERROR.getErrorCode(), A04(67, 18, 82));
                    }
                    i9++;
                } else {
                    throw new RuntimeException();
                }
            }
        }
        String A043 = A04(47, 12, 116);
        if (jSONObject2.has(A043)) {
            c8s.A0B(jSONObject2.getJSONObject(A043));
        }
        return new C1538Up(c8s, jSONObject.optString(A04(29, 18, 1)));
    }

    public static String A04(int i9, int i10, int i11) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i9, i9 + i10);
        for (int i12 = 0; i12 < copyOfRange.length; i12++) {
            copyOfRange[i12] = (byte) ((copyOfRange[i12] ^ i11) ^ 119);
        }
        return new String(copyOfRange);
    }

    public static void A05() {
        A01 = new byte[]{116, 113, 74, 103, 112, 101, 122, 103, 97, 124, 123, 114, 74, 118, 122, 123, 115, 124, 114, 49, 52, 49, 32, 36, 53, 34, 47, 42, 61, Ascii.ETB, Ascii.CAN, 41, 0, Ascii.ETB, Ascii.SUB, Ascii.US, Ascii.DC2, Ascii.ETB, 2, Ascii.US, Ascii.EM, Ascii.CAN, 41, 3, 3, Ascii.US, Ascii.DC2, 96, 107, 98, 106, 109, 92, 115, 98, 113, 98, 110, 112, Ascii.ETB, Ascii.ESC, Ascii.DLE, 17, 103, 98, 119, 98, 65, 68, 81, 68, 106, 71, 79, 64, 70, 81, 5, 76, 86, 5, 75, 80, 73, 73, 44, 41, 60, 41, Ascii.ETB, 37, 39, 44, 45, 36, Ascii.ETB, 60, 49, 56, 45, 68, 67, 76, Ascii.DEL, 84, 69, 83, 84, Ascii.DEL, 67, 79, 78, 70, 73, 71, 85, 84, 87, 88, 95, 88, 69, 88, 94, 95, 74, 93, 93, 64, 93, 3, 0, 4, 17, Ascii.DLE, Ascii.ETB, 0, 58, 6, 10, Ascii.VT, 3, Ascii.FF, 2, Ascii.SI, 7, 17, 17, 3, 5, 7, 73, 85, 88, 90, 92, 84, 92, 87, 77, 74, 89, 95, 76, 78, 70, 72, 95, 94, 69, 72, 65, 84};
    }

    static {
        A05();
        A00 = new K5();
    }

    public static synchronized K5 A00() {
        K5 k52;
        synchronized (K5.class) {
            k52 = A00;
        }
        return k52;
    }

    private C1537Uo A02(JSONObject jSONObject) {
        return new C1537Uo(jSONObject.optString(A04(144, 7, 21), A04(0, 0, 87)), jSONObject.optInt(A04(59, 4, 3), 0), null);
    }

    private C1537Uo A03(JSONObject jSONObject) {
        try {
            JSONArray placements = jSONObject.getJSONArray(A04(151, 10, 78));
            JSONObject definition = placements.getJSONObject(0);
            C8T A002 = C8T.A00(definition.getJSONObject(A04(115, 10, 70)));
            String adReportingConfig = definition.optString(A04(130, 14, 18));
            return new C1537Uo(jSONObject.optString(A04(144, 7, 21), A04(0, 0, 87)), jSONObject.optInt(A04(59, 4, 3), 0), new C8S(A002, adReportingConfig, definition.optString(A04(0, 19, 98)), null));
        } catch (JSONException unused) {
            return A02(jSONObject);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final K7 A06(C1636Yn c1636Yn, String str, long j7) throws JSONException {
        char c9;
        if (!TextUtils.isEmpty(str)) {
            JSONObject jSONObject = new JSONObject(str);
            String optString = jSONObject.optString(A04(169, 4, 70));
            int hashCode = optString.hashCode();
            String A04 = A04(125, 5, 88);
            switch (hashCode) {
                case 96432:
                    if (optString.equals(A04(26, 3, 57))) {
                        c9 = 0;
                        break;
                    }
                    c9 = 65535;
                    break;
                case 96784904:
                    if (optString.equals(A04)) {
                        c9 = 1;
                        break;
                    }
                    c9 = 65535;
                    break;
                default:
                    c9 = 65535;
                    break;
            }
            switch (c9) {
                case 0:
                    return A01(c1636Yn, jSONObject, j7);
                case 1:
                    return A03(jSONObject);
                default:
                    JSONObject jsonResponse = jSONObject.optJSONObject(A04);
                    if (jsonResponse != null) {
                        return A02(jsonResponse);
                    }
                    break;
            }
        }
        return new K7(K6.A04);
    }
}
