package com.mbridge.msdk.video.module.a.a;

import android.graphics.Bitmap;
import android.widget.ImageView;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.tools.ac;

/* loaded from: classes3.dex */
public final class j extends e {

    /* renamed from: a, reason: collision with root package name */
    private int f19018a;

    public j(ImageView imageView, int i9) {
        super(imageView);
        this.f19018a = i9;
    }

    @Override // com.mbridge.msdk.video.module.a.a.e, com.mbridge.msdk.foundation.same.c.c
    public final void onSuccessLoad(Bitmap bitmap, String str) {
        Bitmap a6;
        if (bitmap == null) {
            return;
        }
        try {
            if (this.b != null && !bitmap.isRecycled() && (a6 = ac.a(bitmap, 1, this.f19018a)) != null) {
                this.b.setImageBitmap(a6);
            }
        } catch (Throwable th) {
            if (MBridgeConstans.DEBUG) {
                th.printStackTrace();
            }
        }
    }
}
