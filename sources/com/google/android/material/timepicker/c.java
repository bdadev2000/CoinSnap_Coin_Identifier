package com.google.android.material.timepicker;

import T.C0260b;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import com.tools.arruler.photomeasure.camera.ruler.R;

/* loaded from: classes2.dex */
public final class c extends C0260b {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ClockFaceView f14232d;

    public c(ClockFaceView clockFaceView) {
        this.f14232d = clockFaceView;
    }

    @Override // T.C0260b
    public final void d(View view, U.i iVar) {
        View.AccessibilityDelegate accessibilityDelegate = this.f2879a;
        AccessibilityNodeInfo accessibilityNodeInfo = iVar.f3098a;
        accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        int intValue = ((Integer) view.getTag(R.id.material_value_index)).intValue();
        if (intValue > 0) {
            accessibilityNodeInfo.setTraversalAfter((View) this.f14232d.f14206B.get(intValue - 1));
        }
        accessibilityNodeInfo.setCollectionItemInfo(AccessibilityNodeInfo.CollectionItemInfo.obtain(0, 1, intValue, 1, false, view.isSelected()));
        accessibilityNodeInfo.setClickable(true);
        iVar.b(U.d.f3086e);
    }

    @Override // T.C0260b
    public final boolean g(View view, int i9, Bundle bundle) {
        if (i9 == 16) {
            long uptimeMillis = SystemClock.uptimeMillis();
            ClockFaceView clockFaceView = this.f14232d;
            view.getHitRect(clockFaceView.f14218y);
            float centerX = clockFaceView.f14218y.centerX();
            float centerY = clockFaceView.f14218y.centerY();
            clockFaceView.f14217x.onTouchEvent(MotionEvent.obtain(uptimeMillis, uptimeMillis, 0, centerX, centerY, 0));
            clockFaceView.f14217x.onTouchEvent(MotionEvent.obtain(uptimeMillis, uptimeMillis, 1, centerX, centerY, 0));
            return true;
        }
        return super.g(view, i9, bundle);
    }
}
