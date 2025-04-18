package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzeie implements zzgee {
    final /* synthetic */ zzfet zza;
    final /* synthetic */ zzeif zzb;

    public zzeie(zzeif zzeifVar, zzfet zzfetVar) {
        this.zza = zzfetVar;
        this.zzb = zzeifVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgee
    public final void zza(Throwable th2) {
        zzeig zzeigVar;
        zzeig zzeigVar2;
        zzeig zzeigVar3;
        synchronized (this.zzb) {
            zzeigVar = this.zzb.zzh;
            zzeigVar.zzb(th2, this.zza);
            zzeigVar2 = this.zzb.zzh;
            zzfet zza = zzeigVar2.zza();
            if (this.zza.zzav) {
                while (zza != null) {
                    this.zzb.zze(zza);
                    zzeigVar3 = this.zzb.zzh;
                    zza = zzeigVar3.zza();
                }
            } else if (zza != null) {
                this.zzb.zze(zza);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgee
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzeig zzeigVar;
        zzeig zzeigVar2;
        zzeiw zzeiwVar = (zzeiw) obj;
        synchronized (this.zzb) {
            zzeigVar = this.zzb.zzh;
            zzeigVar.zzc(zzeiwVar, this.zza);
            zzeigVar2 = this.zzb.zzh;
            zzfet zza = zzeigVar2.zza();
            if (zza != null) {
                this.zzb.zze(zza);
            }
        }
    }
}
