package com.meta.analytics.dsp.uinode;

import com.applovin.exoplayer2.common.base.Ascii;
import com.facebook.ads.internal.protocol.AdErrorType;
import java.util.Arrays;
import org.json.JSONException;

/* renamed from: com.facebook.ads.redexgen.X.Us, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1540Us implements RL {
    public static byte[] A03;
    public final /* synthetic */ long A00;
    public final /* synthetic */ K1 A01;
    public final /* synthetic */ K4 A02;

    static {
        A01();
    }

    public static String A00(int i9, int i10, int i11) {
        byte[] copyOfRange = Arrays.copyOfRange(A03, i9, i9 + i10);
        for (int i12 = 0; i12 < copyOfRange.length; i12++) {
            copyOfRange[i12] = (byte) ((copyOfRange[i12] ^ i11) ^ 10);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A03 = new byte[]{103, 54, 102, 103, 100, 53, 105, 101, 109, 116, 104, 105, 98, 95, 68, 66, 87, 83, 78, 72, 73, Ascii.GS, 7, Ascii.CAN, 46, 57, 61, 46, 57, 107, 46, 57, 57, 36, 57, 107, 36, 40, 40, 62, 57, 57, 46, 47, 108, 90, 77, 73, 90, 77, Ascii.US, 77, 90, 79, 83, 86, 90, 91, Ascii.US, 76, 74, 92, 92, 90, 76, 76, 89, 74, 83, 83, 70, 122, 123, 32, 124, 123, 41, 47, 75, 74, 103, 75, 73, 84, 72, 65, 80, 65, 95, 94, 117, 66, 66, 95, 66};
    }

    public C1540Us(K4 k42, K1 k12, long j7) {
        this.A02 = k42;
        this.A01 = k12;
        this.A00 = j7;
    }

    private final void A02(RX rx) {
        C1636Yn c1636Yn;
        long j7;
        C1636Yn c1636Yn2;
        long j9;
        K5 k52;
        C1636Yn c1636Yn3;
        C1636Yn c1636Yn4;
        long j10;
        K0.A06(this.A01);
        try {
            RJ response = rx.A00();
            if (response != null) {
                String A69 = response.A69();
                k52 = this.A02.A05;
                c1636Yn3 = this.A02.A04;
                K7 serverResponse = k52.A06(c1636Yn3, A69, this.A00);
                if (serverResponse.A01() == K6.A03) {
                    C1537Uo c1537Uo = (C1537Uo) serverResponse;
                    String A04 = c1537Uo.A04();
                    AdErrorType adErrorTypeFromCode = AdErrorType.adErrorTypeFromCode(c1537Uo.A03(), AdErrorType.ERROR_MESSAGE);
                    if (A04 != null) {
                        A69 = A04;
                    }
                    c1636Yn4 = this.A02.A04;
                    C0S A0E = c1636Yn4.A0E();
                    j10 = this.A02.A00;
                    A0E.A2v(C1294Lf.A01(j10), adErrorTypeFromCode.getErrorCode(), A69, adErrorTypeFromCode.isPublicError());
                    this.A02.A0D(C1242Jb.A01(adErrorTypeFromCode, A69));
                    return;
                }
            }
            AdErrorType adErrorType = AdErrorType.NETWORK_ERROR;
            String errorMessage = rx.getMessage();
            c1636Yn2 = this.A02.A04;
            C0S A0E2 = c1636Yn2.A0E();
            j9 = this.A02.A00;
            A0E2.A2v(C1294Lf.A01(j9), adErrorType.getErrorCode(), errorMessage, adErrorType.isPublicError());
            this.A02.A0D(C1242Jb.A01(adErrorType, errorMessage));
        } catch (JSONException e4) {
            AdErrorType adErrorType2 = AdErrorType.NETWORK_ERROR;
            String errorMessage2 = rx.getMessage();
            c1636Yn = this.A02.A04;
            C0S A0E3 = c1636Yn.A0E();
            j7 = this.A02.A00;
            A0E3.A2v(C1294Lf.A01(j7), adErrorType2.getErrorCode(), A00(8, 15, 45) + e4.getMessage(), adErrorType2.isPublicError());
            this.A02.A0D(C1242Jb.A01(adErrorType2, errorMessage2));
        }
    }

    @Override // com.meta.analytics.dsp.uinode.RL
    public final void AB9(RJ rj) {
        AbstractC1255Jp.A05(A00(78, 10, 46), A00(44, 27, 53), A00(0, 8, 90));
        if (rj != null) {
            String A69 = rj.A69();
            K0.A06(this.A01);
            this.A02.A0N(A69, this.A00, this.A01);
        }
    }

    @Override // com.meta.analytics.dsp.uinode.RL
    public final void ABS(Exception exc) {
        C1636Yn c1636Yn;
        long j7;
        AbstractC1255Jp.A05(A00(88, 7, 58), A00(23, 21, 65), A00(71, 7, 18));
        if (RX.class.equals(exc.getClass())) {
            A02((RX) exc);
            return;
        }
        AdErrorType adErrorType = AdErrorType.NETWORK_ERROR;
        String errorMessage = exc.getMessage();
        c1636Yn = this.A02.A04;
        C0S A0E = c1636Yn.A0E();
        j7 = this.A02.A00;
        A0E.A2v(C1294Lf.A01(j7), adErrorType.getErrorCode(), errorMessage, adErrorType.isPublicError());
        this.A02.A0D(C1242Jb.A01(adErrorType, errorMessage));
    }
}
