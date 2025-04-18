package com.applovin.mediation;

import android.view.MotionEvent;
import com.applovin.impl.mediation.debugger.ui.testmode.a;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.utils.g;

/* loaded from: classes3.dex */
public final class MaxDebuggerMultiAdActivity extends a {
    @Override // com.applovin.impl.mediation.debugger.ui.testmode.a, com.applovin.impl.se, android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.activityOnTouch(g.f30048a, me);
        return super.dispatchTouchEvent(me);
    }
}
