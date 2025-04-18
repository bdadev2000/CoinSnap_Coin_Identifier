package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzbbs;

/* loaded from: classes3.dex */
public final class zzdrc implements zzczj, zzcya, zzcwp, zzcxg, com.google.android.gms.ads.internal.client.zza, zzdbv {
    private final zzbbl zza;
    private boolean zzb = false;

    public zzdrc(zzbbl zzbblVar, zzfco zzfcoVar) {
        this.zza = zzbblVar;
        zzbblVar.zzc(2);
        if (zzfcoVar != null) {
            zzbblVar.zzc(1101);
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zza
    public final synchronized void onAdClicked() {
        if (!this.zzb) {
            this.zza.zzc(7);
            this.zzb = true;
        } else {
            this.zza.zzc(8);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcwp
    public final void zzdB(com.google.android.gms.ads.internal.client.zze zzeVar) {
        switch (zzeVar.zza) {
            case 1:
                this.zza.zzc(101);
                return;
            case 2:
                this.zza.zzc(102);
                return;
            case 3:
                this.zza.zzc(5);
                return;
            case 4:
                this.zza.zzc(103);
                return;
            case 5:
                this.zza.zzc(104);
                return;
            case 6:
                this.zza.zzc(105);
                return;
            case 7:
                this.zza.zzc(106);
                return;
            default:
                this.zza.zzc(4);
                return;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzczj
    public final void zzdn(zzbvx zzbvxVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzczj
    public final void zzdo(final zzfff zzfffVar) {
        this.zza.zzb(new zzbbk() { // from class: com.google.android.gms.internal.ads.zzdqy
            @Override // com.google.android.gms.internal.ads.zzbbk
            public final void zza(zzbbs.zzt.zza zzaVar) {
                zzbbs.zza.zzb zzbM = zzaVar.zze().zzbM();
                zzbbs.zzi.zza zzbM2 = zzaVar.zze().zzad().zzbM();
                zzbM2.zzo(zzfff.this.zzb.zzb.zzb);
                zzbM.zzT(zzbM2);
                zzaVar.zzG(zzbM);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzdbv
    public final void zzh() {
        this.zza.zzc(1109);
    }

    @Override // com.google.android.gms.internal.ads.zzdbv
    public final void zzi(final zzbbs.zzb zzbVar) {
        this.zza.zzb(new zzbbk() { // from class: com.google.android.gms.internal.ads.zzdrb
            @Override // com.google.android.gms.internal.ads.zzbbk
            public final void zza(zzbbs.zzt.zza zzaVar) {
                zzaVar.zzJ(zzbbs.zzb.this);
            }
        });
        this.zza.zzc(1103);
    }

    @Override // com.google.android.gms.internal.ads.zzdbv
    public final void zzj(final zzbbs.zzb zzbVar) {
        this.zza.zzb(new zzbbk() { // from class: com.google.android.gms.internal.ads.zzdqz
            @Override // com.google.android.gms.internal.ads.zzbbk
            public final void zza(zzbbs.zzt.zza zzaVar) {
                zzaVar.zzJ(zzbbs.zzb.this);
            }
        });
        this.zza.zzc(1102);
    }

    @Override // com.google.android.gms.internal.ads.zzdbv
    public final void zzl(boolean z10) {
        this.zza.zzc(true != z10 ? 1108 : 1107);
    }

    @Override // com.google.android.gms.internal.ads.zzdbv
    public final void zzm(final zzbbs.zzb zzbVar) {
        this.zza.zzb(new zzbbk() { // from class: com.google.android.gms.internal.ads.zzdra
            @Override // com.google.android.gms.internal.ads.zzbbk
            public final void zza(zzbbs.zzt.zza zzaVar) {
                zzaVar.zzJ(zzbbs.zzb.this);
            }
        });
        this.zza.zzc(1104);
    }

    @Override // com.google.android.gms.internal.ads.zzdbv
    public final void zzn(boolean z10) {
        this.zza.zzc(true != z10 ? 1106 : 1105);
    }

    @Override // com.google.android.gms.internal.ads.zzcxg
    public final synchronized void zzr() {
        this.zza.zzc(6);
    }

    @Override // com.google.android.gms.internal.ads.zzcya
    public final void zzs() {
        this.zza.zzc(3);
    }
}
