package com.bytedance.adsdk.ugeno.component.frame;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import com.bytedance.adsdk.ugeno.core.Bj;
import com.bytedance.adsdk.ugeno.lMd;
import java.util.Map;

/* loaded from: classes.dex */
public class UGFrameLayout extends FrameLayout {
    private Map<Integer, Bj> lMd;
    private lMd zp;

    public UGFrameLayout(Context context) {
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

    @Override // android.view.ViewGroup, android.view.View
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

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        Map<Integer, Bj> map = this.lMd;
        if (map != null && map.containsKey(4)) {
            return true;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z8, int i9, int i10, int i11, int i12) {
        lMd lmd = this.zp;
        if (lmd != null) {
            lmd.COT();
        }
        super.onLayout(z8, i9, i10, i11, i12);
        lMd lmd2 = this.zp;
        if (lmd2 != null) {
            lmd2.zp(i9, i10, i11, i12);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i9, int i10) {
        lMd lmd = this.zp;
        if (lmd != null) {
            int[] zp = lmd.zp(i9, i10);
            super.onMeasure(zp[0], zp[1]);
        } else {
            super.onMeasure(i9, i10);
        }
        lMd lmd2 = this.zp;
        if (lmd2 != null) {
            lmd2.jU();
        }
    }

    public void setEventMap(Map<Integer, Bj> map) {
        this.lMd = map;
    }

    public void zp(lMd lmd) {
        this.zp = lmd;
    }
}
