package com.instagram.common.viewpoint.core;

import android.content.Context;
import com.facebook.ads.internal.dynamicloading.DynamicLoaderImpl;
import com.facebook.ads.internal.util.process.ProcessUtils;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public final class ZQ implements InterfaceC03477l {
    public static ZQ A07;
    public static byte[] A08;
    public C0W A00;
    public InterfaceC03266j A01;
    public InterfaceC03467k A02;
    public AnonymousClass80 A03;
    public C03648h A04;
    public JJ A05;
    public InterfaceC0640Jw A06;

    static {
        A07();
    }

    public static String A06(int i2, int i3, int i4) {
        byte[] copyOfRange = Arrays.copyOfRange(A08, i2, i2 + i3);
        for (int i5 = 0; i5 < copyOfRange.length; i5++) {
            copyOfRange[i5] = (byte) ((copyOfRange[i5] - i4) - 118);
        }
        return new String(copyOfRange);
    }

    public static void A07() {
        A08 = new byte[]{11, 11, 17, 61, 58, 14, 59, 10, 13, 31, 45, 45, 35, 41, 40, -38, 30, 27, 46, 27, -38, 35, 40, 35, 46, 35, 27, 38, 35, 52, 31, 30, 28, 15, 26, 25, 28, 30, -3, 15, 29, 29, 19, 25, 24, -18, 11, 30, 11, -13, 24, 19, 30, 19, 11, 22, 19, 36, 15, 14};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public final synchronized void A0C(C1044Zr c1044Zr) {
        if (this.A06 != null) {
            return;
        }
        this.A03 = A01(c1044Zr);
        this.A06 = A05(c1044Zr, this.A03, A03(c1044Zr));
        A09(c1044Zr, A00(c1044Zr, this.A06));
        A0A(c1044Zr, this.A06);
        A0B(c1044Zr, this.A06);
        if (this.A06 != null) {
            this.A06.A68();
        }
    }

    public static AnonymousClass69 A00(C1044Zr c1044Zr, InterfaceC0640Jw interfaceC0640Jw) {
        if (!C0608Im.A1h(c1044Zr) || interfaceC0640Jw == null) {
            return null;
        }
        return C6A.A00().A00(interfaceC0640Jw);
    }

    public static AnonymousClass80 A01(C1044Zr c1044Zr) {
        return AnonymousClass81.A00().A00(c1044Zr, new ZX());
    }

    public static synchronized ZQ A02() {
        ZQ zq;
        synchronized (ZQ.class) {
            if (A07 == null) {
                A07 = new ZQ();
            }
            zq = A07;
        }
        return zq;
    }

    public static InterfaceC0839Rq A03(C1044Zr c1044Zr) {
        if (!C0608Im.A1d(c1044Zr)) {
            return null;
        }
        return S8.A01(c1044Zr);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.instagram.common.viewpoint.core.InterfaceC03477l
    /* renamed from: A04, reason: merged with bridge method [inline-methods] */
    public final synchronized InterfaceC0640Jw A8U() {
        return this.A06;
    }

    public static InterfaceC0640Jw A05(C1044Zr c1044Zr, AnonymousClass80 anonymousClass80, InterfaceC0839Rq interfaceC0839Rq) {
        if (!C0608Im.A2Z(c1044Zr) || interfaceC0839Rq == null || ProcessUtils.isRemoteRenderingProcess()) {
            return null;
        }
        return SV.A00().A00(c1044Zr, anonymousClass80, interfaceC0839Rq, KE.A04(c1044Zr), new ZR(new K6(c1044Zr, A06(0, 0, 9), null, EnumC0629Jl.A08, 0, new C0634Jq(), AbstractC0678Ll.A01(C0608Im.A0L(c1044Zr)), null, null, new C1155bh()), c1044Zr), ST.A00().A00());
    }

    public static void A08() {
        AbstractC0638Ju.A05(A06(32, 28, 52), A06(8, 24, 68), A06(0, 8, 99));
    }

    public static void A09(C1044Zr c1044Zr, AnonymousClass69 anonymousClass69) {
        if (!C0608Im.A1h(c1044Zr) || anonymousClass69 == null) {
            return;
        }
        AnonymousClass67.A00().A00(anonymousClass69, c1044Zr);
    }

    public static void A0A(C1044Zr c1044Zr, InterfaceC0640Jw interfaceC0640Jw) {
        if (!C0608Im.A0j(c1044Zr) || interfaceC0640Jw == null) {
            return;
        }
        new C6U(c1044Zr, interfaceC0640Jw, new C6V(), DynamicLoaderImpl.getBidderTokenProviderApi().A00());
    }

    public static void A0B(C1044Zr c1044Zr, InterfaceC0640Jw interfaceC0640Jw) {
        if (interfaceC0640Jw == null) {
            return;
        }
        AbstractC0611Iq.A00(c1044Zr, interfaceC0640Jw);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC03477l
    public final J7 A6H(C1044Zr c1044Zr) {
        return WV.A01(c1044Zr);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC03477l
    public final synchronized InterfaceC03467k A6Y(C7j c7j) {
        if (this.A02 == null) {
            this.A02 = new ZS(this);
        }
        return this.A02;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC03477l
    public final synchronized InterfaceC03266j A6j() {
        if (this.A01 == null) {
            this.A01 = new C1046Zt();
        }
        return this.A01;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC03477l
    public final synchronized AnonymousClass80 A77(C7j c7j) {
        if (this.A03 == null) {
            this.A03 = A01(c7j.A01());
        }
        return this.A03;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC03477l
    public final synchronized C8D A79(C7j c7j) {
        return new C1033Zg(c7j);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC03477l
    public final synchronized InterfaceC03487m A7J(C7j c7j) {
        return new C0514Eg(this, c7j);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC03477l
    public final synchronized C0W A7V(C7j c7j) {
        if (!C0608Im.A0z(c7j)) {
            return null;
        }
        if (this.A00 == null) {
            this.A00 = C0X.A00().A00(new ZV(c7j));
        }
        return this.A00;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC03477l
    public final synchronized InterfaceC03497o A8E(C7j c7j) {
        return new ZT(c7j);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC03477l
    public final C1044Zr A8F(Context context) {
        C1044Zr sdkContext = AbstractC03457i.A00();
        if (sdkContext == null) {
            C1044Zr sdkContext2 = new C1044Zr(context, this);
            AbstractC03457i.A01(sdkContext2);
            return sdkContext2;
        }
        return sdkContext;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC03477l
    public final synchronized JJ A8G(C1044Zr c1044Zr) {
        if (this.A05 == null) {
            this.A05 = new C0955Wd(c1044Zr);
        }
        return this.A05;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC03477l
    public final synchronized C03648h A8M() {
        if (this.A04 == null) {
            this.A04 = new C03648h();
            A08();
        }
        return this.A04;
    }
}
