package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public abstract class zzyf {
    public final int zza;
    public final zzcd zzb;
    public final int zzc;
    public final zzaf zzd;

    public zzyf(int i2, zzcd zzcdVar, int i3) {
        this.zza = i2;
        this.zzb = zzcdVar;
        this.zzc = i3;
        this.zzd = zzcdVar.zzb(i3);
    }

    public abstract int zzb();

    public abstract boolean zzc(zzyf zzyfVar);
}
