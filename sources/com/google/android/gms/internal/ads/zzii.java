package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

/* loaded from: classes3.dex */
final class zzii implements zzkt {
    private final zzlz zza;
    private final zzih zzb;

    @Nullable
    private zzlr zzc;

    @Nullable
    private zzkt zzd;
    private boolean zze = true;
    private boolean zzf;

    public zzii(zzih zzihVar, zzdj zzdjVar) {
        this.zzb = zzihVar;
        this.zza = new zzlz(zzdjVar);
    }

    @Override // com.google.android.gms.internal.ads.zzkt
    public final long zza() {
        if (this.zze) {
            return this.zza.zza();
        }
        zzkt zzktVar = this.zzd;
        zzktVar.getClass();
        return zzktVar.zza();
    }

    public final long zzb(boolean z2) {
        zzlr zzlrVar = this.zzc;
        if (zzlrVar == null || zzlrVar.zzW() || ((z2 && this.zzc.zzcV() != 2) || (!this.zzc.zzX() && (z2 || this.zzc.zzQ())))) {
            this.zze = true;
            if (this.zzf) {
                this.zza.zzd();
            }
        } else {
            zzkt zzktVar = this.zzd;
            zzktVar.getClass();
            long zza = zzktVar.zza();
            if (this.zze) {
                if (zza < this.zza.zza()) {
                    this.zza.zze();
                } else {
                    this.zze = false;
                    if (this.zzf) {
                        this.zza.zzd();
                    }
                }
            }
            this.zza.zzb(zza);
            zzbq zzc = zzktVar.zzc();
            if (!zzc.equals(this.zza.zzc())) {
                this.zza.zzg(zzc);
                this.zzb.zza(zzc);
            }
        }
        return zza();
    }

    @Override // com.google.android.gms.internal.ads.zzkt
    public final zzbq zzc() {
        zzkt zzktVar = this.zzd;
        return zzktVar != null ? zzktVar.zzc() : this.zza.zzc();
    }

    public final void zzd(zzlr zzlrVar) {
        if (zzlrVar == this.zzc) {
            this.zzd = null;
            this.zzc = null;
            this.zze = true;
        }
    }

    public final void zze(zzlr zzlrVar) throws zzij {
        zzkt zzktVar;
        zzkt zzl = zzlrVar.zzl();
        if (zzl == null || zzl == (zzktVar = this.zzd)) {
            return;
        }
        if (zzktVar != null) {
            throw zzij.zzd(new IllegalStateException("Multiple renderer media clocks enabled."), 1000);
        }
        this.zzd = zzl;
        this.zzc = zzlrVar;
        zzl.zzg(this.zza.zzc());
    }

    public final void zzf(long j2) {
        this.zza.zzb(j2);
    }

    @Override // com.google.android.gms.internal.ads.zzkt
    public final void zzg(zzbq zzbqVar) {
        zzkt zzktVar = this.zzd;
        if (zzktVar != null) {
            zzktVar.zzg(zzbqVar);
            zzbqVar = this.zzd.zzc();
        }
        this.zza.zzg(zzbqVar);
    }

    public final void zzh() {
        this.zzf = true;
        this.zza.zzd();
    }

    public final void zzi() {
        this.zzf = false;
        this.zza.zze();
    }

    @Override // com.google.android.gms.internal.ads.zzkt
    public final boolean zzj() {
        if (this.zze) {
            return false;
        }
        zzkt zzktVar = this.zzd;
        zzktVar.getClass();
        return zzktVar.zzj();
    }
}
