package com.google.android.material.timepicker;

import android.view.ViewTreeObserver;

/* loaded from: classes2.dex */
public final class b implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ ClockFaceView b;

    public b(ClockFaceView clockFaceView) {
        this.b = clockFaceView;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        ClockFaceView clockFaceView = this.b;
        if (!clockFaceView.isShown()) {
            return true;
        }
        clockFaceView.getViewTreeObserver().removeOnPreDrawListener(this);
        int height = ((clockFaceView.getHeight() / 2) - clockFaceView.f14217x.f14222f) - clockFaceView.f14210F;
        if (height != clockFaceView.f14234v) {
            clockFaceView.f14234v = height;
            clockFaceView.m();
            int i9 = clockFaceView.f14234v;
            ClockHandView clockHandView = clockFaceView.f14217x;
            clockHandView.f14228n = i9;
            clockHandView.invalidate();
        }
        return true;
    }
}
