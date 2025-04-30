package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzagp implements zzadx {
    private final long zzb;
    private final zzadx zzc;

    public zzagp(long j7, zzadx zzadxVar) {
        this.zzb = j7;
        this.zzc = zzadxVar;
    }

    @Override // com.google.android.gms.internal.ads.zzadx
    public final void zzD() {
        this.zzc.zzD();
    }

    @Override // com.google.android.gms.internal.ads.zzadx
    public final void zzO(zzaet zzaetVar) {
        this.zzc.zzO(new zzago(this, zzaetVar, zzaetVar));
    }

    @Override // com.google.android.gms.internal.ads.zzadx
    public final zzafa zzw(int i9, int i10) {
        return this.zzc.zzw(i9, i10);
    }
}
