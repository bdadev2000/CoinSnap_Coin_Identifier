package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.Surface;
import androidx.annotation.Nullable;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzzy implements zzabl, zzzr {
    final /* synthetic */ zzaaa zza;
    private final int zzb;
    private final ArrayList zzc;
    private final zzaan zzd;

    @Nullable
    private zzad zze;
    private long zzf;
    private long zzg;
    private long zzh;
    private long zzi;
    private boolean zzj;
    private long zzk;
    private boolean zzl;
    private boolean zzm;
    private long zzn;
    private zzabi zzo;
    private Executor zzp;

    public zzzy(zzaaa zzaaaVar, Context context) {
        Executor executor;
        this.zza = zzaaaVar;
        this.zzb = true != zzen.zzK(context) ? 5 : 1;
        this.zzc = new ArrayList();
        this.zzd = new zzaan();
        this.zzk = C.TIME_UNSET;
        this.zzo = zzabi.zzb;
        executor = zzaaa.zza;
        this.zzp = executor;
    }

    private final void zzz() {
        zzm zzw;
        if (this.zze == null) {
            return;
        }
        new ArrayList(this.zzc);
        zzad zzadVar = this.zze;
        zzadVar.getClass();
        zzdb.zzb(null);
        zzm zzmVar = zzadVar.zzB;
        int i10 = zzadVar.zzu;
        int i11 = zzadVar.zzv;
        zzw = zzaaa.zzw(zzmVar);
        zzae zzaeVar = new zzae(zzw, i10, i11);
        zzaeVar.zza(zzadVar.zzy);
        zzaeVar.zzb();
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzzr
    public final void zza(zzaaa zzaaaVar) {
        final zzabi zzabiVar = this.zzo;
        this.zzp.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzzx
            @Override // java.lang.Runnable
            public final void run() {
                zzabiVar.zza(zzzy.this);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzzr
    public final void zzb(zzaaa zzaaaVar) {
        final zzabi zzabiVar = this.zzo;
        this.zzp.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzzw
            @Override // java.lang.Runnable
            public final void run() {
                zzabiVar.zzb(zzzy.this);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzzr
    public final void zzc(zzaaa zzaaaVar, final zzci zzciVar) {
        final zzabi zzabiVar = this.zzo;
        this.zzp.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzzv
            @Override // java.lang.Runnable
            public final void run() {
                zzabiVar.zzc(zzzy.this, zzciVar);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzabl
    public final Surface zzd() {
        zzdb.zzf(false);
        zzdb.zzb(null);
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzabl
    public final void zze() {
        this.zza.zzr();
    }

    @Override // com.google.android.gms.internal.ads.zzabl
    public final void zzf() {
        zzaap zzaapVar;
        zzaapVar = this.zza.zzd;
        zzaapVar.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzabl
    public final void zzg(boolean z10) {
        zzaap zzaapVar;
        this.zzl = false;
        this.zzk = C.TIME_UNSET;
        zzaaa.zzm(this.zza);
        if (z10) {
            zzaapVar = this.zza.zzd;
            zzaapVar.zzi();
        }
        this.zzn = C.TIME_UNSET;
    }

    @Override // com.google.android.gms.internal.ads.zzabl
    public final void zzh(zzad zzadVar) throws zzabk {
        zzaaa.zzd(this.zza, zzadVar);
    }

    @Override // com.google.android.gms.internal.ads.zzabl
    public final void zzi(boolean z10) {
        zzaap zzaapVar;
        zzaapVar = this.zza.zzd;
        zzaapVar.zzc(z10);
    }

    @Override // com.google.android.gms.internal.ads.zzabl
    public final void zzj(int i10, zzad zzadVar) {
        zzaap zzaapVar;
        boolean z10 = false;
        zzdb.zzf(false);
        zzaapVar = this.zza.zzd;
        zzaapVar.zzl(zzadVar.zzw);
        this.zze = zzadVar;
        if (!this.zzl) {
            zzz();
            this.zzl = true;
            this.zzm = false;
            this.zzn = C.TIME_UNSET;
            return;
        }
        if (this.zzk != C.TIME_UNSET) {
            z10 = true;
        }
        zzdb.zzf(z10);
        this.zzm = true;
        this.zzn = this.zzk;
    }

    @Override // com.google.android.gms.internal.ads.zzabl
    public final void zzk() {
        zzaap zzaapVar;
        zzaapVar = this.zza.zzd;
        zzaapVar.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzabl
    public final void zzl(boolean z10) {
        zzaap zzaapVar;
        zzaapVar = this.zza.zzd;
        zzaapVar.zze(z10);
    }

    @Override // com.google.android.gms.internal.ads.zzabl
    public final void zzm() {
        zzaap zzaapVar;
        zzaapVar = this.zza.zzd;
        zzaapVar.zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzabl
    public final void zzn() {
        zzaap zzaapVar;
        zzaapVar = this.zza.zzd;
        zzaapVar.zzh();
    }

    @Override // com.google.android.gms.internal.ads.zzabl
    public final void zzo() {
        this.zza.zzs();
    }

    @Override // com.google.android.gms.internal.ads.zzabl
    public final void zzp(long j3, long j10) throws zzabk {
        try {
            zzaaa.zzo(this.zza, j3, j10);
        } catch (zzig e2) {
            zzad zzadVar = this.zze;
            if (zzadVar == null) {
                zzadVar = new zzab().zzaf();
            }
            throw new zzabk(e2, zzadVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzabl
    public final void zzq(int i10) {
        zzaap zzaapVar;
        zzaapVar = this.zza.zzd;
        zzaapVar.zzj(i10);
    }

    @Override // com.google.android.gms.internal.ads.zzabl
    public final void zzr(zzabi zzabiVar, Executor executor) {
        this.zzo = zzabiVar;
        this.zzp = executor;
    }

    @Override // com.google.android.gms.internal.ads.zzabl
    public final void zzs(Surface surface, zzee zzeeVar) {
        this.zza.zzt(surface, zzeeVar);
    }

    @Override // com.google.android.gms.internal.ads.zzabl
    public final void zzt(float f10) {
        this.zza.zze.zzd(f10);
    }

    @Override // com.google.android.gms.internal.ads.zzabl
    public final void zzu(long j3, long j10, long j11, long j12) {
        boolean z10 = this.zzj;
        boolean z11 = true;
        if (this.zzg == j10 && this.zzh == j11) {
            z11 = false;
        }
        this.zzj = z10 | z11;
        this.zzf = j3;
        this.zzg = j10;
        this.zzh = j11;
        this.zzi = j12;
    }

    @Override // com.google.android.gms.internal.ads.zzabl
    public final void zzv(List list) {
        if (this.zzc.equals(list)) {
            return;
        }
        this.zzc.clear();
        this.zzc.addAll(list);
        zzz();
    }

    @Override // com.google.android.gms.internal.ads.zzabl
    public final void zzw(zzaam zzaamVar) {
        this.zza.zzj = zzaamVar;
    }

    @Override // com.google.android.gms.internal.ads.zzabl
    public final boolean zzx(long j3, boolean z10, long j10, long j11, zzabj zzabjVar) throws zzabk {
        zzaap zzaapVar;
        zzdb.zzf(false);
        long j12 = j3 - this.zzh;
        try {
            zzaapVar = this.zza.zzd;
            if (zzaapVar.zza(j12, j10, j11, this.zzf, z10, this.zzd) != 4) {
                if (j12 < this.zzi && !z10) {
                    zzaaf zzaafVar = (zzaaf) zzabjVar;
                    zzaafVar.zzd.zzaQ(zzaafVar.zza, zzaafVar.zzb, zzaafVar.zzc);
                    return true;
                }
                zzp(j10, j11);
                if (this.zzm) {
                    long j13 = this.zzn;
                    if (j13 == C.TIME_UNSET || zzaaa.zzu(this.zza, j13)) {
                        zzz();
                        this.zzm = false;
                        this.zzn = C.TIME_UNSET;
                    }
                }
                zzdb.zzb(null);
                throw null;
            }
            return false;
        } catch (zzig e2) {
            zzad zzadVar = this.zze;
            zzdb.zzb(zzadVar);
            throw new zzabk(e2, zzadVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzabl
    public final boolean zzy(boolean z10) {
        boolean zzf;
        zzf = this.zza.zze.zzf(false);
        return zzf;
    }
}
