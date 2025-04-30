package com.google.android.gms.internal.ads;

import android.view.Surface;
import androidx.annotation.Nullable;

@Deprecated
/* loaded from: classes2.dex */
public final class zzmt extends zzm implements zzjr {
    private final zzkw zzb;
    private final zzeu zzc;

    public zzmt(zzjq zzjqVar) {
        zzeu zzeuVar = new zzeu(zzer.zza);
        this.zzc = zzeuVar;
        try {
            this.zzb = new zzkw(zzjqVar, this);
            zzeuVar.zze();
        } catch (Throwable th) {
            this.zzc.zze();
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzjr
    public final void zzA(zzna zznaVar) {
        this.zzc.zzb();
        this.zzb.zzA(zznaVar);
    }

    @Override // com.google.android.gms.internal.ads.zzjr
    public final void zzB(zzvq zzvqVar) {
        this.zzc.zzb();
        this.zzb.zzB(zzvqVar);
    }

    @Nullable
    public final zzjh zzC() {
        this.zzc.zzb();
        return this.zzb.zzE();
    }

    @Override // com.google.android.gms.internal.ads.zzm
    public final void zza(int i9, long j7, int i10, boolean z8) {
        this.zzc.zzb();
        this.zzb.zza(i9, j7, 5, false);
    }

    @Override // com.google.android.gms.internal.ads.zzct
    public final int zzb() {
        this.zzc.zzb();
        return this.zzb.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzct
    public final int zzc() {
        this.zzc.zzb();
        return this.zzb.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzct
    public final int zzd() {
        this.zzc.zzb();
        return this.zzb.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzct
    public final int zze() {
        this.zzc.zzb();
        return this.zzb.zze();
    }

    @Override // com.google.android.gms.internal.ads.zzct
    public final int zzf() {
        this.zzc.zzb();
        return this.zzb.zzf();
    }

    @Override // com.google.android.gms.internal.ads.zzct
    public final int zzg() {
        this.zzc.zzb();
        return this.zzb.zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzct
    public final int zzh() {
        this.zzc.zzb();
        this.zzb.zzh();
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzct
    public final long zzi() {
        this.zzc.zzb();
        return this.zzb.zzi();
    }

    @Override // com.google.android.gms.internal.ads.zzct
    public final long zzj() {
        this.zzc.zzb();
        return this.zzb.zzj();
    }

    @Override // com.google.android.gms.internal.ads.zzct
    public final long zzk() {
        this.zzc.zzb();
        return this.zzb.zzk();
    }

    @Override // com.google.android.gms.internal.ads.zzct
    public final long zzl() {
        this.zzc.zzb();
        return this.zzb.zzl();
    }

    @Override // com.google.android.gms.internal.ads.zzct
    public final long zzm() {
        this.zzc.zzb();
        return this.zzb.zzm();
    }

    @Override // com.google.android.gms.internal.ads.zzct
    public final zzdc zzn() {
        this.zzc.zzb();
        return this.zzb.zzn();
    }

    @Override // com.google.android.gms.internal.ads.zzct
    public final zzdp zzo() {
        this.zzc.zzb();
        return this.zzb.zzo();
    }

    @Override // com.google.android.gms.internal.ads.zzct
    public final void zzp() {
        this.zzc.zzb();
        this.zzb.zzp();
    }

    @Override // com.google.android.gms.internal.ads.zzct
    public final void zzq() {
        this.zzc.zzb();
        this.zzb.zzq();
    }

    @Override // com.google.android.gms.internal.ads.zzct
    public final void zzr(boolean z8) {
        this.zzc.zzb();
        this.zzb.zzr(z8);
    }

    @Override // com.google.android.gms.internal.ads.zzct
    public final void zzs(@Nullable Surface surface) {
        this.zzc.zzb();
        this.zzb.zzs(surface);
    }

    @Override // com.google.android.gms.internal.ads.zzct
    public final void zzt(float f9) {
        this.zzc.zzb();
        this.zzb.zzt(f9);
    }

    @Override // com.google.android.gms.internal.ads.zzct
    public final void zzu() {
        this.zzc.zzb();
        this.zzb.zzu();
    }

    @Override // com.google.android.gms.internal.ads.zzct
    public final boolean zzv() {
        this.zzc.zzb();
        return this.zzb.zzv();
    }

    @Override // com.google.android.gms.internal.ads.zzct
    public final boolean zzw() {
        this.zzc.zzb();
        this.zzb.zzw();
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzct
    public final boolean zzx() {
        this.zzc.zzb();
        return this.zzb.zzx();
    }

    @Override // com.google.android.gms.internal.ads.zzjr
    public final int zzy() {
        this.zzc.zzb();
        this.zzb.zzy();
        return 2;
    }

    @Override // com.google.android.gms.internal.ads.zzjr
    public final void zzz(zzna zznaVar) {
        this.zzc.zzb();
        this.zzb.zzz(zznaVar);
    }
}
