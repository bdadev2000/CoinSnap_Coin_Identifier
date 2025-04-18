package com.google.android.gms.internal.ads;

import android.content.Context;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.ads.formats.AdManagerAdViewOptions;
import com.google.android.gms.ads.formats.PublisherAdViewOptions;

/* loaded from: classes3.dex */
public final class zzene extends com.google.android.gms.ads.internal.client.zzbt {

    @VisibleForTesting
    final zzfha zza;

    @VisibleForTesting
    final zzdky zzb;
    private final Context zzc;
    private final zzcho zzd;
    private com.google.android.gms.ads.internal.client.zzbl zze;

    public zzene(zzcho zzchoVar, Context context, String str) {
        zzfha zzfhaVar = new zzfha();
        this.zza = zzfhaVar;
        this.zzb = new zzdky();
        this.zzd = zzchoVar;
        zzfhaVar.zzt(str);
        this.zzc = context;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final com.google.android.gms.ads.internal.client.zzbr zze() {
        zzdla zzg = this.zzb.zzg();
        this.zza.zzE(zzg.zzi());
        this.zza.zzF(zzg.zzh());
        zzfha zzfhaVar = this.zza;
        if (zzfhaVar.zzh() == null) {
            zzfhaVar.zzs(com.google.android.gms.ads.internal.client.zzs.zzc());
        }
        return new zzenf(this.zzc, this.zzd, this.zza, zzg, this.zze);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzf(zzbha zzbhaVar) {
        this.zzb.zza(zzbhaVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzg(zzbhd zzbhdVar) {
        this.zzb.zzb(zzbhdVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzh(String str, zzbhj zzbhjVar, @Nullable zzbhg zzbhgVar) {
        this.zzb.zzc(str, zzbhjVar, zzbhgVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzi(zzbmp zzbmpVar) {
        this.zzb.zzd(zzbmpVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzj(zzbhn zzbhnVar, com.google.android.gms.ads.internal.client.zzs zzsVar) {
        this.zzb.zze(zzbhnVar);
        this.zza.zzs(zzsVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzk(zzbhq zzbhqVar) {
        this.zzb.zzf(zzbhqVar);
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
    public final void zzn(zzbmg zzbmgVar) {
        this.zza.zzw(zzbmgVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzo(zzbfr zzbfrVar) {
        this.zza.zzD(zzbfrVar);
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
