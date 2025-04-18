package com.instagram.common.viewpoint.core;

import com.facebook.ads.internal.protocol.AdErrorType;
import java.util.Arrays;
import okio.Utf8;
import org.json.JSONException;
import org.objectweb.asm.Opcodes;

/* renamed from: com.facebook.ads.redexgen.X.Vx, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0949Vx implements InterfaceC0840Rr {
    public static byte[] A03;
    public static String[] A04 = {"vUQacvUb1jgaOB1nXCILUaEr4ItZ5QEs", "N", "ozPzI", "iemFS7qx3ItQSdDQeBrvuJ9y9CMkfIqY", "EwROMxnfRd6F7268i4EpvPtVg3hQf", "a", "qVu8", "3RxrE6NsEsLt8TXu"};
    public final /* synthetic */ long A00;
    public final /* synthetic */ K6 A01;
    public final /* synthetic */ K9 A02;

    public static String A00(int i2, int i3, int i4) {
        byte[] copyOfRange = Arrays.copyOfRange(A03, i2, i2 + i3);
        for (int i5 = 0; i5 < copyOfRange.length; i5++) {
            copyOfRange[i5] = (byte) ((copyOfRange[i5] ^ i4) ^ 120);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A03 = new byte[]{82, 87, 4, 82, 0, 80, 80, 4, 60, 62, 57, 61, 105, Utf8.REPLACEMENT_BYTE, 111, 62, 44, 53, 41, 40, 35, 30, 5, 3, 22, 18, 15, 9, 8, 92, 70, 78, 120, 111, 107, 120, 111, 61, 120, 111, 111, 114, 111, 61, 114, 126, 126, 104, 111, 111, 120, 121, 124, 74, 93, 89, 74, 93, 15, 93, 74, 95, 67, 70, 74, 75, 15, 92, 90, 76, 76, 74, 92, 92, 73, 90, 67, 67, 86, Utf8.REPLACEMENT_BYTE, 62, 19, Utf8.REPLACEMENT_BYTE, 61, 32, 60, 53, 36, 53, 16, 17, 58, 13, 13, 16, 13};
    }

    static {
        A01();
    }

    public C0949Vx(K9 k9, K6 k6, long j2) {
        this.A02 = k9;
        this.A01 = k6;
        this.A00 = j2;
    }

    private final void A02(S3 s3) {
        C1045Zs c1045Zs;
        long j2;
        C1045Zs c1045Zs2;
        long j3;
        KA ka;
        C1045Zs c1045Zs3;
        C1045Zs c1045Zs4;
        long j4;
        K5.A06(this.A01);
        try {
            InterfaceC0838Rp response = s3.A00();
            if (response != null) {
                String A6X = response.A6X();
                ka = this.A02.A05;
                c1045Zs3 = this.A02.A04;
                KC serverResponse = ka.A06(c1045Zs3, A6X, this.A00);
                if (serverResponse.A01() == KB.A03) {
                    C0946Vt c0946Vt = (C0946Vt) serverResponse;
                    String A042 = c0946Vt.A04();
                    AdErrorType adErrorTypeFromCode = AdErrorType.adErrorTypeFromCode(c0946Vt.A03(), AdErrorType.ERROR_MESSAGE);
                    if (A042 != null) {
                        A6X = A042;
                    }
                    c1045Zs4 = this.A02.A04;
                    C0S A0E = c1045Zs4.A0E();
                    j4 = this.A02.A00;
                    A0E.A3H(C0687Lu.A01(j4), adErrorTypeFromCode.getErrorCode(), A6X, adErrorTypeFromCode.isPublicError());
                    this.A02.A0D(C0625Jg.A01(adErrorTypeFromCode, A6X));
                    return;
                }
            }
            AdErrorType adErrorType = AdErrorType.NETWORK_ERROR;
            String message = s3.getMessage();
            c1045Zs2 = this.A02.A04;
            C0S A0E2 = c1045Zs2.A0E();
            j3 = this.A02.A00;
            long A01 = C0687Lu.A01(j3);
            int errorCode = adErrorType.getErrorCode();
            boolean isPublicError = adErrorType.isPublicError();
            if (A04[2].length() == 29) {
                throw new RuntimeException();
            }
            A04[4] = "NZ18w";
            A0E2.A3H(A01, errorCode, message, isPublicError);
            this.A02.A0D(C0625Jg.A01(adErrorType, message));
        } catch (JSONException e) {
            AdErrorType adErrorType2 = AdErrorType.NETWORK_ERROR;
            String errorMessage = s3.getMessage();
            c1045Zs = this.A02.A04;
            C0S A0E3 = c1045Zs.A0E();
            j2 = this.A02.A00;
            A0E3.A3H(C0687Lu.A01(j2), adErrorType2.getErrorCode(), A00(16, 15, 30) + e.getMessage(), adErrorType2.isPublicError());
            this.A02.A0D(C0625Jg.A01(adErrorType2, errorMessage));
        }
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0840Rr
    public final void ABa(InterfaceC0838Rp interfaceC0838Rp) {
        C1045Zs c1045Zs;
        C1045Zs c1045Zs2;
        AbstractC0638Ju.A05(A00(79, 10, 40), A00(52, 27, 87), A00(0, 8, 30));
        if (interfaceC0838Rp != null) {
            String A6X = interfaceC0838Rp.A6X();
            c1045Zs = this.A02.A04;
            int A02 = C0608Im.A02(c1045Zs);
            String[] strArr = A04;
            String str = strArr[5];
            String response = strArr[1];
            if (str.length() != response.length()) {
                throw new RuntimeException();
            }
            A04[2] = "kblvpkFa8oUK1ItVGqcsW93nH";
            if (A02 > 0) {
                c1045Zs2 = this.A02.A04;
                C0651Kh.A00(c1045Zs2).A0C(A6X);
            }
            K5.A06(this.A01);
            this.A02.A0N(A6X, this.A00, this.A01);
        }
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0840Rr
    public final void ABt(Exception exc) {
        C1045Zs c1045Zs;
        long j2;
        AbstractC0638Ju.A05(A00(89, 7, 7), A00(31, 21, 101), A00(8, 8, Opcodes.FREM));
        if (S3.class.equals(exc.getClass())) {
            A02((S3) exc);
            return;
        }
        AdErrorType adErrorType = AdErrorType.NETWORK_ERROR;
        String errorMessage = exc.getMessage();
        c1045Zs = this.A02.A04;
        C0S A0E = c1045Zs.A0E();
        j2 = this.A02.A00;
        A0E.A3H(C0687Lu.A01(j2), adErrorType.getErrorCode(), errorMessage, adErrorType.isPublicError());
        this.A02.A0D(C0625Jg.A01(adErrorType, errorMessage));
    }
}
