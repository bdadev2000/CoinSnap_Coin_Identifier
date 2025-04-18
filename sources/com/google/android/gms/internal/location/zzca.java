package com.google.android.gms.internal.location;

import android.os.RemoteException;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.location.LocationSettingsRequest;

/* loaded from: classes3.dex */
final class zzca extends zzcb {
    final /* synthetic */ LocationSettingsRequest zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzca(zzcc zzccVar, GoogleApiClient googleApiClient, LocationSettingsRequest locationSettingsRequest, String str) {
        super(googleApiClient);
        this.zza = locationSettingsRequest;
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    public final /* synthetic */ void doExecute(Api.AnyClient anyClient) throws RemoteException {
        boolean z10;
        zzda zzdaVar = (zzda) anyClient;
        LocationSettingsRequest locationSettingsRequest = this.zza;
        if (locationSettingsRequest != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        Preconditions.checkArgument(z10, "locationSettingsRequest can't be null");
        ((zzo) zzdaVar.getService()).zzh(locationSettingsRequest, new zzcr(this), null);
    }
}
