package com.google.android.gms.internal.ads;

import java.util.Map;

/* loaded from: classes2.dex */
final class zzblz implements com.google.android.gms.ads.internal.overlay.zzy {
    boolean zza = false;
    final /* synthetic */ boolean zzb;
    final /* synthetic */ com.google.android.gms.ads.internal.client.zza zzc;
    final /* synthetic */ Map zzd;
    final /* synthetic */ Map zze;

    public zzblz(zzbmb zzbmbVar, boolean z8, com.google.android.gms.ads.internal.client.zza zzaVar, Map map, Map map2) {
        this.zzb = z8;
        this.zzc = zzaVar;
        this.zzd = map;
        this.zze = map2;
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzy
    public final void zza(boolean z8) {
        if (!this.zza) {
            if (z8 && this.zzb) {
                ((zzdhi) this.zzc).zzdG();
            }
            this.zza = true;
            this.zzd.put((String) this.zze.get("event_id"), Boolean.valueOf(z8));
            ((zzbok) this.zzc).zzd("openIntentAsync", this.zzd);
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzy
    public final void zzb(int i9) {
    }
}
