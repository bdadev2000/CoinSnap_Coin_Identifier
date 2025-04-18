package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzafu implements zzade {
    private final long zzb;
    private final zzade zzc;

    public zzafu(long j2, zzade zzadeVar) {
        this.zzb = j2;
        this.zzc = zzadeVar;
    }

    @Override // com.google.android.gms.internal.ads.zzade
    public final void zzD() {
        this.zzc.zzD();
    }

    @Override // com.google.android.gms.internal.ads.zzade
    public final void zzO(zzaea zzaeaVar) {
        this.zzc.zzO(new zzaft(this, zzaeaVar, zzaeaVar));
    }

    @Override // com.google.android.gms.internal.ads.zzade
    public final zzaeh zzw(int i2, int i3) {
        return this.zzc.zzw(i2, i3);
    }
}
