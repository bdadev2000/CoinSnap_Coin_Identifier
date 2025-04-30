package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzeko implements zzgfp {
    final /* synthetic */ zzfgt zza;
    final /* synthetic */ zzekp zzb;

    public zzeko(zzekp zzekpVar, zzfgt zzfgtVar) {
        this.zza = zzfgtVar;
        this.zzb = zzekpVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgfp
    public final void zza(Throwable th) {
        zzekq zzekqVar;
        zzekq zzekqVar2;
        zzekq zzekqVar3;
        synchronized (this.zzb) {
            try {
                zzekqVar = this.zzb.zzh;
                zzekqVar.zzb(th, this.zza);
                zzekqVar2 = this.zzb.zzh;
                zzfgt zza = zzekqVar2.zza();
                if (this.zza.zzaw) {
                    while (zza != null) {
                        this.zzb.zze(zza);
                        zzekqVar3 = this.zzb.zzh;
                        zza = zzekqVar3.zza();
                    }
                } else if (zza != null) {
                    this.zzb.zze(zza);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgfp
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzekq zzekqVar;
        zzekq zzekqVar2;
        zzelg zzelgVar = (zzelg) obj;
        synchronized (this.zzb) {
            try {
                zzekqVar = this.zzb.zzh;
                zzekqVar.zzc(zzelgVar, this.zza);
                zzekqVar2 = this.zzb.zzh;
                zzfgt zza = zzekqVar2.zza();
                if (zza != null) {
                    this.zzb.zze(zza);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
