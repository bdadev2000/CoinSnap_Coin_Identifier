package com.facebook.ads.redexgen.uinode;

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
    java.lang.ArrayIndexOutOfBoundsException
     */
    private D7 A00(DA da2) {
        String A01;
        int i10;
        if (A03(32)) {
            return new D7(this.A01);
        }
        C0651Hz c0651Hz = new C0651Hz(da2.A03);
        List<Format> list = this.A01;
        while (c0651Hz.A04() > 0) {
            int A0E = c0651Hz.A0E();
            int A06 = c0651Hz.A06() + c0651Hz.A0E();
            if (A0E == 134) {
                list = new ArrayList<>();
                int A0E2 = c0651Hz.A0E() & 31;
                for (int i11 = 0; i11 < A0E2; i11++) {
                    String A0S = c0651Hz.A0S(3);
                    int A0E3 = c0651Hz.A0E();
                    if ((A0E3 & 128) != 0) {
                        A01 = A01(19, 19, 101);
                        i10 = A0E3 & 63;
                    } else {
                        A01 = A01(0, 19, 66);
                        i10 = 1;
                    }
                    list.add(Format.A08(null, A01, null, -1, 0, A0S, i10, null));
                    c0651Hz.A0Z(2);
                }
            }
            c0651Hz.A0Y(A06);
        }
        return new D7(list);
    }

    public static String A01(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 51);
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

    public X5(int i10) {
        this(i10, Collections.emptyList());
    }

    public X5(int i10, List<Format> list) {
        this.A00 = i10;
        if (!A03(32) && list.isEmpty()) {
            list = Collections.singletonList(Format.A00(null, A01(0, 19, 66), 0, null));
        }
        this.A01 = list;
    }

    private boolean A03(int i10) {
        return (this.A00 & i10) != 0;
    }

    @Override // com.facebook.ads.redexgen.uinode.DB
    public final SparseArray<DD> A4d() {
        return new SparseArray<>();
    }

    @Override // com.facebook.ads.redexgen.uinode.DB
    public final DD A4j(int i10, DA da2) {
        switch (i10) {
            case 2:
                return new C1027Ww(new X2());
            case 3:
            case 4:
                return new C1027Ww(new C1028Wx(da2.A01));
            case 15:
                if (A03(2)) {
                    return null;
                }
                return new C1027Ww(new X6(false, da2.A01));
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
                return new C1027Ww(new C1029Wy(da2.A01));
            case 21:
                return new C1027Ww(new C1030Wz());
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
                return new C1027Ww(new X1(A00(da2), A03(1), A03(8)));
            case 36:
                return new C1027Ww(new X0(A00(da2)));
            case TsExtractor.TS_STREAM_TYPE_DVBSUBS /* 89 */:
                return new C1027Ww(new X3(da2.A02));
            case 129:
            case 135:
                return new C1027Ww(new X9(da2.A01));
            case 130:
            case 138:
                return new C1027Ww(new X4(da2.A01));
            case 134:
                if (A03(16)) {
                    return null;
                }
                return new C1024Wt(new C1023Ws());
            default:
                return null;
        }
    }
}
