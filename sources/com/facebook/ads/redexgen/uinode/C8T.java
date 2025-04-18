package com.facebook.ads.redexgen.uinode;

import com.applovin.exoplayer2.common.base.Ascii;
import com.facebook.ads.internal.dto.AdCookieData;
import com.facebook.ads.internal.protocol.AdPlacementType;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.io.encoding.Base64;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.redexgen.X.8T, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class C8T {
    public static byte[] A0F;
    public static final AdPlacementType A0G;
    public static final String A0H;
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public int A08;
    public int A09;
    public int A0A;
    public AdPlacementType A0B;
    public boolean A0D;
    public List<AdCookieData> A0C = null;
    public final long A0E = System.currentTimeMillis();

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 9 out of bounds for length 9
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:626)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    public C8T(Map<String, String> map) {
        char c10;
        this.A01 = -1;
        this.A00 = -1;
        this.A0B = A0G;
        this.A03 = 1;
        this.A0A = 0;
        this.A04 = 0;
        this.A05 = 20;
        this.A08 = 0;
        this.A09 = 1000;
        this.A06 = 10000;
        this.A07 = 200;
        this.A02 = 3600;
        this.A0D = false;
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String key = entry.getKey();
            switch (key.hashCode()) {
                case -1561601017:
                    if (key.equals(A01(105, 17, 70))) {
                        c10 = 4;
                        break;
                    }
                    break;
                case -856794442:
                    if (key.equals(A01(199, 26, 64))) {
                        c10 = '\n';
                        break;
                    }
                    break;
                case -726276175:
                    if (key.equals(A01(122, 15, 35))) {
                        c10 = 11;
                        break;
                    }
                    break;
                case -634541425:
                    if (key.equals(A01(9, 32, 87))) {
                        c10 = 5;
                        break;
                    }
                    break;
                case -553208868:
                    if (key.equals(A01(0, 9, 102))) {
                        c10 = 6;
                        break;
                    }
                    break;
                case 3575610:
                    if (key.equals(A01(137, 4, 17))) {
                        c10 = 0;
                        break;
                    }
                    break;
                case 700812481:
                    if (key.equals(A01(41, 26, 72))) {
                        c10 = 1;
                        break;
                    }
                    break;
                case 858630459:
                    if (key.equals(A01(225, 24, 94))) {
                        c10 = 2;
                        break;
                    }
                    break;
                case 986744879:
                    if (key.equals(A01(141, 27, 73))) {
                        c10 = '\f';
                        break;
                    }
                    break;
                case 1085444827:
                    if (key.equals(A01(98, 7, 62))) {
                        c10 = 3;
                        break;
                    }
                    break;
                case 1183549815:
                    if (key.equals(A01(168, 31, 73))) {
                        c10 = '\t';
                        break;
                    }
                    break;
                case 1503616961:
                    if (key.equals(A01(67, 16, 3))) {
                        c10 = '\b';
                        break;
                    }
                    break;
                case 2002133996:
                    if (key.equals(A01(83, 15, 59))) {
                        c10 = 7;
                        break;
                    }
                    break;
            }
            c10 = 65535;
            switch (c10) {
                case 0:
                    this.A0B = AdPlacementType.fromString(entry.getValue());
                    break;
                case 1:
                    this.A03 = Integer.parseInt(entry.getValue());
                    break;
                case 2:
                    this.A0A = Integer.parseInt(entry.getValue());
                    break;
                case 3:
                    this.A04 = Integer.parseInt(entry.getValue());
                    break;
                case 4:
                    this.A05 = Integer.parseInt(entry.getValue());
                    break;
                case 5:
                    this.A02 = Integer.parseInt(entry.getValue());
                    break;
                case 6:
                    this.A0D = Boolean.valueOf(entry.getValue()).booleanValue();
                    break;
                case 7:
                    this.A01 = Integer.parseInt(entry.getValue());
                    break;
                case '\b':
                    this.A00 = Integer.parseInt(entry.getValue());
                    break;
                case '\t':
                    this.A08 = Integer.parseInt(entry.getValue());
                    break;
                case '\n':
                    this.A09 = Integer.parseInt(entry.getValue());
                    break;
                case 11:
                    this.A06 = Integer.parseInt(entry.getValue());
                    break;
                case '\f':
                    try {
                        this.A07 = Integer.parseInt(entry.getValue());
                        break;
                    } catch (NumberFormatException unused) {
                        this.A07 = 200;
                        break;
                    }
            }
        }
    }

    public static String A01(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A0F, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 114);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A0F = new byte[]{119, 117, 119, 124, 113, 117, 118, 120, 113, 76, 75, 83, 68, 73, 76, 65, 68, 81, 76, 74, 75, 122, 65, 80, 87, 68, 81, 76, 74, 75, 122, 76, 75, 122, 86, 64, 70, 74, 75, 65, 86, 87, 83, 84, 101, 76, 83, 95, 77, 91, 88, 83, 86, 83, 78, 67, 101, 74, 95, 72, 89, 95, 84, 78, 91, 93, 95, 1, Ascii.GS, Ascii.DLE, Ascii.DC2, Ascii.DC4, Ascii.FS, Ascii.DC4, Ascii.US, 5, 46, Ascii.EM, Ascii.DC4, Ascii.CAN, Ascii.SYN, Ascii.EM, 5, 57, 37, 40, 42, 44, 36, 44, 39, Base64.padSymbol, Ascii.SYN, 62, 32, 45, Base64.padSymbol, 33, 62, 41, 42, 62, 41, 63, 36, 70, 81, 82, 70, 81, 71, 92, 107, 64, 92, 70, 81, 71, 92, 91, 88, 80, 35, 52, 32, 36, 52, 34, 37, Ascii.SO, 37, 56, 60, 52, 62, 36, 37, Ascii.ETB, Ascii.SUB, 19, 6, 77, 82, 95, 94, 84, 100, 79, 82, 86, 94, 100, 75, 84, 87, 87, 82, 85, 92, 100, 82, 85, 79, 94, 73, 77, 90, 87, 77, 82, 94, 76, 90, 89, 82, 87, 82, 79, 66, 100, 88, 83, 94, 88, 80, 100, 82, 85, 82, 79, 82, 90, 87, 100, 95, 94, 87, 90, 66, 68, 91, 87, 69, 83, 80, 91, 94, 91, 70, 75, 109, 81, 90, 87, 81, 89, 109, 91, 92, 70, 87, 64, 68, 83, 94, 90, 69, 73, 91, 77, 78, 69, 64, 69, 88, 85, 115, 79, 68, 73, 79, 71, 115, 88, 69, 79, 71, 73, 94};
    }

    static {
        A02();
        A0H = C8T.class.getSimpleName();
        A0G = AdPlacementType.UNKNOWN;
    }

    public static C8T A00(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        Iterator<String> keys = jSONObject.keys();
        HashMap hashMap = new HashMap();
        while (keys.hasNext()) {
            String next = keys.next();
            hashMap.put(next, String.valueOf(jSONObject.opt(next)));
        }
        return new C8T(hashMap);
    }

    public final int A03() {
        return this.A02 * 1000;
    }

    public final int A04() {
        return this.A03;
    }

    public final int A05() {
        return this.A06;
    }

    public final int A06() {
        return this.A07;
    }

    public final int A07() {
        return this.A08;
    }

    public final int A08() {
        return this.A09;
    }

    public final int A09() {
        return this.A0A;
    }

    public final long A0A() {
        return this.A04 * 1000;
    }

    public final long A0B() {
        return this.A05 * 1000;
    }

    public final long A0C() {
        return this.A0E;
    }

    public final AdPlacementType A0D() {
        return this.A0B;
    }

    public final boolean A0E() {
        return this.A0D;
    }
}
