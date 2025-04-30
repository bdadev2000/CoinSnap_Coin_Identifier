package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* loaded from: classes2.dex */
public final class zzepp {
    private final zzdme zza;
    private final zzepc zzb;
    private final zzczo zzc;

    public zzepp(zzdme zzdmeVar, zzdvc zzdvcVar) {
        this.zza = zzdmeVar;
        final zzepc zzepcVar = new zzepc(zzdvcVar);
        this.zzb = zzepcVar;
        final zzboi zzg = zzdmeVar.zzg();
        this.zzc = new zzczo() { // from class: com.google.android.gms.internal.ads.zzepo
            @Override // com.google.android.gms.internal.ads.zzczo
            public final void zzdB(com.google.android.gms.ads.internal.client.zze zzeVar) {
                zzepc.this.zzdB(zzeVar);
                zzboi zzboiVar = zzg;
                if (zzboiVar != null) {
                    try {
                        zzboiVar.zzf(zzeVar);
                    } catch (RemoteException e4) {
                        com.google.android.gms.ads.internal.util.client.zzm.zzl("#007 Could not call remote method.", e4);
                    }
                }
                if (zzboiVar != null) {
                    try {
                        zzboiVar.zze(zzeVar.zza);
                    } catch (RemoteException e9) {
                        com.google.android.gms.ads.internal.util.client.zzm.zzl("#007 Could not call remote method.", e9);
                    }
                }
            }
        };
    }

    public final zzczo zza() {
        return this.zzc;
    }

    public final zzdaz zzb() {
        return this.zzb;
    }

    public final zzdjy zzc() {
        return new zzdjy(this.zza, this.zzb.zzg());
    }

    public final zzepc zzd() {
        return this.zzb;
    }

    public final void zze(com.google.android.gms.ads.internal.client.zzbh zzbhVar) {
        this.zzb.zzj(zzbhVar);
    }
}
