package com.google.android.gms.internal.ads;

import android.content.Context;
import androidx.annotation.Nullable;

/* loaded from: classes3.dex */
public final class zzqk {

    @Nullable
    private final Context zza;
    private final zzop zzb;
    private boolean zzc;
    private final zzqj zzd;

    @Nullable
    private zzqm zze;
    private zzqc zzf;

    @Deprecated
    public zzqk() {
        this.zza = null;
        this.zzb = zzop.zza;
        this.zzd = zzqj.zza;
    }

    public final zzqw zzc() {
        zzdb.zzf(!this.zzc);
        this.zzc = true;
        if (this.zze == null) {
            this.zze = new zzqm(new zzcm[0]);
        }
        if (this.zzf == null) {
            this.zzf = new zzqc(this.zza);
        }
        return new zzqw(this, null);
    }

    public zzqk(Context context) {
        this.zza = context;
        this.zzb = zzop.zza;
        this.zzd = zzqj.zza;
    }
}
