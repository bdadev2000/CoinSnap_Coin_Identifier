package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzlf {
    public zzmg zza;
    public int zzb;
    public boolean zzc;
    public int zzd;
    public boolean zze;
    public int zzf;
    private boolean zzg;

    public zzlf(zzmg zzmgVar) {
        this.zza = zzmgVar;
    }

    public final void zza(int i9) {
        this.zzg = 1 == ((this.zzg ? 1 : 0) | i9);
        this.zzb += i9;
    }

    public final void zzb(int i9) {
        this.zzg = true;
        this.zze = true;
        this.zzf = i9;
    }

    public final void zzc(zzmg zzmgVar) {
        this.zzg |= this.zza != zzmgVar;
        this.zza = zzmgVar;
    }

    public final void zzd(int i9) {
        boolean z8 = true;
        if (this.zzc && this.zzd != 5) {
            if (i9 != 5) {
                z8 = false;
            }
            zzeq.zzd(z8);
        } else {
            this.zzg = true;
            this.zzc = true;
            this.zzd = i9;
        }
    }
}
