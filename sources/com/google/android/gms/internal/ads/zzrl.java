package com.google.android.gms.internal.ads;

import android.content.Context;
import androidx.annotation.Nullable;

/* loaded from: classes2.dex */
public final class zzrl {

    @Nullable
    private final Context zza;
    private final zzpp zzb;
    private boolean zzc;
    private final zzrk zzd;

    @Nullable
    private zzrn zze;
    private zzrd zzf;

    @Deprecated
    public zzrl() {
        this.zza = null;
        this.zzb = zzpp.zza;
        this.zzd = zzrk.zza;
    }

    public static /* bridge */ /* synthetic */ Context zza(zzrl zzrlVar) {
        return zzrlVar.zza;
    }

    public static /* bridge */ /* synthetic */ zzpp zzb(zzrl zzrlVar) {
        return zzrlVar.zzb;
    }

    public static /* bridge */ /* synthetic */ zzrk zzc(zzrl zzrlVar) {
        return zzrlVar.zzd;
    }

    public static /* bridge */ /* synthetic */ zzrn zze(zzrl zzrlVar) {
        return zzrlVar.zze;
    }

    public static /* bridge */ /* synthetic */ zzrd zzf(zzrl zzrlVar) {
        return zzrlVar.zzf;
    }

    public final zzrz zzd() {
        zzeq.zzf(!this.zzc);
        this.zzc = true;
        if (this.zze == null) {
            this.zze = new zzrn(new zzdz[0]);
        }
        if (this.zzf == null) {
            this.zzf = new zzrd(this.zza);
        }
        return new zzrz(this, null);
    }

    public zzrl(Context context) {
        this.zza = context;
        this.zzb = zzpp.zza;
        this.zzd = zzrk.zza;
    }
}
