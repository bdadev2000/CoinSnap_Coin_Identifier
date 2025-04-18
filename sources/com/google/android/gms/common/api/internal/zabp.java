package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.internal.BaseGmsClient;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zabp implements BaseGmsClient.SignOutCallbacks {
    final /* synthetic */ zabq zaa;

    public zabp(zabq zabqVar) {
        this.zaa = zabqVar;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.SignOutCallbacks
    public final void onSignOutComplete() {
        GoogleApiManager.zad(this.zaa.zaa).post(new zabo(this));
    }
}
