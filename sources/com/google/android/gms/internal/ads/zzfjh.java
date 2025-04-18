package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public final class zzfjh {
    final /* synthetic */ zzfjj zza;
    private final Object zzb;

    @Nullable
    private final String zzc;
    private final ua.b zzd;
    private final List zze;
    private final ua.b zzf;

    private zzfjh(zzfjj zzfjjVar, Object obj, String str, ua.b bVar, List list, ua.b bVar2) {
        this.zza = zzfjjVar;
        this.zzb = obj;
        this.zzc = str;
        this.zzd = bVar;
        this.zze = list;
        this.zzf = bVar2;
    }

    public final zzfix zza() {
        zzfjk zzfjkVar;
        Object obj = this.zzb;
        String str = this.zzc;
        if (str == null) {
            str = this.zza.zzf(obj);
        }
        final zzfix zzfixVar = new zzfix(obj, str, this.zzf);
        zzfjkVar = this.zza.zzd;
        zzfjkVar.zza(zzfixVar);
        ua.b bVar = this.zzd;
        Runnable runnable = new Runnable() { // from class: com.google.android.gms.internal.ads.zzfjf
            @Override // java.lang.Runnable
            public final void run() {
                zzfjk zzfjkVar2;
                zzfjkVar2 = zzfjh.this.zza.zzd;
                zzfjkVar2.zzc(zzfixVar);
            }
        };
        zzges zzgesVar = zzcaj.zzf;
        bVar.addListener(runnable, zzgesVar);
        zzgei.zzr(zzfixVar, new zzfjg(this, zzfixVar), zzgesVar);
        return zzfixVar;
    }

    public final zzfjh zzb(Object obj) {
        return this.zza.zzb(obj, zza());
    }

    public final zzfjh zzc(Class cls, zzgdp zzgdpVar) {
        zzges zzgesVar;
        zzgesVar = this.zza.zzb;
        return new zzfjh(this.zza, this.zzb, this.zzc, this.zzd, this.zze, zzgei.zzf(this.zzf, cls, zzgdpVar, zzgesVar));
    }

    public final zzfjh zzd(final ua.b bVar) {
        return zzg(new zzgdp() { // from class: com.google.android.gms.internal.ads.zzfje
            @Override // com.google.android.gms.internal.ads.zzgdp
            public final ua.b zza(Object obj) {
                return ua.b.this;
            }
        }, zzcaj.zzf);
    }

    public final zzfjh zze(final zzfiv zzfivVar) {
        return zzf(new zzgdp() { // from class: com.google.android.gms.internal.ads.zzfjd
            @Override // com.google.android.gms.internal.ads.zzgdp
            public final ua.b zza(Object obj) {
                return zzgei.zzh(zzfiv.this.zza(obj));
            }
        });
    }

    public final zzfjh zzf(zzgdp zzgdpVar) {
        zzges zzgesVar;
        zzgesVar = this.zza.zzb;
        return zzg(zzgdpVar, zzgesVar);
    }

    public final zzfjh zzg(zzgdp zzgdpVar, Executor executor) {
        return new zzfjh(this.zza, this.zzb, this.zzc, this.zzd, this.zze, zzgei.zzn(this.zzf, zzgdpVar, executor));
    }

    public final zzfjh zzh(String str) {
        return new zzfjh(this.zza, this.zzb, str, this.zzd, this.zze, this.zzf);
    }

    public final zzfjh zzi(long j3, TimeUnit timeUnit) {
        ScheduledExecutorService scheduledExecutorService;
        scheduledExecutorService = this.zza.zzc;
        return new zzfjh(this.zza, this.zzb, this.zzc, this.zzd, this.zze, zzgei.zzo(this.zzf, j3, timeUnit, scheduledExecutorService));
    }
}
