package com.meta.analytics.dsp.uinode;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;

/* loaded from: assets/audience_network.dex */
public class Z9 implements InterfaceC09275o {
    public final /* synthetic */ ImageView A00;
    public final /* synthetic */ C09295q A01;
    public final /* synthetic */ V2 A02;

    public Z9(C09295q c09295q, ImageView imageView, V2 v22) {
        this.A01 = c09295q;
        this.A00 = imageView;
        this.A02 = v22;
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC09275o
    public final void ABi(Drawable drawable) {
        V2.A0e(drawable, this.A00);
        this.A02.A1J(drawable);
    }
}
