package com.vungle.ads;

import android.graphics.Bitmap;
import android.widget.ImageView;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes4.dex */
public final class o1 extends Lambda implements Function1 {
    final /* synthetic */ ImageView $imageView;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o1(ImageView imageView) {
        super(1);
        this.$imageView = imageView;
    }

    /* renamed from: invoke$lambda-0 */
    public static final void m106invoke$lambda0(ImageView imageView, Bitmap it) {
        Intrinsics.checkNotNullParameter(it, "$it");
        imageView.setImageBitmap(it);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Bitmap) obj);
        return Unit.INSTANCE;
    }

    public final void invoke(Bitmap it) {
        Intrinsics.checkNotNullParameter(it, "it");
        ImageView imageView = this.$imageView;
        if (imageView != null) {
            com.vungle.ads.internal.util.c0.INSTANCE.runOnUiThread(new com.applovin.impl.sdk.utils.b(imageView, it, 1));
        }
    }
}
