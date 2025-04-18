package com.google.android.gms.internal.ads;

import android.util.Pair;
import androidx.annotation.FloatRange;
import androidx.annotation.Nullable;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzabe {
    private final zzaaz zza;

    @Nullable
    private zzcp zzf;
    private long zzh;
    private final zzzz zzj;
    private final zzaax zzb = new zzaax();
    private final zzeq zzc = new zzeq(10);
    private final zzeq zzd = new zzeq(10);
    private final zzec zze = new zzec(16);
    private zzcp zzg = zzcp.zza;
    private long zzi = -9223372036854775807L;

    public zzabe(zzzz zzzzVar, zzaaz zzaazVar) {
        this.zzj = zzzzVar;
        this.zza = zzaazVar;
    }

    private static Object zzg(zzeq zzeqVar) {
        zzdi.zzd(zzeqVar.zza() > 0);
        while (zzeqVar.zza() > 1) {
            zzeqVar.zzb();
        }
        Object zzb = zzeqVar.zzb();
        zzb.getClass();
        return zzb;
    }

    public final void zza() {
        this.zze.zzc();
        this.zzi = -9223372036854775807L;
        zzeq zzeqVar = this.zzd;
        if (zzeqVar.zza() > 0) {
            this.zzd.zzd(0L, Long.valueOf(((Long) zzg(zzeqVar)).longValue()));
        }
        if (this.zzf != null) {
            this.zzc.zze();
            return;
        }
        zzeq zzeqVar2 = this.zzc;
        if (zzeqVar2.zza() > 0) {
            this.zzf = (zzcp) zzg(zzeqVar2);
        }
    }

    public final void zzb(long j2, long j3) {
        this.zzd.zzd(j2, Long.valueOf(j3));
    }

    public final void zzc(long j2, long j3) throws zzij {
        zzaaw zzaawVar;
        zzaf zzafVar;
        zzaaw zzaawVar2;
        zzdj zzdjVar;
        Pair pair;
        CopyOnWriteArraySet copyOnWriteArraySet;
        CopyOnWriteArraySet copyOnWriteArraySet2;
        CopyOnWriteArraySet copyOnWriteArraySet3;
        zzec zzecVar = this.zze;
        if (zzecVar.zzd()) {
            return;
        }
        zzeq zzeqVar = this.zzd;
        long zza = zzecVar.zza();
        Long l2 = (Long) zzeqVar.zzc(zza);
        if (l2 != null && l2.longValue() != this.zzh) {
            this.zzh = l2.longValue();
            this.zza.zzf();
        }
        int zza2 = this.zza.zza(zza, j2, j3, this.zzh, false, this.zzb);
        if (zza2 != 0 && zza2 != 1) {
            if (zza2 == 2 || zza2 == 3 || zza2 == 4) {
                this.zzi = zza;
                this.zze.zzb();
                zzzz zzzzVar = this.zzj;
                copyOnWriteArraySet3 = zzzzVar.zza.zzh;
                Iterator it = copyOnWriteArraySet3.iterator();
                while (it.hasNext()) {
                    ((zzaaa) it.next()).zzb(zzzzVar.zza);
                }
                zzdi.zzb(null);
                throw null;
            }
            return;
        }
        this.zzi = zza;
        long longValue = Long.valueOf(this.zze.zzb()).longValue();
        zzcp zzcpVar = (zzcp) this.zzc.zzc(longValue);
        if (zzcpVar != null && !zzcpVar.equals(zzcp.zza) && !zzcpVar.equals(this.zzg)) {
            this.zzg = zzcpVar;
            zzzz zzzzVar2 = this.zzj;
            zzad zzadVar = new zzad();
            zzadVar.zzae(zzcpVar.zzb);
            zzadVar.zzJ(zzcpVar.zzc);
            zzadVar.zzZ("video/raw");
            zzzzVar2.zza.zzi = zzadVar.zzaf();
            copyOnWriteArraySet2 = zzzzVar2.zza.zzh;
            Iterator it2 = copyOnWriteArraySet2.iterator();
            while (it2.hasNext()) {
                ((zzaaa) it2.next()).zzc(zzzzVar2.zza, zzcpVar);
            }
        }
        zzzz zzzzVar3 = this.zzj;
        if (this.zza.zzp()) {
            zzaak zzaakVar = zzzzVar3.zza;
            pair = zzaakVar.zzl;
            if (pair != null) {
                copyOnWriteArraySet = zzaakVar.zzh;
                Iterator it3 = copyOnWriteArraySet.iterator();
                while (it3.hasNext()) {
                    ((zzaaa) it3.next()).zza(zzzzVar3.zza);
                }
            }
        }
        zzaak zzaakVar2 = zzzzVar3.zza;
        zzaawVar = zzaakVar2.zzj;
        if (zzaawVar != null) {
            zzafVar = zzaakVar2.zzi;
            zzaf zzaf = zzafVar == null ? new zzad().zzaf() : zzaakVar2.zzi;
            zzaak zzaakVar3 = zzzzVar3.zza;
            zzaawVar2 = zzaakVar3.zzj;
            zzdjVar = zzaakVar3.zzg;
            zzaawVar2.zza(longValue, zzdjVar.zzc(), zzaf, null);
        }
        zzdi.zzb(null);
        throw null;
    }

    public final void zzd(@FloatRange float f2) {
        zzdi.zzd(f2 > 0.0f);
        this.zza.zzn(f2);
    }

    public final boolean zze(long j2) {
        long j3 = this.zzi;
        return j3 != -9223372036854775807L && j3 >= j2;
    }

    public final boolean zzf(boolean z2) {
        return this.zza.zzo(false);
    }
}
