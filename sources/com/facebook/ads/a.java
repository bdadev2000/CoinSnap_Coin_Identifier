package com.facebook.ads;

import android.content.res.Configuration;
import com.facebook.ads.internal.api.AdViewParentApi;

/* loaded from: classes.dex */
public final class a implements AdViewParentApi {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AdView f10897b;

    public a(AdView adView) {
        this.f10897b = adView;
    }

    @Override // com.facebook.ads.internal.api.AdViewParentApi
    public final void onConfigurationChanged(Configuration configuration) {
        super/*android.view.View*/.onConfigurationChanged(configuration);
    }
}
