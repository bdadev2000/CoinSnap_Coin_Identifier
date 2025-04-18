package com.facebook.ads.redexgen.uinode;

import com.applovin.exoplayer2.common.base.Ascii;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.redexgen.X.0m, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C02320m {
    public static byte[] A06;
    public static String[] A07 = {"DvSn6PhmC3i7LdpG0vBUuRZmjagS5as7", "VQCZ7hz", "zA4klKNJM0QxWDxEFTSTi5yKhMV68", "2vimyyNbMv6AohadWhJSDQSQPpWOARjH", "MVolmMMkLKfWmTv", "tHNO368kkNAVpLeIneqpL6ODf8V7me71", "x8Jgc8MGjZsmc", "KvaBSJwcdZeuQnxX6yqoEJJZ8c4KCJ2u"};
    public final String A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final List<String> A05;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 11 out of bounds for length 11
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:626)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    public static C02320m A00(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        String optString = jSONObject.optString(A01(50, 7, 38));
        String optString2 = jSONObject.optString(A01(0, 7, 110));
        String optString3 = jSONObject.optString(A01(7, 11, 76));
        JSONArray optJSONArray = jSONObject.optJSONArray(A01(30, 10, 34));
        ArrayList arrayList = new ArrayList();
        if (optJSONArray != null) {
            for (int i10 = 0; i10 < optJSONArray.length(); i10++) {
                arrayList.add(optJSONArray.optString(i10));
                if (A07[5].charAt(9) != 'N') {
                    throw new RuntimeException();
                }
                A07[2] = "wfKFQtpS7p7Zsd7MRi5uYuHrlLf6T";
            }
        }
        return new C02320m(optString, optString2, optString3, arrayList, jSONObject.optString(A01(40, 10, 91)), jSONObject.optString(A01(18, 12, 12)));
    }

    public static String A01(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A06, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 76);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A06 = new byte[]{67, 82, 82, 81, 75, 86, 71, 97, 112, 112, 115, 105, 116, 101, 95, 117, 114, 108, 38, 33, 44, 44, 34, 33, 35, 43, Ascii.US, 53, 50, 44, 5, Ascii.VT, Ascii.ETB, 49, 6, Ascii.SI, Ascii.GS, 6, Ascii.VT, Ascii.GS, 122, 118, 101, 124, 114, 99, 72, 98, 101, 126, Ascii.SUB, Ascii.VT, 9, 1, Ascii.VT, Ascii.CR, Ascii.SI};
    }

    static {
        A02();
    }

    public C02320m(String str, String str2, String str3, List<String> mKeyHashes, String str4, String str5) {
        this.A04 = str;
        this.A01 = str2;
        this.A00 = str3;
        this.A05 = mKeyHashes;
        this.A03 = str4;
        this.A02 = str5;
    }

    public final String A03() {
        return this.A00;
    }

    public final String A04() {
        return this.A01;
    }

    public final String A05() {
        return this.A04;
    }
}
