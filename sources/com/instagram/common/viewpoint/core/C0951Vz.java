package com.instagram.common.viewpoint.core;

import android.content.pm.PackageManager;
import android.util.Base64;
import com.facebook.ads.internal.protocol.AdErrorType;
import java.util.Arrays;
import java.util.Map;
import okio.Utf8;

/* renamed from: com.facebook.ads.redexgen.X.Vz, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0951Vz extends KY {
    public static byte[] A02;
    public static String[] A03 = {"rr4pEtDer0K6hYSMypGI4SVA4", "qv2m0fG", "2OIR1Yv9Y7RzsB5MK8fjyIRTaeFBsJy", "02JyCSWW55zn1AQ6h7F4FoBumR9MK", "PV14KCf6Ep37wllo1HHxqudNmgtveNCD", "8xcTKK5W7UNHePnVaLckl2F", "lGpL0wggi73mqN0I3cVtORcNpouSV80j", "84RqxglWV7M6OmuSAB1gnMVf4"};
    public final /* synthetic */ K6 A00;
    public final /* synthetic */ K9 A01;

    public static String A00(int i2, int i3, int i4) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i2, i2 + i3);
        for (int i5 = 0; i5 < copyOfRange.length; i5++) {
            copyOfRange[i5] = (byte) ((copyOfRange[i5] ^ i4) ^ 98);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A02 = new byte[]{121, 115, 97, 124, Byte.MAX_VALUE, 112, 112, 123, 108, 97, 117, 123, 103, 18, 51, 124, 50, 57, 40, 43, 51, 46, 55, 124, Utf8.REPLACEMENT_BYTE, 51, 50, 50, 57, Utf8.REPLACEMENT_BYTE, 40, 53, 51, 50};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    @Override // com.instagram.common.viewpoint.core.KY
    public final void A06() {
        C1045Zs c1045Zs;
        C1045Zs c1045Zs2;
        C1045Zs c1045Zs3;
        C1045Zs c1045Zs4;
        C1045Zs c1045Zs5;
        long j2;
        C1045Zs c1045Zs6;
        String str;
        Map<? extends String, ? extends String> map;
        InterfaceC0840Rr A022;
        C1045Zs c1045Zs7;
        C1045Zs c1045Zs8;
        C1045Zs c1045Zs9;
        C1045Zs c1045Zs10;
        long j3;
        c1045Zs = this.A01.A04;
        if (AbstractC0685Ls.A00(c1045Zs) == EnumC0684Lr.A07) {
            this.A01.A09();
            AdErrorType adErrorType = AdErrorType.NETWORK_ERROR;
            String A00 = A00(13, 21, 62);
            c1045Zs10 = this.A01.A04;
            C0S A0E = c1045Zs10.A0E();
            j3 = this.A01.A00;
            A0E.A3H(C0687Lu.A01(j3), adErrorType.getErrorCode(), A00, adErrorType.isPublicError());
            this.A01.A0D(new C0625Jg(adErrorType, A00));
            return;
        }
        c1045Zs2 = this.A01.A04;
        C8N.A08(c1045Zs2);
        c1045Zs3 = this.A01.A04;
        C6H.A07(c1045Zs3);
        C03738q A002 = C03738q.A00();
        c1045Zs4 = this.A01.A04;
        boolean z2 = true;
        Map<String, String> A0A = this.A00.A0A(A002.A01(c1045Zs4, true).A7K(this.A00.A05()));
        this.A01.A02 = A0A;
        try {
            c1045Zs7 = this.A01.A04;
            PackageManager packageManager = c1045Zs7.getPackageManager();
            if (packageManager != null) {
                String A003 = A00(1, 12, 92);
                StringBuilder sb = new StringBuilder();
                c1045Zs8 = this.A01.A04;
                StringBuilder append = sb.append(c1045Zs8.getPackageName()).append(A00(0, 1, 59));
                c1045Zs9 = this.A01.A04;
                A0A.put(A003, new String(Base64.encode(append.append(packageManager.getInstallerPackageName(c1045Zs9.getPackageName())).toString().getBytes(), 2)));
            }
        } catch (Exception unused) {
        }
        try {
            if (this.A00.A07() != EnumC0629Jl.A04 && this.A00.A07() != EnumC0629Jl.A06 && this.A00.A07() != EnumC0629Jl.A05 && this.A00.A07() != null) {
                z2 = false;
            }
            c1045Zs6 = this.A01.A04;
            InterfaceC0839Rq A023 = S8.A02(z2, c1045Zs6);
            str = this.A01.A06;
            S4 s4 = new S4();
            map = this.A01.A02;
            byte[] A08 = s4.A05(map).A08();
            A022 = this.A01.A02(C0687Lu.A00(), this.A00);
            A023.AET(str, A08, A022);
        } catch (Exception e) {
            AdErrorType adErrorType2 = AdErrorType.AD_REQUEST_FAILED;
            String message = e.getMessage();
            c1045Zs5 = this.A01.A04;
            C0S A0E2 = c1045Zs5.A0E();
            j2 = this.A01.A00;
            A0E2.A3H(C0687Lu.A01(j2), adErrorType2.getErrorCode(), message, adErrorType2.isPublicError());
            K9 k9 = this.A01;
            C0625Jg A01 = C0625Jg.A01(adErrorType2, message);
            if (A03[3].length() != 29) {
                throw new RuntimeException();
            }
            A03[3] = "TysUXKeFt8WChM0CalDFmuBH7ELd8";
            k9.A0D(A01);
        }
    }

    static {
        A02();
    }

    public C0951Vz(K9 k9, K6 k6) {
        this.A01 = k9;
        this.A00 = k6;
    }
}
