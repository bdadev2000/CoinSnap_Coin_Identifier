package com.applovin.mediation;

import android.view.MotionEvent;
import com.applovin.impl.sn;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.utils.g;

/* loaded from: classes3.dex */
public class MaxDebuggerTcfStringActivity extends sn {
    @Override // com.applovin.impl.sn, com.applovin.impl.se, android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.activityOnTouch(g.f30048a, me);
        return super.dispatchTouchEvent(me);
    }
}
