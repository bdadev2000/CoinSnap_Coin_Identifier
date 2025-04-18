package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

/* loaded from: classes3.dex */
final class zzif implements zzkp {
    private final zzlv zza;
    private final zzie zzb;

    @Nullable
    private zzln zzc;

    @Nullable
    private zzkp zzd;
    private boolean zze = true;
    private boolean zzf;

    public zzif(zzie zzieVar, zzdc zzdcVar) {
        this.zzb = zzieVar;
        this.zza = new zzlv(zzdcVar);
    }

    @Override // com.google.android.gms.internal.ads.zzkp
    public final long zza() {
        if (this.zze) {
            return this.zza.zza();
        }
        zzkp zzkpVar = this.zzd;
        zzkpVar.getClass();
        return zzkpVar.zza();
    }

    public final long zzb(boolean z10) {
        zzln zzlnVar = this.zzc;
        if (zzlnVar != null && !zzlnVar.zzW() && ((!z10 || this.zzc.zzcV() == 2) && (this.zzc.zzX() || (!z10 && !this.zzc.zzQ())))) {
            zzkp zzkpVar = this.zzd;
            zzkpVar.getClass();
            long zza = zzkpVar.zza();
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
            zzbj zzc = zzkpVar.zzc();
            if (!zzc.equals(this.zza.zzc())) {
                this.zza.zzg(zzc);
                this.zzb.zza(zzc);
            }
        } else {
            this.zze = true;
            if (this.zzf) {
                this.zza.zzd();
            }
        }
        return zza();
    }

    @Override // com.google.android.gms.internal.ads.zzkp
    public final zzbj zzc() {
        zzkp zzkpVar = this.zzd;
        return zzkpVar != null ? zzkpVar.zzc() : this.zza.zzc();
    }

    public final void zzd(zzln zzlnVar) {
        if (zzlnVar == this.zzc) {
            this.zzd = null;
            this.zzc = null;
            this.zze = true;
        }
    }

    public final void zze(zzln zzlnVar) throws zzig {
        zzkp zzkpVar;
        zzkp zzl = zzlnVar.zzl();
        if (zzl != null && zzl != (zzkpVar = this.zzd)) {
            if (zzkpVar == null) {
                this.zzd = zzl;
                this.zzc = zzlnVar;
                zzl.zzg(this.zza.zzc());
                return;
            }
            throw zzig.zzd(new IllegalStateException("Multiple renderer media clocks enabled."), 1000);
        }
    }

    public final void zzf(long j3) {
        this.zza.zzb(j3);
    }

    @Override // com.google.android.gms.internal.ads.zzkp
    public final void zzg(zzbj zzbjVar) {
        zzkp zzkpVar = this.zzd;
        if (zzkpVar != null) {
            zzkpVar.zzg(zzbjVar);
            zzbjVar = this.zzd.zzc();
        }
        this.zza.zzg(zzbjVar);
    }

    public final void zzh() {
        this.zzf = true;
        this.zza.zzd();
    }

    public final void zzi() {
        this.zzf = false;
        this.zza.zze();
    }

    @Override // com.google.android.gms.internal.ads.zzkp
    public final boolean zzj() {
        if (this.zze) {
            return false;
        }
        zzkp zzkpVar = this.zzd;
        zzkpVar.getClass();
        return zzkpVar.zzj();
    }
}
