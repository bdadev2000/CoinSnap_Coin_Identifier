package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public abstract class zzxw {
    public final int zza;
    public final zzbw zzb;
    public final int zzc;
    public final zzad zzd;

    public zzxw(int i10, zzbw zzbwVar, int i11) {
        this.zza = i10;
        this.zzb = zzbwVar;
        this.zzc = i11;
        this.zzd = zzbwVar.zzb(i11);
    }

    public abstract int zzb();

    public abstract boolean zzc(zzxw zzxwVar);
}
