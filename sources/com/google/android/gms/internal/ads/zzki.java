package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
public final class zzki {
    public zzlk zza;
    public int zzb;
    public boolean zzc;
    public int zzd;
    private boolean zze;

    public zzki(zzlk zzlkVar) {
        this.zza = zzlkVar;
    }

    public final void zza(int i2) {
        this.zze = 1 == ((this.zze ? 1 : 0) | i2);
        this.zzb += i2;
    }

    public final void zzb(zzlk zzlkVar) {
        this.zze |= this.zza != zzlkVar;
        this.zza = zzlkVar;
    }

    public final void zzc(int i2) {
        if (this.zzc && this.zzd != 5) {
            zzdi.zzd(i2 == 5);
            return;
        }
        this.zze = true;
        this.zzc = true;
        this.zzd = i2;
    }
}
