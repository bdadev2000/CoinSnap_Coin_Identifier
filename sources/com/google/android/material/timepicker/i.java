package com.google.android.material.timepicker;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Checkable;

/* loaded from: classes2.dex */
public final class i implements View.OnTouchListener {
    public final /* synthetic */ GestureDetector b;

    public i(GestureDetector gestureDetector) {
        this.b = gestureDetector;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        if (((Checkable) view).isChecked()) {
            return this.b.onTouchEvent(motionEvent);
        }
        return false;
    }
}
