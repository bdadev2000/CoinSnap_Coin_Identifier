package com.google.android.gms.internal.ads;

/* loaded from: classes4.dex */
final class zzfcm implements zzeoq {
    final /* synthetic */ zzfcn zza;

    public zzfcm(zzfcn zzfcnVar) {
        this.zza = zzfcnVar;
    }

    @Override // com.google.android.gms.internal.ads.zzeoq
    public final void zza() {
        synchronized (this.zza) {
            this.zza.zza = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzeoq
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzfcf zzfcfVar;
        zzfcf zzfcfVar2;
        zzdud zzdudVar;
        zzcql zzcqlVar = (zzcql) obj;
        synchronized (this.zza) {
            try {
                zzcql zzcqlVar2 = this.zza.zza;
                if (zzcqlVar2 != null) {
                    zzcqlVar2.zzb();
                }
                zzfcn zzfcnVar = this.zza;
                zzfcnVar.zza = zzcqlVar;
                zzcqlVar.zzc(zzfcnVar);
                zzfcn zzfcnVar2 = this.zza;
                zzfcfVar = zzfcnVar2.zzg;
                zzfcfVar2 = zzfcnVar2.zzg;
                zzdudVar = zzfcnVar2.zzi;
                zzfcfVar.zzk(new zzcqm(zzcqlVar, zzfcnVar2, zzfcfVar2, zzdudVar));
                zzcqlVar.zzk();
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
