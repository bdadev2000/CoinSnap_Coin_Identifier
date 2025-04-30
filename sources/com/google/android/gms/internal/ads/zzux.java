package com.google.android.gms.internal.ads;

import java.util.List;

/* loaded from: classes2.dex */
final class zzux implements zzxh {
    private final zzxh zza;
    private final zzgbc zzb;

    public zzux(zzxh zzxhVar, List list) {
        this.zza = zzxhVar;
        this.zzb = zzgbc.zzk(list);
    }

    public final zzgbc zza() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzxh
    public final long zzb() {
        return this.zza.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzxh
    public final long zzc() {
        return this.zza.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzxh
    public final void zzm(long j7) {
        this.zza.zzm(j7);
    }

    @Override // com.google.android.gms.internal.ads.zzxh
    public final boolean zzo(zzlo zzloVar) {
        return this.zza.zzo(zzloVar);
    }

    @Override // com.google.android.gms.internal.ads.zzxh
    public final boolean zzp() {
        return this.zza.zzp();
    }
}
