package com.instagram.common.viewpoint.core;

/* loaded from: assets/audience_network.dex */
public class PV extends AbstractC03808x<C9O> {
    public final /* synthetic */ PC A00;

    public PV(PC pc) {
        this.A00 = pc;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.instagram.common.viewpoint.core.AbstractC03808x
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final void A03(C9O c9o) {
        T7 t7;
        T7 t72;
        T7 t73;
        String A02;
        t7 = this.A00.A00;
        if (t7 == null) {
            return;
        }
        PC pc = this.A00;
        PC pc2 = this.A00;
        t72 = this.A00.A00;
        int duration = t72.getDuration();
        t73 = this.A00.A00;
        A02 = pc2.A02(duration - t73.getCurrentPositionInMillis());
        pc.setText(A02);
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC03808x
    public final Class<C9O> A01() {
        return C9O.class;
    }
}
