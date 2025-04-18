package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzejn implements zzgfk {
    final /* synthetic */ zzfgh zza;
    final /* synthetic */ zzejo zzb;

    public zzejn(zzejo zzejoVar, zzfgh zzfghVar) {
        this.zza = zzfghVar;
        this.zzb = zzejoVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgfk
    public final void zza(Throwable th) {
        zzejp zzejpVar;
        zzejp zzejpVar2;
        zzejp zzejpVar3;
        synchronized (this.zzb) {
            try {
                zzejpVar = this.zzb.zzh;
                zzejpVar.zzb(th, this.zza);
                zzejpVar2 = this.zzb.zzh;
                zzfgh zza = zzejpVar2.zza();
                if (this.zza.zzav) {
                    while (zza != null) {
                        this.zzb.zze(zza);
                        zzejpVar3 = this.zzb.zzh;
                        zza = zzejpVar3.zza();
                    }
                } else if (zza != null) {
                    this.zzb.zze(zza);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgfk
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzejp zzejpVar;
        zzejp zzejpVar2;
        zzekf zzekfVar = (zzekf) obj;
        synchronized (this.zzb) {
            try {
                zzejpVar = this.zzb.zzh;
                zzejpVar.zzc(zzekfVar, this.zza);
                zzejpVar2 = this.zzb.zzh;
                zzfgh zza = zzejpVar2.zza();
                if (zza != null) {
                    this.zzb.zze(zza);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
