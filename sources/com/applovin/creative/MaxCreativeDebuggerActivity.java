package com.applovin.creative;

import android.view.MotionEvent;
import com.applovin.impl.w4;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.utils.g;

/* loaded from: classes2.dex */
public final class MaxCreativeDebuggerActivity extends w4 {
    @Override // com.applovin.impl.w4, android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.activityOnTouch(g.f30048a, me);
        return super.dispatchTouchEvent(me);
    }
}
