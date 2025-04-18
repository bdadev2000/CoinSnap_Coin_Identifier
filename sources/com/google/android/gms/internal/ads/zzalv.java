package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
final class zzalv implements Comparable {
    public final int zza;
    public final zzalq zzb;

    public zzalv(int i10, zzalq zzalqVar) {
        this.zza = i10;
        this.zzb = zzalqVar;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return Integer.compare(this.zza, ((zzalv) obj).zza);
    }
}
