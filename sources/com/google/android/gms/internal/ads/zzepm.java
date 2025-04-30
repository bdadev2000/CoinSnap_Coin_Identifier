package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzepm implements zzepr {
    final /* synthetic */ zzepn zza;

    public zzepm(zzepn zzepnVar) {
        this.zza = zzepnVar;
    }

    @Override // com.google.android.gms.internal.ads.zzepr
    public final void zza() {
        synchronized (this.zza) {
        }
    }

    @Override // com.google.android.gms.internal.ads.zzepr
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        synchronized (this.zza) {
            this.zza.zzc = ((zzcup) obj).zzl();
            ((zzcup) obj).zzj();
        }
    }
}
