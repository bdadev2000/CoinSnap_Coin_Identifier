package com.google.android.material.timepicker;

import android.os.Bundle;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import com.plantcare.ai.identifier.plantid.R;

/* loaded from: classes3.dex */
public final class c extends n0.b {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ClockFaceView f11874d;

    public c(ClockFaceView clockFaceView) {
        this.f11874d = clockFaceView;
    }

    @Override // n0.b
    public final void d(View view, o0.j jVar) {
        View.AccessibilityDelegate accessibilityDelegate = this.a;
        AccessibilityNodeInfo accessibilityNodeInfo = jVar.a;
        accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        int intValue = ((Integer) view.getTag(R.id.material_value_index)).intValue();
        if (intValue > 0) {
            accessibilityNodeInfo.setTraversalAfter((View) this.f11874d.f11855z.get(intValue - 1));
        }
        jVar.k(new o0.i(AccessibilityNodeInfo.CollectionItemInfo.obtain(0, 1, intValue, 1, false, view.isSelected())));
        accessibilityNodeInfo.setClickable(true);
        jVar.b(o0.c.f22956e);
    }

    @Override // n0.b
    public final boolean g(View view, int i10, Bundle bundle) {
        if (i10 == 16) {
            long uptimeMillis = SystemClock.uptimeMillis();
            ClockFaceView clockFaceView = this.f11874d;
            view.getHitRect(clockFaceView.f11852w);
            float centerX = clockFaceView.f11852w.centerX();
            float centerY = clockFaceView.f11852w.centerY();
            clockFaceView.f11851v.onTouchEvent(MotionEvent.obtain(uptimeMillis, uptimeMillis, 0, centerX, centerY, 0));
            clockFaceView.f11851v.onTouchEvent(MotionEvent.obtain(uptimeMillis, uptimeMillis, 1, centerX, centerY, 0));
            return true;
        }
        return super.g(view, i10, bundle);
    }
}
