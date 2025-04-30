package com.meta.analytics.dsp.uinode;

import android.net.Uri;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.IOException;

/* loaded from: assets/audience_network.dex */
public final class CB extends WW implements InterfaceC1129El {
    public long A00;
    public boolean A01;
    public final int A02;
    public final int A03;
    public final Uri A04;
    public final InterfaceC1077Bv A05;
    public final InterfaceC1186Gt A06;
    public final Object A07;
    public final String A08;

    public CB(Uri uri, InterfaceC1186Gt interfaceC1186Gt, InterfaceC1077Bv interfaceC1077Bv, int i9, String str, int i10, Object obj) {
        this.A04 = uri;
        this.A06 = interfaceC1186Gt;
        this.A05 = interfaceC1077Bv;
        this.A03 = i9;
        this.A08 = str;
        this.A02 = i10;
        this.A00 = C.TIME_UNSET;
        this.A07 = obj;
    }

    private void A00(long j7, boolean z8) {
        this.A00 = j7;
        this.A01 = z8;
        A01(new WN(this.A00, this.A01, false, this.A07), null);
    }

    @Override // com.meta.analytics.dsp.uinode.WW
    public final void A02() {
    }

    @Override // com.meta.analytics.dsp.uinode.WW
    public final void A03(Y6 y6, boolean z8) {
        A00(this.A00, false);
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC1134Eq
    public final WP A4k(C1132Eo c1132Eo, InterfaceC1179Gm interfaceC1179Gm) {
        AbstractC1192Ha.A03(c1132Eo.A02 == 0);
        return new CD(this.A04, this.A06.A4X(), this.A05.A4b(), this.A03, A00(c1132Eo), this, interfaceC1179Gm, this.A08, this.A02);
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC1134Eq
    public final void AAO() throws IOException {
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC1129El
    public final void AD9(long j7, boolean z8) {
        if (j7 == C.TIME_UNSET) {
            j7 = this.A00;
        }
        if (this.A00 == j7 && this.A01 == z8) {
            return;
        }
        A00(j7, z8);
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC1134Eq
    public final void AEa(WP wp) {
        ((CD) wp).A0R();
    }
}
