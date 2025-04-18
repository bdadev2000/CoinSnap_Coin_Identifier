package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.AdFormat;
import java.util.Optional;
import java.util.function.Consumer;

/* loaded from: classes3.dex */
public final class zzfmd {
    private final zzdsm zza;

    public zzfmd(zzdsm zzdsmVar) {
        this.zza = zzdsmVar;
    }

    public final void zza(AdFormat adFormat, long j3, Optional optional) {
        final zzdsl zza = this.zza.zza();
        zza.zzb("plaac_ts", Long.toString(j3));
        zza.zzb("ad_format", adFormat.name());
        zza.zzb("action", "is_ad_available");
        optional.ifPresent(new Consumer() { // from class: com.google.android.gms.internal.ads.zzfmc
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                zzdsl.this.zzb("plaay_ts", Long.toString(((Long) obj).longValue()));
            }
        });
        zza.zzf();
    }
}
