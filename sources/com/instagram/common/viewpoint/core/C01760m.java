package com.instagram.common.viewpoint.core;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.annotation.Nullable;
import org.json.JSONArray;
import org.json.JSONObject;
import org.objectweb.asm.Opcodes;

/* renamed from: com.facebook.ads.redexgen.X.0m, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C01760m {
    public static byte[] A06;
    public static String[] A07 = {"mJqTstYmruZhgAwaIEL2b4JvWf0CXQMB", "HnU4x", "PGMUzhdVy0Xmj4ysKeXKBv0ydkVK", "GINYaTk0", "V6CaE", "fikkh2q6ZMH0m3YxzoB0Qf3bpiihQ1Gk", "lQcCmoZBYA5tZudR22aEG8J8TvwruM4P", "bCUE2z1YAZE0LvG9WsX4zUjeUwMdrUpo"};
    public final String A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final List<String> A05;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 12 out of bounds for length 12
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:626)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    @Nullable
    public static C01760m A00(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        String optString = jSONObject.optString(A01(50, 7, Opcodes.FREM));
        String optString2 = jSONObject.optString(A01(0, 7, 5));
        String optString3 = jSONObject.optString(A01(7, 11, 99));
        JSONArray optJSONArray = jSONObject.optJSONArray(A01(30, 10, 24));
        ArrayList arrayList = new ArrayList();
        if (optJSONArray != null) {
            int i2 = 0;
            while (true) {
                int length = optJSONArray.length();
                if (A07[1].length() == 8) {
                    throw new RuntimeException();
                }
                String[] strArr = A07;
                strArr[7] = "6bZ3PT4hZpte9eL2tY79J7XfrRT1VGoj";
                strArr[0] = "LsdIpdVpvhsRMPSbdpH1TYtbnc9xgebb";
                if (i2 >= length) {
                    break;
                }
                arrayList.add(optJSONArray.optString(i2));
                i2++;
            }
        }
        return new C01760m(optString, optString2, optString3, arrayList, jSONObject.optString(A01(40, 10, 127)), jSONObject.optString(A01(18, 12, 5)));
    }

    public static String A01(int i2, int i3, int i4) {
        byte[] copyOfRange = Arrays.copyOfRange(A06, i2, i2 + i3);
        for (int i5 = 0; i5 < copyOfRange.length; i5++) {
            copyOfRange[i5] = (byte) ((copyOfRange[i5] - i4) - 36);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        byte[] bArr = {-118, -103, -103, -100, -110, -99, -114, -24, -9, -9, -6, -16, -5, -20, -26, -4, -7, -13, -113, -118, -107, -107, -117, -118, -116, -108, -120, -98, -101, -107, -89, -95, -75, -101, -92, -99, -81, -92, -95, -81, 16, 4, 21, 14, 8, 23, 2, 24, 21, 12, 6, -9, -7, 1, -9, -3, -5};
        if (A07[3].length() != 8) {
            throw new RuntimeException();
        }
        A07[6] = "XQt1KGXtiLW9MsB6ZzaZR9RXZ3iXxMSI";
        A06 = bArr;
    }

    static {
        A02();
    }

    public C01760m(String str, String str2, String str3, List<String> mKeyHashes, String str4, String str5) {
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
