package com.instagram.common.viewpoint.core;

/* loaded from: assets/audience_network.dex */
public class WW extends AbstractC03818y<String> {
    public final /* synthetic */ J4 A00;
    public final /* synthetic */ WV A01;

    public WW(WV wv, J4 j4) {
        this.A01 = wv;
        this.A00 = j4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.instagram.common.viewpoint.core.AbstractC03818y
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final void A02(String str) {
        J6 j6;
        J6 j62;
        super.A02(str);
        if (this.A00.A0B()) {
            j62 = this.A01.A02;
            j62.A5Y();
        } else {
            j6 = this.A01.A02;
            j6.A5X();
        }
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC03818y
    public final void A01(int i2, String str) {
        super.A01(i2, str);
    }
}
