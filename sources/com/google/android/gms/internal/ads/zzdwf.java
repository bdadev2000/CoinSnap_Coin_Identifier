package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class zzdwf extends zzblx {
    final /* synthetic */ Object zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ long zzc;
    final /* synthetic */ zzflp zzd;
    final /* synthetic */ zzcas zze;
    final /* synthetic */ zzdwg zzf;

    public zzdwf(zzdwg zzdwgVar, Object obj, String str, long j2, zzflp zzflpVar, zzcas zzcasVar) {
        this.zza = obj;
        this.zzb = str;
        this.zzc = j2;
        this.zzd = zzflpVar;
        this.zze = zzcasVar;
        this.zzf = zzdwgVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbly
    public final void zze(String str) {
        zzdun zzdunVar;
        zzdez zzdezVar;
        zzfmd zzfmdVar;
        synchronized (this.zza) {
            this.zzf.zzv(this.zzb, false, str, (int) (com.google.android.gms.ads.internal.zzu.zzB().elapsedRealtime() - this.zzc));
            zzdunVar = this.zzf.zzl;
            zzdunVar.zzb(this.zzb, "error");
            zzdezVar = this.zzf.zzo;
            zzdezVar.zzb(this.zzb, "error");
            zzfmdVar = this.zzf.zzp;
            zzflp zzflpVar = this.zzd;
            zzflpVar.zzc(str);
            zzflpVar.zzg(false);
            zzfmdVar.zzb(zzflpVar.zzm());
            this.zze.zzc(Boolean.FALSE);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbly
    public final void zzf() {
        zzdun zzdunVar;
        zzdez zzdezVar;
        zzfmd zzfmdVar;
        synchronized (this.zza) {
            this.zzf.zzv(this.zzb, true, "", (int) (com.google.android.gms.ads.internal.zzu.zzB().elapsedRealtime() - this.zzc));
            zzdunVar = this.zzf.zzl;
            zzdunVar.zzd(this.zzb);
            zzdezVar = this.zzf.zzo;
            zzdezVar.zzd(this.zzb);
            zzfmdVar = this.zzf.zzp;
            zzflp zzflpVar = this.zzd;
            zzflpVar.zzg(true);
            zzfmdVar.zzb(zzflpVar.zzm());
            this.zze.zzc(Boolean.TRUE);
        }
    }
}
