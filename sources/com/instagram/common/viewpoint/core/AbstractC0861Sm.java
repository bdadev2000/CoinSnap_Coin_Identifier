package com.instagram.common.viewpoint.core;

import android.util.AttributeSet;
import android.widget.RelativeLayout;

/* renamed from: com.facebook.ads.redexgen.X.Sm, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC0861Sm extends RelativeLayout implements InterfaceC0816Qt {
    public T7 A00;

    public AbstractC0861Sm(C1045Zs c1045Zs) {
        super(c1045Zs);
    }

    public AbstractC0861Sm(C1045Zs c1045Zs, AttributeSet attributeSet, int i2) {
        super(c1045Zs, attributeSet, i2);
        RelativeLayout.LayoutParams params = new RelativeLayout.LayoutParams(-1, -1);
        setLayoutParams(params);
    }

    public void A07() {
    }

    public void A08() {
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0816Qt
    public final void A9r(T7 t7) {
        this.A00 = t7;
        A07();
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0816Qt
    public final void AHD(T7 t7) {
        A08();
        this.A00 = null;
    }

    public T7 getVideoView() {
        return this.A00;
    }
}
