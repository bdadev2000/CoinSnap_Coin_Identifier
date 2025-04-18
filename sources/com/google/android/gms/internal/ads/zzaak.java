package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Looper;
import android.util.Pair;
import android.view.Surface;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.Executor;

@RestrictTo
/* loaded from: classes3.dex */
public final class zzaak implements zzco {
    private static final Executor zza = new Executor() { // from class: com.google.android.gms.internal.ads.zzzv
        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
        }
    };
    private final Context zzb;
    private final zzaai zzc;
    private final zzaaz zzd;
    private final zzabe zze;
    private final zzbx zzf;
    private final zzdj zzg;
    private final CopyOnWriteArraySet zzh;
    private zzaf zzi;
    private zzaaw zzj;
    private zzdt zzk;

    @Nullable
    private Pair zzl;
    private int zzm;
    private int zzn;

    public /* synthetic */ zzaak(zzzx zzzxVar, zzaaj zzaajVar) {
        Context zza2 = zzzx.zza(zzzxVar);
        this.zzb = zza2;
        zzaai zzaaiVar = new zzaai(this, zza2);
        this.zzc = zzaaiVar;
        zzdj zzc = zzzx.zzc(zzzxVar);
        this.zzg = zzc;
        zzaaz zzf = zzzx.zzf(zzzxVar);
        this.zzd = zzf;
        zzf.zzk(zzc);
        this.zze = new zzabe(new zzzz(this, null), zzf);
        zzbx zzb = zzzx.zzb(zzzxVar);
        zzdi.zzb(zzb);
        this.zzf = zzb;
        CopyOnWriteArraySet copyOnWriteArraySet = new CopyOnWriteArraySet();
        this.zzh = copyOnWriteArraySet;
        this.zzn = 0;
        copyOnWriteArraySet.add(zzaaiVar);
    }

    public static /* bridge */ /* synthetic */ zzcn zzd(zzaak zzaakVar, zzaf zzafVar) {
        zzdi.zzf(zzaakVar.zzn == 0);
        zzo zzw = zzw(zzafVar.zzA);
        if (zzw.zzd == 7 && zzeu.zza < 34) {
            zzm zzc = zzw.zzc();
            zzc.zzd(6);
            zzw = zzc.zzg();
        }
        zzo zzoVar = zzw;
        zzdj zzdjVar = zzaakVar.zzg;
        Looper myLooper = Looper.myLooper();
        zzdi.zzb(myLooper);
        final zzdt zzd = zzdjVar.zzd(myLooper, null);
        zzaakVar.zzk = zzd;
        try {
            zzbx zzbxVar = zzaakVar.zzf;
            Context context = zzaakVar.zzb;
            zzr zzrVar = zzr.zza;
            Objects.requireNonNull(zzd);
            zzbxVar.zza(context, zzoVar, zzrVar, zzaakVar, new Executor() { // from class: com.google.android.gms.internal.ads.zzzu
                @Override // java.util.concurrent.Executor
                public final void execute(Runnable runnable) {
                    zzdt.this.zzh(runnable);
                }
            }, zzgax.zzn(), 0L);
            Pair pair = zzaakVar.zzl;
            if (pair == null) {
                throw null;
            }
            zzel zzelVar = (zzel) pair.second;
            zzelVar.zzb();
            zzelVar.zza();
            throw null;
        } catch (zzcl e) {
            throw new zzabu(e, zzafVar);
        }
    }

    public static /* synthetic */ void zzk(zzaak zzaakVar) {
        int i2 = zzaakVar.zzm - 1;
        zzaakVar.zzm = i2;
        if (i2 > 0) {
            return;
        }
        if (i2 < 0) {
            throw new IllegalStateException(String.valueOf(i2));
        }
        zzaakVar.zze.zza();
    }

    public static /* bridge */ /* synthetic */ void zzm(final zzaak zzaakVar) {
        if (zzaakVar.zzn == 1) {
            zzaakVar.zzm++;
            zzaakVar.zze.zza();
            zzdt zzdtVar = zzaakVar.zzk;
            zzdi.zzb(zzdtVar);
            zzdtVar.zzh(new Runnable() { // from class: com.google.android.gms.internal.ads.zzzw
                @Override // java.lang.Runnable
                public final void run() {
                    zzaak.zzk(zzaak.this);
                }
            });
        }
    }

    public static /* bridge */ /* synthetic */ void zzo(zzaak zzaakVar, long j2, long j3) {
        if (zzaakVar.zzm == 0) {
            zzaakVar.zze.zzc(j2, j3);
        }
    }

    public static /* bridge */ /* synthetic */ boolean zzu(zzaak zzaakVar, long j2) {
        return zzaakVar.zzm == 0 && zzaakVar.zze.zze(j2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static zzo zzw(@Nullable zzo zzoVar) {
        return (zzoVar == null || !zzoVar.zzf()) ? zzo.zza : zzoVar;
    }

    public final zzabv zzh() {
        return this.zzc;
    }

    public final void zzr() {
        zzel zzelVar = zzel.zza;
        zzelVar.zzb();
        zzelVar.zza();
        this.zzl = null;
    }

    public final void zzs() {
        if (this.zzn == 2) {
            return;
        }
        zzdt zzdtVar = this.zzk;
        if (zzdtVar != null) {
            zzdtVar.zze(null);
        }
        this.zzl = null;
        this.zzn = 2;
    }

    public final void zzt(Surface surface, zzel zzelVar) {
        Pair pair = this.zzl;
        if (pair != null && ((Surface) pair.first).equals(surface) && ((zzel) this.zzl.second).equals(zzelVar)) {
            return;
        }
        this.zzl = Pair.create(surface, zzelVar);
        zzelVar.zzb();
        zzelVar.zza();
    }
}
