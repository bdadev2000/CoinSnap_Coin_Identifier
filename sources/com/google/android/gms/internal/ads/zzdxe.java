package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzdxe extends zzbnq {
    final /* synthetic */ Object zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ long zzc;
    final /* synthetic */ zzfmc zzd;
    final /* synthetic */ zzccn zze;
    final /* synthetic */ zzdxf zzf;

    public zzdxe(zzdxf zzdxfVar, Object obj, String str, long j7, zzfmc zzfmcVar, zzccn zzccnVar) {
        this.zza = obj;
        this.zzb = str;
        this.zzc = j7;
        this.zzd = zzfmcVar;
        this.zze = zzccnVar;
        this.zzf = zzdxfVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbnr
    public final void zze(String str) {
        zzdvm zzdvmVar;
        zzdgh zzdghVar;
        zzfmq zzfmqVar;
        synchronized (this.zza) {
            this.zzf.zzv(this.zzb, false, str, (int) (com.google.android.gms.ads.internal.zzu.zzB().elapsedRealtime() - this.zzc));
            zzdvmVar = this.zzf.zzl;
            zzdvmVar.zzb(this.zzb, "error");
            zzdghVar = this.zzf.zzo;
            zzdghVar.zzb(this.zzb, "error");
            zzfmqVar = this.zzf.zzp;
            zzfmc zzfmcVar = this.zzd;
            zzfmcVar.zzc(str);
            zzfmcVar.zzh(false);
            zzfmqVar.zzb(zzfmcVar.zzn());
            this.zze.zzc(Boolean.FALSE);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbnr
    public final void zzf() {
        zzdvm zzdvmVar;
        zzdgh zzdghVar;
        zzfmq zzfmqVar;
        synchronized (this.zza) {
            this.zzf.zzv(this.zzb, true, "", (int) (com.google.android.gms.ads.internal.zzu.zzB().elapsedRealtime() - this.zzc));
            zzdvmVar = this.zzf.zzl;
            zzdvmVar.zzd(this.zzb);
            zzdghVar = this.zzf.zzo;
            zzdghVar.zzd(this.zzb);
            zzfmqVar = this.zzf.zzp;
            zzfmc zzfmcVar = this.zzd;
            zzfmcVar.zzh(true);
            zzfmqVar.zzb(zzfmcVar.zzn());
            this.zze.zzc(Boolean.TRUE);
        }
    }
}
