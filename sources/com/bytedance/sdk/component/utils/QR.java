package com.bytedance.sdk.component.utils;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewConfiguration;

/* loaded from: classes.dex */
public class QR extends TouchDelegate {
    private int COT;
    private Rect KS;
    private boolean jU;
    private Rect lMd;
    private View zp;

    public QR(Rect rect, View view) {
        super(rect, view);
        this.lMd = rect;
        this.COT = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        Rect rect2 = new Rect(rect);
        this.KS = rect2;
        int i9 = this.COT;
        rect2.inset(-i9, -i9);
        this.zp = view;
    }

    @Override // android.view.TouchDelegate
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z8;
        int x9 = (int) motionEvent.getX();
        int y4 = (int) motionEvent.getY();
        int action = motionEvent.getAction();
        boolean z9 = true;
        if (action != 0) {
            if (action != 1 && action != 2) {
                if (action == 3) {
                    boolean z10 = this.jU;
                    this.jU = false;
                    z9 = z10;
                    z8 = true;
                }
                z8 = true;
                z9 = false;
            } else {
                boolean z11 = this.jU;
                if (z11) {
                    z9 = this.KS.contains(x9, y4);
                }
                z8 = z9;
                z9 = z11;
            }
        } else if (this.lMd.contains(x9, y4)) {
            this.jU = true;
            z8 = true;
        } else {
            this.jU = false;
            z8 = true;
            z9 = false;
        }
        if (!z9) {
            return false;
        }
        View view = this.zp;
        if (z8) {
            motionEvent.setLocation(view.getWidth() / 2, view.getHeight() / 2);
        } else {
            float f9 = -(this.COT * 2);
            motionEvent.setLocation(f9, f9);
        }
        if (view.getVisibility() != 0) {
            return false;
        }
        return view.dispatchTouchEvent(motionEvent);
    }
}
