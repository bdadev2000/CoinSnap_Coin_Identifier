package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
final class zzxt extends zzyf implements Comparable {
    private final int zze;
    private final int zzf;

    public zzxt(int i2, zzcd zzcdVar, int i3, zzxy zzxyVar, int i4) {
        super(i2, zzcdVar, i3);
        this.zze = zzls.zza(i4, zzxyVar.zzN) ? 1 : 0;
        this.zzf = this.zzd.zza();
    }

    @Override // java.lang.Comparable
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final int compareTo(zzxt zzxtVar) {
        return Integer.compare(this.zzf, zzxtVar.zzf);
    }

    @Override // com.google.android.gms.internal.ads.zzyf
    public final int zzb() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzyf
    public final /* bridge */ /* synthetic */ boolean zzc(zzyf zzyfVar) {
        return false;
    }
}
