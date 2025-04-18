package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.common.util.Clock;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzbys {
    private Context zza;
    private Clock zzb;
    private com.google.android.gms.ads.internal.util.zzg zzc;
    private zzbyz zzd;

    private zzbys() {
        throw null;
    }

    public /* synthetic */ zzbys(zzbyr zzbyrVar) {
    }

    public final zzbys zza(com.google.android.gms.ads.internal.util.zzg zzgVar) {
        this.zzc = zzgVar;
        return this;
    }

    public final zzbys zzb(Context context) {
        context.getClass();
        this.zza = context;
        return this;
    }

    public final zzbys zzc(Clock clock) {
        clock.getClass();
        this.zzb = clock;
        return this;
    }

    public final zzbys zzd(zzbyz zzbyzVar) {
        this.zzd = zzbyzVar;
        return this;
    }

    public final zzbza zze() {
        zzhiq.zzc(this.zza, Context.class);
        zzhiq.zzc(this.zzb, Clock.class);
        zzhiq.zzc(this.zzc, com.google.android.gms.ads.internal.util.zzg.class);
        zzhiq.zzc(this.zzd, zzbyz.class);
        return new zzbyu(this.zza, this.zzb, this.zzc, this.zzd, null);
    }
}
