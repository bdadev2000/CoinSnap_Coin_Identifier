package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.common.util.Clock;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzcan {
    private Context zza;
    private Clock zzb;
    private com.google.android.gms.ads.internal.util.zzg zzc;
    private zzcau zzd;

    private zzcan() {
        throw null;
    }

    public final zzcan zza(com.google.android.gms.ads.internal.util.zzg zzgVar) {
        this.zzc = zzgVar;
        return this;
    }

    public final zzcan zzb(Context context) {
        context.getClass();
        this.zza = context;
        return this;
    }

    public final zzcan zzc(Clock clock) {
        clock.getClass();
        this.zzb = clock;
        return this;
    }

    public final zzcan zzd(zzcau zzcauVar) {
        this.zzd = zzcauVar;
        return this;
    }

    public final zzcav zze() {
        zzhkx.zzc(this.zza, Context.class);
        zzhkx.zzc(this.zzb, Clock.class);
        zzhkx.zzc(this.zzc, com.google.android.gms.ads.internal.util.zzg.class);
        zzhkx.zzc(this.zzd, zzcau.class);
        return new zzcap(this.zza, this.zzb, this.zzc, this.zzd, null);
    }

    public /* synthetic */ zzcan(zzcam zzcamVar) {
    }
}
