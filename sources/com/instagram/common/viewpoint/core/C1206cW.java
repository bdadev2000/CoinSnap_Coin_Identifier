package com.instagram.common.viewpoint.core;

import com.facebook.ads.internal.protocol.AdErrorType;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.cW, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1206cW implements C6X {
    public static byte[] A04;
    public final /* synthetic */ InterfaceC01860x A00;
    public final /* synthetic */ GK A01;
    public final /* synthetic */ C0515Ei A02;
    public final /* synthetic */ C0705Mm A03;

    static {
        A01();
    }

    public static String A00(int i2, int i3, int i4) {
        byte[] copyOfRange = Arrays.copyOfRange(A04, i2, i2 + i3);
        for (int i5 = 0; i5 < copyOfRange.length; i5++) {
            copyOfRange[i5] = (byte) ((copyOfRange[i5] - i4) - 8);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A04 = new byte[]{-109, -82, -74, -71, -78, -79, 109, -63, -68, 109, -79, -68, -60, -69, -71, -68, -82, -79, 109, -82, 109, -70, -78, -79, -74, -82, 123};
    }

    public C1206cW(GK gk, C0705Mm c0705Mm, InterfaceC01860x interfaceC01860x, C0515Ei c0515Ei) {
        this.A01 = gk;
        this.A03 = c0705Mm;
        this.A00 = interfaceC01860x;
        this.A02 = c0515Ei;
    }

    @Override // com.instagram.common.viewpoint.core.C6X
    public final void ABT() {
        long j2;
        AdErrorType adErrorType = AdErrorType.CACHE_FAILURE_ERROR;
        String A00 = A00(0, 27, 69);
        InterfaceC1229ct A0E = this.A02.A0E();
        j2 = this.A01.A00;
        A0E.A38(C0687Lu.A01(j2), adErrorType.getErrorCode(), A00);
        this.A00.ACN(this.A01, C0625Jg.A01(adErrorType, A00));
    }

    @Override // com.instagram.common.viewpoint.core.C6X
    public final void ABc() {
        InterfaceC01860x interfaceC01860x;
        this.A03.A0J();
        this.A00.ABO(this.A01, this.A03);
        InterfaceC1229ct A0E = this.A02.A0E();
        interfaceC01860x = this.A01.A01;
        A0E.A44(interfaceC01860x != null);
    }
}
