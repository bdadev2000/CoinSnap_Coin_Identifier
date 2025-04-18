package com.applovin.mediation.hybridAds;

import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import com.applovin.impl.bd;
import com.applovin.impl.cd;
import com.applovin.impl.sdk.j;
import com.applovin.mediation.adapter.listeners.MaxAdapterListener;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.utils.g;

/* loaded from: classes3.dex */
public class MaxHybridMRecAdActivity extends bd {

    /* renamed from: f, reason: collision with root package name */
    private View f28415f;

    public void a(cd cdVar, View view, j jVar, MaxAdapterListener maxAdapterListener) {
        super.a(cdVar, jVar, maxAdapterListener);
        this.f28415f = view;
    }

    @Override // com.applovin.impl.bd, android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.activityOnTouch(g.f30048a, me);
        return super.dispatchTouchEvent(me);
    }

    @Override // com.applovin.impl.bd, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        a(this.f28415f, "MaxHybridMRecAdActivity");
    }
}
