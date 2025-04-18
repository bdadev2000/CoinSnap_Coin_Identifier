package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

/* loaded from: classes3.dex */
public final class zzepe implements zzevz {
    private final zzges zza;
    private final zzffo zzb;
    private final zzcad zzc;

    public zzepe(zzges zzgesVar, zzffo zzffoVar, zzcad zzcadVar) {
        this.zza = zzgesVar;
        this.zzb = zzffoVar;
        this.zzc = zzcadVar;
    }

    @Override // com.google.android.gms.internal.ads.zzevz
    public final int zza() {
        return 9;
    }

    @Override // com.google.android.gms.internal.ads.zzevz
    public final ua.b zzb() {
        return this.zza.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzepd
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzepe.this.zzc();
            }
        });
    }

    public final /* synthetic */ zzepf zzc() throws Exception {
        return new zzepf(this.zzb.zzj, this.zzc.zzm());
    }
}
