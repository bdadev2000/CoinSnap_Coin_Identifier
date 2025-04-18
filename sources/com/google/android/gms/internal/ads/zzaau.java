package com.google.android.gms.internal.ads;

import android.util.Pair;
import androidx.annotation.Nullable;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzaau {
    private final zzaap zza;

    @Nullable
    private zzci zzf;
    private long zzh;
    private final zzzq zzj;
    private final zzaan zzb = new zzaan();
    private final zzej zzc = new zzej(10);
    private final zzej zzd = new zzej(10);
    private final zzdv zze = new zzdv(16);
    private zzci zzg = zzci.zza;
    private long zzi = C.TIME_UNSET;

    public zzaau(zzzq zzzqVar, zzaap zzaapVar) {
        this.zzj = zzzqVar;
        this.zza = zzaapVar;
    }

    private static Object zzg(zzej zzejVar) {
        boolean z10;
        if (zzejVar.zza() > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        zzdb.zzd(z10);
        while (zzejVar.zza() > 1) {
            zzejVar.zzb();
        }
        Object zzb = zzejVar.zzb();
        zzb.getClass();
        return zzb;
    }

    public final void zza() {
        this.zze.zzc();
        this.zzi = C.TIME_UNSET;
        zzej zzejVar = this.zzd;
        if (zzejVar.zza() > 0) {
            this.zzd.zzd(0L, Long.valueOf(((Long) zzg(zzejVar)).longValue()));
        }
        if (this.zzf == null) {
            zzej zzejVar2 = this.zzc;
            if (zzejVar2.zza() > 0) {
                this.zzf = (zzci) zzg(zzejVar2);
                return;
            }
            return;
        }
        this.zzc.zze();
    }

    public final void zzb(long j3, long j10) {
        this.zzd.zzd(j3, Long.valueOf(j10));
    }

    public final void zzc(long j3, long j10) throws zzig {
        zzaam zzaamVar;
        zzad zzadVar;
        zzad zzadVar2;
        zzaam zzaamVar2;
        zzdc zzdcVar;
        Pair pair;
        CopyOnWriteArraySet copyOnWriteArraySet;
        CopyOnWriteArraySet copyOnWriteArraySet2;
        CopyOnWriteArraySet copyOnWriteArraySet3;
        zzdv zzdvVar = this.zze;
        if (!zzdvVar.zzd()) {
            zzej zzejVar = this.zzd;
            long zza = zzdvVar.zza();
            Long l10 = (Long) zzejVar.zzc(zza);
            if (l10 != null && l10.longValue() != this.zzh) {
                this.zzh = l10.longValue();
                this.zza.zzf();
            }
            int zza2 = this.zza.zza(zza, j3, j10, this.zzh, false, this.zzb);
            if (zza2 != 0 && zza2 != 1) {
                if (zza2 == 2 || zza2 == 3 || zza2 == 4) {
                    this.zzi = zza;
                    this.zze.zzb();
                    zzzq zzzqVar = this.zzj;
                    copyOnWriteArraySet3 = zzzqVar.zza.zzh;
                    Iterator it = copyOnWriteArraySet3.iterator();
                    while (it.hasNext()) {
                        ((zzzr) it.next()).zzb(zzzqVar.zza);
                    }
                    zzdb.zzb(null);
                    throw null;
                }
                return;
            }
            this.zzi = zza;
            long longValue = Long.valueOf(this.zze.zzb()).longValue();
            zzci zzciVar = (zzci) this.zzc.zzc(longValue);
            if (zzciVar != null && !zzciVar.equals(zzci.zza) && !zzciVar.equals(this.zzg)) {
                this.zzg = zzciVar;
                zzzq zzzqVar2 = this.zzj;
                zzab zzabVar = new zzab();
                zzabVar.zzae(zzciVar.zzb);
                zzabVar.zzJ(zzciVar.zzc);
                zzabVar.zzZ("video/raw");
                zzzqVar2.zza.zzi = zzabVar.zzaf();
                copyOnWriteArraySet2 = zzzqVar2.zza.zzh;
                Iterator it2 = copyOnWriteArraySet2.iterator();
                while (it2.hasNext()) {
                    ((zzzr) it2.next()).zzc(zzzqVar2.zza, zzciVar);
                }
            }
            zzzq zzzqVar3 = this.zzj;
            if (this.zza.zzp()) {
                zzaaa zzaaaVar = zzzqVar3.zza;
                pair = zzaaaVar.zzl;
                if (pair != null) {
                    copyOnWriteArraySet = zzaaaVar.zzh;
                    Iterator it3 = copyOnWriteArraySet.iterator();
                    while (it3.hasNext()) {
                        ((zzzr) it3.next()).zza(zzzqVar3.zza);
                    }
                }
            }
            zzaaa zzaaaVar2 = zzzqVar3.zza;
            zzaamVar = zzaaaVar2.zzj;
            if (zzaamVar != null) {
                zzadVar = zzaaaVar2.zzi;
                if (zzadVar == null) {
                    zzadVar2 = new zzab().zzaf();
                } else {
                    zzadVar2 = zzaaaVar2.zzi;
                }
                zzad zzadVar3 = zzadVar2;
                zzaaa zzaaaVar3 = zzzqVar3.zza;
                zzaamVar2 = zzaaaVar3.zzj;
                zzdcVar = zzaaaVar3.zzg;
                zzaamVar2.zza(longValue, zzdcVar.zzc(), zzadVar3, null);
            }
            zzdb.zzb(null);
            throw null;
        }
    }

    public final void zzd(float f10) {
        boolean z10;
        if (f10 > 0.0f) {
            z10 = true;
        } else {
            z10 = false;
        }
        zzdb.zzd(z10);
        this.zza.zzn(f10);
    }

    public final boolean zze(long j3) {
        long j10 = this.zzi;
        return j10 != C.TIME_UNSET && j10 >= j3;
    }

    public final boolean zzf(boolean z10) {
        return this.zza.zzo(false);
    }
}
