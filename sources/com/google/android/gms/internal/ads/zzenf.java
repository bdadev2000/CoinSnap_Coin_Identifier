package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;

/* loaded from: classes3.dex */
public final class zzenf extends com.google.android.gms.ads.internal.client.zzbq {
    private final zzeom zza;

    public zzenf(Context context, zzcho zzchoVar, zzfha zzfhaVar, zzdla zzdlaVar, com.google.android.gms.ads.internal.client.zzbl zzblVar) {
        zzeoo zzeooVar = new zzeoo(zzdlaVar, zzchoVar.zzj());
        zzeooVar.zze(zzblVar);
        this.zza = new zzeom(new zzeoy(zzchoVar, context, zzeooVar, zzfhaVar), zzfhaVar.zzL());
    }

    @Override // com.google.android.gms.ads.internal.client.zzbr
    public final synchronized String zze() {
        return this.zza.zza();
    }

    @Override // com.google.android.gms.ads.internal.client.zzbr
    public final synchronized String zzf() {
        return this.zza.zzb();
    }

    @Override // com.google.android.gms.ads.internal.client.zzbr
    public final void zzg(com.google.android.gms.ads.internal.client.zzm zzmVar) throws RemoteException {
        this.zza.zzd(zzmVar, 1);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbr
    public final synchronized void zzh(com.google.android.gms.ads.internal.client.zzm zzmVar, int i2) throws RemoteException {
        this.zza.zzd(zzmVar, i2);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbr
    public final synchronized boolean zzi() throws RemoteException {
        return this.zza.zze();
    }
}
