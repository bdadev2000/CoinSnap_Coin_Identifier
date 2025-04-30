package com.meta.analytics.dsp.uinode;

import android.util.SparseArray;
import com.applovin.exoplayer2.common.base.Ascii;
import com.facebook.ads.internal.exoplayer2.thirdparty.Format;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.TsExtractor;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* loaded from: assets/audience_network.dex */
public final class X5 implements DB {
    public static byte[] A02;
    public static String[] A03 = {"W3zpeZwD9Fi1kBaR", "uMdULlbYt84VxY86rM0TiEJbhaqKcXZ1", "Usin4k2UYlEJmIUoIPMyl4MixoDpG9ii", "hBZpg4XSGRsBFeFqV0aqL6EoVOREEldE", "UimonN4w5kzXtUMO8SJw69s6gFNeuD2Z", "uuKAqm4Yer5CcRyJ", "zRTcmdaM3Tn4RRVoPrSr5tVrwuK6PMWw", "taTU185R1PVUiY2ntZzDAqagtcVNoAEE"};
    public final int A00;
    public final List<Format> A01;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 18 out of bounds for length 18
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:626)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    private D7 A00(DA da) {
        String A01;
        int i9;
        if (A03(32)) {
            return new D7(this.A01);
        }
        C1217Hz c1217Hz = new C1217Hz(da.A03);
        List<Format> list = this.A01;
        while (c1217Hz.A04() > 0) {
            int A0E = c1217Hz.A0E();
            int A06 = c1217Hz.A06() + c1217Hz.A0E();
            if (A0E == 134) {
                list = new ArrayList<>();
                int A0E2 = c1217Hz.A0E() & 31;
                for (int i10 = 0; i10 < A0E2; i10++) {
                    String A0S = c1217Hz.A0S(3);
                    int A0E3 = c1217Hz.A0E();
                    if ((A0E3 & 128) != 0) {
                        A01 = A01(19, 19, 101);
                        i9 = A0E3 & 63;
                    } else {
                        A01 = A01(0, 19, 66);
                        i9 = 1;
                    }
                    list.add(Format.A08(null, A01, null, -1, 0, A0S, i9, null));
                    c1217Hz.A0Z(2);
                }
            }
            c1217Hz.A0Y(A06);
        }
        return new D7(list);
    }

    public static String A01(int i9, int i10, int i11) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i9, i9 + i10);
        for (int i12 = 0; i12 < copyOfRange.length; i12++) {
            copyOfRange[i12] = (byte) ((copyOfRange[i12] ^ i11) ^ 51);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A02 = new byte[]{Ascii.DLE, 1, 1, Ascii.GS, Ascii.CAN, Ascii.DC2, Ascii.DLE, 5, Ascii.CAN, Ascii.RS, Ascii.US, 94, Ascii.DC2, Ascii.DC4, Ascii.DLE, 92, 71, 65, 73, 55, 38, 38, 58, 63, 53, 55, 34, 63, 57, 56, 121, 53, 51, 55, 123, 97, 102, 110};
    }

    static {
        A02();
    }

    public X5() {
        this(0);
    }

    public X5(int i9) {
        this(i9, Collections.emptyList());
    }

    public X5(int i9, List<Format> list) {
        this.A00 = i9;
        if (!A03(32) && list.isEmpty()) {
            list = Collections.singletonList(Format.A00(null, A01(0, 19, 66), 0, null));
        }
        this.A01 = list;
    }

    private boolean A03(int i9) {
        return (this.A00 & i9) != 0;
    }

    @Override // com.meta.analytics.dsp.uinode.DB
    public final SparseArray<DD> A4d() {
        return new SparseArray<>();
    }

    @Override // com.meta.analytics.dsp.uinode.DB
    public final DD A4j(int i9, DA da) {
        switch (i9) {
            case 2:
                return new C1593Ww(new X2());
            case 3:
            case 4:
                return new C1593Ww(new C1594Wx(da.A01));
            case 15:
                if (A03(2)) {
                    return null;
                }
                return new C1593Ww(new X6(false, da.A01));
            case 17:
                boolean A032 = A03(2);
                String[] strArr = A03;
                if (strArr[4].charAt(2) == strArr[3].charAt(2)) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A03;
                strArr2[2] = "Zsc3HcoanD4hgKlowrimr1mcCeCJ4aqm";
                strArr2[6] = "fbfbpCk06enibsJo0cAFVF7ae3oKLvDz";
                if (A032) {
                    return null;
                }
                return new C1593Ww(new C1595Wy(da.A01));
            case 21:
                return new C1593Ww(new C1596Wz());
            case 27:
                boolean A033 = A03(4);
                String[] strArr3 = A03;
                if (strArr3[7].charAt(13) != strArr3[1].charAt(13)) {
                    throw new RuntimeException();
                }
                String[] strArr4 = A03;
                strArr4[2] = "MnHqmUaQQZIE89AoLzdx0BMakHNAXRZh";
                strArr4[6] = "UBVzW5fdc0gZ9W3oa8if0wBLwl14wyCB";
                if (A033) {
                    return null;
                }
                return new C1593Ww(new X1(A00(da), A03(1), A03(8)));
            case 36:
                return new C1593Ww(new X0(A00(da)));
            case TsExtractor.TS_STREAM_TYPE_DVBSUBS /* 89 */:
                return new C1593Ww(new X3(da.A02));
            case 129:
            case 135:
                return new C1593Ww(new X9(da.A01));
            case 130:
            case 138:
                return new C1593Ww(new X4(da.A01));
            case 134:
                if (A03(16)) {
                    return null;
                }
                return new C1590Wt(new C1589Ws());
            default:
                return null;
        }
    }
}
