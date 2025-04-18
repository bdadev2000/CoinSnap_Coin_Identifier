package com.google.android.gms.internal.location;

import android.os.RemoteException;
import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationResult;

/* loaded from: classes3.dex */
final class zzcw extends com.google.android.gms.location.zzq {
    private final zzcs zza;

    public zzcw(zzcs zzcsVar) {
        this.zza = zzcsVar;
    }

    @Override // com.google.android.gms.location.zzr
    public final void zzd(LocationAvailability locationAvailability) throws RemoteException {
        this.zza.zza().notifyListener(new zzcu(this, locationAvailability));
    }

    @Override // com.google.android.gms.location.zzr
    public final void zze(LocationResult locationResult) throws RemoteException {
        this.zza.zza().notifyListener(new zzct(this, locationResult));
    }

    @Override // com.google.android.gms.location.zzr
    public final void zzf() {
        this.zza.zza().notifyListener(new zzcv(this));
    }

    public final zzcw zzg(ListenerHolder listenerHolder) {
        this.zza.zzc(listenerHolder);
        return this;
    }

    public final void zzh() {
        this.zza.zza().clear();
    }
}
