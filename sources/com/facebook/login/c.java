package com.facebook.login;

import com.facebook.GraphRequest;
import com.facebook.GraphResponse;

/* loaded from: classes2.dex */
public final /* synthetic */ class c implements GraphRequest.Callback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f28610a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ DeviceAuthDialog f28611b;

    public /* synthetic */ c(DeviceAuthDialog deviceAuthDialog, int i2) {
        this.f28610a = i2;
        this.f28611b = deviceAuthDialog;
    }

    @Override // com.facebook.GraphRequest.Callback
    public final void onCompleted(GraphResponse graphResponse) {
        int i2 = this.f28610a;
        DeviceAuthDialog deviceAuthDialog = this.f28611b;
        switch (i2) {
            case 0:
                DeviceAuthDialog.m558_get_pollRequest_$lambda5(deviceAuthDialog, graphResponse);
                return;
            default:
                DeviceAuthDialog.m564startLogin$lambda1(deviceAuthDialog, graphResponse);
                return;
        }
    }
}
