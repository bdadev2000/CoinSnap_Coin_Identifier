package com.instagram.common.viewpoint.core;

import android.net.Uri;
import java.io.IOException;

/* loaded from: assets/audience_network.dex */
public final class DQ extends AbstractC0979Xb implements InterfaceC0519Eq {
    public long A00;
    public boolean A01;
    public final int A02;
    public final int A03;
    public final Uri A04;
    public final C0 A05;
    public final InterfaceC0569Gy A06;
    public final Object A07;
    public final String A08;

    public DQ(Uri uri, InterfaceC0569Gy interfaceC0569Gy, C0 c02, int i2, String str, int i3, Object obj) {
        this.A04 = uri;
        this.A06 = interfaceC0569Gy;
        this.A05 = c02;
        this.A03 = i2;
        this.A08 = str;
        this.A02 = i3;
        this.A00 = -9223372036854775807L;
        this.A07 = obj;
    }

    private void A00(long j2, boolean z2) {
        this.A00 = j2;
        this.A01 = z2;
        A01(new XS(this.A00, this.A01, false, this.A07), null);
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC0979Xb
    public final void A02() {
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC0979Xb
    public final void A03(ZB zb, boolean z2) {
        A00(this.A00, false);
    }

    @Override // com.instagram.common.viewpoint.core.Ev
    public final XU A56(Et et, InterfaceC0562Gr interfaceC0562Gr) {
        AbstractC0576Hf.A03(et.A02 == 0);
        return new C0489Dg(this.A04, this.A06.A4t(), this.A05.A4x(), this.A03, A00(et), this, interfaceC0562Gr, this.A08, this.A02);
    }

    @Override // com.instagram.common.viewpoint.core.Ev
    public final void AAo() throws IOException {
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0519Eq
    public final void ADc(long j2, boolean z2) {
        if (j2 == -9223372036854775807L) {
            j2 = this.A00;
        }
        if (this.A00 == j2 && this.A01 == z2) {
            return;
        }
        A00(j2, z2);
    }

    @Override // com.instagram.common.viewpoint.core.Ev
    public final void AF3(XU xu) {
        ((C0489Dg) xu).A0R();
    }
}
