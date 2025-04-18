package com.google.android.material.timepicker;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Checkable;

/* loaded from: classes3.dex */
public final class m implements View.OnTouchListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ GestureDetector f11884b;

    public m(GestureDetector gestureDetector) {
        this.f11884b = gestureDetector;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        if (((Checkable) view).isChecked()) {
            return this.f11884b.onTouchEvent(motionEvent);
        }
        return false;
    }
}
