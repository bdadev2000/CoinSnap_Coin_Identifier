package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public final class zzflk {
    final /* synthetic */ zzfll zza;
    private final Object zzb;

    @Nullable
    private final String zzc;
    private final f4.c zzd;
    private final List zze;
    private final f4.c zzf;

    private zzflk(zzfll zzfllVar, Object obj, String str, f4.c cVar, List list, f4.c cVar2) {
        this.zza = zzfllVar;
        this.zzb = obj;
        this.zzc = str;
        this.zzd = cVar;
        this.zze = list;
        this.zzf = cVar2;
    }

    public final zzfky zza() {
        zzflm zzflmVar;
        Object obj = this.zzb;
        String str = this.zzc;
        if (str == null) {
            str = this.zza.zzf(obj);
        }
        final zzfky zzfkyVar = new zzfky(obj, str, this.zzf);
        zzflmVar = this.zza.zzd;
        zzflmVar.zza(zzfkyVar);
        f4.c cVar = this.zzd;
        Runnable runnable = new Runnable() { // from class: com.google.android.gms.internal.ads.zzflh
            @Override // java.lang.Runnable
            public final void run() {
                zzflm zzflmVar2;
                zzflmVar2 = zzflk.this.zza.zzd;
                zzflmVar2.zzc(zzfkyVar);
            }
        };
        zzgge zzggeVar = zzcci.zzf;
        cVar.addListener(runnable, zzggeVar);
        zzgft.zzr(zzfkyVar, new zzfli(this, zzfkyVar), zzggeVar);
        return zzfkyVar;
    }

    public final zzflk zzb(Object obj) {
        return this.zza.zzb(obj, zza());
    }

    public final zzflk zzc(Class cls, zzgfa zzgfaVar) {
        zzgge zzggeVar;
        zzggeVar = this.zza.zzb;
        return new zzflk(this.zza, this.zzb, this.zzc, this.zzd, this.zze, zzgft.zzf(this.zzf, cls, zzgfaVar, zzggeVar));
    }

    public final zzflk zzd(final f4.c cVar) {
        return zzg(new zzgfa() { // from class: com.google.android.gms.internal.ads.zzflg
            @Override // com.google.android.gms.internal.ads.zzgfa
            public final f4.c zza(Object obj) {
                return f4.c.this;
            }
        }, zzcci.zzf);
    }

    public final zzflk zze(final zzfkw zzfkwVar) {
        return zzf(new zzgfa() { // from class: com.google.android.gms.internal.ads.zzflf
            @Override // com.google.android.gms.internal.ads.zzgfa
            public final f4.c zza(Object obj) {
                return zzgft.zzh(zzfkw.this.zza(obj));
            }
        });
    }

    public final zzflk zzf(zzgfa zzgfaVar) {
        zzgge zzggeVar;
        zzggeVar = this.zza.zzb;
        return zzg(zzgfaVar, zzggeVar);
    }

    public final zzflk zzg(zzgfa zzgfaVar, Executor executor) {
        return new zzflk(this.zza, this.zzb, this.zzc, this.zzd, this.zze, zzgft.zzn(this.zzf, zzgfaVar, executor));
    }

    public final zzflk zzh(String str) {
        return new zzflk(this.zza, this.zzb, str, this.zzd, this.zze, this.zzf);
    }

    public final zzflk zzi(long j7, TimeUnit timeUnit) {
        ScheduledExecutorService scheduledExecutorService;
        scheduledExecutorService = this.zza.zzc;
        return new zzflk(this.zza, this.zzb, this.zzc, this.zzd, this.zze, zzgft.zzo(this.zzf, j7, timeUnit, scheduledExecutorService));
    }
}
