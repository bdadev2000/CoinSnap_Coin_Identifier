package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

/* loaded from: classes2.dex */
final class zzjf implements zzlp {
    private final zzmu zza;
    private final zzje zzb;

    @Nullable
    private zzmn zzc;

    @Nullable
    private zzlp zzd;
    private boolean zze = true;
    private boolean zzf;

    public zzjf(zzje zzjeVar, zzer zzerVar) {
        this.zzb = zzjeVar;
        this.zza = new zzmu(zzerVar);
    }

    @Override // com.google.android.gms.internal.ads.zzlp
    public final long zza() {
        throw null;
    }

    public final long zzb(boolean z8) {
        zzmn zzmnVar = this.zzc;
        if (zzmnVar != null && !zzmnVar.zzW() && ((!z8 || this.zzc.zzcU() == 2) && (this.zzc.zzX() || (!z8 && !this.zzc.zzQ())))) {
            zzlp zzlpVar = this.zzd;
            zzlpVar.getClass();
            long zza = zzlpVar.zza();
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
            zzcl zzc = zzlpVar.zzc();
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
        if (this.zze) {
            return this.zza.zza();
        }
        zzlp zzlpVar2 = this.zzd;
        zzlpVar2.getClass();
        return zzlpVar2.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzlp
    public final zzcl zzc() {
        zzlp zzlpVar = this.zzd;
        return zzlpVar != null ? zzlpVar.zzc() : this.zza.zzc();
    }

    public final void zzd(zzmn zzmnVar) {
        if (zzmnVar == this.zzc) {
            this.zzd = null;
            this.zzc = null;
            this.zze = true;
        }
    }

    public final void zze(zzmn zzmnVar) throws zzjh {
        zzlp zzlpVar;
        zzlp zzk = zzmnVar.zzk();
        if (zzk != null && zzk != (zzlpVar = this.zzd)) {
            if (zzlpVar == null) {
                this.zzd = zzk;
                this.zzc = zzmnVar;
                zzk.zzg(this.zza.zzc());
                return;
            }
            throw zzjh.zzd(new IllegalStateException("Multiple renderer media clocks enabled."), 1000);
        }
    }

    public final void zzf(long j7) {
        this.zza.zzb(j7);
    }

    @Override // com.google.android.gms.internal.ads.zzlp
    public final void zzg(zzcl zzclVar) {
        zzlp zzlpVar = this.zzd;
        if (zzlpVar != null) {
            zzlpVar.zzg(zzclVar);
            zzclVar = this.zzd.zzc();
        }
        this.zza.zzg(zzclVar);
    }

    public final void zzh() {
        this.zzf = true;
        this.zza.zzd();
    }

    public final void zzi() {
        this.zzf = false;
        this.zza.zze();
    }

    @Override // com.google.android.gms.internal.ads.zzlp
    public final boolean zzj() {
        if (this.zze) {
            return false;
        }
        zzlp zzlpVar = this.zzd;
        zzlpVar.getClass();
        return zzlpVar.zzj();
    }
}
