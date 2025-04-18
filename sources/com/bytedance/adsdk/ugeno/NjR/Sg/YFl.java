package com.bytedance.adsdk.ugeno.NjR.Sg;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import com.bytedance.adsdk.ugeno.core.nc;
import com.bytedance.adsdk.ugeno.tN;
import java.util.Map;

/* loaded from: classes.dex */
public class YFl extends FrameLayout {
    private Map<Integer, nc> Sg;
    private tN YFl;

    public YFl(Context context) {
        super(context);
    }

    public void YFl(tN tNVar) {
        this.YFl = tNVar;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        tN tNVar = this.YFl;
        if (tNVar != null) {
            tNVar.DSW();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        tN tNVar = this.YFl;
        if (tNVar != null) {
            tNVar.qsH();
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        Map<Integer, nc> map = this.Sg;
        if (map != null && map.containsKey(4)) {
            return true;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        tN tNVar = this.YFl;
        if (tNVar != null) {
            tNVar.vc();
        }
        super.onLayout(z10, i10, i11, i12, i13);
        tN tNVar2 = this.YFl;
        if (tNVar2 != null) {
            tNVar2.YFl(i10, i11, i12, i13);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        tN tNVar = this.YFl;
        if (tNVar != null) {
            int[] YFl = tNVar.YFl(i10, i11);
            super.onMeasure(YFl[0], YFl[1]);
        } else {
            super.onMeasure(i10, i11);
        }
        tN tNVar2 = this.YFl;
        if (tNVar2 != null) {
            tNVar2.wN();
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        tN tNVar = this.YFl;
        if (tNVar != null) {
            tNVar.Sg(i10, i11, i12, i13);
        }
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z10) {
        super.onWindowFocusChanged(z10);
    }

    public void setEventMap(Map<Integer, nc> map) {
        this.Sg = map;
    }
}
