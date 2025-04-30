package com.vungle.ads;

import android.graphics.Bitmap;
import android.widget.ImageView;

/* renamed from: com.vungle.ads.q0 */
/* loaded from: classes3.dex */
public final class C2135q0 extends G7.k implements F7.l {
    final /* synthetic */ ImageView $imageView;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2135q0(ImageView imageView) {
        super(1);
        this.$imageView = imageView;
    }

    /* renamed from: invoke$lambda-0 */
    public static final void m105invoke$lambda0(ImageView imageView, Bitmap bitmap) {
        G7.j.e(bitmap, "$it");
        imageView.setImageBitmap(bitmap);
    }

    @Override // F7.l
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Bitmap) obj);
        return t7.y.f23029a;
    }

    public final void invoke(Bitmap bitmap) {
        G7.j.e(bitmap, "it");
        ImageView imageView = this.$imageView;
        if (imageView != null) {
            com.vungle.ads.internal.util.C.INSTANCE.runOnUiThread(new com.applovin.impl.sdk.utils.c(imageView, bitmap, 1));
        }
    }
}
