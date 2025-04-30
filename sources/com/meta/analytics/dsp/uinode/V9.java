package com.meta.analytics.dsp.uinode;

import com.applovin.exoplayer2.common.base.Ascii;
import com.facebook.ads.internal.protocol.AdErrorType;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public class V9 implements C6U {
    public static byte[] A03;
    public static String[] A04 = {"WE91vPqiHLcyJwrbQHRJcIvZwn5D9l", "3LK2x46Pp3Ld9onr8DyN9Ggm", "60IU9PqapOW3gkaytJRkZEg3", "UqNMzTGRyBNLAx", "QjYmXRpW4", "DeQ01HErfJf7NLfnuVX6corDAbYDzPur", "bhlqPTI7mETXQlgoFXHPJBBhjQPpzoup", "oYTMQ3SHL"};
    public final /* synthetic */ C1754bK A00;
    public final /* synthetic */ V2 A01;
    public final /* synthetic */ boolean A02;

    public static String A00(int i9, int i10, int i11) {
        byte[] copyOfRange = Arrays.copyOfRange(A03, i9, i9 + i10);
        for (int i12 = 0; i12 < copyOfRange.length; i12++) {
            copyOfRange[i12] = (byte) ((copyOfRange[i12] - i11) - 60);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A03 = new byte[]{-16, Ascii.VT, 19, Ascii.SYN, Ascii.SI, Ascii.SO, -54, Ascii.RS, Ascii.EM, -54, Ascii.SO, Ascii.EM, 33, Ascii.CAN, Ascii.SYN, Ascii.EM, Ascii.VT, Ascii.SO, -54, Ascii.VT, -54, Ascii.ETB, Ascii.SI, Ascii.SO, 19, Ascii.VT, -40};
    }

    static {
        A01();
    }

    public V9(V2 v22, C1754bK c1754bK, boolean z8) {
        this.A01 = v22;
        this.A00 = c1754bK;
        this.A02 = z8;
    }

    @Override // com.meta.analytics.dsp.uinode.C6U
    public final void AB2() {
        C1636Yn c1636Yn;
        long j7;
        V1 v12;
        V1 v13;
        if (this.A01.A0a != null) {
            this.A01.A0a.A0J();
            this.A01.A0a = null;
        }
        AdErrorType adErrorType = AdErrorType.CACHE_FAILURE_ERROR;
        String A00 = A00(0, 27, 110);
        c1636Yn = this.A01.A0c;
        C0S A0E = c1636Yn.A0E();
        j7 = this.A01.A00;
        A0E.A2m(C1294Lf.A01(j7), adErrorType.getErrorCode(), A00);
        v12 = this.A01.A0G;
        if (v12 != null) {
            V2 v22 = this.A01;
            String[] strArr = A04;
            String errorMessage = strArr[4];
            if (errorMessage.length() != strArr[7].length()) {
                throw new RuntimeException();
            }
            A04[6] = "7cQ3648pyLFx7h83cxUuTBVDS0jRS450";
            v13 = v22.A0G;
            v13.ABR(C1242Jb.A01(adErrorType, A00));
        }
    }

    @Override // com.meta.analytics.dsp.uinode.C6U
    public final void ABB() {
        V1 v12;
        JL jl;
        C1636Yn c1636Yn;
        V1 v13;
        C1636Yn c1636Yn2;
        boolean A0q;
        V1 v14;
        FO fo;
        FO fo2;
        this.A01.A0a = this.A00;
        if (this.A02) {
            fo = this.A01.A0A;
            if (fo != null) {
                fo2 = this.A01.A0A;
                String[] strArr = A04;
                if (strArr[4].length() != strArr[7].length()) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A04;
                strArr2[4] = "vb7V14ygc";
                strArr2[7] = "eJXYUqUMt";
                fo2.A0I();
            }
        }
        v12 = this.A01.A0G;
        if (v12 != null) {
            jl = this.A01.A0E;
            if (jl.equals(JL.A04)) {
                A0q = this.A01.A0q();
                if (!A0q) {
                    v14 = this.A01.A0G;
                    v14.ACF();
                }
            }
            if (this.A02) {
                c1636Yn = this.A01.A0c;
                if (!C1225Ih.A1Q(c1636Yn) || this.A01.A0z() == null || !this.A01.A0z().A0m()) {
                    v13 = this.A01.A0G;
                    v13.AAg();
                } else {
                    V2 v22 = this.A01;
                    c1636Yn2 = v22.A0c;
                    v22.A0M = PC.A01(c1636Yn2, this.A01.A0z(), 4, new VA(this));
                }
            }
        }
    }
}
