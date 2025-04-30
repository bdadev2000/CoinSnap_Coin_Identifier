package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
public final class zzfal implements zzexw {
    final zzgge zza;
    final String zzb;
    final zzcbm zzc;

    public zzfal(zzcbm zzcbmVar, zzgge zzggeVar, String str) {
        this.zzc = zzcbmVar;
        this.zza = zzggeVar;
        this.zzb = str;
    }

    @Override // com.google.android.gms.internal.ads.zzexw
    public final int zza() {
        return 47;
    }

    @Override // com.google.android.gms.internal.ads.zzexw
    public final f4.c zzb() {
        final f4.c zzh = zzgft.zzh(null);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzfX)).booleanValue()) {
            zzh = zzgft.zzh(null);
        }
        final f4.c zzh2 = zzgft.zzh(null);
        return zzgft.zzc(zzh, zzh2).zza(new Callable() { // from class: com.google.android.gms.internal.ads.zzfak
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return new zzfam((String) f4.c.this.get(), (String) zzh2.get());
            }
        }, zzcci.zza);
    }
}
