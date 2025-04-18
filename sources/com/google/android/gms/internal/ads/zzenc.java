package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzenc implements zzenh {
    final /* synthetic */ zzend zza;

    public zzenc(zzend zzendVar) {
        this.zza = zzendVar;
    }

    @Override // com.google.android.gms.internal.ads.zzenh
    public final void zza() {
        synchronized (this.zza) {
        }
    }

    @Override // com.google.android.gms.internal.ads.zzenh
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzcrq zzcrqVar = (zzcrq) obj;
        synchronized (this.zza) {
            this.zza.zzc = zzcrqVar.zzm();
            zzcrqVar.zzk();
        }
    }
}
