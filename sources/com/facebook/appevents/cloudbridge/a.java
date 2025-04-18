package com.facebook.appevents.cloudbridge;

import com.facebook.GraphRequest;
import com.facebook.GraphResponse;
import com.facebook.appevents.codeless.ViewIndexer;

/* loaded from: classes3.dex */
public final /* synthetic */ class a implements GraphRequest.Callback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f28538a;

    public /* synthetic */ a(int i2) {
        this.f28538a = i2;
    }

    @Override // com.facebook.GraphRequest.Callback
    public final void onCompleted(GraphResponse graphResponse) {
        switch (this.f28538a) {
            case 0:
                AppEventsCAPIManager.m460enable$lambda0(graphResponse);
                return;
            default:
                ViewIndexer.Companion.m469buildAppIndexingRequest$lambda0(graphResponse);
                return;
        }
    }
}
