package com.meta.analytics.dsp.uinode;

import android.text.TextUtils;
import com.applovin.exoplayer2.common.base.Ascii;
import com.facebook.ads.internal.protocol.AdErrorType;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.redexgen.X.Jl, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1251Jl {
    public static byte[] A04;
    public static String[] A05 = {"YPLhW1YthHwH", "C5pYKBzTNFhaTyoOn8CLtRZjld8VucJT", "nwsPGMG6WiL6DBh0FHrHZ0R5IXcuLobJ", "gK87iCVuQY9qRaZHEz4I1", "yLpaI56t1HZbTv34O8DVm8KvrNdbdGTz", "u7C3r8DCX9eoMUGzC5EwjUGrObNKQaYD", "hw4dG9XbulEGH2HnH1CXedNx1Lx9pLFE", "teiwDyYVI0VIQpP4hHHpy5xIPHWhYAA5"};
    public final EnumC1250Jk A00;
    public final Long A01;
    public final String A02;
    public final String A03;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 18 out of bounds for length 18
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.restartVar(DebugInfoParser.java:193)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:141)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:626)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    public C1251Jl(C09647f c09647f, String str, String str2, EnumC1246Jg enumC1246Jg) throws C1243Jc {
        String A01 = A01(270, 21, 101);
        String A012 = A01(291, 11, 100);
        String A013 = A01(247, 14, 65);
        String A014 = A01(310, 4, 74);
        String A015 = A01(302, 8, 85);
        if (TextUtils.isEmpty(str)) {
            this.A00 = EnumC1250Jk.A03;
            this.A01 = null;
            this.A03 = null;
            this.A02 = null;
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            switch (C1249Jj.A00[EnumC1250Jk.valueOf(jSONObject.getString(A014).toUpperCase()).ordinal()]) {
                case 1:
                    this.A00 = EnumC1250Jk.A02;
                    Long valueOf = Long.valueOf(jSONObject.getString(A01(241, 6, 45)));
                    this.A01 = valueOf;
                    if (jSONObject.has(A013)) {
                        this.A02 = jSONObject.getString(A013);
                    } else {
                        this.A02 = null;
                    }
                    this.A03 = jSONObject.getString(A01(261, 9, 2));
                    if (!jSONObject.getString(A012).equals(c09647f.A04().A8I())) {
                        throw new C1243Jc(AdErrorType.BID_IMPRESSION_MISMATCH, String.format(Locale.US, A01(0, 54, 78), valueOf, jSONObject.getString(A012), c09647f.A04().A8I()));
                    }
                    if (!jSONObject.getString(A01).equals(str2)) {
                        throw new C1243Jc(AdErrorType.BID_IMPRESSION_MISMATCH, String.format(Locale.US, A01(54, 50, 34), valueOf, jSONObject.getString(A01), str2));
                    }
                    HashSet hashSet = new HashSet(Arrays.asList(Integer.valueOf(EnumC1246Jg.A0G.A03()), Integer.valueOf(EnumC1246Jg.A0J.A03()), Integer.valueOf(EnumC1246Jg.A0H.A03()), Integer.valueOf(EnumC1246Jg.A0I.A03())));
                    if (jSONObject.getInt(A015) != enumC1246Jg.A03()) {
                        if (!hashSet.contains(Integer.valueOf(jSONObject.getInt(A015))) || !hashSet.contains(Integer.valueOf(enumC1246Jg.A03()))) {
                            throw new C1243Jc(AdErrorType.BID_IMPRESSION_MISMATCH, String.format(Locale.US, A01(104, 48, 77), valueOf, Integer.valueOf(jSONObject.getInt(A015)), enumC1246Jg));
                        }
                        return;
                    }
                    return;
                default:
                    throw new C1243Jc(AdErrorType.BID_PAYLOAD_ERROR, A01(210, 28, 16) + jSONObject.getString(A014));
            }
        } catch (JSONException e4) {
            c09647f.A07().A9a(A01(238, 3, 37), C8A.A0P, new C8B(e4));
            throw new C1243Jc(AdErrorType.BID_PAYLOAD_ERROR, A01(152, 18, 27), e4);
        }
    }

    public static String A01(int i9, int i10, int i11) {
        byte[] copyOfRange = Arrays.copyOfRange(A04, i9, i9 + i10);
        for (int i12 = 0; i12 < copyOfRange.length; i12++) {
            copyOfRange[i12] = (byte) ((copyOfRange[i12] - i11) - 99);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A04 = new byte[]{-13, Ascii.SUB, Ascii.NAK, -47, -42, Ascii.NAK, -47, Ascii.ETB, 32, 35, -47, 4, -11, -4, -47, 39, Ascii.SYN, 35, 36, Ascii.SUB, 32, Ascii.US, -47, -42, 36, -47, 19, Ascii.SYN, Ascii.SUB, Ascii.US, Ascii.CAN, -47, 38, 36, Ascii.SYN, Ascii.NAK, -47, 32, Ascii.US, -47, 4, -11, -4, -47, 39, Ascii.SYN, 35, 36, Ascii.SUB, 32, Ascii.US, -47, -42, 36, -57, -18, -23, -91, -86, -23, -91, -21, -12, -9, -91, -11, -15, -26, -24, -22, -14, -22, -13, -7, -91, -86, -8, -91, -25, -22, -18, -13, -20, -91, -6, -8, -22, -23, -91, -12, -13, -91, -11, -15, -26, -24, -22, -14, -22, -13, -7, -91, -86, -8, -14, Ascii.EM, Ascii.DC4, -48, -43, Ascii.DC4, -48, Ascii.SYN, Ascii.US, 34, -48, 36, Ascii.NAK, Ascii.GS, 32, Ascii.FS, 17, 36, Ascii.NAK, -48, -43, 35, -48, Ascii.DC2, Ascii.NAK, Ascii.EM, Ascii.RS, Ascii.ETB, -48, 37, 35, Ascii.NAK, Ascii.DC4, -48, Ascii.US, Ascii.RS, -48, 36, Ascii.NAK, Ascii.GS, 32, Ascii.FS, 17, 36, Ascii.NAK, -48, -43, 35, -57, -20, -12, -33, -22, -25, -30, -98, -64, -25, -30, -50, -33, -9, -22, -19, -33, -30, Ascii.SI, 32, 40, 43, 39, Ascii.FS, 47, 32, -37, -32, 46, -37, 36, 46, -37, 41, 42, 47, -37, 49, Ascii.FS, 39, 36, Ascii.US, -37, Ascii.GS, Ascii.FS, 41, 41, 32, 45, -37, 47, 32, 40, 43, 39, Ascii.FS, 47, 32, -56, -31, -26, -24, -29, -29, -30, -27, -25, -40, -41, -109, -75, -36, -41, -61, -44, -20, -33, -30, -44, -41, -109, -25, -20, -29, -40, -109, -23, -8, -15, -14, -7, -12, -17, -7, -12, 6, Ascii.CR, 8, 3, Ascii.CAN, Ascii.CR, 17, 9, 3, Ascii.CAN, 19, Ascii.SI, 9, Ascii.DC2, -55, -54, -37, -50, -56, -54, -60, -50, -55, 58, 45, 59, 55, 52, 62, 45, 44, 39, 56, 52, 41, 43, 45, 53, 45, 54, 60, 39, 49, 44, 58, 43, 50, 38, 61, 44, 57, 58, 48, 54, 53, 44, Ascii.GS, 37, 40, 36, Ascii.EM, 44, Ascii.GS, 33, 38, Ascii.GS, Ascii.DC2};
    }

    static {
        A02();
    }

    public C1251Jl() {
        this.A00 = EnumC1250Jk.A03;
        this.A01 = null;
        this.A03 = null;
        this.A02 = null;
    }

    public static EnumC1246Jg A00(String str) throws C1243Jc {
        try {
            return EnumC1246Jg.A00(new JSONObject(str).getInt(A01(302, 8, 85)));
        } catch (JSONException e4) {
            throw new C1243Jc(AdErrorType.BID_PAYLOAD_ERROR, A01(152, 18, 27), e4);
        }
    }

    public static void A03(EnumC1246Jg enumC1246Jg) throws C1243Jc {
        if (EnumC1246Jg.A0F.equals(enumC1246Jg) || EnumC1246Jg.A0D.equals(enumC1246Jg) || EnumC1246Jg.A0E.equals(enumC1246Jg) || EnumC1246Jg.A0C.equals(enumC1246Jg)) {
        } else {
            throw new C1243Jc(AdErrorType.BID_IMPRESSION_MISMATCH, String.format(Locale.US, A01(170, 40, 88), Integer.valueOf(enumC1246Jg.A03())));
        }
    }

    public final String A04() {
        Long l = this.A01;
        if (l == null) {
            return null;
        }
        String l2 = l.toString();
        if (A05[5].charAt(0) == 'P') {
            throw new RuntimeException();
        }
        A05[2] = "nWWGWN2JOSzWcz2EKeaa2WFuGi6FMoRa";
        return l2;
    }

    public final String A05() {
        return this.A02;
    }

    public final boolean A06() {
        return this.A00 != EnumC1250Jk.A03;
    }
}
