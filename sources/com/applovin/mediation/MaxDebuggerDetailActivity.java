package com.applovin.mediation;

import android.view.MotionEvent;
import com.applovin.impl.le;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.utils.g;

/* loaded from: classes3.dex */
public final class MaxDebuggerDetailActivity extends le {
    @Override // com.applovin.impl.le, com.applovin.impl.se, android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.activityOnTouch(g.f30048a, me);
        return super.dispatchTouchEvent(me);
    }
}
