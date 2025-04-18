package com.google.android.gms.internal.ads;

import java.util.List;

/* loaded from: classes3.dex */
final class zzua implements zzwi {
    private final zzwi zza;
    private final zzfzo zzb;

    public zzua(zzwi zzwiVar, List list) {
        this.zza = zzwiVar;
        this.zzb = zzfzo.zzl(list);
    }

    public final zzfzo zza() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzwi
    public final long zzb() {
        return this.zza.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzwi
    public final long zzc() {
        return this.zza.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzwi
    public final void zzm(long j3) {
        this.zza.zzm(j3);
    }

    @Override // com.google.android.gms.internal.ads.zzwi
    public final boolean zzo(zzko zzkoVar) {
        return this.zza.zzo(zzkoVar);
    }

    @Override // com.google.android.gms.internal.ads.zzwi
    public final boolean zzp() {
        return this.zza.zzp();
    }
}
