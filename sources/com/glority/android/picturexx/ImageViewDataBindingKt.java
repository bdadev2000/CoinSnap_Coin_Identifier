package com.glority.android.picturexx;

import android.widget.ImageView;
import androidx.databinding.BindingAdapter;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ImageViewDataBinding.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u001a\u0016\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\b\b\u0001\u0010\u0003\u001a\u00020\u0004H\u0007¨\u0006\u0005"}, d2 = {"setImageTint", "", "Landroid/widget/ImageView;", "color", "", "businessMod_release"}, k = 2, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes2.dex */
public final class ImageViewDataBindingKt {
    @BindingAdapter({"app:tintColor"})
    public static final void setImageTint(ImageView imageView, int i) {
        Intrinsics.checkNotNullParameter(imageView, "<this>");
        imageView.setColorFilter(i);
    }
}
