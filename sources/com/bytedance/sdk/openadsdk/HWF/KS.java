package com.bytedance.sdk.openadsdk.HWF;

import android.graphics.Bitmap;
import android.widget.ImageView;
import androidx.annotation.Nullable;
import com.bytedance.sdk.component.COT.Bj;
import com.bytedance.sdk.component.COT.KVG;
import com.bytedance.sdk.openadsdk.core.model.woN;
import com.bytedance.sdk.openadsdk.core.tG;
import com.bytedance.sdk.openadsdk.utils.QUv;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public class KS implements KVG<Bitmap> {
    private final String lMd = "ImageLoaderToViewWrapper";
    private final WeakReference<ImageView> zp;

    private KS(ImageView imageView) {
        this.zp = new WeakReference<>(imageView);
    }

    @Override // com.bytedance.sdk.component.COT.KVG
    public void zp(int i9, String str, @Nullable Throwable th) {
    }

    public static KVG zp(woN won, String str, ImageView imageView) {
        return new lMd(won, str, new KS(imageView));
    }

    @Override // com.bytedance.sdk.component.COT.KVG
    public void zp(Bj<Bitmap> bj) {
        final ImageView imageView = this.zp.get();
        if (imageView == null || !(bj.lMd() instanceof Bitmap)) {
            return;
        }
        final Bitmap lMd = bj.lMd();
        if (QUv.COT()) {
            imageView.setImageBitmap(lMd);
        } else {
            tG.KS().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.HWF.KS.1
                @Override // java.lang.Runnable
                public void run() {
                    imageView.setImageBitmap(lMd);
                }
            });
        }
    }
}
