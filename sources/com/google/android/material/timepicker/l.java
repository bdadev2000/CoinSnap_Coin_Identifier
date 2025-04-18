package com.google.android.material.timepicker;

import android.view.GestureDetector;
import android.view.MotionEvent;

/* loaded from: classes3.dex */
public final class l extends GestureDetector.SimpleOnGestureListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TimePickerView f11883b;

    public l(TimePickerView timePickerView) {
        this.f11883b = timePickerView;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTap(MotionEvent motionEvent) {
        int i10 = TimePickerView.f11870t;
        this.f11883b.getClass();
        return false;
    }
}
