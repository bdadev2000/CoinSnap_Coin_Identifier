package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

/* loaded from: classes3.dex */
public final class zzeyi implements zzevz {
    public zzeyi(zzbzn zzbznVar, zzges zzgesVar, String str) {
    }

    @Override // com.google.android.gms.internal.ads.zzevz
    public final int zza() {
        return 47;
    }

    @Override // com.google.android.gms.internal.ads.zzevz
    public final ua.b zzb() {
        final ua.b zzh = zzgei.zzh(null);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzfK)).booleanValue()) {
            zzh = zzgei.zzh(null);
        }
        final ua.b zzh2 = zzgei.zzh(null);
        return zzgei.zzc(zzh, zzh2).zza(new Callable() { // from class: com.google.android.gms.internal.ads.zzeyh
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return new zzeyj((String) ua.b.this.get(), (String) zzh2.get());
            }
        }, zzcaj.zza);
    }
}
