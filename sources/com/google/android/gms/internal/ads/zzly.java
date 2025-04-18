package com.google.android.gms.internal.ads;

import android.view.Surface;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;

@Deprecated
/* loaded from: classes3.dex */
public final class zzly extends zzj implements zziu {
    private final zzjz zzb;
    private final zzdm zzc;

    public zzly(zzis zzisVar) {
        zzdm zzdmVar = new zzdm(zzdj.zza);
        this.zzc = zzdmVar;
        try {
            this.zzb = new zzjz(zzisVar, this);
            zzdmVar.zze();
        } catch (Throwable th) {
            this.zzc.zze();
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.zziu
    public final void zzA(zzmd zzmdVar) {
        this.zzc.zzb();
        this.zzb.zzA(zzmdVar);
    }

    @Override // com.google.android.gms.internal.ads.zziu
    public final void zzB(zzva zzvaVar) {
        this.zzc.zzb();
        this.zzb.zzB(zzvaVar);
    }

    @Nullable
    public final zzij zzC() {
        this.zzc.zzb();
        return this.zzb.zzE();
    }

    @Override // com.google.android.gms.internal.ads.zzj
    @VisibleForTesting
    public final void zza(int i2, long j2, int i3, boolean z2) {
        this.zzc.zzb();
        this.zzb.zza(i2, j2, 5, false);
    }

    @Override // com.google.android.gms.internal.ads.zzbw
    public final int zzb() {
        this.zzc.zzb();
        return this.zzb.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzbw
    public final int zzc() {
        this.zzc.zzb();
        return this.zzb.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzbw
    public final int zzd() {
        this.zzc.zzb();
        return this.zzb.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzbw
    public final int zze() {
        this.zzc.zzb();
        return this.zzb.zze();
    }

    @Override // com.google.android.gms.internal.ads.zzbw
    public final int zzf() {
        this.zzc.zzb();
        return this.zzb.zzf();
    }

    @Override // com.google.android.gms.internal.ads.zzbw
    public final int zzg() {
        this.zzc.zzb();
        return this.zzb.zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzbw
    public final int zzh() {
        this.zzc.zzb();
        this.zzb.zzh();
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzbw
    public final long zzi() {
        this.zzc.zzb();
        return this.zzb.zzi();
    }

    @Override // com.google.android.gms.internal.ads.zzbw
    public final long zzj() {
        this.zzc.zzb();
        return this.zzb.zzj();
    }

    @Override // com.google.android.gms.internal.ads.zzbw
    public final long zzk() {
        this.zzc.zzb();
        return this.zzb.zzk();
    }

    @Override // com.google.android.gms.internal.ads.zzbw
    public final long zzl() {
        this.zzc.zzb();
        return this.zzb.zzl();
    }

    @Override // com.google.android.gms.internal.ads.zzbw
    public final long zzm() {
        this.zzc.zzb();
        return this.zzb.zzm();
    }

    @Override // com.google.android.gms.internal.ads.zzbw
    public final zzcc zzn() {
        this.zzc.zzb();
        return this.zzb.zzn();
    }

    @Override // com.google.android.gms.internal.ads.zzbw
    public final zzck zzo() {
        this.zzc.zzb();
        return this.zzb.zzo();
    }

    @Override // com.google.android.gms.internal.ads.zzbw
    public final void zzp() {
        this.zzc.zzb();
        this.zzb.zzp();
    }

    @Override // com.google.android.gms.internal.ads.zzbw
    public final void zzq(boolean z2) {
        this.zzc.zzb();
        this.zzb.zzq(z2);
    }

    @Override // com.google.android.gms.internal.ads.zzbw
    public final void zzr(@Nullable Surface surface) {
        this.zzc.zzb();
        this.zzb.zzr(surface);
    }

    @Override // com.google.android.gms.internal.ads.zzbw
    public final void zzs(float f2) {
        this.zzc.zzb();
        this.zzb.zzs(f2);
    }

    @Override // com.google.android.gms.internal.ads.zzbw
    public final void zzt() {
        this.zzc.zzb();
        this.zzb.zzt();
    }

    @Override // com.google.android.gms.internal.ads.zzbw
    public final boolean zzu() {
        this.zzc.zzb();
        return this.zzb.zzu();
    }

    @Override // com.google.android.gms.internal.ads.zzbw
    public final boolean zzv() {
        this.zzc.zzb();
        this.zzb.zzv();
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzbw
    public final boolean zzw() {
        this.zzc.zzb();
        return this.zzb.zzw();
    }

    @Override // com.google.android.gms.internal.ads.zziu
    public final int zzx() {
        this.zzc.zzb();
        this.zzb.zzx();
        return 2;
    }

    @Override // com.google.android.gms.internal.ads.zziu
    public final void zzy(zzmd zzmdVar) {
        this.zzc.zzb();
        this.zzb.zzy(zzmdVar);
    }

    @Override // com.google.android.gms.internal.ads.zziu
    public final void zzz() {
        this.zzc.zzb();
        this.zzb.zzz();
    }
}
