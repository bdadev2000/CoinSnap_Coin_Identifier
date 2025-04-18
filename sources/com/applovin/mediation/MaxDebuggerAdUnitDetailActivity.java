package com.applovin.mediation;

import android.view.MotionEvent;
import com.applovin.impl.x;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.utils.g;

/* loaded from: classes3.dex */
public final class MaxDebuggerAdUnitDetailActivity extends x {
    @Override // com.applovin.impl.x, com.applovin.impl.se, android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.activityOnTouch(g.f30048a, me);
        return super.dispatchTouchEvent(me);
    }
}
