package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Looper;
import android.util.Pair;
import android.view.Surface;
import androidx.annotation.Nullable;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final class zzabc implements zzacn, zzdt, zzabv {
    private static final Executor zza = new Executor() { // from class: com.google.android.gms.internal.ads.zzaao
        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
        }
    };
    private final Context zzb;
    private final zzaba zzc;
    private final zzcu zzd;
    private final CopyOnWriteArraySet zze;
    private zzer zzf;
    private zzabq zzg;
    private zzabw zzh;
    private zzan zzi;
    private zzabn zzj;
    private zzfb zzk;
    private zzcv zzl;

    @Nullable
    private Pair zzm;
    private int zzn;
    private int zzo;
    private float zzp;

    public /* synthetic */ zzabc(zzaar zzaarVar, zzabb zzabbVar) {
        Context context;
        zzcu zzcuVar;
        context = zzaarVar.zza;
        this.zzb = context;
        zzaba zzabaVar = new zzaba(this, context);
        this.zzc = zzabaVar;
        zzcuVar = zzaarVar.zzc;
        zzeq.zzb(zzcuVar);
        this.zzd = zzcuVar;
        CopyOnWriteArraySet copyOnWriteArraySet = new CopyOnWriteArraySet();
        this.zze = copyOnWriteArraySet;
        this.zzo = 0;
        this.zzp = 1.0f;
        copyOnWriteArraySet.add(zzabaVar);
    }

    public static /* bridge */ /* synthetic */ zzds zzb(zzabc zzabcVar, zzan zzanVar, zzer zzerVar) {
        boolean z8;
        boolean z9 = true;
        if (zzabcVar.zzo == 0) {
            z8 = true;
        } else {
            z8 = false;
        }
        zzeq.zzf(z8);
        if (zzabcVar.zzh == null || zzabcVar.zzg == null) {
            z9 = false;
        }
        zzeq.zzf(z9);
        zzabcVar.zzf = zzerVar;
        Looper myLooper = Looper.myLooper();
        zzeq.zzb(myLooper);
        zzabcVar.zzk = zzerVar.zzb(myLooper, null);
        zzt zzu = zzu(zzanVar.zzz);
        if (zzu.zzf == 7 && zzgd.zza < 34) {
            zzr zzc = zzu.zzc();
            zzc.zzd(6);
            zzu = zzc.zzg();
        }
        zzt zztVar = zzu;
        try {
            zzcu zzcuVar = zzabcVar.zzd;
            Context context = zzabcVar.zzb;
            zzw zzwVar = zzw.zza;
            final zzfb zzfbVar = zzabcVar.zzk;
            Objects.requireNonNull(zzfbVar);
            zzabcVar.zzl = zzcuVar.zza(context, zztVar, zzwVar, zzabcVar, new Executor() { // from class: com.google.android.gms.internal.ads.zzaap
                @Override // java.util.concurrent.Executor
                public final void execute(Runnable runnable) {
                    zzfb.this.zzh(runnable);
                }
            }, zzgbc.zzm(), 0L);
            Pair pair = zzabcVar.zzm;
            if (pair != null) {
                zzfv zzfvVar = (zzfv) pair.second;
                zzfvVar.zzb();
                zzfvVar.zza();
                throw null;
            }
            throw null;
        } catch (zzdq e4) {
            throw new zzacl(e4, zzanVar);
        }
    }

    public static /* synthetic */ void zzf(zzabc zzabcVar) {
        int i9 = zzabcVar.zzn - 1;
        zzabcVar.zzn = i9;
        if (i9 > 0) {
            return;
        }
        if (i9 >= 0) {
            zzabw zzabwVar = zzabcVar.zzh;
            zzeq.zzb(zzabwVar);
            zzabwVar.zza();
            return;
        }
        throw new IllegalStateException(String.valueOf(i9));
    }

    public static /* bridge */ /* synthetic */ void zzg(zzabc zzabcVar) {
        if (!zzabcVar.zzv()) {
            return;
        }
        zzabcVar.zzn++;
        zzabw zzabwVar = zzabcVar.zzh;
        zzeq.zzb(zzabwVar);
        zzabwVar.zza();
        zzfb zzfbVar = zzabcVar.zzk;
        zzeq.zzb(zzfbVar);
        zzfbVar.zzh(new Runnable() { // from class: com.google.android.gms.internal.ads.zzaaq
            @Override // java.lang.Runnable
            public final void run() {
                zzabc.zzf(zzabc.this);
            }
        });
    }

    public static /* bridge */ /* synthetic */ void zzh(zzabc zzabcVar, long j7, long j9) {
        zzabw zzabwVar = zzabcVar.zzh;
        zzeq.zzb(zzabwVar);
        zzabwVar.zzb(j7, j9);
    }

    public static /* bridge */ /* synthetic */ void zzi(zzabc zzabcVar, float f9) {
        zzabcVar.zzp = f9;
        zzabw zzabwVar = zzabcVar.zzh;
        if (zzabwVar != null) {
            zzabwVar.zzd(f9);
        }
    }

    public static /* synthetic */ void zzj(zzabc zzabcVar, zzabn zzabnVar) {
        zzabcVar.zzj = zzabnVar;
    }

    public static /* bridge */ /* synthetic */ boolean zzt(zzabc zzabcVar, long j7) {
        if (zzabcVar.zzn == 0) {
            zzabw zzabwVar = zzabcVar.zzh;
            zzeq.zzb(zzabwVar);
            if (zzabwVar.zze(j7)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static zzt zzu(@Nullable zzt zztVar) {
        if (zztVar != null && zztVar.zzf()) {
            return zztVar;
        }
        return zzt.zza;
    }

    private final boolean zzv() {
        return this.zzo == 1;
    }

    @Override // com.google.android.gms.internal.ads.zzacn
    @Nullable
    public final zzabq zzc() {
        return this.zzg;
    }

    @Override // com.google.android.gms.internal.ads.zzacn
    public final zzacm zzd() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzacn
    public final void zzk() {
        zzfv zzfvVar = zzfv.zza;
        zzfvVar.zzb();
        zzfvVar.zza();
        this.zzm = null;
    }

    @Override // com.google.android.gms.internal.ads.zzabv
    public final void zzl() {
        Iterator it = this.zze.iterator();
        while (it.hasNext()) {
            ((zzaas) it.next()).zzb(this);
        }
        zzeq.zzb(null);
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzabv
    public final void zzm(zzdv zzdvVar) {
        zzal zzalVar = new zzal();
        zzalVar.zzac(zzdvVar.zzc);
        zzalVar.zzI(zzdvVar.zzd);
        zzalVar.zzX("video/raw");
        this.zzi = zzalVar.zzad();
        Iterator it = this.zze.iterator();
        while (it.hasNext()) {
            ((zzaas) it.next()).zzc(this, zzdvVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzacn
    public final void zzn() {
        if (this.zzo == 2) {
            return;
        }
        zzfb zzfbVar = this.zzk;
        if (zzfbVar != null) {
            zzfbVar.zze(null);
        }
        this.zzm = null;
        this.zzo = 2;
    }

    public final void zzo(long j7, long j9) throws zzjh {
        if (this.zzn == 0) {
            zzabw zzabwVar = this.zzh;
            zzeq.zzb(zzabwVar);
            zzabwVar.zzc(j7, j9);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzabv
    public final void zzp(long j7, long j9, long j10, boolean z8) {
        if (z8 && this.zzm != null) {
            Iterator it = this.zze.iterator();
            while (it.hasNext()) {
                ((zzaas) it.next()).zza(this);
            }
        }
        if (this.zzj != null) {
            zzan zzanVar = this.zzi;
            if (zzanVar == null) {
                zzanVar = new zzal().zzad();
            }
            zzeq.zzb(this.zzf);
            this.zzj.zza(j9 - j10, System.nanoTime(), zzanVar, null);
        }
        zzeq.zzb(null);
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzacn
    public final void zzq(Surface surface, zzfv zzfvVar) {
        Pair pair = this.zzm;
        if (pair != null && ((Surface) pair.first).equals(surface) && ((zzfv) this.zzm.second).equals(zzfvVar)) {
            return;
        }
        this.zzm = Pair.create(surface, zzfvVar);
        zzfvVar.zzb();
        zzfvVar.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzacn
    public final void zzr(List list) {
        this.zzc.zzk(list);
    }

    @Override // com.google.android.gms.internal.ads.zzacn
    public final void zzs(zzabq zzabqVar) {
        zzeq.zzf(!zzv());
        this.zzg = zzabqVar;
        zzabw zzabwVar = new zzabw(this, zzabqVar);
        this.zzh = zzabwVar;
        zzabwVar.zzd(this.zzp);
    }
}
