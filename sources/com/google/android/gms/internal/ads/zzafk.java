package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
public final class zzafk implements zzacu {
    private final long zzb;
    private final zzacu zzc;

    public zzafk(long j3, zzacu zzacuVar) {
        this.zzb = j3;
        this.zzc = zzacuVar;
    }

    @Override // com.google.android.gms.internal.ads.zzacu
    public final void zzD() {
        this.zzc.zzD();
    }

    @Override // com.google.android.gms.internal.ads.zzacu
    public final void zzO(zzadq zzadqVar) {
        this.zzc.zzO(new zzafj(this, zzadqVar, zzadqVar));
    }

    @Override // com.google.android.gms.internal.ads.zzacu
    public final zzadx zzw(int i10, int i11) {
        return this.zzc.zzw(i10, i11);
    }
}
