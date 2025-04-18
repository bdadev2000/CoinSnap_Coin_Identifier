package com.facebook.ads.redexgen.uinode;

import android.text.TextUtils;
import com.applovin.exoplayer2.common.base.Ascii;
import com.facebook.ads.internal.protocol.AdErrorType;
import java.util.Arrays;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.io.encoding.Base64;

/* loaded from: assets/audience_network.dex */
public final class K4 {
    public static byte[] A07;
    public static final ThreadFactoryC0740Lr A08;
    public static final Executor A09;
    public static final AtomicReference<K8> A0A;
    public long A00;
    public K3 A01;
    public Map<String, String> A02;
    public final C2S A03;
    public final C1070Yn A04;
    public final K5 A05;
    public final String A06;

    public static String A05(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A07, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 80);
        }
        return new String(copyOfRange);
    }

    public static void A0A() {
        A07 = new byte[]{57, 62, 105, 111, 51, 62, 51, 122, 105, 107, 119, 117, 78, 65, 68, 72, 67, 89, 82, 95, 72, 92, 88, 72, 94, 89, 82, 68, 73, 98, 88, Ascii.VT, 121, 101, 17, Ascii.VT, 100, 101, 10, 108, 99, 102, 102, 10, 88, 79, 73, 79, 67, 92, 79, 78, Ascii.DC4, 53, 122, Ascii.FS, 51, 54, 54, 122, 63, 40, 40, 53, 40, 122, 57, 53, 62, 63, 122, 1, Byte.MAX_VALUE, 41, 7, 122, Byte.MAX_VALUE, 41, Ascii.SI, Ascii.CR, 6, Ascii.CR, Ascii.SUB, 1, Ascii.VT, 81, 90, 75, 72, 80, 77, 84, 40, 41, 0, 47, 42, 42, Ascii.SO, 41, 41, 45, 41, 43, 54, 47, 48, Base64.padSymbol, 60};
    }

    static {
        A0A();
        ThreadFactoryC0740Lr threadFactoryC0740Lr = new ThreadFactoryC0740Lr();
        A08 = threadFactoryC0740Lr;
        A09 = Executors.newCachedThreadPool(threadFactoryC0740Lr);
        A0A = new AtomicReference<>();
    }

    public K4(C1070Yn c1070Yn) {
        this(c1070Yn, C2T.A00(c1070Yn.A01()));
    }

    public K4(C1070Yn c1070Yn, C2S c2s) {
        this.A00 = -1L;
        this.A04 = c1070Yn;
        this.A05 = K5.A00();
        this.A06 = K9.A01(c1070Yn);
        this.A03 = c2s;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public C0974Us A02(long j3, K1 k12) {
        return new C0974Us(this, k12, j3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A09() {
        C1070Yn c1070Yn = this.A04;
        if (c1070Yn == null || !C0881Rc.A0A(c1070Yn)) {
            return;
        }
        C8B c8b = new C8B(A05(7, 5, 107));
        c8b.A05(1);
        this.A04.A07().A9a(A05(85, 7, 111), C8A.A1x, c8b);
    }

    private void A0B(int i10, String str) {
        String A05 = A05(36, 16, 122);
        String A052 = A05(0, 7, 90);
        String A053 = A05(92, 10, 22);
        AbstractC0689Jp.A05(A053, A05, A052);
        AbstractC0689Jp.A04(A053, String.format(Locale.US, A05(52, 26, 10), Integer.valueOf(i10), str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0C(C0676Jb c0676Jb) {
        K3 k32 = this.A01;
        if (k32 != null) {
            k32.ABR(c0676Jb);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0D(C0676Jb c0676Jb) {
        ExecutorC0731Li.A00(new Uq(this, c0676Jb));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0K(C0972Up c0972Up) {
        K3 k32 = this.A01;
        if (k32 != null) {
            k32.ADG(c0972Up);
        }
    }

    private void A0L(C0972Up c0972Up) {
        InterfaceC04027l syncModule;
        ExecutorC0731Li.A00(new C0973Ur(this, c0972Up));
        if (C0659Ih.A26(this.A04) && (syncModule = this.A04.A05()) != null) {
            syncModule.A5m();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0M(String str, long j3, K1 k12) {
        String str2;
        try {
            try {
                K7 A06 = this.A05.A06(this.A04, str, j3);
                C8S A00 = A06.A00();
                if (A00 != null) {
                    C0659Ih.A0R(this.A04).A2X(A00.A08());
                    this.A04.A07().AAL();
                    this.A03.A0N(A00.A06());
                    K0.A05(A00.A05().A0B(), k12);
                    M2.A01(this.A04, A09, A00);
                    C8B c8b = new C8B(A05(29, 7, 123) + LE.A02());
                    c8b.A06(1);
                    c8b.A0A(false);
                    this.A04.A07().AAA(A05(78, 7, 56), C8A.A1W, c8b);
                }
                switch (K2.A00[A06.A01().ordinal()]) {
                    case 1:
                        C0972Up c0972Up = (C0972Up) A06;
                        if (A00 != null) {
                            if (A00.A05().A0E()) {
                                K0.A07(str, k12);
                            }
                            Map<String, String> map = this.A02;
                            if (map != null) {
                                str2 = map.get(A05(12, 17, 93));
                            } else {
                                str2 = null;
                            }
                            if (!TextUtils.isEmpty(A06.A02()) && !TextUtils.isEmpty(str2)) {
                                this.A04.A02().AFL(this.A04, str2, A06.A02());
                            }
                        }
                        this.A04.A0E().A2w(C0728Lf.A01(this.A00));
                        A0L(c0972Up);
                        return;
                    case 2:
                        C0971Uo c0971Uo = (C0971Uo) A06;
                        String A04 = c0971Uo.A04();
                        AdErrorType adErrorTypeFromCode = AdErrorType.adErrorTypeFromCode(c0971Uo.A03(), AdErrorType.ERROR_MESSAGE);
                        A0B(c0971Uo.A03(), A04);
                        if (A04 == null) {
                            A04 = str;
                        }
                        this.A04.A0E().A2v(C0728Lf.A01(this.A00), adErrorTypeFromCode.getErrorCode(), A04, adErrorTypeFromCode.isPublicError());
                        A0D(C0676Jb.A01(adErrorTypeFromCode, A04));
                        return;
                    default:
                        AdErrorType adErrorType = AdErrorType.UNKNOWN_RESPONSE;
                        this.A04.A0E().A2v(C0728Lf.A01(this.A00), adErrorType.getErrorCode(), str, adErrorType.isPublicError());
                        A0D(C0676Jb.A01(adErrorType, str));
                        return;
                }
            } catch (Exception e2) {
                e = e2;
                String message = e.getMessage();
                AdErrorType adErrorType2 = AdErrorType.PARSER_FAILURE;
                this.A04.A0E().A2v(C0728Lf.A01(this.A00), adErrorType2.getErrorCode(), message, adErrorType2.isPublicError());
                A0D(C0676Jb.A01(adErrorType2, message));
            }
        } catch (Exception e10) {
            e = e10;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0N(String str, long j3, K1 k12) {
        A09.execute(new C0975Ut(this, str, j3, k12));
    }

    public final void A0O(K1 k12) {
        this.A00 = System.currentTimeMillis();
        C8J.A0B(this.A04);
        A0A.get();
        if (0 != 0) {
            throw new NullPointerException(A05(102, 7, 9));
        }
        if (K0.A08(k12)) {
            ExecutorC0742Lt.A06.execute(new C0977Uv(this));
            String A02 = K0.A02(k12);
            if (A02 != null) {
                this.A04.A0E().AGt();
                A0N(A02, 0L, k12);
                return;
            } else {
                AdErrorType error = AdErrorType.LOAD_TOO_FREQUENTLY;
                this.A04.A0E().A2v(C0728Lf.A01(this.A00), error.getErrorCode(), error.getDefaultErrorMessage(), error.isPublicError());
                A0D(C0676Jb.A01(error, null));
                return;
            }
        }
        A09.execute(new C0976Uu(this, k12));
    }

    public final void A0P(K3 k32) {
        this.A01 = k32;
    }
}
