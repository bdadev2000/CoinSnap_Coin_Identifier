package com.instagram.common.viewpoint.core;

import android.os.Bundle;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.9S, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class C9S extends C0863So {
    public static String[] A0F = {"r3hDWnB1R9y4pEiKAURNp99h2b", "kj3t6dP2tWSOfb61zMSBvgjhGLqlygll", "", "sX8uIgx32JWe8q5WuLHBMtkPG7d", "ZlH8xHdCAMZsgB23qoj", "6lejLSjHGD", "XsRzuVWfX96s5Dei3zwO9zjz9s6FXTfu", "pCK0u"};
    public int A00;
    public C0805Qi A01;
    public boolean A02;
    public final AbstractC03808x<C9R> A03;
    public final AbstractC03808x<C9P> A04;
    public final AbstractC03808x<SZ> A05;
    public final AbstractC03808x<C9O> A06;
    public final AbstractC03808x<R6> A07;
    public final AbstractC03808x<R0> A08;
    public final AbstractC03808x<C0822Qz> A09;
    public final AbstractC03808x<QQ> A0A;
    public final AbstractC03808x<QP> A0B;
    public final T7 A0C;
    public final R9 A0D;
    public final AbstractC0802Qf A0E;

    public C9S(C1045Zs c1045Zs, J7 j7, T7 t7, String str) {
        this(c1045Zs, j7, t7, str, 0, 0, false, null, null);
    }

    public C9S(C1045Zs c1045Zs, J7 j7, T7 t7, String str, int i2, int i3, boolean z2, Bundle bundle, Map<String, String> map) {
        super(c1045Zs, j7, t7, str, !t7.A0i(), i2, i3, z2, bundle, map, new C0862Sn(c1045Zs, t7));
        this.A0E = new AbstractC0802Qf() { // from class: com.facebook.ads.redexgen.X.9T
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.instagram.common.viewpoint.core.AbstractC03808x
            /* renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(C0819Qw c0819Qw) {
                C9S.this.A0e();
            }
        };
        this.A08 = new C0873Sy(this);
        this.A04 = new C0872Sx(this);
        this.A05 = new C0871Sw(this);
        this.A06 = new C0870Sv(this);
        this.A03 = new C0869Su(this);
        this.A07 = new C0868St(this);
        this.A0A = new C0867Ss(this);
        this.A0B = new C0866Sr(this);
        this.A09 = new T6(this);
        this.A0D = new R9() { // from class: com.facebook.ads.redexgen.X.9U
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.instagram.common.viewpoint.core.AbstractC03808x
            /* renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(C0829Rg c0829Rg) {
                T7 t72;
                C9S c9s = C9S.this;
                t72 = C9S.this.A0C;
                c9s.A00 = t72.getDuration();
            }
        };
        this.A02 = false;
        this.A0C = t7;
        this.A0C.getEventBus().A03(this.A0E, this.A06, this.A08, this.A05, this.A04, this.A03, this.A07, this.A0A, this.A0B, this.A0D, this.A09);
        if (C0608Im.A2h(c1045Zs)) {
            this.A01 = new C0805Qi(t7, str, null);
        }
    }

    public C9S(C1045Zs c1045Zs, J7 j7, T7 t7, String str, Bundle bundle, Map<String, String> extraParams) {
        this(c1045Zs, j7, t7, str, 0, 0, false, bundle, extraParams);
    }

    @Override // com.instagram.common.viewpoint.core.C0863So
    public final void A0m(EnumC0809Qm enumC0809Qm, Map<String, String> map) {
        super.A0m(enumC0809Qm, map);
        if (this.A01 != null && enumC0809Qm == EnumC0809Qm.A09) {
            Map<String, String> params = this.A01.A05();
            String[] strArr = A0F;
            if (strArr[0].length() == strArr[3].length()) {
                throw new RuntimeException();
            }
            A0F[2] = "tc9";
            map.putAll(params);
        }
    }

    public final void A0o() {
        C0874Sz c0874Sz = new C0874Sz(this);
        if (this.A0C.A0m()) {
            ExecutorC0690Lx.A00(c0874Sz);
            return;
        }
        T7 t7 = this.A0C;
        String[] strArr = A0F;
        if (strArr[4].length() == strArr[6].length()) {
            throw new RuntimeException();
        }
        A0F[1] = "nFCp2DExxe9bklz52WjNRol8ULAuMoj6";
        t7.getStateHandler().post(c0874Sz);
    }
}
