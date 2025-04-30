package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;

/* loaded from: classes2.dex */
public final class zzeog extends com.google.android.gms.ads.internal.client.zzbm {
    private final zzepn zza;

    public zzeog(Context context, zzcjd zzcjdVar, zzfhm zzfhmVar, zzdme zzdmeVar, com.google.android.gms.ads.internal.client.zzbh zzbhVar) {
        zzepp zzeppVar = new zzepp(zzdmeVar, zzcjdVar.zzj());
        zzeppVar.zze(zzbhVar);
        this.zza = new zzepn(new zzepz(zzcjdVar, context, zzeppVar, zzfhmVar), zzfhmVar.zzL());
    }

    @Override // com.google.android.gms.ads.internal.client.zzbn
    public final synchronized String zze() {
        return this.zza.zza();
    }

    @Override // com.google.android.gms.ads.internal.client.zzbn
    public final synchronized String zzf() {
        return this.zza.zzb();
    }

    @Override // com.google.android.gms.ads.internal.client.zzbn
    public final void zzg(com.google.android.gms.ads.internal.client.zzl zzlVar) throws RemoteException {
        this.zza.zzd(zzlVar, 1);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbn
    public final synchronized void zzh(com.google.android.gms.ads.internal.client.zzl zzlVar, int i9) throws RemoteException {
        this.zza.zzd(zzlVar, i9);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbn
    public final synchronized boolean zzi() throws RemoteException {
        return this.zza.zze();
    }
}
