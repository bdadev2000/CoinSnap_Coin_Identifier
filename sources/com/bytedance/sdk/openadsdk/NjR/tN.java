package com.bytedance.sdk.openadsdk.NjR;

import android.graphics.Bitmap;
import android.widget.ImageView;
import androidx.annotation.Nullable;
import com.bytedance.sdk.component.wN.eT;
import com.bytedance.sdk.component.wN.rkt;
import com.bytedance.sdk.openadsdk.core.model.Wwa;
import com.bytedance.sdk.openadsdk.core.pDU;
import com.bytedance.sdk.openadsdk.utils.mn;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public class tN implements rkt<Bitmap> {
    private final String Sg = "ImageLoaderToViewWrapper";
    private final WeakReference<ImageView> YFl;

    private tN(ImageView imageView) {
        this.YFl = new WeakReference<>(imageView);
    }

    @Override // com.bytedance.sdk.component.wN.rkt
    public void YFl(int i10, String str, @Nullable Throwable th2) {
    }

    public static rkt YFl(Wwa wwa, String str, ImageView imageView) {
        return new Sg(wwa, str, new tN(imageView));
    }

    @Override // com.bytedance.sdk.component.wN.rkt
    public void YFl(eT<Bitmap> eTVar) {
        final ImageView imageView = this.YFl.get();
        if (imageView == null || !(eTVar.Sg() instanceof Bitmap)) {
            return;
        }
        final Bitmap Sg = eTVar.Sg();
        if (mn.wN()) {
            imageView.setImageBitmap(Sg);
        } else {
            pDU.tN().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.NjR.tN.1
                @Override // java.lang.Runnable
                public void run() {
                    imageView.setImageBitmap(Sg);
                }
            });
        }
    }
}
