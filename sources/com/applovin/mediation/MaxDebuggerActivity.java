package com.applovin.mediation;

import android.view.MotionEvent;
import com.applovin.impl.re;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.utils.g;

/* loaded from: classes2.dex */
public final class MaxDebuggerActivity extends re {
    @Override // com.applovin.impl.re, com.applovin.impl.se, android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.activityOnTouch(g.f30048a, me);
        return super.dispatchTouchEvent(me);
    }
}
