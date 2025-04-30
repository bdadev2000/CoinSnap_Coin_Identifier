package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzwu implements zzwa {
    private final zzha zzc;
    private int zzd;
    private final zzwt zze;
    private final zzzz zzf;
    private final zzsl zzg;

    public zzwu(zzha zzhaVar, zzwt zzwtVar) {
        zzsl zzslVar = new zzsl();
        zzzz zzzzVar = new zzzz(-1);
        this.zzc = zzhaVar;
        this.zze = zzwtVar;
        this.zzg = zzslVar;
        this.zzf = zzzzVar;
        this.zzd = 1048576;
    }

    public final zzwu zza(int i9) {
        this.zzd = i9;
        return this;
    }

    public final zzww zzb(zzbu zzbuVar) {
        zzbuVar.zzd.getClass();
        return new zzww(zzbuVar, this.zzc, this.zze, zzst.zza, this.zzf, this.zzd, null);
    }
}
