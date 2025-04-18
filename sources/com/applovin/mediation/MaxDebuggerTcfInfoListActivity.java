package com.applovin.mediation;

import android.view.MotionEvent;
import com.applovin.impl.pn;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.utils.g;

/* loaded from: classes.dex */
public class MaxDebuggerTcfInfoListActivity extends pn {
    @Override // com.applovin.impl.pn, com.applovin.impl.se, android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.activityOnTouch(g.f30048a, me);
        return super.dispatchTouchEvent(me);
    }
}
