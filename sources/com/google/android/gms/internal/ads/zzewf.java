package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Callable;

/* loaded from: classes3.dex */
public final class zzewf implements zzevz {
    private final Context zza;
    private final zzges zzb;

    public zzewf(Context context, zzges zzgesVar) {
        this.zza = context;
        this.zzb = zzgesVar;
    }

    @Override // com.google.android.gms.internal.ads.zzevz
    public final int zza() {
        return 59;
    }

    @Override // com.google.android.gms.internal.ads.zzevz
    public final ua.b zzb() {
        if (((Boolean) zzbef.zzb.zze()).booleanValue()) {
            return this.zzb.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzewe
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return zzewf.this.zzc();
                }
            });
        }
        return zzgei.zzh(null);
    }

    public final /* synthetic */ zzewg zzc() throws Exception {
        Context context = this.zza;
        return new zzewg(zzbbx.zzb(context), zzbbx.zza(context));
    }
}
