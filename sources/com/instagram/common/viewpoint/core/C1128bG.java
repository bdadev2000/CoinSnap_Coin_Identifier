package com.instagram.common.viewpoint.core;

import android.graphics.drawable.Drawable;

/* renamed from: com.facebook.ads.redexgen.X.bG, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1128bG implements InterfaceC02202f {
    public Drawable A00;
    public final /* synthetic */ AbstractC02192e A01;

    public C1128bG(AbstractC02192e abstractC02192e) {
        this.A01 = abstractC02192e;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC02202f
    public final Drawable A6h() {
        return this.A00;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC02202f
    public final AbstractC02192e A6i() {
        return this.A01;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC02202f
    public final boolean A89() {
        return this.A01.getPreventCornerOverlap();
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC02202f
    public final boolean A8e() {
        return this.A01.getUseCompatPadding();
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC02202f
    public final void AGK(Drawable drawable) {
        this.A00 = drawable;
        this.A01.setBackgroundDrawable(drawable);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC02202f
    public final void AGX(int i2, int i3) {
        if (i2 > this.A01.A01) {
            super/*android.widget.FrameLayout*/.setMinimumWidth(i2);
        }
        if (i3 > this.A01.A00) {
            super/*android.widget.FrameLayout*/.setMinimumHeight(i3);
        }
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC02202f
    public final void AGe(int i2, int i3, int i4, int i5) {
        this.A01.A05.set(i2, i3, i4, i5);
        super/*android.widget.FrameLayout*/.setPadding(this.A01.A04.left + i2, this.A01.A04.top + i3, this.A01.A04.right + i4, this.A01.A04.bottom + i5);
    }
}
