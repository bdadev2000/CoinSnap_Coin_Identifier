package com.facebook;

import com.facebook.AccessTokenManager;
import com.facebook.GraphRequest;

/* loaded from: classes4.dex */
public final /* synthetic */ class b implements GraphRequest.Callback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f28550a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f28551b;

    public /* synthetic */ b(Object obj, int i2) {
        this.f28550a = i2;
        this.f28551b = obj;
    }

    @Override // com.facebook.GraphRequest.Callback
    public final void onCompleted(GraphResponse graphResponse) {
        int i2 = this.f28550a;
        Object obj = this.f28551b;
        switch (i2) {
            case 0:
                AccessTokenManager.b((AccessTokenManager.RefreshResult) obj, graphResponse);
                return;
            case 1:
                GraphRequest.m426_set_callback_$lambda0((GraphRequest.Callback) obj, graphResponse);
                return;
            case 2:
                GraphRequest.Companion.m427newMeRequest$lambda0((GraphRequest.GraphJSONObjectCallback) obj, graphResponse);
                return;
            default:
                GraphRequest.Companion.m428newPlacesSearchRequest$lambda1((GraphRequest.GraphJSONArrayCallback) obj, graphResponse);
                return;
        }
    }
}
