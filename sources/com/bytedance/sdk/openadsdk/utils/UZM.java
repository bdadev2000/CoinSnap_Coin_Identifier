package com.bytedance.sdk.openadsdk.utils;

import android.graphics.Bitmap;
import android.widget.ImageView;
import androidx.annotation.Nullable;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public class UZM implements com.bytedance.sdk.component.wN.rkt<Bitmap> {
    private final WeakReference<ImageView> YFl;

    public UZM(ImageView imageView) {
        this.YFl = new WeakReference<>(imageView);
    }

    @Override // com.bytedance.sdk.component.wN.rkt
    public void YFl(com.bytedance.sdk.component.wN.eT<Bitmap> eTVar) {
        ImageView imageView = this.YFl.get();
        if (imageView == null) {
            return;
        }
        if (eTVar != null) {
            try {
                if (eTVar.Sg() != null) {
                    imageView.setImageBitmap(eTVar.Sg());
                    return;
                }
            } catch (Throwable unused) {
                imageView.setVisibility(8);
                return;
            }
        }
        imageView.setVisibility(8);
    }

    @Override // com.bytedance.sdk.component.wN.rkt
    public void YFl(int i10, String str, @Nullable Throwable th2) {
        ImageView imageView = this.YFl.get();
        if (imageView == null) {
            return;
        }
        imageView.setVisibility(8);
    }
}
