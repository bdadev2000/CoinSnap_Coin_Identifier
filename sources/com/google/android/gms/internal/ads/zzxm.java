package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
final class zzxm extends zzxw implements Comparable {
    private final int zze;
    private final int zzf;

    public zzxm(int i10, zzbw zzbwVar, int i11, zzxp zzxpVar, int i12) {
        super(i10, zzbwVar, i11);
        this.zze = zzlo.zza(i12, zzxpVar.zzN) ? 1 : 0;
        this.zzf = this.zzd.zza();
    }

    @Override // java.lang.Comparable
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final int compareTo(zzxm zzxmVar) {
        return Integer.compare(this.zzf, zzxmVar.zzf);
    }

    @Override // com.google.android.gms.internal.ads.zzxw
    public final int zzb() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzxw
    public final /* bridge */ /* synthetic */ boolean zzc(zzxw zzxwVar) {
        return false;
    }
}
