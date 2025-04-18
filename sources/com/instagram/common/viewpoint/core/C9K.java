package com.instagram.common.viewpoint.core;

/* renamed from: com.facebook.ads.redexgen.X.9K, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public class C9K extends AbstractC0836Rn {
    public final /* synthetic */ QG A00;

    public C9K(QG qg) {
        this.A00 = qg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.instagram.common.viewpoint.core.AbstractC03808x
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final void A03(SZ sz) {
        if (QG.A07(this.A00) && QG.A08(this.A00)) {
            QG.A0B(this.A00, false);
            if (QG.A0A(this.A00, RE.A03) || QG.A09(this.A00)) {
                QG.A0C(this.A00, false);
                QG.A01(this.A00).postDelayed(new QO(this), QG.A00(this.A00));
            } else {
                if (!QG.A0A(this.A00, RE.A02)) {
                    return;
                }
                QG.A04(this.A00);
                QG.A05(this.A00, true, true);
            }
        }
    }
}
