package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public abstract class zzza {
    public final int zza;
    public final zzde zzb;
    public final int zzc;
    public final zzan zzd;

    public zzza(int i9, zzde zzdeVar, int i10) {
        this.zza = i9;
        this.zzb = zzdeVar;
        this.zzc = i10;
        this.zzd = zzdeVar.zzb(i10);
    }

    public abstract int zzb();

    public abstract boolean zzc(zzza zzzaVar);
}
