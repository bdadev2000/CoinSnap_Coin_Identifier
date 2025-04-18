package com.instagram.common.viewpoint.core;

import com.facebook.ads.AdError;
import java.util.ArrayList;

/* renamed from: com.facebook.ads.redexgen.X.c3, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1177c3 implements C6X {
    public final /* synthetic */ AbstractC1187cD A00;
    public final /* synthetic */ InterfaceC01951g A01;
    public final /* synthetic */ C01961h A02;
    public final /* synthetic */ C1045Zs A03;
    public final /* synthetic */ boolean A04;

    public C1177c3(C01961h c01961h, C1045Zs c1045Zs, boolean z2, AbstractC1187cD abstractC1187cD, InterfaceC01951g interfaceC01951g) {
        this.A02 = c01961h;
        this.A03 = c1045Zs;
        this.A04 = z2;
        this.A00 = abstractC1187cD;
        this.A01 = interfaceC01951g;
    }

    private void A00(boolean z2) {
        ArrayList arrayList;
        if (z2) {
            if (C0608Im.A1g(this.A03) && this.A04) {
                arrayList = this.A02.A02;
                arrayList.add(AbstractC0773Pc.A01(this.A03, this.A00, 1, new C1178c4(this)));
                return;
            } else {
                this.A01.AB5();
                return;
            }
        }
        this.A01.AB4(AdError.CACHE_ERROR);
    }

    @Override // com.instagram.common.viewpoint.core.C6X
    public final void ABT() {
        A00(false);
    }

    @Override // com.instagram.common.viewpoint.core.C6X
    public final void ABc() {
        A00(true);
    }
}
