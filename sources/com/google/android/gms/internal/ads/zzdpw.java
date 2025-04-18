package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
public final class zzdpw extends zzdpg implements zzdga {
    private zzdga zza;

    @Override // com.google.android.gms.internal.ads.zzdga
    public final synchronized void zzdG() {
        zzdga zzdgaVar = this.zza;
        if (zzdgaVar != null) {
            zzdgaVar.zzdG();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdga
    public final synchronized void zzdf() {
        zzdga zzdgaVar = this.zza;
        if (zzdgaVar != null) {
            zzdgaVar.zzdf();
        }
    }

    public final synchronized void zzi(com.google.android.gms.ads.internal.client.zza zzaVar, zzbim zzbimVar, com.google.android.gms.ads.internal.overlay.zzr zzrVar, zzbio zzbioVar, com.google.android.gms.ads.internal.overlay.zzac zzacVar, zzdga zzdgaVar) {
        super.zzh(zzaVar, zzbimVar, zzrVar, zzbioVar, zzacVar);
        this.zza = zzdgaVar;
    }
}
