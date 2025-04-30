package com.google.android.material.timepicker;

import android.view.GestureDetector;
import android.view.MotionEvent;

/* loaded from: classes2.dex */
public final class h extends GestureDetector.SimpleOnGestureListener {
    public final /* synthetic */ TimePickerView b;

    public h(TimePickerView timePickerView) {
        this.b = timePickerView;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTap(MotionEvent motionEvent) {
        int i9 = TimePickerView.f14230v;
        this.b.getClass();
        return false;
    }
}
