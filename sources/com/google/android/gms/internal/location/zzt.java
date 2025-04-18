package com.google.android.gms.internal.location;

import android.app.PendingIntent;
import android.os.RemoteException;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.Preconditions;

/* loaded from: classes3.dex */
final class zzt extends zzv {
    final /* synthetic */ long zza;
    final /* synthetic */ PendingIntent zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzt(zzw zzwVar, GoogleApiClient googleApiClient, long j3, PendingIntent pendingIntent) {
        super(googleApiClient);
        this.zza = j3;
        this.zzb = pendingIntent;
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    public final /* bridge */ /* synthetic */ void doExecute(Api.AnyClient anyClient) throws RemoteException {
        boolean z10;
        zzf zzfVar = (zzf) anyClient;
        long j3 = this.zza;
        PendingIntent pendingIntent = this.zzb;
        Preconditions.checkNotNull(pendingIntent);
        if (j3 >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        Preconditions.checkArgument(z10, "detectionIntervalMillis must be >= 0");
        ((zzo) zzfVar.getService()).zzr(j3, true, pendingIntent);
        setResult((zzt) Status.RESULT_SUCCESS);
    }
}
