package com.mbridge.msdk.video.module.a.a;

import android.graphics.Bitmap;
import android.widget.ImageView;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.tools.ac;

/* loaded from: classes4.dex */
public final class j extends e {
    private int a;

    public j(ImageView imageView, int i10) {
        super(imageView);
        this.a = i10;
    }

    @Override // com.mbridge.msdk.video.module.a.a.e, com.mbridge.msdk.foundation.same.c.c
    public final void onSuccessLoad(Bitmap bitmap, String str) {
        Bitmap a;
        if (bitmap == null) {
            return;
        }
        try {
            if (this.f16030b != null && !bitmap.isRecycled() && (a = ac.a(bitmap, 1, this.a)) != null) {
                this.f16030b.setImageBitmap(a);
            }
        } catch (Throwable th2) {
            if (MBridgeConstans.DEBUG) {
                th2.printStackTrace();
            }
        }
    }
}
