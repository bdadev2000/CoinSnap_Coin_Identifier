package com.applovin.mediation;

import android.view.MotionEvent;
import com.applovin.impl.n3;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.utils.g;

/* loaded from: classes4.dex */
public class MaxDebuggerCmpNetworksListActivity extends n3 {
    @Override // com.applovin.impl.n3, com.applovin.impl.se, android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.activityOnTouch(g.f30048a, me);
        return super.dispatchTouchEvent(me);
    }
}
