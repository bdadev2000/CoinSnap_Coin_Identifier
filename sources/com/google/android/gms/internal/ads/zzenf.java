package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* loaded from: classes3.dex */
public final class zzenf {
    private final zzdjj zza;
    private final zzems zzb;
    private final zzcwp zzc;

    public zzenf(zzdjj zzdjjVar, zzdsm zzdsmVar) {
        this.zza = zzdjjVar;
        final zzems zzemsVar = new zzems(zzdsmVar);
        this.zzb = zzemsVar;
        final zzbmk zzg = zzdjjVar.zzg();
        this.zzc = new zzcwp() { // from class: com.google.android.gms.internal.ads.zzene
            @Override // com.google.android.gms.internal.ads.zzcwp
            public final void zzdB(com.google.android.gms.ads.internal.client.zze zzeVar) {
                zzems.this.zzdB(zzeVar);
                zzbmk zzbmkVar = zzg;
                if (zzbmkVar != null) {
                    try {
                        zzbmkVar.zzf(zzeVar);
                    } catch (RemoteException e2) {
                        com.google.android.gms.ads.internal.util.client.zzm.zzl("#007 Could not call remote method.", e2);
                    }
                }
                if (zzbmkVar != null) {
                    try {
                        zzbmkVar.zze(zzeVar.zza);
                    } catch (RemoteException e10) {
                        com.google.android.gms.ads.internal.util.client.zzm.zzl("#007 Could not call remote method.", e10);
                    }
                }
            }
        };
    }

    public final zzcwp zza() {
        return this.zzc;
    }

    public final zzcya zzb() {
        return this.zzb;
    }

    public final zzdhe zzc() {
        return new zzdhe(this.zza, this.zzb.zzg());
    }

    public final zzems zzd() {
        return this.zzb;
    }

    public final void zze(com.google.android.gms.ads.internal.client.zzbl zzblVar) {
        this.zzb.zzj(zzblVar);
    }
}
