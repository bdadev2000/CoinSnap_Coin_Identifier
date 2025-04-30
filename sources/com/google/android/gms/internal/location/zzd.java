package com.google.android.gms.internal.location;

import android.app.PendingIntent;
import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;

/* loaded from: classes2.dex */
final class zzd extends zzf {
    final /* synthetic */ long zza;
    final /* synthetic */ PendingIntent zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzd(zzg zzgVar, GoogleApiClient googleApiClient, long j7, PendingIntent pendingIntent) {
        super(googleApiClient);
        this.zza = j7;
        this.zzb = pendingIntent;
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    public final /* bridge */ /* synthetic */ void doExecute(zzaz zzazVar) throws RemoteException {
        zzazVar.zzq(this.zza, this.zzb);
        setResult((zzd) Status.RESULT_SUCCESS);
    }
}
