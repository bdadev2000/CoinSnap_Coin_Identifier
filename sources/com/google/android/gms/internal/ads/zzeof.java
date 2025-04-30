package com.google.android.gms.internal.ads;

import android.content.Context;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.formats.AdManagerAdViewOptions;
import com.google.android.gms.ads.formats.PublisherAdViewOptions;

/* loaded from: classes2.dex */
public final class zzeof extends com.google.android.gms.ads.internal.client.zzbp {
    final zzfhm zza;
    final zzdmc zzb;
    private final Context zzc;
    private final zzcjd zzd;
    private com.google.android.gms.ads.internal.client.zzbh zze;

    public zzeof(zzcjd zzcjdVar, Context context, String str) {
        zzfhm zzfhmVar = new zzfhm();
        this.zza = zzfhmVar;
        this.zzb = new zzdmc();
        this.zzd = zzcjdVar;
        zzfhmVar.zzt(str);
        this.zzc = context;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final com.google.android.gms.ads.internal.client.zzbn zze() {
        zzdme zzg = this.zzb.zzg();
        this.zza.zzE(zzg.zzi());
        this.zza.zzF(zzg.zzh());
        zzfhm zzfhmVar = this.zza;
        if (zzfhmVar.zzh() == null) {
            zzfhmVar.zzs(com.google.android.gms.ads.internal.client.zzq.zzc());
        }
        return new zzeog(this.zzc, this.zzd, this.zza, zzg, this.zze);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final void zzf(zzbit zzbitVar) {
        this.zzb.zza(zzbitVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final void zzg(zzbiw zzbiwVar) {
        this.zzb.zzb(zzbiwVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final void zzh(String str, zzbjc zzbjcVar, @Nullable zzbiz zzbizVar) {
        this.zzb.zzc(str, zzbjcVar, zzbizVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final void zzi(zzboi zzboiVar) {
        this.zzb.zzd(zzboiVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final void zzj(zzbjg zzbjgVar, com.google.android.gms.ads.internal.client.zzq zzqVar) {
        this.zzb.zze(zzbjgVar);
        this.zza.zzs(zzqVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final void zzk(zzbjj zzbjjVar) {
        this.zzb.zzf(zzbjjVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final void zzl(com.google.android.gms.ads.internal.client.zzbh zzbhVar) {
        this.zze = zzbhVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final void zzm(AdManagerAdViewOptions adManagerAdViewOptions) {
        this.zza.zzr(adManagerAdViewOptions);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final void zzn(zzbnz zzbnzVar) {
        this.zza.zzw(zzbnzVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final void zzo(zzbhk zzbhkVar) {
        this.zza.zzD(zzbhkVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final void zzp(PublisherAdViewOptions publisherAdViewOptions) {
        this.zza.zzG(publisherAdViewOptions);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final void zzq(com.google.android.gms.ads.internal.client.zzcf zzcfVar) {
        this.zza.zzU(zzcfVar);
    }
}
