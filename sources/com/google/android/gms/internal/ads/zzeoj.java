package com.google.android.gms.internal.ads;

import android.os.Bundle;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* loaded from: classes3.dex */
public final class zzeoj implements zzevz {
    private final ua.b zza;
    private final Executor zzb;
    private final ScheduledExecutorService zzc;

    public zzeoj(ua.b bVar, Executor executor, ScheduledExecutorService scheduledExecutorService) {
        this.zza = bVar;
        this.zzb = executor;
        this.zzc = scheduledExecutorService;
    }

    @Override // com.google.android.gms.internal.ads.zzevz
    public final int zza() {
        return 6;
    }

    @Override // com.google.android.gms.internal.ads.zzevz
    public final ua.b zzb() {
        ua.b zzn = zzgei.zzn(this.zza, new zzgdp() { // from class: com.google.android.gms.internal.ads.zzeof
            @Override // com.google.android.gms.internal.ads.zzgdp
            public final ua.b zza(Object obj) {
                final String str = (String) obj;
                return zzgei.zzh(new zzevy() { // from class: com.google.android.gms.internal.ads.zzeoe
                    @Override // com.google.android.gms.internal.ads.zzevy
                    public final void zzj(Object obj2) {
                        ((Bundle) obj2).putString("ms", str);
                    }
                });
            }
        }, this.zzb);
        if (((Integer) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzmg)).intValue() > 0) {
            zzn = zzgei.zzo(zzn, ((Integer) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(r1)).intValue(), TimeUnit.MILLISECONDS, this.zzc);
        }
        return zzgei.zzf(zzn, Throwable.class, new zzgdp() { // from class: com.google.android.gms.internal.ads.zzeog
            @Override // com.google.android.gms.internal.ads.zzgdp
            public final ua.b zza(Object obj) {
                if (((Throwable) obj) instanceof TimeoutException) {
                    return zzgei.zzh(new zzevy() { // from class: com.google.android.gms.internal.ads.zzeoh
                        @Override // com.google.android.gms.internal.ads.zzevy
                        public final void zzj(Object obj2) {
                            ((Bundle) obj2).putString("ms", Integer.toString(17));
                        }
                    });
                }
                return zzgei.zzh(new zzevy() { // from class: com.google.android.gms.internal.ads.zzeoi
                    @Override // com.google.android.gms.internal.ads.zzevy
                    public final void zzj(Object obj2) {
                        ((Bundle) obj2).putString("ms", null);
                    }
                });
            }
        }, this.zzb);
    }
}
