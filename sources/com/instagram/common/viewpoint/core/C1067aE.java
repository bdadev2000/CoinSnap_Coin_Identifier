package com.instagram.common.viewpoint.core;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;

/* renamed from: com.facebook.ads.redexgen.X.aE, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1067aE implements InterfaceC03075q {
    public final /* synthetic */ ImageView A00;
    public final /* synthetic */ C03095s A01;
    public final /* synthetic */ W7 A02;

    public C1067aE(C03095s c03095s, ImageView imageView, W7 w7) {
        this.A01 = c03095s;
        this.A00 = imageView;
        this.A02 = w7;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC03075q
    public final void AC9(Drawable drawable) {
        W7.A0e(drawable, this.A00);
        this.A02.A1J(drawable);
    }
}
