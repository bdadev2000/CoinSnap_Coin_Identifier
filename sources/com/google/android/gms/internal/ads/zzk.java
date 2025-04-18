package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

/* loaded from: classes3.dex */
public final class zzk {
    private int zza;
    private int zzb;
    private int zzc;

    @Nullable
    private byte[] zzd;
    private int zze;
    private int zzf;

    public zzk() {
        this.zza = -1;
        this.zzb = -1;
        this.zzc = -1;
        this.zze = -1;
        this.zzf = -1;
    }

    public final zzk zza(int i10) {
        this.zzf = i10;
        return this;
    }

    public final zzk zzb(int i10) {
        this.zzb = i10;
        return this;
    }

    public final zzk zzc(int i10) {
        this.zza = i10;
        return this;
    }

    public final zzk zzd(int i10) {
        this.zzc = i10;
        return this;
    }

    public final zzk zze(@Nullable byte[] bArr) {
        this.zzd = bArr;
        return this;
    }

    public final zzk zzf(int i10) {
        this.zze = i10;
        return this;
    }

    public final zzm zzg() {
        return new zzm(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzf, null);
    }

    public /* synthetic */ zzk(zzm zzmVar, zzl zzlVar) {
        this.zza = zzmVar.zzb;
        this.zzb = zzmVar.zzc;
        this.zzc = zzmVar.zzd;
        this.zzd = zzmVar.zze;
        this.zze = zzmVar.zzf;
        this.zzf = zzmVar.zzg;
    }
}
