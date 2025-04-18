package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;
import com.google.android.gms.internal.ads.zzbbs;

/* loaded from: classes3.dex */
public final class zzctk implements zzcya, com.google.android.gms.ads.internal.client.zza, zzczj, zzcxg, zzcwm, zzdbv {
    private final Clock zza;
    private final zzbzs zzb;

    public zzctk(Clock clock, zzbzs zzbzsVar) {
        this.zza = clock;
        this.zzb = zzbzsVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zza
    public final void onAdClicked() {
        this.zzb.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzcwm
    public final void zza() {
        this.zzb.zze();
    }

    @Override // com.google.android.gms.internal.ads.zzcwm
    public final void zzb() {
    }

    @Override // com.google.android.gms.internal.ads.zzcwm
    public final void zzc() {
    }

    @Override // com.google.android.gms.internal.ads.zzczj
    public final void zzdn(zzbvx zzbvxVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzczj
    public final void zzdo(zzfff zzfffVar) {
        this.zzb.zzk(this.zza.elapsedRealtime());
    }

    @Override // com.google.android.gms.internal.ads.zzcwm
    public final void zzds(zzbwj zzbwjVar, String str, String str2) {
    }

    @Override // com.google.android.gms.internal.ads.zzcwm
    public final void zze() {
    }

    @Override // com.google.android.gms.internal.ads.zzcwm
    public final void zzf() {
    }

    public final String zzg() {
        return this.zzb.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzdbv
    public final void zzh() {
    }

    @Override // com.google.android.gms.internal.ads.zzdbv
    public final void zzi(zzbbs.zzb zzbVar) {
        this.zzb.zzi();
    }

    @Override // com.google.android.gms.internal.ads.zzdbv
    public final void zzj(zzbbs.zzb zzbVar) {
    }

    public final void zzk(com.google.android.gms.ads.internal.client.zzm zzmVar) {
        this.zzb.zzj(zzmVar);
    }

    @Override // com.google.android.gms.internal.ads.zzdbv
    public final void zzl(boolean z10) {
    }

    @Override // com.google.android.gms.internal.ads.zzdbv
    public final void zzm(zzbbs.zzb zzbVar) {
        this.zzb.zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzdbv
    public final void zzn(boolean z10) {
    }

    @Override // com.google.android.gms.internal.ads.zzcxg
    public final void zzr() {
        this.zzb.zzf();
    }

    @Override // com.google.android.gms.internal.ads.zzcya
    public final void zzs() {
        this.zzb.zzh(true);
    }
}
