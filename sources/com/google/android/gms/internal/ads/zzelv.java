package com.google.android.gms.internal.ads;

import android.content.Context;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.formats.AdManagerAdViewOptions;
import com.google.android.gms.ads.formats.PublisherAdViewOptions;

/* loaded from: classes3.dex */
public final class zzelv extends com.google.android.gms.ads.internal.client.zzbt {
    final zzffm zza;
    final zzdjh zzb;
    private final Context zzc;
    private final zzchk zzd;
    private com.google.android.gms.ads.internal.client.zzbl zze;

    public zzelv(zzchk zzchkVar, Context context, String str) {
        zzffm zzffmVar = new zzffm();
        this.zza = zzffmVar;
        this.zzb = new zzdjh();
        this.zzd = zzchkVar;
        zzffmVar.zzt(str);
        this.zzc = context;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final com.google.android.gms.ads.internal.client.zzbr zze() {
        zzdjj zzg = this.zzb.zzg();
        this.zza.zzE(zzg.zzi());
        this.zza.zzF(zzg.zzh());
        zzffm zzffmVar = this.zza;
        if (zzffmVar.zzh() == null) {
            zzffmVar.zzs(com.google.android.gms.ads.internal.client.zzs.zzc());
        }
        return new zzelw(this.zzc, this.zzd, this.zza, zzg, this.zze);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzf(zzbgw zzbgwVar) {
        this.zzb.zza(zzbgwVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzg(zzbgz zzbgzVar) {
        this.zzb.zzb(zzbgzVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzh(String str, zzbhf zzbhfVar, @Nullable zzbhc zzbhcVar) {
        this.zzb.zzc(str, zzbhfVar, zzbhcVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzi(zzbmk zzbmkVar) {
        this.zzb.zzd(zzbmkVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzj(zzbhj zzbhjVar, com.google.android.gms.ads.internal.client.zzs zzsVar) {
        this.zzb.zze(zzbhjVar);
        this.zza.zzs(zzsVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzk(zzbhm zzbhmVar) {
        this.zzb.zzf(zzbhmVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzl(com.google.android.gms.ads.internal.client.zzbl zzblVar) {
        this.zze = zzblVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzm(AdManagerAdViewOptions adManagerAdViewOptions) {
        this.zza.zzr(adManagerAdViewOptions);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzn(zzbmb zzbmbVar) {
        this.zza.zzw(zzbmbVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzo(zzbfn zzbfnVar) {
        this.zza.zzD(zzbfnVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzp(PublisherAdViewOptions publisherAdViewOptions) {
        this.zza.zzG(publisherAdViewOptions);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzq(com.google.android.gms.ads.internal.client.zzcq zzcqVar) {
        this.zza.zzV(zzcqVar);
    }
}
