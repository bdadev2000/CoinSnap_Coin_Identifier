package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzemz implements zzenh {
    final /* synthetic */ zzena zza;

    public zzemz(zzena zzenaVar) {
        this.zza = zzenaVar;
    }

    @Override // com.google.android.gms.internal.ads.zzenh
    public final void zza() {
        synchronized (this.zza) {
            this.zza.zzj = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzenh
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzdfj zzdfjVar;
        zzdfj zzdfjVar2 = (zzdfj) obj;
        synchronized (this.zza) {
            this.zza.zzj = zzdfjVar2;
            zzdfjVar = this.zza.zzj;
            zzdfjVar.zzk();
        }
    }
}
