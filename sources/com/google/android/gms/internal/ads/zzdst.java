package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzbcb;

/* loaded from: classes3.dex */
public final class zzdst implements zzday, zzczo, zzcyd, zzcyu, com.google.android.gms.ads.internal.client.zza, zzddk {
    private final zzbbu zza;
    private boolean zzb = false;

    public zzdst(zzbbu zzbbuVar, zzfec zzfecVar) {
        this.zza = zzbbuVar;
        zzbbuVar.zzc(2);
        if (zzfecVar != null) {
            zzbbuVar.zzc(1101);
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zza
    public final synchronized void onAdClicked() {
        if (this.zzb) {
            this.zza.zzc(8);
        } else {
            this.zza.zzc(7);
            this.zzb = true;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcyd
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

    @Override // com.google.android.gms.internal.ads.zzday
    public final void zzdn(zzbwa zzbwaVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzday
    public final void zzdo(final zzfgt zzfgtVar) {
        this.zza.zzb(new zzbbt() { // from class: com.google.android.gms.internal.ads.zzdsp
            @Override // com.google.android.gms.internal.ads.zzbbt
            public final void zza(zzbcb.zzt.zza zzaVar) {
                zzbcb.zza.zzb zzbM = zzaVar.zze().zzbM();
                zzbcb.zzi.zza zzbM2 = zzaVar.zze().zzad().zzbM();
                zzbM2.zzo(zzfgt.this.zzb.zzb.zzb);
                zzbM.zzT(zzbM2);
                zzaVar.zzG(zzbM);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzddk
    public final void zzh() {
        this.zza.zzc(1109);
    }

    @Override // com.google.android.gms.internal.ads.zzddk
    public final void zzi(final zzbcb.zzb zzbVar) {
        this.zza.zzb(new zzbbt() { // from class: com.google.android.gms.internal.ads.zzdss
            @Override // com.google.android.gms.internal.ads.zzbbt
            public final void zza(zzbcb.zzt.zza zzaVar) {
                zzaVar.zzJ(zzbcb.zzb.this);
            }
        });
        this.zza.zzc(1103);
    }

    @Override // com.google.android.gms.internal.ads.zzddk
    public final void zzj(final zzbcb.zzb zzbVar) {
        this.zza.zzb(new zzbbt() { // from class: com.google.android.gms.internal.ads.zzdsq
            @Override // com.google.android.gms.internal.ads.zzbbt
            public final void zza(zzbcb.zzt.zza zzaVar) {
                zzaVar.zzJ(zzbcb.zzb.this);
            }
        });
        this.zza.zzc(1102);
    }

    @Override // com.google.android.gms.internal.ads.zzddk
    public final void zzl(boolean z2) {
        this.zza.zzc(true != z2 ? 1108 : 1107);
    }

    @Override // com.google.android.gms.internal.ads.zzddk
    public final void zzm(final zzbcb.zzb zzbVar) {
        this.zza.zzb(new zzbbt() { // from class: com.google.android.gms.internal.ads.zzdsr
            @Override // com.google.android.gms.internal.ads.zzbbt
            public final void zza(zzbcb.zzt.zza zzaVar) {
                zzaVar.zzJ(zzbcb.zzb.this);
            }
        });
        this.zza.zzc(1104);
    }

    @Override // com.google.android.gms.internal.ads.zzddk
    public final void zzn(boolean z2) {
        this.zza.zzc(true != z2 ? 1106 : 1105);
    }

    @Override // com.google.android.gms.internal.ads.zzcyu
    public final synchronized void zzr() {
        this.zza.zzc(6);
    }

    @Override // com.google.android.gms.internal.ads.zzczo
    public final void zzs() {
        this.zza.zzc(3);
    }
}
