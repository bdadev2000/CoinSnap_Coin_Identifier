package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Looper;
import android.util.Pair;
import android.view.Surface;
import androidx.annotation.Nullable;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public final class zzaaa implements zzch {
    private static final Executor zza = new Executor() { // from class: com.google.android.gms.internal.ads.zzzn
        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
        }
    };
    private final Context zzb;
    private final zzzy zzc;
    private final zzaap zzd;
    private final zzaau zze;
    private final zzbq zzf;
    private final zzdc zzg;
    private final CopyOnWriteArraySet zzh;
    private zzad zzi;
    private zzaam zzj;
    private zzdm zzk;

    @Nullable
    private Pair zzl;
    private int zzm;
    private int zzn;

    public /* synthetic */ zzaaa(zzzp zzzpVar, zzzz zzzzVar) {
        Context zza2 = zzzp.zza(zzzpVar);
        this.zzb = zza2;
        zzzy zzzyVar = new zzzy(this, zza2);
        this.zzc = zzzyVar;
        zzdc zzc = zzzp.zzc(zzzpVar);
        this.zzg = zzc;
        zzaap zzf = zzzp.zzf(zzzpVar);
        this.zzd = zzf;
        zzf.zzk(zzc);
        this.zze = new zzaau(new zzzq(this, null), zzf);
        zzbq zzb = zzzp.zzb(zzzpVar);
        zzdb.zzb(zzb);
        this.zzf = zzb;
        CopyOnWriteArraySet copyOnWriteArraySet = new CopyOnWriteArraySet();
        this.zzh = copyOnWriteArraySet;
        this.zzn = 0;
        copyOnWriteArraySet.add(zzzyVar);
    }

    public static /* bridge */ /* synthetic */ zzcg zzd(zzaaa zzaaaVar, zzad zzadVar) {
        boolean z10;
        if (zzaaaVar.zzn == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        zzdb.zzf(z10);
        zzm zzw = zzw(zzadVar.zzB);
        if (zzw.zzd == 7 && zzen.zza < 34) {
            zzk zzc = zzw.zzc();
            zzc.zzd(6);
            zzw = zzc.zzg();
        }
        zzm zzmVar = zzw;
        zzdc zzdcVar = zzaaaVar.zzg;
        Looper myLooper = Looper.myLooper();
        zzdb.zzb(myLooper);
        final zzdm zzd = zzdcVar.zzd(myLooper, null);
        zzaaaVar.zzk = zzd;
        try {
            zzbq zzbqVar = zzaaaVar.zzf;
            Context context = zzaaaVar.zzb;
            zzp zzpVar = zzp.zza;
            Objects.requireNonNull(zzd);
            zzbqVar.zza(context, zzmVar, zzpVar, zzaaaVar, new Executor() { // from class: com.google.android.gms.internal.ads.zzzm
                @Override // java.util.concurrent.Executor
                public final void execute(Runnable runnable) {
                    zzdm.this.zzh(runnable);
                }
            }, zzfzo.zzn(), 0L);
            Pair pair = zzaaaVar.zzl;
            if (pair != null) {
                zzee zzeeVar = (zzee) pair.second;
                zzeeVar.zzb();
                zzeeVar.zza();
                throw null;
            }
            throw null;
        } catch (zzce e2) {
            throw new zzabk(e2, zzadVar);
        }
    }

    public static /* synthetic */ void zzk(zzaaa zzaaaVar) {
        int i10 = zzaaaVar.zzm - 1;
        zzaaaVar.zzm = i10;
        if (i10 > 0) {
            return;
        }
        if (i10 >= 0) {
            zzaaaVar.zze.zza();
            return;
        }
        throw new IllegalStateException(String.valueOf(i10));
    }

    public static /* bridge */ /* synthetic */ void zzm(final zzaaa zzaaaVar) {
        if (zzaaaVar.zzn == 1) {
            zzaaaVar.zzm++;
            zzaaaVar.zze.zza();
            zzdm zzdmVar = zzaaaVar.zzk;
            zzdb.zzb(zzdmVar);
            zzdmVar.zzh(new Runnable() { // from class: com.google.android.gms.internal.ads.zzzo
                @Override // java.lang.Runnable
                public final void run() {
                    zzaaa.zzk(zzaaa.this);
                }
            });
        }
    }

    public static /* bridge */ /* synthetic */ void zzo(zzaaa zzaaaVar, long j3, long j10) {
        if (zzaaaVar.zzm == 0) {
            zzaaaVar.zze.zzc(j3, j10);
        }
    }

    public static /* bridge */ /* synthetic */ boolean zzu(zzaaa zzaaaVar, long j3) {
        return zzaaaVar.zzm == 0 && zzaaaVar.zze.zze(j3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static zzm zzw(@Nullable zzm zzmVar) {
        return (zzmVar == null || !zzmVar.zzf()) ? zzm.zza : zzmVar;
    }

    public final zzabl zzh() {
        return this.zzc;
    }

    public final void zzr() {
        zzee zzeeVar = zzee.zza;
        zzeeVar.zzb();
        zzeeVar.zza();
        this.zzl = null;
    }

    public final void zzs() {
        if (this.zzn == 2) {
            return;
        }
        zzdm zzdmVar = this.zzk;
        if (zzdmVar != null) {
            zzdmVar.zze(null);
        }
        this.zzl = null;
        this.zzn = 2;
    }

    public final void zzt(Surface surface, zzee zzeeVar) {
        Pair pair = this.zzl;
        if (pair != null && ((Surface) pair.first).equals(surface) && ((zzee) this.zzl.second).equals(zzeeVar)) {
            return;
        }
        this.zzl = Pair.create(surface, zzeeVar);
        zzeeVar.zzb();
        zzeeVar.zza();
    }
}
