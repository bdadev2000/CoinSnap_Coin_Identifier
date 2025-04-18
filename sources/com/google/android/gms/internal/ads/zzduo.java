package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzduo extends zzbls {
    final /* synthetic */ Object zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ long zzc;
    final /* synthetic */ zzfka zzd;
    final /* synthetic */ zzcao zze;
    final /* synthetic */ zzdup zzf;

    public zzduo(zzdup zzdupVar, Object obj, String str, long j3, zzfka zzfkaVar, zzcao zzcaoVar) {
        this.zza = obj;
        this.zzb = str;
        this.zzc = j3;
        this.zzd = zzfkaVar;
        this.zze = zzcaoVar;
        this.zzf = zzdupVar;
    }

    @Override // com.google.android.gms.internal.ads.zzblt
    public final void zze(String str) {
        zzdsw zzdswVar;
        zzddk zzddkVar;
        zzfko zzfkoVar;
        synchronized (this.zza) {
            this.zzf.zzv(this.zzb, false, str, (int) (com.google.android.gms.ads.internal.zzv.zzC().elapsedRealtime() - this.zzc));
            zzdswVar = this.zzf.zzl;
            zzdswVar.zzb(this.zzb, "error");
            zzddkVar = this.zzf.zzo;
            zzddkVar.zzb(this.zzb, "error");
            zzfkoVar = this.zzf.zzp;
            zzfka zzfkaVar = this.zzd;
            zzfkaVar.zzc(str);
            zzfkaVar.zzg(false);
            zzfkoVar.zzb(zzfkaVar.zzm());
            this.zze.zzc(Boolean.FALSE);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzblt
    public final void zzf() {
        zzdsw zzdswVar;
        zzddk zzddkVar;
        zzfko zzfkoVar;
        synchronized (this.zza) {
            this.zzf.zzv(this.zzb, true, "", (int) (com.google.android.gms.ads.internal.zzv.zzC().elapsedRealtime() - this.zzc));
            zzdswVar = this.zzf.zzl;
            zzdswVar.zzd(this.zzb);
            zzddkVar = this.zzf.zzo;
            zzddkVar.zzd(this.zzb);
            zzfkoVar = this.zzf.zzp;
            zzfka zzfkaVar = this.zzd;
            zzfkaVar.zzg(true);
            zzfkoVar.zzb(zzfkaVar.zzm());
            this.zze.zzc(Boolean.TRUE);
        }
    }
}
