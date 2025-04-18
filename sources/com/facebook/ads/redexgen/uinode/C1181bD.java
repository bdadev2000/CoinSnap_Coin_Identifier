package com.facebook.ads.redexgen.uinode;

import com.applovin.exoplayer2.common.base.Ascii;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import kotlin.io.encoding.Base64;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.redexgen.X.bD, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1181bD implements InterfaceC02300k {
    public static byte[] A08;
    public static String[] A09 = {"a8CS69kVNecuN9Nm4E1lChlBM", "ag8ss2YsLKCBvL1N8ZsAQ7i2G", "9IBuBVemd2S2dbE3BWmY83r4APvNrK7d", "ZoqrROBX", "uf7sNUy4ZjnbrmNcJuZuOOSXLwo6bRiZ", "LuNKGusWtlIWkNNSsxJCgMD8UDEcDleP", "s1ncMgVhGbgxvH35X0QQBiYqSsxlrK3j", "2ghFrXKxVbUZFk6auJt6qCgV8pKBUCZ9"};
    public final EnumC02290j A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final Collection<String> A06;
    public final Map<String, String> A07;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 15 out of bounds for length 15
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:626)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    public static C1181bD A00(EQ eq, JSONObject jSONObject) {
        String optString = jSONObject.optString(A01(33, 6, 95));
        String optString2 = jSONObject.optString(A01(0, 18, 13));
        String optString3 = jSONObject.optString(A01(47, 10, 34));
        String A02 = LJ.A02(jSONObject, A01(18, 2, 2));
        EnumC02290j A00 = AbstractC02310l.A00(jSONObject);
        Collection<String> A03 = AbstractC02310l.A03(eq, jSONObject);
        JSONObject optJSONObject = jSONObject.optJSONObject(A01(39, 8, 57));
        HashMap hashMap = new HashMap();
        if (optJSONObject != null) {
            Iterator<String> keys = optJSONObject.keys();
            while (true) {
                boolean hasNext = keys.hasNext();
                if (A09[7].charAt(3) == 'o') {
                    throw new RuntimeException();
                }
                String[] strArr = A09;
                strArr[3] = "3pk8Rtt7";
                strArr[1] = "M9VcdiL4tfZ71WotJMHbX4yrU";
                if (!hasNext) {
                    break;
                }
                String next = keys.next();
                hashMap.put(next, optJSONObject.optString(next));
            }
        }
        return new C1181bD(optString, optString2, A00, A03, hashMap, optString3, A02, LJ.A02(jSONObject, A01(20, 13, 58)));
    }

    public static String A01(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A08, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 101);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A08 = new byte[]{9, Ascii.VT, Ascii.FS, 1, Ascii.RS, 9, Ascii.FS, 1, 7, 6, 55, Ascii.VT, 7, 5, 5, 9, 6, Ascii.FF, 4, 19, 58, 49, 60, 45, 38, 47, 43, 58, 59, 0, 60, 47, 50, 87, 91, 72, 81, 79, 74, 49, 57, 40, Base64.padSymbol, 56, Base64.padSymbol, 40, Base64.padSymbol, 53, 34, 54, 50, 34, 52, 51, Ascii.CAN, 46, 35};
    }

    static {
        A02();
    }

    public C1181bD(String str, String str2, EnumC02290j enumC02290j, Collection<String> detectionStrings, Map<String, String> metadata, String str3, String str4, String str5) {
        this.A04 = str;
        this.A01 = str2;
        this.A00 = enumC02290j;
        this.A06 = detectionStrings;
        this.A07 = metadata;
        this.A05 = str3;
        this.A02 = str4;
        this.A03 = str5;
    }

    public final String A03() {
        return this.A01;
    }

    public final String A04() {
        return this.A04;
    }

    public final String A05() {
        return this.A03;
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC02300k
    public final String A6T() {
        return this.A02;
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC02300k
    public final Collection<String> A6n() {
        return this.A06;
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC02300k
    public final EnumC02290j A7E() {
        return this.A00;
    }
}
