package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzeoi implements zzeoq {
    final /* synthetic */ zzeoj zza;

    public zzeoi(zzeoj zzeojVar) {
        this.zza = zzeojVar;
    }

    @Override // com.google.android.gms.internal.ads.zzeoq
    public final void zza() {
        synchronized (this.zza) {
            this.zza.zzj = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzeoq
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzdgy zzdgyVar;
        zzdgy zzdgyVar2 = (zzdgy) obj;
        synchronized (this.zza) {
            this.zza.zzj = zzdgyVar2;
            zzdgyVar = this.zza.zzj;
            zzdgyVar.zzk();
        }
    }
}
