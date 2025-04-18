package com.applovin.mediation;

import android.view.MotionEvent;
import com.applovin.impl.b0;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.utils.g;

/* loaded from: classes3.dex */
public final class MaxDebuggerAdUnitWaterfallsListActivity extends b0 {
    @Override // com.applovin.impl.b0, com.applovin.impl.se, android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.activityOnTouch(g.f30048a, me);
        return super.dispatchTouchEvent(me);
    }
}
