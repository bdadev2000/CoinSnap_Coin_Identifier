package com.facebook.ads.redexgen.uinode;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Pair;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import com.applovin.exoplayer2.common.base.Ascii;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: assets/audience_network.dex */
public abstract class PE {
    public static byte[] A00;
    public static String[] A01 = {"CXRchRuqobcH0303RF", "0PvsG2xJSmQLgGTcWH9EYe7sEgRs7pRt", "Ep2muPcKb5OPprn584rkOKVS7ZwPor7u", "ESdTFl6hgzo0PrNou", "ifIc3126Iu24LMQAqXU9MKX3mrrg1qWL", "gYyPZy3RrUjZ7", "cRp6DEQTFSLuVCLvwOm8", "Iag0U1Rq9Q0ZydVPffrz8fjunI2ky4CH"};

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 22 out of bounds for length 17
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:626)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    public static WebResourceResponse A00(C1070Yn c1070Yn, WebResourceRequest webResourceRequest, Uri uri, String str, HashMap<String, String> hashMap) throws IOException {
        String A02 = A02(85, 5, 49);
        C0991Vj A0F = R0.A05(c1070Yn.A01()).A0F(c1070Yn);
        C03756c.A0H(c1070Yn, uri.toString());
        try {
            PF pf2 = new PF(c1070Yn.A01(), uri, A0F);
            int available = pf2.available();
            if (available <= 0) {
                A05(c1070Yn, 1, new Pair[]{new Pair(A02(61, 9, 77), String.valueOf(available))});
                return null;
            }
            String A03 = A03(webResourceRequest.getRequestHeaders());
            if (A03 == null) {
                c1070Yn.A0E().A5O();
                A06(hashMap, available);
                return new WebResourceResponse(str, null, 200, A02(44, 2, 15), hashMap, pf2);
            }
            try {
                PD A012 = A01(A03);
                boolean z10 = A012.A03;
                if (A01[7].charAt(0) == '8') {
                    throw new RuntimeException();
                }
                String[] strArr = A01;
                strArr[5] = "V65aPOMRpqA07";
                strArr[6] = "uUbGIz9l3eQBVw2CYc6n";
                if (!z10) {
                    Pair[] pairArr = new Pair[1];
                    pairArr[0] = new Pair(A02(94, 5, 44), A012.A02 != null ? A012.A02 : A02(90, 4, 76));
                    A05(c1070Yn, 0, pairArr);
                    return null;
                }
                int i10 = A012.A01;
                int i11 = A012.A00 == -1 ? available - 1 : A012.A00;
                A06(hashMap, available);
                hashMap.put(A02(31, 13, 81), A02(75, 6, 17) + i10 + A02(1, 1, 52) + i11 + A02(2, 1, 110) + available);
                c1070Yn.A0E().A5O();
                return new WebResourceResponse(str, null, 206, A02(46, 15, 36), hashMap, pf2);
            } catch (NumberFormatException e2) {
                A05(c1070Yn, 3, new Pair[]{new Pair(A02, e2.toString())});
                return null;
            }
        } catch (IOException e10) {
            A05(c1070Yn, 2, new Pair[]{new Pair(A02, e10.toString())});
            return null;
        }
    }

    public static String A02(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 91);
        }
        return new String(copyOfRange);
    }

    public static void A04() {
        A00 = new byte[]{-119, -68, -8, -14, -50, -16, -16, -14, -3, 1, -70, -33, -18, -5, -12, -14, 0, -46, -2, -3, 3, -12, -3, 3, -68, -37, -12, -3, -10, 3, -9, -17, Ascii.ESC, Ascii.SUB, 32, 17, Ascii.SUB, 32, -39, -2, Ascii.CR, Ascii.SUB, 19, 17, -71, -75, -49, -32, -15, -13, -24, -32, -21, -97, -62, -18, -19, -13, -28, -19, -13, 9, Ascii.RS, 9, 17, Ascii.DC4, 9, 10, Ascii.DC4, Ascii.CR, -7, Ascii.DLE, Ascii.VT, -4, 10, -50, -27, -32, -47, -33, -116, 4, Ascii.DLE, 5, 6, -15, -2, -2, -5, -2, Ascii.NAK, Ascii.FS, 19, 19, -7, -24, -11, -18, -20};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 8 out of bounds for length 8
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:626)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    public static void A05(C1070Yn c1070Yn, int i10, Pair<String, String>[] pairArr) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(A02(81, 4, 70), i10);
            for (Pair<String, String> pair : pairArr) {
                jSONObject.put((String) pair.first, pair.second);
            }
        } catch (JSONException unused) {
        }
        c1070Yn.A0E().A5N(jSONObject.toString());
    }

    static {
        A04();
    }

    public static PD A01(String str) {
        if (str == null) {
            PD parseResult = new PD();
            parseResult.A03 = false;
            parseResult.A02 = null;
            return parseResult;
        }
        String[] split = str.split(A02(3, 1, 90));
        if (split.length >= 2) {
            if (A02(70, 5, 60).equals(split[0].toLowerCase(Locale.US).trim())) {
                if (split[1].trim().split(A02(0, 1, 2)).length != 1) {
                    PD pd2 = new PD();
                    pd2.A03 = false;
                    pd2.A02 = str;
                    return pd2;
                }
                String[] ranges = split[1].trim().split(A02(1, 1, 52));
                PD pd3 = new PD();
                pd3.A03 = true;
                pd3.A02 = str;
                pd3.A01 = TextUtils.isEmpty(ranges[0]) ? 0 : Integer.parseInt(ranges[0]);
                if (ranges.length > 1) {
                    pd3.A00 = TextUtils.isEmpty(ranges[1]) ? -1 : Integer.parseInt(ranges[1]);
                } else {
                    pd3.A00 = -1;
                }
                return pd3;
            }
        }
        PD pd4 = new PD();
        pd4.A03 = false;
        pd4.A02 = str;
        return pd4;
    }

    public static String A03(Map<String, String> map) {
        for (String str : map.keySet()) {
            if (A02(94, 5, 44).equals(str.toLowerCase(Locale.US))) {
                return map.get(str);
            }
        }
        return null;
    }

    public static void A06(HashMap<String, String> hashMap, int i10) {
        hashMap.put(A02(4, 13, 50), A02(70, 5, 60));
        hashMap.put(A02(17, 14, 52), String.valueOf(i10));
    }
}
