package com.instagram.common.viewpoint.core;

import android.widget.ImageView;

/* loaded from: assets/audience_network.dex */
public class V0 implements InterfaceC0738Nt {
    public final /* synthetic */ C0728Nj A00;

    public V0(C0728Nj c0728Nj) {
        this.A00 = c0728Nj;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0738Nt
    public final void ABL(boolean z2) {
        boolean z3;
        ImageView imageView;
        ImageView imageView2;
        ImageView imageView3;
        z3 = this.A00.A08;
        if (z3) {
            imageView = this.A00.A00;
            if (imageView != null) {
                imageView2 = this.A00.A00;
                imageView2.setEnabled(z2);
                imageView3 = this.A00.A00;
                imageView3.setAlpha(z2 ? 1.0f : 0.3f);
            }
        }
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0738Nt
    public final void AC0(boolean z2) {
        boolean z3;
        ImageView imageView;
        ImageView imageView2;
        ImageView imageView3;
        z3 = this.A00.A08;
        if (z3) {
            imageView = this.A00.A02;
            if (imageView != null) {
                imageView2 = this.A00.A02;
                imageView2.setEnabled(z2);
                imageView3 = this.A00.A02;
                imageView3.setAlpha(z2 ? 1.0f : 0.3f);
            }
        }
    }
}
