package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
final class zzamj implements Comparable {
    public final int zza;
    public final zzamd zzb;

    public zzamj(int i2, zzamd zzamdVar) {
        this.zza = i2;
        this.zzb = zzamdVar;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return Integer.compare(this.zza, ((zzamj) obj).zza);
    }
}
