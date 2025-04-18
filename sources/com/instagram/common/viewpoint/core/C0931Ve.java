package com.instagram.common.viewpoint.core;

import android.content.DialogInterface;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.Ve, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0931Ve extends KY {
    public final /* synthetic */ DialogInterface A00;
    public final /* synthetic */ MG A01;

    public C0931Ve(MG mg, DialogInterface dialogInterface) {
        this.A01 = mg;
        this.A00 = dialogInterface;
    }

    @Override // com.instagram.common.viewpoint.core.KY
    public final void A06() {
        InterfaceC0839Rq interfaceC0839Rq;
        InterfaceC0839Rq interfaceC0839Rq2;
        C1044Zr c1044Zr;
        Map<? extends String, ? extends String> A02;
        interfaceC0839Rq = this.A01.A01.A02;
        if (interfaceC0839Rq != null) {
            interfaceC0839Rq2 = this.A01.A01.A02;
            c1044Zr = this.A01.A01.A00;
            String A03 = KE.A03(c1044Zr);
            S4 s4 = new S4();
            A02 = this.A01.A01.A02(this.A01.A00.getText().toString());
            interfaceC0839Rq2.AES(A03, s4.A05(A02).A08());
        }
        this.A00.cancel();
    }
}
