package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzeol implements zzeoq {
    final /* synthetic */ zzeom zza;

    public zzeol(zzeom zzeomVar) {
        this.zza = zzeomVar;
    }

    @Override // com.google.android.gms.internal.ads.zzeoq
    public final void zza() {
        synchronized (this.zza) {
        }
    }

    @Override // com.google.android.gms.internal.ads.zzeoq
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzcte zzcteVar = (zzcte) obj;
        synchronized (this.zza) {
            this.zza.zzc = zzcteVar.zzm();
            zzcteVar.zzk();
        }
    }
}
