package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public final class zzezz implements zzexw {
    private final Context zza;
    private final zzcby zzb;
    private final ScheduledExecutorService zzc;
    private final Executor zzd;
    private final String zze;
    private final zzcbp zzf;

    public zzezz(zzcbp zzcbpVar, int i9, Context context, zzcby zzcbyVar, ScheduledExecutorService scheduledExecutorService, Executor executor, String str) {
        this.zzf = zzcbpVar;
        this.zza = context;
        this.zzb = zzcbyVar;
        this.zzc = scheduledExecutorService;
        this.zzd = executor;
        this.zze = str;
    }

    @Override // com.google.android.gms.internal.ads.zzexw
    public final int zza() {
        return 44;
    }

    @Override // com.google.android.gms.internal.ads.zzexw
    public final f4.c zzb() {
        return zzgft.zze((zzgfk) zzgft.zzo(zzgft.zzm(zzgfk.zzu(zzgft.zzk(new zzgez() { // from class: com.google.android.gms.internal.ads.zzezw
            @Override // com.google.android.gms.internal.ads.zzgez
            public final f4.c zza() {
                return zzgft.zzh(null);
            }
        }, this.zzd)), new zzfxu() { // from class: com.google.android.gms.internal.ads.zzezx
            @Override // com.google.android.gms.internal.ads.zzfxu
            public final Object apply(Object obj) {
                String str = (String) obj;
                if (str == null) {
                    return null;
                }
                return new zzfaa(str);
            }
        }, this.zzd), ((Long) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzaW)).longValue(), TimeUnit.MILLISECONDS, this.zzc), Exception.class, new zzfxu() { // from class: com.google.android.gms.internal.ads.zzezy
            @Override // com.google.android.gms.internal.ads.zzfxu
            public final Object apply(Object obj) {
                zzezz.this.zzc((Exception) obj);
                return null;
            }
        }, zzggk.zzb());
    }

    public final /* synthetic */ zzfaa zzc(Exception exc) {
        this.zzb.zzw(exc, "AttestationTokenSignal");
        return null;
    }
}
