package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

/* loaded from: classes2.dex */
public final class zzr {
    private int zza;
    private int zzb;
    private int zzc;

    @Nullable
    private byte[] zzd;
    private int zze;
    private int zzf;

    public zzr() {
        this.zza = -1;
        this.zzb = -1;
        this.zzc = -1;
        this.zze = -1;
        this.zzf = -1;
    }

    public final zzr zza(int i9) {
        this.zzf = i9;
        return this;
    }

    public final zzr zzb(int i9) {
        this.zzb = i9;
        return this;
    }

    public final zzr zzc(int i9) {
        this.zza = i9;
        return this;
    }

    public final zzr zzd(int i9) {
        this.zzc = i9;
        return this;
    }

    public final zzr zze(@Nullable byte[] bArr) {
        this.zzd = bArr;
        return this;
    }

    public final zzr zzf(int i9) {
        this.zze = i9;
        return this;
    }

    public final zzt zzg() {
        return new zzt(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzf, null);
    }

    public /* synthetic */ zzr(zzt zztVar, zzq zzqVar) {
        this.zza = zztVar.zzd;
        this.zzb = zztVar.zze;
        this.zzc = zztVar.zzf;
        this.zzd = zztVar.zzg;
        this.zze = zztVar.zzh;
        this.zzf = zztVar.zzi;
    }
}
