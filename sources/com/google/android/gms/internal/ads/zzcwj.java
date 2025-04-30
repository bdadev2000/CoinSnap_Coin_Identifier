package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;
import com.google.android.gms.internal.ads.zzbdv;

/* loaded from: classes2.dex */
public final class zzcwj implements zzdaz, com.google.android.gms.ads.internal.client.zza, zzdcg, zzdaf, zzczl, zzdes {
    private final Clock zza;
    private final zzcbr zzb;

    public zzcwj(Clock clock, zzcbr zzcbrVar) {
        this.zza = clock;
        this.zzb = zzcbrVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zza
    public final void onAdClicked() {
        this.zzb.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzczl
    public final void zza() {
        this.zzb.zze();
    }

    @Override // com.google.android.gms.internal.ads.zzczl
    public final void zzb() {
    }

    @Override // com.google.android.gms.internal.ads.zzczl
    public final void zzc() {
    }

    @Override // com.google.android.gms.internal.ads.zzdcg
    public final void zzdn(zzbxu zzbxuVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzdcg
    public final void zzdo(zzfhf zzfhfVar) {
        this.zzb.zzk(this.zza.elapsedRealtime());
    }

    @Override // com.google.android.gms.internal.ads.zzczl
    public final void zzds(zzbyh zzbyhVar, String str, String str2) {
    }

    @Override // com.google.android.gms.internal.ads.zzczl
    public final void zze() {
    }

    @Override // com.google.android.gms.internal.ads.zzczl
    public final void zzf() {
    }

    public final String zzg() {
        return this.zzb.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzdes
    public final void zzh() {
    }

    @Override // com.google.android.gms.internal.ads.zzdes
    public final void zzi(zzbdv.zzb zzbVar) {
        this.zzb.zzi();
    }

    @Override // com.google.android.gms.internal.ads.zzdes
    public final void zzj(zzbdv.zzb zzbVar) {
    }

    public final void zzk(com.google.android.gms.ads.internal.client.zzl zzlVar) {
        this.zzb.zzj(zzlVar);
    }

    @Override // com.google.android.gms.internal.ads.zzdes
    public final void zzl(boolean z8) {
    }

    @Override // com.google.android.gms.internal.ads.zzdes
    public final void zzm(zzbdv.zzb zzbVar) {
        this.zzb.zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzdes
    public final void zzn(boolean z8) {
    }

    @Override // com.google.android.gms.internal.ads.zzdaf
    public final void zzr() {
        this.zzb.zzf();
    }

    @Override // com.google.android.gms.internal.ads.zzdaz
    public final void zzs() {
        this.zzb.zzh(true);
    }
}
