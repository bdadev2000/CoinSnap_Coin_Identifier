package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzbdv;

/* loaded from: classes2.dex */
public final class zzdts implements zzdcg, zzdaz, zzczo, zzdaf, com.google.android.gms.ads.internal.client.zza, zzdes {
    private final zzbdm zza;
    private boolean zzb = false;

    public zzdts(zzbdm zzbdmVar, zzfeo zzfeoVar) {
        this.zza = zzbdmVar;
        zzbdmVar.zzb(zzbdo.AD_REQUEST);
        if (zzfeoVar != null) {
            zzbdmVar.zzb(zzbdo.REQUEST_IS_PREFETCH);
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zza
    public final synchronized void onAdClicked() {
        if (!this.zzb) {
            this.zza.zzb(zzbdo.AD_FIRST_CLICK);
            this.zzb = true;
        } else {
            this.zza.zzb(zzbdo.AD_SUBSEQUENT_CLICK);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzczo
    public final void zzdB(com.google.android.gms.ads.internal.client.zze zzeVar) {
        switch (zzeVar.zza) {
            case 1:
                this.zza.zzb(zzbdo.AD_FAILED_TO_LOAD_INVALID_REQUEST);
                return;
            case 2:
                this.zza.zzb(zzbdo.AD_FAILED_TO_LOAD_NETWORK_ERROR);
                return;
            case 3:
                this.zza.zzb(zzbdo.AD_FAILED_TO_LOAD_NO_FILL);
                return;
            case 4:
                this.zza.zzb(zzbdo.AD_FAILED_TO_LOAD_TIMEOUT);
                return;
            case 5:
                this.zza.zzb(zzbdo.AD_FAILED_TO_LOAD_CANCELLED);
                return;
            case 6:
                this.zza.zzb(zzbdo.AD_FAILED_TO_LOAD_NO_ERROR);
                return;
            case 7:
                this.zza.zzb(zzbdo.AD_FAILED_TO_LOAD_NOT_FOUND);
                return;
            default:
                this.zza.zzb(zzbdo.AD_FAILED_TO_LOAD);
                return;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdcg
    public final void zzdn(zzbxu zzbxuVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzdcg
    public final void zzdo(final zzfhf zzfhfVar) {
        this.zza.zzc(new zzbdl() { // from class: com.google.android.gms.internal.ads.zzdto
            @Override // com.google.android.gms.internal.ads.zzbdl
            public final void zza(zzbdv.zzt.zza zzaVar) {
                zzbdv.zza.zzb zzcZ = zzaVar.zze().zzcZ();
                zzbdv.zzi.zza zzcZ2 = zzaVar.zze().zzad().zzcZ();
                zzcZ2.zzo(zzfhf.this.zzb.zzb.zzb);
                zzcZ.zzT(zzcZ2);
                zzaVar.zzG(zzcZ);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzdes
    public final void zzh() {
        this.zza.zzb(zzbdo.REQUEST_FAILED_TO_LOAD_FROM_CACHE);
    }

    @Override // com.google.android.gms.internal.ads.zzdes
    public final void zzi(final zzbdv.zzb zzbVar) {
        this.zza.zzc(new zzbdl() { // from class: com.google.android.gms.internal.ads.zzdtr
            @Override // com.google.android.gms.internal.ads.zzbdl
            public final void zza(zzbdv.zzt.zza zzaVar) {
                zzaVar.zzJ(zzbdv.zzb.this);
            }
        });
        this.zza.zzb(zzbdo.REQUEST_LOADED_FROM_CACHE);
    }

    @Override // com.google.android.gms.internal.ads.zzdes
    public final void zzj(final zzbdv.zzb zzbVar) {
        this.zza.zzc(new zzbdl() { // from class: com.google.android.gms.internal.ads.zzdtp
            @Override // com.google.android.gms.internal.ads.zzbdl
            public final void zza(zzbdv.zzt.zza zzaVar) {
                zzaVar.zzJ(zzbdv.zzb.this);
            }
        });
        this.zza.zzb(zzbdo.REQUEST_SAVED_TO_CACHE);
    }

    @Override // com.google.android.gms.internal.ads.zzdes
    public final void zzl(boolean z8) {
        zzbdo zzbdoVar;
        if (z8) {
            zzbdoVar = zzbdo.NOTIFIED_CACHE_HIT_TO_SERVICE_SUCCEEDED;
        } else {
            zzbdoVar = zzbdo.NOTIFIED_CACHE_HIT_TO_SERVICE_FAILED;
        }
        this.zza.zzb(zzbdoVar);
    }

    @Override // com.google.android.gms.internal.ads.zzdes
    public final void zzm(final zzbdv.zzb zzbVar) {
        this.zza.zzc(new zzbdl() { // from class: com.google.android.gms.internal.ads.zzdtq
            @Override // com.google.android.gms.internal.ads.zzbdl
            public final void zza(zzbdv.zzt.zza zzaVar) {
                zzaVar.zzJ(zzbdv.zzb.this);
            }
        });
        this.zza.zzb(zzbdo.REQUEST_PREFETCH_INTERCEPTED);
    }

    @Override // com.google.android.gms.internal.ads.zzdes
    public final void zzn(boolean z8) {
        zzbdo zzbdoVar;
        if (z8) {
            zzbdoVar = zzbdo.REQUESTED_CACHE_KEY_FROM_SERVICE_SUCCEEDED;
        } else {
            zzbdoVar = zzbdo.REQUESTED_CACHE_KEY_FROM_SERVICE_FAILED;
        }
        this.zza.zzb(zzbdoVar);
    }

    @Override // com.google.android.gms.internal.ads.zzdaf
    public final synchronized void zzr() {
        this.zza.zzb(zzbdo.AD_IMPRESSION);
    }

    @Override // com.google.android.gms.internal.ads.zzdaz
    public final void zzs() {
        this.zza.zzb(zzbdo.AD_LOADED);
    }
}
