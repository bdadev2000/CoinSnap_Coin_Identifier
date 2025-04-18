package com.instagram.common.viewpoint.core;

import android.view.View;
import com.facebook.ads.AdOptionsView;
import com.facebook.ads.MediaViewVideoRenderer;

/* loaded from: assets/audience_network.dex */
public class WA implements JT {
    @Override // com.instagram.common.viewpoint.core.JT
    public final boolean AGk(View view) {
        return (view instanceof MediaViewVideoRenderer) || (view instanceof AdOptionsView) || (view instanceof C3C) || (view instanceof QS);
    }
}
