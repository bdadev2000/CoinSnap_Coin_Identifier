package com.mbridge.msdk.widget;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.widget.ImageView;
import com.mbridge.msdk.foundation.same.c.b;
import com.mbridge.msdk.foundation.same.c.c;
import com.mbridge.msdk.foundation.tools.ad;

/* loaded from: classes3.dex */
public class MBImageView extends ImageView {

    /* renamed from: a, reason: collision with root package name */
    private Bitmap f19497a;
    private String b;

    public MBImageView(Context context) {
        super(context);
        this.f19497a = null;
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
        Bitmap bitmap = this.f19497a;
        if (bitmap != null && bitmap.isRecycled()) {
            ad.b("mb-widget-imageview", "onDraw bitmap recycled");
            if (getContext() != null) {
                b.a(getContext()).a(this.b, new c() { // from class: com.mbridge.msdk.widget.MBImageView.1
                    @Override // com.mbridge.msdk.foundation.same.c.c
                    public final void onFailedLoad(String str, String str2) {
                        ad.b("mb-widget-imageview", str2 + " load failed:" + str);
                    }

                    @Override // com.mbridge.msdk.foundation.same.c.c
                    public final void onSuccessLoad(Bitmap bitmap2, String str) {
                        MBImageView.this.setImageBitmap(bitmap2);
                    }
                });
                return;
            }
            return;
        }
        super.onDraw(canvas);
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        this.f19497a = bitmap;
        if (bitmap != null && bitmap.isRecycled()) {
            this.f19497a = null;
            super.setImageBitmap(null);
            ad.b("mb-widget-imageview", "setImageBitmap recycled");
            return;
        }
        super.setImageBitmap(bitmap);
    }

    public void setImageUrl(String str) {
        this.b = str;
    }

    public MBImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f19497a = null;
    }

    public MBImageView(Context context, AttributeSet attributeSet, int i9) {
        super(context, attributeSet, i9);
        this.f19497a = null;
    }
}
