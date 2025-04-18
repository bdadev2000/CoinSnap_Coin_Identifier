package com.google.android.gms.internal.ads;

import android.view.Surface;
import androidx.annotation.Nullable;

@Deprecated
/* loaded from: classes3.dex */
public final class zzlu extends zzi implements zzir {
    private final zzjv zzb;
    private final zzdf zzc;

    public zzlu(zzip zzipVar) {
        zzdf zzdfVar = new zzdf(zzdc.zza);
        this.zzc = zzdfVar;
        try {
            this.zzb = new zzjv(zzipVar, this);
            zzdfVar.zze();
        } catch (Throwable th2) {
            this.zzc.zze();
            throw th2;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzir
    public final void zzA(zzlz zzlzVar) {
        this.zzc.zzb();
        this.zzb.zzA(zzlzVar);
    }

    @Override // com.google.android.gms.internal.ads.zzir
    public final void zzB(zzut zzutVar) {
        this.zzc.zzb();
        this.zzb.zzB(zzutVar);
    }

    @Nullable
    public final zzig zzC() {
        this.zzc.zzb();
        return this.zzb.zzE();
    }

    @Override // com.google.android.gms.internal.ads.zzi
    public final void zza(int i10, long j3, int i11, boolean z10) {
        this.zzc.zzb();
        this.zzb.zza(i10, j3, 5, false);
    }

    @Override // com.google.android.gms.internal.ads.zzbp
    public final int zzb() {
        this.zzc.zzb();
        return this.zzb.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzbp
    public final int zzc() {
        this.zzc.zzb();
        return this.zzb.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzbp
    public final int zzd() {
        this.zzc.zzb();
        return this.zzb.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzbp
    public final int zze() {
        this.zzc.zzb();
        return this.zzb.zze();
    }

    @Override // com.google.android.gms.internal.ads.zzbp
    public final int zzf() {
        this.zzc.zzb();
        return this.zzb.zzf();
    }

    @Override // com.google.android.gms.internal.ads.zzbp
    public final int zzg() {
        this.zzc.zzb();
        return this.zzb.zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzbp
    public final int zzh() {
        this.zzc.zzb();
        this.zzb.zzh();
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzbp
    public final long zzi() {
        this.zzc.zzb();
        return this.zzb.zzi();
    }

    @Override // com.google.android.gms.internal.ads.zzbp
    public final long zzj() {
        this.zzc.zzb();
        return this.zzb.zzj();
    }

    @Override // com.google.android.gms.internal.ads.zzbp
    public final long zzk() {
        this.zzc.zzb();
        return this.zzb.zzk();
    }

    @Override // com.google.android.gms.internal.ads.zzbp
    public final long zzl() {
        this.zzc.zzb();
        return this.zzb.zzl();
    }

    @Override // com.google.android.gms.internal.ads.zzbp
    public final long zzm() {
        this.zzc.zzb();
        return this.zzb.zzm();
    }

    @Override // com.google.android.gms.internal.ads.zzbp
    public final zzbv zzn() {
        this.zzc.zzb();
        return this.zzb.zzn();
    }

    @Override // com.google.android.gms.internal.ads.zzbp
    public final zzcd zzo() {
        this.zzc.zzb();
        return this.zzb.zzo();
    }

    @Override // com.google.android.gms.internal.ads.zzbp
    public final void zzp() {
        this.zzc.zzb();
        this.zzb.zzp();
    }

    @Override // com.google.android.gms.internal.ads.zzbp
    public final void zzq(boolean z10) {
        this.zzc.zzb();
        this.zzb.zzq(z10);
    }

    @Override // com.google.android.gms.internal.ads.zzbp
    public final void zzr(@Nullable Surface surface) {
        this.zzc.zzb();
        this.zzb.zzr(surface);
    }

    @Override // com.google.android.gms.internal.ads.zzbp
    public final void zzs(float f10) {
        this.zzc.zzb();
        this.zzb.zzs(f10);
    }

    @Override // com.google.android.gms.internal.ads.zzbp
    public final void zzt() {
        this.zzc.zzb();
        this.zzb.zzt();
    }

    @Override // com.google.android.gms.internal.ads.zzbp
    public final boolean zzu() {
        this.zzc.zzb();
        return this.zzb.zzu();
    }

    @Override // com.google.android.gms.internal.ads.zzbp
    public final boolean zzv() {
        this.zzc.zzb();
        this.zzb.zzv();
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzbp
    public final boolean zzw() {
        this.zzc.zzb();
        return this.zzb.zzw();
    }

    @Override // com.google.android.gms.internal.ads.zzir
    public final int zzx() {
        this.zzc.zzb();
        this.zzb.zzx();
        return 2;
    }

    @Override // com.google.android.gms.internal.ads.zzir
    public final void zzy(zzlz zzlzVar) {
        this.zzc.zzb();
        this.zzb.zzy(zzlzVar);
    }

    @Override // com.google.android.gms.internal.ads.zzir
    public final void zzz() {
        this.zzc.zzb();
        this.zzb.zzz();
    }
}
