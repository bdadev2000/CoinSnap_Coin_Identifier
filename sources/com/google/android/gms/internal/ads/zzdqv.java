package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzdqv extends zzdqf implements zzdhi {
    private zzdhi zza;

    @Override // com.google.android.gms.internal.ads.zzdhi
    public final synchronized void zzdG() {
        zzdhi zzdhiVar = this.zza;
        if (zzdhiVar != null) {
            zzdhiVar.zzdG();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdhi
    public final synchronized void zzdf() {
        zzdhi zzdhiVar = this.zza;
        if (zzdhiVar != null) {
            zzdhiVar.zzdf();
        }
    }

    public final synchronized void zzi(com.google.android.gms.ads.internal.client.zza zzaVar, zzbkf zzbkfVar, com.google.android.gms.ads.internal.overlay.zzp zzpVar, zzbkh zzbkhVar, com.google.android.gms.ads.internal.overlay.zzaa zzaaVar, zzdhi zzdhiVar) {
        zzh(zzaVar, zzbkfVar, zzpVar, zzbkhVar, zzaaVar);
        this.zza = zzdhiVar;
    }
}
