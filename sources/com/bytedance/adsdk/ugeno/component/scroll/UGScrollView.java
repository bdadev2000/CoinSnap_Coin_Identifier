package com.bytedance.adsdk.ugeno.component.scroll;

import android.content.Context;
import android.graphics.Canvas;
import android.widget.ScrollView;
import com.bytedance.adsdk.ugeno.lMd;

/* loaded from: classes.dex */
public class UGScrollView extends ScrollView {
    private lMd zp;

    public UGScrollView(Context context) {
        super(context);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        lMd lmd = this.zp;
        if (lmd != null) {
            lmd.HWF();
        }
    }

    @Override // android.widget.ScrollView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        lMd lmd = this.zp;
        if (lmd != null) {
            lmd.QR();
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
    }

    @Override // android.widget.ScrollView, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z8, int i9, int i10, int i11, int i12) {
        lMd lmd = this.zp;
        if (lmd != null) {
            lmd.zp(i9, i10, i11, i12);
        }
        super.onLayout(z8, i9, i10, i11, i12);
    }

    @Override // android.widget.ScrollView, android.widget.FrameLayout, android.view.View
    public void onMeasure(int i9, int i10) {
        lMd lmd = this.zp;
        if (lmd != null) {
            int[] zp = lmd.zp(i9, i10);
            super.onMeasure(zp[0], zp[1]);
        } else {
            super.onMeasure(i9, i10);
        }
        super.onMeasure(i9, i10);
    }

    public void zp(lMd lmd) {
        this.zp = lmd;
    }
}
