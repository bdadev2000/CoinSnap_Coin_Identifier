package com.google.android.gms.internal.location;

import android.app.PendingIntent;
import android.os.RemoteException;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;

/* loaded from: classes3.dex */
final class zzao extends zzat {
    final /* synthetic */ PendingIntent zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzao(zzau zzauVar, GoogleApiClient googleApiClient, PendingIntent pendingIntent) {
        super(googleApiClient);
        this.zza = pendingIntent;
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    public final /* bridge */ /* synthetic */ void doExecute(Api.AnyClient anyClient) throws RemoteException {
        ((zzda) anyClient).zzD(this.zza, zzau.zza(this), null);
    }
}
