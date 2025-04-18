package com.instagram.common.viewpoint.core;

import android.view.View;
import java.util.Arrays;
import okio.Utf8;

/* renamed from: com.facebook.ads.redexgen.X.bx, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1171bx implements InterfaceC01860x {
    public static byte[] A02;
    public static String[] A03 = {"ebJtInVgM8lwtLsL8CqjQvfHZTFWXyTj", "MRT4Iz3aNiJEaKRUIrDApfghDq01n6sB", "qhIcWii6jOsLbVLe4G", "jd0Ec4CahT7YYBjB568owPC0gY4s3zOU", "RPiMcfQYBdHC0SSG6XvNc0NsjlYurq5U", "E74vSWGMqEH8Jt4WlgBEkdQ8nTEO7fKB", "DEVdv4rr1ByH9p4ezSF9ryFdFyWOGnGy", "23RYwIDt1nJrIBpc57"};
    public final /* synthetic */ C0532Fj A00;
    public final /* synthetic */ Runnable A01;

    public static String A00(int i2, int i3, int i4) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i2, i2 + i3);
        for (int i5 = 0; i5 < copyOfRange.length; i5++) {
            copyOfRange[i5] = (byte) ((copyOfRange[i5] ^ i4) ^ 78);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A02 = new byte[]{94, 88, 14, 14, 8, 10, 13, 8, 32, 3, 12, 12, 7, 16, 66, 11, 15, 18, 16, 7, 17, 17, 11, 13, 12, 66, 4, 11, 16, 7, 6, 28, 29, 49, 18, 29, 29, 22, 1, Utf8.REPLACEMENT_BYTE, 28, 20, 20, 26, 29, 20, 58, 30, 3, 1, 22, 0, 0, 26, 28, 29};
    }

    static {
        A01();
    }

    public C1171bx(C0532Fj c0532Fj, Runnable runnable) {
        this.A00 = c0532Fj;
        this.A01 = runnable;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC01860x
    public final void ABN(InterfaceC1215cf interfaceC1215cf) {
        C0515Ei c0515Ei;
        c0515Ei = this.A00.A02;
        c0515Ei.A0E().A4G();
        this.A00.A07.A0C();
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC01860x
    public final void ABO(InterfaceC1215cf interfaceC1215cf, View view) {
        C0515Ei c0515Ei;
        c0515Ei = this.A00.A02;
        c0515Ei.A0E().A4F(interfaceC1215cf == ((AbstractC1168bu) this.A00).A00);
        if (interfaceC1215cf != ((AbstractC1168bu) this.A00).A00) {
            return;
        }
        this.A00.A0G().removeCallbacks(this.A01);
        InterfaceC01780p interfaceC01780p = ((AbstractC1168bu) this.A00).A01;
        C0532Fj c0532Fj = this.A00;
        String[] strArr = A03;
        if (strArr[6].charAt(14) != strArr[5].charAt(14)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A03;
        strArr2[0] = "gfJNIdbF2FrCa8qL8kuytpSS0QUlrsrj";
        strArr2[1] = "KzSpIsxhAVssntgB7OlLodebxm4ynnXJ";
        ((AbstractC1168bu) c0532Fj).A01 = interfaceC1215cf;
        this.A00.A01 = view;
        if (!this.A00.A0C) {
            this.A00.A07.A0F(interfaceC1215cf);
        } else {
            this.A00.A07.A0E(view);
            this.A00.A0P(interfaceC01780p);
        }
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC01860x
    public final void ABP(InterfaceC1215cf interfaceC1215cf) {
        C0515Ei c0515Ei;
        AbstractC0638Ju.A05(A00(31, 25, 61), A00(8, 23, 44), A00(0, 8, 37));
        c0515Ei = this.A00.A02;
        c0515Ei.A0E().A4I();
        this.A00.A07.A0D();
        this.A00.A0N();
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC01860x
    public final void ACN(InterfaceC1215cf interfaceC1215cf, C0625Jg c0625Jg) {
        C0515Ei c0515Ei;
        c0515Ei = this.A00.A02;
        c0515Ei.A0E().A4H(interfaceC1215cf == ((AbstractC1168bu) this.A00).A00, c0625Jg.A03().getErrorCode());
        if (interfaceC1215cf != ((AbstractC1168bu) this.A00).A00) {
            return;
        }
        this.A00.A0G().removeCallbacks(this.A01);
        this.A00.A0P(interfaceC1215cf);
        this.A00.ABs(c0625Jg);
    }
}
