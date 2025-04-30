package com.mbridge.msdk.splash.view;

import android.content.Context;
import android.util.AttributeSet;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.splash.d.d;
import com.mbridge.msdk.splash.view.BaseSplashPopView;

/* loaded from: classes3.dex */
public class MBSplashPopView extends BaseSplashPopView {
    public MBSplashPopView(Context context, BaseSplashPopView.a aVar, d dVar) {
        super(context, aVar, dVar);
    }

    @Override // com.mbridge.msdk.splash.view.BaseSplashPopView
    public final void a(CampaignEx campaignEx) {
        super.a(campaignEx);
        b(campaignEx);
    }

    public MBSplashPopView(Context context) {
        super(context);
    }

    public MBSplashPopView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public MBSplashPopView(Context context, AttributeSet attributeSet, int i9) {
        super(context, attributeSet, i9);
    }

    public MBSplashPopView(Context context, AttributeSet attributeSet, int i9, int i10) {
        super(context, attributeSet, i9, i10);
    }
}
