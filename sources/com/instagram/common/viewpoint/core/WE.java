package com.instagram.common.viewpoint.core;

import com.facebook.ads.internal.protocol.AdErrorType;
import java.util.Arrays;
import okio.Utf8;

/* loaded from: assets/audience_network.dex */
public class WE implements C6X {
    public static byte[] A03;
    public static String[] A04 = {"mqH0C", "P", "Prv4rgxv4XvjDltPpSeqnrL7fWipLvZ8", "wRAQVkTW0Fdys8", "msKGEa7u", "", "70lhKNnmmmhMBIKZ0qoNvOWwjw91iHAS", "ylnG6cBHFe0YAiTdKU1DLGP7G6QidCUo"};
    public final /* synthetic */ C1204cU A00;
    public final /* synthetic */ W7 A01;
    public final /* synthetic */ boolean A02;

    public static String A00(int i2, int i3, int i4) {
        byte[] copyOfRange = Arrays.copyOfRange(A03, i2, i2 + i3);
        for (int i5 = 0; i5 < copyOfRange.length; i5++) {
            copyOfRange[i5] = (byte) ((copyOfRange[i5] - i4) - 103);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A03 = new byte[]{28, 55, Utf8.REPLACEMENT_BYTE, 66, 59, 58, -10, 74, 69, -10, 58, 69, 77, 68, 66, 69, 55, 58, -10, 55, -10, 67, 59, 58, Utf8.REPLACEMENT_BYTE, 55, 4};
    }

    static {
        A01();
    }

    public WE(W7 w7, C1204cU c1204cU, boolean z2) {
        this.A01 = w7;
        this.A00 = c1204cU;
        this.A02 = z2;
    }

    @Override // com.instagram.common.viewpoint.core.C6X
    public final void ABT() {
        C1045Zs c1045Zs;
        long j2;
        W6 w6;
        W6 w62;
        if (this.A01.A0a != null) {
            this.A01.A0a.A0J();
            this.A01.A0a = null;
        }
        AdErrorType adErrorType = AdErrorType.CACHE_FAILURE_ERROR;
        String A00 = A00(0, 27, 111);
        c1045Zs = this.A01.A0c;
        C0S A0E = c1045Zs.A0E();
        j2 = this.A01.A00;
        A0E.A38(C0687Lu.A01(j2), adErrorType.getErrorCode(), A00);
        w6 = this.A01.A0G;
        if (w6 != null) {
            w62 = this.A01.A0G;
            w62.ABs(C0625Jg.A01(adErrorType, A00));
        }
    }

    @Override // com.instagram.common.viewpoint.core.C6X
    public final void ABc() {
        W6 w6;
        JQ jq;
        C1045Zs c1045Zs;
        W6 w62;
        C1045Zs c1045Zs2;
        boolean A0q;
        W6 w63;
        C0530Fh c0530Fh;
        C0530Fh c0530Fh2;
        this.A01.A0a = this.A00;
        if (this.A02) {
            c0530Fh = this.A01.A0A;
            if (c0530Fh != null) {
                c0530Fh2 = this.A01.A0A;
                c0530Fh2.A0K();
            }
        }
        w6 = this.A01.A0G;
        if (w6 != null) {
            jq = this.A01.A0E;
            if (jq.equals(JQ.A04)) {
                A0q = this.A01.A0q();
                if (!A0q) {
                    w63 = this.A01.A0G;
                    w63.ACg();
                }
            }
            if (this.A02) {
                W7 w7 = this.A01;
                String[] strArr = A04;
                if (strArr[4].length() != strArr[0].length()) {
                    String[] strArr2 = A04;
                    strArr2[4] = "lirdd0Qr";
                    strArr2[0] = "muvxx";
                    c1045Zs = w7.A0c;
                    if (C0608Im.A1i(c1045Zs) && this.A01.A0z() != null && this.A01.A0z().A19()) {
                        W7 w72 = this.A01;
                        c1045Zs2 = this.A01.A0c;
                        w72.A0M = AbstractC0773Pc.A01(c1045Zs2, this.A01.A0z(), 4, new WF(this));
                        return;
                    } else {
                        W7 w73 = this.A01;
                        if (A04[3].length() != 28) {
                            A04[6] = "Y1qaffLCA6OgZ6gO9VGOLjOrervRHVYN";
                            w62 = w73.A0G;
                            w62.AB6();
                            return;
                        }
                    }
                }
                throw new RuntimeException();
            }
        }
    }
}
