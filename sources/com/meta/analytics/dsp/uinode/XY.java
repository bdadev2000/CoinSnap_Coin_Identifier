package com.meta.analytics.dsp.uinode;

import java.io.IOException;

/* loaded from: assets/audience_network.dex */
public final class XY implements CC {
    public static String[] A01 = {"cA81LRwoTzcve7g2gal3SHsO5RpkStuT", "HY7LDrqVa1CzvC", "zY79826fIu21GjmhijN8oURrhAN", "4NGXPp5NfQjrc3", "ovBDT1slbTWNCc5DYQuZuX28cbmG3x7K", "z33Wt0yG1C", "O7hCLPdtydyuzpHeSDPli", "jT4PoZwvtmuWxxhbTxLAMWdZ0blfztoL"};
    public final /* synthetic */ XX A00;

    public XY(XX xx) {
        this.A00 = xx;
    }

    public /* synthetic */ XY(XX xx, XZ xz) {
        this(xx);
    }

    @Override // com.meta.analytics.dsp.uinode.CC
    public final void A42(int i9, int i10, InterfaceC1075Bt interfaceC1075Bt) throws IOException, InterruptedException {
        this.A00.A0K(i9, i10, interfaceC1075Bt);
    }

    @Override // com.meta.analytics.dsp.uinode.CC
    public final void A5X(int i9) throws C10259v {
        this.A00.A0I(i9);
    }

    @Override // com.meta.analytics.dsp.uinode.CC
    public final void A5j(int i9, double d2) throws C10259v {
        this.A00.A0J(i9, d2);
    }

    @Override // com.meta.analytics.dsp.uinode.CC
    public final int A6s(int i9) {
        switch (i9) {
            case 131:
            case 136:
            case 155:
            case 159:
            case 176:
            case 179:
            case 186:
            case 215:
            case 231:
            case 241:
            case 251:
            case 16980:
            case 17029:
            case 17143:
            case 18401:
            case 18408:
            case 20529:
            case 20530:
            case 21420:
            case 21432:
            case 21680:
            case 21682:
            case 21690:
            case 21930:
            case 21945:
            case 21946:
            case 21947:
            case 21948:
            case 21949:
            case 22186:
            case 22203:
            case 25188:
            case 2352003:
            case 2807729:
                return 2;
            case 134:
            case 17026:
            case 2274716:
                return 3;
            case 160:
            case 174:
            case 183:
            case 187:
            case 224:
            case 225:
            case 18407:
            case 19899:
            case 20532:
            case 20533:
            case 21936:
            case 21968:
            case 25152:
            case 28032:
            case 30320:
            case 290298740:
            case 357149030:
            case 374648427:
            case 408125543:
            case 440786851:
            case 475249515:
            case 524531317:
                String[] strArr = A01;
                if (strArr[7].charAt(6) != strArr[0].charAt(6)) {
                    return 1;
                }
                A01[5] = "4ZA2yiGdfT";
                return 1;
            case 161:
            case 163:
            case 16981:
            case 18402:
            case 21419:
            case 25506:
            case 30322:
                return 4;
            case 181:
            case 17545:
            case 21969:
            case 21970:
            case 21971:
            case 21972:
            case 21973:
            case 21974:
            case 21975:
            case 21976:
            case 21977:
            case 21978:
                String[] strArr2 = A01;
                if (strArr2[3].length() != strArr2[1].length()) {
                    throw new RuntimeException();
                }
                String[] strArr3 = A01;
                strArr3[3] = "A0F96KoNVxfWhV";
                strArr3[1] = "rSsOYvpjEgBieI";
                return 5;
            default:
                return 0;
        }
    }

    @Override // com.meta.analytics.dsp.uinode.CC
    public final void A8t(int i9, long j7) throws C10259v {
        this.A00.A0L(i9, j7);
    }

    @Override // com.meta.analytics.dsp.uinode.CC
    public final boolean A96(int i9) {
        if (i9 != 357149030) {
            String[] strArr = A01;
            if (strArr[7].charAt(6) != strArr[0].charAt(6)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A01;
            strArr2[6] = "Ilmt4jALIzqx0lfXFDaP1";
            strArr2[2] = "tghZobaFhWpPPaOkqTUwEke2jaY";
            if (i9 != 524531317 && i9 != 475249515 && i9 != 374648427) {
                return false;
            }
        }
        return true;
    }

    @Override // com.meta.analytics.dsp.uinode.CC
    public final void AGU(int i9, long j7, long j9) throws C10259v {
        this.A00.A0M(i9, j7, j9);
    }

    @Override // com.meta.analytics.dsp.uinode.CC
    public final void AGc(int i9, String str) throws C10259v {
        this.A00.A0N(i9, str);
    }
}
