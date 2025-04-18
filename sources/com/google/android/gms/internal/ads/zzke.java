package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
public final class zzke {
    public zzlg zza;
    public int zzb;
    public boolean zzc;
    public int zzd;
    private boolean zze;

    public zzke(zzlg zzlgVar) {
        this.zza = zzlgVar;
    }

    public final void zza(int i10) {
        this.zze = 1 == ((this.zze ? 1 : 0) | i10);
        this.zzb += i10;
    }

    public final void zzb(zzlg zzlgVar) {
        this.zze |= this.zza != zzlgVar;
        this.zza = zzlgVar;
    }

    public final void zzc(int i10) {
        if (this.zzc && this.zzd != 5) {
            zzdb.zzd(i10 == 5);
            return;
        }
        this.zze = true;
        this.zzc = true;
        this.zzd = i10;
    }
}
