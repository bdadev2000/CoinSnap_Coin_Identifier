package com.google.android.material.timepicker;

import android.view.ViewTreeObserver;

/* loaded from: classes3.dex */
public final class b implements ViewTreeObserver.OnPreDrawListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ClockFaceView f11873b;

    public b(ClockFaceView clockFaceView) {
        this.f11873b = clockFaceView;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        ClockFaceView clockFaceView = this.f11873b;
        if (!clockFaceView.isShown()) {
            return true;
        }
        clockFaceView.getViewTreeObserver().removeOnPreDrawListener(this);
        int height = ((clockFaceView.getHeight() / 2) - clockFaceView.f11851v.f11860f) - clockFaceView.D;
        if (height != clockFaceView.f11877t) {
            clockFaceView.f11877t = height;
            clockFaceView.m();
            int i10 = clockFaceView.f11877t;
            ClockHandView clockHandView = clockFaceView.f11851v;
            clockHandView.f11868n = i10;
            clockHandView.invalidate();
        }
        return true;
    }
}
