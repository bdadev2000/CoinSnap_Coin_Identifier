package com.google.android.gms.internal.ads;

import android.os.Bundle;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* loaded from: classes2.dex */
public final class zzequ implements zzexw {
    private final f4.c zza;
    private final Executor zzb;
    private final ScheduledExecutorService zzc;

    public zzequ(f4.c cVar, Executor executor, ScheduledExecutorService scheduledExecutorService) {
        this.zza = cVar;
        this.zzb = executor;
        this.zzc = scheduledExecutorService;
    }

    @Override // com.google.android.gms.internal.ads.zzexw
    public final int zza() {
        return 6;
    }

    @Override // com.google.android.gms.internal.ads.zzexw
    public final f4.c zzb() {
        f4.c zzn = zzgft.zzn(this.zza, new zzgfa() { // from class: com.google.android.gms.internal.ads.zzeqq
            @Override // com.google.android.gms.internal.ads.zzgfa
            public final f4.c zza(Object obj) {
                final String str = (String) obj;
                return zzgft.zzh(new zzexv() { // from class: com.google.android.gms.internal.ads.zzeqp
                    @Override // com.google.android.gms.internal.ads.zzexv
                    public final void zzj(Object obj2) {
                        ((Bundle) obj2).putString("ms", str);
                    }
                });
            }
        }, this.zzb);
        if (((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzmv)).intValue() > 0) {
            zzn = zzgft.zzo(zzn, ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zza(r1)).intValue(), TimeUnit.MILLISECONDS, this.zzc);
        }
        return zzgft.zzf(zzn, Throwable.class, new zzgfa() { // from class: com.google.android.gms.internal.ads.zzeqr
            @Override // com.google.android.gms.internal.ads.zzgfa
            public final f4.c zza(Object obj) {
                if (((Throwable) obj) instanceof TimeoutException) {
                    return zzgft.zzh(new zzexv() { // from class: com.google.android.gms.internal.ads.zzeqs
                        @Override // com.google.android.gms.internal.ads.zzexv
                        public final void zzj(Object obj2) {
                            ((Bundle) obj2).putString("ms", Integer.toString(17));
                        }
                    });
                }
                return zzgft.zzh(new zzexv() { // from class: com.google.android.gms.internal.ads.zzeqt
                    @Override // com.google.android.gms.internal.ads.zzexv
                    public final void zzj(Object obj2) {
                        ((Bundle) obj2).putString("ms", null);
                    }
                });
            }
        }, this.zzb);
    }
}
