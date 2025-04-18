package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: classes4.dex */
public final class zzfkx {
    final /* synthetic */ zzfky zza;
    private final Object zzb;

    @Nullable
    private final String zzc;
    private final ListenableFuture zzd;
    private final List zze;
    private final ListenableFuture zzf;

    private zzfkx(zzfky zzfkyVar, Object obj, String str, ListenableFuture listenableFuture, List list, ListenableFuture listenableFuture2) {
        this.zza = zzfkyVar;
        this.zzb = obj;
        this.zzc = str;
        this.zzd = listenableFuture;
        this.zze = list;
        this.zzf = listenableFuture2;
    }

    public final zzfkl zza() {
        zzfkz zzfkzVar;
        Object obj = this.zzb;
        String str = this.zzc;
        if (str == null) {
            str = this.zza.zzf(obj);
        }
        final zzfkl zzfklVar = new zzfkl(obj, str, this.zzf);
        zzfkzVar = this.zza.zzd;
        zzfkzVar.zza(zzfklVar);
        ListenableFuture listenableFuture = this.zzd;
        Runnable runnable = new Runnable() { // from class: com.google.android.gms.internal.ads.zzfku
            @Override // java.lang.Runnable
            public final void run() {
                zzfkz zzfkzVar2;
                zzfkzVar2 = zzfkx.this.zza.zzd;
                zzfkzVar2.zzc(zzfklVar);
            }
        };
        zzgfz zzgfzVar = zzcan.zzf;
        listenableFuture.addListener(runnable, zzgfzVar);
        zzgfo.zzr(zzfklVar, new zzfkv(this, zzfklVar), zzgfzVar);
        return zzfklVar;
    }

    public final zzfkx zzb(Object obj) {
        return this.zza.zzb(obj, zza());
    }

    public final zzfkx zzc(Class cls, zzgev zzgevVar) {
        zzgfz zzgfzVar;
        zzgfzVar = this.zza.zzb;
        return new zzfkx(this.zza, this.zzb, this.zzc, this.zzd, this.zze, zzgfo.zzf(this.zzf, cls, zzgevVar, zzgfzVar));
    }

    public final zzfkx zzd(final ListenableFuture listenableFuture) {
        return zzg(new zzgev() { // from class: com.google.android.gms.internal.ads.zzfkt
            @Override // com.google.android.gms.internal.ads.zzgev
            public final ListenableFuture zza(Object obj) {
                return ListenableFuture.this;
            }
        }, zzcan.zzf);
    }

    public final zzfkx zze(final zzfkj zzfkjVar) {
        return zzf(new zzgev() { // from class: com.google.android.gms.internal.ads.zzfks
            @Override // com.google.android.gms.internal.ads.zzgev
            public final ListenableFuture zza(Object obj) {
                return zzgfo.zzh(zzfkj.this.zza(obj));
            }
        });
    }

    public final zzfkx zzf(zzgev zzgevVar) {
        zzgfz zzgfzVar;
        zzgfzVar = this.zza.zzb;
        return zzg(zzgevVar, zzgfzVar);
    }

    public final zzfkx zzg(zzgev zzgevVar, Executor executor) {
        return new zzfkx(this.zza, this.zzb, this.zzc, this.zzd, this.zze, zzgfo.zzn(this.zzf, zzgevVar, executor));
    }

    public final zzfkx zzh(String str) {
        return new zzfkx(this.zza, this.zzb, str, this.zzd, this.zze, this.zzf);
    }

    public final zzfkx zzi(long j2, TimeUnit timeUnit) {
        ScheduledExecutorService scheduledExecutorService;
        scheduledExecutorService = this.zza.zzc;
        return new zzfkx(this.zza, this.zzb, this.zzc, this.zzd, this.zze, zzgfo.zzo(this.zzf, j2, timeUnit, scheduledExecutorService));
    }
}
