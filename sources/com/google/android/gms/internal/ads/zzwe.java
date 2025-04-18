package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.Looper;
import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;

/* loaded from: classes2.dex */
public final class zzwe extends zztx implements zzvv {
    private final zzgf zza;
    private final zzrv zzb;
    private final int zzc;
    private boolean zzd = true;
    private long zze = -9223372036854775807L;
    private boolean zzf;
    private boolean zzg;

    @Nullable
    private zzhh zzh;

    @GuardedBy
    private zzbc zzi;
    private final zzwb zzj;
    private final zzze zzk;

    public /* synthetic */ zzwe(zzbc zzbcVar, zzgf zzgfVar, zzwb zzwbVar, zzrv zzrvVar, zzze zzzeVar, int i2, zzwd zzwdVar) {
        this.zzi = zzbcVar;
        this.zza = zzgfVar;
        this.zzj = zzwbVar;
        this.zzb = zzrvVar;
        this.zzk = zzzeVar;
        this.zzc = i2;
    }

    private final void zzw() {
        long j2 = this.zze;
        boolean z2 = this.zzf;
        boolean z3 = this.zzg;
        zzbc zzJ = zzJ();
        zzwr zzwrVar = new zzwr(-9223372036854775807L, -9223372036854775807L, -9223372036854775807L, j2, j2, 0L, 0L, z2, false, false, null, zzJ, z3 ? zzJ.zzc : null);
        zzo(this.zzd ? new zzwa(this, zzwrVar) : zzwrVar);
    }

    @Override // com.google.android.gms.internal.ads.zzva
    public final void zzG(zzuw zzuwVar) {
        ((zzvz) zzuwVar).zzN();
    }

    @Override // com.google.android.gms.internal.ads.zzva
    public final zzuw zzI(zzuy zzuyVar, zzza zzzaVar, long j2) {
        zzgg zza = this.zza.zza();
        zzhh zzhhVar = this.zzh;
        if (zzhhVar != null) {
            zza.zzf(zzhhVar);
        }
        zzax zzaxVar = zzJ().zzb;
        zzaxVar.getClass();
        Uri uri = zzaxVar.zza;
        zzwb zzwbVar = this.zzj;
        zzb();
        return new zzvz(uri, zza, new zzua(zzwbVar.zza), this.zzb, zzc(zzuyVar), this.zzk, zze(zzuyVar), this, zzzaVar, null, this.zzc, zzeu.zzr(-9223372036854775807L));
    }

    @Override // com.google.android.gms.internal.ads.zzva
    public final synchronized zzbc zzJ() {
        return this.zzi;
    }

    @Override // com.google.android.gms.internal.ads.zzvv
    public final void zza(long j2, boolean z2, boolean z3) {
        if (j2 == -9223372036854775807L) {
            j2 = this.zze;
        }
        if (!this.zzd && this.zze == j2 && this.zzf == z2 && this.zzg == z3) {
            return;
        }
        this.zze = j2;
        this.zzf = z2;
        this.zzg = z3;
        this.zzd = false;
        zzw();
    }

    @Override // com.google.android.gms.internal.ads.zztx
    public final void zzn(@Nullable zzhh zzhhVar) {
        this.zzh = zzhhVar;
        Looper.myLooper().getClass();
        zzb();
        zzw();
    }

    @Override // com.google.android.gms.internal.ads.zztx
    public final void zzq() {
    }

    @Override // com.google.android.gms.internal.ads.zztx, com.google.android.gms.internal.ads.zzva
    public final synchronized void zzt(zzbc zzbcVar) {
        this.zzi = zzbcVar;
    }

    @Override // com.google.android.gms.internal.ads.zzva
    public final void zzz() {
    }
}
