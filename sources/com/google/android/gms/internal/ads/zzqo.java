package com.google.android.gms.internal.ads;

import android.content.Context;
import androidx.annotation.Nullable;

/* loaded from: classes3.dex */
public final class zzqo {

    @Nullable
    private final Context zza;
    private final zzos zzb;
    private boolean zzc;
    private final zzqn zzd;

    @Nullable
    private zzqq zze;
    private zzqg zzf;

    @Deprecated
    public zzqo() {
        this.zza = null;
        this.zzb = zzos.zza;
        this.zzd = zzqn.zza;
    }

    public static /* bridge */ /* synthetic */ Context zza(zzqo zzqoVar) {
        return zzqoVar.zza;
    }

    public static /* bridge */ /* synthetic */ zzos zzb(zzqo zzqoVar) {
        return zzqoVar.zzb;
    }

    public static /* bridge */ /* synthetic */ zzqq zzd(zzqo zzqoVar) {
        return zzqoVar.zze;
    }

    public static /* bridge */ /* synthetic */ zzqg zze(zzqo zzqoVar) {
        return zzqoVar.zzf;
    }

    public final zzrc zzc() {
        zzdi.zzf(!this.zzc);
        this.zzc = true;
        if (this.zze == null) {
            this.zze = new zzqq(new zzct[0]);
        }
        if (this.zzf == null) {
            this.zzf = new zzqg(this.zza);
        }
        return new zzrc(this, null);
    }

    public zzqo(Context context) {
        this.zza = context;
        this.zzb = zzos.zza;
        this.zzd = zzqn.zza;
    }
}
