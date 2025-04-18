package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.common.util.Clock;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzbyo {
    private Context zza;
    private Clock zzb;
    private com.google.android.gms.ads.internal.util.zzg zzc;
    private zzbyv zzd;

    private zzbyo() {
        throw null;
    }

    public /* synthetic */ zzbyo(zzbyq zzbyqVar) {
    }

    public final zzbyo zza(com.google.android.gms.ads.internal.util.zzg zzgVar) {
        this.zzc = zzgVar;
        return this;
    }

    public final zzbyo zzb(Context context) {
        context.getClass();
        this.zza = context;
        return this;
    }

    public final zzbyo zzc(Clock clock) {
        clock.getClass();
        this.zzb = clock;
        return this;
    }

    public final zzbyo zzd(zzbyv zzbyvVar) {
        this.zzd = zzbyvVar;
        return this;
    }

    public final zzbyw zze() {
        zzhgf.zzc(this.zza, Context.class);
        zzhgf.zzc(this.zzb, Clock.class);
        zzhgf.zzc(this.zzc, com.google.android.gms.ads.internal.util.zzg.class);
        zzhgf.zzc(this.zzd, zzbyv.class);
        return new zzbyp(this.zza, this.zzb, this.zzc, this.zzd, null);
    }
}
