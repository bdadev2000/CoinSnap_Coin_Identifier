package com.bytedance.adsdk.ugeno.vc;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;

/* loaded from: classes.dex */
public class Sg extends YFl<com.bytedance.adsdk.ugeno.Sg.Sg> {
    private com.bytedance.adsdk.ugeno.tN tN;

    public Sg(Context context) {
        super(context);
    }

    @Override // com.bytedance.adsdk.ugeno.vc.YFl
    public View DSW(int i10) {
        return ((com.bytedance.adsdk.ugeno.Sg.Sg) this.YFl.get(i10)).NjR();
    }

    public void YFl(com.bytedance.adsdk.ugeno.tN tNVar) {
        this.tN = tNVar;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        com.bytedance.adsdk.ugeno.tN tNVar = this.tN;
        if (tNVar != null) {
            tNVar.DSW();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        com.bytedance.adsdk.ugeno.tN tNVar = this.tN;
        if (tNVar != null) {
            tNVar.qsH();
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        com.bytedance.adsdk.ugeno.tN tNVar = this.tN;
        if (tNVar != null) {
            tNVar.vc();
        }
        super.onLayout(z10, i10, i11, i12, i13);
        com.bytedance.adsdk.ugeno.tN tNVar2 = this.tN;
        if (tNVar2 != null) {
            tNVar2.YFl(i10, i11, i12, i13);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        com.bytedance.adsdk.ugeno.tN tNVar = this.tN;
        if (tNVar != null) {
            int[] YFl = tNVar.YFl(i10, i11);
            super.onMeasure(YFl[0], YFl[1]);
        } else {
            super.onMeasure(i10, i11);
        }
        com.bytedance.adsdk.ugeno.tN tNVar2 = this.tN;
        if (tNVar2 != null) {
            tNVar2.wN();
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        com.bytedance.adsdk.ugeno.tN tNVar = this.tN;
        if (tNVar != null) {
            tNVar.Sg(i10, i11, i12, i13);
        }
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z10) {
        super.onWindowFocusChanged(z10);
    }
}
