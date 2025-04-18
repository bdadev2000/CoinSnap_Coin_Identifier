package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
public final class zzdof extends zzdnp implements zzdel {
    private zzdel zza;

    @Override // com.google.android.gms.internal.ads.zzdel
    public final synchronized void zzdG() {
        zzdel zzdelVar = this.zza;
        if (zzdelVar != null) {
            zzdelVar.zzdG();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdel
    public final synchronized void zzdf() {
        zzdel zzdelVar = this.zza;
        if (zzdelVar != null) {
            zzdelVar.zzdf();
        }
    }

    public final synchronized void zzi(com.google.android.gms.ads.internal.client.zza zzaVar, zzbih zzbihVar, com.google.android.gms.ads.internal.overlay.zzr zzrVar, zzbij zzbijVar, com.google.android.gms.ads.internal.overlay.zzac zzacVar, zzdel zzdelVar) {
        super.zzh(zzaVar, zzbihVar, zzrVar, zzbijVar, zzacVar);
        this.zza = zzdelVar;
    }
}
