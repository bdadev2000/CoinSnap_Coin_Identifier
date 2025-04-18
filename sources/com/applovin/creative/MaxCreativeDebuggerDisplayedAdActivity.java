package com.applovin.creative;

import android.view.MotionEvent;
import com.applovin.impl.u6;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.utils.g;

/* loaded from: classes3.dex */
public final class MaxCreativeDebuggerDisplayedAdActivity extends u6 {
    @Override // com.applovin.impl.u6, android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.activityOnTouch(g.f30048a, me);
        return super.dispatchTouchEvent(me);
    }
}
