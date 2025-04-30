package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public final class zzesu implements zzexw {
    private final AtomicReference zza = new AtomicReference();
    private final Clock zzb;
    private final zzexw zzc;
    private final long zzd;

    public zzesu(zzexw zzexwVar, long j7, Clock clock) {
        this.zzb = clock;
        this.zzc = zzexwVar;
        this.zzd = j7;
    }

    @Override // com.google.android.gms.internal.ads.zzexw
    public final int zza() {
        return 16;
    }

    @Override // com.google.android.gms.internal.ads.zzexw
    public final f4.c zzb() {
        zzest zzestVar = (zzest) this.zza.get();
        if (zzestVar == null || zzestVar.zza()) {
            zzexw zzexwVar = this.zzc;
            zzest zzestVar2 = new zzest(zzexwVar.zzb(), this.zzd, this.zzb);
            this.zza.set(zzestVar2);
            zzestVar = zzestVar2;
        }
        return zzestVar.zza;
    }
}
